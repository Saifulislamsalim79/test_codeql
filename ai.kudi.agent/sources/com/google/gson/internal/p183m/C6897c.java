package com.google.gson.internal.p183m;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* compiled from: UnsafeReflectionAccessor.java */
/* renamed from: com.google.gson.internal.m.c */
/* loaded from: classes2.dex */
final class C6897c extends AbstractC6896b {

    /* renamed from: d */
    private static Class f16548d;

    /* renamed from: b */
    private final Object f16549b = m20553d();

    /* renamed from: c */
    private final Field f16550c = m20554c();

    /* renamed from: c */
    private static Field m20554c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m20553d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16548d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.p183m.AbstractC6896b
    /* renamed from: b */
    public void mo20555b(AccessibleObject accessibleObject) {
        if (m20552e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    /* renamed from: e */
    boolean m20552e(AccessibleObject accessibleObject) {
        if (this.f16549b != null && this.f16550c != null) {
            try {
                f16548d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f16549b, accessibleObject, Long.valueOf(((Long) f16548d.getMethod("objectFieldOffset", Field.class).invoke(this.f16549b, this.f16550c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
