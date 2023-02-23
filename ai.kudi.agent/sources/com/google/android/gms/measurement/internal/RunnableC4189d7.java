package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* loaded from: classes2.dex */
public final class RunnableC4189d7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4226h f10214c;

    /* renamed from: d */
    final /* synthetic */ int f10215d;

    /* renamed from: e */
    final /* synthetic */ long f10216e;

    /* renamed from: f */
    final /* synthetic */ boolean f10217f;

    /* renamed from: w */
    final /* synthetic */ C4245i7 f10218w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4189d7(C4245i7 c4245i7, C4226h c4226h, int i, long j, boolean z) {
        this.f10218w = c4245i7;
        this.f10214c = c4226h;
        this.f10215d = i;
        this.f10216e = j;
        this.f10217f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10218w.m28155K(this.f10214c);
        C4245i7.m28136d0(this.f10218w, this.f10214c, this.f10215d, this.f10216e, false, this.f10217f);
    }
}
