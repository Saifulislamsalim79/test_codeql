package com.google.android.gms.common.p101n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC2934x1;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p102o.C2956c;
import com.google.android.gms.common.util.C2974l;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.n.a */
/* loaded from: classes2.dex */
public class C2951a {

    /* renamed from: b */
    private static final Object f8125b = new Object();

    /* renamed from: c */
    private static volatile C2951a f8126c;

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f8127a = new ConcurrentHashMap<>();

    private C2951a() {
    }

    /* renamed from: b */
    public static C2951a m31567b() {
        if (f8126c == null) {
            synchronized (f8125b) {
                if (f8126c == null) {
                    f8126c = new C2951a();
                }
            }
        }
        C2951a c2951a = f8126c;
        s.j(c2951a);
        return c2951a;
    }

    /* renamed from: e */
    private static void m31564e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m31563f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2956c.m31548a(context).m31553c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m31562g(serviceConnection)) {
            ServiceConnection putIfAbsent = this.f8127a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean m31561h = m31561h(context, intent, serviceConnection, i, executor);
                if (m31561h) {
                    return m31561h;
                }
                return false;
            } finally {
                this.f8127a.remove(serviceConnection, serviceConnection);
            }
        }
        return m31561h(context, intent, serviceConnection, i, executor);
    }

    /* renamed from: g */
    private static boolean m31562g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC2934x1);
    }

    /* renamed from: h */
    private static final boolean m31561h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return (!C2974l.m31513j() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean m31568a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m31563f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    /* renamed from: c */
    public void m31566c(Context context, ServiceConnection serviceConnection) {
        if (m31562g(serviceConnection) && this.f8127a.containsKey(serviceConnection)) {
            try {
                m31564e(context, this.f8127a.get(serviceConnection));
                return;
            } finally {
                this.f8127a.remove(serviceConnection);
            }
        }
        m31564e(context, serviceConnection);
    }

    /* renamed from: d */
    public final boolean m31565d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m31563f(context, str, intent, serviceConnection, i, true, executor);
    }
}
