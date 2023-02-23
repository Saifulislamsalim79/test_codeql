package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* loaded from: classes2.dex */
public final class RunnableC4224g9 implements Runnable {

    /* renamed from: c */
    final long f10314c;

    /* renamed from: d */
    final long f10315d;

    /* renamed from: e */
    final /* synthetic */ C4235h9 f10316e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4224g9(C4235h9 c4235h9, long j, long j2) {
        this.f10316e = c4235h9;
        this.f10314c = j;
        this.f10315d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((v5) this.f10316e.f10347b).a.a().m27810z(new Runnable() { // from class: com.google.android.gms.measurement.internal.f9
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC4224g9 runnableC4224g9 = RunnableC4224g9.this;
                C4235h9 c4235h9 = runnableC4224g9.f10316e;
                long j = runnableC4224g9.f10314c;
                long j2 = runnableC4224g9.f10315d;
                c4235h9.f10347b.h();
                ((v5) c4235h9.f10347b).a.b().q().m28014a("Application going to the background");
                boolean z = true;
                ((v5) c4235h9.f10347b).a.F().q.m27806a(true);
                Bundle bundle = new Bundle();
                if (!((v5) c4235h9.f10347b).a.z().D()) {
                    c4235h9.f10347b.f10477e.m28054b(j2);
                    if (((v5) c4235h9.f10347b).a.z().B(null, C4173c3.f10128g0)) {
                        C4270k9 c4270k9 = c4235h9.f10347b.f10477e;
                        long j3 = c4270k9.f10434b;
                        c4270k9.f10434b = j2;
                        bundle.putLong("_et", j2 - j3);
                        ia.x(((v5) c4235h9.f10347b).a.K().m27890t(true), bundle, true);
                    } else {
                        z = false;
                    }
                    c4235h9.f10347b.f10477e.m28052d(false, z, j2);
                }
                ((v5) c4235h9.f10347b).a.I().m28123v("auto", "_ab", j, bundle);
            }
        });
    }
}
