package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* loaded from: classes2.dex */
public final class RunnableC4408w6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10758c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10759d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4408w6(C4245i7 c4245i7, AtomicReference atomicReference) {
        this.f10759d = c4245i7;
        this.f10758c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10758c) {
            this.f10758c.set(((v5) this.f10759d).a.z().x(((v5) this.f10759d).a.B().s(), C4173c3.f10100L));
            this.f10758c.notify();
        }
    }
}
