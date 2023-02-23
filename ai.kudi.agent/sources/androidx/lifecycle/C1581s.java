package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: Lifecycling.java */
/* renamed from: androidx.lifecycle.s */
/* loaded from: classes2.dex */
public class C1581s {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4789a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC1555g>>> f4790b = new HashMap();

    /* renamed from: a */
    private static InterfaceC1555g m35489a(Constructor<? extends InterfaceC1555g> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC1555g> m35488b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m35487c = m35487c(canonicalName);
            if (!name.isEmpty()) {
                m35487c = name + "." + m35487c;
            }
            Constructor declaredConstructor = Class.forName(m35487c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m35487c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m35486d(Class<?> cls) {
        Integer num = f4789a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m35483g = m35483g(cls);
        f4789a.put(cls, Integer.valueOf(m35483g));
        return m35483g;
    }

    /* renamed from: e */
    private static boolean m35485e(Class<?> cls) {
        return cls != null && n.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static InterfaceC1572l m35484f(Object obj) {
        boolean z = obj instanceof InterfaceC1572l;
        boolean z2 = obj instanceof InterfaceC1553f;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1553f) obj, (InterfaceC1572l) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1553f) obj, null);
        }
        if (z) {
            return (InterfaceC1572l) obj;
        }
        Class<?> cls = obj.getClass();
        if (m35486d(cls) == 2) {
            List<Constructor<? extends InterfaceC1555g>> list = f4790b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m35489a(list.get(0), obj));
            }
            InterfaceC1555g[] interfaceC1555gArr = new InterfaceC1555g[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC1555gArr[i] = m35489a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC1555gArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m35483g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1555g> m35488b = m35488b(cls);
        if (m35488b != null) {
            f4790b.put(cls, Collections.singletonList(m35488b));
            return 2;
        } else if (C1542b.f4735c.m35556d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m35485e(superclass)) {
                if (m35486d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4790b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m35485e(cls2)) {
                    if (m35486d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4790b.get(cls2));
                }
            }
            if (arrayList != null) {
                f4790b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
