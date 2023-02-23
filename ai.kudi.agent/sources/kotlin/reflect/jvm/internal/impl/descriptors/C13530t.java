package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12798e;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12799f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13113r;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13156g;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13321f1;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.InterfaceC13404i0;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: DescriptorVisibilities.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t */
/* loaded from: classes3.dex */
public class C13530t {

    /* renamed from: a */
    public static final AbstractC13544u f29888a = new C13534d(C13321f1.C13326e.f29485c);

    /* renamed from: b */
    public static final AbstractC13544u f29889b = new C13535e(C13321f1.C13327f.f29486c);

    /* renamed from: c */
    public static final AbstractC13544u f29890c = new C13536f(C13321f1.C13328g.f29487c);

    /* renamed from: d */
    public static final AbstractC13544u f29891d = new C13537g(C13321f1.C13323b.f29482c);

    /* renamed from: e */
    public static final AbstractC13544u f29892e = new C13538h(C13321f1.C13329h.f29488c);

    /* renamed from: f */
    public static final AbstractC13544u f29893f = new C13539i(C13321f1.C13325d.f29484c);

    /* renamed from: g */
    public static final AbstractC13544u f29894g = new C13540j(C13321f1.C13322a.f29481c);

    /* renamed from: h */
    public static final AbstractC13544u f29895h = new C13541k(C13321f1.C13324c.f29483c);

    /* renamed from: i */
    public static final AbstractC13544u f29896i = new C13542l(C13321f1.C13330i.f29489c);

    /* renamed from: j */
    public static final AbstractC13544u f29897j;

    /* renamed from: k */
    private static final InterfaceC12797d f29898k;

    /* renamed from: l */
    public static final InterfaceC12797d f29899l;
    @Deprecated

    /* renamed from: m */
    public static final InterfaceC12797d f29900m;

    /* renamed from: n */
    private static final InterfaceC13156g f29901n;

    /* renamed from: o */
    private static final Map<AbstractC13333g1, AbstractC13544u> f29902o;

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$a */
    /* loaded from: classes3.dex */
    static class C13531a implements InterfaceC12797d {
        C13531a() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d
        /* renamed from: c */
        public AbstractC12965b0 mo4724c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$b */
    /* loaded from: classes3.dex */
    static class C13532b implements InterfaceC12797d {
        C13532b() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d
        /* renamed from: c */
        public AbstractC12965b0 mo4724c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$c */
    /* loaded from: classes3.dex */
    static class C13533c implements InterfaceC12797d {
        C13533c() {
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d
        /* renamed from: c */
        public AbstractC12965b0 mo4724c() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$d */
    /* loaded from: classes3.dex */
    static class C13534d extends AbstractC13523r {
        C13534d(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4723g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m4722h(InterfaceC13513m interfaceC13513m) {
            if (interfaceC13513m != null) {
                return C12673d.m7025j(interfaceC13513m) != InterfaceC13548v0.f29904a;
            }
            m4723g(0);
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.q] */
        /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == 0) {
                m4723g(1);
                throw null;
            } else if (interfaceC13513m != null) {
                if (C12673d.m7038J(interfaceC13521q) && m4722h(interfaceC13513m)) {
                    return C13530t.m4729f(interfaceC13521q, interfaceC13513m);
                }
                if (interfaceC13521q instanceof InterfaceC13452l) {
                    InterfaceC13360i mo4687d = ((InterfaceC13452l) interfaceC13521q).mo4687d();
                    if (C12673d.m7041G(mo4687d) && C12673d.m7038J(mo4687d) && (interfaceC13513m instanceof InterfaceC13452l) && C12673d.m7038J(interfaceC13513m.mo4687d()) && C13530t.m4729f(interfaceC13521q, interfaceC13513m)) {
                        return true;
                    }
                }
                while (interfaceC13521q != 0) {
                    interfaceC13521q = interfaceC13521q.mo4687d();
                    if (interfaceC13521q instanceof InterfaceC13312e) {
                        if (!C12673d.m7011x(interfaceC13521q)) {
                            break;
                        }
                    }
                    if (interfaceC13521q instanceof InterfaceC13320f0) {
                        break;
                    }
                }
                if (interfaceC13521q == 0) {
                    return false;
                }
                while (interfaceC13513m != null) {
                    if (interfaceC13521q == interfaceC13513m) {
                        return true;
                    }
                    if (interfaceC13513m instanceof InterfaceC13320f0) {
                        return (interfaceC13521q instanceof InterfaceC13320f0) && interfaceC13521q.mo4954f().equals(((InterfaceC13320f0) interfaceC13513m).mo4954f()) && C12673d.m7033b(interfaceC13513m, interfaceC13521q);
                    }
                    interfaceC13513m = interfaceC13513m.mo4687d();
                }
                return false;
            } else {
                m4723g(2);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$e */
    /* loaded from: classes3.dex */
    static class C13535e extends AbstractC13523r {
        C13535e(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4721g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            InterfaceC13513m m7018q;
            if (interfaceC13521q == null) {
                m4721g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                if (C13530t.f29888a.mo4708e(interfaceC12797d, interfaceC13521q, interfaceC13513m)) {
                    if (interfaceC12797d == C13530t.f29899l) {
                        return true;
                    }
                    if (interfaceC12797d != C13530t.f29898k && (m7018q = C12673d.m7018q(interfaceC13521q, InterfaceC13312e.class)) != null && (interfaceC12797d instanceof InterfaceC12799f)) {
                        return ((InterfaceC12799f) interfaceC12797d).mo6751v().mo4651a().equals(m7018q.mo4651a());
                    }
                }
                return false;
            } else {
                m4721g(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$f */
    /* loaded from: classes3.dex */
    static class C13536f extends AbstractC13523r {
        C13536f(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4720g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m4719h(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13312e interfaceC13312e) {
            if (interfaceC13521q == null) {
                m4720g(2);
                throw null;
            } else if (interfaceC13312e != null) {
                if (interfaceC12797d == C13530t.f29900m) {
                    return false;
                }
                if (!(interfaceC13521q instanceof InterfaceC13300b) || (interfaceC13521q instanceof InterfaceC13452l) || interfaceC12797d == C13530t.f29899l) {
                    return true;
                }
                if (interfaceC12797d == C13530t.f29898k || interfaceC12797d == null) {
                    return false;
                }
                AbstractC12965b0 m6752a = interfaceC12797d instanceof InterfaceC12798e ? ((InterfaceC12798e) interfaceC12797d).m6752a() : interfaceC12797d.mo4724c();
                return C12673d.m7039I(m6752a, interfaceC13312e) || C13113r.m5831a(m6752a);
            } else {
                m4720g(3);
                throw null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            InterfaceC13312e interfaceC13312e;
            if (interfaceC13521q == null) {
                m4720g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                InterfaceC13312e interfaceC13312e2 = (InterfaceC13312e) C12673d.m7018q(interfaceC13521q, InterfaceC13312e.class);
                InterfaceC13312e interfaceC13312e3 = (InterfaceC13312e) C12673d.m7017r(interfaceC13513m, InterfaceC13312e.class, false);
                if (interfaceC13312e3 == null) {
                    return false;
                }
                if (interfaceC13312e2 == null || !C12673d.m7011x(interfaceC13312e2) || (interfaceC13312e = (InterfaceC13312e) C12673d.m7018q(interfaceC13312e2, InterfaceC13312e.class)) == null || !C12673d.m7040H(interfaceC13312e3, interfaceC13312e)) {
                    InterfaceC13521q m7035M = C12673d.m7035M(interfaceC13521q);
                    InterfaceC13312e interfaceC13312e4 = (InterfaceC13312e) C12673d.m7018q(m7035M, InterfaceC13312e.class);
                    if (interfaceC13312e4 == null) {
                        return false;
                    }
                    if (C12673d.m7040H(interfaceC13312e3, interfaceC13312e4) && m4719h(interfaceC12797d, m7035M, interfaceC13312e3)) {
                        return true;
                    }
                    return mo4708e(interfaceC12797d, interfaceC13521q, interfaceC13312e3.mo4687d());
                }
                return true;
            } else {
                m4720g(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$g */
    /* loaded from: classes3.dex */
    static class C13537g extends AbstractC13523r {
        C13537g(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4718g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4718g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                if (C12673d.m7028g(interfaceC13513m).mo4980o0(C12673d.m7028g(interfaceC13521q))) {
                    return C13530t.f29901n.mo5727a(interfaceC13521q, interfaceC13513m);
                }
                return false;
            } else {
                m4718g(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$h */
    /* loaded from: classes3.dex */
    static class C13538h extends AbstractC13523r {
        C13538h(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4717g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4717g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return true;
            } else {
                m4717g(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$i */
    /* loaded from: classes3.dex */
    static class C13539i extends AbstractC13523r {
        C13539i(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4716g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4716g(0);
                throw null;
            } else if (interfaceC13513m == null) {
                m4716g(1);
                throw null;
            } else {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$j */
    /* loaded from: classes3.dex */
    static class C13540j extends AbstractC13523r {
        C13540j(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4715g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4715g(0);
                throw null;
            } else if (interfaceC13513m == null) {
                m4715g(1);
                throw null;
            } else {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$k */
    /* loaded from: classes3.dex */
    static class C13541k extends AbstractC13523r {
        C13541k(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4714g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4714g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return false;
            } else {
                m4714g(1);
                throw null;
            }
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$l */
    /* loaded from: classes3.dex */
    static class C13542l extends AbstractC13523r {
        C13542l(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m4713g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m4713g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return false;
            } else {
                m4713g(1);
                throw null;
            }
        }
    }

    static {
        Set m3827f;
        m3827f = C13741y0.m3827f(f29888a, f29889b, f29891d, f29893f);
        Collections.unmodifiableSet(m3827f);
        HashMap m4283e = C13634a.m4283e(4);
        m4283e.put(f29889b, 0);
        m4283e.put(f29888a, 0);
        m4283e.put(f29891d, 1);
        m4283e.put(f29890c, 1);
        m4283e.put(f29892e, 2);
        Collections.unmodifiableMap(m4283e);
        f29897j = f29892e;
        f29898k = new C13531a();
        f29899l = new C13532b();
        f29900m = new C13533c();
        Iterator it = ServiceLoader.load(InterfaceC13156g.class, InterfaceC13156g.class.getClassLoader()).iterator();
        f29901n = it.hasNext() ? (InterfaceC13156g) it.next() : InterfaceC13156g.C13157a.f29240a;
        f29902o = new HashMap();
        m4726i(f29888a);
        m4726i(f29889b);
        m4726i(f29890c);
        m4726i(f29891d);
        m4726i(f29892e);
        m4726i(f29893f);
        m4726i(f29894g);
        m4726i(f29895h);
        m4726i(f29896i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m4734a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C13530t.m4734a(int):void");
    }

    /* renamed from: d */
    public static Integer m4731d(AbstractC13544u abstractC13544u, AbstractC13544u abstractC13544u2) {
        if (abstractC13544u == null) {
            m4734a(12);
            throw null;
        } else if (abstractC13544u2 != null) {
            Integer m4712a = abstractC13544u.m4712a(abstractC13544u2);
            if (m4712a != null) {
                return m4712a;
            }
            Integer m4712a2 = abstractC13544u2.m4712a(abstractC13544u);
            if (m4712a2 != null) {
                return Integer.valueOf(-m4712a2.intValue());
            }
            return null;
        } else {
            m4734a(13);
            throw null;
        }
    }

    /* renamed from: e */
    public static InterfaceC13521q m4730e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
        InterfaceC13521q m4730e;
        if (interfaceC13521q == null) {
            m4734a(8);
            throw null;
        } else if (interfaceC13513m != null) {
            for (InterfaceC13521q interfaceC13521q2 = (InterfaceC13521q) interfaceC13521q.mo4651a(); interfaceC13521q2 != null && interfaceC13521q2.mo4659i() != f29893f; interfaceC13521q2 = (InterfaceC13521q) C12673d.m7018q(interfaceC13521q2, InterfaceC13521q.class)) {
                if (!interfaceC13521q2.mo4659i().mo4708e(interfaceC12797d, interfaceC13521q2, interfaceC13513m)) {
                    return interfaceC13521q2;
                }
            }
            if (!(interfaceC13521q instanceof InterfaceC13404i0) || (m4730e = m4730e(interfaceC12797d, ((InterfaceC13404i0) interfaceC13521q).mo5160z0(), interfaceC13513m)) == null) {
                return null;
            }
            return m4730e;
        } else {
            m4734a(9);
            throw null;
        }
    }

    /* renamed from: f */
    public static boolean m4729f(InterfaceC13513m interfaceC13513m, InterfaceC13513m interfaceC13513m2) {
        if (interfaceC13513m == null) {
            m4734a(6);
            throw null;
        } else if (interfaceC13513m2 != null) {
            InterfaceC13548v0 m7025j = C12673d.m7025j(interfaceC13513m2);
            if (m7025j != InterfaceC13548v0.f29904a) {
                return m7025j.equals(C12673d.m7025j(interfaceC13513m));
            }
            return false;
        } else {
            m4734a(7);
            throw null;
        }
    }

    /* renamed from: g */
    public static boolean m4728g(AbstractC13544u abstractC13544u) {
        if (abstractC13544u != null) {
            return abstractC13544u == f29888a || abstractC13544u == f29889b;
        }
        m4734a(14);
        throw null;
    }

    /* renamed from: h */
    public static boolean m4727h(InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
        if (interfaceC13521q == null) {
            m4734a(2);
            throw null;
        } else if (interfaceC13513m != null) {
            return m4730e(f29899l, interfaceC13521q, interfaceC13513m) == null;
        } else {
            m4734a(3);
            throw null;
        }
    }

    /* renamed from: i */
    private static void m4726i(AbstractC13544u abstractC13544u) {
        f29902o.put(abstractC13544u.mo4711b(), abstractC13544u);
    }

    /* renamed from: j */
    public static AbstractC13544u m4725j(AbstractC13333g1 abstractC13333g1) {
        if (abstractC13333g1 != null) {
            AbstractC13544u abstractC13544u = f29902o.get(abstractC13333g1);
            if (abstractC13544u != null) {
                if (abstractC13544u != null) {
                    return abstractC13544u;
                }
                m4734a(16);
                throw null;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + abstractC13333g1);
        }
        m4734a(15);
        throw null;
    }
}
