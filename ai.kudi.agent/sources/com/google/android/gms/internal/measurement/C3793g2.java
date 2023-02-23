package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* loaded from: classes2.dex */
public final class C3793g2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ String f9366w;

    /* renamed from: x */
    final /* synthetic */ C3715b1 f9367x;

    /* renamed from: y */
    final /* synthetic */ C4046w2 f9368y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3793g2(C4046w2 c4046w2, String str, C3715b1 c3715b1) {
        super(c4046w2, true);
        this.f9368y = c4046w2;
        this.f9366w = str;
        this.f9367x = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9368y.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.getMaxUserProperties(this.f9366w, this.f9367x);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: b */
    protected final void mo28582b() {
        this.f9367x.mo29532l(null);
    }
}
