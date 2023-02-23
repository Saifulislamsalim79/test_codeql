package p425j.p429b.p430a.p431a.p432a;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: AnnotatedHandlerFinder.java */
/* renamed from: j.b.a.a.a.a */
/* loaded from: classes3.dex */
final class C11128a {

    /* renamed from: a */
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Method>> f25182a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final ConcurrentMap<Class<?>, Map<Class<?>, Set<Method>>> f25183b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<Class<?>, C11135e> m11602a(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map<Class<?>, Method> map = f25182a.get(cls);
        if (map == null) {
            map = new HashMap<>();
            m11599d(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry<Class<?>, Method> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new C11135e(obj, entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Map<Class<?>, Set<C11134d>> m11601b(Object obj) {
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map<Class<?>, Set<Method>> map = f25183b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            m11598e(cls, map);
        }
        if (!map.isEmpty()) {
            for (Map.Entry<Class<?>, Set<Method>> entry : map.entrySet()) {
                HashSet hashSet = new HashSet();
                for (Method method : entry.getValue()) {
                    hashSet.add(new C11134d(obj, method));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static void m11600c(Class<?> cls, Map<Class<?>, Method> map, Map<Class<?>, Set<Method>> map2) {
        Method[] declaredMethods;
        Class<?>[] parameterTypes;
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge()) {
                if (method.isAnnotationPresent(h.class)) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length == 1) {
                        Class<?> cls2 = parameterTypes2[0];
                        if (!cls2.isInterface()) {
                            if ((1 & method.getModifiers()) != 0) {
                                Set<Method> set = map2.get(cls2);
                                if (set == null) {
                                    set = new HashSet<>();
                                    map2.put(cls2, set);
                                }
                                set.add(method);
                            } else {
                                throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " but is not 'public'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " which is an interface.  Subscription must be on a concrete class type.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation but requires " + parameterTypes2.length + " arguments.  Methods must require a single argument.");
                    }
                } else if (method.isAnnotationPresent(g.class)) {
                    if (method.getParameterTypes().length == 0) {
                        if (method.getReturnType() != Void.class) {
                            Class<?> returnType = method.getReturnType();
                            if (!returnType.isInterface()) {
                                if (!returnType.equals(Void.TYPE)) {
                                    if ((1 & method.getModifiers()) != 0) {
                                        if (!map.containsKey(returnType)) {
                                            map.put(returnType, method);
                                        } else {
                                            throw new IllegalArgumentException("Producer for type " + returnType + " has already been registered.");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " but is not 'public'.");
                                    }
                                } else {
                                    throw new IllegalArgumentException("Method " + method + " has @Produce annotation but has no return type.");
                                }
                            } else {
                                throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " which is an interface.  Producers must return a concrete class type.");
                            }
                        } else {
                            throw new IllegalArgumentException("Method " + method + " has a return type of void.  Must declare a non-void type.");
                        }
                    } else {
                        throw new IllegalArgumentException("Method " + method + "has @Produce annotation but requires " + parameterTypes.length + " arguments.  Methods must require zero arguments.");
                    }
                } else {
                    continue;
                }
            }
        }
        f25182a.put(cls, map);
        f25183b.put(cls, map2);
    }

    /* renamed from: d */
    private static void m11599d(Class<?> cls, Map<Class<?>, Method> map) {
        m11600c(cls, map, new HashMap());
    }

    /* renamed from: e */
    private static void m11598e(Class<?> cls, Map<Class<?>, Set<Method>> map) {
        m11600c(cls, new HashMap(), map);
    }
}
