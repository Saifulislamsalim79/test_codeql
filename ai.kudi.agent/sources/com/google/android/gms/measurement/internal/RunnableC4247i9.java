package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes2.dex */
final class RunnableC4247i9 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4283la f10386c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f10387d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4247i9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4283la c4283la) {
        this.f10387d = appMeasurementDynamiteService;
        this.f10386c = c4283la;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10387d.a.I().m28157I(this.f10386c);
    }
}
