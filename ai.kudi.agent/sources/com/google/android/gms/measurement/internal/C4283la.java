package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3872l1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.la */
/* loaded from: classes2.dex */
final class C4283la implements InterfaceC4176c6 {

    /* renamed from: a */
    public final InterfaceC3872l1 f10459a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f10460b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4283la(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3872l1 interfaceC3872l1) {
        this.f10460b = appMeasurementDynamiteService;
        this.f10459a = interfaceC3872l1;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4176c6
    /* renamed from: a */
    public final void mo28036a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10459a.mo29408r(str, str2, bundle, j);
        } catch (RemoteException e) {
            b5 b5Var = this.f10460b.a;
            if (b5Var != null) {
                b5Var.b().w().m28013b("Event interceptor threw exception", e);
            }
        }
    }
}
