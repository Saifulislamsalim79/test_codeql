package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.EnumC12143k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: RawType.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.e */
/* loaded from: classes3.dex */
public final class C12253e extends AbstractC13137y0 {

    /* renamed from: b */
    public static final C12253e f27319b = new C12253e();

    /* renamed from: c */
    private static final C12246a f27320c = C12251d.m9300f(EnumC12143k.COMMON, false, null, 3, null).m9325g(EnumC12247b.FLEXIBLE_LOWER_BOUND);

    /* renamed from: d */
    private static final C12246a f27321d = C12251d.m9300f(EnumC12143k.COMMON, false, null, 3, null).m9325g(EnumC12247b.FLEXIBLE_UPPER_BOUND);

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.e$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27322a;

        static {
            int[] iArr = new int[EnumC12247b.values().length];
            iArr[EnumC12247b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[EnumC12247b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[EnumC12247b.INFLEXIBLE.ordinal()] = 3;
            f27322a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RawType.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.e$b */
    /* loaded from: classes3.dex */
    public static final class C12255b extends AbstractC11802m implements InterfaceC11767l<AbstractC13026h, AbstractC13010i0> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13312e f27323c;

        /* renamed from: d */
        final /* synthetic */ AbstractC13010i0 f27324d;

        /* renamed from: e */
        final /* synthetic */ C12246a f27325e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12255b(InterfaceC13312e interfaceC13312e, AbstractC13010i0 abstractC13010i0, C12246a c12246a) {
            super(1);
            this.f27323c = interfaceC13312e;
            this.f27324d = abstractC13010i0;
            this.f27325e = c12246a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC13010i0 invoke(AbstractC13026h abstractC13026h) {
            InterfaceC13312e mo6105a;
            l.f(abstractC13026h, "kotlinTypeRefiner");
            InterfaceC13312e interfaceC13312e = this.f27323c;
            if (!(interfaceC13312e instanceof InterfaceC13312e)) {
                interfaceC13312e = null;
            }
            C12608b m6862h = interfaceC13312e == null ? null : C12747a.m6862h(interfaceC13312e);
            if (m6862h == null || (mo6105a = abstractC13026h.mo6105a(m6862h)) == null || l.b(mo6105a, this.f27323c)) {
                return null;
            }
            return (AbstractC13010i0) C12253e.f27319b.m9295k(this.f27324d, mo6105a, this.f27325e).m5364c();
        }
    }

    private C12253e() {
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC13131v0 m9296j(C12253e c12253e, InterfaceC13562z0 interfaceC13562z0, C12246a c12246a, AbstractC12965b0 abstractC12965b0, int i, Object obj) {
        if ((i & 4) != 0) {
            abstractC12965b0 = C12251d.m9303c(interfaceC13562z0, true, c12246a, null, 4, null);
        }
        return c12253e.m9297i(interfaceC13562z0, c12246a, abstractC12965b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final C13287o<AbstractC13010i0, Boolean> m9295k(AbstractC13010i0 abstractC13010i0, InterfaceC13312e interfaceC13312e, C12246a c12246a) {
        int m3867o;
        List m3901b;
        if (abstractC13010i0.mo5779W0().mo5207c().isEmpty()) {
            return C13664u.m4227a(abstractC13010i0, Boolean.FALSE);
        }
        if (AbstractC12046h.m9904b0(abstractC13010i0)) {
            InterfaceC13131v0 interfaceC13131v0 = abstractC13010i0.mo5780V0().get(0);
            EnumC13008h1 mo5760a = interfaceC13131v0.mo5760a();
            AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
            l.e(mo5758c, "componentTypeProjection.type");
            m3901b = C13724q.m3901b(new C13135x0(mo5760a, m9294l(mo5758c, c12246a)));
            C12969c0 c12969c0 = C12969c0.f29026a;
            return C13664u.m4227a(C12969c0.m6309i(abstractC13010i0.mo4956y(), abstractC13010i0.mo5779W0(), m3901b, abstractC13010i0.mo5778X0(), null, 16, null), Boolean.FALSE);
        } else if (C12977d0.m6274a(abstractC13010i0)) {
            AbstractC13010i0 m5811j = C13118t.m5811j(l.m("Raw error type: ", abstractC13010i0.mo5779W0()));
            l.e(m5811j, "createErrorType(\"Raw error type: ${type.constructor}\")");
            return C13664u.m4227a(m5811j, Boolean.FALSE);
        } else {
            InterfaceC12777h mo5011k0 = interfaceC13312e.mo5011k0(f27319b);
            l.e(mo5011k0, "declaration.getMemberScope(RawSubstitution)");
            C12969c0 c12969c02 = C12969c0.f29026a;
            InterfaceC13346g mo4956y = abstractC13010i0.mo4956y();
            InterfaceC13125t0 mo4649n = interfaceC13312e.mo4649n();
            l.e(mo4649n, "declaration.typeConstructor");
            List<InterfaceC13562z0> mo5207c = interfaceC13312e.mo4649n().mo5207c();
            l.e(mo5207c, "declaration.typeConstructor.parameters");
            m3867o = C13728s.m3867o(mo5207c, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13562z0 interfaceC13562z0 : mo5207c) {
                C12253e c12253e = f27319b;
                l.e(interfaceC13562z0, "parameter");
                arrayList.add(m9296j(c12253e, interfaceC13562z0, c12246a, null, 4, null));
            }
            return C13664u.m4227a(C12969c0.m6307k(mo4956y, mo4649n, arrayList, abstractC13010i0.mo5778X0(), mo5011k0, new C12255b(interfaceC13312e, abstractC13010i0, c12246a)), Boolean.TRUE);
        }
    }

    /* renamed from: l */
    private final AbstractC12965b0 m9294l(AbstractC12965b0 abstractC12965b0, C12246a c12246a) {
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (mo5206d instanceof InterfaceC13562z0) {
            return m9294l(C12251d.m9303c((InterfaceC13562z0) mo5206d, true, c12246a, null, 4, null), c12246a);
        }
        if (mo5206d instanceof InterfaceC13312e) {
            InterfaceC13334h mo5206d2 = C13136y.m5752d(abstractC12965b0).mo5779W0().mo5206d();
            if (mo5206d2 instanceof InterfaceC13312e) {
                C13287o<AbstractC13010i0, Boolean> m9295k = m9295k(C13136y.m5753c(abstractC12965b0), (InterfaceC13312e) mo5206d, f27320c);
                AbstractC13010i0 m5366a = m9295k.m5366a();
                boolean booleanValue = m9295k.m5365b().booleanValue();
                C13287o<AbstractC13010i0, Boolean> m9295k2 = m9295k(C13136y.m5752d(abstractC12965b0), (InterfaceC13312e) mo5206d2, f27321d);
                AbstractC13010i0 m5366a2 = m9295k2.m5366a();
                boolean booleanValue2 = m9295k2.m5365b().booleanValue();
                if (!booleanValue && !booleanValue2) {
                    C12969c0 c12969c0 = C12969c0.f29026a;
                    return C12969c0.m6314d(m5366a, m5366a2);
                }
                return new C12256f(m5366a, m5366a2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + mo5206d2 + "\" while for lower it's \"" + mo5206d + '\"').toString());
        }
        throw new IllegalStateException(l.m("Unexpected declaration kind: ", mo5206d).toString());
    }

    /* renamed from: m */
    static /* synthetic */ AbstractC12965b0 m9293m(C12253e c12253e, AbstractC12965b0 abstractC12965b0, C12246a c12246a, int i, Object obj) {
        if ((i & 2) != 0) {
            c12246a = new C12246a(EnumC12143k.COMMON, null, false, null, 14, null);
        }
        return c12253e.m9294l(abstractC12965b0, c12246a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: f */
    public boolean mo5744f() {
        return false;
    }

    /* renamed from: i */
    public final InterfaceC13131v0 m9297i(InterfaceC13562z0 interfaceC13562z0, C12246a c12246a, AbstractC12965b0 abstractC12965b0) {
        l.f(interfaceC13562z0, "parameter");
        l.f(c12246a, "attr");
        l.f(abstractC12965b0, "erasedUpperBound");
        int i = C12254a.f27322a[c12246a.m9329c().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!interfaceC13562z0.mo4648r().m6206b()) {
                return new C13135x0(EnumC13008h1.INVARIANT, C12747a.m6863g(interfaceC13562z0).m9925H());
            }
            List<InterfaceC13562z0> mo5207c = abstractC12965b0.mo5779W0().mo5207c();
            l.e(mo5207c, "erasedUpperBound.constructor.parameters");
            if (!mo5207c.isEmpty()) {
                return new C13135x0(EnumC13008h1.OUT_VARIANCE, abstractC12965b0);
            }
            return C12251d.m9302d(interfaceC13562z0, c12246a);
        }
        return new C13135x0(EnumC13008h1.INVARIANT, abstractC12965b0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0
    /* renamed from: n */
    public C13135x0 mo5745e(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "key");
        return new C13135x0(m9293m(this, abstractC12965b0, null, 2, null));
    }
}
