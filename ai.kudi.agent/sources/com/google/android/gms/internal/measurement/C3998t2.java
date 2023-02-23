package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes2.dex */
final class C3998t2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ Activity f9706w;

    /* renamed from: x */
    final /* synthetic */ C3715b1 f9707x;

    /* renamed from: y */
    final /* synthetic */ C4030v2 f9708y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3998t2(C4030v2 c4030v2, Activity activity, C3715b1 c3715b1) {
        super(c4030v2.f9792c, true);
        this.f9708y = c4030v2;
        this.f9706w = activity;
        this.f9707x = c3715b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        f1 f1Var;
        f1Var = this.f9708y.f9792c.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.onActivitySaveInstanceState(BinderC2989b.m31494p1(this.f9706w), this.f9707x, this.f9459d);
    }
}
