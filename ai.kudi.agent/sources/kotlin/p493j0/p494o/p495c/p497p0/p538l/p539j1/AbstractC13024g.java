package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.C12701c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12730p;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12956a0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12983e1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.EnumC13066b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13073i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: KotlinTypePreparator.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC13024g {

    /* compiled from: KotlinTypePreparator.kt */
    /* renamed from: kotlin.j0.o.c.p0.l.j1.g$a */
    /* loaded from: classes3.dex */
    public static final class C13025a extends AbstractC13024g {

        /* renamed from: a */
        public static final C13025a f29108a = new C13025a();

        private C13025a() {
        }
    }

    /* renamed from: b */
    private final AbstractC13010i0 m6106b(AbstractC13010i0 abstractC13010i0) {
        int m3867o;
        int m3867o2;
        List m3891e;
        AbstractC12965b0 mo5758c;
        int m3867o3;
        InterfaceC13125t0 mo5779W0 = abstractC13010i0.mo5779W0();
        boolean z = false;
        C12956a0 c12956a0 = null;
        r5 = null;
        AbstractC13005g1 mo6202Z0 = null;
        if (mo5779W0 instanceof C12701c) {
            C12701c c12701c = (C12701c) mo5779W0;
            InterfaceC13131v0 mo6088f = c12701c.mo6088f();
            if (!(mo6088f.mo5760a() == EnumC13008h1.IN_VARIANCE)) {
                mo6088f = null;
            }
            if (mo6088f != null && (mo5758c = mo6088f.mo5758c()) != null) {
                mo6202Z0 = mo5758c.mo6202Z0();
            }
            AbstractC13005g1 abstractC13005g1 = mo6202Z0;
            if (c12701c.m6931h() == null) {
                InterfaceC13131v0 mo6088f2 = c12701c.mo6088f();
                Collection<AbstractC12965b0> mo5218a = c12701c.mo5218a();
                m3867o3 = C13728s.m3867o(mo5218a, 10);
                ArrayList arrayList = new ArrayList(m3867o3);
                for (AbstractC12965b0 abstractC12965b0 : mo5218a) {
                    arrayList.add(abstractC12965b0.mo6202Z0());
                }
                c12701c.m6929j(new C13030k(mo6088f2, arrayList, null, 4, null));
            }
            EnumC13066b enumC13066b = EnumC13066b.FOR_SUBTYPING;
            C13030k m6931h = c12701c.m6931h();
            l.d(m6931h);
            return new C13029j(enumC13066b, m6931h, abstractC13005g1, abstractC13010i0.mo4956y(), abstractC13010i0.mo5778X0(), false, 32, null);
        } else if (mo5779W0 instanceof C12730p) {
            Collection<AbstractC12965b0> mo5218a2 = ((C12730p) mo5779W0).mo5218a();
            m3867o2 = C13728s.m3867o(mo5218a2, 10);
            ArrayList arrayList2 = new ArrayList(m3867o2);
            for (AbstractC12965b0 abstractC12965b02 : mo5218a2) {
                AbstractC12965b0 m6286p = C12974c1.m6286p(abstractC12965b02, abstractC13010i0.mo5778X0());
                l.e(m6286p, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(m6286p);
            }
            C12956a0 c12956a02 = new C12956a0(arrayList2);
            C12969c0 c12969c0 = C12969c0.f29026a;
            InterfaceC13346g mo4956y = abstractC13010i0.mo4956y();
            m3891e = C13726r.m3891e();
            return C12969c0.m6308j(mo4956y, c12956a02, m3891e, false, abstractC13010i0.mo5775u());
        } else if ((mo5779W0 instanceof C12956a0) && abstractC13010i0.mo5778X0()) {
            C12956a0 c12956a03 = (C12956a0) mo5779W0;
            Collection<AbstractC12965b0> mo5218a3 = c12956a03.mo5218a();
            m3867o = C13728s.m3867o(mo5218a3, 10);
            ArrayList arrayList3 = new ArrayList(m3867o);
            for (AbstractC12965b0 abstractC12965b03 : mo5218a3) {
                arrayList3.add(C13090a.m5891p(abstractC12965b03));
                z = true;
            }
            if (z) {
                AbstractC12965b0 m6353i = c12956a03.m6353i();
                c12956a0 = new C12956a0(arrayList3).m6350l(m6353i != null ? C13090a.m5891p(m6353i) : null);
            }
            if (c12956a0 != null) {
                c12956a03 = c12956a0;
            }
            return c12956a03.m6354h();
        } else {
            return abstractC13010i0;
        }
    }

    /* renamed from: a */
    public AbstractC13005g1 m6107a(InterfaceC13073i interfaceC13073i) {
        AbstractC13005g1 m6314d;
        l.f(interfaceC13073i, "type");
        if (interfaceC13073i instanceof AbstractC12965b0) {
            AbstractC13005g1 mo6202Z0 = ((AbstractC12965b0) interfaceC13073i).mo6202Z0();
            if (mo6202Z0 instanceof AbstractC13010i0) {
                m6314d = m6106b((AbstractC13010i0) mo6202Z0);
            } else if (mo6202Z0 instanceof AbstractC13130v) {
                AbstractC13130v abstractC13130v = (AbstractC13130v) mo6202Z0;
                AbstractC13010i0 m6106b = m6106b(abstractC13130v.m5777e1());
                AbstractC13010i0 m6106b2 = m6106b(abstractC13130v.m5776f1());
                if (m6106b == abstractC13130v.m5777e1() && m6106b2 == abstractC13130v.m5776f1()) {
                    m6314d = mo6202Z0;
                } else {
                    C12969c0 c12969c0 = C12969c0.f29026a;
                    m6314d = C12969c0.m6314d(m6106b, m6106b2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return C12983e1.m6249b(m6314d, mo6202Z0);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
