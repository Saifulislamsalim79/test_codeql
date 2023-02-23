package io.intercom.com.google.gson.p418t;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: UnsafeAllocator.java */
/* renamed from: io.intercom.com.google.gson.t.m */
/* loaded from: classes3.dex */
public abstract class AbstractC10982m {

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: io.intercom.com.google.gson.t.m$a */
    /* loaded from: classes3.dex */
    static class C10983a extends AbstractC10982m {

        /* renamed from: a */
        final /* synthetic */ Method f24998a;

        /* renamed from: b */
        final /* synthetic */ Object f24999b;

        C10983a(Method method, Object obj) {
            this.f24998a = method;
            this.f24999b = obj;
        }

        @Override // io.intercom.com.google.gson.p418t.AbstractC10982m
        /* renamed from: c */
        public <T> T mo11796c(Class<T> cls) throws Exception {
            AbstractC10982m.m11798a(cls);
            return (T) this.f24998a.invoke(this.f24999b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: io.intercom.com.google.gson.t.m$b */
    /* loaded from: classes3.dex */
    static class C10984b extends AbstractC10982m {

        /* renamed from: a */
        final /* synthetic */ Method f25000a;

        /* renamed from: b */
        final /* synthetic */ int f25001b;

        C10984b(Method method, int i) {
            this.f25000a = method;
            this.f25001b = i;
        }

        @Override // io.intercom.com.google.gson.p418t.AbstractC10982m
        /* renamed from: c */
        public <T> T mo11796c(Class<T> cls) throws Exception {
            AbstractC10982m.m11798a(cls);
            return (T) this.f25000a.invoke(null, cls, Integer.valueOf(this.f25001b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: io.intercom.com.google.gson.t.m$c */
    /* loaded from: classes3.dex */
    static class C10985c extends AbstractC10982m {

        /* renamed from: a */
        final /* synthetic */ Method f25002a;

        C10985c(Method method) {
            this.f25002a = method;
        }

        @Override // io.intercom.com.google.gson.p418t.AbstractC10982m
        /* renamed from: c */
        public <T> T mo11796c(Class<T> cls) throws Exception {
            AbstractC10982m.m11798a(cls);
            return (T) this.f25002a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: io.intercom.com.google.gson.t.m$d */
    /* loaded from: classes3.dex */
    static class C10986d extends AbstractC10982m {
        C10986d() {
        }

        @Override // io.intercom.com.google.gson.p418t.AbstractC10982m
        /* renamed from: c */
        public <T> T mo11796c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m11798a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    /* renamed from: b */
    public static AbstractC10982m m11797b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C10983a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new C10984b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new C10986d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new C10985c(declaredMethod3);
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo11796c(Class<T> cls) throws Exception;
}
