package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d2 */
/* loaded from: classes2.dex */
public final class C3748d2 extends AbstractRunnableC3873l2 {

    /* renamed from: A */
    final /* synthetic */ C4046w2 f9234A;

    /* renamed from: w */
    final /* synthetic */ String f9235w;

    /* renamed from: x */
    final /* synthetic */ String f9236x;

    /* renamed from: y */
    final /* synthetic */ boolean f9237y;

    /* renamed from: z */
    final /* synthetic */ C3715b1 f9238z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3748d2(C4046w2 c4046w2, String str, String str2, boolean z, C3715b1 c3715b1) {
        super(c4046w2, true);
        this.f9234A = c4046w2;
        this.f9235w = str;
        this.f9236x = str2;
        this.f9237y = z;
        this.f9238z = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9234A.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.getUserProperties(this.f9235w, this.f9236x, this.f9237y, this.f9238z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: b */
    protected final void mo28582b() {
        this.f9238z.mo29532l(null);
    }
}
