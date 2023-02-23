package io.grpc.p384h1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ReflectionLongAdderCounter.java */
/* renamed from: io.grpc.h1.x1 */
/* loaded from: classes2.dex */
public final class C9812x1 implements InterfaceC9595e1 {

    /* renamed from: b */
    private static final Logger f23035b = Logger.getLogger(C9812x1.class.getName());

    /* renamed from: c */
    private static final Constructor<?> f23036c;

    /* renamed from: d */
    private static final Method f23037d;

    /* renamed from: e */
    private static final RuntimeException f23038e;

    /* renamed from: f */
    private static final Object[] f23039f;

    /* renamed from: a */
    private final Object f23040a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f23035b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th != null) {
                }
                f23036c = null;
                f23037d = null;
                f23038e = new RuntimeException(th);
                f23039f = new Object[]{1L};
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null && constructor != null) {
            f23036c = constructor;
            f23037d = method;
            f23038e = null;
        } else {
            f23036c = null;
            f23037d = null;
            f23038e = new RuntimeException(th);
        }
        f23039f = new Object[]{1L};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9812x1() {
        RuntimeException runtimeException = f23038e;
        if (runtimeException == null) {
            try {
                this.f23040a = f23036c.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m13936b() {
        return f23038e == null;
    }

    @Override // io.grpc.p384h1.InterfaceC9595e1
    /* renamed from: a */
    public void mo13937a(long j) {
        try {
            f23037d.invoke(this.f23040a, j == 1 ? f23039f : new Object[]{Long.valueOf(j)});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
