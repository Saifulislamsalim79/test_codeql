package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y1 */
/* loaded from: classes2.dex */
public final class C4077y1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ C3715b1 f9857w;

    /* renamed from: x */
    final /* synthetic */ C4046w2 f9858x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4077y1(C4046w2 c4046w2, C3715b1 c3715b1) {
        super(c4046w2, true);
        this.f9858x = c4046w2;
        this.f9857w = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9858x.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.getGmpAppId(this.f9857w);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: b */
    protected final void mo28582b() {
        this.f9857w.mo29532l(null);
    }
}
