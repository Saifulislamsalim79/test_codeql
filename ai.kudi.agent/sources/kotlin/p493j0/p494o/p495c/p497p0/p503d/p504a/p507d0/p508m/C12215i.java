package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.InterfaceC12373o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.InterfaceC12183b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.EnumC12271c0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12446n;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12442m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12949j;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.utils.C13643d;
/* compiled from: LazyJavaPackageScope.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i */
/* loaded from: classes3.dex */
public final class C12215i extends AbstractC12244l {

    /* renamed from: n */
    private final InterfaceC12292u f27244n;

    /* renamed from: o */
    private final C12210h f27245o;

    /* renamed from: p */
    private final InterfaceC12949j<Set<String>> f27246p;

    /* renamed from: q */
    private final InterfaceC12947h<C12216a, InterfaceC13312e> f27247q;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$a */
    /* loaded from: classes3.dex */
    public static final class C12216a {

        /* renamed from: a */
        private final C12614f f27248a;

        /* renamed from: b */
        private final InterfaceC12277g f27249b;

        public C12216a(C12614f c12614f, InterfaceC12277g interfaceC12277g) {
            l.f(c12614f, "name");
            this.f27248a = c12614f;
            this.f27249b = interfaceC12277g;
        }

        /* renamed from: a */
        public final InterfaceC12277g m9399a() {
            return this.f27249b;
        }

        /* renamed from: b */
        public final C12614f m9398b() {
            return this.f27248a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C12216a) && l.b(this.f27248a, ((C12216a) obj).f27248a);
        }

        public int hashCode() {
            return this.f27248a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12217b {

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$b$a */
        /* loaded from: classes3.dex */
        public static final class C12218a extends AbstractC12217b {

            /* renamed from: a */
            private final InterfaceC13312e f27250a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12218a(InterfaceC13312e interfaceC13312e) {
                super(null);
                l.f(interfaceC13312e, "descriptor");
                this.f27250a = interfaceC13312e;
            }

            /* renamed from: a */
            public final InterfaceC13312e m9397a() {
                return this.f27250a;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$b$b */
        /* loaded from: classes3.dex */
        public static final class C12219b extends AbstractC12217b {

            /* renamed from: a */
            public static final C12219b f27251a = new C12219b();

            private C12219b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$b$c */
        /* loaded from: classes3.dex */
        public static final class C12220c extends AbstractC12217b {

            /* renamed from: a */
            public static final C12220c f27252a = new C12220c();

            private C12220c() {
                super(null);
            }
        }

        private AbstractC12217b() {
        }

        public /* synthetic */ AbstractC12217b(g gVar) {
            this();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$c */
    /* loaded from: classes3.dex */
    static final class C12221c extends AbstractC11802m implements InterfaceC11767l<C12216a, InterfaceC13312e> {

        /* renamed from: d */
        final /* synthetic */ C12174h f27254d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12221c(C12174h c12174h) {
            super(1);
            this.f27254d = c12174h;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13312e invoke(C12216a c12216a) {
            InterfaceC12442m.AbstractC12443a mo4918c;
            byte[] m8887b;
            l.f(c12216a, TransactionRequest.TYPE_REQUEST);
            C12608b c12608b = new C12608b(C12215i.this.mo9354C().mo4954f(), c12216a.m9398b());
            if (c12216a.m9399a() != null) {
                mo4918c = this.f27254d.m9538a().m9564j().mo4920a(c12216a.m9399a());
            } else {
                mo4918c = this.f27254d.m9538a().m9564j().mo4918c(c12608b);
            }
            InterfaceC12447o m8888a = mo4918c == null ? null : mo4918c.m8888a();
            C12608b mo4922h = m8888a == null ? null : m8888a.mo4922h();
            if (mo4922h == null || !(mo4922h.m7385l() || mo4922h.m7386k())) {
                AbstractC12217b m9400R = C12215i.this.m9400R(m8888a);
                if (m9400R instanceof AbstractC12217b.C12218a) {
                    return ((AbstractC12217b.C12218a) m9400R).m9397a();
                }
                if (m9400R instanceof AbstractC12217b.C12220c) {
                    return null;
                }
                if (m9400R instanceof AbstractC12217b.C12219b) {
                    InterfaceC12277g m9399a = c12216a.m9399a();
                    if (m9399a == null) {
                        InterfaceC12373o m9570d = this.f27254d.m9538a().m9570d();
                        if (mo4918c != null) {
                            if (!(mo4918c instanceof InterfaceC12442m.AbstractC12443a.C12444a)) {
                                mo4918c = null;
                            }
                            InterfaceC12442m.AbstractC12443a.C12444a c12444a = (InterfaceC12442m.AbstractC12443a.C12444a) mo4918c;
                            if (c12444a != null) {
                                m8887b = c12444a.m8887b();
                                m9399a = m9570d.mo4930a(new InterfaceC12373o.C12374a(c12608b, m8887b, null, 4, null));
                            }
                        }
                        m8887b = null;
                        m9399a = m9570d.mo4930a(new InterfaceC12373o.C12374a(c12608b, m8887b, null, 4, null));
                    }
                    InterfaceC12277g interfaceC12277g = m9399a;
                    if ((interfaceC12277g == null ? null : interfaceC12277g.mo4862Q()) != EnumC12271c0.BINARY) {
                        C12609c mo4850f = interfaceC12277g == null ? null : interfaceC12277g.mo4850f();
                        if (mo4850f == null || mo4850f.m7380d() || !l.b(mo4850f.m7379e(), C12215i.this.mo9354C().mo4954f())) {
                            return null;
                        }
                        C12192f c12192f = new C12192f(this.f27254d, C12215i.this.mo9354C(), interfaceC12277g, null, 8, null);
                        this.f27254d.m9538a().m9569e().mo9103a(c12192f);
                        return c12192f;
                    }
                    throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + interfaceC12277g + "\nClassId: " + c12608b + "\nfindKotlinClass(JavaClass) = " + C12446n.m8885a(this.f27254d.m9538a().m9564j(), interfaceC12277g) + "\nfindKotlinClass(ClassId) = " + C12446n.m8884b(this.f27254d.m9538a().m9564j(), c12608b) + '\n');
                }
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.m.i$d */
    /* loaded from: classes3.dex */
    static final class C12222d extends AbstractC11802m implements InterfaceC11756a<Set<? extends String>> {

        /* renamed from: c */
        final /* synthetic */ C12174h f27255c;

        /* renamed from: d */
        final /* synthetic */ C12215i f27256d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12222d(C12174h c12174h, C12215i c12215i) {
            super(0);
            this.f27255c = c12174h;
            this.f27256d = c12215i;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Set<String> invoke() {
            return this.f27255c.m9538a().m9570d().mo4928c(this.f27256d.mo9354C().mo4954f());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12215i(C12174h c12174h, InterfaceC12292u interfaceC12292u, C12210h c12210h) {
        super(c12174h);
        l.f(c12174h, "c");
        l.f(interfaceC12292u, "jPackage");
        l.f(c12210h, "ownerDescriptor");
        this.f27244n = interfaceC12292u;
        this.f27245o = c12210h;
        this.f27246p = c12174h.m9534e().mo6365f(new C12222d(c12174h, this));
        this.f27247q = c12174h.m9534e().mo6362i(new C12221c(c12174h));
    }

    /* renamed from: N */
    private final InterfaceC13312e m9404N(C12614f c12614f, InterfaceC12277g interfaceC12277g) {
        if (C12616h.m7343b(c12614f)) {
            Set<String> invoke = this.f27246p.invoke();
            if (interfaceC12277g != null || invoke == null || invoke.contains(c12614f.m7353b())) {
                return this.f27247q.invoke(new C12216a(c12614f, interfaceC12277g));
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final AbstractC12217b m9400R(InterfaceC12447o interfaceC12447o) {
        if (interfaceC12447o == null) {
            return AbstractC12217b.C12219b.f27251a;
        }
        if (interfaceC12447o.mo4926a().m8997c() == C12408a.EnumC12409a.CLASS) {
            InterfaceC13312e m8932l = m9376w().m9538a().m9572b().m8932l(interfaceC12447o);
            return m8932l != null ? new AbstractC12217b.C12218a(m8932l) : AbstractC12217b.C12219b.f27251a;
        }
        return AbstractC12217b.C12220c.f27252a;
    }

    /* renamed from: O */
    public final InterfaceC13312e m9403O(InterfaceC12277g interfaceC12277g) {
        l.f(interfaceC12277g, "javaClass");
        return m9404N(interfaceC12277g.mo4785b(), interfaceC12277g);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: P */
    public InterfaceC13312e mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return m9404N(c12614f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: Q */
    public C12210h mo9354C() {
        return this.f27245o;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        List m3891e;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[SYNTHETIC] */
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m> mo5112g(kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d r5, kotlin.p483e0.p484c.InterfaceC11767l<? super kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.e0.d.l.f(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.e0.d.l.f(r6, r0)
            kotlin.j0.o.c.p0.i.w.d$a r0 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d.f28635c
            int r0 = r0.m6795c()
            kotlin.j0.o.c.p0.i.w.d$a r1 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d.f28635c
            int r1 = r1.m6793e()
            r0 = r0 | r1
            boolean r5 = r5.m6811a(r0)
            if (r5 != 0) goto L22
            java.util.List r5 = kotlin.p557z.C13722p.m3941e()
            goto L67
        L22:
            kotlin.j0.o.c.p0.k.i r5 = r4.m9377v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
            if (r3 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e) r2
            kotlin.j0.o.c.p0.f.f r2 = r2.mo5012b()
            java.lang.String r3 = "it.name"
            kotlin.e0.d.l.e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5f
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L35
            r0.add(r1)
            goto L35
        L66:
            r5 = r0
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12215i.mo5112g(kotlin.j0.o.c.p0.i.w.d, kotlin.e0.c.l):java.util.Collection");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: l */
    protected Set<C12614f> mo9348l(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        Set<C12614f> m3831b;
        l.f(c12768d, "kindFilter");
        if (!c12768d.m6811a(C12768d.f28635c.m6793e())) {
            m3831b = C13741y0.m3831b();
            return m3831b;
        }
        Set<String> invoke = this.f27246p.invoke();
        if (invoke != null) {
            HashSet hashSet = new HashSet();
            for (String str : invoke) {
                hashSet.add(C12614f.m7349i(str));
            }
            return hashSet;
        }
        InterfaceC12292u interfaceC12292u = this.f27244n;
        if (interfaceC11767l == null) {
            interfaceC11767l = C13643d.m4266a();
        }
        Collection<InterfaceC12277g> mo4792v = interfaceC12292u.mo4792v(interfaceC11767l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC12277g interfaceC12277g : mo4792v) {
            C12614f mo4785b = interfaceC12277g.mo4862Q() == EnumC12271c0.SOURCE ? null : interfaceC12277g.mo4785b();
            if (mo4785b != null) {
                linkedHashSet.add(mo4785b);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: n */
    protected Set<C12614f> mo9347n(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        Set<C12614f> m3831b;
        l.f(c12768d, "kindFilter");
        m3831b = C13741y0.m3831b();
        return m3831b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: p */
    protected InterfaceC12183b mo9345p() {
        return InterfaceC12183b.C12184a.f27173a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: r */
    protected void mo9344r(Collection<InterfaceC13543t0> collection, C12614f c12614f) {
        l.f(collection, "result");
        l.f(c12614f, "name");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.AbstractC12223j
    /* renamed from: t */
    protected Set<C12614f> mo9343t(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        Set<C12614f> m3831b;
        l.f(c12768d, "kindFilter");
        m3831b = C13741y0.m3831b();
        return m3831b;
    }
}
