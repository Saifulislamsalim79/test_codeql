package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes2.dex */
public final class C4061x1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ String f9832w;

    /* renamed from: x */
    final /* synthetic */ C4046w2 f9833x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061x1(C4046w2 c4046w2, String str) {
        super(c4046w2, true);
        this.f9833x = c4046w2;
        this.f9832w = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9833x.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.endAdUnitExposure(this.f9832w, this.f9459d);
    }
}
