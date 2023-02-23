package kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.EnumC13066b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13068d;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: NewCapturedType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.j1.j */
/* loaded from: classes3.dex */
public final class C13029j extends AbstractC13010i0 implements InterfaceC13068d {

    /* renamed from: d */
    private final EnumC13066b f29111d;

    /* renamed from: e */
    private final C13030k f29112e;

    /* renamed from: f */
    private final AbstractC13005g1 f29113f;

    /* renamed from: w */
    private final InterfaceC13346g f29114w;

    /* renamed from: x */
    private final boolean f29115x;

    /* renamed from: y */
    private final boolean f29116y;

    public /* synthetic */ C13029j(EnumC13066b enumC13066b, C13030k c13030k, AbstractC13005g1 abstractC13005g1, InterfaceC13346g interfaceC13346g, boolean z, boolean z2, int i, g gVar) {
        this(enumC13066b, c13030k, abstractC13005g1, (i & 8) != 0 ? InterfaceC13346g.f29516s.m5317b() : interfaceC13346g, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.f29115x;
    }

    /* renamed from: f1 */
    public final EnumC13066b m6095f1() {
        return this.f29111d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: g1 */
    public C13030k mo5779W0() {
        return this.f29112e;
    }

    /* renamed from: h1 */
    public final AbstractC13005g1 m6093h1() {
        return this.f29113f;
    }

    /* renamed from: i1 */
    public final boolean m6092i1() {
        return this.f29116y;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: j1 */
    public C13029j mo5826d1(boolean z) {
        return new C13029j(this.f29111d, mo5779W0(), this.f29113f, mo4956y(), z, false, 32, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: k1 */
    public C13029j mo5766b1(AbstractC13026h abstractC13026h) {
        AbstractC13005g1 mo6202Z0;
        l.f(abstractC13026h, "kotlinTypeRefiner");
        EnumC13066b enumC13066b = this.f29111d;
        C13030k mo5217b = mo5779W0().mo5217b(abstractC13026h);
        AbstractC13005g1 abstractC13005g1 = this.f29113f;
        if (abstractC13005g1 == null) {
            mo6202Z0 = null;
        } else {
            abstractC13026h.mo6099g(abstractC13005g1);
            mo6202Z0 = abstractC13005g1.mo6202Z0();
        }
        return new C13029j(enumC13066b, mo5217b, mo6202Z0, mo4956y(), mo5778X0(), false, 32, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: l1 */
    public C13029j mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C13029j(this.f29111d, mo5779W0(), this.f29113f, interfaceC13346g, mo5778X0(), false, 32, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: u */
    public InterfaceC12777h mo5775u() {
        InterfaceC12777h m5812i = C13118t.m5812i("No member resolution should be done on captured type!", true);
        l.e(m5812i, "createErrorScope(\"No member resolution should be done on captured type!\", true)");
        return m5812i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f29114w;
    }

    public C13029j(EnumC13066b enumC13066b, C13030k c13030k, AbstractC13005g1 abstractC13005g1, InterfaceC13346g interfaceC13346g, boolean z, boolean z2) {
        l.f(enumC13066b, "captureStatus");
        l.f(c13030k, "constructor");
        l.f(interfaceC13346g, "annotations");
        this.f29111d = enumC13066b;
        this.f29112e = c13030k;
        this.f29113f = abstractC13005g1;
        this.f29114w = interfaceC13346g;
        this.f29115x = z;
        this.f29116y = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13029j(EnumC13066b enumC13066b, AbstractC13005g1 abstractC13005g1, InterfaceC13131v0 interfaceC13131v0, InterfaceC13562z0 interfaceC13562z0) {
        this(enumC13066b, new C13030k(interfaceC13131v0, null, null, interfaceC13562z0, 6, null), abstractC13005g1, null, false, false, 56, null);
        l.f(enumC13066b, "captureStatus");
        l.f(interfaceC13131v0, "projection");
        l.f(interfaceC13562z0, "typeParameter");
    }
}
