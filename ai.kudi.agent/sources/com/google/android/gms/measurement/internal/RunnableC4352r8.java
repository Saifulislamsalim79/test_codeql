package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r8 */
/* loaded from: classes2.dex */
final class RunnableC4352r8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ ComponentName f10645c;

    /* renamed from: d */
    final /* synthetic */ ServiceConnectionC4399v8 f10646d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4352r8(ServiceConnectionC4399v8 serviceConnectionC4399v8, ComponentName componentName) {
        this.f10646d = serviceConnectionC4399v8;
        this.f10645c = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4410w8.m27871M(this.f10646d.f10742c, this.f10645c);
    }
}
