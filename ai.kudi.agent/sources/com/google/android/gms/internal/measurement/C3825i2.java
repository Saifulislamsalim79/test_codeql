package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes2.dex */
public final class C3825i2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ C3888m2 f9404w;

    /* renamed from: x */
    final /* synthetic */ C4046w2 f9405x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3825i2(C4046w2 c4046w2, C3888m2 c3888m2) {
        super(c4046w2, true);
        this.f9405x = c4046w2;
        this.f9404w = c3888m2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9405x.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.registerOnMeasurementEventListener(this.f9404w);
    }
}
