package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* loaded from: classes2.dex */
public final class C3857k2 extends AbstractRunnableC3873l2 {

    /* renamed from: A */
    final /* synthetic */ C4046w2 f9448A;

    /* renamed from: w */
    final /* synthetic */ String f9449w;

    /* renamed from: x */
    final /* synthetic */ String f9450x;

    /* renamed from: y */
    final /* synthetic */ Object f9451y;

    /* renamed from: z */
    final /* synthetic */ boolean f9452z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3857k2(C4046w2 c4046w2, String str, String str2, Object obj, boolean z) {
        super(c4046w2, true);
        this.f9448A = c4046w2;
        this.f9449w = str;
        this.f9450x = str2;
        this.f9451y = obj;
        this.f9452z = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9448A.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.setUserProperty(this.f9449w, this.f9450x, BinderC2989b.m31494p1(this.f9451y), this.f9452z, this.f9458c);
    }
}
