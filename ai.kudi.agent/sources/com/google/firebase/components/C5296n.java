package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: Component.java */
/* renamed from: com.google.firebase.components.n */
/* loaded from: classes2.dex */
public final class C5296n<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f13118a;

    /* renamed from: b */
    private final Set<C5313u> f13119b;

    /* renamed from: c */
    private final int f13120c;

    /* renamed from: d */
    private final int f13121d;

    /* renamed from: e */
    private final InterfaceC5304q<T> f13122e;

    /* renamed from: f */
    private final Set<Class<?>> f13123f;

    /* compiled from: Component.java */
    /* renamed from: com.google.firebase.components.n$b */
    /* loaded from: classes2.dex */
    public static class C5298b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f13124a;

        /* renamed from: b */
        private final Set<C5313u> f13125b;

        /* renamed from: c */
        private int f13126c;

        /* renamed from: d */
        private int f13127d;

        /* renamed from: e */
        private InterfaceC5304q<T> f13128e;

        /* renamed from: f */
        private Set<Class<?>> f13129f;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public C5298b<T> m25209g() {
            this.f13127d = 1;
            return this;
        }

        /* renamed from: h */
        private C5298b<T> m25208h(int i) {
            C5318z.m25137d(this.f13126c == 0, "Instantiation type has already been set.");
            this.f13126c = i;
            return this;
        }

        /* renamed from: i */
        private void m25207i(Class<?> cls) {
            C5318z.m25140a(!this.f13124a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C5298b<T> m25214b(C5313u c5313u) {
            C5318z.m25138c(c5313u, "Null dependency");
            m25207i(c5313u.m25164c());
            this.f13125b.add(c5313u);
            return this;
        }

        /* renamed from: c */
        public C5298b<T> m25213c() {
            m25208h(1);
            return this;
        }

        /* renamed from: d */
        public C5296n<T> m25212d() {
            C5318z.m25137d(this.f13128e != null, "Missing required property: factory.");
            return new C5296n<>(new HashSet(this.f13124a), new HashSet(this.f13125b), this.f13126c, this.f13127d, this.f13128e, this.f13129f);
        }

        /* renamed from: e */
        public C5298b<T> m25211e() {
            m25208h(2);
            return this;
        }

        /* renamed from: f */
        public C5298b<T> m25210f(InterfaceC5304q<T> interfaceC5304q) {
            C5318z.m25138c(interfaceC5304q, "Null factory");
            this.f13128e = interfaceC5304q;
            return this;
        }

        @SafeVarargs
        private C5298b(Class<T> cls, Class<? super T>... clsArr) {
            this.f13124a = new HashSet();
            this.f13125b = new HashSet();
            this.f13126c = 0;
            this.f13127d = 0;
            this.f13129f = new HashSet();
            C5318z.m25138c(cls, "Null interface");
            this.f13124a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C5318z.m25138c(cls2, "Null interface");
            }
            Collections.addAll(this.f13124a, clsArr);
        }
    }

    /* renamed from: a */
    public static <T> C5298b<T> m25229a(Class<T> cls) {
        return new C5298b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C5298b<T> m25228b(Class<T> cls, Class<? super T>... clsArr) {
        return new C5298b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C5296n<T> m25223g(final T t, Class<T> cls) {
        C5298b m25222h = m25222h(cls);
        m25222h.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                Object obj = t;
                C5296n.m25218l(obj, interfaceC5299o);
                return obj;
            }
        });
        return m25222h.m25212d();
    }

    /* renamed from: h */
    public static <T> C5298b<T> m25222h(Class<T> cls) {
        C5298b<T> m25229a = m25229a(cls);
        m25229a.m25209g();
        return m25229a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ Object m25218l(Object obj, InterfaceC5299o interfaceC5299o) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static /* synthetic */ Object m25217m(Object obj, InterfaceC5299o interfaceC5299o) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C5296n<T> m25216n(final T t, Class<T> cls, Class<? super T>... clsArr) {
        C5298b m25228b = m25228b(cls, clsArr);
        m25228b.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                Object obj = t;
                C5296n.m25217m(obj, interfaceC5299o);
                return obj;
            }
        });
        return m25228b.m25212d();
    }

    /* renamed from: c */
    public Set<C5313u> m25227c() {
        return this.f13119b;
    }

    /* renamed from: d */
    public InterfaceC5304q<T> m25226d() {
        return this.f13122e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> m25225e() {
        return this.f13118a;
    }

    /* renamed from: f */
    public Set<Class<?>> m25224f() {
        return this.f13123f;
    }

    /* renamed from: i */
    public boolean m25221i() {
        return this.f13120c == 1;
    }

    /* renamed from: j */
    public boolean m25220j() {
        return this.f13120c == 2;
    }

    /* renamed from: k */
    public boolean m25219k() {
        return this.f13121d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f13118a.toArray()) + ">{" + this.f13120c + ", type=" + this.f13121d + ", deps=" + Arrays.toString(this.f13119b.toArray()) + "}";
    }

    private C5296n(Set<Class<? super T>> set, Set<C5313u> set2, int i, int i2, InterfaceC5304q<T> interfaceC5304q, Set<Class<?>> set3) {
        this.f13118a = Collections.unmodifiableSet(set);
        this.f13119b = Collections.unmodifiableSet(set2);
        this.f13120c = i;
        this.f13121d = i2;
        this.f13122e = interfaceC5304q;
        this.f13123f = Collections.unmodifiableSet(set3);
    }
}
