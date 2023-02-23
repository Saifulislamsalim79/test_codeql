package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13410k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13416m;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13445y;
/* compiled from: suspendFunctionTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.b.l */
/* loaded from: classes3.dex */
public final class C12061l {

    /* renamed from: a */
    private static final C13445y f26874a;

    /* renamed from: b */
    private static final C13445y f26875b;

    static {
        List<InterfaceC13562z0> m3901b;
        List<InterfaceC13562z0> m3901b2;
        InterfaceC13305c0 m5804q = C13118t.m5804q();
        l.e(m5804q, "getErrorModule()");
        C13445y c13445y = new C13445y(new C13416m(m5804q, C12059k.f26802e), EnumC13319f.INTERFACE, false, false, C12059k.f26803f.m7377g(), InterfaceC13545u0.f29903a, C12928f.f28984e);
        c13445y.m4964X0(EnumC13560z.ABSTRACT);
        c13445y.m4961Z0(C13530t.f29892e);
        m3901b = C13724q.m3901b(C13410k0.m5145c1(c13445y, InterfaceC13346g.f29516s.m5317b(), false, EnumC13008h1.IN_VARIANCE, C12614f.m7349i("T"), 0, C12928f.f28984e));
        c13445y.m4963Y0(m3901b);
        c13445y.m4966V0();
        f26874a = c13445y;
        InterfaceC13305c0 m5804q2 = C13118t.m5804q();
        l.e(m5804q2, "getErrorModule()");
        C13445y c13445y2 = new C13445y(new C13416m(m5804q2, C12059k.f26801d), EnumC13319f.INTERFACE, false, false, C12059k.f26804g.m7377g(), InterfaceC13545u0.f29903a, C12928f.f28984e);
        c13445y2.m4964X0(EnumC13560z.ABSTRACT);
        c13445y2.m4961Z0(C13530t.f29892e);
        m3901b2 = C13724q.m3901b(C13410k0.m5145c1(c13445y2, InterfaceC13346g.f29516s.m5317b(), false, EnumC13008h1.IN_VARIANCE, C12614f.m7349i("T"), 0, C12928f.f28984e));
        c13445y2.m4963Y0(m3901b2);
        c13445y2.m4966V0();
        f26875b = c13445y2;
    }

    /* renamed from: a */
    public static final boolean m9827a(C12609c c12609c, boolean z) {
        if (z) {
            return l.b(c12609c, C12059k.f26804g);
        }
        return l.b(c12609c, C12059k.f26803f);
    }

    /* renamed from: b */
    public static final AbstractC13010i0 m9826b(AbstractC12965b0 abstractC12965b0, boolean z) {
        int m3867o;
        InterfaceC13125t0 mo4649n;
        List m3901b;
        List m3783o0;
        AbstractC13010i0 m9951a;
        l.f(abstractC12965b0, "suspendFunType");
        boolean m9937o = C12045g.m9937o(abstractC12965b0);
        if (C13668y.f30115a && !m9937o) {
            throw new AssertionError(l.m("This type should be suspend function type: ", abstractC12965b0));
        }
        AbstractC12046h m5899h = C13090a.m5899h(abstractC12965b0);
        InterfaceC13346g mo4956y = abstractC12965b0.mo4956y();
        AbstractC12965b0 m9944h = C12045g.m9944h(abstractC12965b0);
        List<InterfaceC13131v0> m9942j = C12045g.m9942j(abstractC12965b0);
        m3867o = C13728s.m3867o(m9942j, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13131v0 interfaceC13131v0 : m9942j) {
            arrayList.add(interfaceC13131v0.mo5758c());
        }
        C12969c0 c12969c0 = C12969c0.f29026a;
        InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
        if (z) {
            mo4649n = f26875b.mo4649n();
        } else {
            mo4649n = f26874a.mo4649n();
        }
        InterfaceC13125t0 interfaceC13125t0 = mo4649n;
        l.e(interfaceC13125t0, "if (isReleaseCoroutines) FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.typeConstructor\n                    else FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.typeConstructor");
        m3901b = C13724q.m3901b(C13090a.m5906a(C12045g.m9943i(abstractC12965b0)));
        m3783o0 = C13742z.m3783o0(arrayList, C12969c0.m6309i(m5317b, interfaceC13125t0, m3901b, false, null, 16, null));
        AbstractC13010i0 m9924I = C13090a.m5899h(abstractC12965b0).m9924I();
        l.e(m9924I, "suspendFunType.builtIns.nullableAnyType");
        m9951a = C12045g.m9951a(m5899h, mo4956y, m9944h, m3783o0, null, m9924I, (r14 & 64) != 0 ? false : false);
        return m9951a.mo5826d1(abstractC12965b0.mo5778X0());
    }
}
