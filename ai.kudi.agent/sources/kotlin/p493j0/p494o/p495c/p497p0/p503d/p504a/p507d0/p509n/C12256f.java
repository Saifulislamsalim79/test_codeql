package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13007h0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: RawType.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.f */
/* loaded from: classes3.dex */
public final class C12256f extends AbstractC13130v implements InterfaceC13007h0 {

    /* compiled from: RawType.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.n.f$a */
    /* loaded from: classes3.dex */
    static final class C12257a extends AbstractC11802m implements InterfaceC11767l<String, CharSequence> {

        /* renamed from: c */
        public static final C12257a f27326c = new C12257a();

        C12257a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public final CharSequence invoke(String str) {
            l.f(str, "it");
            return l.m("(raw) ", str);
        }
    }

    private C12256f(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02, boolean z) {
        super(abstractC13010i0, abstractC13010i02);
        if (z) {
            return;
        }
        boolean mo6071d = InterfaceC13022f.f29107a.mo6071d(abstractC13010i0, abstractC13010i02);
        if (!C13668y.f30115a || mo6071d) {
            return;
        }
        throw new AssertionError("Lower bound " + abstractC13010i0 + " of a flexible type must be a subtype of the upper bound " + abstractC13010i02);
    }

    /* renamed from: j1 */
    private static final boolean m9288j1(String str, String str2) {
        String m5390k0;
        m5390k0 = C13277t.m5390k0(str2, "out ");
        return l.b(str, m5390k0) || l.b(str2, "*");
    }

    /* renamed from: k1 */
    private static final List<String> m9287k1(AbstractC12624c abstractC12624c, AbstractC12965b0 abstractC12965b0) {
        int m3867o;
        List<InterfaceC13131v0> mo5780V0 = abstractC12965b0.mo5780V0();
        m3867o = C13728s.m3867o(mo5780V0, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (InterfaceC13131v0 interfaceC13131v0 : mo5780V0) {
            arrayList.add(abstractC12624c.mo7187x(interfaceC13131v0));
        }
        return arrayList;
    }

    /* renamed from: l1 */
    private static final String m9286l1(String str, String str2) {
        boolean m5423I;
        String m5424H0;
        String m5430E0;
        m5423I = C13277t.m5423I(str, '<', false, 2, null);
        if (m5423I) {
            StringBuilder sb = new StringBuilder();
            m5424H0 = C13277t.m5424H0(str, '<', null, 2, null);
            sb.append(m5424H0);
            sb.append('<');
            sb.append(str2);
            sb.append('>');
            m5430E0 = C13277t.m5430E0(str, '>', null, 2, null);
            sb.append(m5430E0);
            return sb.toString();
        }
        return str;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: d1 */
    public AbstractC13010i0 mo5764d1() {
        return m5777e1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: g1 */
    public String mo5763g1(AbstractC12624c abstractC12624c, InterfaceC12650f interfaceC12650f) {
        String m3797a0;
        List m3815I0;
        l.f(abstractC12624c, "renderer");
        l.f(interfaceC12650f, "options");
        String mo7190w = abstractC12624c.mo7190w(m5777e1());
        String mo7190w2 = abstractC12624c.mo7190w(m5776f1());
        if (interfaceC12650f.mo7103n()) {
            return "raw (" + mo7190w + ".." + mo7190w2 + ')';
        } else if (m5776f1().mo5780V0().isEmpty()) {
            return abstractC12624c.mo7199t(mo7190w, mo7190w2, C13090a.m5899h(this));
        } else {
            List<String> m9287k1 = m9287k1(abstractC12624c, m5777e1());
            List<String> m9287k12 = m9287k1(abstractC12624c, m5776f1());
            m3797a0 = C13742z.m3797a0(m9287k1, ", ", null, null, 0, null, C12257a.f27326c, 30, null);
            m3815I0 = C13742z.m3815I0(m9287k1, m9287k12);
            boolean z = true;
            if (!(m3815I0 instanceof Collection) || !m3815I0.isEmpty()) {
                Iterator it = m3815I0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C13287o c13287o = (C13287o) it.next();
                    if (!m9288j1((String) c13287o.m5364c(), (String) c13287o.m5363d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                mo7190w2 = m9286l1(mo7190w2, m3797a0);
            }
            String m9286l1 = m9286l1(mo7190w, m3797a0);
            return l.b(m9286l1, mo7190w2) ? m9286l1 : abstractC12624c.mo7199t(m9286l1, mo7190w2, C13090a.m5899h(this));
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: h1 */
    public C12256f mo5767a1(boolean z) {
        return new C12256f(m5777e1().mo5826d1(z), m5776f1().mo5826d1(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: i1 */
    public AbstractC13130v mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13010i0 m5777e1 = m5777e1();
        abstractC13026h.mo6099g(m5777e1);
        AbstractC13010i0 m5776f1 = m5776f1();
        abstractC13026h.mo6099g(m5776f1);
        return new C12256f(m5777e1, m5776f1, true);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: m1 */
    public C12256f mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C12256f(m5777e1().mo5825e1(interfaceC13346g), m5776f1().mo5825e1(interfaceC13346g));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v, kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: u */
    public InterfaceC12777h mo5775u() {
        InterfaceC13334h mo5206d = mo5779W0().mo5206d();
        InterfaceC13312e interfaceC13312e = mo5206d instanceof InterfaceC13312e ? (InterfaceC13312e) mo5206d : null;
        if (interfaceC13312e != null) {
            InterfaceC12777h mo5011k0 = interfaceC13312e.mo5011k0(C12253e.f27319b);
            l.e(mo5011k0, "classDescriptor.getMemberScope(RawSubstitution)");
            return mo5011k0;
        }
        throw new IllegalStateException(l.m("Incorrect classifier: ", mo5779W0().mo5206d()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12256f(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02) {
        this(abstractC13010i0, abstractC13010i02, false);
        l.f(abstractC13010i0, "lowerBound");
        l.f(abstractC13010i02, "upperBound");
    }
}
