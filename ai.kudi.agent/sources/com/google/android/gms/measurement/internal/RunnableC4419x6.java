package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* loaded from: classes2.dex */
public final class RunnableC4419x6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10792c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10793d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4419x6(C4245i7 c4245i7, AtomicReference atomicReference) {
        this.f10793d = c4245i7;
        this.f10792c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10792c) {
            this.f10792c.set(Long.valueOf(((v5) this.f10793d).a.z().r(((v5) this.f10793d).a.B().s(), C4173c3.f10101M)));
            this.f10792c.notify();
        }
    }
}
