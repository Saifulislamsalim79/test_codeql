package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13114r0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13351i;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeAliasExpander.kt */
/* renamed from: kotlin.j0.o.c.p0.l.p0 */
/* loaded from: classes3.dex */
public final class C13108p0 {

    /* renamed from: c */
    public static final C13109a f29182c = new C13109a(null);

    /* renamed from: a */
    private final InterfaceC13114r0 f29183a;

    /* renamed from: b */
    private final boolean f29184b;

    /* compiled from: TypeAliasExpander.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.p0$a */
    /* loaded from: classes3.dex */
    public static final class C13109a {
        private C13109a() {
        }

        public /* synthetic */ C13109a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m5840b(int i, InterfaceC13559y0 interfaceC13559y0) {
            if (i > 100) {
                throw new AssertionError(l.m("Too deep recursion while expanding type alias ", interfaceC13559y0.mo5012b()));
            }
        }
    }

    static {
        new C13108p0(InterfaceC13114r0.C13115a.f29191a, false);
    }

    public C13108p0(InterfaceC13114r0 interfaceC13114r0, boolean z) {
        l.f(interfaceC13114r0, "reportStrategy");
        this.f29183a = interfaceC13114r0;
        this.f29184b = z;
    }

    /* renamed from: a */
    private final void m5854a(InterfaceC13346g interfaceC13346g, InterfaceC13346g interfaceC13346g2) {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC13340c> it = interfaceC13346g.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo5309f());
        }
        for (InterfaceC13340c interfaceC13340c : interfaceC13346g2) {
            if (hashSet.contains(interfaceC13340c.mo5309f())) {
                this.f29183a.mo5830a(interfaceC13340c);
            }
        }
    }

    /* renamed from: b */
    private final void m5853b(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        C12959a1 m6343f = C12959a1.m6343f(abstractC12965b02);
        l.e(m6343f, "create(substitutedType)");
        int i = 0;
        for (Object obj : abstractC12965b02.mo5780V0()) {
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) obj;
                if (!interfaceC13131v0.mo5757d()) {
                    AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                    l.e(mo5758c, "substitutedArgument.type");
                    if (!C13090a.m5903d(mo5758c)) {
                        InterfaceC13131v0 interfaceC13131v02 = abstractC12965b0.mo5780V0().get(i);
                        InterfaceC13562z0 interfaceC13562z0 = abstractC12965b0.mo5779W0().mo5207c().get(i);
                        if (this.f29184b) {
                            InterfaceC13114r0 interfaceC13114r0 = this.f29183a;
                            AbstractC12965b0 mo5758c2 = interfaceC13131v02.mo5758c();
                            l.e(mo5758c2, "unsubstitutedArgument.type");
                            AbstractC12965b0 mo5758c3 = interfaceC13131v0.mo5758c();
                            l.e(mo5758c3, "substitutedArgument.type");
                            l.e(interfaceC13562z0, "typeParameter");
                            interfaceC13114r0.mo5828c(m6343f, mo5758c2, mo5758c3, interfaceC13562z0);
                        }
                    }
                }
                i = i2;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
    }

    /* renamed from: c */
    private final C13110q m5852c(C13110q c13110q, InterfaceC13346g interfaceC13346g) {
        return c13110q.mo5765c1(m5847h(c13110q, interfaceC13346g));
    }

    /* renamed from: d */
    private final AbstractC13010i0 m5851d(AbstractC13010i0 abstractC13010i0, InterfaceC13346g interfaceC13346g) {
        return C12977d0.m6274a(abstractC13010i0) ? abstractC13010i0 : C13140z0.m5736f(abstractC13010i0, null, m5847h(abstractC13010i0, interfaceC13346g), 1, null);
    }

    /* renamed from: e */
    private final AbstractC13010i0 m5850e(AbstractC13010i0 abstractC13010i0, AbstractC12965b0 abstractC12965b0) {
        AbstractC13010i0 m6284r = C12974c1.m6284r(abstractC13010i0, abstractC12965b0.mo5778X0());
        l.e(m6284r, "makeNullableIfNeeded(this, fromType.isMarkedNullable)");
        return m6284r;
    }

    /* renamed from: f */
    private final AbstractC13010i0 m5849f(AbstractC13010i0 abstractC13010i0, AbstractC12965b0 abstractC12965b0) {
        return m5851d(m5850e(abstractC13010i0, abstractC12965b0), abstractC12965b0.mo4956y());
    }

    /* renamed from: g */
    private final AbstractC13010i0 m5848g(C13111q0 c13111q0, InterfaceC13346g interfaceC13346g, boolean z) {
        C12969c0 c12969c0 = C12969c0.f29026a;
        InterfaceC13125t0 mo4649n = c13111q0.m5835b().mo4649n();
        l.e(mo4649n, "descriptor.typeConstructor");
        return C12969c0.m6308j(interfaceC13346g, mo4649n, c13111q0.m5836a(), z, InterfaceC12777h.C12780b.f28671b);
    }

    /* renamed from: h */
    private final InterfaceC13346g m5847h(AbstractC12965b0 abstractC12965b0, InterfaceC13346g interfaceC13346g) {
        return C12977d0.m6274a(abstractC12965b0) ? abstractC12965b0.mo4956y() : C13351i.m5313a(interfaceC13346g, abstractC12965b0.mo4956y());
    }

    /* renamed from: j */
    private final InterfaceC13131v0 m5845j(InterfaceC13131v0 interfaceC13131v0, C13111q0 c13111q0, int i) {
        int m3867o;
        AbstractC13005g1 mo6202Z0 = interfaceC13131v0.mo5758c().mo6202Z0();
        if (C13113r.m5831a(mo6202Z0)) {
            return interfaceC13131v0;
        }
        AbstractC13010i0 m5741a = C13140z0.m5741a(mo6202Z0);
        if (C12977d0.m6274a(m5741a) || !C13090a.m5887t(m5741a)) {
            return interfaceC13131v0;
        }
        InterfaceC13125t0 mo5779W0 = m5741a.mo5779W0();
        InterfaceC13334h mo5206d = mo5779W0.mo5206d();
        int i2 = 0;
        boolean z = mo5779W0.mo5207c().size() == m5741a.mo5780V0().size();
        if (!C13668y.f30115a || z) {
            if (mo5206d instanceof InterfaceC13562z0) {
                return interfaceC13131v0;
            }
            if (mo5206d instanceof InterfaceC13559y0) {
                InterfaceC13559y0 interfaceC13559y0 = (InterfaceC13559y0) mo5206d;
                if (c13111q0.m5833d(interfaceC13559y0)) {
                    this.f29183a.mo5827d(interfaceC13559y0);
                    return new C13135x0(EnumC13008h1.INVARIANT, C13118t.m5811j(l.m("Recursive type alias: ", interfaceC13559y0.mo5012b())));
                }
                List<InterfaceC13131v0> mo5780V0 = m5741a.mo5780V0();
                m3867o = C13728s.m3867o(mo5780V0, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (Object obj : mo5780V0) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        arrayList.add(m5843l((InterfaceC13131v0) obj, c13111q0, mo5779W0.mo5207c().get(i2), i + 1));
                        i2 = i3;
                    } else {
                        C13722p.m3923n();
                        throw null;
                    }
                }
                AbstractC13010i0 m5844k = m5844k(C13111q0.f29186e.m5832a(c13111q0, interfaceC13559y0, arrayList), m5741a.mo4956y(), m5741a.mo5778X0(), i + 1, false);
                AbstractC13010i0 m5842m = m5842m(m5741a, c13111q0, i);
                if (!C13113r.m5831a(m5844k)) {
                    m5844k = C13064l0.m6008j(m5844k, m5842m);
                }
                return new C13135x0(interfaceC13131v0.mo5760a(), m5844k);
            }
            AbstractC13010i0 m5842m2 = m5842m(m5741a, c13111q0, i);
            m5853b(m5741a, m5842m2);
            return new C13135x0(interfaceC13131v0.mo5760a(), m5842m2);
        }
        throw new AssertionError(l.m("Unexpected malformed type: ", m5741a));
    }

    /* renamed from: k */
    private final AbstractC13010i0 m5844k(C13111q0 c13111q0, InterfaceC13346g interfaceC13346g, boolean z, int i, boolean z2) {
        InterfaceC13131v0 m5843l = m5843l(new C13135x0(EnumC13008h1.INVARIANT, c13111q0.m5835b().mo4656q0()), c13111q0, null, i);
        AbstractC12965b0 mo5758c = m5843l.mo5758c();
        l.e(mo5758c, "expandedProjection.type");
        AbstractC13010i0 m5741a = C13140z0.m5741a(mo5758c);
        if (C12977d0.m6274a(m5741a)) {
            return m5741a;
        }
        boolean z3 = m5843l.mo5760a() == EnumC13008h1.INVARIANT;
        if (C13668y.f30115a && !z3) {
            throw new AssertionError("Type alias expansion: result for " + c13111q0.m5835b() + " is " + m5843l.mo5760a() + ", should be invariant");
        }
        m5854a(m5741a.mo4956y(), interfaceC13346g);
        AbstractC13010i0 m6284r = C12974c1.m6284r(m5851d(m5741a, interfaceC13346g), z);
        l.e(m6284r, "expandedType.combineAnnotations(annotations).let { TypeUtils.makeNullableIfNeeded(it, isNullable) }");
        return z2 ? C13064l0.m6008j(m6284r, m5848g(c13111q0, interfaceC13346g, z)) : m6284r;
    }

    /* renamed from: l */
    private final InterfaceC13131v0 m5843l(InterfaceC13131v0 interfaceC13131v0, C13111q0 c13111q0, InterfaceC13562z0 interfaceC13562z0, int i) {
        AbstractC12965b0 m5849f;
        EnumC13008h1 enumC13008h1;
        EnumC13008h1 enumC13008h12;
        f29182c.m5840b(i, c13111q0.m5835b());
        if (interfaceC13131v0.mo5757d()) {
            l.d(interfaceC13562z0);
            InterfaceC13131v0 m6283s = C12974c1.m6283s(interfaceC13562z0);
            l.e(m6283s, "makeStarProjection(typeParameterDescriptor!!)");
            return m6283s;
        }
        AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
        l.e(mo5758c, "underlyingProjection.type");
        InterfaceC13131v0 m5834c = c13111q0.m5834c(mo5758c.mo5779W0());
        if (m5834c == null) {
            return m5845j(interfaceC13131v0, c13111q0, i);
        }
        if (m5834c.mo5757d()) {
            l.d(interfaceC13562z0);
            InterfaceC13131v0 m6283s2 = C12974c1.m6283s(interfaceC13562z0);
            l.e(m6283s2, "makeStarProjection(typeParameterDescriptor!!)");
            return m6283s2;
        }
        AbstractC13005g1 mo6202Z0 = m5834c.mo5758c().mo6202Z0();
        EnumC13008h1 mo5760a = m5834c.mo5760a();
        l.e(mo5760a, "argument.projectionKind");
        EnumC13008h1 mo5760a2 = interfaceC13131v0.mo5760a();
        l.e(mo5760a2, "underlyingProjection.projectionKind");
        if (mo5760a2 != mo5760a && mo5760a2 != (enumC13008h12 = EnumC13008h1.INVARIANT)) {
            if (mo5760a == enumC13008h12) {
                mo5760a = mo5760a2;
            } else {
                this.f29183a.mo5829b(c13111q0.m5835b(), interfaceC13562z0, mo6202Z0);
            }
        }
        EnumC13008h1 mo4648r = interfaceC13562z0 == null ? null : interfaceC13562z0.mo4648r();
        if (mo4648r == null) {
            mo4648r = EnumC13008h1.INVARIANT;
        }
        l.e(mo4648r, "typeParameterDescriptor?.variance ?: Variance.INVARIANT");
        if (mo4648r != mo5760a && mo4648r != (enumC13008h1 = EnumC13008h1.INVARIANT)) {
            if (mo5760a == enumC13008h1) {
                mo5760a = enumC13008h1;
            } else {
                this.f29183a.mo5829b(c13111q0.m5835b(), interfaceC13562z0, mo6202Z0);
            }
        }
        m5854a(mo5758c.mo4956y(), mo6202Z0.mo4956y());
        if (mo6202Z0 instanceof C13110q) {
            m5849f = m5852c((C13110q) mo6202Z0, mo5758c.mo4956y());
        } else {
            m5849f = m5849f(C13140z0.m5741a(mo6202Z0), mo5758c);
        }
        return new C13135x0(mo5760a, m5849f);
    }

    /* renamed from: m */
    private final AbstractC13010i0 m5842m(AbstractC13010i0 abstractC13010i0, C13111q0 c13111q0, int i) {
        int m3867o;
        InterfaceC13125t0 mo5779W0 = abstractC13010i0.mo5779W0();
        List<InterfaceC13131v0> mo5780V0 = abstractC13010i0.mo5780V0();
        m3867o = C13728s.m3867o(mo5780V0, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        int i2 = 0;
        for (Object obj : mo5780V0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) obj;
                InterfaceC13131v0 m5843l = m5843l(interfaceC13131v0, c13111q0, mo5779W0.mo5207c().get(i2), i + 1);
                if (!m5843l.mo5757d()) {
                    m5843l = new C13135x0(m5843l.mo5760a(), C12974c1.m6285q(m5843l.mo5758c(), interfaceC13131v0.mo5758c().mo5778X0()));
                }
                arrayList.add(m5843l);
                i2 = i3;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        return C13140z0.m5736f(abstractC13010i0, arrayList, null, 2, null);
    }

    /* renamed from: i */
    public final AbstractC13010i0 m5846i(C13111q0 c13111q0, InterfaceC13346g interfaceC13346g) {
        l.f(c13111q0, "typeAliasExpansion");
        l.f(interfaceC13346g, "annotations");
        return m5844k(c13111q0, interfaceC13346g, false, 0, true);
    }
}
