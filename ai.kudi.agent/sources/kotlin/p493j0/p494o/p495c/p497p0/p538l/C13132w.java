package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.C13668y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: flexibleTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.w */
/* loaded from: classes3.dex */
public final class C13132w extends AbstractC13130v implements InterfaceC13012j {

    /* renamed from: w */
    public static boolean f29214w;

    /* renamed from: f */
    private boolean f29215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13132w(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02) {
        super(abstractC13010i0, abstractC13010i02);
        l.f(abstractC13010i0, "lowerBound");
        l.f(abstractC13010i02, "upperBound");
    }

    /* renamed from: i1 */
    private final void m5771i1() {
        if (!f29214w || this.f29215f) {
            return;
        }
        this.f29215f = true;
        boolean z = !C13136y.m5754b(m5777e1());
        if (C13668y.f30115a && !z) {
            throw new AssertionError(l.m("Lower bound of a flexible type can not be flexible: ", m5777e1()));
        }
        boolean z2 = !C13136y.m5754b(m5776f1());
        if (C13668y.f30115a && !z2) {
            throw new AssertionError(l.m("Upper bound of a flexible type can not be flexible: ", m5776f1()));
        }
        boolean b = true ^ l.b(m5777e1(), m5776f1());
        if (C13668y.f30115a && !b) {
            throw new AssertionError("Lower and upper bounds are equal: " + m5777e1() + " == " + m5776f1());
        }
        boolean mo6071d = InterfaceC13022f.f29107a.mo6071d(m5777e1(), m5776f1());
        if (!C13668y.f30115a || mo6071d) {
            return;
        }
        throw new AssertionError("Lower bound " + m5777e1() + " of a flexible type must be a subtype of the upper bound " + m5776f1());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: R */
    public AbstractC12965b0 mo5774R(AbstractC12965b0 abstractC12965b0) {
        AbstractC13005g1 m6314d;
        l.f(abstractC12965b0, "replacement");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            m6314d = mo6202Z0;
        } else if (!(mo6202Z0 instanceof AbstractC13010i0)) {
            throw new NoWhenBranchMatchedException();
        } else {
            C12969c0 c12969c0 = C12969c0.f29026a;
            AbstractC13010i0 abstractC13010i0 = (AbstractC13010i0) mo6202Z0;
            m6314d = C12969c0.m6314d(abstractC13010i0, abstractC13010i0.mo5826d1(true));
        }
        return C12983e1.m6249b(m6314d, mo6202Z0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: a1 */
    public AbstractC13005g1 mo5767a1(boolean z) {
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6314d(m5777e1().mo5826d1(z), m5776f1().mo5826d1(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: b */
    public boolean mo5773b() {
        return (m5777e1().mo5779W0().mo5206d() instanceof InterfaceC13562z0) && l.b(m5777e1().mo5779W0(), m5776f1().mo5779W0());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: c1 */
    public AbstractC13005g1 mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        C12969c0 c12969c0 = C12969c0.f29026a;
        return C12969c0.m6314d(m5777e1().mo5825e1(interfaceC13346g), m5776f1().mo5825e1(interfaceC13346g));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: d1 */
    public AbstractC13010i0 mo5764d1() {
        m5771i1();
        return m5777e1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: g1 */
    public String mo5763g1(AbstractC12624c abstractC12624c, InterfaceC12650f interfaceC12650f) {
        l.f(abstractC12624c, "renderer");
        l.f(interfaceC12650f, "options");
        if (interfaceC12650f.mo7103n()) {
            return '(' + abstractC12624c.mo7190w(m5777e1()) + ".." + abstractC12624c.mo7190w(m5776f1()) + ')';
        }
        return abstractC12624c.mo7199t(abstractC12624c.mo7190w(m5777e1()), abstractC12624c.mo7190w(m5776f1()), C13090a.m5899h(this));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: h1 */
    public AbstractC13130v mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13010i0 m5777e1 = m5777e1();
        abstractC13026h.mo6099g(m5777e1);
        AbstractC13010i0 m5776f1 = m5776f1();
        abstractC13026h.mo6099g(m5776f1);
        return new C13132w(m5777e1, m5776f1);
    }
}
