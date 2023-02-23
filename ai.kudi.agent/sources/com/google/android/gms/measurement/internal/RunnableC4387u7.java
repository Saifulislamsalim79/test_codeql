package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes2.dex */
public final class RunnableC4387u7 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4328p7 f10719c;

    /* renamed from: d */
    final /* synthetic */ long f10720d;

    /* renamed from: e */
    final /* synthetic */ C4409w7 f10721e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4387u7(C4409w7 c4409w7, C4328p7 c4328p7, long j) {
        this.f10721e = c4409w7;
        this.f10719c = c4328p7;
        this.f10720d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10721e.m27893q(this.f10719c, false, this.f10720d);
        C4409w7 c4409w7 = this.f10721e;
        c4409w7.f10762e = null;
        ((v5) c4409w7).a.L().m27853u(null);
    }
}
