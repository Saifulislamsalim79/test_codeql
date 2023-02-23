package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p201g.p202a.C7461j;
import p201g.p227h.p228e.C7603a;
/* compiled from: ThemeUtils.java */
/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes2.dex */
public class C1126m0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3434a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f3435b = {-16842910};

    /* renamed from: c */
    static final int[] f3436c = {16842908};

    /* renamed from: d */
    static final int[] f3437d = {16842919};

    /* renamed from: e */
    static final int[] f3438e = {16842912};

    /* renamed from: f */
    static final int[] f3439f = new int[0];

    /* renamed from: g */
    private static final int[] f3440g = new int[1];

    /* renamed from: a */
    public static void m37066a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7461j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C7461j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m37065b(Context context, int i) {
        ColorStateList m37062e = m37062e(context, i);
        if (m37062e != null && m37062e.isStateful()) {
            return m37062e.getColorForState(f3435b, m37062e.getDefaultColor());
        }
        TypedValue m37061f = m37061f();
        context.getTheme().resolveAttribute(16842803, m37061f, true);
        return m37063d(context, i, m37061f.getFloat());
    }

    /* renamed from: c */
    public static int m37064c(Context context, int i) {
        int[] iArr = f3440g;
        iArr[0] = i;
        C1138r0 m37027u = C1138r0.m37027u(context, null, iArr);
        try {
            return m37027u.m37046b(0, 0);
        } finally {
            m37027u.m37025w();
        }
    }

    /* renamed from: d */
    static int m37063d(Context context, int i, float f) {
        int m37064c = m37064c(context, i);
        return C7603a.m18066h(m37064c, Math.round(Color.alpha(m37064c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m37062e(Context context, int i) {
        int[] iArr = f3440g;
        iArr[0] = i;
        C1138r0 m37027u = C1138r0.m37027u(context, null, iArr);
        try {
            return m37027u.m37045c(0);
        } finally {
            m37027u.m37025w();
        }
    }

    /* renamed from: f */
    private static TypedValue m37061f() {
        TypedValue typedValue = f3434a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f3434a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
