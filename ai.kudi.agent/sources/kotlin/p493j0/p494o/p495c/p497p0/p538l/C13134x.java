package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.l.x */
/* loaded from: classes3.dex */
public final class C13134x extends AbstractC13130v implements InterfaceC12978d1 {

    /* renamed from: f */
    private final AbstractC13130v f29216f;

    /* renamed from: w */
    private final AbstractC12965b0 f29217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13134x(AbstractC13130v abstractC13130v, AbstractC12965b0 abstractC12965b0) {
        super(abstractC13130v.m5777e1(), abstractC13130v.m5776f1());
        l.f(abstractC13130v, "origin");
        l.f(abstractC12965b0, "enhancement");
        this.f29216f = abstractC13130v;
        this.f29217w = abstractC12965b0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12978d1
    /* renamed from: N */
    public AbstractC12965b0 mo5770N() {
        return this.f29217w;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: a1 */
    public AbstractC13005g1 mo5767a1(boolean z) {
        return C12983e1.m6247d(mo5769N0().mo5767a1(z), mo5770N().mo6202Z0().mo5767a1(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: c1 */
    public AbstractC13005g1 mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return C12983e1.m6247d(mo5769N0().mo5765c1(interfaceC13346g), mo5770N());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: d1 */
    public AbstractC13010i0 mo5764d1() {
        return mo5769N0().mo5764d1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: g1 */
    public String mo5763g1(AbstractC12624c abstractC12624c, InterfaceC12650f interfaceC12650f) {
        l.f(abstractC12624c, "renderer");
        l.f(interfaceC12650f, "options");
        if (interfaceC12650f.mo7119f()) {
            return abstractC12624c.mo7190w(mo5770N());
        }
        return mo5769N0().mo5763g1(abstractC12624c, interfaceC12650f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12978d1
    /* renamed from: h1 */
    public AbstractC13130v mo5769N0() {
        return this.f29216f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: i1 */
    public C13134x mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13130v mo5769N0 = mo5769N0();
        abstractC13026h.mo6099g(mo5769N0);
        AbstractC12965b0 mo5770N = mo5770N();
        abstractC13026h.mo6099g(mo5770N);
        return new C13134x(mo5769N0, mo5770N);
    }
}
