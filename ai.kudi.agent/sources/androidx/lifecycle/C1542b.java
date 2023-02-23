package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassesInfoCache.java */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes2.dex */
final class C1542b {

    /* renamed from: c */
    static C1542b f4735c = new C1542b();

    /* renamed from: a */
    private final Map<Class<?>, C1543a> f4736a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4737b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes2.dex */
    public static class C1543a {

        /* renamed from: a */
        final Map<AbstractC1565i.b, List<C1544b>> f4738a = new HashMap();

        /* renamed from: b */
        final Map<C1544b, AbstractC1565i.b> f4739b;

        C1543a(Map<C1544b, AbstractC1565i.b> map) {
            this.f4739b = map;
            for (Map.Entry<C1544b, AbstractC1565i.b> entry : map.entrySet()) {
                AbstractC1565i.b value = entry.getValue();
                List<C1544b> list = this.f4738a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4738a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m35553b(List<C1544b> list, o oVar, AbstractC1565i.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m35552a(oVar, bVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m35554a(o oVar, AbstractC1565i.b bVar, Object obj) {
            m35553b(this.f4738a.get(bVar), oVar, bVar, obj);
            m35553b(this.f4738a.get(AbstractC1565i.b.ON_ANY), oVar, bVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes2.dex */
    public static final class C1544b {

        /* renamed from: a */
        final int f4740a;

        /* renamed from: b */
        final Method f4741b;

        C1544b(int i, Method method) {
            this.f4740a = i;
            this.f4741b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m35552a(o oVar, AbstractC1565i.b bVar, Object obj) {
            try {
                int i = this.f4740a;
                if (i == 0) {
                    this.f4741b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4741b.invoke(obj, oVar);
                } else if (i != 2) {
                } else {
                    this.f4741b.invoke(obj, oVar, bVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1544b) {
                C1544b c1544b = (C1544b) obj;
                return this.f4740a == c1544b.f4740a && this.f4741b.getName().equals(c1544b.f4741b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f4740a * 31) + this.f4741b.getName().hashCode();
        }
    }

    C1542b() {
    }

    /* renamed from: a */
    private C1543a m35559a(Class<?> cls, Method[] methodArr) {
        int i;
        C1543a m35557c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m35557c = m35557c(superclass)) != null) {
            hashMap.putAll(m35557c.f4739b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1544b, AbstractC1565i.b> entry : m35557c(cls2).f4739b.entrySet()) {
                m35555e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m35558b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            w annotation = method.getAnnotation(w.class);
            if (annotation != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(o.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                AbstractC1565i.b value = annotation.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(AbstractC1565i.b.class)) {
                        if (value != AbstractC1565i.b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m35555e(hashMap, new C1544b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1543a c1543a = new C1543a(hashMap);
        this.f4736a.put(cls, c1543a);
        this.f4737b.put(cls, Boolean.valueOf(z));
        return c1543a;
    }

    /* renamed from: b */
    private Method[] m35558b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m35555e(Map<C1544b, AbstractC1565i.b> map, C1544b c1544b, AbstractC1565i.b bVar, Class<?> cls) {
        AbstractC1565i.b bVar2 = map.get(c1544b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c1544b, bVar);
                return;
            }
            return;
        }
        Method method = c1544b.f4741b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1543a m35557c(Class<?> cls) {
        C1543a c1543a = this.f4736a.get(cls);
        return c1543a != null ? c1543a : m35559a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m35556d(Class<?> cls) {
        Boolean bool = this.f4737b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m35558b = m35558b(cls);
        for (Method method : m35558b) {
            if (method.getAnnotation(w.class) != null) {
                m35559a(cls, m35558b);
                return true;
            }
        }
        this.f4737b.put(cls, Boolean.FALSE);
        return false;
    }
}
