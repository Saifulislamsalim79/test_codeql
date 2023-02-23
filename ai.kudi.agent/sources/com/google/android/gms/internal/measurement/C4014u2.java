package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* loaded from: classes2.dex */
final class C4014u2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ Activity f9727w;

    /* renamed from: x */
    final /* synthetic */ C4030v2 f9728x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4014u2(C4030v2 c4030v2, Activity activity) {
        super(c4030v2.f9792c, true);
        this.f9728x = c4030v2;
        this.f9727w = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9728x.f9792c.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.onActivityDestroyed(BinderC2989b.m31494p1(this.f9727w), this.f9459d);
    }
}
