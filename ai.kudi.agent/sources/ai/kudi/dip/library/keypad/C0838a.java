package ai.kudi.dip.library.keypad;

import android.graphics.Paint;
import kotlin.e0.d.l;
/* compiled from: extensions.kt */
/* renamed from: ai.kudi.dip.library.keypad.a */
/* loaded from: classes2.dex */
public final class C0838a {
    /* renamed from: a */
    public static final String m37894a(String str, int i) {
        l.f(str, "<this>");
        if (i >= 0 && i < str.length()) {
            String substring = str.substring(0, i);
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = str.substring(i + 1, str.length());
            l.e(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return l.m(substring, substring2);
        }
        throw new IllegalArgumentException("Start Position has to be less than length of text");
    }

    /* renamed from: b */
    public static final float m37893b(Paint paint) {
        l.f(paint, "<this>");
        return paint.descent() - paint.ascent();
    }
}
