package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n6 */
/* loaded from: classes2.dex */
public final class RunnableC4303n6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C4245i7 f10499A;

    /* renamed from: c */
    final /* synthetic */ String f10500c;

    /* renamed from: d */
    final /* synthetic */ String f10501d;

    /* renamed from: e */
    final /* synthetic */ long f10502e;

    /* renamed from: f */
    final /* synthetic */ Bundle f10503f;

    /* renamed from: w */
    final /* synthetic */ boolean f10504w;

    /* renamed from: x */
    final /* synthetic */ boolean f10505x;

    /* renamed from: y */
    final /* synthetic */ boolean f10506y;

    /* renamed from: z */
    final /* synthetic */ String f10507z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4303n6(C4245i7 c4245i7, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f10499A = c4245i7;
        this.f10500c = str;
        this.f10501d = str2;
        this.f10502e = j;
        this.f10503f = bundle;
        this.f10504w = z;
        this.f10505x = z2;
        this.f10506y = z3;
        this.f10507z = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10499A.m28122w(this.f10500c, this.f10501d, this.f10502e, this.f10503f, this.f10504w, this.f10505x, this.f10506y, this.f10507z);
    }
}
