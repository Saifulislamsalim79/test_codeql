package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC2989b;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes2.dex */
final class C3904n2 extends AbstractRunnableC3873l2 {

    /* renamed from: w */
    final /* synthetic */ Bundle f9569w;

    /* renamed from: x */
    final /* synthetic */ Activity f9570x;

    /* renamed from: y */
    final /* synthetic */ C4030v2 f9571y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3904n2(C4030v2 c4030v2, Bundle bundle, Activity activity) {
        super(c4030v2.f9792c, true);
        this.f9571y = c4030v2;
        this.f9569w = bundle;
        this.f9570x = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    final void mo28583a() throws RemoteException {
        Bundle bundle;
        f1 f1Var;
        if (this.f9569w != null) {
            bundle = new Bundle();
            if (this.f9569w.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f9569w.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        f1Var = this.f9571y.f9792c.f9814h;
        com.google.android.gms.common.internal.s.j(f1Var);
        f1Var.onActivityCreated(BinderC2989b.m31494p1(this.f9570x), bundle, this.f9459d);
    }
}
