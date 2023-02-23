package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q1 */
/* loaded from: classes2.dex */
public final class C3949q1 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ Bundle f9621w;

    /* renamed from: x */
    final /* synthetic */ C4046w2 f9622x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3949q1(C4046w2 c4046w2, Bundle bundle) {
        super(c4046w2, true);
        this.f9622x = c4046w2;
        this.f9621w = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9622x.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.setConditionalUserProperty(this.f9621w, this.f9458c);
    }
}
