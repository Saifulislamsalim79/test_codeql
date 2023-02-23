package kotlin.reflect.jvm.internal.impl.utils;
/* loaded from: classes3.dex */
public class WrappedValues {

    /* renamed from: a */
    private static final Object f30064a = new C13632a();

    /* renamed from: b */
    public static volatile boolean f30065b = false;

    /* loaded from: classes3.dex */
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    /* loaded from: classes3.dex */
    static class C13632a {
        C13632a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    /* loaded from: classes3.dex */
    public static final class C13633b {

        /* renamed from: a */
        private final Throwable f30066a;

        /* synthetic */ C13633b(Throwable th, C13632a c13632a) {
            this(th);
        }

        /* renamed from: a */
        private static /* synthetic */ void m4289a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        /* renamed from: b */
        public Throwable m4288b() {
            Throwable th = this.f30066a;
            if (th != null) {
                return th;
            }
            m4289a(1);
            throw null;
        }

        public String toString() {
            return this.f30066a.toString();
        }

        private C13633b(Throwable th) {
            if (th != null) {
                this.f30066a = th;
            } else {
                m4289a(0);
                throw null;
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m4295a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static <V> Object m4294b(V v) {
        if (v != null) {
            if (v != null) {
                return v;
            }
            m4295a(2);
            throw null;
        }
        Object obj = f30064a;
        if (obj != null) {
            return obj;
        }
        m4295a(1);
        throw null;
    }

    /* renamed from: c */
    public static Object m4293c(Throwable th) {
        if (th != null) {
            return new C13633b(th, null);
        }
        m4295a(3);
        throw null;
    }

    /* renamed from: d */
    public static <V> V m4292d(Object obj) {
        if (obj != null) {
            m4290f(obj);
            return (V) m4291e(obj);
        }
        m4295a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static <V> V m4291e(Object obj) {
        if (obj != 0) {
            if (obj == f30064a) {
                return null;
            }
            return obj;
        }
        m4295a(0);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <V> V m4290f(Object obj) {
        if (obj instanceof C13633b) {
            Throwable m4288b = ((C13633b) obj).m4288b();
            if (f30065b && C13642c.m4268a(m4288b)) {
                throw new WrappedProcessCanceledException(m4288b);
            }
            C13642c.m4267b(m4288b);
            throw null;
        }
        return obj;
    }
}
