package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0;

import java.util.Collection;
import java.util.List;
import kotlin.C13250l;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.InterfaceC12179l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12210h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12923a;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.g */
/* loaded from: classes3.dex */
public final class C12172g implements InterfaceC13372j0 {

    /* renamed from: a */
    private final C12174h f27149a;

    /* renamed from: b */
    private final InterfaceC12923a<C12609c, C12210h> f27150b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.g$a */
    /* loaded from: classes3.dex */
    public static final class C12173a extends AbstractC11802m implements InterfaceC11756a<C12210h> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC12292u f27152d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12173a(InterfaceC12292u interfaceC12292u) {
            super(0);
            this.f27152d = interfaceC12292u;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12210h invoke() {
            return new C12210h(C12172g.this.f27149a, this.f27152d);
        }
    }

    public C12172g(C12165c c12165c) {
        InterfaceC11824h m5553c;
        l.f(c12165c, "components");
        InterfaceC12179l.C12180a c12180a = InterfaceC12179l.C12180a.f27165a;
        m5553c = C13250l.m5553c(null);
        C12174h c12174h = new C12174h(c12165c, c12180a, m5553c);
        this.f27149a = c12174h;
        this.f27150b = c12174h.m9534e().mo6369b();
    }

    /* renamed from: e */
    private final C12210h m9541e(C12609c c12609c) {
        InterfaceC12292u mo4929b = this.f27149a.m9538a().m9570d().mo4929b(c12609c);
        if (mo4929b == null) {
            return null;
        }
        return this.f27150b.mo6399a(c12609c, new C12173a(mo4929b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: a */
    public List<C12210h> mo5172a(C12609c c12609c) {
        List<C12210h> m3887i;
        l.f(c12609c, "fqName");
        m3887i = C13726r.m3887i(m9541e(c12609c));
        return m3887i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: b */
    public void mo5171b(C12609c c12609c, Collection<InterfaceC13320f0> collection) {
        l.f(c12609c, "fqName");
        l.f(collection, "packageFragments");
        C13634a.m4287a(collection, m9541e(c12609c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: c */
    public boolean mo5170c(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return this.f27149a.m9538a().m9570d().mo4929b(c12609c) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: f */
    public List<C12609c> mo5169t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List<C12609c> m3891e;
        l.f(c12609c, "fqName");
        l.f(interfaceC11767l, "nameFilter");
        C12210h m9541e = m9541e(c12609c);
        List<C12609c> m9408Z0 = m9541e == null ? null : m9541e.m9408Z0();
        if (m9408Z0 != null) {
            return m9408Z0;
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }
}
