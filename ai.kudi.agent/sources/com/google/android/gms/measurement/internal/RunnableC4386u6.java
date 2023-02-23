package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* loaded from: classes2.dex */
public final class RunnableC4386u6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10714c;

    /* renamed from: d */
    final /* synthetic */ String f10715d;

    /* renamed from: e */
    final /* synthetic */ String f10716e;

    /* renamed from: f */
    final /* synthetic */ boolean f10717f;

    /* renamed from: w */
    final /* synthetic */ C4245i7 f10718w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4386u6(C4245i7 c4245i7, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f10718w = c4245i7;
        this.f10714c = atomicReference;
        this.f10715d = str2;
        this.f10716e = str3;
        this.f10717f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((v5) this.f10718w).a.L().m27861W(this.f10714c, null, this.f10715d, this.f10716e, this.f10717f);
    }
}
