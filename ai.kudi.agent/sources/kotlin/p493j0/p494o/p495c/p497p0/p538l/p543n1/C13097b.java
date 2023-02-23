package kotlin.p493j0.p494o.p495c.p497p0.p538l.p543n1;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12620b;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.C12702d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.InterfaceC12700b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12983e1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13140z0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: CapturedTypeApproximation.kt */
/* renamed from: kotlin.j0.o.c.p0.l.n1.b */
/* loaded from: classes3.dex */
public final class C13097b {

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.n1.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13098a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29172a;

        static {
            int[] iArr = new int[EnumC13008h1.values().length];
            iArr[EnumC13008h1.INVARIANT.ordinal()] = 1;
            iArr[EnumC13008h1.IN_VARIANCE.ordinal()] = 2;
            iArr[EnumC13008h1.OUT_VARIANCE.ordinal()] = 3;
            f29172a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.n1.b$b */
    /* loaded from: classes3.dex */
    public static final class C13099b extends AbstractC11802m implements InterfaceC11767l<AbstractC13005g1, Boolean> {

        /* renamed from: c */
        public static final C13099b f29173c = new C13099b();

        C13099b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Boolean invoke(AbstractC13005g1 abstractC13005g1) {
            l.e(abstractC13005g1, "it");
            return Boolean.valueOf(C12702d.m6925d(abstractC13005g1));
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.n1.b$c */
    /* loaded from: classes3.dex */
    public static final class C13100c extends AbstractC13127u0 {
        C13100c() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0
        /* renamed from: j */
        public InterfaceC13131v0 mo5781j(InterfaceC13125t0 interfaceC13125t0) {
            l.f(interfaceC13125t0, "key");
            InterfaceC12700b interfaceC12700b = interfaceC13125t0 instanceof InterfaceC12700b ? (InterfaceC12700b) interfaceC13125t0 : null;
            if (interfaceC12700b == null) {
                return null;
            }
            if (interfaceC12700b.mo6088f().mo5757d()) {
                return new C13135x0(EnumC13008h1.OUT_VARIANCE, interfaceC12700b.mo6088f().mo5758c());
            }
            return interfaceC12700b.mo6088f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.n1.b$d */
    /* loaded from: classes3.dex */
    public static final class C13101d extends AbstractC11802m implements InterfaceC11767l<InterfaceC12650f, C13666w> {

        /* renamed from: c */
        public static final C13101d f29174c = new C13101d();

        C13101d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5865a(InterfaceC12650f interfaceC12650f) {
            l.f(interfaceC12650f, "$this$withOptions");
            interfaceC12650f.mo7117g(InterfaceC12620b.C12621a.f28400a);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC12650f interfaceC12650f) {
            m5865a(interfaceC12650f);
            return C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public static final C13096a<AbstractC12965b0> m5875a(AbstractC12965b0 abstractC12965b0) {
        List<C13287o> m3815I0;
        Object m5871e;
        l.f(abstractC12965b0, "type");
        if (C13136y.m5754b(abstractC12965b0)) {
            C13096a<AbstractC12965b0> m5875a = m5875a(C13136y.m5753c(abstractC12965b0));
            C13096a<AbstractC12965b0> m5875a2 = m5875a(C13136y.m5752d(abstractC12965b0));
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13005g1 m6249b = C12983e1.m6249b(C12969c0.m6314d(C13136y.m5753c(m5875a.m5877c()), C13136y.m5752d(m5875a2.m5877c())), abstractC12965b0);
            C12969c0 c12969c02 = C12969c0.f29026a;
            return new C13096a<>(m6249b, C12983e1.m6249b(C12969c0.m6314d(C13136y.m5753c(m5875a.m5876d()), C13136y.m5752d(m5875a2.m5876d())), abstractC12965b0));
        }
        InterfaceC13125t0 mo5779W0 = abstractC12965b0.mo5779W0();
        if (C12702d.m6925d(abstractC12965b0)) {
            InterfaceC13131v0 mo6088f = ((InterfaceC12700b) mo5779W0).mo6088f();
            AbstractC12965b0 mo5758c = mo6088f.mo5758c();
            l.e(mo5758c, "typeProjection.type");
            AbstractC12965b0 m5874b = m5874b(mo5758c, abstractC12965b0);
            int i = C13098a.f29172a[mo6088f.mo5760a().ordinal()];
            if (i == 2) {
                AbstractC13010i0 m9924I = C13090a.m5899h(abstractC12965b0).m9924I();
                l.e(m9924I, "type.builtIns.nullableAnyType");
                return new C13096a<>(m5874b, m9924I);
            } else if (i == 3) {
                AbstractC13010i0 m9925H = C13090a.m5899h(abstractC12965b0).m9925H();
                l.e(m9925H, "type.builtIns.nothingType");
                return new C13096a<>(m5874b(m9925H, abstractC12965b0), m5874b);
            } else {
                throw new AssertionError(l.m("Only nontrivial projections should have been captured, not: ", mo6088f));
            }
        } else if (!abstractC12965b0.mo5780V0().isEmpty() && abstractC12965b0.mo5780V0().size() == mo5779W0.mo5207c().size()) {
            ArrayList<C13102c> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<InterfaceC13131v0> mo5780V0 = abstractC12965b0.mo5780V0();
            List<InterfaceC13562z0> mo5207c = mo5779W0.mo5207c();
            l.e(mo5207c, "typeConstructor.parameters");
            m3815I0 = C13742z.m3815I0(mo5780V0, mo5207c);
            for (C13287o c13287o : m3815I0) {
                InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) c13287o.m5366a();
                InterfaceC13562z0 interfaceC13562z0 = (InterfaceC13562z0) c13287o.m5365b();
                l.e(interfaceC13562z0, "typeParameter");
                C13102c m5869g = m5869g(interfaceC13131v0, interfaceC13562z0);
                if (interfaceC13131v0.mo5757d()) {
                    arrayList.add(m5869g);
                    arrayList2.add(m5869g);
                } else {
                    C13096a<C13102c> m5872d = m5872d(m5869g);
                    arrayList.add(m5872d.m5879a());
                    arrayList2.add(m5872d.m5878b());
                }
            }
            boolean z = true;
            if (!arrayList.isEmpty()) {
                for (C13102c c13102c : arrayList) {
                    if (!c13102c.m5861d()) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                m5871e = C13090a.m5899h(abstractC12965b0).m9925H();
                l.e(m5871e, "type.builtIns.nothingType");
            } else {
                m5871e = m5871e(abstractC12965b0, arrayList);
            }
            return new C13096a<>(m5871e, m5871e(abstractC12965b0, arrayList2));
        } else {
            return new C13096a<>(abstractC12965b0, abstractC12965b0);
        }
    }

    /* renamed from: b */
    private static final AbstractC12965b0 m5874b(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02) {
        AbstractC12965b0 m6285q = C12974c1.m6285q(abstractC12965b0, abstractC12965b02.mo5778X0());
        l.e(m6285q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return m6285q;
    }

    /* renamed from: c */
    public static final InterfaceC13131v0 m5873c(InterfaceC13131v0 interfaceC13131v0, boolean z) {
        if (interfaceC13131v0 == null) {
            return null;
        }
        if (interfaceC13131v0.mo5757d()) {
            return interfaceC13131v0;
        }
        AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
        l.e(mo5758c, "typeProjection.type");
        if (C12974c1.m6299c(mo5758c, C13099b.f29173c)) {
            EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
            l.e(mo5760a, "typeProjection.projectionKind");
            if (mo5760a == EnumC13008h1.OUT_VARIANCE) {
                return new C13135x0(mo5760a, m5875a(mo5758c).m5876d());
            }
            if (z) {
                return new C13135x0(mo5760a, m5875a(mo5758c).m5877c());
            }
            return m5870f(interfaceC13131v0);
        }
        return interfaceC13131v0;
    }

    /* renamed from: d */
    private static final C13096a<C13102c> m5872d(C13102c c13102c) {
        C13096a<AbstractC12965b0> m5875a = m5875a(c13102c.m5864a());
        C13096a<AbstractC12965b0> m5875a2 = m5875a(c13102c.m5863b());
        return new C13096a<>(new C13102c(c13102c.m5862c(), m5875a.m5878b(), m5875a2.m5879a()), new C13102c(c13102c.m5862c(), m5875a.m5879a(), m5875a2.m5878b()));
    }

    /* renamed from: e */
    private static final AbstractC12965b0 m5871e(AbstractC12965b0 abstractC12965b0, List<C13102c> list) {
        int m3867o;
        boolean z = abstractC12965b0.mo5780V0().size() == list.size();
        if (!C13668y.f30115a || z) {
            m3867o = C13728s.m3867o(list, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (C13102c c13102c : list) {
                arrayList.add(m5868h(c13102c));
            }
            return C13140z0.m5737e(abstractC12965b0, arrayList, null, null, 6, null);
        }
        throw new AssertionError(l.m("Incorrect type arguments ", list));
    }

    /* renamed from: f */
    private static final InterfaceC13131v0 m5870f(InterfaceC13131v0 interfaceC13131v0) {
        C12959a1 m6342g = C12959a1.m6342g(new C13100c());
        l.e(m6342g, "create(object : TypeConstructorSubstitution() {\n        override fun get(key: TypeConstructor): TypeProjection? {\n            val capturedTypeConstructor = key as? CapturedTypeConstructor ?: return null\n            if (capturedTypeConstructor.projection.isStarProjection) {\n                return TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.projection.type)\n            }\n            return capturedTypeConstructor.projection\n        }\n    })");
        return m6342g.m6329t(interfaceC13131v0);
    }

    /* renamed from: g */
    private static final C13102c m5869g(InterfaceC13131v0 interfaceC13131v0, InterfaceC13562z0 interfaceC13562z0) {
        int i = C13098a.f29172a[C12959a1.m6346c(interfaceC13562z0.mo4648r(), interfaceC13131v0).ordinal()];
        if (i == 1) {
            AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
            l.e(mo5758c, "type");
            AbstractC12965b0 mo5758c2 = interfaceC13131v0.mo5758c();
            l.e(mo5758c2, "type");
            return new C13102c(interfaceC13562z0, mo5758c, mo5758c2);
        } else if (i == 2) {
            AbstractC12965b0 mo5758c3 = interfaceC13131v0.mo5758c();
            l.e(mo5758c3, "type");
            AbstractC13010i0 m9924I = C12747a.m6863g(interfaceC13562z0).m9924I();
            l.e(m9924I, "typeParameter.builtIns.nullableAnyType");
            return new C13102c(interfaceC13562z0, mo5758c3, m9924I);
        } else if (i == 3) {
            AbstractC13010i0 m9925H = C12747a.m6863g(interfaceC13562z0).m9925H();
            l.e(m9925H, "typeParameter.builtIns.nothingType");
            AbstractC12965b0 mo5758c4 = interfaceC13131v0.mo5758c();
            l.e(mo5758c4, "type");
            return new C13102c(interfaceC13562z0, m9925H, mo5758c4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    private static final InterfaceC13131v0 m5868h(C13102c c13102c) {
        boolean m5861d = c13102c.m5861d();
        if (C13668y.f30115a && !m5861d) {
            AbstractC12624c m7321b = AbstractC12624c.f28403a.m7321b(C13101d.f29174c);
            throw new AssertionError("Only consistent enhanced type projection can be converted to type projection, but [" + m7321b.mo7207q(c13102c.m5862c()) + ": <" + m7321b.mo7190w(c13102c.m5864a()) + ", " + m7321b.mo7190w(c13102c.m5863b()) + ">] was found");
        } else if (!l.b(c13102c.m5864a(), c13102c.m5863b()) && c13102c.m5862c().mo4648r() != EnumC13008h1.IN_VARIANCE) {
            if (!AbstractC12046h.m9887k0(c13102c.m5864a()) || c13102c.m5862c().mo4648r() == EnumC13008h1.IN_VARIANCE) {
                return AbstractC12046h.m9883m0(c13102c.m5863b()) ? new C13135x0(m5867i(c13102c, EnumC13008h1.IN_VARIANCE), c13102c.m5864a()) : new C13135x0(m5867i(c13102c, EnumC13008h1.OUT_VARIANCE), c13102c.m5863b());
            }
            return new C13135x0(m5867i(c13102c, EnumC13008h1.OUT_VARIANCE), c13102c.m5863b());
        } else {
            return new C13135x0(c13102c.m5864a());
        }
    }

    /* renamed from: i */
    private static final EnumC13008h1 m5867i(C13102c c13102c, EnumC13008h1 enumC13008h1) {
        return enumC13008h1 == c13102c.m5862c().mo4648r() ? EnumC13008h1.INVARIANT : enumC13008h1;
    }
}
