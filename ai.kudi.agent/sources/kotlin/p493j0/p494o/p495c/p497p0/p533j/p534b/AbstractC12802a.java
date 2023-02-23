package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12802a implements InterfaceC13372j0 {

    /* renamed from: a */
    private final InterfaceC12954n f28701a;

    /* renamed from: b */
    private final InterfaceC12904s f28702b;

    /* renamed from: c */
    private final InterfaceC13305c0 f28703c;

    /* renamed from: d */
    protected C12889j f28704d;

    /* renamed from: e */
    private final InterfaceC12947h<C12609c, InterfaceC13320f0> f28705e;

    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.a$a */
    /* loaded from: classes3.dex */
    static final class C12803a extends AbstractC11802m implements InterfaceC11767l<C12609c, InterfaceC13320f0> {
        C12803a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13320f0 invoke(C12609c c12609c) {
            l.f(c12609c, "fqName");
            AbstractC12895n mo6737d = AbstractC12802a.this.mo6737d(c12609c);
            if (mo6737d == null) {
                return null;
            }
            mo6737d.mo6463W0(AbstractC12802a.this.m6736e());
            return mo6737d;
        }
    }

    public AbstractC12802a(InterfaceC12954n interfaceC12954n, InterfaceC12904s interfaceC12904s, InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC12904s, "finder");
        l.f(interfaceC13305c0, "moduleDescriptor");
        this.f28701a = interfaceC12954n;
        this.f28702b = interfaceC12904s;
        this.f28703c = interfaceC13305c0;
        this.f28705e = interfaceC12954n.mo6362i(new C12803a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: a */
    public List<InterfaceC13320f0> mo5172a(C12609c c12609c) {
        List<InterfaceC13320f0> m3887i;
        l.f(c12609c, "fqName");
        m3887i = C13726r.m3887i(this.f28705e.invoke(c12609c));
        return m3887i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: b */
    public void mo5171b(C12609c c12609c, Collection<InterfaceC13320f0> collection) {
        l.f(c12609c, "fqName");
        l.f(collection, "packageFragments");
        C13634a.m4287a(collection, this.f28705e.invoke(c12609c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: c */
    public boolean mo5170c(C12609c c12609c) {
        InterfaceC13513m mo6737d;
        l.f(c12609c, "fqName");
        if (this.f28705e.mo6377k(c12609c)) {
            mo6737d = (InterfaceC13320f0) this.f28705e.invoke(c12609c);
        } else {
            mo6737d = mo6737d(c12609c);
        }
        return mo6737d == null;
    }

    /* renamed from: d */
    protected abstract AbstractC12895n mo6737d(C12609c c12609c);

    /* renamed from: e */
    protected final C12889j m6736e() {
        C12889j c12889j = this.f28704d;
        if (c12889j != null) {
            return c12889j;
        }
        l.u("components");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final InterfaceC12904s m6735f() {
        return this.f28702b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final InterfaceC13305c0 m6734g() {
        return this.f28703c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final InterfaceC12954n m6733h() {
        return this.f28701a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m6732i(C12889j c12889j) {
        l.f(c12889j, "<set-?>");
        this.f28704d = c12889j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: t */
    public Collection<C12609c> mo5169t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        Set m3831b;
        l.f(c12609c, "fqName");
        l.f(interfaceC11767l, "nameFilter");
        m3831b = C13741y0.m3831b();
        return m3831b;
    }
}
