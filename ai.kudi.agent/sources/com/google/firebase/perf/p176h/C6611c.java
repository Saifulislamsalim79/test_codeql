package com.google.firebase.perf.p176h;

import android.util.Log;
/* compiled from: LogWrapper.java */
/* renamed from: com.google.firebase.perf.h.c */
/* loaded from: classes2.dex */
class C6611c {

    /* renamed from: a */
    private static C6611c f15926a;

    private C6611c() {
    }

    /* renamed from: c */
    public static synchronized C6611c m21463c() {
        C6611c c6611c;
        synchronized (C6611c.class) {
            if (f15926a == null) {
                f15926a = new C6611c();
            }
            c6611c = f15926a;
        }
        return c6611c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m21465a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m21464b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21462d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m21461e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
