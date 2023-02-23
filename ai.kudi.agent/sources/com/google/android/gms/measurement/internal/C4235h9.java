package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* loaded from: classes2.dex */
public final class C4235h9 {

    /* renamed from: a */
    private RunnableC4224g9 f10346a;

    /* renamed from: b */
    final /* synthetic */ C4294m9 f10347b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4235h9(C4294m9 c4294m9) {
        this.f10347b = c4294m9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m28175a(long j) {
        Handler handler;
        this.f10346a = new RunnableC4224g9(this, ((v5) this.f10347b).a.c().currentTimeMillis(), j);
        handler = this.f10347b.f10475c;
        handler.postDelayed(this.f10346a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28174b() {
        Handler handler;
        this.f10347b.h();
        if (this.f10346a != null) {
            handler = this.f10347b.f10475c;
            handler.removeCallbacks(this.f10346a);
        }
        ((v5) this.f10347b).a.F().q.m27806a(false);
    }
}
