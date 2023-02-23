package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* loaded from: classes2.dex */
public final class C3965r1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ String f9641w;

    /* renamed from: x */
    final /* synthetic */ String f9642x;

    /* renamed from: y */
    final /* synthetic */ Bundle f9643y;

    /* renamed from: z */
    final /* synthetic */ C4046w2 f9644z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3965r1(C4046w2 c4046w2, String str, String str2, Bundle bundle) {
        super(c4046w2, true);
        this.f9644z = c4046w2;
        this.f9641w = str;
        this.f9642x = str2;
        this.f9643y = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9644z.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.clearConditionalUserProperty(this.f9641w, this.f9642x, this.f9643y);
    }
}
