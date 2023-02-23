package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13029j;
import kotlin.p557z.C13728s;
/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.l0 */
/* loaded from: classes3.dex */
public final class C13064l0 {
    /* renamed from: a */
    public static final C12955a m6017a(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof C12955a) {
            return (C12955a) mo6202Z0;
        }
        return null;
    }

    /* renamed from: b */
    public static final AbstractC13010i0 m6016b(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        C12955a m6017a = m6017a(abstractC12965b0);
        if (m6017a == null) {
            return null;
        }
        return m6017a.m6360i1();
    }

    /* renamed from: c */
    public static final boolean m6015c(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return abstractC12965b0.mo6202Z0() instanceof C13058k;
    }

    /* renamed from: d */
    private static final C12956a0 m6014d(C12956a0 c12956a0) {
        int m3867o;
        AbstractC12965b0 abstractC12965b0;
        Collection<AbstractC12965b0> mo5218a = c12956a0.mo5218a();
        m3867o = C13728s.m3867o(mo5218a, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        Iterator<T> it = mo5218a.iterator();
        boolean z = false;
        while (true) {
            abstractC12965b0 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC12965b0 abstractC12965b02 = (AbstractC12965b0) it.next();
            if (C12974c1.m6290l(abstractC12965b02)) {
                abstractC12965b02 = m6012f(abstractC12965b02.mo6202Z0(), false, 1, null);
                z = true;
            }
            arrayList.add(abstractC12965b02);
        }
        if (z) {
            AbstractC12965b0 m6353i = c12956a0.m6353i();
            if (m6353i != null) {
                if (C12974c1.m6290l(m6353i)) {
                    m6353i = m6012f(m6353i.mo6202Z0(), false, 1, null);
                }
                abstractC12965b0 = m6353i;
            }
            return new C12956a0(arrayList).m6350l(abstractC12965b0);
        }
        return null;
    }

    /* renamed from: e */
    public static final AbstractC13005g1 m6013e(AbstractC13005g1 abstractC13005g1, boolean z) {
        l.f(abstractC13005g1, "<this>");
        C13058k m6025b = C13058k.f29146f.m6025b(abstractC13005g1, z);
        if (m6025b == null) {
            AbstractC13010i0 m6011g = m6011g(abstractC13005g1);
            return m6011g == null ? abstractC13005g1.mo5767a1(false) : m6011g;
        }
        return m6025b;
    }

    /* renamed from: f */
    public static /* synthetic */ AbstractC13005g1 m6012f(AbstractC13005g1 abstractC13005g1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m6013e(abstractC13005g1, z);
    }

    /* renamed from: g */
    private static final AbstractC13010i0 m6011g(AbstractC12965b0 abstractC12965b0) {
        C12956a0 m6014d;
        InterfaceC13125t0 mo5779W0 = abstractC12965b0.mo5779W0();
        C12956a0 c12956a0 = mo5779W0 instanceof C12956a0 ? (C12956a0) mo5779W0 : null;
        if (c12956a0 == null || (m6014d = m6014d(c12956a0)) == null) {
            return null;
        }
        return m6014d.m6354h();
    }

    /* renamed from: h */
    public static final AbstractC13010i0 m6010h(AbstractC13010i0 abstractC13010i0, boolean z) {
        l.f(abstractC13010i0, "<this>");
        C13058k m6025b = C13058k.f29146f.m6025b(abstractC13010i0, z);
        if (m6025b == null) {
            AbstractC13010i0 m6011g = m6011g(abstractC13010i0);
            return m6011g == null ? abstractC13010i0.mo5826d1(false) : m6011g;
        }
        return m6025b;
    }

    /* renamed from: i */
    public static /* synthetic */ AbstractC13010i0 m6009i(AbstractC13010i0 abstractC13010i0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m6010h(abstractC13010i0, z);
    }

    /* renamed from: j */
    public static final AbstractC13010i0 m6008j(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02) {
        l.f(abstractC13010i0, "<this>");
        l.f(abstractC13010i02, "abbreviatedType");
        return C12977d0.m6274a(abstractC13010i0) ? abstractC13010i0 : new C12955a(abstractC13010i0, abstractC13010i02);
    }

    /* renamed from: k */
    public static final C13029j m6007k(C13029j c13029j) {
        l.f(c13029j, "<this>");
        return new C13029j(c13029j.m6095f1(), c13029j.mo5779W0(), c13029j.m6093h1(), c13029j.mo4956y(), c13029j.mo5778X0(), true);
    }
}
