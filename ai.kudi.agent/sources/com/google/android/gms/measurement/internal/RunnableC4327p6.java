package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* loaded from: classes2.dex */
public final class RunnableC4327p6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ long f10580c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10581d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4327p6(C4245i7 c4245i7, long j) {
        this.f10581d = c4245i7;
        this.f10580c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10581d.m28119z(this.f10580c, true);
        ((v5) this.f10581d).a.L().m27865S(new AtomicReference<>());
    }
}
