package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: UnsafeAllocator.java */
/* renamed from: com.google.gson.internal.l */
/* loaded from: classes2.dex */
public abstract class AbstractC6890l {

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.internal.l$a */
    /* loaded from: classes2.dex */
    class C6891a extends AbstractC6890l {

        /* renamed from: a */
        final /* synthetic */ Method f16542a;

        /* renamed from: b */
        final /* synthetic */ Object f16543b;

        C6891a(Method method, Object obj) {
            this.f16542a = method;
            this.f16543b = obj;
        }

        @Override // com.google.gson.internal.AbstractC6890l
        /* renamed from: c */
        public <T> T mo20557c(Class<T> cls) throws Exception {
            AbstractC6890l.m20559a(cls);
            return (T) this.f16542a.invoke(this.f16543b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.internal.l$b */
    /* loaded from: classes2.dex */
    class C6892b extends AbstractC6890l {

        /* renamed from: a */
        final /* synthetic */ Method f16544a;

        /* renamed from: b */
        final /* synthetic */ int f16545b;

        C6892b(Method method, int i) {
            this.f16544a = method;
            this.f16545b = i;
        }

        @Override // com.google.gson.internal.AbstractC6890l
        /* renamed from: c */
        public <T> T mo20557c(Class<T> cls) throws Exception {
            AbstractC6890l.m20559a(cls);
            return (T) this.f16544a.invoke(null, cls, Integer.valueOf(this.f16545b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.internal.l$c */
    /* loaded from: classes2.dex */
    class C6893c extends AbstractC6890l {

        /* renamed from: a */
        final /* synthetic */ Method f16546a;

        C6893c(Method method) {
            this.f16546a = method;
        }

        @Override // com.google.gson.internal.AbstractC6890l
        /* renamed from: c */
        public <T> T mo20557c(Class<T> cls) throws Exception {
            AbstractC6890l.m20559a(cls);
            return (T) this.f16546a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: com.google.gson.internal.l$d */
    /* loaded from: classes2.dex */
    class C6894d extends AbstractC6890l {
        C6894d() {
        }

        @Override // com.google.gson.internal.AbstractC6890l
        /* renamed from: c */
        public <T> T mo20557c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m20559a(Class<?> cls) {
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
    public static AbstractC6890l m20558b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C6891a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new C6892b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new C6894d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new C6893c(declaredMethod3);
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo20557c(Class<T> cls) throws Exception;
}
