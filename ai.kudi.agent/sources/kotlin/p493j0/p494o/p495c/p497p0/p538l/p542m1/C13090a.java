package kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12983e1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13094n0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13140z0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f;
import kotlin.p557z.C13705i0;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.l.m1.a */
/* loaded from: classes3.dex */
public final class C13090a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.m1.a$a */
    /* loaded from: classes3.dex */
    static final class C13091a extends AbstractC11802m implements InterfaceC11767l<AbstractC13005g1, Boolean> {

        /* renamed from: c */
        public static final C13091a f29164c = new C13091a();

        C13091a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m5886a(AbstractC13005g1 abstractC13005g1) {
            l.f(abstractC13005g1, "it");
            InterfaceC13334h mo5206d = abstractC13005g1.mo5779W0().mo5206d();
            if (mo5206d == null) {
                return false;
            }
            return C13090a.m5894m(mo5206d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(AbstractC13005g1 abstractC13005g1) {
            return Boolean.valueOf(m5886a(abstractC13005g1));
        }
    }

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.m1.a$b */
    /* loaded from: classes3.dex */
    static final class C13092b extends AbstractC11802m implements InterfaceC11767l<AbstractC13005g1, Boolean> {

        /* renamed from: c */
        public static final C13092b f29165c = new C13092b();

        C13092b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m5885a(AbstractC13005g1 abstractC13005g1) {
            l.f(abstractC13005g1, "it");
            InterfaceC13334h mo5206d = abstractC13005g1.mo5779W0().mo5206d();
            if (mo5206d == null) {
                return false;
            }
            return (mo5206d instanceof InterfaceC13559y0) || (mo5206d instanceof InterfaceC13562z0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(AbstractC13005g1 abstractC13005g1) {
            return Boolean.valueOf(m5885a(abstractC13005g1));
        }
    }

    /* renamed from: a */
    public static final InterfaceC13131v0 m5906a(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return new C13135x0(abstractC12965b0);
    }

    /* renamed from: b */
    public static final boolean m5905b(AbstractC12965b0 abstractC12965b0, InterfaceC11767l<? super AbstractC13005g1, Boolean> interfaceC11767l) {
        l.f(abstractC12965b0, "<this>");
        l.f(interfaceC11767l, "predicate");
        return C12974c1.m6299c(abstractC12965b0, interfaceC11767l);
    }

    /* renamed from: c */
    private static final boolean m5904c(AbstractC12965b0 abstractC12965b0, InterfaceC13125t0 interfaceC13125t0, Set<? extends InterfaceC13562z0> set) {
        Iterable<C13705i0> m3817H0;
        boolean z;
        if (l.b(abstractC12965b0.mo5779W0(), interfaceC13125t0)) {
            return true;
        }
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        InterfaceC13360i interfaceC13360i = mo5206d instanceof InterfaceC13360i ? (InterfaceC13360i) mo5206d : null;
        List<InterfaceC13562z0> mo4975B = interfaceC13360i == null ? null : interfaceC13360i.mo4975B();
        m3817H0 = C13742z.m3817H0(abstractC12965b0.mo5780V0());
        if (!(m3817H0 instanceof Collection) || !((Collection) m3817H0).isEmpty()) {
            for (C13705i0 c13705i0 : m3817H0) {
                int m4119a = c13705i0.m4119a();
                InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) c13705i0.m4118b();
                InterfaceC13562z0 interfaceC13562z0 = mo4975B == null ? null : (InterfaceC13562z0) C13722p.m3951U(mo4975B, m4119a);
                if (((interfaceC13562z0 == null || set == null || !set.contains(interfaceC13562z0)) ? false : true) || interfaceC13131v0.mo5757d()) {
                    z = false;
                    continue;
                } else {
                    AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                    l.e(mo5758c, "argument.type");
                    z = m5904c(mo5758c, interfaceC13125t0, set);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m5903d(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return m5905b(abstractC12965b0, C13091a.f29164c);
    }

    /* renamed from: e */
    public static final InterfaceC13131v0 m5902e(AbstractC12965b0 abstractC12965b0, EnumC13008h1 enumC13008h1, InterfaceC13562z0 interfaceC13562z0) {
        l.f(abstractC12965b0, "type");
        l.f(enumC13008h1, "projectionKind");
        if ((interfaceC13562z0 == null ? null : interfaceC13562z0.mo4648r()) == enumC13008h1) {
            enumC13008h1 = EnumC13008h1.INVARIANT;
        }
        return new C13135x0(enumC13008h1, abstractC12965b0);
    }

    /* renamed from: f */
    public static final Set<InterfaceC13562z0> m5901f(AbstractC12965b0 abstractC12965b0, Set<? extends InterfaceC13562z0> set) {
        l.f(abstractC12965b0, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m5900g(abstractC12965b0, abstractC12965b0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private static final void m5900g(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, Set<InterfaceC13562z0> set, Set<? extends InterfaceC13562z0> set2) {
        boolean m3814J;
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (mo5206d instanceof InterfaceC13562z0) {
            if (!l.b(abstractC12965b0.mo5779W0(), abstractC12965b02.mo5779W0())) {
                set.add(mo5206d);
                return;
            }
            for (AbstractC12965b0 abstractC12965b03 : ((InterfaceC13562z0) mo5206d).getUpperBounds()) {
                l.e(abstractC12965b03, "upperBound");
                m5900g(abstractC12965b03, abstractC12965b02, set, set2);
            }
            return;
        }
        InterfaceC13334h mo5206d2 = abstractC12965b0.mo5779W0().mo5206d();
        InterfaceC13360i interfaceC13360i = mo5206d2 instanceof InterfaceC13360i ? (InterfaceC13360i) mo5206d2 : null;
        List<InterfaceC13562z0> mo4975B = interfaceC13360i == null ? null : interfaceC13360i.mo4975B();
        int i = 0;
        for (InterfaceC13131v0 interfaceC13131v0 : abstractC12965b0.mo5780V0()) {
            int i2 = i + 1;
            InterfaceC13562z0 interfaceC13562z0 = mo4975B == null ? null : (InterfaceC13562z0) C13722p.m3951U(mo4975B, i);
            if (!((interfaceC13562z0 == null || set2 == null || !set2.contains(interfaceC13562z0)) ? false : true) && !interfaceC13131v0.mo5757d()) {
                m3814J = C13742z.m3814J(set, interfaceC13131v0.mo5758c().mo5779W0().mo5206d());
                if (!m3814J && !l.b(interfaceC13131v0.mo5758c().mo5779W0(), abstractC12965b02.mo5779W0())) {
                    AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                    l.e(mo5758c, "argument.type");
                    m5900g(mo5758c, abstractC12965b02, set, set2);
                }
            }
            i = i2;
        }
    }

    /* renamed from: h */
    public static final AbstractC12046h m5899h(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC12046h mo5199s = abstractC12965b0.mo5779W0().mo5199s();
        l.e(mo5199s, "constructor.builtIns");
        return mo5199s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        r4 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[EDGE_INSN: B:29:0x0067->B:24:0x0067 ?: BREAK  , SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0 m5898i(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0 r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.e0.d.l.f(r8, r0)
            java.util.List r0 = r8.getUpperBounds()
            java.lang.String r1 = "upperBounds"
            kotlin.e0.d.l.e(r0, r1)
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            boolean r3 = kotlin.C13668y.f30115a
            if (r3 == 0) goto L27
            if (r0 == 0) goto L1b
            goto L27
        L1b:
            java.lang.String r0 = "Upper bounds should not be empty: "
            java.lang.String r8 = kotlin.e0.d.l.m(r0, r8)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r8)
            throw r0
        L27:
            java.util.List r0 = r8.getUpperBounds()
            kotlin.e0.d.l.e(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L67
            java.lang.Object r3 = r0.next()
            r5 = r3
            kotlin.j0.o.c.p0.l.b0 r5 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0) r5
            kotlin.j0.o.c.p0.l.t0 r5 = r5.mo5779W0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.mo5206d()
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
            if (r6 == 0) goto L4f
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e) r4
        L4f:
            r5 = 0
            if (r4 != 0) goto L53
            goto L64
        L53:
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r4.mo4957w()
            kotlin.reflect.jvm.internal.impl.descriptors.f r7 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f.INTERFACE
            if (r6 == r7) goto L64
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.mo4957w()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f.ANNOTATION_CLASS
            if (r4 == r6) goto L64
            r5 = 1
        L64:
            if (r5 == 0) goto L32
            r4 = r3
        L67:
            kotlin.j0.o.c.p0.l.b0 r4 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0) r4
            if (r4 != 0) goto L7e
            java.util.List r8 = r8.getUpperBounds()
            kotlin.e0.d.l.e(r8, r1)
            java.lang.Object r8 = kotlin.p557z.C13722p.m3954R(r8)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.e0.d.l.e(r8, r0)
            r4 = r8
            kotlin.j0.o.c.p0.l.b0 r4 = (kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0) r4
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a.m5898i(kotlin.reflect.jvm.internal.impl.descriptors.z0):kotlin.j0.o.c.p0.l.b0");
    }

    /* renamed from: j */
    public static final boolean m5897j(InterfaceC13562z0 interfaceC13562z0, InterfaceC13125t0 interfaceC13125t0, Set<? extends InterfaceC13562z0> set) {
        boolean z;
        l.f(interfaceC13562z0, "typeParameter");
        List<AbstractC12965b0> upperBounds = interfaceC13562z0.getUpperBounds();
        l.e(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (AbstractC12965b0 abstractC12965b0 : upperBounds) {
                l.e(abstractC12965b0, "upperBound");
                if (m5904c(abstractC12965b0, interfaceC13562z0.mo5010x().mo5779W0(), set) && (interfaceC13125t0 == null || l.b(abstractC12965b0.mo5779W0(), interfaceC13125t0))) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m5896k(InterfaceC13562z0 interfaceC13562z0, InterfaceC13125t0 interfaceC13125t0, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC13125t0 = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m5897j(interfaceC13562z0, interfaceC13125t0, set);
    }

    /* renamed from: l */
    public static final boolean m5895l(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        l.f(abstractC12965b0, "<this>");
        l.f(abstractC12965b02, "superType");
        return InterfaceC13022f.f29107a.mo6071d(abstractC12965b0, abstractC12965b02);
    }

    /* renamed from: m */
    public static final boolean m5894m(InterfaceC13334h interfaceC13334h) {
        l.f(interfaceC13334h, "<this>");
        return (interfaceC13334h instanceof InterfaceC13562z0) && (((InterfaceC13562z0) interfaceC13334h).mo4687d() instanceof InterfaceC13559y0);
    }

    /* renamed from: n */
    public static final boolean m5893n(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return C12974c1.m6289m(abstractC12965b0);
    }

    /* renamed from: o */
    public static final AbstractC12965b0 m5892o(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC12965b0 m6288n = C12974c1.m6288n(abstractC12965b0);
        l.e(m6288n, "makeNotNullable(this)");
        return m6288n;
    }

    /* renamed from: p */
    public static final AbstractC12965b0 m5891p(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        AbstractC12965b0 m6287o = C12974c1.m6287o(abstractC12965b0);
        l.e(m6287o, "makeNullable(this)");
        return m6287o;
    }

    /* renamed from: q */
    public static final AbstractC12965b0 m5890q(AbstractC12965b0 abstractC12965b0, InterfaceC13346g interfaceC13346g) {
        l.f(abstractC12965b0, "<this>");
        l.f(interfaceC13346g, "newAnnotations");
        return (abstractC12965b0.mo4956y().isEmpty() && interfaceC13346g.isEmpty()) ? abstractC12965b0 : abstractC12965b0.mo6202Z0().mo5765c1(interfaceC13346g);
    }

    /* renamed from: r */
    public static final AbstractC12965b0 m5889r(AbstractC12965b0 abstractC12965b0, C12959a1 c12959a1, Map<InterfaceC13125t0, ? extends InterfaceC13131v0> map, EnumC13008h1 enumC13008h1, Set<? extends InterfaceC13562z0> set) {
        AbstractC13005g1 abstractC13005g1;
        int m3867o;
        int m3867o2;
        int m3867o3;
        l.f(abstractC12965b0, "<this>");
        l.f(c12959a1, "substitutor");
        l.f(map, "substitutionMap");
        l.f(enumC13008h1, "variance");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13130v abstractC13130v = (AbstractC13130v) mo6202Z0;
            AbstractC13010i0 m5777e1 = abstractC13130v.m5777e1();
            if (!m5777e1.mo5779W0().mo5207c().isEmpty() && m5777e1.mo5779W0().mo5206d() != null) {
                List<InterfaceC13562z0> mo5207c = m5777e1.mo5779W0().mo5207c();
                l.e(mo5207c, "constructor.parameters");
                m3867o3 = C13728s.m3867o(mo5207c, 10);
                ArrayList arrayList = new ArrayList(m3867o3);
                for (InterfaceC13562z0 interfaceC13562z0 : mo5207c) {
                    InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) C13722p.m3951U(abstractC12965b0.mo5780V0(), interfaceC13562z0.mo4650h());
                    if ((set != null && set.contains(interfaceC13562z0)) || interfaceC13131v0 == null || !map.containsKey(interfaceC13131v0.mo5758c().mo5779W0())) {
                        interfaceC13131v0 = new C13094n0(interfaceC13562z0);
                    }
                    arrayList.add(interfaceC13131v0);
                }
                m5777e1 = C13140z0.m5736f(m5777e1, arrayList, null, 2, null);
            }
            AbstractC13010i0 m5776f1 = abstractC13130v.m5776f1();
            if (!m5776f1.mo5779W0().mo5207c().isEmpty() && m5776f1.mo5779W0().mo5206d() != null) {
                List<InterfaceC13562z0> mo5207c2 = m5776f1.mo5779W0().mo5207c();
                l.e(mo5207c2, "constructor.parameters");
                m3867o2 = C13728s.m3867o(mo5207c2, 10);
                ArrayList arrayList2 = new ArrayList(m3867o2);
                for (InterfaceC13562z0 interfaceC13562z02 : mo5207c2) {
                    InterfaceC13131v0 interfaceC13131v02 = (InterfaceC13131v0) C13722p.m3951U(abstractC12965b0.mo5780V0(), interfaceC13562z02.mo4650h());
                    if ((set != null && set.contains(interfaceC13562z02)) || interfaceC13131v02 == null || !map.containsKey(interfaceC13131v02.mo5758c().mo5779W0())) {
                        interfaceC13131v02 = new C13094n0(interfaceC13562z02);
                    }
                    arrayList2.add(interfaceC13131v02);
                }
                m5776f1 = C13140z0.m5736f(m5776f1, arrayList2, null, 2, null);
            }
            abstractC13005g1 = C12969c0.m6314d(m5777e1, m5776f1);
        } else if (mo6202Z0 instanceof AbstractC13010i0) {
            AbstractC13010i0 abstractC13010i0 = (AbstractC13010i0) mo6202Z0;
            if (abstractC13010i0.mo5779W0().mo5207c().isEmpty() || abstractC13010i0.mo5779W0().mo5206d() == null) {
                abstractC13005g1 = abstractC13010i0;
            } else {
                List<InterfaceC13562z0> mo5207c3 = abstractC13010i0.mo5779W0().mo5207c();
                l.e(mo5207c3, "constructor.parameters");
                m3867o = C13728s.m3867o(mo5207c3, 10);
                ArrayList arrayList3 = new ArrayList(m3867o);
                for (InterfaceC13562z0 interfaceC13562z03 : mo5207c3) {
                    InterfaceC13131v0 interfaceC13131v03 = (InterfaceC13131v0) C13722p.m3951U(abstractC12965b0.mo5780V0(), interfaceC13562z03.mo4650h());
                    if ((set != null && set.contains(interfaceC13562z03)) || interfaceC13131v03 == null || !map.containsKey(interfaceC13131v03.mo5758c().mo5779W0())) {
                        interfaceC13131v03 = new C13094n0(interfaceC13562z03);
                    }
                    arrayList3.add(interfaceC13131v03);
                }
                abstractC13005g1 = C13140z0.m5736f(abstractC13010i0, arrayList3, null, 2, null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12965b0 m6335n = c12959a1.m6335n(C12983e1.m6249b(abstractC13005g1, mo6202Z0), enumC13008h1);
        l.e(m6335n, "replaceArgumentsWith { typeParameterDescriptor ->\n        val argument = arguments.getOrNull(typeParameterDescriptor.index)\n        val isTypeParameterVisited = visitedTypeParameters != null && typeParameterDescriptor in visitedTypeParameters\n        if (!isTypeParameterVisited && argument != null && argument.type.constructor in substitutionMap) {\n            argument\n        } else StarProjectionImpl(typeParameterDescriptor)\n    }.let { substitutor.safeSubstitute(it, variance) }");
        return m6335n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.j0.o.c.p0.l.g1] */
    /* renamed from: s */
    public static final AbstractC12965b0 m5888s(AbstractC12965b0 abstractC12965b0) {
        int m3867o;
        AbstractC13010i0 abstractC13010i0;
        int m3867o2;
        int m3867o3;
        l.f(abstractC12965b0, "<this>");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13130v abstractC13130v = (AbstractC13130v) mo6202Z0;
            AbstractC13010i0 m5777e1 = abstractC13130v.m5777e1();
            if (!m5777e1.mo5779W0().mo5207c().isEmpty() && m5777e1.mo5779W0().mo5206d() != null) {
                List<InterfaceC13562z0> mo5207c = m5777e1.mo5779W0().mo5207c();
                l.e(mo5207c, "constructor.parameters");
                m3867o3 = C13728s.m3867o(mo5207c, 10);
                ArrayList arrayList = new ArrayList(m3867o3);
                for (InterfaceC13562z0 interfaceC13562z0 : mo5207c) {
                    arrayList.add(new C13094n0(interfaceC13562z0));
                }
                m5777e1 = C13140z0.m5736f(m5777e1, arrayList, null, 2, null);
            }
            AbstractC13010i0 m5776f1 = abstractC13130v.m5776f1();
            if (!m5776f1.mo5779W0().mo5207c().isEmpty() && m5776f1.mo5779W0().mo5206d() != null) {
                List<InterfaceC13562z0> mo5207c2 = m5776f1.mo5779W0().mo5207c();
                l.e(mo5207c2, "constructor.parameters");
                m3867o2 = C13728s.m3867o(mo5207c2, 10);
                ArrayList arrayList2 = new ArrayList(m3867o2);
                for (InterfaceC13562z0 interfaceC13562z02 : mo5207c2) {
                    arrayList2.add(new C13094n0(interfaceC13562z02));
                }
                m5776f1 = C13140z0.m5736f(m5776f1, arrayList2, null, 2, null);
            }
            abstractC13010i0 = C12969c0.m6314d(m5777e1, m5776f1);
        } else if (mo6202Z0 instanceof AbstractC13010i0) {
            AbstractC13010i0 abstractC13010i02 = (AbstractC13010i0) mo6202Z0;
            boolean isEmpty = abstractC13010i02.mo5779W0().mo5207c().isEmpty();
            abstractC13010i0 = abstractC13010i02;
            if (!isEmpty) {
                InterfaceC13334h mo5206d = abstractC13010i02.mo5779W0().mo5206d();
                abstractC13010i0 = abstractC13010i02;
                if (mo5206d != null) {
                    List<InterfaceC13562z0> mo5207c3 = abstractC13010i02.mo5779W0().mo5207c();
                    l.e(mo5207c3, "constructor.parameters");
                    m3867o = C13728s.m3867o(mo5207c3, 10);
                    ArrayList arrayList3 = new ArrayList(m3867o);
                    for (InterfaceC13562z0 interfaceC13562z03 : mo5207c3) {
                        arrayList3.add(new C13094n0(interfaceC13562z03));
                    }
                    abstractC13010i0 = C13140z0.m5736f(abstractC13010i02, arrayList3, null, 2, null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C12983e1.m6249b(abstractC13010i0, mo6202Z0);
    }

    /* renamed from: t */
    public static final boolean m5887t(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return m5905b(abstractC12965b0, C13092b.f29165c);
    }
}
