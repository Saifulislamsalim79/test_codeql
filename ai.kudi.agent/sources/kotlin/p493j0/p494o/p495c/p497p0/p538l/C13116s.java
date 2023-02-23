package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ErrorType.kt */
/* renamed from: kotlin.j0.o.c.p0.l.s */
/* loaded from: classes3.dex */
public class C13116s extends AbstractC13010i0 {

    /* renamed from: d */
    private final InterfaceC13125t0 f29192d;

    /* renamed from: e */
    private final InterfaceC12777h f29193e;

    /* renamed from: f */
    private final List<InterfaceC13131v0> f29194f;

    /* renamed from: w */
    private final boolean f29195w;

    /* renamed from: x */
    private final String f29196x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13116s(InterfaceC13125t0 interfaceC13125t0, InterfaceC12777h interfaceC12777h) {
        this(interfaceC13125t0, interfaceC12777h, null, false, null, 28, null);
        l.f(interfaceC13125t0, "constructor");
        l.f(interfaceC12777h, "memberScope");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13116s(InterfaceC13125t0 interfaceC13125t0, InterfaceC12777h interfaceC12777h, List<? extends InterfaceC13131v0> list, boolean z) {
        this(interfaceC13125t0, interfaceC12777h, list, z, null, 16, null);
        l.f(interfaceC13125t0, "constructor");
        l.f(interfaceC12777h, "memberScope");
        l.f(list, "arguments");
    }

    public /* synthetic */ C13116s(InterfaceC13125t0 interfaceC13125t0, InterfaceC12777h interfaceC12777h, List list, boolean z, String str, int i, g gVar) {
        this(interfaceC13125t0, interfaceC12777h, (i & 4) != 0 ? C13726r.m3891e() : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "???" : str);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: V0 */
    public List<InterfaceC13131v0> mo5780V0() {
        return this.f29194f;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: W0 */
    public InterfaceC13125t0 mo5779W0() {
        return this.f29192d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return this.f29195w;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: c1 */
    public /* bridge */ /* synthetic */ AbstractC13005g1 mo5765c1(InterfaceC13346g interfaceC13346g) {
        mo5825e1(interfaceC13346g);
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: d1 */
    public AbstractC13010i0 mo5767a1(boolean z) {
        return new C13116s(mo5779W0(), mo5775u(), mo5780V0(), z, null, 16, null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    /* renamed from: e1 */
    public AbstractC13010i0 mo5825e1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return this;
    }

    /* renamed from: f1 */
    public String mo5824f1() {
        return this.f29196x;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: g1 */
    public C13116s mo5766b1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5779W0());
        sb.append(mo5780V0().isEmpty() ? "" : C13742z.m3798Z(mo5780V0(), ", ", "<", ">", -1, "...", null));
        return sb.toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: u */
    public InterfaceC12777h mo5775u() {
        return this.f29193e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return InterfaceC13346g.f29516s.m5317b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13116s(InterfaceC13125t0 interfaceC13125t0, InterfaceC12777h interfaceC12777h, List<? extends InterfaceC13131v0> list, boolean z, String str) {
        l.f(interfaceC13125t0, "constructor");
        l.f(interfaceC12777h, "memberScope");
        l.f(list, "arguments");
        l.f(str, "presentableName");
        this.f29192d = interfaceC13125t0;
        this.f29193e = interfaceC12777h;
        this.f29194f = list;
        this.f29195w = z;
        this.f29196x = str;
    }
}
