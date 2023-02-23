package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13218k;
import kotlin.C13668y;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p521g.C12618a;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12946g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13028i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13041q;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13741y0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13302b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13378a0;
/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.x */
/* loaded from: classes3.dex */
public final class C13442x extends AbstractC13405j implements InterfaceC13305c0 {

    /* renamed from: A */
    private boolean f29785A;

    /* renamed from: B */
    private final InterfaceC12946g<C12609c, InterfaceC13448k0> f29786B;

    /* renamed from: C */
    private final InterfaceC11824h f29787C;

    /* renamed from: e */
    private final InterfaceC12954n f29788e;

    /* renamed from: f */
    private final AbstractC12046h f29789f;

    /* renamed from: w */
    private final Map<C13302b0<?>, Object> f29790w;

    /* renamed from: x */
    private final InterfaceC13378a0 f29791x;

    /* renamed from: y */
    private InterfaceC13440v f29792y;

    /* renamed from: z */
    private InterfaceC13332g0 f29793z;

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.x$a */
    /* loaded from: classes3.dex */
    static final class C13443a extends AbstractC11802m implements InterfaceC11756a<C13403i> {
        C13443a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C13403i invoke() {
            int m3867o;
            InterfaceC13440v interfaceC13440v = C13442x.this.f29792y;
            C13442x c13442x = C13442x.this;
            if (interfaceC13440v != null) {
                List<C13442x> mo5003a = interfaceC13440v.mo5003a();
                boolean contains = mo5003a.contains(C13442x.this);
                C13442x c13442x2 = C13442x.this;
                if (C13668y.f30115a && !contains) {
                    throw new AssertionError("Module " + c13442x2.m4990a1() + " is not contained in its own dependencies, this is probably a misconfiguration");
                }
                C13442x c13442x3 = C13442x.this;
                for (C13442x c13442x4 : mo5003a) {
                    boolean m4986e1 = c13442x4.m4986e1();
                    if (C13668y.f30115a && !m4986e1) {
                        throw new AssertionError("Dependency module " + c13442x4.m4990a1() + " was not initialized by the time contents of dependent module " + c13442x3.m4990a1() + " were queried");
                    }
                }
                m3867o = C13728s.m3867o(mo5003a, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (C13442x c13442x5 : mo5003a) {
                    InterfaceC13332g0 interfaceC13332g0 = c13442x5.f29793z;
                    l.d(interfaceC13332g0);
                    arrayList.add(interfaceC13332g0);
                }
                return new C13403i(arrayList);
            }
            throw new AssertionError("Dependencies of module " + c13442x.m4990a1() + " were not set before querying module content");
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.x$b */
    /* loaded from: classes3.dex */
    static final class C13444b extends AbstractC11802m implements InterfaceC11767l<C12609c, InterfaceC13448k0> {
        C13444b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13448k0 invoke(C12609c c12609c) {
            l.f(c12609c, "fqName");
            InterfaceC13378a0 interfaceC13378a0 = C13442x.this.f29791x;
            C13442x c13442x = C13442x.this;
            return interfaceC13378a0.mo5277a(c13442x, c12609c, c13442x.f29788e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13442x(C12614f c12614f, InterfaceC12954n interfaceC12954n, AbstractC12046h abstractC12046h, C12618a c12618a) {
        this(c12614f, interfaceC12954n, abstractC12046h, c12618a, null, null, 48, null);
        l.f(c12614f, "moduleName");
        l.f(interfaceC12954n, "storageManager");
        l.f(abstractC12046h, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C13442x(kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f r10, kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n r11, kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h r12, kotlin.p493j0.p494o.p495c.p497p0.p521g.C12618a r13, java.util.Map r14, kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f r15, int r16, kotlin.e0.d.g r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = kotlin.p557z.C13721o0.m3983k()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13442x.<init>(kotlin.j0.o.c.p0.f.f, kotlin.j0.o.c.p0.k.n, kotlin.j0.o.c.p0.b.h, kotlin.j0.o.c.p0.g.a, java.util.Map, kotlin.j0.o.c.p0.f.f, int, kotlin.e0.d.g):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final String m4990a1() {
        String c12614f = mo5012b().toString();
        l.e(c12614f, "name.toString()");
        return c12614f;
    }

    /* renamed from: c1 */
    private final C13403i m4988c1() {
        return (C13403i) this.f29787C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public final boolean m4986e1() {
        return this.f29793z != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: C0 */
    public List<InterfaceC13305c0> mo5000C0() {
        InterfaceC13440v interfaceC13440v = this.f29792y;
        if (interfaceC13440v != null) {
            return interfaceC13440v.mo5001c();
        }
        throw new AssertionError("Dependencies of module " + m4990a1() + " were not set");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: Q0 */
    public <T> T mo4998Q0(C13302b0<T> c13302b0) {
        l.f(c13302b0, "capability");
        return (T) this.f29790w.get(c13302b0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return (R) InterfaceC13305c0.C13306a.m5346a(this, interfaceC13517o, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: V */
    public InterfaceC13448k0 mo4996V(C12609c c12609c) {
        l.f(c12609c, "fqName");
        m4991Z0();
        return this.f29786B.invoke(c12609c);
    }

    /* renamed from: Z0 */
    public void m4991Z0() {
        if (!m4985f1()) {
            throw new InvalidModuleException(l.m("Accessing invalid module descriptor ", this));
        }
    }

    /* renamed from: b1 */
    public final InterfaceC13332g0 m4989b1() {
        m4991Z0();
        return m4988c1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        return InterfaceC13305c0.C13306a.m5345b(this);
    }

    /* renamed from: d1 */
    public final void m4987d1(InterfaceC13332g0 interfaceC13332g0) {
        l.f(interfaceC13332g0, "providerForModuleContent");
        boolean z = !m4986e1();
        if (!C13668y.f30115a || z) {
            this.f29793z = interfaceC13332g0;
            return;
        }
        throw new AssertionError("Attempt to initialize module " + m4990a1() + " twice");
    }

    /* renamed from: f1 */
    public boolean m4985f1() {
        return this.f29785A;
    }

    /* renamed from: g1 */
    public final void m4984g1(List<C13442x> list) {
        Set<C13442x> m3831b;
        l.f(list, "descriptors");
        m3831b = C13741y0.m3831b();
        m4983h1(list, m3831b);
    }

    /* renamed from: h1 */
    public final void m4983h1(List<C13442x> list, Set<C13442x> set) {
        List m3891e;
        Set m3831b;
        l.f(list, "descriptors");
        l.f(set, "friends");
        m3891e = C13726r.m3891e();
        m3831b = C13741y0.m3831b();
        m4982i1(new C13441w(list, set, m3891e, m3831b));
    }

    /* renamed from: i1 */
    public final void m4982i1(InterfaceC13440v interfaceC13440v) {
        l.f(interfaceC13440v, "dependencies");
        boolean z = this.f29792y == null;
        if (!C13668y.f30115a || z) {
            this.f29792y = interfaceC13440v;
            return;
        }
        throw new AssertionError("Dependencies of " + m4990a1() + " were already set");
    }

    /* renamed from: j1 */
    public final void m4981j1(C13442x... c13442xArr) {
        List<C13442x> m4025Z;
        l.f(c13442xArr, "descriptors");
        m4025Z = C13715n.m4025Z(c13442xArr);
        m4984g1(m4025Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: o0 */
    public boolean mo4980o0(InterfaceC13305c0 interfaceC13305c0) {
        boolean m3814J;
        l.f(interfaceC13305c0, "targetModule");
        if (l.b(this, interfaceC13305c0)) {
            return true;
        }
        InterfaceC13440v interfaceC13440v = this.f29792y;
        l.d(interfaceC13440v);
        m3814J = C13742z.m3814J(interfaceC13440v.mo5002b(), interfaceC13305c0);
        return m3814J || mo5000C0().contains(interfaceC13305c0) || interfaceC13305c0.mo5000C0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: s */
    public AbstractC12046h mo4979s() {
        return this.f29789f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0
    /* renamed from: t */
    public Collection<C12609c> mo4978t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        l.f(c12609c, "fqName");
        l.f(interfaceC11767l, "nameFilter");
        m4991Z0();
        return m4989b1().mo5169t(c12609c, interfaceC11767l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13442x(C12614f c12614f, InterfaceC12954n interfaceC12954n, AbstractC12046h abstractC12046h, C12618a c12618a, Map<C13302b0<?>, ? extends Object> map, C12614f c12614f2) {
        super(InterfaceC13346g.f29516s.m5317b(), c12614f);
        Map<C13302b0<?>, Object> m3868x;
        InterfaceC11824h m5625b;
        l.f(c12614f, "moduleName");
        l.f(interfaceC12954n, "storageManager");
        l.f(abstractC12046h, "builtIns");
        l.f(map, "capabilities");
        this.f29788e = interfaceC12954n;
        this.f29789f = abstractC12046h;
        if (c12614f.m7348j()) {
            m3868x = C13727r0.m3868x(map);
            this.f29790w = m3868x;
            m3868x.put(C13028i.m6097a(), new C13041q(null));
            InterfaceC13378a0 interfaceC13378a0 = (InterfaceC13378a0) mo4998Q0(InterfaceC13378a0.f29592a.m5278a());
            this.f29791x = interfaceC13378a0 == null ? InterfaceC13378a0.C13380b.f29595b : interfaceC13378a0;
            this.f29785A = true;
            this.f29786B = this.f29788e.mo6363h(new C13444b());
            m5625b = C13218k.m5625b(new C13443a());
            this.f29787C = m5625b;
            return;
        }
        throw new IllegalArgumentException(l.m("Module name must be special: ", c12614f));
    }
}
