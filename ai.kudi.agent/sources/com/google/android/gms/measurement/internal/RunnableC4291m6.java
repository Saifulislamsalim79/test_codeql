package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes2.dex */
final class RunnableC4291m6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ long f10469c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10470d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4291m6(C4245i7 c4245i7, long j) {
        this.f10470d = c4245i7;
        this.f10469c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((v5) this.f10470d).a.F().k.m28403b(this.f10469c);
        ((v5) this.f10470d).a.b().q().m28013b("Session timeout duration set", Long.valueOf(this.f10469c));
    }
}
