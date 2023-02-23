package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12237k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13412l0;
/* compiled from: util.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.c0.h */
/* loaded from: classes3.dex */
public final class C12158h {
    /* renamed from: a */
    public static final List<InterfaceC13307c1> m9591a(Collection<C12159i> collection, Collection<? extends InterfaceC13307c1> collection2, InterfaceC13293a interfaceC13293a) {
        List<C13287o> m3815I0;
        int m3867o;
        l.f(collection, "newValueParametersTypes");
        l.f(collection2, "oldValueParameters");
        l.f(interfaceC13293a, "newOwner");
        boolean z = collection.size() == collection2.size();
        if (C13668y.f30115a && !z) {
            throw new AssertionError("Different value parameters sizes: Enhanced = " + collection.size() + ", Old = " + collection2.size());
        }
        m3815I0 = C13742z.m3815I0(collection, collection2);
        m3867o = C13728s.m3867o(m3815I0, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C13287o c13287o : m3815I0) {
            C12159i c12159i = (C12159i) c13287o.m5366a();
            InterfaceC13307c1 interfaceC13307c1 = (InterfaceC13307c1) c13287o.m5365b();
            int mo5133h = interfaceC13307c1.mo5133h();
            InterfaceC13346g mo4956y = interfaceC13307c1.mo4956y();
            C12614f mo5012b = interfaceC13307c1.mo5012b();
            l.e(mo5012b, "oldParameter.name");
            AbstractC12965b0 m9588b = c12159i.m9588b();
            boolean m9589a = c12159i.m9589a();
            boolean mo5132l0 = interfaceC13307c1.mo5132l0();
            boolean mo5134g0 = interfaceC13307c1.mo5134g0();
            AbstractC12965b0 m9888k = interfaceC13307c1.mo5131v0() != null ? C12747a.m6858l(interfaceC13293a).mo4979s().m9888k(c12159i.m9588b()) : null;
            InterfaceC13545u0 mo4745m = interfaceC13307c1.mo4745m();
            l.e(mo4745m, "oldParameter.source");
            arrayList.add(new C13412l0(interfaceC13293a, null, mo5133h, mo4956y, mo5012b, m9588b, m9589a, mo5132l0, mo5134g0, m9888k, mo4745m));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C12237k m9590b(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "<this>");
        InterfaceC13312e m6854p = C12747a.m6854p(interfaceC13312e);
        if (m6854p == null) {
            return null;
        }
        InterfaceC12777h mo4960a0 = m6854p.mo4960a0();
        C12237k c12237k = mo4960a0 instanceof C12237k ? (C12237k) mo4960a0 : null;
        return c12237k == null ? m9590b(m6854p) : c12237k;
    }
}
