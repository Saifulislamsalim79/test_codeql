package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: Throwables.java */
/* renamed from: com.google.common.base.s */
/* loaded from: classes2.dex */
public final class C5059s {

    /* renamed from: a */
    private static final Object f12706a;

    static {
        Object m25754b = m25754b();
        f12706a = m25754b;
        if (m25754b != null) {
            m25755a();
        }
        if (f12706a == null) {
            return;
        }
        m25752d();
    }

    /* renamed from: a */
    private static Method m25755a() {
        return m25753c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    private static Object m25754b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m25753c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m25752d() {
        try {
            Method m25753c = m25753c("getStackTraceDepth", Throwable.class);
            if (m25753c == null) {
                return null;
            }
            m25753c.invoke(m25754b(), new Throwable());
            return m25753c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m25751e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m25750f(Throwable th) {
        C5051n.m25780n(th);
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            return;
        }
        throw ((RuntimeException) th);
    }
}
