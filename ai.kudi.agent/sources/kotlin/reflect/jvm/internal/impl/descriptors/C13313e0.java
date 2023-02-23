package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12946g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13009i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.AbstractC13711l0;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13739x0;
import kotlin.p557z.C13741y0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13399g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13410k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13416m;
/* compiled from: NotFoundClasses.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.e0 */
/* loaded from: classes3.dex */
public final class C13313e0 {

    /* renamed from: a */
    private final InterfaceC12954n f29461a;

    /* renamed from: b */
    private final InterfaceC13305c0 f29462b;

    /* renamed from: c */
    private final InterfaceC12946g<C12609c, InterfaceC13320f0> f29463c;

    /* renamed from: d */
    private final InterfaceC12946g<C13314a, InterfaceC13312e> f29464d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.e0$a */
    /* loaded from: classes3.dex */
    public static final class C13314a {

        /* renamed from: a */
        private final C12608b f29465a;

        /* renamed from: b */
        private final List<Integer> f29466b;

        public C13314a(C12608b c12608b, List<Integer> list) {
            kotlin.e0.d.l.f(c12608b, "classId");
            kotlin.e0.d.l.f(list, "typeParametersCount");
            this.f29465a = c12608b;
            this.f29466b = list;
        }

        /* renamed from: a */
        public final C12608b m5339a() {
            return this.f29465a;
        }

        /* renamed from: b */
        public final List<Integer> m5338b() {
            return this.f29466b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13314a) {
                C13314a c13314a = (C13314a) obj;
                return kotlin.e0.d.l.b(this.f29465a, c13314a.f29465a) && kotlin.e0.d.l.b(this.f29466b, c13314a.f29466b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f29465a.hashCode() * 31) + this.f29466b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f29465a + ", typeParametersCount=" + this.f29466b + ')';
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.e0$b */
    /* loaded from: classes3.dex */
    public static final class C13315b extends AbstractC13399g {

        /* renamed from: A */
        private final boolean f29467A;

        /* renamed from: B */
        private final List<InterfaceC13562z0> f29468B;

        /* renamed from: C */
        private final C13009i f29469C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13315b(InterfaceC12954n interfaceC12954n, InterfaceC13513m interfaceC13513m, C12614f c12614f, boolean z, int i) {
            super(interfaceC12954n, interfaceC13513m, c12614f, InterfaceC13545u0.f29903a, false);
            C11837e m10262j;
            int m3867o;
            Set m3832a;
            kotlin.e0.d.l.f(interfaceC12954n, "storageManager");
            kotlin.e0.d.l.f(interfaceC13513m, "container");
            kotlin.e0.d.l.f(c12614f, "name");
            this.f29467A = z;
            m10262j = C11841h.m10262j(0, i);
            m3867o = C13728s.m3867o(m10262j, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            Iterator<Integer> it = m10262j.iterator();
            while (it.hasNext()) {
                int mo4069b = ((AbstractC13711l0) it).mo4069b();
                arrayList.add(C13410k0.m5145c1(this, InterfaceC13346g.f29516s.m5317b(), false, EnumC13008h1.INVARIANT, C12614f.m7349i(kotlin.e0.d.l.m("T", Integer.valueOf(mo4069b))), mo4069b, interfaceC12954n));
            }
            this.f29468B = arrayList;
            List<InterfaceC13562z0> m5351d = C13296a1.m5351d(this);
            m3832a = C13739x0.m3832a(C12747a.m6858l(this).mo4979s().m9892i());
            this.f29469C = new C13009i(this, m5351d, m3832a, interfaceC12954n);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
        /* renamed from: B */
        public List<InterfaceC13562z0> mo4975B() {
            return this.f29468B;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13399g, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
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
        /* renamed from: P */
        public Collection<InterfaceC13312e> mo4971P() {
            List m3891e;
            m3891e = C13726r.m3891e();
            return m3891e;
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
            return this.f29467A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
        /* renamed from: V0 */
        public InterfaceC12777h.C12780b mo4960a0() {
            return InterfaceC12777h.C12780b.f28671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
        /* renamed from: W0 */
        public C13009i mo4649n() {
            return this.f29469C;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13437t
        /* renamed from: X0 */
        public InterfaceC12777h.C12780b mo4969R(AbstractC13026h abstractC13026h) {
            kotlin.e0.d.l.f(abstractC13026h, "kotlinTypeRefiner");
            return InterfaceC12777h.C12780b.f28671b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
        /* renamed from: Z */
        public InterfaceC13309d mo4962Z() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
        /* renamed from: c0 */
        public InterfaceC13312e mo4959c0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
        /* renamed from: i */
        public AbstractC13544u mo4659i() {
            AbstractC13544u abstractC13544u = C13530t.f29892e;
            kotlin.e0.d.l.e(abstractC13544u, "PUBLIC");
            return abstractC13544u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
        /* renamed from: o */
        public EnumC13560z mo4658o() {
            return EnumC13560z.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
        /* renamed from: p */
        public Collection<InterfaceC13309d> mo4958p() {
            Set m3831b;
            m3831b = C13741y0.m3831b();
            return m3831b;
        }

        public String toString() {
            return "class " + mo5012b() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
        /* renamed from: w */
        public EnumC13319f mo4957w() {
            return EnumC13319f.CLASS;
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

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.e0$c */
    /* loaded from: classes3.dex */
    static final class C13316c extends AbstractC11802m implements InterfaceC11767l<C13314a, InterfaceC13312e> {
        C13316c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13312e invoke(C13314a c13314a) {
            List<Integer> m3812L;
            InterfaceC13513m m5340d;
            kotlin.e0.d.l.f(c13314a, "$dstr$classId$typeParametersCount");
            C12608b m5339a = c13314a.m5339a();
            List<Integer> m5338b = c13314a.m5338b();
            if (!m5339a.m7386k()) {
                C12608b m7390g = m5339a.m7390g();
                if (m7390g == null) {
                    m5340d = null;
                } else {
                    C13313e0 c13313e0 = C13313e0.this;
                    m3812L = C13742z.m3812L(m5338b, 1);
                    m5340d = c13313e0.m5340d(m7390g, m3812L);
                }
                if (m5340d == null) {
                    InterfaceC12946g interfaceC12946g = C13313e0.this.f29463c;
                    C12609c m7389h = m5339a.m7389h();
                    kotlin.e0.d.l.e(m7389h, "classId.packageFqName");
                    m5340d = (InterfaceC13331g) interfaceC12946g.invoke(m7389h);
                }
                InterfaceC13513m interfaceC13513m = m5340d;
                boolean m7385l = m5339a.m7385l();
                InterfaceC12954n interfaceC12954n = C13313e0.this.f29461a;
                C12614f m7387j = m5339a.m7387j();
                kotlin.e0.d.l.e(m7387j, "classId.shortClassName");
                Integer num = (Integer) C13722p.m3952T(m5338b);
                return new C13315b(interfaceC12954n, interfaceC13513m, m7387j, m7385l, num == null ? 0 : num.intValue());
            }
            throw new UnsupportedOperationException(kotlin.e0.d.l.m("Unresolved local class: ", m5339a));
        }
    }

    /* compiled from: NotFoundClasses.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.e0$d */
    /* loaded from: classes3.dex */
    static final class C13317d extends AbstractC11802m implements InterfaceC11767l<C12609c, InterfaceC13320f0> {
        C13317d() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13320f0 invoke(C12609c c12609c) {
            kotlin.e0.d.l.f(c12609c, "fqName");
            return new C13416m(C13313e0.this.f29462b, c12609c);
        }
    }

    public C13313e0(InterfaceC12954n interfaceC12954n, InterfaceC13305c0 interfaceC13305c0) {
        kotlin.e0.d.l.f(interfaceC12954n, "storageManager");
        kotlin.e0.d.l.f(interfaceC13305c0, "module");
        this.f29461a = interfaceC12954n;
        this.f29462b = interfaceC13305c0;
        this.f29463c = interfaceC12954n.mo6363h(new C13317d());
        this.f29464d = this.f29461a.mo6363h(new C13316c());
    }

    /* renamed from: d */
    public final InterfaceC13312e m5340d(C12608b c12608b, List<Integer> list) {
        kotlin.e0.d.l.f(c12608b, "classId");
        kotlin.e0.d.l.f(list, "typeParametersCount");
        return this.f29464d.invoke(new C13314a(c12608b, list));
    }
}
