package kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a;

import java.util.Collection;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13030k;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.j0.o.c.p0.i.q.a.c */
/* loaded from: classes3.dex */
public final class C12701c implements InterfaceC12700b {

    /* renamed from: a */
    private final InterfaceC13131v0 f28565a;

    /* renamed from: b */
    private C13030k f28566b;

    public C12701c(InterfaceC13131v0 interfaceC13131v0) {
        l.f(interfaceC13131v0, "projection");
        this.f28565a = interfaceC13131v0;
        boolean z = mo6088f().mo5760a() != EnumC13008h1.INVARIANT;
        if (C13668y.f30115a && !z) {
            throw new AssertionError(l.m("Only nontrivial projections can be captured, not: ", mo6088f()));
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: a */
    public Collection<AbstractC12965b0> mo5218a() {
        AbstractC12965b0 m9924I;
        List m3901b;
        if (mo6088f().mo5760a() == EnumC13008h1.OUT_VARIANCE) {
            m9924I = mo6088f().mo5758c();
        } else {
            m9924I = mo5199s().m9924I();
        }
        l.e(m9924I, "if (projection.projectionKind == Variance.OUT_VARIANCE)\n            projection.type\n        else\n            builtIns.nullableAnyType");
        m3901b = C13724q.m3901b(m9924I);
        return m3901b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: c */
    public List<InterfaceC13562z0> mo5207c() {
        List<InterfaceC13562z0> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC13334h mo5206d() {
        return (InterfaceC13334h) m6932g();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: e */
    public boolean mo5205e() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p524q.p525a.InterfaceC12700b
    /* renamed from: f */
    public InterfaceC13131v0 mo6088f() {
        return this.f28565a;
    }

    /* renamed from: g */
    public Void m6932g() {
        return null;
    }

    /* renamed from: h */
    public final C13030k m6931h() {
        return this.f28566b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: i */
    public C12701c mo5217b(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        InterfaceC13131v0 mo5759b = mo6088f().mo5759b(abstractC13026h);
        l.e(mo5759b, "projection.refine(kotlinTypeRefiner)");
        return new C12701c(mo5759b);
    }

    /* renamed from: j */
    public final void m6929j(C13030k c13030k) {
        this.f28566b = c13030k;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
    /* renamed from: s */
    public AbstractC12046h mo5199s() {
        AbstractC12046h mo5199s = mo6088f().mo5758c().mo5779W0().mo5199s();
        l.e(mo5199s, "projection.type.constructor.builtIns");
        return mo5199s;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo6088f() + ')';
    }
}
