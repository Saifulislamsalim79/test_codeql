package kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13068d;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.i.q.a.a */
/* loaded from: classes3.dex */
public final class C12699a extends AbstractC13010i0 implements InterfaceC13068d {

    /* renamed from: d */
    private final InterfaceC13131v0 f28561d;

    /* renamed from: e */
    private final InterfaceC12700b f28562e;

    /* renamed from: f */
    private final boolean f28563f;

    /* renamed from: w */
    private final InterfaceC13346g f28564w;

    public /* synthetic */ C12699a(InterfaceC13131v0 interfaceC13131v0, InterfaceC12700b interfaceC12700b, boolean z, InterfaceC13346g interfaceC13346g, int i, g gVar) {
        this(interfaceC13131v0, (i & 2) != 0 ? new C12701c(interfaceC13131v0) : interfaceC12700b, (i & 4) != 0 ? false : z, (i & 8) != 0 ? InterfaceC13346g.f29516s.m5317b() : interfaceC13346g);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: V0 */
    public List<InterfaceC13131v0> mo5780V0() {
        List<InterfaceC13131v0> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return this.f28563f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: f1 */
    public InterfaceC12700b mo5779W0() {
        return this.f28562e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: g1 */
    public C12699a mo5826d1(boolean z) {
        return z == mo5778X0() ? this : new C12699a(this.f28561d, mo5779W0(), z, mo4956y());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: h1 */
    public C12699a mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        InterfaceC13131v0 mo5759b = this.f28561d.mo5759b(abstractC13026h);
        l.e(mo5759b, "typeProjection.refine(kotlinTypeRefiner)");
        return new C12699a(mo5759b, mo5779W0(), mo5778X0(), mo4956y());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: i1 */
    public C12699a mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C12699a(this.f28561d, mo5779W0(), mo5778X0(), interfaceC13346g);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f28561d);
        sb.append(')');
        sb.append(mo5778X0() ? "?" : "");
        return sb.toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: u */
    public InterfaceC12777h mo5775u() {
        InterfaceC12777h m5812i = C13118t.m5812i("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        l.e(m5812i, "createErrorScope(\n            \"No member resolution should be done on captured type, it used only during constraint system resolution\", true\n        )");
        return m5812i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f28564w;
    }

    public C12699a(InterfaceC13131v0 interfaceC13131v0, InterfaceC12700b interfaceC12700b, boolean z, InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13131v0, "typeProjection");
        l.f(interfaceC12700b, "constructor");
        l.f(interfaceC13346g, "annotations");
        this.f28561d = interfaceC13131v0;
        this.f28562e = interfaceC12700b;
        this.f28563f = z;
        this.f28564w = interfaceC13346g;
    }
}
