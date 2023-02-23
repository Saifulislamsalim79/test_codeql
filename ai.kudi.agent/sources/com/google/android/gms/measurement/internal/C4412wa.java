package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3749d3;
import com.google.android.gms.internal.measurement.C3842j3;
import com.google.android.gms.internal.measurement.C3930oc;
import com.google.android.gms.internal.measurement.C4096z4;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.wa */
/* loaded from: classes2.dex */
public final class C4412wa extends AbstractC4401va {

    /* renamed from: g */
    private final C3842j3 f10780g;

    /* renamed from: h */
    final /* synthetic */ C4423xa f10781h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4412wa(C4423xa c4423xa, String str, int i, C3842j3 c3842j3) {
        super(str, i);
        this.f10781h = c4423xa;
        this.f10780g = c3842j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC4401va
    /* renamed from: a */
    public final int mo27847a() {
        return this.f10780g.m29492w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC4401va
    /* renamed from: b */
    public final boolean mo27846b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC4401va
    /* renamed from: c */
    public final boolean mo27845c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m27844k(Long l, Long l2, C4096z4 c4096z4, boolean z) {
        C3930oc.m29235b();
        boolean B = ((v5) this.f10781h).a.z().B(this.f10744a, C4173c3.f10112X);
        boolean m29497C = this.f10780g.m29497C();
        boolean m29496D = this.f10780g.m29496D();
        boolean m29495E = this.f10780g.m29495E();
        boolean z2 = m29497C || m29496D || m29495E;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z2) {
            ((v5) this.f10781h).a.b().v().m28012c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f10745b), this.f10780g.m29494F() ? Integer.valueOf(this.f10780g.m29492w()) : null);
            return true;
        }
        C3749d3 m29491x = this.f10780g.m29491x();
        boolean m29694C = m29491x.m29694C();
        if (c4096z4.m28557M()) {
            if (!m29491x.m29692E()) {
                ((v5) this.f10781h).a.b().w().m28013b("No number filter for long property. property", ((v5) this.f10781h).a.D().m28044f(c4096z4.m28568B()));
            } else {
                bool = AbstractC4401va.m27906j(AbstractC4401va.m27908h(c4096z4.m28552x(), m29491x.m29687y()), m29694C);
            }
        } else if (c4096z4.m28558L()) {
            if (!m29491x.m29692E()) {
                ((v5) this.f10781h).a.b().w().m28013b("No number filter for double property. property", ((v5) this.f10781h).a.D().m28044f(c4096z4.m28568B()));
            } else {
                bool = AbstractC4401va.m27906j(AbstractC4401va.m27909g(c4096z4.m28553w(), m29491x.m29687y()), m29694C);
            }
        } else if (c4096z4.m28555O()) {
            if (!m29491x.m29690G()) {
                if (!m29491x.m29692E()) {
                    ((v5) this.f10781h).a.b().w().m28013b("No string or number filter defined. property", ((v5) this.f10781h).a.D().m28044f(c4096z4.m28568B()));
                } else if (C4192da.m28288P(c4096z4.m28567C())) {
                    bool = AbstractC4401va.m27906j(AbstractC4401va.m27907i(c4096z4.m28567C(), m29491x.m29687y()), m29694C);
                } else {
                    ((v5) this.f10781h).a.b().w().m28012c("Invalid user property value for Numeric number filter. property, value", ((v5) this.f10781h).a.D().m28044f(c4096z4.m28568B()), c4096z4.m28567C());
                }
            } else {
                bool = AbstractC4401va.m27906j(AbstractC4401va.m27910f(c4096z4.m28567C(), m29491x.m29686z(), ((v5) this.f10781h).a.b()), m29694C);
            }
        } else {
            ((v5) this.f10781h).a.b().w().m28013b("User property has no value, property", ((v5) this.f10781h).a.D().m28044f(c4096z4.m28568B()));
        }
        ((v5) this.f10781h).a.b().v().m28013b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f10746c = Boolean.TRUE;
        if (!m29495E || bool.booleanValue()) {
            if (!z || this.f10780g.m29497C()) {
                this.f10747d = bool;
            }
            if (bool.booleanValue() && z2 && c4096z4.m28556N()) {
                long m28551y = c4096z4.m28551y();
                if (l != null) {
                    m28551y = l.longValue();
                }
                if (B && this.f10780g.m29497C() && !this.f10780g.m29496D() && l2 != null) {
                    m28551y = l2.longValue();
                }
                if (this.f10780g.m29496D()) {
                    this.f10749f = Long.valueOf(m28551y);
                } else {
                    this.f10748e = Long.valueOf(m28551y);
                }
            }
            return true;
        }
        return true;
    }
}
