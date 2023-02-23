package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j0 */
/* loaded from: classes3.dex */
public final class C13013j0 extends AbstractC13010i0 {

    /* renamed from: d */
    private final InterfaceC13125t0 f29093d;

    /* renamed from: e */
    private final List<InterfaceC13131v0> f29094e;

    /* renamed from: f */
    private final boolean f29095f;

    /* renamed from: w */
    private final InterfaceC12777h f29096w;

    /* renamed from: x */
    private final InterfaceC11767l<AbstractC13026h, AbstractC13010i0> f29097x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13013j0(InterfaceC13125t0 interfaceC13125t0, List<? extends InterfaceC13131v0> list, boolean z, InterfaceC12777h interfaceC12777h, InterfaceC11767l<? super AbstractC13026h, ? extends AbstractC13010i0> interfaceC11767l) {
        l.f(interfaceC13125t0, "constructor");
        l.f(list, "arguments");
        l.f(interfaceC12777h, "memberScope");
        l.f(interfaceC11767l, "refinedTypeFactory");
        this.f29093d = interfaceC13125t0;
        this.f29094e = list;
        this.f29095f = z;
        this.f29096w = interfaceC12777h;
        this.f29097x = interfaceC11767l;
        if (mo5775u() instanceof C13118t.C13122d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo5775u() + '\n' + mo5779W0());
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: V0 */
    public List<InterfaceC13131v0> mo5780V0() {
        return this.f29094e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: W0 */
    public InterfaceC13125t0 mo5779W0() {
        return this.f29093d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return this.f29095f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        if (z == mo5778X0()) {
            return this;
        }
        if (z) {
            return new C13004g0(this);
        }
        return new C12991f0(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: e1 */
    public AbstractC13010i0 mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return interfaceC13346g.isEmpty() ? this : new C13006h(this, interfaceC13346g);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: f1 */
    public AbstractC13010i0 mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        AbstractC13010i0 invoke = this.f29097x.invoke(abstractC13026h);
        return invoke == null ? this : invoke;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: u */
    public InterfaceC12777h mo5775u() {
        return this.f29096w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return InterfaceC13346g.f29516s.m5317b();
    }
}
