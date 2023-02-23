package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12763b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12775g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13361i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.r */
/* loaded from: classes3.dex */
public class C13431r extends AbstractC13405j implements InterfaceC13448k0 {

    /* renamed from: z */
    static final /* synthetic */ InterfaceC11872i<Object>[] f29766z = {C11813x.m10312f(new C11808s(C11813x.m10316b(C13431r.class), "fragments", "getFragments()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C13431r.class), MPOSPaymentMethod.STATE_EMPTY, "getEmpty()Z"))};

    /* renamed from: e */
    private final C13442x f29767e;

    /* renamed from: f */
    private final C12609c f29768f;

    /* renamed from: w */
    private final InterfaceC12948i f29769w;

    /* renamed from: x */
    private final InterfaceC12948i f29770x;

    /* renamed from: y */
    private final InterfaceC12777h f29771y;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.r$a */
    /* loaded from: classes3.dex */
    static final class C13432a extends AbstractC11802m implements InterfaceC11756a<Boolean> {
        C13432a() {
            super(0);
        }

        /* renamed from: a */
        public final boolean m5021a() {
            return C13361i0.m5297b(C13431r.this.mo4952E0().m4989b1(), C13431r.this.mo4950f());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m5021a());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.r$b */
    /* loaded from: classes3.dex */
    static final class C13433b extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC13320f0>> {
        C13433b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<InterfaceC13320f0> invoke() {
            return C13361i0.m5296c(C13431r.this.mo4952E0().m4989b1(), C13431r.this.mo4950f());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.r$c */
    /* loaded from: classes3.dex */
    static final class C13434c extends AbstractC11802m implements InterfaceC11756a<InterfaceC12777h> {
        C13434c() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC12777h invoke() {
            int m3867o;
            List m3783o0;
            if (C13431r.this.isEmpty()) {
                return InterfaceC12777h.C12780b.f28671b;
            }
            List<InterfaceC13320f0> mo4951O = C13431r.this.mo4951O();
            m3867o = C13728s.m3867o(mo4951O, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13320f0 interfaceC13320f0 : mo4951O) {
                arrayList.add(interfaceC13320f0.mo5125u());
            }
            m3783o0 = C13742z.m3783o0(arrayList, new C13402h0(C13431r.this.mo4952E0(), C13431r.this.mo4950f()));
            C12763b.C12764a c12764a = C12763b.f28629d;
            return c12764a.m6814a("package view scope for " + C13431r.this.mo4950f() + " in " + C13431r.this.mo4952E0().mo5012b(), m3783o0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13431r(C13442x c13442x, C12609c c12609c, InterfaceC12954n interfaceC12954n) {
        super(InterfaceC13346g.f29516s.m5317b(), c12609c.m7376h());
        l.f(c13442x, "module");
        l.f(c12609c, "fqName");
        l.f(interfaceC12954n, "storageManager");
        this.f29767e = c13442x;
        this.f29768f = c12609c;
        this.f29769w = interfaceC12954n.mo6367d(new C13433b());
        this.f29770x = interfaceC12954n.mo6367d(new C13432a());
        this.f29771y = new C12775g(interfaceC12954n, new C13434c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: N0 */
    public InterfaceC13448k0 mo4687d() {
        if (mo4950f().m7380d()) {
            return null;
        }
        C13442x mo4952E0 = mo4952E0();
        C12609c m7379e = mo4950f().m7379e();
        l.e(m7379e, "fqName.parent()");
        return mo4952E0.mo4996V(m7379e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0
    /* renamed from: O */
    public List<InterfaceC13320f0> mo4951O() {
        return (List) C12953m.m6372a(this.f29769w, this, f29766z[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        l.f(interfaceC13517o, "visitor");
        return interfaceC13517o.mo4761c(this, d);
    }

    /* renamed from: U0 */
    protected final boolean m5023U0() {
        return ((Boolean) C12953m.m6372a(this.f29770x, this, f29766z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0
    /* renamed from: V0 */
    public C13442x mo4952E0() {
        return this.f29767e;
    }

    public boolean equals(Object obj) {
        InterfaceC13448k0 interfaceC13448k0 = obj instanceof InterfaceC13448k0 ? (InterfaceC13448k0) obj : null;
        return interfaceC13448k0 != null && l.b(mo4950f(), interfaceC13448k0.mo4950f()) && l.b(mo4952E0(), interfaceC13448k0.mo4952E0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0
    /* renamed from: f */
    public C12609c mo4950f() {
        return this.f29768f;
    }

    public int hashCode() {
        return (mo4952E0().hashCode() * 31) + mo4950f().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0
    public boolean isEmpty() {
        return m5023U0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0
    /* renamed from: u */
    public InterfaceC12777h mo4949u() {
        return this.f29771y;
    }
}
