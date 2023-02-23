package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u;
import kotlin.p557z.C13728s;
/* compiled from: protoTypeTableUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.f */
/* loaded from: classes3.dex */
public final class C12597f {
    /* renamed from: a */
    public static final C12555q m7428a(C12555q c12555q, C12598g c12598g) {
        l.f(c12555q, "<this>");
        l.f(c12598g, "typeTable");
        if (c12555q.m7805k0()) {
            return c12555q.m7823R();
        }
        if (c12555q.m7804l0()) {
            return c12598g.m7412a(c12555q.m7822S());
        }
        return null;
    }

    /* renamed from: b */
    public static final C12555q m7427b(C12562r c12562r, C12598g c12598g) {
        l.f(c12562r, "<this>");
        l.f(c12598g, "typeTable");
        if (c12562r.m7694e0()) {
            C12555q m7704T = c12562r.m7704T();
            l.e(m7704T, "expandedType");
            return m7704T;
        } else if (c12562r.m7693f0()) {
            return c12598g.m7412a(c12562r.m7703U());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: c */
    public static final C12555q m7426c(C12555q c12555q, C12598g c12598g) {
        l.f(c12555q, "<this>");
        l.f(c12598g, "typeTable");
        if (c12555q.m7800p0()) {
            return c12555q.m7813c0();
        }
        if (c12555q.m7799q0()) {
            return c12598g.m7412a(c12555q.m7812d0());
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m7425d(C12531i c12531i) {
        l.f(c12531i, "<this>");
        return c12531i.m8145o0() || c12531i.m8144p0();
    }

    /* renamed from: e */
    public static final boolean m7424e(C12542n c12542n) {
        l.f(c12542n, "<this>");
        return c12542n.m7965l0() || c12542n.m7964m0();
    }

    /* renamed from: f */
    public static final C12555q m7423f(C12555q c12555q, C12598g c12598g) {
        l.f(c12555q, "<this>");
        l.f(c12598g, "typeTable");
        if (c12555q.m7797s0()) {
            return c12555q.m7810f0();
        }
        if (c12555q.m7796t0()) {
            return c12598g.m7412a(c12555q.m7809g0());
        }
        return null;
    }

    /* renamed from: g */
    public static final C12555q m7422g(C12531i c12531i, C12598g c12598g) {
        l.f(c12531i, "<this>");
        l.f(c12598g, "typeTable");
        if (c12531i.m8145o0()) {
            return c12531i.m8161Y();
        }
        if (c12531i.m8144p0()) {
            return c12598g.m7412a(c12531i.m8160Z());
        }
        return null;
    }

    /* renamed from: h */
    public static final C12555q m7421h(C12542n c12542n, C12598g c12598g) {
        l.f(c12542n, "<this>");
        l.f(c12598g, "typeTable");
        if (c12542n.m7965l0()) {
            return c12542n.m7979X();
        }
        if (c12542n.m7964m0()) {
            return c12598g.m7412a(c12542n.m7978Y());
        }
        return null;
    }

    /* renamed from: i */
    public static final C12555q m7420i(C12531i c12531i, C12598g c12598g) {
        l.f(c12531i, "<this>");
        l.f(c12598g, "typeTable");
        if (c12531i.m8143q0()) {
            C12555q m8159a0 = c12531i.m8159a0();
            l.e(m8159a0, "returnType");
            return m8159a0;
        } else if (c12531i.m8142r0()) {
            return c12598g.m7412a(c12531i.m8158b0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: j */
    public static final C12555q m7419j(C12542n c12542n, C12598g c12598g) {
        l.f(c12542n, "<this>");
        l.f(c12598g, "typeTable");
        if (c12542n.m7963n0()) {
            C12555q m7977Z = c12542n.m7977Z();
            l.e(m7977Z, "returnType");
            return m7977Z;
        } else if (c12542n.m7962o0()) {
            return c12598g.m7412a(c12542n.m7976a0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: k */
    public static final List<C12555q> m7418k(C12509c c12509c, C12598g c12598g) {
        int m3867o;
        l.f(c12509c, "<this>");
        l.f(c12598g, "typeTable");
        List<C12555q> m8481G0 = c12509c.m8481G0();
        if (!(!m8481G0.isEmpty())) {
            m8481G0 = null;
        }
        if (m8481G0 == null) {
            List<Integer> m8483F0 = c12509c.m8483F0();
            l.e(m8483F0, "supertypeIdList");
            m3867o = C13728s.m3867o(m8483F0, 10);
            m8481G0 = new ArrayList<>(m3867o);
            for (Integer num : m8483F0) {
                l.e(num, "it");
                m8481G0.add(c12598g.m7412a(num.intValue()));
            }
        }
        return m8481G0;
    }

    /* renamed from: l */
    public static final C12555q m7417l(C12555q.C12557b c12557b, C12598g c12598g) {
        l.f(c12557b, "<this>");
        l.f(c12598g, "typeTable");
        if (c12557b.m7786C()) {
            return c12557b.m7771z();
        }
        if (c12557b.m7785D()) {
            return c12598g.m7412a(c12557b.m7788A());
        }
        return null;
    }

    /* renamed from: m */
    public static final C12555q m7416m(C12572u c12572u, C12598g c12598g) {
        l.f(c12572u, "<this>");
        l.f(c12598g, "typeTable");
        if (c12572u.m7555S()) {
            C12555q m7561M = c12572u.m7561M();
            l.e(m7561M, "type");
            return m7561M;
        } else if (c12572u.m7554T()) {
            return c12598g.m7412a(c12572u.m7560N());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: n */
    public static final C12555q m7415n(C12562r c12562r, C12598g c12598g) {
        l.f(c12562r, "<this>");
        l.f(c12598g, "typeTable");
        if (c12562r.m7690i0()) {
            C12555q m7697b0 = c12562r.m7697b0();
            l.e(m7697b0, "underlyingType");
            return m7697b0;
        } else if (c12562r.m7689j0()) {
            return c12598g.m7412a(c12562r.m7696c0());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: o */
    public static final List<C12555q> m7414o(C12565s c12565s, C12598g c12598g) {
        int m3867o;
        l.f(c12565s, "<this>");
        l.f(c12598g, "typeTable");
        List<C12555q> m7636S = c12565s.m7636S();
        if (!(!m7636S.isEmpty())) {
            m7636S = null;
        }
        if (m7636S == null) {
            List<Integer> m7637R = c12565s.m7637R();
            l.e(m7637R, "upperBoundIdList");
            m3867o = C13728s.m3867o(m7637R, 10);
            m7636S = new ArrayList<>(m3867o);
            for (Integer num : m7637R) {
                l.e(num, "it");
                m7636S.add(c12598g.m7412a(num.intValue()));
            }
        }
        return m7636S;
    }

    /* renamed from: p */
    public static final C12555q m7413p(C12572u c12572u, C12598g c12598g) {
        l.f(c12572u, "<this>");
        l.f(c12598g, "typeTable");
        if (c12572u.m7553U()) {
            return c12572u.m7559O();
        }
        if (c12572u.m7552W()) {
            return c12598g.m7412a(c12572u.m7558P());
        }
        return null;
    }
}
