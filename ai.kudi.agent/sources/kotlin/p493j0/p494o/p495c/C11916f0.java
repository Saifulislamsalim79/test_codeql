package kotlin.p493j0.p494o.p495c;

import java.lang.ref.SoftReference;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* compiled from: ReflectProperties.java */
/* renamed from: kotlin.j0.o.c.f0 */
/* loaded from: classes3.dex */
public class C11916f0 {

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.j0.o.c.f0$a */
    /* loaded from: classes3.dex */
    public static class C11917a<T> extends AbstractC11919c<T> implements InterfaceC11756a<T> {

        /* renamed from: d */
        private final InterfaceC11756a<T> f26600d;

        /* renamed from: e */
        private volatile SoftReference<Object> f26601e;

        public C11917a(T t, InterfaceC11756a<T> interfaceC11756a) {
            if (interfaceC11756a != null) {
                this.f26601e = null;
                this.f26600d = interfaceC11756a;
                if (t != null) {
                    this.f26601e = new SoftReference<>(m10161a(t));
                    return;
                }
                return;
            }
            m10163e(0);
            throw null;
        }

        /* renamed from: e */
        private static /* synthetic */ void m10163e(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.p493j0.p494o.p495c.C11916f0.AbstractC11919c, kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f26601e;
            if (softReference != null && (obj = softReference.get()) != null) {
                return m10159c(obj);
            }
            T invoke = this.f26600d.invoke();
            this.f26601e = new SoftReference<>(m10161a(invoke));
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.j0.o.c.f0$b */
    /* loaded from: classes3.dex */
    public static class C11918b<T> extends AbstractC11919c<T> {

        /* renamed from: d */
        private final InterfaceC11756a<T> f26602d;

        /* renamed from: e */
        private volatile Object f26603e;

        public C11918b(InterfaceC11756a<T> interfaceC11756a) {
            if (interfaceC11756a != null) {
                this.f26603e = null;
                this.f26602d = interfaceC11756a;
                return;
            }
            m10162e(0);
            throw null;
        }

        /* renamed from: e */
        private static /* synthetic */ void m10162e(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kotlin.p493j0.p494o.p495c.C11916f0.AbstractC11919c, kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            Object obj = this.f26603e;
            if (obj != null) {
                return m10159c(obj);
            }
            T invoke = this.f26602d.invoke();
            this.f26603e = m10161a(invoke);
            return invoke;
        }
    }

    /* compiled from: ReflectProperties.java */
    /* renamed from: kotlin.j0.o.c.f0$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11919c<T> {

        /* renamed from: c */
        private static final Object f26604c = new C11920a();

        /* compiled from: ReflectProperties.java */
        /* renamed from: kotlin.j0.o.c.f0$c$a */
        /* loaded from: classes3.dex */
        static class C11920a {
            C11920a() {
            }
        }

        /* renamed from: a */
        protected Object m10161a(T t) {
            return t == null ? f26604c : t;
        }

        /* renamed from: b */
        public final T m10160b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        protected T m10159c(Object obj) {
            if (obj == f26604c) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    /* renamed from: a */
    private static /* synthetic */ void m10167a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C11918b<T> m10166b(InterfaceC11756a<T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            return new C11918b<>(interfaceC11756a);
        }
        m10167a(0);
        throw null;
    }

    /* renamed from: c */
    public static <T> C11917a<T> m10165c(T t, InterfaceC11756a<T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            return new C11917a<>(t, interfaceC11756a);
        }
        m10167a(1);
        throw null;
    }

    /* renamed from: d */
    public static <T> C11917a<T> m10164d(InterfaceC11756a<T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            return m10165c(null, interfaceC11756a);
        }
        m10167a(2);
        throw null;
    }
}
