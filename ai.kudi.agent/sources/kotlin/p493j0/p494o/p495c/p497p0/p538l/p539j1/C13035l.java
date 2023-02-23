package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13127u0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13024g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.EnumC13066b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.l */
/* loaded from: classes3.dex */
public final class C13035l {
    /* renamed from: a */
    private static final List<InterfaceC13131v0> m6078a(AbstractC13005g1 abstractC13005g1, EnumC13066b enumC13066b) {
        boolean z;
        List<C13287o> m3815I0;
        int m3867o;
        if (abstractC13005g1.mo5780V0().size() != abstractC13005g1.mo5779W0().mo5207c().size()) {
            return null;
        }
        List<InterfaceC13131v0> mo5780V0 = abstractC13005g1.mo5780V0();
        int i = 0;
        boolean z2 = true;
        if (!(mo5780V0 instanceof Collection) || !mo5780V0.isEmpty()) {
            Iterator<T> it = mo5780V0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((InterfaceC13131v0) it.next()).mo5760a() == EnumC13008h1.INVARIANT) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        List<InterfaceC13562z0> mo5207c = abstractC13005g1.mo5779W0().mo5207c();
        l.e(mo5207c, "type.constructor.parameters");
        m3815I0 = C13742z.m3815I0(mo5780V0, mo5207c);
        m3867o = C13728s.m3867o(m3815I0, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C13287o c13287o : m3815I0) {
            InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) c13287o.m5366a();
            InterfaceC13562z0 interfaceC13562z0 = (InterfaceC13562z0) c13287o.m5365b();
            if (interfaceC13131v0.mo5760a() != EnumC13008h1.INVARIANT) {
                AbstractC13005g1 mo6202Z0 = (interfaceC13131v0.mo5757d() || interfaceC13131v0.mo5760a() != EnumC13008h1.IN_VARIANCE) ? null : interfaceC13131v0.mo5758c().mo6202Z0();
                l.e(interfaceC13562z0, "parameter");
                interfaceC13131v0 = C13090a.m5906a(new C13029j(enumC13066b, mo6202Z0, interfaceC13131v0, interfaceC13562z0));
            }
            arrayList.add(interfaceC13131v0);
        }
        C12959a1 m5750c = AbstractC13127u0.f29209b.m5785b(abstractC13005g1.mo5779W0(), arrayList).m5750c();
        int size = mo5780V0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                InterfaceC13131v0 interfaceC13131v02 = mo5780V0.get(i);
                InterfaceC13131v0 interfaceC13131v03 = (InterfaceC13131v0) arrayList.get(i);
                if (interfaceC13131v02.mo5760a() != EnumC13008h1.INVARIANT) {
                    List<AbstractC12965b0> upperBounds = abstractC13005g1.mo5779W0().mo5207c().get(i).getUpperBounds();
                    l.e(upperBounds, "type.constructor.parameters[index].upperBounds");
                    ArrayList arrayList2 = new ArrayList();
                    for (AbstractC12965b0 abstractC12965b0 : upperBounds) {
                        arrayList2.add(AbstractC13024g.C13025a.f29108a.m6107a(m5750c.m6335n(abstractC12965b0, EnumC13008h1.INVARIANT).mo6202Z0()));
                    }
                    if (!interfaceC13131v02.mo5757d() && interfaceC13131v02.mo5760a() == EnumC13008h1.OUT_VARIANCE) {
                        arrayList2.add(AbstractC13024g.C13025a.f29108a.m6107a(interfaceC13131v02.mo5758c().mo6202Z0()));
                    }
                    ((C13029j) interfaceC13131v03.mo5758c()).mo5779W0().m6084j(arrayList2);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final AbstractC13010i0 m6077b(AbstractC13010i0 abstractC13010i0, EnumC13066b enumC13066b) {
        l.f(abstractC13010i0, "type");
        l.f(enumC13066b, TransactionField.STATUS);
        List<InterfaceC13131v0> m6078a = m6078a(abstractC13010i0, enumC13066b);
        if (m6078a == null) {
            return null;
        }
        return m6076c(abstractC13010i0, m6078a);
    }

    /* renamed from: c */
    private static final AbstractC13010i0 m6076c(AbstractC13005g1 abstractC13005g1, List<? extends InterfaceC13131v0> list) {
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6309i(abstractC13005g1.mo4956y(), abstractC13005g1.mo5779W0(), list, abstractC13005g1.mo5778X0(), null, 16, null);
    }
}
