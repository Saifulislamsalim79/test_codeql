package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: SpecialTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.a */
/* loaded from: classes3.dex */
public final class C12955a extends AbstractC13088m {

    /* renamed from: d */
    private final AbstractC13010i0 f29011d;

    /* renamed from: e */
    private final AbstractC13010i0 f29012e;

    public C12955a(AbstractC13010i0 abstractC13010i0, AbstractC13010i0 abstractC13010i02) {
        l.f(abstractC13010i0, "delegate");
        l.f(abstractC13010i02, "abbreviation");
        this.f29011d = abstractC13010i0;
        this.f29012e = abstractC13010i02;
    }

    /* renamed from: e0 */
    public final AbstractC13010i0 m6361e0() {
        return mo5884f1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: f1 */
    protected AbstractC13010i0 mo5884f1() {
        return this.f29011d;
    }

    /* renamed from: i1 */
    public final AbstractC13010i0 m6360i1() {
        return this.f29012e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: j1 */
    public C12955a mo5826d1(boolean z) {
        return new C12955a(mo5884f1().mo5826d1(z), this.f29012e.mo5826d1(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: k1 */
    public C12955a mo5908g1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13010i0 mo5884f1 = mo5884f1();
        abstractC13026h.mo6099g(mo5884f1);
        AbstractC13010i0 abstractC13010i0 = this.f29012e;
        abstractC13026h.mo6099g(abstractC13010i0);
        return new C12955a(mo5884f1, abstractC13010i0);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: l1 */
    public C12955a mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C12955a(mo5884f1().mo5825e1(interfaceC13346g), this.f29012e);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: m1 */
    public C12955a mo5907h1(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        return new C12955a(abstractC13010i0, this.f29012e);
    }
}
