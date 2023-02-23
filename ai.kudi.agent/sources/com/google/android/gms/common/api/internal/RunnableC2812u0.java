package com.google.android.gms.common.api.internal;

import p272h.p286c.p287a.p300b.p320f.p321b.C9218l;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* loaded from: classes2.dex */
final class RunnableC2812u0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C9218l f7874c;

    /* renamed from: d */
    final /* synthetic */ BinderC2816w0 f7875d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2812u0(BinderC2816w0 binderC2816w0, C9218l c9218l) {
        this.f7875d = binderC2816w0;
        this.f7874c = c9218l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2816w0.m31890r1(this.f7875d, this.f7874c);
    }
}
