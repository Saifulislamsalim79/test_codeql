package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11804o;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p488g0.AbstractC11822b;
import kotlin.p488g0.C11821a;
import kotlin.p488g0.InterfaceC11823c;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12620b;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: DescriptorRendererOptionsImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.h.g */
/* loaded from: classes3.dex */
public final class C12652g implements InterfaceC12650f {

    /* renamed from: W */
    static final /* synthetic */ InterfaceC11872i<Object>[] f28448W = {C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "withDefinedIn", "getWithDefinedIn()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "modifiers", "getModifiers()Ljava/util/Set;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "startFromName", "getStartFromName()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "debugMode", "getDebugMode()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "verbose", "getVerbose()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "unitReturnType", "getUnitReturnType()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "withoutReturnType", "getWithoutReturnType()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "enhancedTypes", "getEnhancedTypes()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "receiverAfterName", "getReceiverAfterName()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), C11813x.m10313e(new C11804o(C11813x.m10316b(C12652g.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: J */
    private final InterfaceC11823c f28458J;

    /* renamed from: K */
    private final InterfaceC11823c f28459K;

    /* renamed from: L */
    private final InterfaceC11823c f28460L;

    /* renamed from: M */
    private final InterfaceC11823c f28461M;

    /* renamed from: N */
    private final InterfaceC11823c f28462N;

    /* renamed from: O */
    private final InterfaceC11823c f28463O;

    /* renamed from: P */
    private final InterfaceC11823c f28464P;

    /* renamed from: Q */
    private final InterfaceC11823c f28465Q;

    /* renamed from: R */
    private final InterfaceC11823c f28466R;

    /* renamed from: S */
    private final InterfaceC11823c f28467S;

    /* renamed from: T */
    private final InterfaceC11823c f28468T;

    /* renamed from: U */
    private final InterfaceC11823c f28469U;

    /* renamed from: V */
    private final InterfaceC11823c f28470V;

    /* renamed from: a */
    private boolean f28471a;

    /* renamed from: b */
    private final InterfaceC11823c f28472b = m7104m0(InterfaceC12620b.C12623c.f28402a);

    /* renamed from: c */
    private final InterfaceC11823c f28473c = m7104m0(Boolean.TRUE);

    /* renamed from: d */
    private final InterfaceC11823c f28474d = m7104m0(Boolean.TRUE);

    /* renamed from: e */
    private final InterfaceC11823c f28475e = m7104m0(EnumC12649e.f28440d);

    /* renamed from: f */
    private final InterfaceC11823c f28476f = m7104m0(Boolean.FALSE);

    /* renamed from: g */
    private final InterfaceC11823c f28477g = m7104m0(Boolean.FALSE);

    /* renamed from: h */
    private final InterfaceC11823c f28478h = m7104m0(Boolean.FALSE);

    /* renamed from: i */
    private final InterfaceC11823c f28479i = m7104m0(Boolean.FALSE);

    /* renamed from: j */
    private final InterfaceC11823c f28480j = m7104m0(Boolean.FALSE);

    /* renamed from: k */
    private final InterfaceC11823c f28481k = m7104m0(Boolean.TRUE);

    /* renamed from: l */
    private final InterfaceC11823c f28482l = m7104m0(Boolean.FALSE);

    /* renamed from: m */
    private final InterfaceC11823c f28483m = m7104m0(Boolean.FALSE);

    /* renamed from: n */
    private final InterfaceC11823c f28484n = m7104m0(Boolean.FALSE);

    /* renamed from: o */
    private final InterfaceC11823c f28485o = m7104m0(Boolean.TRUE);

    /* renamed from: p */
    private final InterfaceC11823c f28486p = m7104m0(Boolean.TRUE);

    /* renamed from: q */
    private final InterfaceC11823c f28487q = m7104m0(Boolean.FALSE);

    /* renamed from: r */
    private final InterfaceC11823c f28488r = m7104m0(Boolean.FALSE);

    /* renamed from: s */
    private final InterfaceC11823c f28489s = m7104m0(Boolean.FALSE);

    /* renamed from: t */
    private final InterfaceC11823c f28490t = m7104m0(Boolean.FALSE);

    /* renamed from: u */
    private final InterfaceC11823c f28491u = m7104m0(Boolean.FALSE);

    /* renamed from: v */
    private final InterfaceC11823c f28492v = m7104m0(Boolean.FALSE);

    /* renamed from: w */
    private final InterfaceC11823c f28493w = m7104m0(Boolean.FALSE);

    /* renamed from: x */
    private final InterfaceC11823c f28494x = m7104m0(C12655c.f28500c);

    /* renamed from: y */
    private final InterfaceC11823c f28495y = m7104m0(C12653a.f28497c);

    /* renamed from: z */
    private final InterfaceC11823c f28496z = m7104m0(Boolean.TRUE);

    /* renamed from: A */
    private final InterfaceC11823c f28449A = m7104m0(EnumC12658j.RENDER_OPEN);

    /* renamed from: B */
    private final InterfaceC11823c f28450B = m7104m0(AbstractC12624c.InterfaceC12637l.C12638a.f28417a);

    /* renamed from: C */
    private final InterfaceC11823c f28451C = m7104m0(EnumC12661m.PLAIN);

    /* renamed from: D */
    private final InterfaceC11823c f28452D = m7104m0(EnumC12659k.ALL);

    /* renamed from: E */
    private final InterfaceC11823c f28453E = m7104m0(Boolean.FALSE);

    /* renamed from: F */
    private final InterfaceC11823c f28454F = m7104m0(Boolean.FALSE);

    /* renamed from: G */
    private final InterfaceC11823c f28455G = m7104m0(EnumC12660l.DEBUG);

    /* renamed from: H */
    private final InterfaceC11823c f28456H = m7104m0(Boolean.FALSE);

    /* renamed from: I */
    private final InterfaceC11823c f28457I = m7104m0(Boolean.FALSE);

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.g$a */
    /* loaded from: classes3.dex */
    static final class C12653a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13307c1, String> {

        /* renamed from: c */
        public static final C12653a f28497c = new C12653a();

        C12653a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final String invoke(InterfaceC13307c1 interfaceC13307c1) {
            l.f(interfaceC13307c1, "it");
            return "...";
        }
    }

    /* compiled from: Delegates.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.g$b */
    /* loaded from: classes3.dex */
    public static final class C12654b extends AbstractC11822b<T> {

        /* renamed from: b */
        final /* synthetic */ Object f28498b;

        /* renamed from: c */
        final /* synthetic */ C12652g f28499c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12654b(Object obj, Object obj2, C12652g c12652g) {
            super(obj2);
            this.f28498b = obj;
            this.f28499c = c12652g;
        }

        @Override // kotlin.p488g0.AbstractC11822b
        /* renamed from: d */
        protected boolean mo7089d(InterfaceC11872i<?> interfaceC11872i, T t, T t2) {
            l.f(interfaceC11872i, "property");
            if (this.f28499c.m7108k0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    /* compiled from: DescriptorRendererOptionsImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.g$c */
    /* loaded from: classes3.dex */
    static final class C12655c extends AbstractC11802m implements InterfaceC11767l<AbstractC12965b0, AbstractC12965b0> {

        /* renamed from: c */
        public static final C12655c f28500c = new C12655c();

        C12655c() {
            super(1);
        }

        /* renamed from: a */
        public final AbstractC12965b0 m7088a(AbstractC12965b0 abstractC12965b0) {
            l.f(abstractC12965b0, "it");
            return abstractC12965b0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ AbstractC12965b0 invoke(AbstractC12965b0 abstractC12965b0) {
            AbstractC12965b0 abstractC12965b02 = abstractC12965b0;
            m7088a(abstractC12965b02);
            return abstractC12965b02;
        }
    }

    public C12652g() {
        Set m3831b;
        m3831b = C13741y0.m3831b();
        this.f28458J = m7104m0(m3831b);
        this.f28459K = m7104m0(C12656h.f28501a.m7087a());
        this.f28460L = m7104m0(null);
        this.f28461M = m7104m0(EnumC12619a.NO_ARGUMENTS);
        this.f28462N = m7104m0(Boolean.FALSE);
        this.f28463O = m7104m0(Boolean.TRUE);
        this.f28464P = m7104m0(Boolean.TRUE);
        this.f28465Q = m7104m0(Boolean.FALSE);
        this.f28466R = m7104m0(Boolean.TRUE);
        this.f28467S = m7104m0(Boolean.TRUE);
        m7104m0(Boolean.FALSE);
        this.f28468T = m7104m0(Boolean.FALSE);
        this.f28469U = m7104m0(Boolean.FALSE);
        this.f28470V = m7104m0(Boolean.TRUE);
    }

    /* renamed from: m0 */
    private final <T> InterfaceC11823c<C12652g, T> m7104m0(T t) {
        C11821a c11821a = C11821a.f26507a;
        return new C12654b(t, t, this);
    }

    /* renamed from: A */
    public boolean m7155A() {
        return ((Boolean) this.f28466R.mo10298b(this, f28448W[42])).booleanValue();
    }

    /* renamed from: B */
    public boolean m7154B() {
        return InterfaceC12650f.C12651a.m7157a(this);
    }

    /* renamed from: C */
    public boolean m7153C() {
        return InterfaceC12650f.C12651a.m7156b(this);
    }

    /* renamed from: D */
    public boolean m7152D() {
        return ((Boolean) this.f28491u.mo10298b(this, f28448W[19])).booleanValue();
    }

    /* renamed from: E */
    public boolean m7151E() {
        return ((Boolean) this.f28470V.mo10298b(this, f28448W[47])).booleanValue();
    }

    /* renamed from: F */
    public Set<EnumC12649e> m7150F() {
        return (Set) this.f28475e.mo10298b(this, f28448W[3]);
    }

    /* renamed from: G */
    public boolean m7149G() {
        return ((Boolean) this.f28484n.mo10298b(this, f28448W[12])).booleanValue();
    }

    /* renamed from: H */
    public EnumC12658j m7148H() {
        return (EnumC12658j) this.f28449A.mo10298b(this, f28448W[25]);
    }

    /* renamed from: I */
    public EnumC12659k m7147I() {
        return (EnumC12659k) this.f28452D.mo10298b(this, f28448W[28]);
    }

    /* renamed from: J */
    public boolean m7146J() {
        return ((Boolean) this.f28467S.mo10298b(this, f28448W[43])).booleanValue();
    }

    /* renamed from: K */
    public boolean m7145K() {
        return ((Boolean) this.f28468T.mo10298b(this, f28448W[45])).booleanValue();
    }

    /* renamed from: L */
    public EnumC12660l m7144L() {
        return (EnumC12660l) this.f28455G.mo10298b(this, f28448W[31]);
    }

    /* renamed from: M */
    public boolean m7143M() {
        return ((Boolean) this.f28453E.mo10298b(this, f28448W[29])).booleanValue();
    }

    /* renamed from: N */
    public boolean m7142N() {
        return ((Boolean) this.f28454F.mo10298b(this, f28448W[30])).booleanValue();
    }

    /* renamed from: O */
    public boolean m7141O() {
        return ((Boolean) this.f28487q.mo10298b(this, f28448W[15])).booleanValue();
    }

    /* renamed from: P */
    public boolean m7140P() {
        return ((Boolean) this.f28463O.mo10298b(this, f28448W[39])).booleanValue();
    }

    /* renamed from: Q */
    public boolean m7139Q() {
        return ((Boolean) this.f28456H.mo10298b(this, f28448W[32])).booleanValue();
    }

    /* renamed from: R */
    public boolean m7138R() {
        return ((Boolean) this.f28486p.mo10298b(this, f28448W[14])).booleanValue();
    }

    /* renamed from: S */
    public boolean m7137S() {
        return ((Boolean) this.f28485o.mo10298b(this, f28448W[13])).booleanValue();
    }

    /* renamed from: T */
    public boolean m7136T() {
        return ((Boolean) this.f28488r.mo10298b(this, f28448W[16])).booleanValue();
    }

    /* renamed from: U */
    public boolean m7135U() {
        return ((Boolean) this.f28465Q.mo10298b(this, f28448W[41])).booleanValue();
    }

    /* renamed from: V */
    public boolean m7134V() {
        return ((Boolean) this.f28464P.mo10298b(this, f28448W[40])).booleanValue();
    }

    /* renamed from: W */
    public boolean m7133W() {
        return ((Boolean) this.f28496z.mo10298b(this, f28448W[24])).booleanValue();
    }

    /* renamed from: X */
    public boolean m7132X() {
        return ((Boolean) this.f28477g.mo10298b(this, f28448W[5])).booleanValue();
    }

    /* renamed from: Y */
    public boolean m7131Y() {
        return ((Boolean) this.f28476f.mo10298b(this, f28448W[4])).booleanValue();
    }

    /* renamed from: Z */
    public EnumC12661m m7130Z() {
        return (EnumC12661m) this.f28451C.mo10298b(this, f28448W[27]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: a */
    public void mo7129a(Set<C12609c> set) {
        l.f(set, "<set-?>");
        this.f28459K.mo10299a(this, f28448W[35], set);
    }

    /* renamed from: a0 */
    public InterfaceC11767l<AbstractC12965b0, AbstractC12965b0> m7128a0() {
        return (InterfaceC11767l) this.f28494x.mo10298b(this, f28448W[22]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: b */
    public void mo7127b(boolean z) {
        this.f28476f.mo10299a(this, f28448W[4], Boolean.valueOf(z));
    }

    /* renamed from: b0 */
    public boolean m7126b0() {
        return ((Boolean) this.f28490t.mo10298b(this, f28448W[18])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: c */
    public void mo7125c(Set<? extends EnumC12649e> set) {
        l.f(set, "<set-?>");
        this.f28475e.mo10299a(this, f28448W[3], set);
    }

    /* renamed from: c0 */
    public boolean m7124c0() {
        return ((Boolean) this.f28481k.mo10298b(this, f28448W[9])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: d */
    public void mo7123d(EnumC12659k enumC12659k) {
        l.f(enumC12659k, "<set-?>");
        this.f28452D.mo10299a(this, f28448W[28], enumC12659k);
    }

    /* renamed from: d0 */
    public AbstractC12624c.InterfaceC12637l m7122d0() {
        return (AbstractC12624c.InterfaceC12637l) this.f28450B.mo10298b(this, f28448W[26]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: e */
    public void mo7121e(boolean z) {
        this.f28473c.mo10299a(this, f28448W[1], Boolean.valueOf(z));
    }

    /* renamed from: e0 */
    public boolean m7120e0() {
        return ((Boolean) this.f28480j.mo10298b(this, f28448W[8])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: f */
    public boolean mo7119f() {
        return ((Boolean) this.f28483m.mo10298b(this, f28448W[11])).booleanValue();
    }

    /* renamed from: f0 */
    public boolean m7118f0() {
        return ((Boolean) this.f28473c.mo10298b(this, f28448W[1])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: g */
    public void mo7117g(InterfaceC12620b interfaceC12620b) {
        l.f(interfaceC12620b, "<set-?>");
        this.f28472b.mo10299a(this, f28448W[0], interfaceC12620b);
    }

    /* renamed from: g0 */
    public boolean m7116g0() {
        return ((Boolean) this.f28474d.mo10298b(this, f28448W[2])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: h */
    public void mo7115h(boolean z) {
        this.f28493w.mo10299a(this, f28448W[21], Boolean.valueOf(z));
    }

    /* renamed from: h0 */
    public boolean m7114h0() {
        return ((Boolean) this.f28482l.mo10298b(this, f28448W[10])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: i */
    public void mo7113i(boolean z) {
        this.f28478h.mo10299a(this, f28448W[6], Boolean.valueOf(z));
    }

    /* renamed from: i0 */
    public boolean m7112i0() {
        return ((Boolean) this.f28493w.mo10298b(this, f28448W[21])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: j */
    public void mo7111j(boolean z) {
        this.f28454F.mo10299a(this, f28448W[30], Boolean.valueOf(z));
    }

    /* renamed from: j0 */
    public boolean m7110j0() {
        return ((Boolean) this.f28492v.mo10298b(this, f28448W[20])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: k */
    public void mo7109k(boolean z) {
        this.f28453E.mo10299a(this, f28448W[29], Boolean.valueOf(z));
    }

    /* renamed from: k0 */
    public final boolean m7108k0() {
        return this.f28471a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: l */
    public void mo7107l(EnumC12661m enumC12661m) {
        l.f(enumC12661m, "<set-?>");
        this.f28451C.mo10299a(this, f28448W[27], enumC12661m);
    }

    /* renamed from: l0 */
    public final void m7106l0() {
        boolean z = !this.f28471a;
        if (C13668y.f30115a && !z) {
            throw new AssertionError("Assertion failed");
        }
        this.f28471a = true;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: m */
    public Set<C12609c> mo7105m() {
        return (Set) this.f28459K.mo10298b(this, f28448W[35]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: n */
    public boolean mo7103n() {
        return ((Boolean) this.f28478h.mo10298b(this, f28448W[6])).booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: o */
    public EnumC12619a mo7102o() {
        return (EnumC12619a) this.f28461M.mo10298b(this, f28448W[37]);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: p */
    public void mo7101p(boolean z) {
        this.f28492v.mo10299a(this, f28448W[20], Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final C12652g m7100q() {
        boolean m5447E;
        C12652g c12652g = new C12652g();
        Field[] declaredFields = C12652g.class.getDeclaredFields();
        l.e(declaredFields, "this::class.java.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC11822b abstractC11822b = obj instanceof AbstractC11822b ? (AbstractC11822b) obj : null;
                if (abstractC11822b == null) {
                    continue;
                } else {
                    String name = field.getName();
                    l.e(name, "field.name");
                    m5447E = C13276s.m5447E(name, "is", false, 2, null);
                    boolean z = !m5447E;
                    if (C13668y.f30115a && !z) {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                    InterfaceC11863b m10316b = C11813x.m10316b(C12652g.class);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    l.e(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        l.e(substring, "(this as java.lang.String).substring(startIndex)");
                        name3 = String.valueOf(upperCase) + substring;
                    }
                    field.set(c12652g, c12652g.m7104m0(abstractC11822b.mo10298b(this, new C11808s(m10316b, name2, l.m("get", name3)))));
                }
            }
        }
        return c12652g;
    }

    /* renamed from: r */
    public boolean m7099r() {
        return ((Boolean) this.f28489s.mo10298b(this, f28448W[17])).booleanValue();
    }

    /* renamed from: s */
    public boolean m7098s() {
        return ((Boolean) this.f28462N.mo10298b(this, f28448W[38])).booleanValue();
    }

    /* renamed from: t */
    public InterfaceC11767l<InterfaceC13340c, Boolean> m7097t() {
        return (InterfaceC11767l) this.f28460L.mo10298b(this, f28448W[36]);
    }

    /* renamed from: u */
    public boolean m7096u() {
        return ((Boolean) this.f28469U.mo10298b(this, f28448W[46])).booleanValue();
    }

    /* renamed from: v */
    public boolean m7095v() {
        return ((Boolean) this.f28479i.mo10298b(this, f28448W[7])).booleanValue();
    }

    /* renamed from: w */
    public InterfaceC12620b m7094w() {
        return (InterfaceC12620b) this.f28472b.mo10298b(this, f28448W[0]);
    }

    /* renamed from: x */
    public InterfaceC11767l<InterfaceC13307c1, String> m7093x() {
        return (InterfaceC11767l) this.f28495y.mo10298b(this, f28448W[23]);
    }

    /* renamed from: y */
    public boolean m7092y() {
        return ((Boolean) this.f28457I.mo10298b(this, f28448W[33])).booleanValue();
    }

    /* renamed from: z */
    public Set<C12609c> m7091z() {
        return (Set) this.f28458J.mo10298b(this, f28448W[34]);
    }
}
