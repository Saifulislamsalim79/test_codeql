package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13406j0;
/* compiled from: AbstractTypeAliasDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13386d extends AbstractC13409k implements InterfaceC13559y0 {

    /* renamed from: w */
    private final AbstractC13544u f29637w;

    /* renamed from: x */
    private List<? extends InterfaceC13562z0> f29638x;

    /* renamed from: y */
    private final C13389c f29639y;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.d$a */
    /* loaded from: classes3.dex */
    static final class C13387a extends AbstractC11802m implements InterfaceC11767l<AbstractC13026h, AbstractC13010i0> {
        C13387a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC13010i0 invoke(AbstractC13026h abstractC13026h) {
            InterfaceC13334h mo6101e = abstractC13026h.mo6101e(AbstractC13386d.this);
            if (mo6101e == null) {
                return null;
            }
            return mo6101e.mo5010x();
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.d$b */
    /* loaded from: classes3.dex */
    static final class C13388b extends AbstractC11802m implements InterfaceC11767l<AbstractC13005g1, Boolean> {
        C13388b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
            if (((r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0) && !kotlin.e0.d.l.b(((kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0) r5).mo4687d(), r0)) != false) goto L9;
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.e0.d.l.e(r5, r0)
                boolean r0 = kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0.m6274a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L2d
                kotlin.reflect.jvm.internal.impl.descriptors.j1.d r0 = kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13386d.this
                kotlin.j0.o.c.p0.l.t0 r5 = r5.mo5779W0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.mo5206d()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
                if (r3 == 0) goto L29
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0) r5
                kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo4687d()
                boolean r5 = kotlin.e0.d.l.b(r5, r0)
                if (r5 != 0) goto L29
                r5 = 1
                goto L2a
            L29:
                r5 = 0
            L2a:
                if (r5 == 0) goto L2d
                goto L2e
            L2d:
                r1 = 0
            L2e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13386d.C13388b.invoke(kotlin.j0.o.c.p0.l.g1):java.lang.Boolean");
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.d$c */
    /* loaded from: classes3.dex */
    public static final class C13389c implements InterfaceC13125t0 {
        C13389c() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: a */
        public Collection<AbstractC12965b0> mo5218a() {
            Collection<AbstractC12965b0> mo5218a = mo5206d().mo4656q0().mo5779W0().mo5218a();
            l.e(mo5218a, "declarationDescriptor.underlyingType.constructor.supertypes");
            return mo5218a;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: b */
        public InterfaceC13125t0 mo5217b(AbstractC13026h abstractC13026h) {
            l.f(abstractC13026h, "kotlinTypeRefiner");
            return this;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: c */
        public List<InterfaceC13562z0> mo5207c() {
            return AbstractC13386d.this.mo5223X0();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: e */
        public boolean mo5205e() {
            return true;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: g */
        public InterfaceC13559y0 mo5206d() {
            return AbstractC13386d.this;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: s */
        public AbstractC12046h mo5199s() {
            return C12747a.m6863g(mo5206d());
        }

        public String toString() {
            return "[typealias " + mo5206d().mo5012b().m7353b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13386d(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, AbstractC13544u abstractC13544u) {
        super(interfaceC13513m, interfaceC13346g, c12614f, interfaceC13545u0);
        l.f(interfaceC13513m, "containingDeclaration");
        l.f(interfaceC13346g, "annotations");
        l.f(c12614f, "name");
        l.f(interfaceC13545u0, "sourceElement");
        l.f(abstractC13544u, "visibilityImpl");
        this.f29637w = abstractC13544u;
        this.f29639y = new C13389c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: B */
    public List<InterfaceC13562z0> mo4975B() {
        List list = this.f29638x;
        if (list != null) {
            return list;
        }
        l.u("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: E */
    public boolean mo4662E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: M0 */
    public boolean mo4661M0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        l.f(interfaceC13517o, "visitor");
        return interfaceC13517o.mo4759e(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: T */
    public boolean mo4660T() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: U */
    public boolean mo4967U() {
        return C12974c1.m6299c(mo4656q0(), new C13388b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U0 */
    public final AbstractC13010i0 m5226U0() {
        InterfaceC13312e mo4655v = mo4655v();
        InterfaceC12777h mo5017L0 = mo4655v == null ? null : mo4655v.mo5017L0();
        if (mo5017L0 == null) {
            mo5017L0 = InterfaceC12777h.C12780b.f28671b;
        }
        AbstractC13010i0 m6282t = C12974c1.m6282t(this, mo5017L0, new C13387a());
        l.e(m6282t, "@OptIn(TypeRefinement::class)\n    protected fun computeDefaultType(): SimpleType =\n        TypeUtils.makeUnsubstitutedType(this, classDescriptor?.unsubstitutedMemberScope ?: MemberScope.Empty) { kotlinTypeRefiner ->\n            kotlinTypeRefiner.refineDescriptor(this)?.defaultType\n        }");
        return m6282t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: V0 */
    public InterfaceC13559y0 mo4651a() {
        return (InterfaceC13559y0) super.mo4651a();
    }

    /* renamed from: W0 */
    public final Collection<InterfaceC13404i0> m5224W0() {
        List m3891e;
        InterfaceC13312e mo4655v = mo4655v();
        if (mo4655v == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        Collection<InterfaceC13309d> mo4958p = mo4655v.mo4958p();
        l.e(mo4958p, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC13309d interfaceC13309d : mo4958p) {
            C13406j0.C13407a c13407a = C13406j0.f29678Y;
            InterfaceC12954n mo5221r0 = mo5221r0();
            l.e(interfaceC13309d, "it");
            InterfaceC13404i0 m5157b = c13407a.m5157b(mo5221r0, this, interfaceC13309d);
            if (m5157b != null) {
                arrayList.add(m5157b);
            }
        }
        return arrayList;
    }

    /* renamed from: X0 */
    protected abstract List<InterfaceC13562z0> mo5223X0();

    /* renamed from: Y0 */
    public final void m5222Y0(List<? extends InterfaceC13562z0> list) {
        l.f(list, "declaredTypeParameters");
        this.f29638x = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        return this.f29637w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public InterfaceC13125t0 mo4649n() {
        return this.f29639y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        return EnumC13560z.FINAL;
    }

    /* renamed from: r0 */
    protected abstract InterfaceC12954n mo5221r0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j
    public String toString() {
        return l.m("typealias ", mo5012b().m7353b());
    }
}
