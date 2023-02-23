package kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m;

import java.util.Iterator;
import java.util.Locale;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p549l0.C13277t;
/* compiled from: capitalizeDecapitalize.kt */
/* renamed from: kotlin.j0.o.c.p0.m.m.a */
/* loaded from: classes3.dex */
public final class C13176a {
    /* renamed from: a */
    public static final String m5715a(String str) {
        l.f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt <= 'z') {
            z = true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(upperCase) + substring;
        }
        return str;
    }

    /* renamed from: b */
    public static final String m5714b(String str) {
        l.f(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt <= 'Z') {
            z = true;
        }
        if (z) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(lowerCase) + substring;
        }
        return str;
    }

    /* renamed from: c */
    public static final String m5713c(String str, boolean z) {
        C11837e m5411P;
        Integer num;
        l.f(str, "<this>");
        if ((str.length() == 0) || !m5712d(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !m5712d(str, 1, z)) {
            if (z) {
                return m5714b(str);
            }
            if (str.length() > 0) {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                String substring = str.substring(1);
                l.e(substring, "(this as java.lang.String).substring(startIndex)");
                return String.valueOf(lowerCase) + substring;
            }
            return str;
        }
        m5411P = C13277t.m5411P(str);
        Iterator<Integer> it = m5411P.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!m5712d(str, num.intValue(), z)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return m5711e(str, z);
        }
        int intValue = num2.intValue() - 1;
        String substring2 = str.substring(0, intValue);
        l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String m5711e = m5711e(substring2, z);
        String substring3 = str.substring(intValue);
        l.e(substring3, "(this as java.lang.String).substring(startIndex)");
        return l.m(m5711e, substring3);
    }

    /* renamed from: d */
    private static final boolean m5712d(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            return 'A' <= charAt && charAt <= 'Z';
        }
        return Character.isUpperCase(charAt);
    }

    /* renamed from: e */
    private static final String m5711e(String str, boolean z) {
        if (z) {
            return m5710f(str);
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            l.e(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    public static final String m5710f(String str) {
        l.f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            i++;
            if ('A' <= charAt && charAt <= 'Z') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        l.e(sb2, "builder.toString()");
        return sb2;
    }
}
