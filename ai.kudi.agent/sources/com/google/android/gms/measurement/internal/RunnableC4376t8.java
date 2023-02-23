package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t8 */
/* loaded from: classes2.dex */
final class RunnableC4376t8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ ServiceConnectionC4399v8 f10691c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4376t8(ServiceConnectionC4399v8 serviceConnectionC4399v8) {
        this.f10691c = serviceConnectionC4399v8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4410w8 c4410w8 = this.f10691c.f10742c;
        Context f = ((v5) c4410w8).a.f();
        ((v5) this.f10691c.f10742c).a.d();
        C4410w8.m27871M(c4410w8, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
