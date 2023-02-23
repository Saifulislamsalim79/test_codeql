package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2974l;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes2.dex */
public class C6518m {

    /* renamed from: c */
    private static final Object f15740c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC6499g1 f15741d;

    /* renamed from: a */
    private final Context f15742a;

    /* renamed from: b */
    private final Executor f15743b = ExecutorC6516l.f15739c;

    public C6518m(Context context) {
        this.f15742a = context;
    }

    /* renamed from: a */
    private static com.google.android.gms.tasks.j<Integer> m21736a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m21735b(context, "com.google.firebase.MESSAGING_EVENT").m21814c(intent).i(ExecutorC6516l.f15739c, C6510i.f15731a);
    }

    /* renamed from: b */
    private static ServiceConnectionC6499g1 m21735b(Context context, String str) {
        ServiceConnectionC6499g1 serviceConnectionC6499g1;
        synchronized (f15740c) {
            if (f15741d == null) {
                f15741d = new ServiceConnectionC6499g1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            serviceConnectionC6499g1 = f15741d;
        }
        return serviceConnectionC6499g1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ Integer m21734c(com.google.android.gms.tasks.j jVar) throws Exception {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ Integer m21732e(com.google.android.gms.tasks.j jVar) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ com.google.android.gms.tasks.j m21731f(Context context, Intent intent, com.google.android.gms.tasks.j jVar) throws Exception {
        return (C2974l.m31515h() && ((Integer) jVar.l()).intValue() == 402) ? m21736a(context, intent).i(ExecutorC6516l.f15739c, C6512j.f15735a) : jVar;
    }

    /* renamed from: g */
    public com.google.android.gms.tasks.j<Integer> m21730g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m21729h(this.f15742a, intent);
    }

    /* renamed from: h */
    public com.google.android.gms.tasks.j<Integer> m21729h(final Context context, final Intent intent) {
        boolean z = false;
        if (C2974l.m31515h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return m21736a(context, intent);
        }
        return C4469m.m27768c(this.f15743b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C6528q0.m21716b().m21711g(context, intent));
                return valueOf;
            }
        }).j(this.f15743b, new InterfaceC4450c() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(com.google.android.gms.tasks.j jVar) {
                return C6518m.m21731f(context, intent, jVar);
            }
        });
    }
}
