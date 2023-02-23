package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes2.dex */
public final class RunnableC4375t7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ long f10689c;

    /* renamed from: d */
    final /* synthetic */ C4409w7 f10690d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4375t7(C4409w7 c4409w7, long j) {
        this.f10690d = c4409w7;
        this.f10689c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((v5) this.f10690d).a.y().m28311n(this.f10689c);
        this.f10690d.f10762e = null;
    }
}
