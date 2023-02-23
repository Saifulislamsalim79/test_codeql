package kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13028i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13041q;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.utils.C13635b;
/* compiled from: DescriptorUtils.kt */
/* renamed from: kotlin.j0.o.c.p0.i.t.a */
/* loaded from: classes3.dex */
public final class C12747a {

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.t.a$a */
    /* loaded from: classes3.dex */
    static final class C12748a<N> implements C13635b.InterfaceC13638c<InterfaceC13307c1> {

        /* renamed from: a */
        public static final C12748a<N> f28599a = new C12748a<>();

        C12748a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13638c
        /* renamed from: b */
        public final Iterable<InterfaceC13307c1> mo4274a(InterfaceC13307c1 interfaceC13307c1) {
            int m3867o;
            Collection<InterfaceC13307c1> mo4685g = interfaceC13307c1.mo4685g();
            m3867o = C13728s.m3867o(mo4685g, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            for (InterfaceC13307c1 interfaceC13307c12 : mo4685g) {
                arrayList.add(interfaceC13307c12.mo4651a());
            }
            return arrayList;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.t.a$b */
    /* loaded from: classes3.dex */
    /* synthetic */ class C12749b extends C11799i implements InterfaceC11767l<InterfaceC13307c1, Boolean> {

        /* renamed from: B */
        public static final C12749b f28600B = new C12749b();

        C12749b() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(InterfaceC13307c1.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "declaresDefaultValue()Z";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(InterfaceC13307c1 interfaceC13307c1) {
            return Boolean.valueOf(m6850l(interfaceC13307c1));
        }

        /* renamed from: l */
        public final boolean m6850l(InterfaceC13307c1 interfaceC13307c1) {
            l.f(interfaceC13307c1, "p0");
            return interfaceC13307c1.mo5138D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.t.a$c */
    /* loaded from: classes3.dex */
    public static final class C12750c<N> implements C13635b.InterfaceC13638c<InterfaceC13300b> {

        /* renamed from: a */
        final /* synthetic */ boolean f28601a;

        C12750c(boolean z) {
            this.f28601a = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13638c
        /* renamed from: b */
        public final Iterable<InterfaceC13300b> mo4274a(InterfaceC13300b interfaceC13300b) {
            List m3891e;
            if (this.f28601a) {
                interfaceC13300b = interfaceC13300b == null ? null : interfaceC13300b.mo4651a();
            }
            Collection<? extends InterfaceC13300b> mo4685g = interfaceC13300b != null ? interfaceC13300b.mo4685g() : null;
            if (mo4685g == null) {
                m3891e = C13726r.m3891e();
                return m3891e;
            }
            return mo4685g;
        }
    }

    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.t.a$d */
    /* loaded from: classes3.dex */
    public static final class C12751d extends C13635b.AbstractC13637b<InterfaceC13300b, InterfaceC13300b> {

        /* renamed from: a */
        final /* synthetic */ C11812w<InterfaceC13300b> f28602a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC11767l<InterfaceC13300b, Boolean> f28603b;

        /* JADX WARN: Multi-variable type inference failed */
        C12751d(C11812w<InterfaceC13300b> c11812w, InterfaceC11767l<? super InterfaceC13300b, Boolean> interfaceC11767l) {
            this.f28602a = c11812w;
            this.f28603b = interfaceC11767l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.AbstractC13637b, kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: d */
        public void mo4272b(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "current");
            if (this.f28602a.f26499c == null && this.f28603b.invoke(interfaceC13300b).booleanValue()) {
                this.f28602a.f26499c = interfaceC13300b;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: e */
        public boolean mo4271c(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "current");
            return this.f28602a.f26499c == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: f */
        public InterfaceC13300b mo4273a() {
            return this.f28602a.f26499c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DescriptorUtils.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.t.a$e */
    /* loaded from: classes3.dex */
    public static final class C12752e extends AbstractC11802m implements InterfaceC11767l<InterfaceC13513m, InterfaceC13513m> {

        /* renamed from: c */
        public static final C12752e f28604c = new C12752e();

        C12752e() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final InterfaceC13513m invoke(InterfaceC13513m interfaceC13513m) {
            l.f(interfaceC13513m, "it");
            return interfaceC13513m.mo4687d();
        }
    }

    static {
        l.e(C12614f.m7349i("value"), "identifier(\"value\")");
    }

    /* renamed from: a */
    public static final boolean m6869a(InterfaceC13307c1 interfaceC13307c1) {
        List m3901b;
        l.f(interfaceC13307c1, "<this>");
        m3901b = C13724q.m3901b(interfaceC13307c1);
        Boolean m4276e = C13635b.m4276e(m3901b, C12748a.f28599a, C12749b.f28600B);
        l.e(m4276e, "ifAny(\n        listOf(this),\n        { current -> current.overriddenDescriptors.map(ValueParameterDescriptor::getOriginal) },\n        ValueParameterDescriptor::declaresDefaultValue\n    )");
        return m4276e.booleanValue();
    }

    /* renamed from: b */
    public static final AbstractC12712g<?> m6868b(InterfaceC13340c interfaceC13340c) {
        l.f(interfaceC13340c, "<this>");
        return (AbstractC12712g) C13722p.m3953S(interfaceC13340c.mo5312a().values());
    }

    /* renamed from: c */
    public static final InterfaceC13300b m6867c(InterfaceC13300b interfaceC13300b, boolean z, InterfaceC11767l<? super InterfaceC13300b, Boolean> interfaceC11767l) {
        List m3901b;
        l.f(interfaceC13300b, "<this>");
        l.f(interfaceC11767l, "predicate");
        C11812w c11812w = new C11812w();
        m3901b = C13724q.m3901b(interfaceC13300b);
        return (InterfaceC13300b) C13635b.m4279b(m3901b, new C12750c(z), new C12751d(c11812w, interfaceC11767l));
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC13300b m6866d(InterfaceC13300b interfaceC13300b, boolean z, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m6867c(interfaceC13300b, z, interfaceC11767l);
    }

    /* renamed from: e */
    public static final C12609c m6865e(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        C12610d m6860j = m6860j(interfaceC13513m);
        if (!m6860j.m7367f()) {
            m6860j = null;
        }
        if (m6860j == null) {
            return null;
        }
        return m6860j.m7361l();
    }

    /* renamed from: f */
    public static final InterfaceC13312e m6864f(InterfaceC13340c interfaceC13340c) {
        l.f(interfaceC13340c, "<this>");
        InterfaceC13334h mo5206d = interfaceC13340c.mo5310c().mo5779W0().mo5206d();
        if (mo5206d instanceof InterfaceC13312e) {
            return (InterfaceC13312e) mo5206d;
        }
        return null;
    }

    /* renamed from: g */
    public static final AbstractC12046h m6863g(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        return m6858l(interfaceC13513m).mo4979s();
    }

    /* renamed from: h */
    public static final C12608b m6862h(InterfaceC13334h interfaceC13334h) {
        InterfaceC13513m mo4687d;
        C12608b m6862h;
        if (interfaceC13334h == null || (mo4687d = interfaceC13334h.mo4687d()) == null) {
            return null;
        }
        if (mo4687d instanceof InterfaceC13320f0) {
            return new C12608b(((InterfaceC13320f0) mo4687d).mo4954f(), interfaceC13334h.mo5012b());
        }
        if (!(mo4687d instanceof InterfaceC13360i) || (m6862h = m6862h((InterfaceC13334h) mo4687d)) == null) {
            return null;
        }
        return m6862h.m7393d(interfaceC13334h.mo5012b());
    }

    /* renamed from: i */
    public static final C12609c m6861i(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        C12609c m7021n = C12673d.m7021n(interfaceC13513m);
        l.e(m7021n, "getFqNameSafe(this)");
        return m7021n;
    }

    /* renamed from: j */
    public static final C12610d m6860j(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        C12610d m7022m = C12673d.m7022m(interfaceC13513m);
        l.e(m7022m, "getFqName(this)");
        return m7022m;
    }

    /* renamed from: k */
    public static final AbstractC13026h m6859k(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "<this>");
        C13041q c13041q = (C13041q) interfaceC13305c0.mo4998Q0(C13028i.m6097a());
        AbstractC13026h abstractC13026h = c13041q == null ? null : (AbstractC13026h) c13041q.m6065a();
        return abstractC13026h == null ? AbstractC13026h.C13027a.f29109a : abstractC13026h;
    }

    /* renamed from: l */
    public static final InterfaceC13305c0 m6858l(InterfaceC13513m interfaceC13513m) {
        l.f(interfaceC13513m, "<this>");
        InterfaceC13305c0 m7028g = C12673d.m7028g(interfaceC13513m);
        l.e(m7028g, "getContainingModule(this)");
        return m7028g;
    }

    /* renamed from: m */
    public static final InterfaceC13230h<InterfaceC13513m> m6857m(InterfaceC13513m interfaceC13513m) {
        InterfaceC13230h<InterfaceC13513m> m5575l;
        l.f(interfaceC13513m, "<this>");
        m5575l = C13242n.m5575l(m6856n(interfaceC13513m), 1);
        return m5575l;
    }

    /* renamed from: n */
    public static final InterfaceC13230h<InterfaceC13513m> m6856n(InterfaceC13513m interfaceC13513m) {
        InterfaceC13230h<InterfaceC13513m> m5583f;
        l.f(interfaceC13513m, "<this>");
        m5583f = C13234l.m5583f(interfaceC13513m, C12752e.f28604c);
        return m5583f;
    }

    /* renamed from: o */
    public static final InterfaceC13300b m6855o(InterfaceC13300b interfaceC13300b) {
        l.f(interfaceC13300b, "<this>");
        if (interfaceC13300b instanceof InterfaceC13516n0) {
            InterfaceC13518o0 mo4765J0 = ((InterfaceC13516n0) interfaceC13300b).mo4765J0();
            l.e(mo4765J0, "correspondingProperty");
            return mo4765J0;
        }
        return interfaceC13300b;
    }

    /* renamed from: p */
    public static final InterfaceC13312e m6854p(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "<this>");
        for (AbstractC12965b0 abstractC12965b0 : interfaceC13312e.mo5010x().mo5779W0().mo5218a()) {
            if (!AbstractC12046h.m9906a0(abstractC12965b0)) {
                InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
                if (C12673d.m7012w(mo5206d)) {
                    if (mo5206d != null) {
                        return (InterfaceC13312e) mo5206d;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    public static final boolean m6853q(InterfaceC13305c0 interfaceC13305c0) {
        l.f(interfaceC13305c0, "<this>");
        C13041q c13041q = (C13041q) interfaceC13305c0.mo4998Q0(C13028i.m6097a());
        return (c13041q == null ? null : (AbstractC13026h) c13041q.m6065a()) != null;
    }

    /* renamed from: r */
    public static final InterfaceC13312e m6852r(InterfaceC13305c0 interfaceC13305c0, C12609c c12609c, InterfaceC12112b interfaceC12112b) {
        l.f(interfaceC13305c0, "<this>");
        l.f(c12609c, "topLevelClassFqName");
        l.f(interfaceC12112b, "location");
        boolean z = !c12609c.m7380d();
        if (!C13668y.f30115a || z) {
            C12609c m7379e = c12609c.m7379e();
            l.e(m7379e, "topLevelClassFqName.parent()");
            InterfaceC12777h mo4949u = interfaceC13305c0.mo4996V(m7379e).mo4949u();
            C12614f m7377g = c12609c.m7377g();
            l.e(m7377g, "topLevelClassFqName.shortName()");
            InterfaceC13334h mo5794f = mo4949u.mo5794f(m7377g, interfaceC12112b);
            if (mo5794f instanceof InterfaceC13312e) {
                return (InterfaceC13312e) mo5794f;
            }
            return null;
        }
        throw new AssertionError("Assertion failed");
    }
}
