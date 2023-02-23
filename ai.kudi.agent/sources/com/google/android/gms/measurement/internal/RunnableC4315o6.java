package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* loaded from: classes2.dex */
public final class RunnableC4315o6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10554c;

    /* renamed from: d */
    final /* synthetic */ String f10555d;

    /* renamed from: e */
    final /* synthetic */ Object f10556e;

    /* renamed from: f */
    final /* synthetic */ long f10557f;

    /* renamed from: w */
    final /* synthetic */ C4245i7 f10558w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4315o6(C4245i7 c4245i7, String str, String str2, Object obj, long j) {
        this.f10558w = c4245i7;
        this.f10554c = str;
        this.f10555d = str2;
        this.f10556e = obj;
        this.f10557f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10558w.m28152N(this.f10554c, this.f10555d, this.f10556e, this.f10557f);
    }
}
