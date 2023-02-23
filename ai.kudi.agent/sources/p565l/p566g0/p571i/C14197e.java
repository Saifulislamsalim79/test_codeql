package p565l.p566g0.p571i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: OptionalMethod.java */
/* renamed from: l.g0.i.e */
/* loaded from: classes3.dex */
class C14197e<T> {

    /* renamed from: a */
    private final Class<?> f31058a;

    /* renamed from: b */
    private final String f31059b;

    /* renamed from: c */
    private final Class[] f31060c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14197e(Class<?> cls, String str, Class... clsArr) {
        this.f31058a = cls;
        this.f31059b = str;
        this.f31060c = clsArr;
    }

    /* renamed from: a */
    private Method m2669a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f31059b;
        if (str != null) {
            Method m2668b = m2668b(cls, str, this.f31060c);
            if (m2668b == null || (cls2 = this.f31058a) == null || cls2.isAssignableFrom(m2668b.getReturnType())) {
                return m2668b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m2668b(Class<?> cls, String str, Class[] clsArr) {
        try {
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
    public Object m2667c(T t, Object... objArr) throws InvocationTargetException {
        Method m2669a = m2669a(t.getClass());
        if (m2669a != null) {
            try {
                return m2669a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m2669a);
                assertionError.initCause(e);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.f31059b + " not supported for object " + t);
    }

    /* renamed from: d */
    public Object m2666d(T t, Object... objArr) throws InvocationTargetException {
        Method m2669a = m2669a(t.getClass());
        if (m2669a == null) {
            return null;
        }
        try {
            return m2669a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object m2665e(T t, Object... objArr) {
        try {
            return m2666d(t, objArr);
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
    public Object m2664f(T t, Object... objArr) {
        try {
            return m2667c(t, objArr);
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
    public boolean m2663g(T t) {
        return m2669a(t.getClass()) != null;
    }
}
