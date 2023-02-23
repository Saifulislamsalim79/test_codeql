package kotlin.p549l0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p557z.AbstractC13711l0;
/* compiled from: StringsJVM.kt */
/* renamed from: kotlin.l0.s */
/* loaded from: classes3.dex */
public class C13276s extends C13275r {
    /* renamed from: A */
    public static /* synthetic */ String m5451A(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m5436y(str, str2, str3, z);
    }

    /* renamed from: B */
    public static final boolean m5450B(String str, String str2, int i, boolean z) {
        l.f(str, "$this$startsWith");
        l.f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m5439v(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: C */
    public static boolean m5449C(String str, String str2, boolean z) {
        l.f(str, "$this$startsWith");
        l.f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m5439v(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m5448D(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5450B(str, str2, i, z);
    }

    /* renamed from: E */
    public static /* synthetic */ boolean m5447E(String str, String str2, boolean z, int i, Object obj) {
        boolean m5449C;
        if ((i & 2) != 0) {
            z = false;
        }
        m5449C = m5449C(str, str2, z);
        return m5449C;
    }

    /* renamed from: o */
    public static String m5446o(String str) {
        l.f(str, "$this$capitalize");
        Locale locale = Locale.getDefault();
        l.e(locale, "Locale.getDefault()");
        return m5445p(str, locale);
    }

    /* renamed from: p */
    public static final String m5445p(String str, Locale locale) {
        l.f(str, "$this$capitalize");
        l.f(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String upperCase = substring.toUpperCase(locale);
                    l.e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                l.e(substring2, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                l.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
        }
        return str;
    }

    /* renamed from: q */
    public static boolean m5444q(String str, String str2, boolean z) {
        l.f(str, "$this$endsWith");
        l.f(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m5439v(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: r */
    public static /* synthetic */ boolean m5443r(String str, String str2, boolean z, int i, Object obj) {
        boolean m5444q;
        if ((i & 2) != 0) {
            z = false;
        }
        m5444q = m5444q(str, str2, z);
        return m5444q;
    }

    /* renamed from: s */
    public static boolean m5442s(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m5441t(String str, String str2, boolean z, int i, Object obj) {
        boolean m5442s;
        if ((i & 2) != 0) {
            z = false;
        }
        m5442s = m5442s(str, str2, z);
        return m5442s;
    }

    /* renamed from: u */
    public static boolean m5440u(CharSequence charSequence) {
        C11837e m5411P;
        boolean m5547c;
        boolean z;
        l.f(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            m5411P = C13277t.m5411P(charSequence);
            if (!(m5411P instanceof Collection) || !((Collection) m5411P).isEmpty()) {
                Iterator<Integer> it = m5411P.iterator();
                while (it.hasNext()) {
                    m5547c = C13252b.m5547c(charSequence.charAt(((AbstractC13711l0) it).mo4069b()));
                    if (!m5547c) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static final boolean m5439v(String str, int i, String str2, int i2, int i3, boolean z) {
        l.f(str, "$this$regionMatches");
        l.f(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: w */
    public static String m5438w(CharSequence charSequence, int i) {
        l.f(charSequence, "$this$repeat");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        if (1 <= i) {
                            while (true) {
                                sb.append(charSequence);
                                if (i2 == i) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        String sb2 = sb.toString();
                        l.e(sb2, "sb.toString()");
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = charAt;
                    }
                    return new String(cArr);
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    /* renamed from: x */
    public static final String m5437x(String str, char c, char c2, boolean z) {
        l.f(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            l.e(replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (C13253c.m5544f(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: y */
    public static final String m5436y(String str, String str2, String str3, boolean z) {
        int m10271a;
        l.f(str, "$this$replace");
        l.f(str2, "oldValue");
        l.f(str3, "newValue");
        int i = 0;
        int m5408S = C13277t.m5408S(str, str2, 0, z);
        if (m5408S < 0) {
            return str;
        }
        int length = str2.length();
        m10271a = C11841h.m10271a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, m5408S);
                sb.append(str3);
                i = m5408S + length;
                if (m5408S >= str.length()) {
                    break;
                }
                m5408S = C13277t.m5408S(str, str2, m5408S + m10271a, z);
            } while (m5408S > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            l.e(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: z */
    public static /* synthetic */ String m5435z(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m5437x(str, c, c2, z);
    }
}
