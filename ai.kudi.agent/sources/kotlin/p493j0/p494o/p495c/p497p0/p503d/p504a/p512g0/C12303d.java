package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.InterfaceC12166d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n.C12256f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12983e1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13064l0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13007h0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.d */
/* loaded from: classes3.dex */
public final class C12303d {

    /* renamed from: a */
    private final InterfaceC12166d f27344a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.g0.d$a */
    /* loaded from: classes3.dex */
    public static class C12304a {

        /* renamed from: a */
        private final AbstractC12965b0 f27345a;

        /* renamed from: b */
        private final int f27346b;

        /* renamed from: c */
        private final boolean f27347c;

        public C12304a(AbstractC12965b0 abstractC12965b0, int i, boolean z) {
            l.f(abstractC12965b0, "type");
            this.f27345a = abstractC12965b0;
            this.f27346b = i;
            this.f27347c = z;
        }

        /* renamed from: a */
        public final int m9248a() {
            return this.f27346b;
        }

        /* renamed from: b */
        public AbstractC12965b0 mo9245b() {
            return this.f27345a;
        }

        /* renamed from: c */
        public final AbstractC12965b0 m9247c() {
            AbstractC12965b0 mo9245b = mo9245b();
            if (m9246d()) {
                return mo9245b;
            }
            return null;
        }

        /* renamed from: d */
        public final boolean m9246d() {
            return this.f27347c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.g0.d$b */
    /* loaded from: classes3.dex */
    public static final class C12305b extends C12304a {

        /* renamed from: d */
        private final AbstractC13010i0 f27348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12305b(AbstractC13010i0 abstractC13010i0, int i, boolean z) {
            super(abstractC13010i0, i, z);
            l.f(abstractC13010i0, "type");
            this.f27348d = abstractC13010i0;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12303d.C12304a
        /* renamed from: e */
        public AbstractC13010i0 mo9245b() {
            return this.f27348d;
        }
    }

    public C12303d(InterfaceC12166d interfaceC12166d) {
        l.f(interfaceC12166d, "javaResolverSettings");
        this.f27344a = interfaceC12166d;
    }

    /* renamed from: a */
    private final AbstractC12965b0 m9254a(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        AbstractC12965b0 m6250a = C12983e1.m6250a(abstractC12965b02);
        AbstractC12965b0 m6250a2 = C12983e1.m6250a(abstractC12965b0);
        if (m6250a2 == null) {
            if (m6250a == null) {
                return null;
            }
            m6250a2 = m6250a;
        }
        if (m6250a == null) {
            return m6250a2;
        }
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6314d(C13136y.m5753c(m6250a2), C13136y.m5752d(m6250a));
    }

    /* renamed from: c */
    private final C12305b m9252c(AbstractC13010i0 abstractC13010i0, InterfaceC11767l<? super Integer, C12306e> interfaceC11767l, int i, EnumC12357p enumC12357p, boolean z) {
        C12302c m9127e;
        int m3867o;
        C12302c m9124h;
        List m3886j;
        InterfaceC13346g m9128d;
        InterfaceC13131v0 m5902e;
        if (C12358q.m9137a(enumC12357p) || !abstractC13010i0.mo5780V0().isEmpty()) {
            InterfaceC13334h mo5206d = abstractC13010i0.mo5779W0().mo5206d();
            if (mo5206d == null) {
                return new C12305b(abstractC13010i0, 1, false);
            }
            C12306e invoke = interfaceC11767l.invoke(Integer.valueOf(i));
            m9127e = C12361t.m9127e(mo5206d, invoke, enumC12357p);
            InterfaceC13334h interfaceC13334h = (InterfaceC13334h) m9127e.m9256a();
            InterfaceC13346g m9255b = m9127e.m9255b();
            InterfaceC13125t0 mo4649n = interfaceC13334h.mo4649n();
            l.e(mo4649n, "enhancedClassifier.typeConstructor");
            int i2 = i + 1;
            boolean z2 = m9255b != null;
            List<InterfaceC13131v0> mo5780V0 = abstractC13010i0.mo5780V0();
            m3867o = C13728s.m3867o(mo5780V0, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            int i3 = 0;
            for (Object obj : mo5780V0) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) obj;
                    if (interfaceC13131v0.mo5757d()) {
                        int i5 = i2 + 1;
                        if (interfaceC11767l.invoke(Integer.valueOf(i2)).m9241c() == EnumC12310h.NOT_NULL && !z) {
                            AbstractC12965b0 m5892o = C13090a.m5892o(interfaceC13131v0.mo5758c().mo6202Z0());
                            EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
                            l.e(mo5760a, "arg.projectionKind");
                            m5902e = C13090a.m5902e(m5892o, mo5760a, mo4649n.mo5207c().get(i3));
                        } else {
                            m5902e = C12974c1.m6283s(interfaceC13334h.mo4649n().mo5207c().get(i3));
                            l.e(m5902e, "{\n                    TypeUtils.makeStarProjection(enhancedClassifier.typeConstructor.parameters[localArgIndex])\n                }");
                        }
                        i2 = i5;
                    } else {
                        C12304a m9250e = m9250e(interfaceC13131v0.mo5758c().mo6202Z0(), interfaceC11767l, i2);
                        z2 = z2 || m9250e.m9246d();
                        i2 += m9250e.m9248a();
                        AbstractC12965b0 mo9245b = m9250e.mo9245b();
                        EnumC13008h1 mo5760a2 = interfaceC13131v0.mo5760a();
                        l.e(mo5760a2, "arg.projectionKind");
                        m5902e = C13090a.m5902e(mo9245b, mo5760a2, mo4649n.mo5207c().get(i3));
                    }
                    arrayList.add(m5902e);
                    i3 = i4;
                } else {
                    C13722p.m3923n();
                    throw null;
                }
            }
            m9124h = C12361t.m9124h(abstractC13010i0, invoke, enumC12357p);
            boolean booleanValue = ((Boolean) m9124h.m9256a()).booleanValue();
            InterfaceC13346g m9255b2 = m9124h.m9255b();
            int i6 = i2 - i;
            if (!(z2 || m9255b2 != null)) {
                return new C12305b(abstractC13010i0, i6, false);
            }
            boolean z3 = false;
            m3886j = C13726r.m3886j(abstractC13010i0.mo4956y(), m9255b, m9255b2);
            m9128d = C12361t.m9128d(m3886j);
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13010i0 m6309i = C12969c0.m6309i(m9128d, mo4649n, arrayList, booleanValue, null, 16, null);
            AbstractC13005g1 abstractC13005g1 = m6309i;
            if (invoke.m9240d()) {
                abstractC13005g1 = m9249f(m6309i);
            }
            if (m9255b2 != null && invoke.m9239e()) {
                z3 = true;
            }
            if (z3) {
                abstractC13005g1 = C12983e1.m6247d(abstractC13010i0, abstractC13005g1);
            }
            return new C12305b((AbstractC13010i0) abstractC13005g1, i6, true);
        }
        return new C12305b(abstractC13010i0, 1, false);
    }

    /* renamed from: d */
    static /* synthetic */ C12305b m9251d(C12303d c12303d, AbstractC13010i0 abstractC13010i0, InterfaceC11767l interfaceC11767l, int i, EnumC12357p enumC12357p, boolean z, int i2, Object obj) {
        return c12303d.m9252c(abstractC13010i0, interfaceC11767l, i, enumC12357p, (i2 & 8) != 0 ? false : z);
    }

    /* renamed from: e */
    private final C12304a m9250e(AbstractC13005g1 abstractC13005g1, InterfaceC11767l<? super Integer, C12306e> interfaceC11767l, int i) {
        AbstractC13005g1 m6314d;
        boolean z = false;
        if (C12977d0.m6274a(abstractC13005g1)) {
            return new C12304a(abstractC13005g1, 1, false);
        }
        if (abstractC13005g1 instanceof AbstractC13130v) {
            boolean z2 = abstractC13005g1 instanceof InterfaceC13007h0;
            AbstractC13130v abstractC13130v = (AbstractC13130v) abstractC13005g1;
            C12305b m9252c = m9252c(abstractC13130v.m5777e1(), interfaceC11767l, i, EnumC12357p.FLEXIBLE_LOWER, z2);
            C12305b m9252c2 = m9252c(abstractC13130v.m5776f1(), interfaceC11767l, i, EnumC12357p.FLEXIBLE_UPPER, z2);
            boolean z3 = m9252c.m9248a() == m9252c2.m9248a();
            if (C13668y.f30115a && !z3) {
                throw new AssertionError("Different tree sizes of bounds: lower = (" + abstractC13130v.m5777e1() + ", " + m9252c.m9248a() + "), upper = (" + abstractC13130v.m5776f1() + ", " + m9252c2.m9248a() + ')');
            }
            z = (m9252c.m9246d() || m9252c2.m9246d()) ? true : true;
            AbstractC12965b0 m9254a = m9254a(m9252c.mo9245b(), m9252c2.mo9245b());
            if (z) {
                if (abstractC13005g1 instanceof C12256f) {
                    m6314d = new C12256f(m9252c.mo9245b(), m9252c2.mo9245b());
                } else {
                    C12969c0 c12969c0 = C12969c0.f29026a;
                    m6314d = C12969c0.m6314d(m9252c.mo9245b(), m9252c2.mo9245b());
                }
                abstractC13005g1 = C12983e1.m6247d(m6314d, m9254a);
            }
            return new C12304a(abstractC13005g1, m9252c.m9248a(), z);
        } else if (abstractC13005g1 instanceof AbstractC13010i0) {
            return m9251d(this, (AbstractC13010i0) abstractC13005g1, interfaceC11767l, i, EnumC12357p.INFLEXIBLE, false, 8, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    private final AbstractC13010i0 m9249f(AbstractC13010i0 abstractC13010i0) {
        if (this.f27344a.mo9549a()) {
            return C13064l0.m6010h(abstractC13010i0, true);
        }
        return new C12309g(abstractC13010i0);
    }

    /* renamed from: b */
    public final AbstractC12965b0 m9253b(AbstractC12965b0 abstractC12965b0, InterfaceC11767l<? super Integer, C12306e> interfaceC11767l) {
        l.f(abstractC12965b0, "<this>");
        l.f(interfaceC11767l, "qualifiers");
        return m9250e(abstractC12965b0.mo6202Z0(), interfaceC11767l, 0).m9247c();
    }
}
