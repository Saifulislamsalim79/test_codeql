package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: mappingUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.j */
/* loaded from: classes3.dex */
public final class C12109j {
    /* renamed from: a */
    public static final AbstractC13127u0 m9688a(InterfaceC13312e interfaceC13312e, InterfaceC13312e interfaceC13312e2) {
        int m3867o;
        int m3867o2;
        List m3815I0;
        Map m3872t;
        l.f(interfaceC13312e, "from");
        l.f(interfaceC13312e2, "to");
        boolean z = interfaceC13312e.mo4975B().size() == interfaceC13312e2.mo4975B().size();
        if (C13668y.f30115a && !z) {
            throw new AssertionError(interfaceC13312e + " and " + interfaceC13312e2 + " should have same number of type parameters, but " + interfaceC13312e.mo4975B().size() + " / " + interfaceC13312e2.mo4975B().size() + " found");
        }
        AbstractC13127u0.C13128a c13128a = AbstractC13127u0.f29209b;
        List<InterfaceC13562z0> mo4975B = interfaceC13312e.mo4975B();
        l.e(mo4975B, "from.declaredTypeParameters");
        m3867o = C13728s.m3867o(mo4975B, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13562z0 interfaceC13562z0 : mo4975B) {
            arrayList.add(interfaceC13562z0.mo4649n());
        }
        List<InterfaceC13562z0> mo4975B2 = interfaceC13312e2.mo4975B();
        l.e(mo4975B2, "to.declaredTypeParameters");
        m3867o2 = C13728s.m3867o(mo4975B2, 10);
        ArrayList arrayList2 = new ArrayList(m3867o2);
        for (InterfaceC13562z0 interfaceC13562z02 : mo4975B2) {
            AbstractC13010i0 mo5010x = interfaceC13562z02.mo5010x();
            l.e(mo5010x, "it.defaultType");
            arrayList2.add(C13090a.m5906a(mo5010x));
        }
        m3815I0 = C13742z.m3815I0(arrayList, arrayList2);
        m3872t = C13727r0.m3872t(m3815I0);
        return AbstractC13127u0.C13128a.m5782e(c13128a, m3872t, false, 2, null);
    }
}
