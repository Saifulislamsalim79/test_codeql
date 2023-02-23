package io.intercom.com.google.gson.p418t.p421o;

import io.intercom.com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* compiled from: UnsafeReflectionAccessor.java */
/* renamed from: io.intercom.com.google.gson.t.o.c */
/* loaded from: classes3.dex */
final class C11057c extends AbstractC11056b {

    /* renamed from: d */
    private static Class f25131d;

    /* renamed from: b */
    private final Object f25132b = m11663d();

    /* renamed from: c */
    private final Field f25133c = m11664c();

    /* renamed from: c */
    private static Field m11664c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m11663d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f25131d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // io.intercom.com.google.gson.p418t.p421o.AbstractC11056b
    /* renamed from: b */
    public void mo11665b(AccessibleObject accessibleObject) {
        if (m11662e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    /* renamed from: e */
    boolean m11662e(AccessibleObject accessibleObject) {
        if (this.f25132b != null && this.f25133c != null) {
            try {
                f25131d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f25132b, accessibleObject, Long.valueOf(((Long) f25131d.getMethod("objectFieldOffset", Field.class).invoke(this.f25132b, this.f25133c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
