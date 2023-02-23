package io.intercom.com.google.gson.p418t;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Primitives.java */
/* renamed from: io.intercom.com.google.gson.t.k */
/* loaded from: classes3.dex */
public final class C10978k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f24994a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m11804a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m11804a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m11804a(hashMap, hashMap2, Character.TYPE, Character.class);
        m11804a(hashMap, hashMap2, Double.TYPE, Double.class);
        m11804a(hashMap, hashMap2, Float.TYPE, Float.class);
        m11804a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m11804a(hashMap, hashMap2, Long.TYPE, Long.class);
        m11804a(hashMap, hashMap2, Short.TYPE, Short.class);
        m11804a(hashMap, hashMap2, Void.TYPE, Void.class);
        f24994a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m11804a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: b */
    public static boolean m11803b(Type type) {
        return f24994a.containsKey(type);
    }

    /* renamed from: c */
    public static <T> Class<T> m11802c(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f24994a;
        C10943a.m11868b(cls);
        Class<T> cls2 = (Class<T>) map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
