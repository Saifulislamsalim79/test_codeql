package com.google.gson.internal;

import java.lang.reflect.Type;
/* compiled from: Primitives.java */
/* renamed from: com.google.gson.internal.j */
/* loaded from: classes2.dex */
public final class C6886j {
    /* renamed from: a */
    public static boolean m20564a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* renamed from: b */
    public static <T> Class<T> m20563b(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
