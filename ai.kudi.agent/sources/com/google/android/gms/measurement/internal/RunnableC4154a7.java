package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes2.dex */
public final class RunnableC4154a7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ Boolean f10004c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10005d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4154a7(C4245i7 c4245i7, Boolean bool) {
        this.f10005d = c4245i7;
        this.f10004c = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10005d.m28149Q(this.f10004c, true);
    }
}
