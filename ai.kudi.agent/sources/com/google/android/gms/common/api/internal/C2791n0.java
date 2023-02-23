package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.C2871f;
import com.google.android.gms.common.internal.C2903p;
import com.google.android.gms.common.internal.C2920t;
import com.google.android.gms.common.internal.C2923u;
import com.google.android.gms.common.util.C2964b;
import com.google.android.gms.tasks.InterfaceC4454e;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: classes2.dex */
final class C2791n0<T> implements InterfaceC4454e<T> {

    /* renamed from: a */
    private final InterfaceC2769g f7827a;

    /* renamed from: b */
    private final int f7828b;

    /* renamed from: c */
    private final C2754b<?> f7829c;

    /* renamed from: d */
    private final long f7830d;

    /* renamed from: e */
    private final long f7831e;

    C2791n0(InterfaceC2769g interfaceC2769g, int i, C2754b<?> c2754b, long j, long j2, String str, String str2) {
        this.f7827a = interfaceC2769g;
        this.f7828b = i;
        this.f7829c = c2754b;
        this.f7830d = j;
        this.f7831e = j2;
    }

    /* renamed from: b */
    static <T> C2791n0<T> m31937b(InterfaceC2769g interfaceC2769g, int i, C2754b<?> c2754b) {
        boolean z;
        if (interfaceC2769g.f()) {
            C2923u m31638a = C2920t.m31637b().m31638a();
            if (m31638a == null) {
                z = true;
            } else if (!m31638a.m31623k()) {
                return null;
            } else {
                z = m31638a.m31622l();
                e0 w = interfaceC2769g.w(c2754b);
                if (w != null) {
                    if (!(w.v() instanceof AbstractC2854c)) {
                        return null;
                    }
                    AbstractC2854c abstractC2854c = (AbstractC2854c) w.v();
                    if (abstractC2854c.m31811I() && !abstractC2854c.m31788d()) {
                        C2871f m31936c = m31936c(w, abstractC2854c, i);
                        if (m31936c == null) {
                            return null;
                        }
                        w.G();
                        z = m31936c.m31745s();
                    }
                }
            }
            return new C2791n0<>(interfaceC2769g, i, c2754b, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
        }
        return null;
    }

    /* renamed from: c */
    private static C2871f m31936c(e0<?> e0Var, AbstractC2854c<?> abstractC2854c, int i) {
        int[] m31748h;
        int[] m31747k;
        C2871f m31813G = abstractC2854c.m31813G();
        if (m31813G == null || !m31813G.m31746l() || ((m31748h = m31813G.m31748h()) != null ? !C2964b.m31543b(m31748h, i) : !((m31747k = m31813G.m31747k()) == null || !C2964b.m31543b(m31747k, i))) || e0Var.s() >= m31813G.m31749f()) {
            return null;
        }
        return m31813G;
    }

    @Override // com.google.android.gms.tasks.InterfaceC4454e
    /* renamed from: a */
    public final void mo21856a(com.google.android.gms.tasks.j<T> jVar) {
        e0 w;
        int i;
        int i2;
        int i3;
        int i4;
        int m31883f;
        long j;
        long j2;
        int i5;
        if (this.f7827a.f()) {
            C2923u m31638a = C2920t.m31637b().m31638a();
            if ((m31638a == null || m31638a.m31623k()) && (w = this.f7827a.w(this.f7829c)) != null && (w.v() instanceof AbstractC2854c)) {
                AbstractC2854c abstractC2854c = (AbstractC2854c) w.v();
                boolean z = true;
                boolean z2 = this.f7830d > 0;
                int m31772y = abstractC2854c.m31772y();
                if (m31638a != null) {
                    z2 &= m31638a.m31622l();
                    int m31625f = m31638a.m31625f();
                    int m31624h = m31638a.m31624h();
                    i = m31638a.m31621s();
                    if (abstractC2854c.m31811I() && !abstractC2854c.m31788d()) {
                        C2871f m31936c = m31936c(w, abstractC2854c, this.f7828b);
                        if (m31936c == null) {
                            return;
                        }
                        z = (!m31936c.m31745s() || this.f7830d <= 0) ? false : false;
                        m31624h = m31936c.m31749f();
                        z2 = z;
                    }
                    i2 = m31625f;
                    i3 = m31624h;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                InterfaceC2769g interfaceC2769g = this.f7827a;
                if (jVar.p()) {
                    i4 = 0;
                    m31883f = 0;
                } else {
                    if (jVar.n()) {
                        i4 = 100;
                    } else {
                        Exception k = jVar.k();
                        if (k instanceof ApiException) {
                            Status m32106a = ((ApiException) k).m32106a();
                            int m32097h = m32106a.m32097h();
                            C2826b m32098f = m32106a.m32098f();
                            m31883f = m32098f == null ? -1 : m32098f.m31883f();
                            i4 = m32097h;
                        } else {
                            i4 = 101;
                        }
                    }
                    m31883f = -1;
                }
                if (z2) {
                    long j3 = this.f7830d;
                    j2 = System.currentTimeMillis();
                    j = j3;
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f7831e);
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                interfaceC2769g.F(new C2903p(this.f7828b, i4, m31883f, j, j2, null, null, m31772y, i5), i, i2, i3);
            }
        }
    }
}
