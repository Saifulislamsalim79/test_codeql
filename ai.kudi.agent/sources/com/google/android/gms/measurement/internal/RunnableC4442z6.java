package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes2.dex */
public final class RunnableC4442z6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10858c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10859d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4442z6(C4245i7 c4245i7, AtomicReference atomicReference) {
        this.f10859d = c4245i7;
        this.f10858c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10858c) {
            this.f10858c.set(Double.valueOf(((v5) this.f10859d).a.z().k(((v5) this.f10859d).a.B().s(), C4173c3.f10103O)));
            this.f10858c.notify();
        }
    }
}
