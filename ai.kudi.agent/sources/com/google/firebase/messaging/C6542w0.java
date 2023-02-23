package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.w0 */
/* loaded from: classes2.dex */
public final class C6542w0 {

    /* renamed from: d */
    private static WeakReference<C6542w0> f15788d;

    /* renamed from: a */
    private final SharedPreferences f15789a;

    /* renamed from: b */
    private C6532s0 f15790b;

    /* renamed from: c */
    private final Executor f15791c;

    private C6542w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f15791c = executor;
        this.f15789a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C6542w0 m21681a(Context context, Executor executor) {
        synchronized (C6542w0.class) {
            C6542w0 c6542w0 = f15788d != null ? f15788d.get() : null;
            if (c6542w0 == null) {
                C6542w0 c6542w02 = new C6542w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c6542w02.m21679c();
                f15788d = new WeakReference<>(c6542w02);
                return c6542w02;
            }
            return c6542w0;
        }
    }

    /* renamed from: c */
    private synchronized void m21679c() {
        this.f15790b = C6532s0.m21708c(this.f15789a, "topic_operation_queue", ",", this.f15791c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C6540v0 m21680b() {
        return C6540v0.m21686a(this.f15790b.m21706e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m21678d(C6540v0 c6540v0) {
        return this.f15790b.m21705f(c6540v0.m21682e());
    }
}
