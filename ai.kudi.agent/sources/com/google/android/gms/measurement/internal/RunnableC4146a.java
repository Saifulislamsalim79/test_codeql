package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes2.dex */
public final class RunnableC4146a implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f9988c;

    /* renamed from: d */
    final /* synthetic */ long f9989d;

    /* renamed from: e */
    final /* synthetic */ C4184d2 f9990e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4146a(C4184d2 c4184d2, String str, long j) {
        this.f9990e = c4184d2;
        this.f9988c = str;
        this.f9989d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4184d2.m28316i(this.f9990e, this.f9988c, this.f9989d);
    }
}
