package p201g.p227h.p235j;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* compiled from: ICUCompat.java */
/* renamed from: g.h.j.b */
/* loaded from: classes2.dex */
public final class C7654b {

    /* renamed from: a */
    private static Method f18368a;

    /* renamed from: b */
    private static Method f18369b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f18369b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f18368a = cls.getMethod("getScript", String.class);
                f18369b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e2) {
            f18368a = null;
            f18369b = null;
            Log.w("ICUCompat", e2);
        }
    }

    /* renamed from: a */
    private static String m17904a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f18369b != null) {
                return (String) f18369b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m17903b(String str) {
        try {
            if (f18368a != null) {
                return (String) f18368a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m17902c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f18369b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String m17904a = m17904a(locale);
        if (m17904a != null) {
            return m17903b(m17904a);
        }
        return null;
    }
}
