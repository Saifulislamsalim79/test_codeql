package io.grpc.p385i1.p386r;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: OptionalMethod.java */
/* renamed from: io.grpc.i1.r.e */
/* loaded from: classes2.dex */
public class C9949e<T> {

    /* renamed from: a */
    private final Class<?> f23568a;

    /* renamed from: b */
    private final String f23569b;

    /* renamed from: c */
    private final Class[] f23570c;

    public C9949e(Class<?> cls, String str, Class... clsArr) {
        this.f23568a = cls;
        this.f23569b = str;
        this.f23570c = clsArr;
    }

    /* renamed from: a */
    private Method m13496a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f23569b;
        if (str != null) {
            Method m13495b = m13495b(cls, str, this.f23570c);
            if (m13495b == null || (cls2 = this.f23568a) == null || cls2.isAssignableFrom(m13495b.getReturnType())) {
                return m13495b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m13495b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m13495b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object m13494c(T t, Object... objArr) throws InvocationTargetException {
        Method m13496a = m13496a(t.getClass());
        if (m13496a != null) {
            try {
                return m13496a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m13496a);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.f23569b + " not supported for object " + t);
    }

    /* renamed from: d */
    public Object m13493d(T t, Object... objArr) throws InvocationTargetException {
        Method m13496a = m13496a(t.getClass());
        if (m13496a == null) {
            return null;
        }
        try {
            return m13496a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object m13492e(T t, Object... objArr) {
        try {
            return m13493d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object m13491f(T t, Object... objArr) {
        try {
            return m13494c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean m13490g(T t) {
        return m13496a(t.getClass()) != null;
    }
}
