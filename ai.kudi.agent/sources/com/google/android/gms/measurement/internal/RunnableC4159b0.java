package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.b0 */
/* loaded from: classes2.dex */
public final class RunnableC4159b0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10016c;

    /* renamed from: d */
    final /* synthetic */ long f10017d;

    /* renamed from: e */
    final /* synthetic */ C4184d2 f10018e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4159b0(C4184d2 c4184d2, String str, long j) {
        this.f10018e = c4184d2;
        this.f10016c = str;
        this.f10017d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4184d2.m28315j(this.f10018e, this.f10016c, this.f10017d);
    }
}
