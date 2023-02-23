package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.j0.o.c.p0.l.n */
/* loaded from: classes3.dex */
public abstract class AbstractC13093n extends AbstractC13088m {

    /* renamed from: d */
    private final AbstractC13010i0 f29166d;

    public AbstractC13093n(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        this.f29166d = abstractC13010i0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        return z == mo5778X0() ? this : mo5884f1().mo5826d1(z).mo5825e1(mo4956y());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: f1 */
    protected AbstractC13010i0 mo5884f1() {
        return this.f29166d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: i1 */
    public AbstractC13093n mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return interfaceC13346g != mo4956y() ? new C13006h(this, interfaceC13346g) : this;
    }
}
