package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13739x0;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: JavaToKotlinClassMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.d */
/* loaded from: classes3.dex */
public final class C12082d {

    /* renamed from: a */
    public static final C12082d f26941a = new C12082d();

    private C12082d() {
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC13312e m9752h(C12082d c12082d, C12609c c12609c, AbstractC12046h abstractC12046h, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return c12082d.m9753g(c12609c, abstractC12046h, num);
    }

    /* renamed from: a */
    public final InterfaceC13312e m9759a(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "mutable");
        C12609c m9765p = C12080c.f26925a.m9765p(C12673d.m7022m(interfaceC13312e));
        if (m9765p != null) {
            InterfaceC13312e m9880o = C12747a.m6863g(interfaceC13312e).m9880o(m9765p);
            l.e(m9880o, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return m9880o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC13312e + " is not a mutable collection");
    }

    /* renamed from: b */
    public final InterfaceC13312e m9758b(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "readOnly");
        C12609c m9764q = C12080c.f26925a.m9764q(C12673d.m7022m(interfaceC13312e));
        if (m9764q != null) {
            InterfaceC13312e m9880o = C12747a.m6863g(interfaceC13312e).m9880o(m9764q);
            l.e(m9880o, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return m9880o;
        }
        throw new IllegalArgumentException("Given class " + interfaceC13312e + " is not a read-only collection");
    }

    /* renamed from: c */
    public final boolean m9757c(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "mutable");
        return C12080c.f26925a.m9769l(C12673d.m7022m(interfaceC13312e));
    }

    /* renamed from: d */
    public final boolean m9756d(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
        InterfaceC13312e m6296f = C12974c1.m6296f(abstractC12965b0);
        return m6296f != null && m9757c(m6296f);
    }

    /* renamed from: e */
    public final boolean m9755e(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "readOnly");
        return C12080c.f26925a.m9768m(C12673d.m7022m(interfaceC13312e));
    }

    /* renamed from: f */
    public final boolean m9754f(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
        InterfaceC13312e m6296f = C12974c1.m6296f(abstractC12965b0);
        return m6296f != null && m9755e(m6296f);
    }

    /* renamed from: g */
    public final InterfaceC13312e m9753g(C12609c c12609c, AbstractC12046h abstractC12046h, Integer num) {
        C12608b m9767n;
        l.f(c12609c, "fqName");
        l.f(abstractC12046h, "builtIns");
        if (num == null || !l.b(c12609c, C12080c.f26925a.m9772i())) {
            m9767n = C12080c.f26925a.m9767n(c12609c);
        } else {
            C12059k c12059k = C12059k.f26798a;
            m9767n = C12059k.m9838a(num.intValue());
        }
        if (m9767n != null) {
            return abstractC12046h.m9880o(m9767n.m7395b());
        }
        return null;
    }

    /* renamed from: i */
    public final Collection<InterfaceC13312e> m9751i(C12609c c12609c, AbstractC12046h abstractC12046h) {
        List m3888h;
        Set m3832a;
        Set m3831b;
        l.f(c12609c, "fqName");
        l.f(abstractC12046h, "builtIns");
        InterfaceC13312e m9752h = m9752h(this, c12609c, abstractC12046h, null, 4, null);
        if (m9752h == null) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        C12609c m9764q = C12080c.f26925a.m9764q(C12747a.m6860j(m9752h));
        if (m9764q == null) {
            m3832a = C13739x0.m3832a(m9752h);
            return m3832a;
        }
        InterfaceC13312e m9880o = abstractC12046h.m9880o(m9764q);
        l.e(m9880o, "builtIns.getBuiltInClassByFqName(kotlinMutableAnalogFqName)");
        m3888h = C13726r.m3888h(m9752h, m9880o);
        return m3888h;
    }
}
