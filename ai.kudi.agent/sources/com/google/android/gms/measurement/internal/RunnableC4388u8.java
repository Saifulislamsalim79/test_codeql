package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes2.dex */
final class RunnableC4388u8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ ServiceConnectionC4399v8 f10722c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4388u8(ServiceConnectionC4399v8 serviceConnectionC4399v8) {
        this.f10722c = serviceConnectionC4399v8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10722c.f10742c.f10772d = null;
        this.f10722c.f10742c.m27880D();
    }
}
