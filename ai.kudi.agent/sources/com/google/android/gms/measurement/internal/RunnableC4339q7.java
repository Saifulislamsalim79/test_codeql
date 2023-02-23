package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* loaded from: classes2.dex */
public final class RunnableC4339q7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ Bundle f10618c;

    /* renamed from: d */
    final /* synthetic */ C4328p7 f10619d;

    /* renamed from: e */
    final /* synthetic */ C4328p7 f10620e;

    /* renamed from: f */
    final /* synthetic */ long f10621f;

    /* renamed from: w */
    final /* synthetic */ C4409w7 f10622w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4339q7(C4409w7 c4409w7, Bundle bundle, C4328p7 c4328p7, C4328p7 c4328p72, long j) {
        this.f10622w = c4409w7;
        this.f10618c = bundle;
        this.f10619d = c4328p7;
        this.f10620e = c4328p72;
        this.f10621f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4409w7.m27886x(this.f10622w, this.f10618c, this.f10619d, this.f10620e, this.f10621f);
    }
}
