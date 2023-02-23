package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* loaded from: classes2.dex */
public final class C3716b2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ C3715b1 f9196w;

    /* renamed from: x */
    final /* synthetic */ C4046w2 f9197x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3716b2(C4046w2 c4046w2, C3715b1 c3715b1) {
        super(c4046w2, true);
        this.f9197x = c4046w2;
        this.f9196w = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9197x.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.getCurrentScreenName(this.f9196w);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: b */
    protected final void mo28582b() {
        this.f9196w.mo29532l(null);
    }
}
