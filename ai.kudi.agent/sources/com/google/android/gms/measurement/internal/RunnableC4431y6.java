package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes2.dex */
public final class RunnableC4431y6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10833c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10834d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4431y6(C4245i7 c4245i7, AtomicReference atomicReference) {
        this.f10834d = c4245i7;
        this.f10833c = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10833c) {
            this.f10833c.set(Integer.valueOf(((v5) this.f10834d).a.z().o(((v5) this.f10834d).a.B().s(), C4173c3.f10102N)));
            this.f10833c.notify();
        }
    }
}
