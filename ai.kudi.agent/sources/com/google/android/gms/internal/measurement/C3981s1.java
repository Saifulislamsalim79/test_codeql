package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes2.dex */
public final class C3981s1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ String f9675w;

    /* renamed from: x */
    final /* synthetic */ String f9676x;

    /* renamed from: y */
    final /* synthetic */ C3715b1 f9677y;

    /* renamed from: z */
    final /* synthetic */ C4046w2 f9678z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3981s1(C4046w2 c4046w2, String str, String str2, C3715b1 c3715b1) {
        super(c4046w2, true);
        this.f9678z = c4046w2;
        this.f9675w = str;
        this.f9676x = str2;
        this.f9677y = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9678z.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.getConditionalUserProperties(this.f9675w, this.f9676x, this.f9677y);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: b */
    protected final void mo28582b() {
        this.f9677y.mo29532l(null);
    }
}
