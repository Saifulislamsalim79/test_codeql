package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.p101n.C2951a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.t1 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2922t1 implements ServiceConnection, InterfaceC2934x1 {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f8071a = new HashMap();

    /* renamed from: b */
    private int f8072b = 2;

    /* renamed from: c */
    private boolean f8073c;

    /* renamed from: d */
    private IBinder f8074d;

    /* renamed from: e */
    private final C2915s1 f8075e;

    /* renamed from: f */
    private ComponentName f8076f;

    /* renamed from: g */
    final /* synthetic */ C2931w1 f8077g;

    public ServiceConnectionC2922t1(C2931w1 c2931w1, C2915s1 c2915s1) {
        this.f8077g = c2931w1;
        this.f8075e = c2915s1;
    }

    /* renamed from: a */
    public final int m31635a() {
        return this.f8072b;
    }

    /* renamed from: b */
    public final ComponentName m31634b() {
        return this.f8076f;
    }

    /* renamed from: c */
    public final IBinder m31633c() {
        return this.f8074d;
    }

    /* renamed from: d */
    public final void m31632d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f8071a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m31631e(String str, Executor executor) {
        C2951a c2951a;
        Context context;
        Context context2;
        C2951a c2951a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f8072b = 3;
        C2931w1 c2931w1 = this.f8077g;
        c2951a = c2931w1.f8100j;
        context = c2931w1.f8097g;
        C2915s1 c2915s1 = this.f8075e;
        context2 = c2931w1.f8097g;
        boolean m31565d = c2951a.m31565d(context, str, c2915s1.m31691c(context2), this, this.f8075e.m31693a(), executor);
        this.f8073c = m31565d;
        if (m31565d) {
            handler = this.f8077g.f8098h;
            Message obtainMessage = handler.obtainMessage(1, this.f8075e);
            handler2 = this.f8077g.f8098h;
            j = this.f8077g.f8102l;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f8072b = 2;
        try {
            C2931w1 c2931w12 = this.f8077g;
            c2951a2 = c2931w12.f8100j;
            context3 = c2931w12.f8097g;
            c2951a2.m31566c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m31630f(ServiceConnection serviceConnection, String str) {
        this.f8071a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m31629g(String str) {
        Handler handler;
        C2951a c2951a;
        Context context;
        handler = this.f8077g.f8098h;
        handler.removeMessages(1, this.f8075e);
        C2931w1 c2931w1 = this.f8077g;
        c2951a = c2931w1.f8100j;
        context = c2931w1.f8097g;
        c2951a.m31566c(context, this);
        this.f8073c = false;
        this.f8072b = 2;
    }

    /* renamed from: h */
    public final boolean m31628h(ServiceConnection serviceConnection) {
        return this.f8071a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m31627i() {
        return this.f8071a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m31626j() {
        return this.f8073c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8077g.f8096f;
        synchronized (hashMap) {
            handler = this.f8077g.f8098h;
            handler.removeMessages(1, this.f8075e);
            this.f8074d = iBinder;
            this.f8076f = componentName;
            for (ServiceConnection serviceConnection : this.f8071a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f8072b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8077g.f8096f;
        synchronized (hashMap) {
            handler = this.f8077g.f8098h;
            handler.removeMessages(1, this.f8075e);
            this.f8074d = null;
            this.f8076f = componentName;
            for (ServiceConnection serviceConnection : this.f8071a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f8072b = 2;
        }
    }
}
