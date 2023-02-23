package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13742z;
/* compiled from: PackageFragmentProviderImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0 */
/* loaded from: classes3.dex */
public final class C13335h0 implements InterfaceC13372j0 {

    /* renamed from: a */
    private final Collection<InterfaceC13320f0> f29492a;

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0$a */
    /* loaded from: classes3.dex */
    static final class C13336a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13320f0, C12609c> {

        /* renamed from: c */
        public static final C13336a f29493c = new C13336a();

        C13336a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final C12609c invoke(InterfaceC13320f0 interfaceC13320f0) {
            kotlin.e0.d.l.f(interfaceC13320f0, "it");
            return interfaceC13320f0.mo4954f();
        }
    }

    /* compiled from: PackageFragmentProviderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h0$b */
    /* loaded from: classes3.dex */
    static final class C13337b extends AbstractC11802m implements InterfaceC11767l<C12609c, Boolean> {

        /* renamed from: c */
        final /* synthetic */ C12609c f29494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13337b(C12609c c12609c) {
            super(1);
            this.f29494c = c12609c;
        }

        /* renamed from: a */
        public final boolean m5327a(C12609c c12609c) {
            kotlin.e0.d.l.f(c12609c, "it");
            return !c12609c.m7380d() && kotlin.e0.d.l.b(c12609c.m7379e(), this.f29494c);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(C12609c c12609c) {
            return Boolean.valueOf(m5327a(c12609c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13335h0(Collection<? extends InterfaceC13320f0> collection) {
        kotlin.e0.d.l.f(collection, "packageFragments");
        this.f29492a = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: a */
    public List<InterfaceC13320f0> mo5172a(C12609c c12609c) {
        kotlin.e0.d.l.f(c12609c, "fqName");
        Collection<InterfaceC13320f0> collection = this.f29492a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.e0.d.l.b(((InterfaceC13320f0) obj).mo4954f(), c12609c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: b */
    public void mo5171b(C12609c c12609c, Collection<InterfaceC13320f0> collection) {
        kotlin.e0.d.l.f(c12609c, "fqName");
        kotlin.e0.d.l.f(collection, "packageFragments");
        for (Object obj : this.f29492a) {
            if (kotlin.e0.d.l.b(((InterfaceC13320f0) obj).mo4954f(), c12609c)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: c */
    public boolean mo5170c(C12609c c12609c) {
        kotlin.e0.d.l.f(c12609c, "fqName");
        Collection<InterfaceC13320f0> collection = this.f29492a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (InterfaceC13320f0 interfaceC13320f0 : collection) {
            if (kotlin.e0.d.l.b(interfaceC13320f0.mo4954f(), c12609c)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: t */
    public Collection<C12609c> mo5169t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5569r;
        InterfaceC13230h m5574m;
        List m5563x;
        kotlin.e0.d.l.f(c12609c, "fqName");
        kotlin.e0.d.l.f(interfaceC11767l, "nameFilter");
        m3818H = C13742z.m3818H(this.f29492a);
        m5569r = C13242n.m5569r(m3818H, C13336a.f29493c);
        m5574m = C13242n.m5574m(m5569r, new C13337b(c12609c));
        m5563x = C13242n.m5563x(m5574m);
        return m5563x;
    }
}
