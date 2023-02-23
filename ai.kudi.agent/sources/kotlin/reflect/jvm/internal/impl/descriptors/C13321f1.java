package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.p557z.C13721o0;
/* compiled from: Visibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1 */
/* loaded from: classes3.dex */
public final class C13321f1 {

    /* renamed from: a */
    public static final C13321f1 f29479a = new C13321f1();

    /* renamed from: b */
    private static final Map<AbstractC13333g1, Integer> f29480b;

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$a */
    /* loaded from: classes3.dex */
    public static final class C13322a extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13322a f29481c = new C13322a();

        private C13322a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$b */
    /* loaded from: classes3.dex */
    public static final class C13323b extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13323b f29482c = new C13323b();

        private C13323b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$c */
    /* loaded from: classes3.dex */
    public static final class C13324c extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13324c f29483c = new C13324c();

        private C13324c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$d */
    /* loaded from: classes3.dex */
    public static final class C13325d extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13325d f29484c = new C13325d();

        private C13325d() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$e */
    /* loaded from: classes3.dex */
    public static final class C13326e extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13326e f29485c = new C13326e();

        private C13326e() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$f */
    /* loaded from: classes3.dex */
    public static final class C13327f extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13327f f29486c = new C13327f();

        private C13327f() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1
        /* renamed from: b */
        public String mo4947b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$g */
    /* loaded from: classes3.dex */
    public static final class C13328g extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13328g f29487c = new C13328g();

        private C13328g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$h */
    /* loaded from: classes3.dex */
    public static final class C13329h extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13329h f29488c = new C13329h();

        private C13329h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f1$i */
    /* loaded from: classes3.dex */
    public static final class C13330i extends AbstractC13333g1 {

        /* renamed from: c */
        public static final C13330i f29489c = new C13330i();

        private C13330i() {
            super("unknown", false);
        }
    }

    static {
        Map m3988e = C13721o0.m3988e();
        m3988e.put(C13327f.f29486c, 0);
        m3988e.put(C13326e.f29485c, 0);
        m3988e.put(C13323b.f29482c, 1);
        m3988e.put(C13328g.f29487c, 1);
        m3988e.put(C13329h.f29488c, 2);
        f29480b = C13721o0.m3989d(m3988e);
        C13329h c13329h = C13329h.f29488c;
    }

    private C13321f1() {
    }

    /* renamed from: a */
    public final Integer m5331a(AbstractC13333g1 abstractC13333g1, AbstractC13333g1 abstractC13333g12) {
        kotlin.e0.d.l.f(abstractC13333g1, "first");
        kotlin.e0.d.l.f(abstractC13333g12, "second");
        if (abstractC13333g1 == abstractC13333g12) {
            return 0;
        }
        Integer num = f29480b.get(abstractC13333g1);
        Integer num2 = f29480b.get(abstractC13333g12);
        if (num == null || num2 == null || kotlin.e0.d.l.b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public final boolean m5330b(AbstractC13333g1 abstractC13333g1) {
        kotlin.e0.d.l.f(abstractC13333g1, "visibility");
        return abstractC13333g1 == C13326e.f29485c || abstractC13333g1 == C13327f.f29486c;
    }
}
