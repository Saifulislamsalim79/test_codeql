package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p287a.p300b.p322g.C9226a;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: classes2.dex */
final class C6478a1 {

    /* renamed from: a */
    private static final long f15636a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f15637b = new Object();

    /* renamed from: c */
    private static C9226a f15638c;

    /* renamed from: a */
    private static void m21885a(Context context) {
        if (f15638c == null) {
            C9226a c9226a = new C9226a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f15638c = c9226a;
            c9226a.m15454c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m21884b(Intent intent) {
        synchronized (f15637b) {
            if (f15638c != null && m21883c(intent)) {
                m21882d(intent, false);
                f15638c.m15455b();
            }
        }
    }

    /* renamed from: c */
    static boolean m21883c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m21882d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ComponentName m21881e(Context context, Intent intent) {
        synchronized (f15637b) {
            m21885a(context);
            boolean m21883c = m21883c(intent);
            m21882d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m21883c) {
                f15638c.m15456a(f15636a);
            }
            return startService;
        }
    }
}
