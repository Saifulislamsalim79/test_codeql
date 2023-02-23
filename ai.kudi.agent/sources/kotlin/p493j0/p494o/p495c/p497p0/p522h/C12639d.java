package kotlin.p493j0.p494o.p495c.p497p0.p522h;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.C13668y;
import kotlin.InterfaceC11824h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12045g;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12705a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12707b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12731q;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13011i1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12955a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12992f1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13064l0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13116s;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m.C13176a;
import kotlin.p549l0.C13252b;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p549l0.C13282v;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.p557z.C13745z0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13296a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13514m0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13547v;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.EnumC13343e;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: DescriptorRendererImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.h.d */
/* loaded from: classes3.dex */
public final class C12639d extends AbstractC12624c implements InterfaceC12650f {

    /* renamed from: d */
    private final C12652g f28418d;

    /* renamed from: e */
    private final InterfaceC11824h f28419e;

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$a */
    /* loaded from: classes3.dex */
    private final class C12640a implements InterfaceC13517o<C13666w, StringBuilder> {

        /* renamed from: a */
        final /* synthetic */ C12639d f28420a;

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.j0.o.c.p0.h.d$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C12641a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28421a;

            static {
                int[] iArr = new int[EnumC12660l.values().length];
                iArr[EnumC12660l.PRETTY.ordinal()] = 1;
                iArr[EnumC12660l.DEBUG.ordinal()] = 2;
                iArr[EnumC12660l.NONE.ordinal()] = 3;
                f28421a = iArr;
            }
        }

        public C12640a(C12639d c12639d) {
            l.f(c12639d, "this$0");
            this.f28420a = c12639d;
        }

        /* renamed from: t */
        private final void m7172t(InterfaceC13516n0 interfaceC13516n0, StringBuilder sb, String str) {
            int i = C12641a.f28421a[this.f28420a.m7215m0().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                m7176p(interfaceC13516n0, sb);
                return;
            }
            this.f28420a.m7261S0(interfaceC13516n0, sb);
            sb.append(l.m(str, " for "));
            C12639d c12639d = this.f28420a;
            InterfaceC13518o0 mo4765J0 = interfaceC13516n0.mo4765J0();
            l.e(mo4765J0, "descriptor.correspondingProperty");
            c12639d.m7180z1(mo4765J0, sb);
        }

        /* renamed from: A */
        public void m7179A(InterfaceC13307c1 interfaceC13307c1, StringBuilder sb) {
            l.f(interfaceC13307c1, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7263R1(interfaceC13307c1, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C13666w mo4763a(InterfaceC13312e interfaceC13312e, StringBuilder sb) {
            m7178n(interfaceC13312e, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: b */
        public /* bridge */ /* synthetic */ C13666w mo4762b(InterfaceC13520p0 interfaceC13520p0, StringBuilder sb) {
            m7170v(interfaceC13520p0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C13666w mo4761c(InterfaceC13448k0 interfaceC13448k0, StringBuilder sb) {
            m7173s(interfaceC13448k0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C13666w mo4760d(InterfaceC13518o0 interfaceC13518o0, StringBuilder sb) {
            m7171u(interfaceC13518o0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: e */
        public /* bridge */ /* synthetic */ C13666w mo4759e(InterfaceC13559y0 interfaceC13559y0, StringBuilder sb) {
            m7167y(interfaceC13559y0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: f */
        public /* bridge */ /* synthetic */ C13666w mo4758f(InterfaceC13320f0 interfaceC13320f0, StringBuilder sb) {
            m7174r(interfaceC13320f0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: g */
        public /* bridge */ /* synthetic */ C13666w mo4757g(InterfaceC13554x interfaceC13554x, StringBuilder sb) {
            m7176p(interfaceC13554x, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: h */
        public /* bridge */ /* synthetic */ C13666w mo4756h(InterfaceC13452l interfaceC13452l, StringBuilder sb) {
            m7177o(interfaceC13452l, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: i */
        public /* bridge */ /* synthetic */ C13666w mo4755i(InterfaceC13522q0 interfaceC13522q0, StringBuilder sb) {
            m7169w(interfaceC13522q0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: j */
        public /* bridge */ /* synthetic */ C13666w mo4754j(InterfaceC13305c0 interfaceC13305c0, StringBuilder sb) {
            m7175q(interfaceC13305c0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: k */
        public /* bridge */ /* synthetic */ C13666w mo4753k(InterfaceC13307c1 interfaceC13307c1, StringBuilder sb) {
            m7179A(interfaceC13307c1, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: l */
        public /* bridge */ /* synthetic */ C13666w mo4752l(InterfaceC13524r0 interfaceC13524r0, StringBuilder sb) {
            m7168x(interfaceC13524r0, sb);
            return C13666w.f30112a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: m */
        public /* bridge */ /* synthetic */ C13666w mo4751m(InterfaceC13562z0 interfaceC13562z0, StringBuilder sb) {
            m7166z(interfaceC13562z0, sb);
            return C13666w.f30112a;
        }

        /* renamed from: n */
        public void m7178n(InterfaceC13312e interfaceC13312e, StringBuilder sb) {
            l.f(interfaceC13312e, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7243Y0(interfaceC13312e, sb);
        }

        /* renamed from: o */
        public void m7177o(InterfaceC13452l interfaceC13452l, StringBuilder sb) {
            l.f(interfaceC13452l, "constructorDescriptor");
            l.f(sb, "builder");
            this.f28420a.m7232d1(interfaceC13452l, sb);
        }

        /* renamed from: p */
        public void m7176p(InterfaceC13554x interfaceC13554x, StringBuilder sb) {
            l.f(interfaceC13554x, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7224h1(interfaceC13554x, sb);
        }

        /* renamed from: q */
        public void m7175q(InterfaceC13305c0 interfaceC13305c0, StringBuilder sb) {
            l.f(interfaceC13305c0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7202r1(interfaceC13305c0, sb, true);
        }

        /* renamed from: r */
        public void m7174r(InterfaceC13320f0 interfaceC13320f0, StringBuilder sb) {
            l.f(interfaceC13320f0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7191v1(interfaceC13320f0, sb);
        }

        /* renamed from: s */
        public void m7173s(InterfaceC13448k0 interfaceC13448k0, StringBuilder sb) {
            l.f(interfaceC13448k0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7185x1(interfaceC13448k0, sb);
        }

        /* renamed from: u */
        public void m7171u(InterfaceC13518o0 interfaceC13518o0, StringBuilder sb) {
            l.f(interfaceC13518o0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7180z1(interfaceC13518o0, sb);
        }

        /* renamed from: v */
        public void m7170v(InterfaceC13520p0 interfaceC13520p0, StringBuilder sb) {
            l.f(interfaceC13520p0, "descriptor");
            l.f(sb, "builder");
            m7172t(interfaceC13520p0, sb, "getter");
        }

        /* renamed from: w */
        public void m7169w(InterfaceC13522q0 interfaceC13522q0, StringBuilder sb) {
            l.f(interfaceC13522q0, "descriptor");
            l.f(sb, "builder");
            m7172t(interfaceC13522q0, sb, "setter");
        }

        /* renamed from: x */
        public void m7168x(InterfaceC13524r0 interfaceC13524r0, StringBuilder sb) {
            l.f(interfaceC13524r0, "descriptor");
            l.f(sb, "builder");
            sb.append(interfaceC13524r0.mo5012b());
        }

        /* renamed from: y */
        public void m7167y(InterfaceC13559y0 interfaceC13559y0, StringBuilder sb) {
            l.f(interfaceC13559y0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7293H1(interfaceC13559y0, sb);
        }

        /* renamed from: z */
        public void m7166z(InterfaceC13562z0 interfaceC13562z0, StringBuilder sb) {
            l.f(interfaceC13562z0, "descriptor");
            l.f(sb, "builder");
            this.f28420a.m7278M1(interfaceC13562z0, sb, true);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12642b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28422a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28423b;

        static {
            int[] iArr = new int[EnumC12661m.values().length];
            iArr[EnumC12661m.PLAIN.ordinal()] = 1;
            iArr[EnumC12661m.HTML.ordinal()] = 2;
            f28422a = iArr;
            int[] iArr2 = new int[EnumC12659k.values().length];
            iArr2[EnumC12659k.ALL.ordinal()] = 1;
            iArr2[EnumC12659k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[EnumC12659k.NONE.ordinal()] = 3;
            f28423b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$c */
    /* loaded from: classes3.dex */
    public static final class C12643c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13131v0, CharSequence> {
        C12643c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13131v0 interfaceC13131v0) {
            l.f(interfaceC13131v0, "it");
            if (interfaceC13131v0.mo5757d()) {
                return "*";
            }
            C12639d c12639d = C12639d.this;
            AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
            l.e(mo5758c, "it.type");
            String mo7190w = c12639d.mo7190w(mo5758c);
            if (interfaceC13131v0.mo5760a() == EnumC13008h1.INVARIANT) {
                return mo7190w;
            }
            return interfaceC13131v0.mo5760a() + ' ' + mo7190w;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$d */
    /* loaded from: classes3.dex */
    static final class C12644d extends AbstractC11802m implements InterfaceC11756a<C12639d> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.j0.o.c.p0.h.d$d$a */
        /* loaded from: classes3.dex */
        public static final class C12645a extends AbstractC11802m implements InterfaceC11767l<InterfaceC12650f, C13666w> {

            /* renamed from: c */
            public static final C12645a f28426c = new C12645a();

            C12645a() {
                super(1);
            }

            /* renamed from: a */
            public final void m7163a(InterfaceC12650f interfaceC12650f) {
                List m3901b;
                Set<C12609c> m3769h;
                l.f(interfaceC12650f, "$this$withOptions");
                Set<C12609c> mo7105m = interfaceC12650f.mo7105m();
                m3901b = C13724q.m3901b(C12059k.C12060a.f26864q);
                m3769h = C13745z0.m3769h(mo7105m, m3901b);
                interfaceC12650f.mo7129a(m3769h);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC12650f interfaceC12650f) {
                m7163a(interfaceC12650f);
                return C13666w.f30112a;
            }
        }

        C12644d() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12639d invoke() {
            return (C12639d) C12639d.this.m7333y(C12645a.f28426c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$e */
    /* loaded from: classes3.dex */
    public static final class C12646e extends AbstractC11802m implements InterfaceC11767l<AbstractC12712g<?>, CharSequence> {
        C12646e() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(AbstractC12712g<?> abstractC12712g) {
            l.f(abstractC12712g, "it");
            return C12639d.this.m7234c1(abstractC12712g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$f */
    /* loaded from: classes3.dex */
    public static final class C12647f extends AbstractC11802m implements InterfaceC11767l<InterfaceC13307c1, CharSequence> {

        /* renamed from: c */
        public static final C12647f f28428c = new C12647f();

        C12647f() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13307c1 interfaceC13307c1) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.h.d$g */
    /* loaded from: classes3.dex */
    public static final class C12648g extends AbstractC11802m implements InterfaceC11767l<AbstractC12965b0, CharSequence> {
        C12648g() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(AbstractC12965b0 abstractC12965b0) {
            C12639d c12639d = C12639d.this;
            l.e(abstractC12965b0, "it");
            return c12639d.mo7190w(abstractC12965b0);
        }
    }

    public C12639d(C12652g c12652g) {
        InterfaceC11824h m5625b;
        l.f(c12652g, "options");
        this.f28418d = c12652g;
        boolean m7108k0 = c12652g.m7108k0();
        if (C13668y.f30115a && !m7108k0) {
            throw new AssertionError("Assertion failed");
        }
        m5625b = C13218k.m5625b(new C12644d());
        this.f28419e = m5625b;
    }

    /* renamed from: A1 */
    private final void m7314A1(InterfaceC13518o0 interfaceC13518o0, StringBuilder sb) {
        if (m7229f0().contains(EnumC12649e.ANNOTATIONS)) {
            m7249W0(this, sb, interfaceC13518o0, null, 2, null);
            InterfaceC13547v mo4750A0 = interfaceC13518o0.mo4750A0();
            if (mo4750A0 != null) {
                m7252V0(sb, mo4750A0, EnumC13343e.FIELD);
            }
            InterfaceC13547v mo4746x0 = interfaceC13518o0.mo4746x0();
            if (mo4746x0 != null) {
                m7252V0(sb, mo4746x0, EnumC13343e.PROPERTY_DELEGATE_FIELD);
            }
            if (m7215m0() == EnumC12660l.NONE) {
                InterfaceC13520p0 mo4747q = interfaceC13518o0.mo4747q();
                if (mo4747q != null) {
                    m7252V0(sb, mo4747q, EnumC13343e.PROPERTY_GETTER);
                }
                InterfaceC13522q0 mo4748i0 = interfaceC13518o0.mo4748i0();
                if (mo4748i0 == null) {
                    return;
                }
                m7252V0(sb, mo4748i0, EnumC13343e.PROPERTY_SETTER);
                List<InterfaceC13307c1> mo5072k = mo4748i0.mo5072k();
                l.e(mo5072k, "setter.valueParameters");
                InterfaceC13307c1 interfaceC13307c1 = (InterfaceC13307c1) C13722p.m3918q0(mo5072k);
                l.e(interfaceC13307c1, "it");
                m7252V0(sb, interfaceC13307c1, EnumC13343e.SETTER_PARAMETER);
            }
        }
    }

    /* renamed from: B1 */
    private final void m7311B1(InterfaceC13293a interfaceC13293a, StringBuilder sb) {
        InterfaceC13524r0 mo5056w0 = interfaceC13293a.mo5056w0();
        if (mo5056w0 != null) {
            m7252V0(sb, mo5056w0, EnumC13343e.RECEIVER);
            AbstractC12965b0 mo5121c = mo5056w0.mo5121c();
            l.e(mo5121c, "receiver.type");
            String mo7190w = mo7190w(mo5121c);
            if (m7245X1(mo5121c) && !C12974c1.m6290l(mo5121c)) {
                mo7190w = '(' + mo7190w + ')';
            }
            sb.append(mo7190w);
            sb.append(".");
        }
    }

    /* renamed from: C1 */
    private final void m7308C1(InterfaceC13293a interfaceC13293a, StringBuilder sb) {
        InterfaceC13524r0 mo5056w0;
        if (m7213n0() && (mo5056w0 = interfaceC13293a.mo5056w0()) != null) {
            sb.append(" on ");
            AbstractC12965b0 mo5121c = mo5056w0.mo5121c();
            l.e(mo5121c, "receiver.type");
            sb.append(mo7190w(mo5121c));
        }
    }

    /* renamed from: D1 */
    private final void m7305D1(StringBuilder sb, AbstractC13010i0 abstractC13010i0) {
        if (!l.b(abstractC13010i0, C12974c1.f29040b) && !C12974c1.m6291k(abstractC13010i0)) {
            if (C13118t.m5801t(abstractC13010i0)) {
                if (m7309C0()) {
                    String c12614f = ((C13118t.C13124f) abstractC13010i0.mo5779W0()).m5791h().mo5012b().toString();
                    l.e(c12614f, "type.constructor as UninferredParameterTypeConstructor).typeParameterDescriptor.name.toString()");
                    sb.append(m7228f1(c12614f));
                    return;
                }
                sb.append("???");
                return;
            } else if (C12977d0.m6274a(abstractC13010i0)) {
                m7230e1(sb, abstractC13010i0);
                return;
            } else if (m7245X1(abstractC13010i0)) {
                m7222i1(sb, abstractC13010i0);
                return;
            } else {
                m7230e1(sb, abstractC13010i0);
                return;
            }
        }
        sb.append("???");
    }

    /* renamed from: E1 */
    private final void m7302E1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: F1 */
    private final void m7299F1(InterfaceC13312e interfaceC13312e, StringBuilder sb) {
        if (m7288J0() || AbstractC12046h.m9887k0(interfaceC13312e.mo5010x())) {
            return;
        }
        Collection<AbstractC12965b0> mo5218a = interfaceC13312e.mo4649n().mo5218a();
        l.e(mo5218a, "klass.typeConstructor.supertypes");
        if (mo5218a.isEmpty()) {
            return;
        }
        if (mo5218a.size() == 1 && AbstractC12046h.m9906a0(mo5218a.iterator().next())) {
            return;
        }
        m7302E1(sb);
        sb.append(": ");
        C13742z.m3799Y(mo5218a, sb, ", ", null, null, 0, null, new C12648g(), 60, null);
    }

    /* renamed from: G1 */
    private final void m7296G1(InterfaceC13554x interfaceC13554x, StringBuilder sb) {
        m7205q1(sb, interfaceC13554x.mo4692G0(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m7293H1(InterfaceC13559y0 interfaceC13559y0, StringBuilder sb) {
        m7249W0(this, sb, interfaceC13559y0, null, 2, null);
        AbstractC13544u mo4659i = interfaceC13559y0.mo4659i();
        l.e(mo4659i, "typeAlias.visibility");
        m7254U1(mo4659i, sb);
        m7214m1(interfaceC13559y0, sb);
        sb.append(m7218k1("typealias"));
        sb.append(" ");
        m7202r1(interfaceC13559y0, sb, true);
        List<InterfaceC13562z0> mo4975B = interfaceC13559y0.mo4975B();
        l.e(mo4975B, "typeAlias.declaredTypeParameters");
        m7272O1(mo4975B, sb, false);
        m7246X0(interfaceC13559y0, sb);
        sb.append(" = ");
        sb.append(mo7190w(interfaceC13559y0.mo4656q0()));
    }

    /* renamed from: K1 */
    private final void m7284K1(StringBuilder sb, AbstractC12965b0 abstractC12965b0, InterfaceC13125t0 interfaceC13125t0) {
        C13514m0 m5354a = C13296a1.m5354a(abstractC12965b0);
        if (m5354a == null) {
            sb.append(m7287J1(interfaceC13125t0));
            sb.append(m7290I1(abstractC12965b0.mo5780V0()));
            return;
        }
        m7183y1(sb, m5354a);
    }

    /* renamed from: L */
    private final void m7283L(StringBuilder sb, InterfaceC13513m interfaceC13513m) {
        String mo4704b;
        if ((interfaceC13513m instanceof InterfaceC13320f0) || (interfaceC13513m instanceof InterfaceC13448k0)) {
            return;
        }
        if (interfaceC13513m instanceof InterfaceC13305c0) {
            sb.append(" is a module");
            return;
        }
        InterfaceC13513m mo4687d = interfaceC13513m.mo4687d();
        if (mo4687d == null || (mo4687d instanceof InterfaceC13305c0)) {
            return;
        }
        sb.append(" ");
        sb.append(m7212n1("defined in"));
        sb.append(" ");
        C12610d m7022m = C12673d.m7022m(mo4687d);
        l.e(m7022m, "getFqName(containingDeclaration)");
        sb.append(m7022m.m7368e() ? "root package" : mo7196u(m7022m));
        if (m7294H0() && (mo4687d instanceof InterfaceC13320f0) && (interfaceC13513m instanceof InterfaceC13519p) && (mo4704b = ((InterfaceC13519p) interfaceC13513m).mo4745m().mo4706a().mo4704b()) != null) {
            sb.append(" ");
            sb.append(m7212n1("in file"));
            sb.append(" ");
            sb.append(mo4704b);
        }
    }

    /* renamed from: L0 */
    private final String m7282L0() {
        return m7271P(">");
    }

    /* renamed from: L1 */
    static /* synthetic */ void m7281L1(C12639d c12639d, StringBuilder sb, AbstractC12965b0 abstractC12965b0, InterfaceC13125t0 interfaceC13125t0, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC13125t0 = abstractC12965b0.mo5779W0();
        }
        c12639d.m7284K1(sb, abstractC12965b0, interfaceC13125t0);
    }

    /* renamed from: M */
    private final void m7280M(StringBuilder sb, List<? extends InterfaceC13131v0> list) {
        C13742z.m3799Y(list, sb, ", ", null, null, 0, null, new C12643c(), 60, null);
    }

    /* renamed from: M0 */
    private final boolean m7279M0(AbstractC12965b0 abstractC12965b0) {
        return C12045g.m9937o(abstractC12965b0) || !abstractC12965b0.mo4956y().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m7278M1(InterfaceC13562z0 interfaceC13562z0, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m7270P0());
        }
        if (m7300F0()) {
            sb.append("/*");
            sb.append(interfaceC13562z0.mo4650h());
            sb.append("*/ ");
        }
        m7205q1(sb, interfaceC13562z0.mo4652L(), "reified");
        String m6205e = interfaceC13562z0.mo4648r().m6205e();
        boolean z2 = true;
        m7205q1(sb, m6205e.length() > 0, m6205e);
        m7249W0(this, sb, interfaceC13562z0, null, 2, null);
        m7202r1(interfaceC13562z0, sb, z);
        int size = interfaceC13562z0.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC12965b0 next = interfaceC13562z0.getUpperBounds().iterator().next();
            if (!AbstractC12046h.m9895g0(next)) {
                sb.append(" : ");
                l.e(next, "upperBound");
                sb.append(mo7190w(next));
            }
        } else if (z) {
            for (AbstractC12965b0 abstractC12965b0 : interfaceC13562z0.getUpperBounds()) {
                if (!AbstractC12046h.m9895g0(abstractC12965b0)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    l.e(abstractC12965b0, "upperBound");
                    sb.append(mo7190w(abstractC12965b0));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m7282L0());
        }
    }

    /* renamed from: N */
    private final String m7277N() {
        int i = C12642b.f28422a[m7315A0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "&rarr;";
            }
            throw new NoWhenBranchMatchedException();
        }
        return m7271P("->");
    }

    /* renamed from: N0 */
    private final EnumC13560z m7276N0(InterfaceC13558y interfaceC13558y) {
        if (interfaceC13558y instanceof InterfaceC13312e) {
            return ((InterfaceC13312e) interfaceC13558y).mo4957w() == EnumC13319f.INTERFACE ? EnumC13560z.ABSTRACT : EnumC13560z.FINAL;
        }
        InterfaceC13513m mo4687d = interfaceC13558y.mo4687d();
        InterfaceC13312e interfaceC13312e = mo4687d instanceof InterfaceC13312e ? (InterfaceC13312e) mo4687d : null;
        if (interfaceC13312e != null && (interfaceC13558y instanceof InterfaceC13300b)) {
            InterfaceC13300b interfaceC13300b = (InterfaceC13300b) interfaceC13558y;
            Collection<? extends InterfaceC13300b> mo4685g = interfaceC13300b.mo4685g();
            l.e(mo4685g, "this.overriddenDescriptors");
            if (!(!mo4685g.isEmpty()) || interfaceC13312e.mo4658o() == EnumC13560z.FINAL) {
                if (interfaceC13312e.mo4957w() == EnumC13319f.INTERFACE && !l.b(interfaceC13300b.mo4659i(), C13530t.f29888a)) {
                    EnumC13560z mo4658o = interfaceC13300b.mo4658o();
                    EnumC13560z enumC13560z = EnumC13560z.ABSTRACT;
                    return mo4658o == enumC13560z ? enumC13560z : EnumC13560z.OPEN;
                }
                return EnumC13560z.FINAL;
            }
            return EnumC13560z.OPEN;
        }
        return EnumC13560z.FINAL;
    }

    /* renamed from: N1 */
    private final void m7275N1(StringBuilder sb, List<? extends InterfaceC13562z0> list) {
        Iterator<? extends InterfaceC13562z0> it = list.iterator();
        while (it.hasNext()) {
            m7278M1(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: O */
    private final boolean m7274O(String str, String str2) {
        String m5451A;
        boolean m5443r;
        m5451A = C13276s.m5451A(str2, "?", "", false, 4, null);
        if (!l.b(str, m5451A)) {
            m5443r = C13276s.m5443r(str2, "?", false, 2, null);
            if (!m5443r || !l.b(l.m(str, "?"), str2)) {
                if (!l.b('(' + str + ")?", str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: O0 */
    private final boolean m7273O0(InterfaceC13340c interfaceC13340c) {
        return l.b(interfaceC13340c.mo5309f(), C12059k.C12060a.f26865r);
    }

    /* renamed from: O1 */
    private final void m7272O1(List<? extends InterfaceC13562z0> list, StringBuilder sb, boolean z) {
        if (!m7285K0() && (!list.isEmpty())) {
            sb.append(m7270P0());
            m7275N1(sb, list);
            sb.append(m7282L0());
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: P */
    private final String m7271P(String str) {
        return m7315A0().mo7082b(str);
    }

    /* renamed from: P0 */
    private final String m7270P0() {
        return m7271P("<");
    }

    /* renamed from: P1 */
    private final void m7269P1(InterfaceC13311d1 interfaceC13311d1, StringBuilder sb, boolean z) {
        if (z || !(interfaceC13311d1 instanceof InterfaceC13307c1)) {
            sb.append(m7218k1(interfaceC13311d1.mo5093t0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* renamed from: Q0 */
    private final boolean m7267Q0(InterfaceC13300b interfaceC13300b) {
        return !interfaceC13300b.mo4685g().isEmpty();
    }

    /* renamed from: Q1 */
    static /* synthetic */ void m7266Q1(C12639d c12639d, InterfaceC13311d1 interfaceC13311d1, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c12639d.m7269P1(interfaceC13311d1, sb, z);
    }

    /* renamed from: R0 */
    private final void m7264R0(StringBuilder sb, C12955a c12955a) {
        if (m7315A0() == EnumC12661m.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        m7197t1(sb, c12955a.m6361e0());
        sb.append(" */");
        if (m7315A0() == EnumC12661m.HTML) {
            sb.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        if ((mo7103n() ? r10.mo5138D0() : kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a.m6869a(r10)) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: R1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7263R1(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m7218k1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.m7300F0()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.mo5133h()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m7249W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo5132l0()
            java.lang.String r1 = "crossinline"
            r9.m7205q1(r12, r0, r1)
            boolean r0 = r10.mo5134g0()
            java.lang.String r1 = "noinline"
            r9.m7205q1(r12, r0, r1)
            boolean r0 = r9.m7195u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.mo4687d()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d
            r4 = 0
            if (r3 == 0) goto L56
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d) r0
            goto L57
        L56:
            r0 = r4
        L57:
            if (r0 != 0) goto L5a
            goto L62
        L5a:
            boolean r0 = r0.mo4945H()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.e0.d.l.b(r4, r0)
            if (r0 == 0) goto L6c
            r8 = 1
            goto L6d
        L6c:
            r8 = 0
        L6d:
            if (r8 == 0) goto L78
            boolean r0 = r9.m7268Q()
            java.lang.String r3 = "actual"
            r9.m7205q1(r12, r0, r3)
        L78:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.m7257T1(r4, r5, r6, r7, r8)
            kotlin.e0.c.l r11 = r9.m7250W()
            if (r11 == 0) goto L98
            boolean r11 = r9.mo7103n()
            if (r11 == 0) goto L91
            boolean r11 = r10.mo5138D0()
            goto L95
        L91:
            boolean r11 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a.m6869a(r10)
        L95:
            if (r11 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            if (r1 == 0) goto Laf
            kotlin.e0.c.l r11 = r9.m7250W()
            kotlin.e0.d.l.d(r11)
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.String r11 = " = "
            java.lang.String r10 = kotlin.e0.d.l.m(r11, r10)
            r12.append(r10)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p522h.C12639d.m7263R1(kotlin.reflect.jvm.internal.impl.descriptors.c1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m7261S0(InterfaceC13516n0 interfaceC13516n0, StringBuilder sb) {
        m7214m1(interfaceC13516n0, sb);
    }

    /* renamed from: S1 */
    private final void m7260S1(Collection<? extends InterfaceC13307c1> collection, boolean z, StringBuilder sb) {
        boolean m7242Y1 = m7242Y1(z);
        int size = collection.size();
        m7303E0().mo7319b(size, sb);
        int i = 0;
        for (InterfaceC13307c1 interfaceC13307c1 : collection) {
            m7303E0().mo7320a(interfaceC13307c1, i, size, sb);
            m7263R1(interfaceC13307c1, m7242Y1, sb, false);
            m7303E0().mo7317d(interfaceC13307c1, i, size, sb);
            i++;
        }
        m7303E0().mo7318c(size, sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m7258T0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.mo4688Y()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.util.Collection r0 = r6.mo4685g()
            kotlin.e0.d.l.e(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L19
        L17:
            r0 = 1
            goto L30
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.x r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x) r4
            boolean r4 = r4.mo4688Y()
            if (r4 == 0) goto L1d
            r0 = 0
        L30:
            if (r0 != 0) goto L38
            boolean r0 = r5.m7265R()
            if (r0 == 0) goto L3a
        L38:
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            boolean r4 = r6.mo4690P0()
            if (r4 == 0) goto L70
            java.util.Collection r4 = r6.mo4685g()
            kotlin.e0.d.l.e(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L50
        L4e:
            r1 = 1
            goto L67
        L50:
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.x r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x) r4
            boolean r4 = r4.mo4690P0()
            if (r4 == 0) goto L54
            r1 = 0
        L67:
            if (r1 != 0) goto L6f
            boolean r1 = r5.m7265R()
            if (r1 == 0) goto L70
        L6f:
            r2 = 1
        L70:
            boolean r1 = r6.mo4689X()
            java.lang.String r3 = "tailrec"
            r5.m7205q1(r7, r1, r3)
            r5.m7296G1(r6, r7)
            boolean r6 = r6.mo4683z()
            java.lang.String r1 = "inline"
            r5.m7205q1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.m7205q1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.m7205q1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p522h.C12639d.m7258T0(kotlin.reflect.jvm.internal.impl.descriptors.x, java.lang.StringBuilder):void");
    }

    /* renamed from: T1 */
    private final void m7257T1(InterfaceC13311d1 interfaceC13311d1, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        AbstractC12965b0 mo5121c = interfaceC13311d1.mo5121c();
        l.e(mo5121c, "variable.type");
        InterfaceC13307c1 interfaceC13307c1 = interfaceC13311d1 instanceof InterfaceC13307c1 ? (InterfaceC13307c1) interfaceC13311d1 : null;
        AbstractC12965b0 mo5131v0 = interfaceC13307c1 != null ? interfaceC13307c1.mo5131v0() : null;
        AbstractC12965b0 abstractC12965b0 = mo5131v0 == null ? mo5121c : mo5131v0;
        m7205q1(sb, mo5131v0 != null, "vararg");
        if (z3 || (z2 && !m7181z0())) {
            m7269P1(interfaceC13311d1, sb, z3);
        }
        if (z) {
            m7202r1(interfaceC13311d1, sb, z2);
            sb.append(": ");
        }
        sb.append(mo7190w(abstractC12965b0));
        m7220j1(interfaceC13311d1, sb);
        if (!m7300F0() || mo5131v0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(mo7190w(mo5121c));
        sb.append("*/");
    }

    /* renamed from: U0 */
    private final List<String> m7255U0(InterfaceC13340c interfaceC13340c) {
        InterfaceC13309d mo4962Z;
        int m3867o;
        int m3867o2;
        List m3784n0;
        List<String> m3778t0;
        int m3867o3;
        Map<C12614f, AbstractC12712g<?>> mo5312a = interfaceC13340c.mo5312a();
        List list = null;
        InterfaceC13312e m6864f = m7203r0() ? C12747a.m6864f(interfaceC13340c) : null;
        List<InterfaceC13307c1> mo5072k = (m6864f == null || (mo4962Z = m6864f.mo4962Z()) == null) ? null : mo4962Z.mo5072k();
        if (mo5072k != null) {
            ArrayList<InterfaceC13307c1> arrayList = new ArrayList();
            for (Object obj : mo5072k) {
                if (((InterfaceC13307c1) obj).mo5138D0()) {
                    arrayList.add(obj);
                }
            }
            m3867o3 = C13728s.m3867o(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m3867o3);
            for (InterfaceC13307c1 interfaceC13307c1 : arrayList) {
                arrayList2.add(interfaceC13307c1.mo5012b());
            }
            list = arrayList2;
        }
        if (list == null) {
            list = C13726r.m3891e();
        }
        ArrayList<C12614f> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            C12614f c12614f = (C12614f) obj2;
            l.e(c12614f, "it");
            if (!mo5312a.containsKey(c12614f)) {
                arrayList3.add(obj2);
            }
        }
        m3867o = C13728s.m3867o(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(m3867o);
        for (C12614f c12614f2 : arrayList3) {
            arrayList4.add(l.m(c12614f2.m7353b(), " = ..."));
        }
        Set<Map.Entry<C12614f, AbstractC12712g<?>>> entrySet = mo5312a.entrySet();
        m3867o2 = C13728s.m3867o(entrySet, 10);
        ArrayList arrayList5 = new ArrayList(m3867o2);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C12614f c12614f3 = (C12614f) entry.getKey();
            AbstractC12712g<?> abstractC12712g = (AbstractC12712g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(c12614f3.m7353b());
            sb.append(" = ");
            sb.append(!list.contains(c12614f3) ? m7234c1(abstractC12712g) : "...");
            arrayList5.add(sb.toString());
        }
        m3784n0 = C13742z.m3784n0(arrayList4, arrayList5);
        m3778t0 = C13742z.m3778t0(m3784n0);
        return m3778t0;
    }

    /* renamed from: U1 */
    private final boolean m7254U1(AbstractC13544u abstractC13544u, StringBuilder sb) {
        if (m7229f0().contains(EnumC12649e.VISIBILITY)) {
            if (m7227g0()) {
                abstractC13544u = abstractC13544u.mo4707f();
            }
            if (m7198t0() || !l.b(abstractC13544u, C13530t.f29897j)) {
                sb.append(m7218k1(abstractC13544u.mo4710c()));
                sb.append(" ");
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: V0 */
    private final void m7252V0(StringBuilder sb, InterfaceC13338a interfaceC13338a, EnumC13343e enumC13343e) {
        boolean m3814J;
        if (m7229f0().contains(EnumC12649e.ANNOTATIONS)) {
            Set<C12609c> mo7105m = interfaceC13338a instanceof AbstractC12965b0 ? mo7105m() : m7244Y();
            InterfaceC11767l<InterfaceC13340c, Boolean> m7262S = m7262S();
            for (InterfaceC13340c interfaceC13340c : interfaceC13338a.mo4956y()) {
                m3814J = C13742z.m3814J(mo7105m, interfaceC13340c.mo5309f());
                if (!m3814J && !m7273O0(interfaceC13340c) && (m7262S == null || m7262S.invoke(interfaceC13340c).booleanValue())) {
                    sb.append(mo7204r(interfaceC13340c, enumC13343e));
                    if (m7247X()) {
                        sb.append('\n');
                        l.e(sb, "append('\\n')");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* renamed from: V1 */
    private final void m7251V1(List<? extends InterfaceC13562z0> list, StringBuilder sb) {
        List<AbstractC12965b0> m3812L;
        if (m7285K0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC13562z0 interfaceC13562z0 : list) {
            List<AbstractC12965b0> upperBounds = interfaceC13562z0.getUpperBounds();
            l.e(upperBounds, "typeParameter.upperBounds");
            m3812L = C13742z.m3812L(upperBounds, 1);
            for (AbstractC12965b0 abstractC12965b0 : m3812L) {
                StringBuilder sb2 = new StringBuilder();
                C12614f mo5012b = interfaceC13562z0.mo5012b();
                l.e(mo5012b, "typeParameter.name");
                sb2.append(mo7193v(mo5012b, false));
                sb2.append(" : ");
                l.e(abstractC12965b0, "it");
                sb2.append(mo7190w(abstractC12965b0));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(m7218k1("where"));
            sb.append(" ");
            C13742z.m3799Y(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
        }
    }

    /* renamed from: W0 */
    static /* synthetic */ void m7249W0(C12639d c12639d, StringBuilder sb, InterfaceC13338a interfaceC13338a, EnumC13343e enumC13343e, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC13343e = null;
        }
        c12639d.m7252V0(sb, interfaceC13338a, enumC13343e);
    }

    /* renamed from: W1 */
    private final String m7248W1(String str, String str2, String str3, String str4, String str5) {
        boolean m5447E;
        boolean m5447E2;
        m5447E = C13276s.m5447E(str, str2, false, 2, null);
        if (m5447E) {
            m5447E2 = C13276s.m5447E(str3, str4, false, 2, null);
            if (m5447E2) {
                int length = str2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    l.e(substring, "(this as java.lang.String).substring(startIndex)");
                    int length2 = str4.length();
                    if (str3 != null) {
                        String substring2 = str3.substring(length2);
                        l.e(substring2, "(this as java.lang.String).substring(startIndex)");
                        String m = l.m(str5, substring);
                        if (l.b(substring, substring2)) {
                            return m;
                        }
                        if (m7274O(substring, substring2)) {
                            return l.m(m, "!");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return null;
    }

    /* renamed from: X0 */
    private final void m7246X0(InterfaceC13360i interfaceC13360i, StringBuilder sb) {
        List<InterfaceC13562z0> mo4975B = interfaceC13360i.mo4975B();
        l.e(mo4975B, "classifier.declaredTypeParameters");
        List<InterfaceC13562z0> mo5207c = interfaceC13360i.mo4649n().mo5207c();
        l.e(mo5207c, "classifier.typeConstructor.parameters");
        if (m7300F0() && interfaceC13360i.mo4967U() && mo5207c.size() > mo4975B.size()) {
            sb.append(" /*captured type parameters: ");
            m7275N1(sb, mo5207c.subList(mo4975B.size(), mo5207c.size()));
            sb.append("*/");
        }
    }

    /* renamed from: X1 */
    private final boolean m7245X1(AbstractC12965b0 abstractC12965b0) {
        boolean z;
        if (C12045g.m9939m(abstractC12965b0)) {
            List<InterfaceC13131v0> mo5780V0 = abstractC12965b0.mo5780V0();
            if (!(mo5780V0 instanceof Collection) || !mo5780V0.isEmpty()) {
                for (InterfaceC13131v0 interfaceC13131v0 : mo5780V0) {
                    if (interfaceC13131v0.mo5757d()) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m7243Y0(InterfaceC13312e interfaceC13312e, StringBuilder sb) {
        InterfaceC13309d mo4962Z;
        boolean z = interfaceC13312e.mo4957w() == EnumC13319f.ENUM_ENTRY;
        if (!m7181z0()) {
            m7249W0(this, sb, interfaceC13312e, null, 2, null);
            if (!z) {
                AbstractC13544u mo4659i = interfaceC13312e.mo4659i();
                l.e(mo4659i, "klass.visibility");
                m7254U1(mo4659i, sb);
            }
            if ((interfaceC13312e.mo4957w() != EnumC13319f.INTERFACE || interfaceC13312e.mo4658o() != EnumC13560z.ABSTRACT) && (!interfaceC13312e.mo4957w().m5332a() || interfaceC13312e.mo4658o() != EnumC13560z.FINAL)) {
                EnumC13560z mo4658o = interfaceC13312e.mo4658o();
                l.e(mo4658o, "klass.modality");
                m7210o1(mo4658o, sb, m7276N0(interfaceC13312e));
            }
            m7214m1(interfaceC13312e, sb);
            m7205q1(sb, m7229f0().contains(EnumC12649e.INNER) && interfaceC13312e.mo4967U(), "inner");
            m7205q1(sb, m7229f0().contains(EnumC12649e.DATA) && interfaceC13312e.mo4968R0(), TransactionBreakDownItemType.DATA);
            m7205q1(sb, m7229f0().contains(EnumC12649e.INLINE) && interfaceC13312e.mo4955z(), "inline");
            m7205q1(sb, m7229f0().contains(EnumC12649e.VALUE) && interfaceC13312e.mo4970Q(), "value");
            m7205q1(sb, m7229f0().contains(EnumC12649e.FUN) && interfaceC13312e.mo4973J(), "fun");
            m7240Z0(interfaceC13312e, sb);
        }
        if (!C12673d.m7011x(interfaceC13312e)) {
            if (!m7181z0()) {
                m7302E1(sb);
            }
            m7202r1(interfaceC13312e, sb, true);
        } else {
            m7236b1(interfaceC13312e, sb);
        }
        if (z) {
            return;
        }
        List<InterfaceC13562z0> mo4975B = interfaceC13312e.mo4975B();
        l.e(mo4975B, "klass.declaredTypeParameters");
        m7272O1(mo4975B, sb, false);
        m7246X0(interfaceC13312e, sb);
        if (!interfaceC13312e.mo4957w().m5332a() && m7256U() && (mo4962Z = interfaceC13312e.mo4962Z()) != null) {
            sb.append(" ");
            m7249W0(this, sb, mo4962Z, null, 2, null);
            AbstractC13544u mo4659i2 = mo4962Z.mo4659i();
            l.e(mo4659i2, "primaryConstructor.visibility");
            m7254U1(mo4659i2, sb);
            sb.append(m7218k1("constructor"));
            List<InterfaceC13307c1> mo5072k = mo4962Z.mo5072k();
            l.e(mo5072k, "primaryConstructor.valueParameters");
            m7260S1(mo5072k, mo4962Z.mo5091M(), sb);
        }
        m7299F1(interfaceC13312e, sb);
        m7251V1(mo4975B, sb);
    }

    /* renamed from: Y1 */
    private final boolean m7242Y1(boolean z) {
        int i = C12642b.f28423b[m7221j0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Z */
    private final C12639d m7241Z() {
        return (C12639d) this.f28419e.getValue();
    }

    /* renamed from: Z0 */
    private final void m7240Z0(InterfaceC13312e interfaceC13312e, StringBuilder sb) {
        sb.append(m7218k1(AbstractC12624c.f28403a.m7322a(interfaceC13312e)));
    }

    /* renamed from: b1 */
    private final void m7236b1(InterfaceC13513m interfaceC13513m, StringBuilder sb) {
        if (m7211o0()) {
            if (m7181z0()) {
                sb.append("companion object");
            }
            m7302E1(sb);
            InterfaceC13513m mo4687d = interfaceC13513m.mo4687d();
            if (mo4687d != null) {
                sb.append("of ");
                C12614f mo5012b = mo4687d.mo5012b();
                l.e(mo5012b, "containingDeclaration.name");
                sb.append(mo7193v(mo5012b, false));
            }
        }
        if (m7300F0() || !l.b(interfaceC13513m.mo5012b(), C12616h.f28388b)) {
            if (!m7181z0()) {
                m7302E1(sb);
            }
            C12614f mo5012b2 = interfaceC13513m.mo5012b();
            l.e(mo5012b2, "descriptor.name");
            sb.append(mo7193v(mo5012b2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public final String m7234c1(AbstractC12712g<?> abstractC12712g) {
        String m5390k0;
        String m3797a0;
        if (abstractC12712g instanceof C12707b) {
            m3797a0 = C13742z.m3797a0(((C12707b) abstractC12712g).mo6905b(), ", ", "{", "}", 0, null, new C12646e(), 24, null);
            return m3797a0;
        } else if (abstractC12712g instanceof C12705a) {
            m5390k0 = C13277t.m5390k0(AbstractC12624c.m7334s(this, ((C12705a) abstractC12712g).mo6905b(), null, 2, null), "@");
            return m5390k0;
        } else if (abstractC12712g instanceof C12731q) {
            C12731q.AbstractC12733b mo6905b = ((C12731q) abstractC12712g).mo6905b();
            if (mo6905b instanceof C12731q.AbstractC12733b.C12734a) {
                return ((C12731q.AbstractC12733b.C12734a) mo6905b).m6880a() + "::class";
            } else if (mo6905b instanceof C12731q.AbstractC12733b.C12735b) {
                C12731q.AbstractC12733b.C12735b c12735b = (C12731q.AbstractC12733b.C12735b) mo6905b;
                String m7382b = c12735b.m6878b().m7395b().m7382b();
                l.e(m7382b, "classValue.classId.asSingleFqName().asString()");
                for (int i = 0; i < c12735b.m6879a(); i++) {
                    m7382b = "kotlin.Array<" + m7382b + '>';
                }
                return l.m(m7382b, "::class");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            return abstractC12712g.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7232d1(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p522h.C12639d.m7232d1(kotlin.reflect.jvm.internal.impl.descriptors.l, java.lang.StringBuilder):void");
    }

    /* renamed from: e1 */
    private final void m7230e1(StringBuilder sb, AbstractC12965b0 abstractC12965b0) {
        m7249W0(this, sb, abstractC12965b0, null, 2, null);
        if (C12977d0.m6274a(abstractC12965b0)) {
            if ((abstractC12965b0 instanceof C12992f1) && m7217l0()) {
                sb.append(((C12992f1) abstractC12965b0).mo5824f1());
            } else if ((abstractC12965b0 instanceof C13116s) && !m7231e0()) {
                sb.append(((C13116s) abstractC12965b0).mo5824f1());
            } else {
                sb.append(abstractC12965b0.mo5779W0().toString());
            }
            sb.append(m7290I1(abstractC12965b0.mo5780V0()));
        } else {
            m7281L1(this, sb, abstractC12965b0, null, 2, null);
        }
        if (abstractC12965b0.mo5778X0()) {
            sb.append("?");
        }
        if (C13064l0.m6015c(abstractC12965b0)) {
            sb.append("!!");
        }
    }

    /* renamed from: f1 */
    private final String m7228f1(String str) {
        int i = C12642b.f28422a[m7315A0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "<font color=red><b>" + str + "</b></font>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    /* renamed from: g1 */
    private final String m7226g1(List<C12614f> list) {
        return m7271P(C12664n.m7079c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public final void m7224h1(InterfaceC13554x interfaceC13554x, StringBuilder sb) {
        if (!m7181z0()) {
            if (!m7184y0()) {
                m7249W0(this, sb, interfaceC13554x, null, 2, null);
                AbstractC13544u mo4659i = interfaceC13554x.mo4659i();
                l.e(mo4659i, "function.visibility");
                m7254U1(mo4659i, sb);
                m7208p1(interfaceC13554x, sb);
                if (m7239a0()) {
                    m7214m1(interfaceC13554x, sb);
                }
                m7194u1(interfaceC13554x, sb);
                if (m7239a0()) {
                    m7258T0(interfaceC13554x, sb);
                } else {
                    m7296G1(interfaceC13554x, sb);
                }
                m7216l1(interfaceC13554x, sb);
                if (m7300F0()) {
                    if (interfaceC13554x.mo4693F0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC13554x.mo4691K0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(m7218k1("fun"));
            sb.append(" ");
            List<InterfaceC13562z0> mo4942l = interfaceC13554x.mo4942l();
            l.e(mo4942l, "function.typeParameters");
            m7272O1(mo4942l, sb, true);
            m7311B1(interfaceC13554x, sb);
        }
        m7202r1(interfaceC13554x, sb, true);
        List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
        l.e(mo5072k, "function.valueParameters");
        m7260S1(mo5072k, interfaceC13554x.mo5091M(), sb);
        m7308C1(interfaceC13554x, sb);
        AbstractC12965b0 mo4943j = interfaceC13554x.mo4943j();
        if (!m7291I0() && (m7306D0() || mo4943j == null || !AbstractC12046h.m9858z0(mo4943j))) {
            sb.append(": ");
            sb.append(mo4943j == null ? "[NULL]" : mo7190w(mo4943j));
        }
        List<InterfaceC13562z0> mo4942l2 = interfaceC13554x.mo4942l();
        l.e(mo4942l2, "function.typeParameters");
        m7251V1(mo4942l2, sb);
    }

    /* renamed from: i1 */
    private final void m7222i1(StringBuilder sb, AbstractC12965b0 abstractC12965b0) {
        C12614f c12614f;
        char m5370O0;
        boolean m5547c;
        int m5410Q;
        int m5410Q2;
        int length = sb.length();
        m7249W0(m7241Z(), sb, abstractC12965b0, null, 2, null);
        boolean z = true;
        boolean z2 = sb.length() != length;
        boolean m9937o = C12045g.m9937o(abstractC12965b0);
        boolean mo5778X0 = abstractC12965b0.mo5778X0();
        AbstractC12965b0 m9944h = C12045g.m9944h(abstractC12965b0);
        boolean z3 = mo5778X0 || (z2 && m9944h != null);
        if (z3) {
            if (m9937o) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    m5370O0 = C13282v.m5370O0(sb);
                    m5547c = C13252b.m5547c(m5370O0);
                    if (C13668y.f30115a && !m5547c) {
                        throw new AssertionError("Assertion failed");
                    }
                    m5410Q = C13277t.m5410Q(sb);
                    if (sb.charAt(m5410Q - 1) != ')') {
                        m5410Q2 = C13277t.m5410Q(sb);
                        sb.insert(m5410Q2, "()");
                    }
                }
                sb.append("(");
            }
        }
        m7205q1(sb, m9937o, "suspend");
        if (m9944h != null) {
            if ((!m7245X1(m9944h) || m9944h.mo5778X0()) && !m7279M0(m9944h)) {
                z = false;
            }
            if (z) {
                sb.append("(");
            }
            m7200s1(sb, m9944h);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        int i = 0;
        for (InterfaceC13131v0 interfaceC13131v0 : C12045g.m9942j(abstractC12965b0)) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            if (m7219k0()) {
                AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                l.e(mo5758c, "typeProjection.type");
                c12614f = C12045g.m9949c(mo5758c);
            } else {
                c12614f = null;
            }
            if (c12614f != null) {
                sb.append(mo7193v(c12614f, false));
                sb.append(": ");
            }
            sb.append(mo7187x(interfaceC13131v0));
            i = i2;
        }
        sb.append(") ");
        sb.append(m7277N());
        sb.append(" ");
        m7200s1(sb, C12045g.m9943i(abstractC12965b0));
        if (z3) {
            sb.append(")");
        }
        if (mo5778X0) {
            sb.append("?");
        }
    }

    /* renamed from: j1 */
    private final void m7220j1(InterfaceC13311d1 interfaceC13311d1, StringBuilder sb) {
        AbstractC12712g<?> mo5094f0;
        if (!m7233d0() || (mo5094f0 = interfaceC13311d1.mo5094f0()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m7271P(m7234c1(mo5094f0)));
    }

    /* renamed from: k1 */
    private final String m7218k1(String str) {
        int i = C12642b.f28422a[m7315A0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (m7259T()) {
                    return str;
                }
                return "<b>" + str + "</b>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    /* renamed from: l1 */
    private final void m7216l1(InterfaceC13300b interfaceC13300b, StringBuilder sb) {
        if (m7229f0().contains(EnumC12649e.MEMBER_KIND) && m7300F0() && interfaceC13300b.mo5057w() != InterfaceC13300b.EnumC13301a.DECLARATION) {
            sb.append("/*");
            sb.append(C13176a.m5710f(interfaceC13300b.mo5057w().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: m1 */
    private final void m7214m1(InterfaceC13558y interfaceC13558y, StringBuilder sb) {
        m7205q1(sb, interfaceC13558y.mo4662E(), "external");
        boolean z = true;
        m7205q1(sb, m7229f0().contains(EnumC12649e.EXPECT) && interfaceC13558y.mo4660T(), "expect");
        m7205q1(sb, (m7229f0().contains(EnumC12649e.ACTUAL) && interfaceC13558y.mo4661M0()) ? false : false, "actual");
    }

    /* renamed from: o1 */
    private final void m7210o1(EnumC13560z enumC13560z, StringBuilder sb, EnumC13560z enumC13560z2) {
        if (m7201s0() || enumC13560z != enumC13560z2) {
            m7205q1(sb, m7229f0().contains(EnumC12649e.MODALITY), C13176a.m5710f(enumC13560z.name()));
        }
    }

    /* renamed from: p1 */
    private final void m7208p1(InterfaceC13300b interfaceC13300b, StringBuilder sb) {
        if (C12673d.m7038J(interfaceC13300b) && interfaceC13300b.mo4658o() == EnumC13560z.FINAL) {
            return;
        }
        if (m7223i0() == EnumC12658j.RENDER_OVERRIDE && interfaceC13300b.mo4658o() == EnumC13560z.OPEN && m7267Q0(interfaceC13300b)) {
            return;
        }
        EnumC13560z mo4658o = interfaceC13300b.mo4658o();
        l.e(mo4658o, "callable.modality");
        m7210o1(mo4658o, sb, m7276N0(interfaceC13300b));
    }

    /* renamed from: q1 */
    private final void m7205q1(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m7218k1(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m7202r1(InterfaceC13513m interfaceC13513m, StringBuilder sb, boolean z) {
        C12614f mo5012b = interfaceC13513m.mo5012b();
        l.e(mo5012b, "descriptor.name");
        sb.append(mo7193v(mo5012b, z));
    }

    /* renamed from: s1 */
    private final void m7200s1(StringBuilder sb, AbstractC12965b0 abstractC12965b0) {
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        C12955a c12955a = mo6202Z0 instanceof C12955a ? (C12955a) mo6202Z0 : null;
        if (c12955a != null) {
            if (m7192v0()) {
                m7197t1(sb, c12955a.m6361e0());
                return;
            }
            m7197t1(sb, c12955a.m6360i1());
            if (m7189w0()) {
                m7264R0(sb, c12955a);
                return;
            }
            return;
        }
        m7197t1(sb, abstractC12965b0);
    }

    /* renamed from: t1 */
    private final void m7197t1(StringBuilder sb, AbstractC12965b0 abstractC12965b0) {
        if ((abstractC12965b0 instanceof AbstractC13011i1) && mo7103n() && !((AbstractC13011i1) abstractC12965b0).mo6200b1()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC13005g1 mo6202Z0 = abstractC12965b0.mo6202Z0();
        if (mo6202Z0 instanceof AbstractC13130v) {
            sb.append(((AbstractC13130v) mo6202Z0).mo5763g1(this, this));
        } else if (mo6202Z0 instanceof AbstractC13010i0) {
            m7305D1(sb, (AbstractC13010i0) mo6202Z0);
        }
    }

    /* renamed from: u1 */
    private final void m7194u1(InterfaceC13300b interfaceC13300b, StringBuilder sb) {
        if (m7229f0().contains(EnumC12649e.OVERRIDE) && m7267Q0(interfaceC13300b) && m7223i0() != EnumC12658j.RENDER_OPEN) {
            m7205q1(sb, true, "override");
            if (m7300F0()) {
                sb.append("/*");
                sb.append(interfaceC13300b.mo4685g().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m7191v1(InterfaceC13320f0 interfaceC13320f0, StringBuilder sb) {
        m7188w1(interfaceC13320f0.mo4954f(), "package-fragment", sb);
        if (mo7103n()) {
            sb.append(" in ");
            m7202r1(interfaceC13320f0.mo4687d(), sb, false);
        }
    }

    /* renamed from: w1 */
    private final void m7188w1(C12609c c12609c, String str, StringBuilder sb) {
        sb.append(m7218k1(str));
        C12610d m7374j = c12609c.m7374j();
        l.e(m7374j, "fqName.toUnsafe()");
        String mo7196u = mo7196u(m7374j);
        if (mo7196u.length() > 0) {
            sb.append(" ");
            sb.append(mo7196u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m7185x1(InterfaceC13448k0 interfaceC13448k0, StringBuilder sb) {
        m7188w1(interfaceC13448k0.mo4950f(), "package", sb);
        if (mo7103n()) {
            sb.append(" in context of ");
            m7202r1(interfaceC13448k0.mo4952E0(), sb, false);
        }
    }

    /* renamed from: y1 */
    private final void m7183y1(StringBuilder sb, C13514m0 c13514m0) {
        StringBuilder sb2;
        C13514m0 m4766c = c13514m0.m4766c();
        if (m4766c == null) {
            sb2 = null;
        } else {
            m7183y1(sb, m4766c);
            sb.append('.');
            C12614f mo5012b = c13514m0.m4767b().mo5012b();
            l.e(mo5012b, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo7193v(mo5012b, false));
            sb2 = sb;
        }
        if (sb2 == null) {
            InterfaceC13125t0 mo4649n = c13514m0.m4767b().mo4649n();
            l.e(mo4649n, "possiblyInnerType.classifierDescriptor.typeConstructor");
            sb.append(m7287J1(mo4649n));
        }
        sb.append(m7290I1(c13514m0.m4768a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m7180z1(InterfaceC13518o0 interfaceC13518o0, StringBuilder sb) {
        if (!m7181z0()) {
            if (!m7184y0()) {
                m7314A1(interfaceC13518o0, sb);
                AbstractC13544u mo4659i = interfaceC13518o0.mo4659i();
                l.e(mo4659i, "property.visibility");
                m7254U1(mo4659i, sb);
                boolean z = false;
                m7205q1(sb, m7229f0().contains(EnumC12649e.CONST) && interfaceC13518o0.mo5124G(), "const");
                m7214m1(interfaceC13518o0, sb);
                m7208p1(interfaceC13518o0, sb);
                m7194u1(interfaceC13518o0, sb);
                if (m7229f0().contains(EnumC12649e.LATEINIT) && interfaceC13518o0.mo5139B0()) {
                    z = true;
                }
                m7205q1(sb, z, "lateinit");
                m7216l1(interfaceC13518o0, sb);
            }
            m7266Q1(this, interfaceC13518o0, sb, false, 4, null);
            List<InterfaceC13562z0> mo4942l = interfaceC13518o0.mo4942l();
            l.e(mo4942l, "property.typeParameters");
            m7272O1(mo4942l, sb, true);
            m7311B1(interfaceC13518o0, sb);
        }
        m7202r1(interfaceC13518o0, sb, true);
        sb.append(": ");
        AbstractC12965b0 mo5121c = interfaceC13518o0.mo5121c();
        l.e(mo5121c, "property.type");
        sb.append(mo7190w(mo5121c));
        m7308C1(interfaceC13518o0, sb);
        m7220j1(interfaceC13518o0, sb);
        List<InterfaceC13562z0> mo4942l2 = interfaceC13518o0.mo4942l();
        l.e(mo4942l2, "property.typeParameters");
        m7251V1(mo4942l2, sb);
    }

    /* renamed from: A0 */
    public EnumC12661m m7315A0() {
        return this.f28418d.m7130Z();
    }

    /* renamed from: B0 */
    public InterfaceC11767l<AbstractC12965b0, AbstractC12965b0> m7312B0() {
        return this.f28418d.m7128a0();
    }

    /* renamed from: C0 */
    public boolean m7309C0() {
        return this.f28418d.m7126b0();
    }

    /* renamed from: D0 */
    public boolean m7306D0() {
        return this.f28418d.m7124c0();
    }

    /* renamed from: E0 */
    public AbstractC12624c.InterfaceC12637l m7303E0() {
        return this.f28418d.m7122d0();
    }

    /* renamed from: F0 */
    public boolean m7300F0() {
        return this.f28418d.m7120e0();
    }

    /* renamed from: G0 */
    public boolean m7297G0() {
        return this.f28418d.m7118f0();
    }

    /* renamed from: H0 */
    public boolean m7294H0() {
        return this.f28418d.m7116g0();
    }

    /* renamed from: I0 */
    public boolean m7291I0() {
        return this.f28418d.m7114h0();
    }

    /* renamed from: I1 */
    public String m7290I1(List<? extends InterfaceC13131v0> list) {
        l.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m7270P0());
        m7280M(sb, list);
        sb.append(m7282L0());
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: J0 */
    public boolean m7288J0() {
        return this.f28418d.m7112i0();
    }

    /* renamed from: J1 */
    public String m7287J1(InterfaceC13125t0 interfaceC13125t0) {
        l.f(interfaceC13125t0, "typeConstructor");
        InterfaceC13334h mo5206d = interfaceC13125t0.mo5206d();
        if (mo5206d instanceof InterfaceC13562z0 ? true : mo5206d instanceof InterfaceC13312e ? true : mo5206d instanceof InterfaceC13559y0) {
            return m7238a1(mo5206d);
        }
        if (mo5206d == null) {
            return interfaceC13125t0.toString();
        }
        throw new IllegalStateException(l.m("Unexpected classifier: ", mo5206d.getClass()).toString());
    }

    /* renamed from: K0 */
    public boolean m7285K0() {
        return this.f28418d.m7110j0();
    }

    /* renamed from: Q */
    public boolean m7268Q() {
        return this.f28418d.m7099r();
    }

    /* renamed from: R */
    public boolean m7265R() {
        return this.f28418d.m7098s();
    }

    /* renamed from: S */
    public InterfaceC11767l<InterfaceC13340c, Boolean> m7262S() {
        return this.f28418d.m7097t();
    }

    /* renamed from: T */
    public boolean m7259T() {
        return this.f28418d.m7096u();
    }

    /* renamed from: U */
    public boolean m7256U() {
        return this.f28418d.m7095v();
    }

    /* renamed from: V */
    public InterfaceC12620b m7253V() {
        return this.f28418d.m7094w();
    }

    /* renamed from: W */
    public InterfaceC11767l<InterfaceC13307c1, String> m7250W() {
        return this.f28418d.m7093x();
    }

    /* renamed from: X */
    public boolean m7247X() {
        return this.f28418d.m7092y();
    }

    /* renamed from: Y */
    public Set<C12609c> m7244Y() {
        return this.f28418d.m7091z();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: a */
    public void mo7129a(Set<C12609c> set) {
        l.f(set, "<set-?>");
        this.f28418d.mo7129a(set);
    }

    /* renamed from: a0 */
    public boolean m7239a0() {
        return this.f28418d.m7155A();
    }

    /* renamed from: a1 */
    public String m7238a1(InterfaceC13334h interfaceC13334h) {
        l.f(interfaceC13334h, "klass");
        if (C13118t.m5803r(interfaceC13334h)) {
            return interfaceC13334h.mo4649n().toString();
        }
        return m7253V().mo7337a(interfaceC13334h, this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: b */
    public void mo7127b(boolean z) {
        this.f28418d.mo7127b(z);
    }

    /* renamed from: b0 */
    public boolean m7237b0() {
        return this.f28418d.m7154B();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: c */
    public void mo7125c(Set<? extends EnumC12649e> set) {
        l.f(set, "<set-?>");
        this.f28418d.mo7125c(set);
    }

    /* renamed from: c0 */
    public boolean m7235c0() {
        return this.f28418d.m7153C();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: d */
    public void mo7123d(EnumC12659k enumC12659k) {
        l.f(enumC12659k, "<set-?>");
        this.f28418d.mo7123d(enumC12659k);
    }

    /* renamed from: d0 */
    public boolean m7233d0() {
        return this.f28418d.m7152D();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: e */
    public void mo7121e(boolean z) {
        this.f28418d.mo7121e(z);
    }

    /* renamed from: e0 */
    public boolean m7231e0() {
        return this.f28418d.m7151E();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: f */
    public boolean mo7119f() {
        return this.f28418d.mo7119f();
    }

    /* renamed from: f0 */
    public Set<EnumC12649e> m7229f0() {
        return this.f28418d.m7150F();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: g */
    public void mo7117g(InterfaceC12620b interfaceC12620b) {
        l.f(interfaceC12620b, "<set-?>");
        this.f28418d.mo7117g(interfaceC12620b);
    }

    /* renamed from: g0 */
    public boolean m7227g0() {
        return this.f28418d.m7149G();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: h */
    public void mo7115h(boolean z) {
        this.f28418d.mo7115h(z);
    }

    /* renamed from: h0 */
    public final C12652g m7225h0() {
        return this.f28418d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: i */
    public void mo7113i(boolean z) {
        this.f28418d.mo7113i(z);
    }

    /* renamed from: i0 */
    public EnumC12658j m7223i0() {
        return this.f28418d.m7148H();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: j */
    public void mo7111j(boolean z) {
        this.f28418d.mo7111j(z);
    }

    /* renamed from: j0 */
    public EnumC12659k m7221j0() {
        return this.f28418d.m7147I();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: k */
    public void mo7109k(boolean z) {
        this.f28418d.mo7109k(z);
    }

    /* renamed from: k0 */
    public boolean m7219k0() {
        return this.f28418d.m7146J();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: l */
    public void mo7107l(EnumC12661m enumC12661m) {
        l.f(enumC12661m, "<set-?>");
        this.f28418d.mo7107l(enumC12661m);
    }

    /* renamed from: l0 */
    public boolean m7217l0() {
        return this.f28418d.m7145K();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: m */
    public Set<C12609c> mo7105m() {
        return this.f28418d.mo7105m();
    }

    /* renamed from: m0 */
    public EnumC12660l m7215m0() {
        return this.f28418d.m7144L();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: n */
    public boolean mo7103n() {
        return this.f28418d.mo7103n();
    }

    /* renamed from: n0 */
    public boolean m7213n0() {
        return this.f28418d.m7143M();
    }

    /* renamed from: n1 */
    public String m7212n1(String str) {
        l.f(str, MetricTracker.Object.MESSAGE);
        int i = C12642b.f28422a[m7315A0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "<i>" + str + "</i>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: o */
    public EnumC12619a mo7102o() {
        return this.f28418d.mo7102o();
    }

    /* renamed from: o0 */
    public boolean m7211o0() {
        return this.f28418d.m7142N();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f
    /* renamed from: p */
    public void mo7101p(boolean z) {
        this.f28418d.mo7101p(z);
    }

    /* renamed from: p0 */
    public boolean m7209p0() {
        return this.f28418d.m7141O();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: q */
    public String mo7207q(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC13513m.mo4769S(new C12640a(this), sb);
        if (m7297G0()) {
            m7283L(sb, interfaceC13513m);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: q0 */
    public boolean m7206q0() {
        return this.f28418d.m7140P();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: r */
    public String mo7204r(InterfaceC13340c interfaceC13340c, EnumC13343e enumC13343e) {
        l.f(interfaceC13340c, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC13343e != null) {
            sb.append(l.m(enumC13343e.m5322b(), ":"));
        }
        AbstractC12965b0 mo5310c = interfaceC13340c.mo5310c();
        sb.append(mo7190w(mo5310c));
        if (m7237b0()) {
            List<String> m7255U0 = m7255U0(interfaceC13340c);
            if (m7235c0() || (!m7255U0.isEmpty())) {
                C13742z.m3799Y(m7255U0, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m7300F0() && (C12977d0.m6274a(mo5310c) || (mo5310c.mo5779W0().mo5206d() instanceof C13313e0.C13315b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: r0 */
    public boolean m7203r0() {
        return this.f28418d.m7139Q();
    }

    /* renamed from: s0 */
    public boolean m7201s0() {
        return this.f28418d.m7138R();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: t */
    public String mo7199t(String str, String str2, AbstractC12046h abstractC12046h) {
        String m5422I0;
        String m5422I02;
        boolean m5447E;
        l.f(str, "lowerRendered");
        l.f(str2, "upperRendered");
        l.f(abstractC12046h, "builtIns");
        if (m7274O(str, str2)) {
            m5447E = C13276s.m5447E(str2, "(", false, 2, null);
            if (m5447E) {
                return '(' + str + ")!";
            }
            return l.m(str, "!");
        }
        InterfaceC12620b m7253V = m7253V();
        InterfaceC13312e m9865w = abstractC12046h.m9865w();
        l.e(m9865w, "builtIns.collection");
        m5422I0 = C13277t.m5422I0(m7253V.mo7337a(m9865w, this), "Collection", null, 2, null);
        String m = l.m(m5422I0, "Mutable");
        String m7248W1 = m7248W1(str, m, str2, m5422I0, m5422I0 + "(Mutable)");
        if (m7248W1 != null) {
            return m7248W1;
        }
        String m7248W12 = m7248W1(str, l.m(m5422I0, "MutableMap.MutableEntry"), str2, l.m(m5422I0, "Map.Entry"), l.m(m5422I0, "(Mutable)Map.(Mutable)Entry"));
        if (m7248W12 != null) {
            return m7248W12;
        }
        InterfaceC12620b m7253V2 = m7253V();
        InterfaceC13312e m9890j = abstractC12046h.m9890j();
        l.e(m9890j, "builtIns.array");
        m5422I02 = C13277t.m5422I0(m7253V2.mo7337a(m9890j, this), "Array", null, 2, null);
        String m7248W13 = m7248W1(str, l.m(m5422I02, m7271P("Array<")), str2, l.m(m5422I02, m7271P("Array<out ")), l.m(m5422I02, m7271P("Array<(out) ")));
        if (m7248W13 != null) {
            return m7248W13;
        }
        return '(' + str + ".." + str2 + ')';
    }

    /* renamed from: t0 */
    public boolean m7198t0() {
        return this.f28418d.m7137S();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: u */
    public String mo7196u(C12610d c12610d) {
        l.f(c12610d, "fqName");
        List<C12614f> m7365h = c12610d.m7365h();
        l.e(m7365h, "fqName.pathSegments()");
        return m7226g1(m7365h);
    }

    /* renamed from: u0 */
    public boolean m7195u0() {
        return this.f28418d.m7136T();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: v */
    public String mo7193v(C12614f c12614f, boolean z) {
        l.f(c12614f, "name");
        String m7271P = m7271P(C12664n.m7080b(c12614f));
        if (m7259T() && m7315A0() == EnumC12661m.HTML && z) {
            return "<b>" + m7271P + "</b>";
        }
        return m7271P;
    }

    /* renamed from: v0 */
    public boolean m7192v0() {
        return this.f28418d.m7135U();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: w */
    public String mo7190w(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
        StringBuilder sb = new StringBuilder();
        m7200s1(sb, m7312B0().invoke(abstractC12965b0));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: w0 */
    public boolean m7189w0() {
        return this.f28418d.m7134V();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c
    /* renamed from: x */
    public String mo7187x(InterfaceC13131v0 interfaceC13131v0) {
        List<? extends InterfaceC13131v0> m3901b;
        l.f(interfaceC13131v0, "typeProjection");
        StringBuilder sb = new StringBuilder();
        m3901b = C13724q.m3901b(interfaceC13131v0);
        m7280M(sb, m3901b);
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: x0 */
    public boolean m7186x0() {
        return this.f28418d.m7133W();
    }

    /* renamed from: y0 */
    public boolean m7184y0() {
        return this.f28418d.m7132X();
    }

    /* renamed from: z0 */
    public boolean m7181z0() {
        return this.f28418d.m7131Y();
    }
}
