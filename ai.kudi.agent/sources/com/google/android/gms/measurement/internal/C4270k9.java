package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3976rc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.k9 */
/* loaded from: classes2.dex */
public final class C4270k9 {

    /* renamed from: a */
    protected long f10433a;

    /* renamed from: b */
    protected long f10434b;

    /* renamed from: c */
    private final AbstractC4296n f10435c;

    /* renamed from: d */
    final /* synthetic */ C4294m9 f10436d;

    public C4270k9(C4294m9 c4294m9) {
        this.f10436d = c4294m9;
        this.f10435c = new C4258j9(this, ((v5) this.f10436d).a);
        long mo31535a = ((v5) c4294m9).a.c().mo31535a();
        this.f10433a = mo31535a;
        this.f10434b = mo31535a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m28055a() {
        this.f10435c.m28027b();
        this.f10433a = 0L;
        this.f10434b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28054b(long j) {
        this.f10435c.m28027b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m28053c(long j) {
        this.f10436d.h();
        this.f10435c.m28027b();
        this.f10433a = j;
        this.f10434b = j;
    }

    /* renamed from: d */
    public final boolean m28052d(boolean z, boolean z2, long j) {
        this.f10436d.h();
        this.f10436d.i();
        C3976rc.m28988b();
        if (((v5) this.f10436d).a.z().B(null, C4173c3.f10134j0)) {
            if (((v5) this.f10436d).a.o()) {
                ((v5) this.f10436d).a.F().o.m28403b(((v5) this.f10436d).a.c().currentTimeMillis());
            }
        } else {
            ((v5) this.f10436d).a.F().o.m28403b(((v5) this.f10436d).a.c().currentTimeMillis());
        }
        long j2 = j - this.f10433a;
        if (!z && j2 < 1000) {
            ((v5) this.f10436d).a.b().v().m28013b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f10434b;
            this.f10434b = j;
        }
        ((v5) this.f10436d).a.b().v().m28013b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        ia.x(((v5) this.f10436d).a.K().m27890t(!((v5) this.f10436d).a.z().D()), bundle, true);
        if (!((v5) this.f10436d).a.z().B(null, C4173c3.f10109U) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!((v5) this.f10436d).a.z().B(null, C4173c3.f10109U) || !z2) {
            ((v5) this.f10436d).a.I().m28124u("auto", "_e", bundle);
        }
        this.f10433a = j;
        this.f10435c.m28027b();
        this.f10435c.m28026d(3600000L);
        return true;
    }
}
