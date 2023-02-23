package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes2.dex */
public final class RunnableC4351r7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4328p7 f10640c;

    /* renamed from: d */
    final /* synthetic */ C4328p7 f10641d;

    /* renamed from: e */
    final /* synthetic */ long f10642e;

    /* renamed from: f */
    final /* synthetic */ boolean f10643f;

    /* renamed from: w */
    final /* synthetic */ C4409w7 f10644w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4351r7(C4409w7 c4409w7, C4328p7 c4328p7, C4328p7 c4328p72, long j, boolean z) {
        this.f10644w = c4409w7;
        this.f10640c = c4328p7;
        this.f10641d = c4328p72;
        this.f10642e = j;
        this.f10643f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10644w.m27894p(this.f10640c, this.f10641d, this.f10642e, this.f10643f, null);
    }
}
