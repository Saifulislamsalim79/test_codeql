package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes2.dex */
final class RunnableC4232h6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3824i1 f10335c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f10336d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4232h6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3824i1 interfaceC3824i1) {
        this.f10336d = appMeasurementDynamiteService;
        this.f10335c = interfaceC3824i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10336d.a.L().m27866R(this.f10335c);
    }
}
