package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.HashMap;
import java.util.Map;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13523r;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13449a;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13450b;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13451c;
/* compiled from: JavaDescriptorVisibilities.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.r */
/* loaded from: classes3.dex */
public class C12378r {

    /* renamed from: a */
    public static final AbstractC13544u f27460a = new C12379a(C13449a.f29805c);

    /* renamed from: b */
    public static final AbstractC13544u f27461b = new C12380b(C13451c.f29807c);

    /* renamed from: c */
    public static final AbstractC13544u f27462c = new C12381c(C13450b.f29806c);

    /* renamed from: d */
    private static final Map<AbstractC13333g1, AbstractC13544u> f27463d = new HashMap();

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.r$a */
    /* loaded from: classes3.dex */
    static class C12379a extends AbstractC13523r {
        C12379a(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m9089g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m9089g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return C12378r.m9093d(interfaceC13521q, interfaceC13513m);
            } else {
                m9089g(1);
                throw null;
            }
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.r$b */
    /* loaded from: classes3.dex */
    static class C12380b extends AbstractC13523r {
        C12380b(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m9088g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m9088g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return C12378r.m9092e(interfaceC12797d, interfaceC13521q, interfaceC13513m);
            } else {
                m9088g(1);
                throw null;
            }
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.r$c */
    /* loaded from: classes3.dex */
    static class C12381c extends AbstractC13523r {
        C12381c(AbstractC13333g1 abstractC13333g1) {
            super(abstractC13333g1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m9087g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u
        /* renamed from: e */
        public boolean mo4708e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
            if (interfaceC13521q == null) {
                m9087g(0);
                throw null;
            } else if (interfaceC13513m != null) {
                return C12378r.m9092e(interfaceC12797d, interfaceC13521q, interfaceC13513m);
            } else {
                m9087g(1);
                throw null;
            }
        }
    }

    static {
        m9091f(f27460a);
        m9091f(f27461b);
        m9091f(f27462c);
    }

    /* renamed from: a */
    private static /* synthetic */ void m9096a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m9093d(InterfaceC13513m interfaceC13513m, InterfaceC13513m interfaceC13513m2) {
        if (interfaceC13513m == null) {
            m9096a(2);
            throw null;
        } else if (interfaceC13513m2 != null) {
            InterfaceC13320f0 interfaceC13320f0 = (InterfaceC13320f0) C12673d.m7017r(interfaceC13513m, InterfaceC13320f0.class, false);
            InterfaceC13320f0 interfaceC13320f02 = (InterfaceC13320f0) C12673d.m7017r(interfaceC13513m2, InterfaceC13320f0.class, false);
            return (interfaceC13320f02 == null || interfaceC13320f0 == null || !interfaceC13320f0.mo4954f().equals(interfaceC13320f02.mo4954f())) ? false : true;
        } else {
            m9096a(3);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m9092e(InterfaceC12797d interfaceC12797d, InterfaceC13521q interfaceC13521q, InterfaceC13513m interfaceC13513m) {
        if (interfaceC13521q == null) {
            m9096a(0);
            throw null;
        } else if (interfaceC13513m != null) {
            if (m9093d(C12673d.m7035M(interfaceC13521q), interfaceC13513m)) {
                return true;
            }
            return C13530t.f29890c.mo4708e(interfaceC12797d, interfaceC13521q, interfaceC13513m);
        } else {
            m9096a(1);
            throw null;
        }
    }

    /* renamed from: f */
    private static void m9091f(AbstractC13544u abstractC13544u) {
        f27463d.put(abstractC13544u.mo4711b(), abstractC13544u);
    }

    /* renamed from: g */
    public static AbstractC13544u m9090g(AbstractC13333g1 abstractC13333g1) {
        if (abstractC13333g1 != null) {
            AbstractC13544u abstractC13544u = f27463d.get(abstractC13333g1);
            if (abstractC13544u != null) {
                if (abstractC13544u != null) {
                    return abstractC13544u;
                }
                m9096a(6);
                throw null;
            }
            AbstractC13544u m4725j = C13530t.m4725j(abstractC13333g1);
            if (m4725j != null) {
                return m4725j;
            }
            m9096a(5);
            throw null;
        }
        m9096a(4);
        throw null;
    }
}
