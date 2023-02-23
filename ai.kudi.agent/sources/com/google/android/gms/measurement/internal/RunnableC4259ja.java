package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.ja */
/* loaded from: classes2.dex */
final class RunnableC4259ja implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3824i1 f10405c;

    /* renamed from: d */
    final /* synthetic */ String f10406d;

    /* renamed from: e */
    final /* synthetic */ String f10407e;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f10408f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4259ja(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3824i1 interfaceC3824i1, String str, String str2) {
        this.f10408f = appMeasurementDynamiteService;
        this.f10405c = interfaceC3824i1;
        this.f10406d = str;
        this.f10407e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10408f.a.L().m27864T(this.f10405c, this.f10406d, this.f10407e);
    }
}
