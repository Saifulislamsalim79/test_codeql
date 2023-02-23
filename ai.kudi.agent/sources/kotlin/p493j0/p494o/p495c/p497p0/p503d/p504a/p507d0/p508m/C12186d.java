package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.C12110a;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12782j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12953m;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p546n.C13177a;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13736w;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: JvmPackageScope.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.d */
/* loaded from: classes3.dex */
public final class C12186d implements InterfaceC12777h {

    /* renamed from: f */
    static final /* synthetic */ InterfaceC11872i<Object>[] f27174f = {C11813x.m10312f(new C11808s(C11813x.m10316b(C12186d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    private final C12174h f27175b;

    /* renamed from: c */
    private final C12210h f27176c;

    /* renamed from: d */
    private final C12215i f27177d;

    /* renamed from: e */
    private final InterfaceC12948i f27178e;

    /* compiled from: JvmPackageScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.d$a */
    /* loaded from: classes3.dex */
    static final class C12187a extends AbstractC11802m implements InterfaceC11756a<InterfaceC12777h[]> {
        C12187a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC12777h[] invoke() {
            Collection<InterfaceC12447o> values = C12186d.this.f27176c.m9410X0().values();
            C12186d c12186d = C12186d.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12447o interfaceC12447o : values) {
                InterfaceC12777h m8941c = c12186d.f27175b.m9538a().m9572b().m8941c(c12186d.f27176c, interfaceC12447o);
                if (m8941c != null) {
                    arrayList.add(m8941c);
                }
            }
            Object[] array = C13177a.m5708b(arrayList).toArray(new InterfaceC12777h[0]);
            if (array != null) {
                return (InterfaceC12777h[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public C12186d(C12174h c12174h, InterfaceC12292u interfaceC12292u, C12210h c12210h) {
        l.f(c12174h, "c");
        l.f(interfaceC12292u, "jPackage");
        l.f(c12210h, "packageFragment");
        this.f27175b = c12174h;
        this.f27176c = c12210h;
        this.f27177d = new C12215i(this.f27175b, interfaceC12292u, this.f27176c);
        this.f27178e = this.f27175b.m9534e().mo6367d(new C12187a());
    }

    /* renamed from: k */
    private final InterfaceC12777h[] m9509k() {
        return (InterfaceC12777h[]) C12953m.m6372a(this.f27178e, this, f27174f[0]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        Set m3831b;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m9508l(c12614f, interfaceC12112b);
        C12215i c12215i = this.f27177d;
        InterfaceC12777h[] m9509k = m9509k();
        Collection<? extends InterfaceC13543t0> mo5117a = c12215i.mo5117a(c12614f, interfaceC12112b);
        int length = m9509k.length;
        int i = 0;
        Collection collection = mo5117a;
        while (i < length) {
            InterfaceC12777h interfaceC12777h = m9509k[i];
            i++;
            collection = C13177a.m5709a(collection, interfaceC12777h.mo5117a(c12614f, interfaceC12112b));
        }
        if (collection == null) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        return collection;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        InterfaceC12777h[] m9509k = m9509k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12777h interfaceC12777h : m9509k) {
            C13736w.m3850v(linkedHashSet, interfaceC12777h.mo5116b());
        }
        linkedHashSet.addAll(m9510j().mo5116b());
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        Set m3831b;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m9508l(c12614f, interfaceC12112b);
        C12215i c12215i = this.f27177d;
        InterfaceC12777h[] m9509k = m9509k();
        Collection<? extends InterfaceC13518o0> mo5115c = c12215i.mo5115c(c12614f, interfaceC12112b);
        int length = m9509k.length;
        int i = 0;
        Collection collection = mo5115c;
        while (i < length) {
            InterfaceC12777h interfaceC12777h = m9509k[i];
            i++;
            collection = C13177a.m5709a(collection, interfaceC12777h.mo5115c(c12614f, interfaceC12112b));
        }
        if (collection == null) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        return collection;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        InterfaceC12777h[] m9509k = m9509k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12777h interfaceC12777h : m9509k) {
            C13736w.m3850v(linkedHashSet, interfaceC12777h.mo5114d());
        }
        linkedHashSet.addAll(m9510j().mo5114d());
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        Iterable m4009p;
        m4009p = C13715n.m4009p(m9509k());
        Set<C12614f> m6775a = C12782j.m6775a(m4009p);
        if (m6775a == null) {
            return null;
        }
        m6775a.addAll(m9510j().mo5113e());
        return m6775a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m9508l(c12614f, interfaceC12112b);
        InterfaceC13312e mo5794f = this.f27177d.mo5794f(c12614f, interfaceC12112b);
        if (mo5794f != null) {
            return mo5794f;
        }
        InterfaceC12777h[] m9509k = m9509k();
        InterfaceC13334h interfaceC13334h = null;
        int i = 0;
        int length = m9509k.length;
        while (i < length) {
            InterfaceC12777h interfaceC12777h = m9509k[i];
            i++;
            InterfaceC13334h mo5794f2 = interfaceC12777h.mo5794f(c12614f, interfaceC12112b);
            if (mo5794f2 != null) {
                if (!(mo5794f2 instanceof InterfaceC13360i) || !((InterfaceC13360i) mo5794f2).mo4660T()) {
                    return mo5794f2;
                }
                if (interfaceC13334h == null) {
                    interfaceC13334h = mo5794f2;
                }
            }
        }
        return interfaceC13334h;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        Set m3831b;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        C12215i c12215i = this.f27177d;
        InterfaceC12777h[] m9509k = m9509k();
        Collection<InterfaceC13513m> mo5112g = c12215i.mo5112g(c12768d, interfaceC11767l);
        int length = m9509k.length;
        int i = 0;
        while (i < length) {
            InterfaceC12777h interfaceC12777h = m9509k[i];
            i++;
            mo5112g = C13177a.m5709a(mo5112g, interfaceC12777h.mo5112g(c12768d, interfaceC11767l));
        }
        if (mo5112g == null) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        return mo5112g;
    }

    /* renamed from: j */
    public final C12215i m9510j() {
        return this.f27177d;
    }

    /* renamed from: l */
    public void m9508l(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        C12110a.m9686b(this.f27175b.m9538a().m9562l(), interfaceC12112b, this.f27176c, c12614f);
    }
}
