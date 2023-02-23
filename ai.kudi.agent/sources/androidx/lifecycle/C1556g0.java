package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ViewModelProvider.kt */
/* renamed from: androidx.lifecycle.g0 */
/* loaded from: classes2.dex */
public class C1556g0 {

    /* renamed from: a */
    private final C1566i0 f4766a;

    /* renamed from: b */
    private final InterfaceC1559b f4767b;

    /* compiled from: ViewModelProvider.kt */
    /* renamed from: androidx.lifecycle.g0$a */
    /* loaded from: classes2.dex */
    public static class C1557a extends C1561d {

        /* renamed from: d */
        public static final C1558a f4768d = new C1558a(null);

        /* renamed from: e */
        private static C1557a f4769e;

        /* renamed from: c */
        private final Application f4770c;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.g0$a$a */
        /* loaded from: classes2.dex */
        public static final class C1558a {
            private C1558a() {
            }

            public /* synthetic */ C1558a(kotlin.e0.d.g gVar) {
                this();
            }

            /* renamed from: a */
            public final InterfaceC1559b m35528a(j0 j0Var) {
                kotlin.e0.d.l.f(j0Var, "owner");
                if (j0Var instanceof h) {
                    InterfaceC1559b defaultViewModelProviderFactory = ((h) j0Var).getDefaultViewModelProviderFactory();
                    kotlin.e0.d.l.e(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
                return C1561d.f4771a.m35522a();
            }

            /* renamed from: b */
            public final C1557a m35527b(Application application) {
                kotlin.e0.d.l.f(application, "application");
                if (C1557a.f4769e == null) {
                    C1557a.f4769e = new C1557a(application);
                }
                C1557a c1557a = C1557a.f4769e;
                kotlin.e0.d.l.d(c1557a);
                return c1557a;
            }
        }

        public C1557a(Application application) {
            kotlin.e0.d.l.f(application, "application");
            this.f4770c = application;
        }

        /* renamed from: f */
        public static final C1557a m35529f(Application application) {
            return f4768d.m35527b(application);
        }

        @Override // androidx.lifecycle.C1556g0.C1561d, androidx.lifecycle.C1556g0.InterfaceC1559b
        public <T extends d0> T create(Class<T> cls) {
            kotlin.e0.d.l.f(cls, "modelClass");
            if (C1538a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(this.f4770c);
                    kotlin.e0.d.l.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e4);
                }
            }
            return (T) super.create(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* renamed from: androidx.lifecycle.g0$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1559b {
        <T extends d0> T create(Class<T> cls);
    }

    /* compiled from: ViewModelProvider.kt */
    /* renamed from: androidx.lifecycle.g0$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1560c extends C1563e implements InterfaceC1559b {
        /* renamed from: b */
        public abstract <T extends d0> T mo35526b(String str, Class<T> cls);

        public <T extends d0> T create(Class<T> cls) {
            kotlin.e0.d.l.f(cls, "modelClass");
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* renamed from: androidx.lifecycle.g0$d */
    /* loaded from: classes2.dex */
    public static class C1561d implements InterfaceC1559b {

        /* renamed from: a */
        public static final C1562a f4771a = new C1562a(null);

        /* renamed from: b */
        private static C1561d f4772b;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.g0$d$a */
        /* loaded from: classes2.dex */
        public static final class C1562a {
            private C1562a() {
            }

            public /* synthetic */ C1562a(kotlin.e0.d.g gVar) {
                this();
            }

            /* renamed from: a */
            public final C1561d m35522a() {
                if (C1561d.f4772b == null) {
                    C1561d.f4772b = new C1561d();
                }
                C1561d c1561d = C1561d.f4772b;
                kotlin.e0.d.l.d(c1561d);
                return c1561d;
            }
        }

        /* renamed from: c */
        public static final C1561d m35523c() {
            return f4771a.m35522a();
        }

        @Override // androidx.lifecycle.C1556g0.InterfaceC1559b
        public <T extends d0> T create(Class<T> cls) {
            kotlin.e0.d.l.f(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                kotlin.e0.d.l.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(kotlin.e0.d.l.m("Cannot create an instance of ", cls), e2);
            }
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* renamed from: androidx.lifecycle.g0$e */
    /* loaded from: classes2.dex */
    public static class C1563e {
        /* renamed from: a */
        public void mo35521a(d0 d0Var) {
            kotlin.e0.d.l.f(d0Var, "viewModel");
        }
    }

    public C1556g0(C1566i0 c1566i0, InterfaceC1559b interfaceC1559b) {
        kotlin.e0.d.l.f(c1566i0, "store");
        kotlin.e0.d.l.f(interfaceC1559b, "factory");
        this.f4766a = c1566i0;
        this.f4767b = interfaceC1559b;
    }

    /* renamed from: a */
    public <T extends d0> T m35533a(Class<T> cls) {
        kotlin.e0.d.l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m35532b(kotlin.e0.d.l.m("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends d0> T m35532b(String str, Class<T> cls) {
        T t;
        kotlin.e0.d.l.f(str, "key");
        kotlin.e0.d.l.f(cls, "modelClass");
        T t2 = (T) this.f4766a.m35516b(str);
        if (cls.isInstance(t2)) {
            InterfaceC1559b interfaceC1559b = this.f4767b;
            C1563e c1563e = interfaceC1559b instanceof C1563e ? (C1563e) interfaceC1559b : null;
            if (c1563e != null) {
                kotlin.e0.d.l.e(t2, "viewModel");
                c1563e.mo35521a(t2);
            }
            if (t2 != null) {
                return t2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        InterfaceC1559b interfaceC1559b2 = this.f4767b;
        if (interfaceC1559b2 instanceof AbstractC1560c) {
            t = (T) ((AbstractC1560c) interfaceC1559b2).mo35526b(str, cls);
        } else {
            t = (T) interfaceC1559b2.create(cls);
        }
        this.f4766a.m35514d(str, t);
        kotlin.e0.d.l.e(t, "viewModel");
        return t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1556g0(androidx.lifecycle.j0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.e0.d.l.f(r3, r0)
            androidx.lifecycle.i0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.e0.d.l.e(r0, r1)
            androidx.lifecycle.g0$a$a r1 = androidx.lifecycle.C1556g0.C1557a.f4768d
            androidx.lifecycle.g0$b r3 = r1.m35528a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1556g0.<init>(androidx.lifecycle.j0):void");
    }
}
