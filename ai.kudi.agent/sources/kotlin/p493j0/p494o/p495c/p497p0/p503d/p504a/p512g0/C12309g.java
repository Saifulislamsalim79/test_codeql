package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12983e1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.g */
/* loaded from: classes3.dex */
public final class C12309g extends AbstractC13088m implements InterfaceC13012j {

    /* renamed from: d */
    private final AbstractC13010i0 f27358d;

    public C12309g(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        this.f27358d = abstractC13010i0;
    }

    /* renamed from: i1 */
    private final AbstractC13010i0 m9236i1(AbstractC13010i0 abstractC13010i0) {
        AbstractC13010i0 mo5826d1 = abstractC13010i0.mo5826d1(false);
        return !C13090a.m5893n(abstractC13010i0) ? mo5826d1 : new C12309g(mo5826d1);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: R */
    public AbstractC12965b0 mo5774R(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "replacement");
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (C13090a.m5893n(mo6202Z0) || C12974c1.m6290l(mo6202Z0)) {
            if (mo6202Z0 instanceof AbstractC13010i0) {
                return m9236i1((AbstractC13010i0) mo6202Z0);
            }
            if (mo6202Z0 instanceof AbstractC13130v) {
                C12969c0 c12969c0 = C12969c0.f29026a;
                AbstractC13130v abstractC13130v = (AbstractC13130v) mo6202Z0;
                return C12983e1.m6247d(C12969c0.m6314d(m9236i1(abstractC13130v.m5777e1()), m9236i1(abstractC13130v.m5776f1())), C12983e1.m6250a(mo6202Z0));
            }
            throw new IllegalStateException(l.m("Incorrect type: ", mo6202Z0).toString());
        }
        return mo6202Z0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m, kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13012j
    /* renamed from: b */
    public boolean mo5773b() {
        return true;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        return z ? mo5884f1().mo5826d1(true) : this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: f1 */
    protected AbstractC13010i0 mo5884f1() {
        return this.f27358d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: j1 */
    public C12309g mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C12309g(mo5884f1().mo5825e1(interfaceC13346g));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: k1 */
    public C12309g mo5907h1(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        return new C12309g(abstractC13010i0);
    }
}
