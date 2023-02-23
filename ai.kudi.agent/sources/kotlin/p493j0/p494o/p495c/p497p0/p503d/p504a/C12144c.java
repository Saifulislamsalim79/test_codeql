package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.C12128d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12311i;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12707b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12717j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13736w;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.EnumC13359n;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.utils.C13650e;
import kotlin.reflect.jvm.internal.impl.utils.EnumC13652f;
/* compiled from: AnnotationTypeQualifierResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.c */
/* loaded from: classes3.dex */
public final class C12144c {

    /* renamed from: a */
    private final C13650e f27092a;

    /* renamed from: b */
    private final InterfaceC12947h<InterfaceC13312e, InterfaceC13340c> f27093b;

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c$a */
    /* loaded from: classes3.dex */
    public static final class C12145a {

        /* renamed from: a */
        private final InterfaceC13340c f27094a;

        /* renamed from: b */
        private final int f27095b;

        public C12145a(InterfaceC13340c interfaceC13340c, int i) {
            l.f(interfaceC13340c, "typeQualifier");
            this.f27094a = interfaceC13340c;
            this.f27095b = i;
        }

        /* renamed from: c */
        private final boolean m9611c(EnumC12119a enumC12119a) {
            return ((1 << enumC12119a.ordinal()) & this.f27095b) != 0;
        }

        /* renamed from: d */
        private final boolean m9610d(EnumC12119a enumC12119a) {
            if (m9611c(enumC12119a)) {
                return true;
            }
            return m9611c(EnumC12119a.TYPE_USE) && enumC12119a != EnumC12119a.TYPE_PARAMETER_BOUNDS;
        }

        /* renamed from: a */
        public final InterfaceC13340c m9613a() {
            return this.f27094a;
        }

        /* renamed from: b */
        public final List<EnumC12119a> m9612b() {
            EnumC12119a[] values = EnumC12119a.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC12119a enumC12119a : values) {
                if (m9610d(enumC12119a)) {
                    arrayList.add(enumC12119a);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c$b */
    /* loaded from: classes3.dex */
    public static final class C12146b extends AbstractC11802m implements InterfaceC11771p<C12717j, EnumC12119a, Boolean> {

        /* renamed from: c */
        public static final C12146b f27096c = new C12146b();

        C12146b() {
            super(2);
        }

        /* renamed from: a */
        public final boolean m9609a(C12717j c12717j, EnumC12119a enumC12119a) {
            l.f(c12717j, "$this$mapConstantToQualifierApplicabilityTypes");
            l.f(enumC12119a, "it");
            return l.b(c12717j.m6906c().m7351g(), enumC12119a.m9676b());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Boolean invoke(C12717j c12717j, EnumC12119a enumC12119a) {
            return Boolean.valueOf(m9609a(c12717j, enumC12119a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c$c */
    /* loaded from: classes3.dex */
    public static final class C12147c extends AbstractC11802m implements InterfaceC11771p<C12717j, EnumC12119a, Boolean> {
        C12147c() {
            super(2);
        }

        /* renamed from: a */
        public final boolean m9608a(C12717j c12717j, EnumC12119a enumC12119a) {
            l.f(c12717j, "$this$mapConstantToQualifierApplicabilityTypes");
            l.f(enumC12119a, "it");
            return C12144c.this.m9614p(enumC12119a.m9676b()).contains(c12717j.m6906c().m7351g());
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Boolean invoke(C12717j c12717j, EnumC12119a enumC12119a) {
            return Boolean.valueOf(m9608a(c12717j, enumC12119a));
        }
    }

    /* compiled from: AnnotationTypeQualifierResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c$d */
    /* loaded from: classes3.dex */
    /* synthetic */ class C12148d extends C11799i implements InterfaceC11767l<InterfaceC13312e, InterfaceC13340c> {
        C12148d(C12144c c12144c) {
            super(1, c12144c);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "computeTypeQualifierNickname";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12144c.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final InterfaceC13340c invoke(InterfaceC13312e interfaceC13312e) {
            l.f(interfaceC13312e, "p0");
            return ((C12144c) this.f26478d).m9627c(interfaceC13312e);
        }
    }

    public C12144c(InterfaceC12954n interfaceC12954n, C13650e c13650e) {
        l.f(interfaceC12954n, "storageManager");
        l.f(c13650e, "javaTypeEnhancementState");
        this.f27092a = c13650e;
        this.f27093b = interfaceC12954n.mo6362i(new C12148d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final InterfaceC13340c m9627c(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e.mo4956y().mo5304Q(C12121b.m9668g())) {
            for (InterfaceC13340c interfaceC13340c : interfaceC13312e.mo4956y()) {
                InterfaceC13340c m9617m = m9617m(interfaceC13340c);
                if (m9617m != null) {
                    return m9617m;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private final List<EnumC12119a> m9626d(AbstractC12712g<?> abstractC12712g, InterfaceC11771p<? super C12717j, ? super EnumC12119a, Boolean> interfaceC11771p) {
        List<EnumC12119a> m3891e;
        EnumC12119a enumC12119a;
        List<EnumC12119a> m3887i;
        if (abstractC12712g instanceof C12707b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC12712g<?> abstractC12712g2 : ((C12707b) abstractC12712g).mo6905b()) {
                C13736w.m3850v(arrayList, m9626d(abstractC12712g2, interfaceC11771p));
            }
            return arrayList;
        } else if (!(abstractC12712g instanceof C12717j)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else {
            EnumC12119a[] values = EnumC12119a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC12119a = null;
                    break;
                }
                enumC12119a = values[i];
                if (interfaceC11771p.invoke(abstractC12712g, enumC12119a).booleanValue()) {
                    break;
                }
                i++;
            }
            m3887i = C13726r.m3887i(enumC12119a);
            return m3887i;
        }
    }

    /* renamed from: e */
    private final List<EnumC12119a> m9625e(AbstractC12712g<?> abstractC12712g) {
        return m9626d(abstractC12712g, C12146b.f27096c);
    }

    /* renamed from: f */
    private final List<EnumC12119a> m9624f(AbstractC12712g<?> abstractC12712g) {
        return m9626d(abstractC12712g, new C12147c());
    }

    /* renamed from: g */
    private final EnumC13652f m9623g(InterfaceC13312e interfaceC13312e) {
        InterfaceC13340c mo5302r = interfaceC13312e.mo4956y().mo5302r(C12121b.m9671d());
        AbstractC12712g<?> m6868b = mo5302r == null ? null : C12747a.m6868b(mo5302r);
        C12717j c12717j = m6868b instanceof C12717j ? (C12717j) m6868b : null;
        if (c12717j == null) {
            return null;
        }
        EnumC13652f m4255f = this.f27092a.m4255f();
        if (m4255f == null) {
            String m7353b = c12717j.m6906c().m7353b();
            int hashCode = m7353b.hashCode();
            if (hashCode == -2137067054) {
                if (m7353b.equals("IGNORE")) {
                    return EnumC13652f.IGNORE;
                }
                return null;
            } else if (hashCode == -1838656823) {
                if (m7353b.equals("STRICT")) {
                    return EnumC13652f.STRICT;
                }
                return null;
            } else if (hashCode == 2656902 && m7353b.equals("WARN")) {
                return EnumC13652f.WARN;
            } else {
                return null;
            }
        }
        return m4255f;
    }

    /* renamed from: i */
    private final EnumC13652f m9621i(InterfaceC13340c interfaceC13340c) {
        if (C12121b.m9672c().containsKey(interfaceC13340c.mo5309f())) {
            return this.f27092a.m4256e();
        }
        return m9620j(interfaceC13340c);
    }

    /* renamed from: o */
    private final InterfaceC13340c m9615o(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e.mo4957w() != EnumC13319f.ANNOTATION_CLASS) {
            return null;
        }
        return this.f27093b.invoke(interfaceC13312e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final List<String> m9614p(String str) {
        int m3867o;
        Set<EnumC13359n> m9649b = C12128d.f27067a.m9649b(str);
        m3867o = C13728s.m3867o(m9649b, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (EnumC13359n enumC13359n : m9649b) {
            arrayList.add(enumC13359n.name());
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C12145a m9622h(InterfaceC13340c interfaceC13340c) {
        l.f(interfaceC13340c, "annotationDescriptor");
        InterfaceC13312e m6864f = C12747a.m6864f(interfaceC13340c);
        if (m6864f == null) {
            return null;
        }
        InterfaceC13346g mo4956y = m6864f.mo4956y();
        C12609c c12609c = C12386v.f27470c;
        l.e(c12609c, "TARGET_ANNOTATION");
        InterfaceC13340c mo5302r = mo4956y.mo5302r(c12609c);
        if (mo5302r == null) {
            return null;
        }
        Map<C12614f, AbstractC12712g<?>> mo5312a = mo5302r.mo5312a();
        ArrayList<EnumC12119a> arrayList = new ArrayList();
        for (Map.Entry<C12614f, AbstractC12712g<?>> entry : mo5312a.entrySet()) {
            C13736w.m3850v(arrayList, m9624f(entry.getValue()));
        }
        int i = 0;
        for (EnumC12119a enumC12119a : arrayList) {
            i |= 1 << enumC12119a.ordinal();
        }
        return new C12145a(interfaceC13340c, i);
    }

    /* renamed from: j */
    public final EnumC13652f m9620j(InterfaceC13340c interfaceC13340c) {
        l.f(interfaceC13340c, "annotationDescriptor");
        EnumC13652f m9619k = m9619k(interfaceC13340c);
        return m9619k == null ? this.f27092a.m4257d() : m9619k;
    }

    /* renamed from: k */
    public final EnumC13652f m9619k(InterfaceC13340c interfaceC13340c) {
        l.f(interfaceC13340c, "annotationDescriptor");
        Map<String, EnumC13652f> m4254g = this.f27092a.m4254g();
        C12609c mo5309f = interfaceC13340c.mo5309f();
        EnumC13652f enumC13652f = m4254g.get(mo5309f == null ? null : mo5309f.m7382b());
        if (enumC13652f == null) {
            InterfaceC13312e m6864f = C12747a.m6864f(interfaceC13340c);
            if (m6864f == null) {
                return null;
            }
            return m9623g(m6864f);
        }
        return enumC13652f;
    }

    /* renamed from: l */
    public final C12377q m9618l(InterfaceC13340c interfaceC13340c) {
        C12377q c12377q;
        l.f(interfaceC13340c, "annotationDescriptor");
        if (this.f27092a.m4260a() || (c12377q = C12121b.m9674a().get(interfaceC13340c.mo5309f())) == null) {
            return null;
        }
        EnumC13652f m9621i = m9621i(interfaceC13340c);
        if (!(m9621i != EnumC13652f.IGNORE)) {
            m9621i = null;
        }
        if (m9621i == null) {
            return null;
        }
        return C12377q.m9101b(c12377q, C12311i.m9231b(c12377q.m9098e(), null, m9621i.m4249g(), 1, null), null, false, 6, null);
    }

    /* renamed from: m */
    public final InterfaceC13340c m9617m(InterfaceC13340c interfaceC13340c) {
        InterfaceC13312e m6864f;
        boolean m9586b;
        l.f(interfaceC13340c, "annotationDescriptor");
        if (this.f27092a.m4259b() || (m6864f = C12747a.m6864f(interfaceC13340c)) == null) {
            return null;
        }
        m9586b = C12160d.m9586b(m6864f);
        return m9586b ? interfaceC13340c : m9615o(m6864f);
    }

    /* renamed from: n */
    public final C12145a m9616n(InterfaceC13340c interfaceC13340c) {
        InterfaceC13340c interfaceC13340c2;
        boolean z;
        List<EnumC12119a> m3891e;
        l.f(interfaceC13340c, "annotationDescriptor");
        if (this.f27092a.m4259b()) {
            return null;
        }
        InterfaceC13312e m6864f = C12747a.m6864f(interfaceC13340c);
        if (m6864f == null || !m6864f.mo4956y().mo5304Q(C12121b.m9670e())) {
            m6864f = null;
        }
        if (m6864f == null) {
            return null;
        }
        InterfaceC13312e m6864f2 = C12747a.m6864f(interfaceC13340c);
        l.d(m6864f2);
        InterfaceC13340c mo5302r = m6864f2.mo4956y().mo5302r(C12121b.m9670e());
        l.d(mo5302r);
        Map<C12614f, AbstractC12712g<?>> mo5312a = mo5302r.mo5312a();
        ArrayList<EnumC12119a> arrayList = new ArrayList();
        for (Map.Entry<C12614f, AbstractC12712g<?>> entry : mo5312a.entrySet()) {
            AbstractC12712g<?> value = entry.getValue();
            if (l.b(entry.getKey(), C12386v.f27469b)) {
                m3891e = m9625e(value);
            } else {
                m3891e = C13726r.m3891e();
            }
            C13736w.m3850v(arrayList, m3891e);
        }
        int i = 0;
        for (EnumC12119a enumC12119a : arrayList) {
            i |= 1 << enumC12119a.ordinal();
        }
        Iterator<InterfaceC13340c> it = m6864f.mo4956y().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC13340c2 = null;
                break;
            }
            interfaceC13340c2 = it.next();
            if (m9617m(interfaceC13340c2) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        InterfaceC13340c interfaceC13340c3 = interfaceC13340c2;
        if (interfaceC13340c3 == null) {
            return null;
        }
        return new C12145a(interfaceC13340c3, i);
    }
}
