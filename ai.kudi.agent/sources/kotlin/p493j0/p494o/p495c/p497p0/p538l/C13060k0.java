package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeWithEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.l.k0 */
/* loaded from: classes3.dex */
public final class C13060k0 extends AbstractC13088m implements InterfaceC12978d1 {

    /* renamed from: d */
    private final AbstractC13010i0 f29149d;

    /* renamed from: e */
    private final AbstractC12965b0 f29150e;

    public C13060k0(AbstractC13010i0 abstractC13010i0, AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC13010i0, "delegate");
        l.f(abstractC12965b0, "enhancement");
        this.f29149d = abstractC13010i0;
        this.f29150e = abstractC12965b0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12978d1
    /* renamed from: N */
    public AbstractC12965b0 mo5770N() {
        return this.f29150e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC12978d1
    /* renamed from: N0 */
    public AbstractC13005g1 mo5769N0() {
        return mo5884f1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        return (AbstractC13010i0) C12983e1.m6247d(mo5769N0().mo5767a1(z), mo5770N().mo6202Z0().mo5767a1(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: e1 */
    public AbstractC13010i0 mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return (AbstractC13010i0) C12983e1.m6247d(mo5769N0().mo5765c1(interfaceC13346g), mo5770N());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: f1 */
    protected AbstractC13010i0 mo5884f1() {
        return this.f29149d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: i1 */
    public C13060k0 mo5908g1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13010i0 mo5884f1 = mo5884f1();
        abstractC13026h.mo6099g(mo5884f1);
        AbstractC12965b0 mo5770N = mo5770N();
        abstractC13026h.mo6099g(mo5770N);
        return new C13060k0(mo5884f1, mo5770N);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: j1 */
    public C13060k0 mo5907h1(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        return new C13060k0(abstractC13010i0, mo5770N());
    }
}
