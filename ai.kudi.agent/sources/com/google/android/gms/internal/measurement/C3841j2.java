package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes2.dex */
public final class C3841j2 extends AbstractRunnableC3873l2 {

    /* renamed from: A */
    final /* synthetic */ boolean f9417A;

    /* renamed from: B */
    final /* synthetic */ boolean f9418B;

    /* renamed from: C */
    final /* synthetic */ C4046w2 f9419C;

    /* renamed from: w */
    final /* synthetic */ Long f9420w;

    /* renamed from: x */
    final /* synthetic */ String f9421x;

    /* renamed from: y */
    final /* synthetic */ String f9422y;

    /* renamed from: z */
    final /* synthetic */ Bundle f9423z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3841j2(C4046w2 c4046w2, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c4046w2, true);
        this.f9419C = c4046w2;
        this.f9420w = l;
        this.f9421x = str;
        this.f9422y = str2;
        this.f9423z = bundle;
        this.f9417A = z;
        this.f9418B = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        Long l = this.f9420w;
        long longValue = l == null ? this.f9458c : l.longValue();
        f1Var = this.f9419C.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.logEvent(this.f9421x, this.f9422y, this.f9423z, this.f9417A, this.f9418B, longValue);
    }
}
