package p201g.p265u;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: Trace.java */
/* renamed from: g.u.a */
/* loaded from: classes2.dex */
public final class C8111a {

    /* renamed from: a */
    private static long f19477a;

    /* renamed from: b */
    private static Method f19478b;

    /* renamed from: a */
    public static void m16741a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C8112b.m16736a(str);
        }
    }

    /* renamed from: b */
    public static void m16740b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C8112b.m16735b();
        }
    }

    /* renamed from: c */
    private static void m16739c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: d */
    public static boolean m16738d() {
        try {
            if (f19478b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m16737e();
    }

    /* renamed from: e */
    private static boolean m16737e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f19478b == null) {
                    f19477a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f19478b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f19478b.invoke(null, Long.valueOf(f19477a))).booleanValue();
            } catch (Exception e) {
                m16739c("isTagEnabled", e);
            }
        }
        return false;
    }
}
