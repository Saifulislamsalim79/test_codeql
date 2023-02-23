package kotlin.p549l0;

import java.util.Locale;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
/* renamed from: kotlin.l0.b */
/* loaded from: classes3.dex */
public class C13252b {
    /* renamed from: a */
    public static final int m5549a(int i) {
        if (2 > i || 36 < i) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C11837e(2, 36));
        }
        return i;
    }

    /* renamed from: b */
    public static final int m5548b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static boolean m5547c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: d */
    public static String m5546d(char c, Locale locale) {
        l.f(locale, "locale");
        String m5545e = m5545e(c, locale);
        if (m5545e.length() <= 1) {
            String valueOf = String.valueOf(c);
            if (valueOf != null) {
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                l.e(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                return l.b(m5545e, upperCase) ^ true ? m5545e : String.valueOf(Character.toTitleCase(c));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (c == 329) {
            return m5545e;
        } else {
            char charAt = m5545e.charAt(0);
            if (m5545e != null) {
                String substring = m5545e.substring(1);
                l.e(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring != null) {
                    String lowerCase = substring.toLowerCase(Locale.ROOT);
                    l.e(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return String.valueOf(charAt) + lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: e */
    public static final String m5545e(char c, Locale locale) {
        l.f(locale, "locale");
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String upperCase = valueOf.toUpperCase(locale);
            l.e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
