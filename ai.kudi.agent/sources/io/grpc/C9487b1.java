package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
/* compiled from: ServiceProviders.java */
/* renamed from: io.grpc.b1 */
/* loaded from: classes2.dex */
final class C9487b1 {

    /* compiled from: ServiceProviders.java */
    /* renamed from: io.grpc.b1$a */
    /* loaded from: classes2.dex */
    class C9488a implements Comparator<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9489b f22179c;

        C9488a(InterfaceC9489b interfaceC9489b) {
            this.f22179c = interfaceC9489b;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            int mo13085b = this.f22179c.mo13085b(t) - this.f22179c.mo13085b(t2);
            return mo13085b != 0 ? mo13085b : t.getClass().getName().compareTo(t2.getClass().getName());
        }
    }

    /* compiled from: ServiceProviders.java */
    /* renamed from: io.grpc.b1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC9489b<T> {
        /* renamed from: a */
        boolean mo13086a(T t);

        /* renamed from: b */
        int mo13085b(T t);
    }

    /* renamed from: a */
    static <T> T m14611a(Class<T> cls, Class<?> cls2) {
        try {
            return (T) cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
        }
    }

    /* renamed from: b */
    static <T> Iterable<T> m14610b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : iterable) {
            arrayList.add(m14611a(cls, cls2));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> Iterable<T> m14609c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m14608d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static <T> List<T> m14607e(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, InterfaceC9489b<T> interfaceC9489b) {
        Iterable m14609c;
        if (m14608d(classLoader)) {
            m14609c = m14610b(cls, iterable);
        } else {
            m14609c = m14609c(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : m14609c) {
            if (interfaceC9489b.mo13086a(t)) {
                arrayList.add(t);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C9488a(interfaceC9489b)));
        return Collections.unmodifiableList(arrayList);
    }
}
