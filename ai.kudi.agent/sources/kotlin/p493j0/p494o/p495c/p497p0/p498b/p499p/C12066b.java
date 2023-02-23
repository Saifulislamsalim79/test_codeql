package kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12964b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13135x0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.AbstractC13711l0;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13373a;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13410k0;
/* compiled from: FunctionClassDescriptor.kt */
/* renamed from: kotlin.j0.o.c.p0.b.p.b */
/* loaded from: classes3.dex */
public final class C12066b extends AbstractC13373a {

    /* renamed from: E */
    private static final C12608b f26898E = new C12608b(C12059k.f26808k, C12614f.m7349i("Function"));

    /* renamed from: F */
    private static final C12608b f26899F = new C12608b(C12059k.f26806i, C12614f.m7349i("KFunction"));

    /* renamed from: A */
    private final int f26900A;

    /* renamed from: B */
    private final C12067a f26901B;

    /* renamed from: C */
    private final C12072d f26902C;

    /* renamed from: D */
    private final List<InterfaceC13562z0> f26903D;

    /* renamed from: x */
    private final InterfaceC12954n f26904x;

    /* renamed from: y */
    private final InterfaceC13320f0 f26905y;

    /* renamed from: z */
    private final EnumC12069c f26906z;

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.p.b$a */
    /* loaded from: classes3.dex */
    private final class C12067a extends AbstractC12964b {

        /* renamed from: d */
        final /* synthetic */ C12066b f26907d;

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: kotlin.j0.o.c.p0.b.p.b$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12068a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f26908a;

            static {
                int[] iArr = new int[EnumC12069c.values().length];
                iArr[EnumC12069c.Function.ordinal()] = 1;
                iArr[EnumC12069c.KFunction.ordinal()] = 2;
                iArr[EnumC12069c.SuspendFunction.ordinal()] = 3;
                iArr[EnumC12069c.KSuspendFunction.ordinal()] = 4;
                f26908a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12067a(C12066b c12066b) {
            super(c12066b.f26904x);
            l.f(c12066b, "this$0");
            this.f26907d = c12066b;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: c */
        public List<InterfaceC13562z0> mo5207c() {
            return this.f26907d.f26903D;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: e */
        public boolean mo5205e() {
            return true;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: j */
        protected Collection<AbstractC12965b0> mo5204j() {
            List<C12608b> m3901b;
            int m3867o;
            List m3825B0;
            List<InterfaceC13562z0> m3775w0;
            int m3867o2;
            int i = C12068a.f26908a[this.f26907d.m9805f1().ordinal()];
            if (i == 1) {
                m3901b = C13724q.m3901b(C12066b.f26898E);
            } else if (i == 2) {
                m3901b = C13726r.m3888h(C12066b.f26899F, new C12608b(C12059k.f26808k, EnumC12069c.Function.m9796g(this.f26907d.m9809b1())));
            } else if (i == 3) {
                m3901b = C13724q.m3901b(C12066b.f26898E);
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                m3901b = C13726r.m3888h(C12066b.f26899F, new C12608b(C12059k.f26801d, EnumC12069c.SuspendFunction.m9796g(this.f26907d.m9809b1())));
            }
            InterfaceC13305c0 mo4687d = this.f26907d.f26905y.mo4687d();
            m3867o = C13728s.m3867o(m3901b, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (C12608b c12608b : m3901b) {
                InterfaceC13312e m4703a = C13550w.m4703a(mo4687d, c12608b);
                if (m4703a == null) {
                    throw new IllegalStateException(("Built-in class " + c12608b + " not found").toString());
                }
                m3775w0 = C13742z.m3775w0(mo5207c(), m4703a.mo4649n().mo5207c().size());
                m3867o2 = C13728s.m3867o(m3775w0, 10);
                ArrayList arrayList2 = new ArrayList(m3867o2);
                for (InterfaceC13562z0 interfaceC13562z0 : m3775w0) {
                    arrayList2.add(new C13135x0(interfaceC13562z0.mo5010x()));
                }
                C12969c0 c12969c0 = C12969c0.f29026a;
                arrayList.add(C12969c0.m6311g(InterfaceC13346g.f29516s.m5317b(), m4703a, arrayList2));
            }
            m3825B0 = C13742z.m3825B0(arrayList);
            return m3825B0;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: n */
        protected InterfaceC13556x0 mo5202n() {
            return InterfaceC13556x0.C13557a.f29907a;
        }

        public String toString() {
            return mo6203w().toString();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12964b
        /* renamed from: x */
        public C12066b mo6203w() {
            return this.f26907d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12066b(InterfaceC12954n interfaceC12954n, InterfaceC13320f0 interfaceC13320f0, EnumC12069c enumC12069c, int i) {
        super(interfaceC12954n, enumC12069c.m9796g(i));
        int m3867o;
        List<InterfaceC13562z0> m3825B0;
        l.f(interfaceC12954n, "storageManager");
        l.f(interfaceC13320f0, "containingDeclaration");
        l.f(enumC12069c, "functionKind");
        this.f26904x = interfaceC12954n;
        this.f26905y = interfaceC13320f0;
        this.f26906z = enumC12069c;
        this.f26900A = i;
        this.f26901B = new C12067a(this);
        this.f26902C = new C12072d(this.f26904x, this);
        ArrayList arrayList = new ArrayList();
        C11837e c11837e = new C11837e(1, this.f26900A);
        m3867o = C13728s.m3867o(c11837e, 10);
        ArrayList arrayList2 = new ArrayList(m3867o);
        Iterator<Integer> it = c11837e.iterator();
        while (it.hasNext()) {
            m9815V0(arrayList, this, EnumC13008h1.IN_VARIANCE, l.m("P", Integer.valueOf(((AbstractC13711l0) it).mo4069b())));
            arrayList2.add(C13666w.f30112a);
        }
        m9815V0(arrayList, this, EnumC13008h1.OUT_VARIANCE, "R");
        m3825B0 = C13742z.m3825B0(arrayList);
        this.f26903D = m3825B0;
    }

    /* renamed from: V0 */
    private static final void m9815V0(ArrayList<InterfaceC13562z0> arrayList, C12066b c12066b, EnumC13008h1 enumC13008h1, String str) {
        arrayList.add(C13410k0.m5145c1(c12066b, InterfaceC13346g.f29516s.m5317b(), false, enumC13008h1, C12614f.m7349i(str), arrayList.size(), c12066b.f26904x));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: B */
    public List<InterfaceC13562z0> mo4975B() {
        return this.f26903D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: E */
    public boolean mo4662E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: F */
    public boolean mo4974F() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: J */
    public boolean mo4973J() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: M0 */
    public boolean mo4661M0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: Q */
    public boolean mo4970Q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: R0 */
    public boolean mo4968R0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: T */
    public boolean mo4660T() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: U */
    public boolean mo4967U() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: Z */
    public /* bridge */ /* synthetic */ InterfaceC13309d mo4962Z() {
        return (InterfaceC13309d) m9801j1();
    }

    /* renamed from: b1 */
    public final int m9809b1() {
        return this.f26900A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: c0 */
    public /* bridge */ /* synthetic */ InterfaceC13312e mo4959c0() {
        return (InterfaceC13312e) m9808c1();
    }

    /* renamed from: c1 */
    public Void m9808c1() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: d1 */
    public List<InterfaceC13309d> mo4958p() {
        List<InterfaceC13309d> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13515n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: e1 */
    public InterfaceC13320f0 mo4687d() {
        return this.f26905y;
    }

    /* renamed from: f1 */
    public final EnumC12069c m9805f1() {
        return this.f26906z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: g1 */
    public List<InterfaceC13312e> mo4971P() {
        List<InterfaceC13312e> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: h1 */
    public InterfaceC12777h.C12780b mo4960a0() {
        return InterfaceC12777h.C12780b.f28671b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = C13530t.f29892e;
        l.e(abstractC13544u, "PUBLIC");
        return abstractC13544u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13437t
    /* renamed from: i1 */
    public C12072d mo4969R(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this.f26902C;
    }

    /* renamed from: j1 */
    public Void m9801j1() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
        l.e(interfaceC13545u0, "NO_SOURCE");
        return interfaceC13545u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public InterfaceC13125t0 mo4649n() {
        return this.f26901B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        return EnumC13560z.ABSTRACT;
    }

    public String toString() {
        String m7353b = mo5012b().m7353b();
        l.e(m7353b, "name.asString()");
        return m7353b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: w */
    public EnumC13319f mo4957w() {
        return EnumC13319f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return InterfaceC13346g.f29516s.m5317b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: z */
    public boolean mo4955z() {
        return false;
    }
}
