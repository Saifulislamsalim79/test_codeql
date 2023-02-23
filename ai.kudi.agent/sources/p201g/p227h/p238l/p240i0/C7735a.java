package p201g.p227h.p238l.p240i0;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p201g.p227h.p237k.C7675h;
/* compiled from: EditorInfoCompat.java */
/* renamed from: g.h.l.i0.a */
/* loaded from: classes2.dex */
public final class C7735a {

    /* renamed from: a */
    private static final String[] f18493a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EditorInfoCompat.java */
    /* renamed from: g.h.l.i0.a$a */
    /* loaded from: classes2.dex */
    public static class C7736a {
        /* renamed from: a */
        static void m17612a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m17620a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f18493a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f18493a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f18493a;
    }

    /* renamed from: b */
    private static boolean m17619b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m17618c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m17617d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m17616e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        C7675h.m17866f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C7736a.m17612a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i5 - i : i6 - i;
        int length = charSequence.length();
        if (i >= 0 && i4 >= 0 && i7 <= length) {
            if (m17618c(editorInfo.inputType)) {
                m17614g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                m17614g(editorInfo, charSequence, i4, i7);
                return;
            } else {
                m17613h(editorInfo, charSequence, i4, i7);
                return;
            }
        }
        m17614g(editorInfo, null, 0, 0);
    }

    /* renamed from: f */
    public static void m17615f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C7736a.m17612a(editorInfo, charSequence, 0);
        } else {
            m17616e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m17614g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m17613h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence subSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        double d = i5;
        Double.isNaN(d);
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (d * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m17619b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m17619b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m17614g(editorInfo, subSequence, i8, i4 + i8);
    }
}
