package p201g.p227h.p235j;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: TextUtilsCompat.java */
/* renamed from: g.h.j.f */
/* loaded from: classes2.dex */
public final class C7666f {

    /* renamed from: a */
    private static final Locale f18391a = new Locale("", "");

    /* renamed from: a */
    private static int m17884a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m17883b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f18391a)) {
            return 0;
        }
        String m17902c = C7654b.m17902c(locale);
        if (m17902c == null) {
            return m17884a(locale);
        }
        return (m17902c.equalsIgnoreCase("Arab") || m17902c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
