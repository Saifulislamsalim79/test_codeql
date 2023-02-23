package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes2.dex */
public final class RunnableC4362s6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10664c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10665d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4362s6(C4245i7 c4245i7, AtomicReference atomicReference) {
        this.f10665d = c4245i7;
        this.f10664c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10664c) {
            this.f10664c.set(Boolean.valueOf(((v5) this.f10665d).a.z().B(((v5) this.f10665d).a.B().s(), C4173c3.f10099K)));
            this.f10664c.notify();
        }
    }
}
