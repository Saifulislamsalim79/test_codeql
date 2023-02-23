package kotlin.p493j0.p494o.p495c.p497p0.p537k;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p549l0.C13277t;
import kotlin.reflect.jvm.internal.impl.utils.C13642c;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
/* compiled from: LockBasedStorageManager.java */
/* renamed from: kotlin.j0.o.c.p0.k.f */
/* loaded from: classes3.dex */
public class C12928f implements InterfaceC12954n {

    /* renamed from: d */
    private static final String f28983d;

    /* renamed from: e */
    public static final InterfaceC12954n f28984e;

    /* renamed from: a */
    protected final InterfaceC12950k f28985a;

    /* renamed from: b */
    private final InterfaceC12935f f28986b;

    /* renamed from: c */
    private final String f28987c;

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$a */
    /* loaded from: classes3.dex */
    static class C12929a extends C12928f {
        C12929a(String str, InterfaceC12935f interfaceC12935f, InterfaceC12950k interfaceC12950k) {
            super(str, interfaceC12935f, interfaceC12950k, null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m6404j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f
        /* renamed from: p */
        protected <K, V> C12945o<V> mo6403p(String str, K k) {
            if (str != null) {
                C12945o<V> m6381a = C12945o.m6381a();
                if (m6381a != null) {
                    return m6381a;
                }
                m6404j(1);
                throw null;
            }
            m6404j(0);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$b */
    /* loaded from: classes3.dex */
    class C12930b extends C12940j<T> {

        /* renamed from: f */
        final /* synthetic */ Object f28988f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12930b(C12928f c12928f, C12928f c12928f2, InterfaceC11756a interfaceC11756a, Object obj) {
            super(c12928f2, interfaceC11756a);
            this.f28988f = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m6402a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h
        /* renamed from: c */
        protected C12945o<T> mo6392c(boolean z) {
            C12945o<T> m6378d = C12945o.m6378d(this.f28988f);
            if (m6378d != 0) {
                return m6378d;
            }
            m6402a(0);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$c */
    /* loaded from: classes3.dex */
    class C12931c extends AbstractC12941k<T> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC11767l f28989w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11767l f28990x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12931c(C12928f c12928f, C12928f c12928f2, InterfaceC11756a interfaceC11756a, InterfaceC11767l interfaceC11767l, InterfaceC11767l interfaceC11767l2) {
            super(c12928f2, interfaceC11756a);
            this.f28989w = interfaceC11767l;
            this.f28990x = interfaceC11767l2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m6401a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h
        /* renamed from: c */
        protected C12945o<T> mo6392c(boolean z) {
            InterfaceC11767l interfaceC11767l = this.f28989w;
            if (interfaceC11767l == null) {
                C12945o<T> mo6392c = super.mo6392c(z);
                if (mo6392c != 0) {
                    return mo6392c;
                }
                m6401a(0);
                throw null;
            }
            C12945o<T> m6378d = C12945o.m6378d(interfaceC11767l.invoke(Boolean.valueOf(z)));
            if (m6378d != 0) {
                return m6378d;
            }
            m6401a(1);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.AbstractC12939i
        /* renamed from: e */
        protected void mo6388e(T t) {
            if (t != 0) {
                this.f28990x.invoke(t);
            } else {
                m6401a(2);
                throw null;
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$d */
    /* loaded from: classes3.dex */
    private static class C12932d<K, V> extends C12933e<K, V> implements InterfaceC12923a<K, V> {
        /* synthetic */ C12932d(C12928f c12928f, ConcurrentMap concurrentMap, C12929a c12929a) {
            this(c12928f, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m6400b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12933e, kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12923a
        /* renamed from: a */
        public V mo6399a(K k, InterfaceC11756a<? extends V> interfaceC11756a) {
            if (interfaceC11756a != null) {
                V v = (V) super.mo6399a(k, interfaceC11756a);
                if (v != null) {
                    return v;
                }
                m6400b(3);
                throw null;
            }
            m6400b(2);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C12932d(C12928f c12928f, ConcurrentMap<C12937g<K, V>, Object> concurrentMap) {
            super(c12928f, concurrentMap, null);
            if (c12928f == null) {
                m6400b(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m6400b(1);
                throw null;
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$e */
    /* loaded from: classes3.dex */
    private static class C12933e<K, V> extends C12942l<C12937g<K, V>, V> implements InterfaceC12924b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.j0.o.c.p0.k.f$e$a */
        /* loaded from: classes3.dex */
        class C12934a implements InterfaceC11767l<C12937g<K, V>, V> {
            C12934a() {
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public V invoke(C12937g<K, V> c12937g) {
                return (V) ((C12937g) c12937g).f28993b.invoke();
            }
        }

        /* synthetic */ C12933e(C12928f c12928f, ConcurrentMap concurrentMap, C12929a c12929a) {
            this(c12928f, concurrentMap);
        }

        /* renamed from: b */
        private static /* synthetic */ void m6398b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo6399a(K k, InterfaceC11756a<? extends V> interfaceC11756a) {
            if (interfaceC11756a != null) {
                return invoke(new C12937g(k, interfaceC11756a));
            }
            m6398b(2);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C12933e(C12928f c12928f, ConcurrentMap<C12937g<K, V>, Object> concurrentMap) {
            super(c12928f, concurrentMap, new C12934a());
            if (c12928f == null) {
                m6398b(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m6398b(1);
                throw null;
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC12935f {

        /* renamed from: a */
        public static final InterfaceC12935f f28991a = new C12936a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.j0.o.c.p0.k.f$f$a */
        /* loaded from: classes3.dex */
        static class C12936a implements InterfaceC12935f {
            C12936a() {
            }

            /* renamed from: b */
            private static /* synthetic */ void m6395b(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.InterfaceC12935f
            /* renamed from: a */
            public RuntimeException mo6396a(Throwable th) {
                if (th == null) {
                    m6395b(0);
                    throw null;
                }
                C13642c.m4267b(th);
                throw null;
            }
        }

        /* renamed from: a */
        RuntimeException mo6396a(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$g */
    /* loaded from: classes3.dex */
    public static class C12937g<K, V> {

        /* renamed from: a */
        private final K f28992a;

        /* renamed from: b */
        private final InterfaceC11756a<? extends V> f28993b;

        public C12937g(K k, InterfaceC11756a<? extends V> interfaceC11756a) {
            this.f28992a = k;
            this.f28993b = interfaceC11756a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C12937g.class == obj.getClass() && this.f28992a.equals(((C12937g) obj).f28992a);
        }

        public int hashCode() {
            return this.f28992a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$h */
    /* loaded from: classes3.dex */
    public static class C12938h<T> implements InterfaceC12949j<T> {

        /* renamed from: c */
        private final C12928f f28994c;

        /* renamed from: d */
        private final InterfaceC11756a<? extends T> f28995d;

        /* renamed from: e */
        private volatile Object f28996e;

        public C12938h(C12928f c12928f, InterfaceC11756a<? extends T> interfaceC11756a) {
            if (c12928f == null) {
                m6393a(0);
                throw null;
            } else if (interfaceC11756a != null) {
                this.f28996e = EnumC12944n.NOT_COMPUTED;
                this.f28994c = c12928f;
                this.f28995d = interfaceC11756a;
            } else {
                m6393a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m6393a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        protected void mo6389b(T t) {
        }

        /* renamed from: c */
        protected C12945o<T> mo6392c(boolean z) {
            C12945o<T> mo6403p = this.f28994c.mo6403p("in a lazy value", null);
            if (mo6403p != null) {
                return mo6403p;
            }
            m6393a(2);
            throw null;
        }

        /* renamed from: d */
        public boolean m6391d() {
            return (this.f28996e == EnumC12944n.NOT_COMPUTED || this.f28996e == EnumC12944n.COMPUTING) ? false : true;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            T t = (T) this.f28996e;
            if (!(t instanceof EnumC12944n)) {
                WrappedValues.m4290f(t);
                return t;
            }
            this.f28994c.f28985a.lock();
            try {
                T t2 = (T) this.f28996e;
                if (t2 instanceof EnumC12944n) {
                    if (t2 == EnumC12944n.COMPUTING) {
                        this.f28996e = EnumC12944n.RECURSION_WAS_DETECTED;
                        C12945o<T> mo6392c = mo6392c(true);
                        if (!mo6392c.m6379c()) {
                            t2 = mo6392c.m6380b();
                        }
                    }
                    if (t2 == EnumC12944n.RECURSION_WAS_DETECTED) {
                        C12945o<T> mo6392c2 = mo6392c(false);
                        if (!mo6392c2.m6379c()) {
                            t2 = mo6392c2.m6380b();
                        }
                    }
                    this.f28996e = EnumC12944n.COMPUTING;
                    t2 = this.f28995d.invoke();
                    mo6389b(t2);
                    this.f28996e = t2;
                } else {
                    WrappedValues.m4290f(t2);
                }
                return t2;
            } finally {
                this.f28994c.f28985a.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$i */
    /* loaded from: classes3.dex */
    private static abstract class AbstractC12939i<T> extends C12938h<T> {

        /* renamed from: f */
        private volatile C12952l<T> f28997f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC12939i(C12928f c12928f, InterfaceC11756a<? extends T> interfaceC11756a) {
            super(c12928f, interfaceC11756a);
            if (c12928f == null) {
                m6390a(0);
                throw null;
            } else if (interfaceC11756a != null) {
                this.f28997f = null;
            } else {
                m6390a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m6390a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h
        /* renamed from: b */
        protected final void mo6389b(T t) {
            this.f28997f = new C12952l<>(t);
            try {
                mo6388e(t);
            } finally {
                this.f28997f = null;
            }
        }

        /* renamed from: e */
        protected abstract void mo6388e(T t);

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h, kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            C12952l<T> c12952l = this.f28997f;
            if (c12952l != null && c12952l.m6373b()) {
                return c12952l.m6374a();
            }
            return (T) super.invoke();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$j */
    /* loaded from: classes3.dex */
    private static class C12940j<T> extends C12938h<T> implements InterfaceC12948i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12940j(C12928f c12928f, InterfaceC11756a<? extends T> interfaceC11756a) {
            super(c12928f, interfaceC11756a);
            if (c12928f == null) {
                m6387a(0);
                throw null;
            } else if (interfaceC11756a != null) {
            } else {
                m6387a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m6387a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h, kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            m6387a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$k */
    /* loaded from: classes3.dex */
    private static abstract class AbstractC12941k<T> extends AbstractC12939i<T> implements InterfaceC12948i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC12941k(C12928f c12928f, InterfaceC11756a<? extends T> interfaceC11756a) {
            super(c12928f, interfaceC11756a);
            if (c12928f == null) {
                m6386a(0);
                throw null;
            } else if (interfaceC11756a != null) {
            } else {
                m6386a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m6386a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.AbstractC12939i, kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12938h, kotlin.p483e0.p484c.InterfaceC11756a
        public T invoke() {
            T t = (T) super.invoke();
            if (t != null) {
                return t;
            }
            m6386a(2);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$l */
    /* loaded from: classes3.dex */
    public static class C12942l<K, V> implements InterfaceC12947h<K, V> {

        /* renamed from: c */
        private final C12928f f28998c;

        /* renamed from: d */
        private final ConcurrentMap<K, Object> f28999d;

        /* renamed from: e */
        private final InterfaceC11767l<? super K, ? extends V> f29000e;

        public C12942l(C12928f c12928f, ConcurrentMap<K, Object> concurrentMap, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
            if (c12928f == null) {
                m6385b(0);
                throw null;
            } else if (concurrentMap == null) {
                m6385b(1);
                throw null;
            } else if (interfaceC11767l != null) {
                this.f28998c = c12928f;
                this.f28999d = concurrentMap;
                this.f29000e = interfaceC11767l;
            } else {
                m6385b(2);
                throw null;
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m6385b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: c */
        private AssertionError m6384c(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f28998c);
            C12928f.m6405q(assertionError);
            return assertionError;
        }

        /* renamed from: e */
        protected C12945o<V> m6383e(K k, boolean z) {
            C12945o<V> mo6403p = this.f28998c.mo6403p("", k);
            if (mo6403p != null) {
                return mo6403p;
            }
            m6385b(3);
            throw null;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public V invoke(K k) {
            AssertionError assertionError;
            V v;
            Object obj = this.f28999d.get(k);
            if (obj != null && obj != EnumC12944n.COMPUTING) {
                return (V) WrappedValues.m4292d(obj);
            }
            this.f28998c.f28985a.lock();
            try {
                Object obj2 = this.f28999d.get(k);
                if (obj2 == EnumC12944n.COMPUTING) {
                    obj2 = EnumC12944n.RECURSION_WAS_DETECTED;
                    C12945o<V> m6383e = m6383e(k, true);
                    if (!m6383e.m6379c()) {
                        v = m6383e.m6380b();
                        return v;
                    }
                }
                if (obj2 == EnumC12944n.RECURSION_WAS_DETECTED) {
                    C12945o<V> m6383e2 = m6383e(k, false);
                    if (!m6383e2.m6379c()) {
                        v = m6383e2.m6380b();
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) WrappedValues.m4292d(obj2);
                    return v;
                }
                try {
                    this.f28999d.put(k, EnumC12944n.COMPUTING);
                    V invoke = this.f29000e.invoke(k);
                    Object put = this.f28999d.put(k, WrappedValues.m4294b(invoke));
                    if (put == EnumC12944n.COMPUTING) {
                        return invoke;
                    }
                    assertionError = m6384c(k, put);
                    try {
                        throw assertionError;
                    } catch (Throwable th) {
                        th = th;
                        if (C13642c.m4268a(th)) {
                            this.f28999d.remove(k);
                            throw th;
                        } else if (th == assertionError) {
                            this.f28998c.f28986b.mo6396a(th);
                            throw null;
                        } else {
                            Object put2 = this.f28999d.put(k, WrappedValues.m4293c(th));
                            if (put2 == EnumC12944n.COMPUTING) {
                                this.f28998c.f28986b.mo6396a(th);
                                throw null;
                            }
                            throw m6384c(k, put2);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    assertionError = null;
                }
            } finally {
                this.f28998c.f28985a.unlock();
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12947h
        /* renamed from: k */
        public boolean mo6377k(K k) {
            Object obj = this.f28999d.get(k);
            return (obj == null || obj == EnumC12944n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$m */
    /* loaded from: classes3.dex */
    public static class C12943m<K, V> extends C12942l<K, V> implements InterfaceC12946g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12943m(C12928f c12928f, ConcurrentMap<K, Object> concurrentMap, InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
            super(c12928f, concurrentMap, interfaceC11767l);
            if (c12928f == null) {
                m6382b(0);
                throw null;
            } else if (concurrentMap == null) {
                m6382b(1);
                throw null;
            } else if (interfaceC11767l != null) {
            } else {
                m6382b(2);
                throw null;
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m6382b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.C12942l, kotlin.p483e0.p484c.InterfaceC11767l
        public V invoke(K k) {
            V v = (V) super.invoke(k);
            if (v != null) {
                return v;
            }
            m6382b(3);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$n */
    /* loaded from: classes3.dex */
    public enum EnumC12944n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.j0.o.c.p0.k.f$o */
    /* loaded from: classes3.dex */
    public static class C12945o<T> {

        /* renamed from: a */
        private final T f29005a;

        /* renamed from: b */
        private final boolean f29006b;

        private C12945o(T t, boolean z) {
            this.f29005a = t;
            this.f29006b = z;
        }

        /* renamed from: a */
        public static <T> C12945o<T> m6381a() {
            return new C12945o<>(null, true);
        }

        /* renamed from: d */
        public static <T> C12945o<T> m6378d(T t) {
            return new C12945o<>(t, false);
        }

        /* renamed from: b */
        public T m6380b() {
            return this.f29005a;
        }

        /* renamed from: c */
        public boolean m6379c() {
            return this.f29006b;
        }

        public String toString() {
            return m6379c() ? "FALL_THROUGH" : String.valueOf(this.f29005a);
        }
    }

    static {
        String m5418K0;
        m5418K0 = C13277t.m5418K0(C12928f.class.getCanonicalName(), ".", "");
        f28983d = m5418K0;
        f28984e = new C12929a("NO_LOCKS", InterfaceC12935f.f28991a, C12927e.f28982b);
    }

    /* synthetic */ C12928f(String str, InterfaceC12935f interfaceC12935f, InterfaceC12950k interfaceC12950k, C12929a c12929a) {
        this(str, interfaceC12935f, interfaceC12950k);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m6411j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f.m6411j(int):void");
    }

    /* renamed from: k */
    static /* synthetic */ InterfaceC12935f m6410k(C12928f c12928f) {
        return c12928f.f28986b;
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m6408m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m6405q(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!stackTrace[i2].getClassName().startsWith(f28983d)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            if (t != null) {
                return t;
            }
            m6411j(37);
            throw null;
        }
        m6411j(36);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: a */
    public <K, V> InterfaceC12924b<K, V> mo6370a() {
        return new C12933e(this, m6408m(), null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: b */
    public <K, V> InterfaceC12923a<K, V> mo6369b() {
        return new C12932d(this, m6408m(), null);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: c */
    public <T> InterfaceC12948i<T> mo6368c(InterfaceC11756a<? extends T> interfaceC11756a, T t) {
        if (interfaceC11756a == null) {
            m6411j(26);
            throw null;
        } else if (t != null) {
            return new C12930b(this, this, interfaceC11756a, t);
        } else {
            m6411j(27);
            throw null;
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: d */
    public <T> InterfaceC12948i<T> mo6367d(InterfaceC11756a<? extends T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            return new C12940j(this, interfaceC11756a);
        }
        m6411j(23);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: e */
    public <T> T mo6366e(InterfaceC11756a<? extends T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            this.f28985a.lock();
            try {
                return interfaceC11756a.invoke();
            } catch (Throwable th) {
                try {
                    this.f28986b.mo6396a(th);
                    throw null;
                } finally {
                    this.f28985a.unlock();
                }
            }
        }
        m6411j(34);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: f */
    public <T> InterfaceC12949j<T> mo6365f(InterfaceC11756a<? extends T> interfaceC11756a) {
        if (interfaceC11756a != null) {
            return new C12938h(this, interfaceC11756a);
        }
        m6411j(30);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: g */
    public <T> InterfaceC12948i<T> mo6364g(InterfaceC11756a<? extends T> interfaceC11756a, InterfaceC11767l<? super Boolean, ? extends T> interfaceC11767l, InterfaceC11767l<? super T, C13666w> interfaceC11767l2) {
        if (interfaceC11756a == null) {
            m6411j(28);
            throw null;
        } else if (interfaceC11767l2 != null) {
            return new C12931c(this, this, interfaceC11756a, interfaceC11767l, interfaceC11767l2);
        } else {
            m6411j(29);
            throw null;
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: h */
    public <K, V> InterfaceC12946g<K, V> mo6363h(InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        if (interfaceC11767l != null) {
            InterfaceC12946g<K, V> m6407n = m6407n(interfaceC11767l, m6408m());
            if (m6407n != null) {
                return m6407n;
            }
            m6411j(10);
            throw null;
        }
        m6411j(9);
        throw null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n
    /* renamed from: i */
    public <K, V> InterfaceC12947h<K, V> mo6362i(InterfaceC11767l<? super K, ? extends V> interfaceC11767l) {
        if (interfaceC11767l != null) {
            InterfaceC12947h<K, V> m6406o = m6406o(interfaceC11767l, m6408m());
            if (m6406o != null) {
                return m6406o;
            }
            m6411j(20);
            throw null;
        }
        m6411j(19);
        throw null;
    }

    /* renamed from: n */
    public <K, V> InterfaceC12946g<K, V> m6407n(InterfaceC11767l<? super K, ? extends V> interfaceC11767l, ConcurrentMap<K, Object> concurrentMap) {
        if (interfaceC11767l == null) {
            m6411j(14);
            throw null;
        } else if (concurrentMap != null) {
            return new C12943m(this, concurrentMap, interfaceC11767l);
        } else {
            m6411j(15);
            throw null;
        }
    }

    /* renamed from: o */
    public <K, V> InterfaceC12947h<K, V> m6406o(InterfaceC11767l<? super K, ? extends V> interfaceC11767l, ConcurrentMap<K, Object> concurrentMap) {
        if (interfaceC11767l == null) {
            m6411j(21);
            throw null;
        } else if (concurrentMap != null) {
            return new C12942l(this, concurrentMap, interfaceC11767l);
        } else {
            m6411j(22);
            throw null;
        }
    }

    /* renamed from: p */
    protected <K, V> C12945o<V> mo6403p(String str, K k) {
        String str2;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion detected ");
            sb.append(str);
            if (k == null) {
                str2 = "";
            } else {
                str2 = "on input: " + k;
            }
            sb.append(str2);
            sb.append(" under ");
            sb.append(this);
            AssertionError assertionError = new AssertionError(sb.toString());
            m6405q(assertionError);
            throw assertionError;
        }
        m6411j(35);
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f28987c + ")";
    }

    private C12928f(String str, InterfaceC12935f interfaceC12935f, InterfaceC12950k interfaceC12950k) {
        if (str == null) {
            m6411j(4);
            throw null;
        } else if (interfaceC12935f == null) {
            m6411j(5);
            throw null;
        } else if (interfaceC12950k != null) {
            this.f28985a = interfaceC12950k;
            this.f28986b = interfaceC12935f;
            this.f28987c = str;
        } else {
            m6411j(6);
            throw null;
        }
    }

    public C12928f(String str) {
        this(str, (Runnable) null, (InterfaceC11767l<InterruptedException, C13666w>) null);
    }

    public C12928f(String str, Runnable runnable, InterfaceC11767l<InterruptedException, C13666w> interfaceC11767l) {
        this(str, InterfaceC12935f.f28991a, InterfaceC12950k.f29007a.m6375a(runnable, interfaceC11767l));
    }
}
