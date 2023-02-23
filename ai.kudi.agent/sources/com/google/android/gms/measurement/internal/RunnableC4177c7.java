package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes2.dex */
public final class RunnableC4177c7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4226h f10170c;

    /* renamed from: d */
    final /* synthetic */ int f10171d;

    /* renamed from: e */
    final /* synthetic */ long f10172e;

    /* renamed from: f */
    final /* synthetic */ boolean f10173f;

    /* renamed from: w */
    final /* synthetic */ C4245i7 f10174w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4177c7(C4245i7 c4245i7, C4226h c4226h, int i, long j, boolean z) {
        this.f10174w = c4245i7;
        this.f10170c = c4226h;
        this.f10171d = i;
        this.f10172e = j;
        this.f10173f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10174w.m28155K(this.f10170c);
        C4245i7.m28136d0(this.f10174w, this.f10170c, this.f10171d, this.f10172e, false, this.f10173f);
    }
}
