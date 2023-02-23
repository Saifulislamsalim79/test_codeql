package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes2.dex */
public final class RunnableC4284m implements Runnable {

    /* renamed from: c */
    final /* synthetic */ x5 f10461c;

    /* renamed from: d */
    final /* synthetic */ AbstractC4296n f10462d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4284m(AbstractC4296n abstractC4296n, x5 x5Var) {
        this.f10462d = abstractC4296n;
        this.f10461c = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10461c.d();
        if (C4158b.m28407a()) {
            this.f10461c.a().m27810z(this);
            return;
        }
        boolean m28025e = this.f10462d.m28025e();
        this.f10462d.f10484c = 0L;
        if (m28025e) {
            this.f10462d.mo28007c();
        }
    }
}
