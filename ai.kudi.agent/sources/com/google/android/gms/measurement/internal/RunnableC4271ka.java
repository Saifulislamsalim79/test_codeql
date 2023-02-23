package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.ka */
/* loaded from: classes2.dex */
final class RunnableC4271ka implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3824i1 f10437c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f10438d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4271ka(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3824i1 interfaceC3824i1) {
        this.f10438d = appMeasurementDynamiteService;
        this.f10437c = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10438d.a.N().C(this.f10437c, this.f10438d.a.n());
    }
}
