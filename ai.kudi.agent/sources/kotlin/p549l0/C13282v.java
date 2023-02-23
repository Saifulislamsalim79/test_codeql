package kotlin.p549l0;

import java.util.NoSuchElementException;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* renamed from: kotlin.l0.v */
/* loaded from: classes3.dex */
public class C13282v extends C13281u {
    /* renamed from: N0 */
    public static String m5371N0(String str, int i) {
        int m10268d;
        l.f(str, "$this$drop");
        if (i >= 0) {
            m10268d = C11841h.m10268d(i, str.length());
            String substring = str.substring(m10268d);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: O0 */
    public static char m5370O0(CharSequence charSequence) {
        int m5410Q;
        l.f(charSequence, "$this$last");
        if (!(charSequence.length() == 0)) {
            m5410Q = C13277t.m5410Q(charSequence);
            return charSequence.charAt(m5410Q);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: P0 */
    public static String m5369P0(String str, int i) {
        int m10268d;
        l.f(str, "$this$take");
        if (i >= 0) {
            m10268d = C11841h.m10268d(i, str.length());
            String substring = str.substring(0, m10268d);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: Q0 */
    public static String m5368Q0(String str, int i) {
        int m10268d;
        l.f(str, "$this$takeLast");
        if (i >= 0) {
            int length = str.length();
            m10268d = C11841h.m10268d(i, length);
            String substring = str.substring(length - m10268d);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
