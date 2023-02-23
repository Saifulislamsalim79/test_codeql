package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.InterfaceC14802c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Platform.java */
/* renamed from: retrofit2.j */
/* loaded from: classes3.dex */
public class C14834j {

    /* renamed from: a */
    private static final C14834j f33131a = m300c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Platform.java */
    /* renamed from: retrofit2.j$a */
    /* loaded from: classes3.dex */
    public static class C14835a extends C14834j {

        /* compiled from: Platform.java */
        /* renamed from: retrofit2.j$a$a */
        /* loaded from: classes3.dex */
        static class ExecutorC14836a implements Executor {

            /* renamed from: c */
            private final Handler f33132c = new Handler(Looper.getMainLooper());

            ExecutorC14836a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f33132c.post(runnable);
            }
        }

        C14835a() {
        }

        @Override // retrofit2.C14834j
        /* renamed from: a */
        InterfaceC14802c.AbstractC14803a mo298a(Executor executor) {
            if (executor != null) {
                return new C14809g(executor);
            }
            throw new AssertionError();
        }

        @Override // retrofit2.C14834j
        /* renamed from: b */
        public Executor mo297b() {
            return new ExecutorC14836a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Platform.java */
    /* renamed from: retrofit2.j$b */
    /* loaded from: classes3.dex */
    public static class C14837b extends C14834j {
        C14837b() {
        }

        @Override // retrofit2.C14834j
        /* renamed from: e */
        Object mo296e(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // retrofit2.C14834j
        /* renamed from: f */
        boolean mo295f(Method method) {
            return method.isDefault();
        }
    }

    C14834j() {
    }

    /* renamed from: c */
    private static C14834j m300c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new C14835a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C14837b();
        } catch (ClassNotFoundException unused2) {
            return new C14834j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C14834j m299d() {
        return f33131a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InterfaceC14802c.AbstractC14803a mo298a(Executor executor) {
        if (executor != null) {
            return new C14809g(executor);
        }
        return C14807f.f33080a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Executor mo297b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Object mo296e(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo295f(Method method) {
        return false;
    }
}
