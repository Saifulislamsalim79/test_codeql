package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes2.dex */
final class RunnableC4233h7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3824i1 f10337c;

    /* renamed from: d */
    final /* synthetic */ C4379u f10338d;

    /* renamed from: e */
    final /* synthetic */ String f10339e;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f10340f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4233h7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3824i1 interfaceC3824i1, C4379u c4379u, String str) {
        this.f10340f = appMeasurementDynamiteService;
        this.f10337c = interfaceC3824i1;
        this.f10338d = c4379u;
        this.f10339e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10340f.a.L().m27858p(this.f10337c, this.f10338d, this.f10339e);
    }
}
