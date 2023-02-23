package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3824i1;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes2.dex */
final class RunnableC4234h8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3824i1 f10341c;

    /* renamed from: d */
    final /* synthetic */ String f10342d;

    /* renamed from: e */
    final /* synthetic */ String f10343e;

    /* renamed from: f */
    final /* synthetic */ boolean f10344f;

    /* renamed from: w */
    final /* synthetic */ AppMeasurementDynamiteService f10345w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4234h8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3824i1 interfaceC3824i1, String str, String str2, boolean z) {
        this.f10345w = appMeasurementDynamiteService;
        this.f10341c = interfaceC3824i1;
        this.f10342d = str;
        this.f10343e = str2;
        this.f10344f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10345w.a.L().m27862V(this.f10341c, this.f10342d, this.f10343e, this.f10344f);
    }
}
