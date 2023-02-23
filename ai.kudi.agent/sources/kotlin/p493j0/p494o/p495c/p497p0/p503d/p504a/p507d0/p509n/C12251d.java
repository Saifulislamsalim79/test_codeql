package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.EnumC12143k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13094n0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13104o0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13739x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.d */
/* loaded from: classes3.dex */
public final class C12251d {

    /* renamed from: a */
    private static final C12609c f27317a = new C12609c("java.lang.Class");

    /* compiled from: JavaTypeResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.d$a */
    /* loaded from: classes3.dex */
    public static final class C12252a extends AbstractC11802m implements InterfaceC11756a<AbstractC13010i0> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13562z0 f27318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12252a(InterfaceC13562z0 interfaceC13562z0) {
            super(0);
            this.f27318c = interfaceC13562z0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final AbstractC13010i0 invoke() {
            AbstractC13010i0 m5811j = C13118t.m5811j("Can't compute erased upper bound of type parameter `" + this.f27318c + '`');
            l.e(m5811j, "createErrorType(\"Can't compute erased upper bound of type parameter `$this`\")");
            return m5811j;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C12609c m9305a() {
        return f27317a;
    }

    /* renamed from: b */
    public static final AbstractC12965b0 m9304b(InterfaceC13562z0 interfaceC13562z0, boolean z, C12246a c12246a, InterfaceC11756a<? extends AbstractC12965b0> interfaceC11756a) {
        int m3867o;
        int m3898f;
        int m10271a;
        InterfaceC13131v0 m9297i;
        l.f(interfaceC13562z0, "<this>");
        l.f(c12246a, "typeAttr");
        l.f(interfaceC11756a, "defaultValue");
        Set<InterfaceC13562z0> m9327e = c12246a.m9327e();
        if (m9327e != null && m9327e.contains(interfaceC13562z0.mo4651a())) {
            return interfaceC11756a.invoke();
        }
        AbstractC13010i0 mo5010x = interfaceC13562z0.mo5010x();
        l.e(mo5010x, "defaultType");
        Set<InterfaceC13562z0> m5901f = C13090a.m5901f(mo5010x, m9327e);
        m3867o = C13728s.m3867o(m5901f, 10);
        m3898f = C13725q0.m3898f(m3867o);
        m10271a = C11841h.m10271a(m3898f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
        for (InterfaceC13562z0 interfaceC13562z02 : m5901f) {
            if (m9327e != null && m9327e.contains(interfaceC13562z02)) {
                m9297i = m9302d(interfaceC13562z02, c12246a);
            } else {
                m9297i = C12253e.f27319b.m9297i(interfaceC13562z02, z ? c12246a : c12246a.m9325g(EnumC12247b.INFLEXIBLE), m9303c(interfaceC13562z02, z, c12246a.m9324h(interfaceC13562z0), null, 4, null));
            }
            C13287o m4227a = C13664u.m4227a(interfaceC13562z02.mo4649n(), m9297i);
            linkedHashMap.put(m4227a.m5364c(), m4227a.m5363d());
        }
        C12959a1 m6342g = C12959a1.m6342g(AbstractC13127u0.C13128a.m5782e(AbstractC13127u0.f29209b, linkedHashMap, false, 2, null));
        l.e(m6342g, "create(TypeConstructorSubstitution.createByConstructorsMap(erasedUpperBounds))");
        List<AbstractC12965b0> upperBounds = interfaceC13562z0.getUpperBounds();
        l.e(upperBounds, "upperBounds");
        AbstractC12965b0 abstractC12965b0 = (AbstractC12965b0) C13722p.m3954R(upperBounds);
        if (abstractC12965b0.mo5779W0().mo5206d() instanceof InterfaceC13312e) {
            l.e(abstractC12965b0, "firstUpperBound");
            return C13090a.m5889r(abstractC12965b0, m6342g, linkedHashMap, EnumC13008h1.OUT_VARIANCE, c12246a.m9327e());
        }
        Set<InterfaceC13562z0> m9327e2 = c12246a.m9327e();
        if (m9327e2 == null) {
            m9327e2 = C13739x0.m3832a(interfaceC13562z0);
        }
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (mo5206d == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
        while (true) {
            InterfaceC13562z0 interfaceC13562z03 = (InterfaceC13562z0) mo5206d;
            if (!m9327e2.contains(interfaceC13562z03)) {
                List<AbstractC12965b0> upperBounds2 = interfaceC13562z03.getUpperBounds();
                l.e(upperBounds2, "current.upperBounds");
                AbstractC12965b0 abstractC12965b02 = (AbstractC12965b0) C13722p.m3954R(upperBounds2);
                if (abstractC12965b02.mo5779W0().mo5206d() instanceof InterfaceC13312e) {
                    l.e(abstractC12965b02, "nextUpperBound");
                    return C13090a.m5889r(abstractC12965b02, m6342g, linkedHashMap, EnumC13008h1.OUT_VARIANCE, c12246a.m9327e());
                }
                mo5206d = abstractC12965b02.mo5779W0().mo5206d();
                if (mo5206d == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                }
            } else {
                return interfaceC11756a.invoke();
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC12965b0 m9303c(InterfaceC13562z0 interfaceC13562z0, boolean z, C12246a c12246a, InterfaceC11756a interfaceC11756a, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC11756a = new C12252a(interfaceC13562z0);
        }
        return m9304b(interfaceC13562z0, z, c12246a, interfaceC11756a);
    }

    /* renamed from: d */
    public static final InterfaceC13131v0 m9302d(InterfaceC13562z0 interfaceC13562z0, C12246a c12246a) {
        l.f(interfaceC13562z0, "typeParameter");
        l.f(c12246a, "attr");
        if (c12246a.m9328d() == EnumC12143k.SUPERTYPE) {
            return new C13135x0(C13104o0.m5857a(interfaceC13562z0));
        }
        return new C13094n0(interfaceC13562z0);
    }

    /* renamed from: e */
    public static final C12246a m9301e(EnumC12143k enumC12143k, boolean z, InterfaceC13562z0 interfaceC13562z0) {
        l.f(enumC12143k, "<this>");
        return new C12246a(enumC12143k, null, z, interfaceC13562z0 == null ? null : C13739x0.m3832a(interfaceC13562z0), 2, null);
    }

    /* renamed from: f */
    public static /* synthetic */ C12246a m9300f(EnumC12143k enumC12143k, boolean z, InterfaceC13562z0 interfaceC13562z0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            interfaceC13562z0 = null;
        }
        return m9301e(enumC12143k, z, interfaceC13562z0);
    }
}
