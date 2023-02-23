package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C13664u;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12740v;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13352j;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: functionTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.b.g */
/* loaded from: classes3.dex */
public final class C12045g {
    /* renamed from: a */
    public static final AbstractC13010i0 m9951a(AbstractC12046h abstractC12046h, InterfaceC13346g interfaceC13346g, AbstractC12965b0 abstractC12965b0, List<? extends AbstractC12965b0> list, List<C12614f> list2, AbstractC12965b0 abstractC12965b02, boolean z) {
        l.f(abstractC12046h, "builtIns");
        l.f(interfaceC13346g, "annotations");
        l.f(list, "parameterTypes");
        l.f(abstractC12965b02, "returnType");
        List<InterfaceC13131v0> m9947e = m9947e(abstractC12965b0, list, list2, abstractC12965b02, abstractC12046h);
        int size = list.size();
        if (abstractC12965b0 != null) {
            size++;
        }
        InterfaceC13312e m9948d = m9948d(abstractC12046h, size, z);
        if (abstractC12965b0 != null) {
            interfaceC13346g = m9935q(interfaceC13346g, abstractC12046h);
        }
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6311g(interfaceC13346g, m9948d, m9947e);
    }

    /* renamed from: c */
    public static final C12614f m9949c(AbstractC12965b0 abstractC12965b0) {
        String mo6905b;
        l.f(abstractC12965b0, "<this>");
        InterfaceC13340c mo5302r = abstractC12965b0.mo4956y().mo5302r(C12059k.C12060a.f26865r);
        if (mo5302r == null) {
            return null;
        }
        Object m3916r0 = C13722p.m3916r0(mo5302r.mo5312a().values());
        C12740v c12740v = m3916r0 instanceof C12740v ? (C12740v) m3916r0 : null;
        if (c12740v == null || (mo6905b = c12740v.mo6905b()) == null || !C12614f.m7347m(mo6905b)) {
            mo6905b = null;
        }
        if (mo6905b == null) {
            return null;
        }
        return C12614f.m7349i(mo6905b);
    }

    /* renamed from: d */
    public static final InterfaceC13312e m9948d(AbstractC12046h abstractC12046h, int i, boolean z) {
        l.f(abstractC12046h, "builtIns");
        InterfaceC13312e m9911W = z ? abstractC12046h.m9911W(i) : abstractC12046h.m9930C(i);
        l.e(m9911W, "if (isSuspendFunction) builtIns.getSuspendFunction(parameterCount) else builtIns.getFunction(parameterCount)");
        return m9911W;
    }

    /* renamed from: e */
    public static final List<InterfaceC13131v0> m9947e(AbstractC12965b0 abstractC12965b0, List<? extends AbstractC12965b0> list, List<C12614f> list2, AbstractC12965b0 abstractC12965b02, AbstractC12046h abstractC12046h) {
        C12614f c12614f;
        Map m3897g;
        List<? extends InterfaceC13340c> m3785m0;
        l.f(list, "parameterTypes");
        l.f(abstractC12965b02, "returnType");
        l.f(abstractC12046h, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + (abstractC12965b0 != null ? 1 : 0) + 1);
        C13634a.m4287a(arrayList, abstractC12965b0 == null ? null : C13090a.m5906a(abstractC12965b0));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC12965b0 abstractC12965b03 = (AbstractC12965b0) obj;
                if (list2 == null || (c12614f = list2.get(i)) == null || c12614f.m7348j()) {
                    c12614f = null;
                }
                if (c12614f != null) {
                    C12609c c12609c = C12059k.C12060a.f26865r;
                    C12614f m7349i = C12614f.m7349i("name");
                    String m7353b = c12614f.m7353b();
                    l.e(m7353b, "name.asString()");
                    m3897g = C13725q0.m3897g(C13664u.m4227a(m7349i, new C12740v(m7353b)));
                    C13352j c13352j = new C13352j(abstractC12046h, c12609c, m3897g);
                    InterfaceC13346g.C13347a c13347a = InterfaceC13346g.f29516s;
                    m3785m0 = C13742z.m3785m0(abstractC12965b03.mo4956y(), c13352j);
                    abstractC12965b03 = C13090a.m5890q(abstractC12965b03, c13347a.m5318a(m3785m0));
                }
                arrayList.add(C13090a.m5906a(abstractC12965b03));
                i = i2;
            } else {
                C13722p.m3923n();
                throw null;
            }
        }
        arrayList.add(C13090a.m5906a(abstractC12965b02));
        return arrayList;
    }

    /* renamed from: f */
    public static final EnumC12069c m9946f(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        if ((interfaceC13513m instanceof InterfaceC13312e) && AbstractC12046h.m9860y0(interfaceC13513m)) {
            return m9945g(C12747a.m6860j(interfaceC13513m));
        }
        return null;
    }

    /* renamed from: g */
    private static final EnumC12069c m9945g(C12610d c12610d) {
        if (!c12610d.m7367f() || c12610d.m7368e()) {
            return null;
        }
        EnumC12069c.C12070a c12070a = EnumC12069c.f26909e;
        String m7353b = c12610d.m7364i().m7353b();
        l.e(m7353b, "shortName().asString()");
        C12609c m7379e = c12610d.m7361l().m7379e();
        l.e(m7379e, "toSafe().parent()");
        return c12070a.m9794b(m7353b, m7379e);
    }

    /* renamed from: h */
    public static final AbstractC12965b0 m9944h(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        boolean m9939m = m9939m(abstractC12965b0);
        if (!C13668y.f30115a || m9939m) {
            if (m9936p(abstractC12965b0)) {
                return ((InterfaceC13131v0) C13722p.m3954R(abstractC12965b0.mo5780V0())).mo5758c();
            }
            return null;
        }
        throw new AssertionError(l.m("Not a function type: ", abstractC12965b0));
    }

    /* renamed from: i */
    public static final AbstractC12965b0 m9943i(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        boolean m9939m = m9939m(abstractC12965b0);
        if (!C13668y.f30115a || m9939m) {
            AbstractC12965b0 mo5758c = ((InterfaceC13131v0) C13722p.m3943c0(abstractC12965b0.mo5780V0())).mo5758c();
            l.e(mo5758c, "arguments.last().type");
            return mo5758c;
        }
        throw new AssertionError(l.m("Not a function type: ", abstractC12965b0));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* renamed from: j */
    public static final List<InterfaceC13131v0> m9942j(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        boolean m9939m = m9939m(abstractC12965b0);
        if (!C13668y.f30115a || m9939m) {
            List<InterfaceC13131v0> mo5780V0 = abstractC12965b0.mo5780V0();
            ?? m9941k = m9941k(abstractC12965b0);
            int size = mo5780V0.size() - 1;
            boolean z = m9941k <= size;
            if (!C13668y.f30115a || z) {
                return mo5780V0.subList(m9941k == true ? 1 : 0, size);
            }
            throw new AssertionError(l.m("Not an exact function type: ", abstractC12965b0));
        }
        throw new AssertionError(l.m("Not a function type: ", abstractC12965b0));
    }

    /* renamed from: k */
    public static final boolean m9941k(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return m9939m(abstractC12965b0) && m9936p(abstractC12965b0);
    }

    /* renamed from: l */
    public static final boolean m9940l(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        EnumC12069c m9946f = m9946f(interfaceC13513m);
        return m9946f == EnumC12069c.Function || m9946f == EnumC12069c.SuspendFunction;
    }

    /* renamed from: m */
    public static final boolean m9939m(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        return l.b(mo5206d == null ? null : Boolean.valueOf(m9940l(mo5206d)), Boolean.TRUE);
    }

    /* renamed from: n */
    public static final boolean m9938n(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        return (mo5206d == null ? null : m9946f(mo5206d)) == EnumC12069c.Function;
    }

    /* renamed from: o */
    public static final boolean m9937o(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        return (mo5206d == null ? null : m9946f(mo5206d)) == EnumC12069c.SuspendFunction;
    }

    /* renamed from: p */
    private static final boolean m9936p(AbstractC12965b0 abstractC12965b0) {
        return abstractC12965b0.mo4956y().mo5302r(C12059k.C12060a.f26864q) != null;
    }

    /* renamed from: q */
    public static final InterfaceC13346g m9935q(InterfaceC13346g interfaceC13346g, AbstractC12046h abstractC12046h) {
        Map m3881k;
        List<? extends InterfaceC13340c> m3785m0;
        l.f(interfaceC13346g, "<this>");
        l.f(abstractC12046h, "builtIns");
        if (interfaceC13346g.mo5304Q(C12059k.C12060a.f26864q)) {
            return interfaceC13346g;
        }
        InterfaceC13346g.C13347a c13347a = InterfaceC13346g.f29516s;
        C12609c c12609c = C12059k.C12060a.f26864q;
        m3881k = C13727r0.m3881k();
        m3785m0 = C13742z.m3785m0(interfaceC13346g, new C13352j(abstractC12046h, c12609c, m3881k));
        return c13347a.m5318a(m3785m0);
    }
}
