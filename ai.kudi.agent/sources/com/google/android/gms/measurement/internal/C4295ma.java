package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3872l1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.ma */
/* loaded from: classes2.dex */
final class C4295ma implements InterfaceC4188d6 {

    /* renamed from: a */
    public final InterfaceC3872l1 f10479a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f10480b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4295ma(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3872l1 interfaceC3872l1) {
        this.f10480b = appMeasurementDynamiteService;
        this.f10479a = interfaceC3872l1;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4188d6
    /* renamed from: a */
    public final void mo25417a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f10479a.mo29408r(str, str2, bundle, j);
        } catch (RemoteException e) {
            b5 b5Var = this.f10480b.a;
            if (b5Var != null) {
                b5Var.b().w().m28013b("Event listener threw exception", e);
            }
        }
    }
}
