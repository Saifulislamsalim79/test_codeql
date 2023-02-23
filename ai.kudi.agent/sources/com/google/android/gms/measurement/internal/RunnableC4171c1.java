package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.c1 */
/* loaded from: classes2.dex */
final class RunnableC4171c1 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ long f10086c;

    /* renamed from: d */
    final /* synthetic */ C4184d2 f10087d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4171c1(C4184d2 c4184d2, long j) {
        this.f10087d = c4184d2;
        this.f10086c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10087d.m28308q(this.f10086c);
    }
}
