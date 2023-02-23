package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13064l0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13136y;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeAliasConstructorDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.j0 */
/* loaded from: classes3.dex */
public final class C13406j0 extends AbstractC13426p implements InterfaceC13404i0 {

    /* renamed from: Y */
    public static final C13407a f29678Y;

    /* renamed from: V */
    private final InterfaceC12954n f29679V;

    /* renamed from: W */
    private final InterfaceC13559y0 f29680W;

    /* renamed from: X */
    private InterfaceC13309d f29681X;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.j0$a */
    /* loaded from: classes3.dex */
    public static final class C13407a {
        private C13407a() {
        }

        public /* synthetic */ C13407a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final C12959a1 m5156c(InterfaceC13559y0 interfaceC13559y0) {
            if (interfaceC13559y0.mo4655v() == null) {
                return null;
            }
            return C12959a1.m6343f(interfaceC13559y0.mo4657e0());
        }

        /* renamed from: b */
        public final InterfaceC13404i0 m5157b(InterfaceC12954n interfaceC12954n, InterfaceC13559y0 interfaceC13559y0, InterfaceC13309d interfaceC13309d) {
            InterfaceC13309d mo4686e;
            l.f(interfaceC12954n, "storageManager");
            l.f(interfaceC13559y0, "typeAliasDescriptor");
            l.f(interfaceC13309d, "constructor");
            C12959a1 m5156c = m5156c(interfaceC13559y0);
            if (m5156c == null || (mo4686e = interfaceC13309d.mo4686e(m5156c)) == null) {
                return null;
            }
            InterfaceC13346g mo4956y = interfaceC13309d.mo4956y();
            InterfaceC13300b.EnumC13301a mo5057w = interfaceC13309d.mo5057w();
            l.e(mo5057w, "constructor.kind");
            InterfaceC13545u0 mo4745m = interfaceC13559y0.mo4745m();
            l.e(mo4745m, "typeAliasDescriptor.source");
            C13406j0 c13406j0 = new C13406j0(interfaceC12954n, interfaceC13559y0, mo4686e, null, mo4956y, mo5057w, mo4745m, null);
            List<InterfaceC13307c1> m5083Z0 = AbstractC13426p.m5083Z0(c13406j0, interfaceC13309d.mo5072k(), m5156c);
            if (m5083Z0 == null) {
                return null;
            }
            AbstractC13010i0 m5753c = C13136y.m5753c(mo4686e.mo4943j().mo6202Z0());
            AbstractC13010i0 mo5010x = interfaceC13559y0.mo5010x();
            l.e(mo5010x, "typeAliasDescriptor.defaultType");
            AbstractC13010i0 m6008j = C13064l0.m6008j(m5753c, mo5010x);
            InterfaceC13524r0 mo5066p0 = interfaceC13309d.mo5066p0();
            c13406j0.mo5080c1(mo5066p0 != null ? C12671c.m7057f(c13406j0, m5156c.m6335n(mo5066p0.mo5121c(), EnumC13008h1.INVARIANT), InterfaceC13346g.f29516s.m5317b()) : null, null, interfaceC13559y0.mo4975B(), m5083Z0, m6008j, EnumC13560z.FINAL, interfaceC13559y0.mo4659i());
            return c13406j0;
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.j0$b */
    /* loaded from: classes3.dex */
    static final class C13408b extends AbstractC11802m implements InterfaceC11756a<C13406j0> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC13309d f29683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13408b(InterfaceC13309d interfaceC13309d) {
            super(0);
            this.f29683d = interfaceC13309d;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C13406j0 invoke() {
            InterfaceC12954n m5165r0 = C13406j0.this.m5165r0();
            InterfaceC13559y0 m5159z1 = C13406j0.this.m5159z1();
            InterfaceC13309d interfaceC13309d = this.f29683d;
            C13406j0 c13406j0 = C13406j0.this;
            InterfaceC13346g mo4956y = interfaceC13309d.mo4956y();
            InterfaceC13300b.EnumC13301a mo5057w = this.f29683d.mo5057w();
            l.e(mo5057w, "underlyingConstructorDescriptor.kind");
            InterfaceC13545u0 mo4745m = C13406j0.this.m5159z1().mo4745m();
            l.e(mo4745m, "typeAliasDescriptor.source");
            C13406j0 c13406j02 = new C13406j0(m5165r0, m5159z1, interfaceC13309d, c13406j0, mo4956y, mo5057w, mo4745m, null);
            C13406j0 c13406j03 = C13406j0.this;
            InterfaceC13309d interfaceC13309d2 = this.f29683d;
            C12959a1 m5156c = C13406j0.f29678Y.m5156c(c13406j03.m5159z1());
            if (m5156c == null) {
                return null;
            }
            InterfaceC13524r0 mo5066p0 = interfaceC13309d2.mo5066p0();
            c13406j02.mo5080c1(null, mo5066p0 == null ? null : mo5066p0.mo4686e(m5156c), c13406j03.m5159z1().mo4975B(), c13406j03.mo5072k(), c13406j03.mo4943j(), EnumC13560z.FINAL, c13406j03.m5159z1().mo4659i());
            return c13406j02;
        }
    }

    static {
        C11813x.m10312f(new C11808s(C11813x.m10316b(C13406j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f29678Y = new C13407a(null);
    }

    private C13406j0(InterfaceC12954n interfaceC12954n, InterfaceC13559y0 interfaceC13559y0, InterfaceC13309d interfaceC13309d, InterfaceC13404i0 interfaceC13404i0, InterfaceC13346g interfaceC13346g, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13559y0, interfaceC13404i0, interfaceC13346g, C12614f.m7346n("<init>"), enumC13301a, interfaceC13545u0);
        this.f29679V = interfaceC12954n;
        this.f29680W = interfaceC13559y0;
        m5076g1(m5159z1().mo4661M0());
        this.f29679V.mo6365f(new C13408b(interfaceC13309d));
        this.f29681X = interfaceC13309d;
    }

    public /* synthetic */ C13406j0(InterfaceC12954n interfaceC12954n, InterfaceC13559y0 interfaceC13559y0, InterfaceC13309d interfaceC13309d, InterfaceC13404i0 interfaceC13404i0, InterfaceC13346g interfaceC13346g, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0, g gVar) {
        this(interfaceC12954n, interfaceC13559y0, interfaceC13309d, interfaceC13404i0, interfaceC13346g, enumC13301a, interfaceC13545u0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: A1 */
    public InterfaceC13404i0 mo4686e(C12959a1 c12959a1) {
        l.f(c12959a1, "substitutor");
        InterfaceC13554x mo4686e = super.mo4686e(c12959a1);
        if (mo4686e != null) {
            C13406j0 c13406j0 = (C13406j0) mo4686e;
            C12959a1 m6343f = C12959a1.m6343f(c13406j0.mo4943j());
            l.e(m6343f, "create(substitutedTypeAliasConstructor.returnType)");
            InterfaceC13309d mo4686e2 = mo5160z0().mo4651a().mo4686e(m6343f);
            if (mo4686e2 == null) {
                return null;
            }
            c13406j0.f29681X = mo4686e2;
            return c13406j0;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l
    /* renamed from: H */
    public boolean mo4945H() {
        return mo5160z0().mo4945H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l
    /* renamed from: I */
    public InterfaceC13312e mo4944I() {
        InterfaceC13312e mo4944I = mo5160z0().mo4944I();
        l.e(mo4944I, "underlyingConstructorDescriptor.constructedClass");
        return mo4944I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        AbstractC12965b0 mo4943j = super.mo4943j();
        l.d(mo4943j);
        return mo4943j;
    }

    /* renamed from: r0 */
    public final InterfaceC12954n m5165r0() {
        return this.f29679V;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: v1 */
    public InterfaceC13404i0 mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        l.f(interfaceC13513m, "newOwner");
        l.f(enumC13560z, "modality");
        l.f(abstractC13544u, "visibility");
        l.f(enumC13301a, "kind");
        InterfaceC13554x build = mo4694A().mo4669n(interfaceC13513m).mo4680c(enumC13560z).mo4670m(abstractC13544u).mo4667p(enumC13301a).mo4674i(z).build();
        if (build != null) {
            return (InterfaceC13404i0) build;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: w1 */
    public C13406j0 mo5086W0(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        l.f(interfaceC13513m, "newOwner");
        l.f(enumC13301a, "kind");
        l.f(interfaceC13346g, "annotations");
        l.f(interfaceC13545u0, TransactionField.TRANSACTION_CHANNEL);
        boolean z = enumC13301a == InterfaceC13300b.EnumC13301a.DECLARATION || enumC13301a == InterfaceC13300b.EnumC13301a.SYNTHESIZED;
        if (C13668y.f30115a && !z) {
            throw new AssertionError("Creating a type alias constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC13513m + "\nkind: " + enumC13301a);
        }
        boolean z2 = c12614f == null;
        if (!C13668y.f30115a || z2) {
            return new C13406j0(this.f29679V, m5159z1(), mo5160z0(), this, interfaceC13346g, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0);
        }
        throw new AssertionError(l.m("Renaming type alias constructor: ", this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: x1 */
    public InterfaceC13559y0 mo4687d() {
        return m5159z1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: y1 */
    public InterfaceC13404i0 mo4651a() {
        return (InterfaceC13404i0) super.mo4651a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13404i0
    /* renamed from: z0 */
    public InterfaceC13309d mo5160z0() {
        return this.f29681X;
    }

    /* renamed from: z1 */
    public InterfaceC13559y0 m5159z1() {
        return this.f29680W;
    }
}
