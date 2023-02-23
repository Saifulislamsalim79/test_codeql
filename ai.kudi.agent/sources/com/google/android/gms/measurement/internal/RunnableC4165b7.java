package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes2.dex */
public final class RunnableC4165b7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4226h f10036c;

    /* renamed from: d */
    final /* synthetic */ long f10037d;

    /* renamed from: e */
    final /* synthetic */ int f10038e;

    /* renamed from: f */
    final /* synthetic */ long f10039f;

    /* renamed from: w */
    final /* synthetic */ boolean f10040w;

    /* renamed from: x */
    final /* synthetic */ C4245i7 f10041x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4165b7(C4245i7 c4245i7, C4226h c4226h, long j, int i, long j2, boolean z) {
        this.f10041x = c4245i7;
        this.f10036c = c4226h;
        this.f10037d = j;
        this.f10038e = i;
        this.f10039f = j2;
        this.f10040w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10041x.m28155K(this.f10036c);
        this.f10041x.m28119z(this.f10037d, false);
        C4245i7.m28136d0(this.f10041x, this.f10036c, this.f10038e, this.f10039f, true, this.f10040w);
    }
}
