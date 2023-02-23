package kotlin.p549l0;

import java.util.Locale;
import kotlin.e0.d.l;
/* compiled from: _OneToManyTitlecaseMappings.kt */
/* renamed from: kotlin.l0.x */
/* loaded from: classes3.dex */
public final class C13284x {
    /* renamed from: a */
    public static final String m5367a(char c) {
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            l.e(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
            if (upperCase.length() > 1) {
                if (c == 329) {
                    return upperCase;
                }
                char charAt = upperCase.charAt(0);
                if (upperCase != null) {
                    String substring = upperCase.substring(1);
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
            return String.valueOf(Character.toTitleCase(c));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
