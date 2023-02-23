package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes2.dex */
public final class C3763e2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ String f9269w;

    /* renamed from: x */
    final /* synthetic */ Object f9270x;

    /* renamed from: y */
    final /* synthetic */ C4046w2 f9271y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3763e2(C4046w2 c4046w2, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(c4046w2, false);
        this.f9271y = c4046w2;
        this.f9269w = str;
        this.f9270x = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9271y.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.logHealthData(5, this.f9269w, BinderC2989b.m31494p1(this.f9270x), BinderC2989b.m31494p1(null), BinderC2989b.m31494p1(null));
    }
}
