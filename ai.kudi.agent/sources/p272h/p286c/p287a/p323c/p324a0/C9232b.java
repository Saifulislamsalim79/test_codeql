package p272h.p286c.p287a.p323c.p324a0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p201g.p227h.p228e.C7603a;
/* compiled from: RippleUtils.java */
/* renamed from: h.c.a.c.a0.b */
/* loaded from: classes2.dex */
public class C9232b {

    /* renamed from: a */
    public static final boolean f21638a;

    /* renamed from: b */
    private static final int[] f21639b;

    /* renamed from: c */
    private static final int[] f21640c;

    /* renamed from: d */
    private static final int[] f21641d;

    /* renamed from: e */
    private static final int[] f21642e;

    /* renamed from: f */
    private static final int[] f21643f;

    /* renamed from: g */
    private static final int[] f21644g;

    /* renamed from: h */
    private static final int[] f21645h;

    /* renamed from: i */
    private static final int[] f21646i;

    /* renamed from: j */
    private static final int[] f21647j;

    /* renamed from: k */
    private static final int[] f21648k;

    /* renamed from: l */
    static final String f21649l;

    static {
        f21638a = Build.VERSION.SDK_INT >= 21;
        f21639b = new int[]{16842919};
        f21640c = new int[]{16843623, 16842908};
        f21641d = new int[]{16842908};
        f21642e = new int[]{16843623};
        f21643f = new int[]{16842913, 16842919};
        f21644g = new int[]{16842913, 16843623, 16842908};
        f21645h = new int[]{16842913, 16842908};
        f21646i = new int[]{16842913, 16843623};
        f21647j = new int[]{16842913};
        f21648k = new int[]{16842910, 16842919};
        f21649l = C9232b.class.getSimpleName();
    }

    private C9232b() {
    }

    /* renamed from: a */
    public static ColorStateList m15447a(ColorStateList colorStateList) {
        if (f21638a) {
            return new ColorStateList(new int[][]{f21647j, StateSet.NOTHING}, new int[]{m15445c(colorStateList, f21643f), m15445c(colorStateList, f21639b)});
        }
        int[] iArr = f21643f;
        int[] iArr2 = f21644g;
        int[] iArr3 = f21645h;
        int[] iArr4 = f21646i;
        int[] iArr5 = f21639b;
        int[] iArr6 = f21640c;
        int[] iArr7 = f21641d;
        int[] iArr8 = f21642e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f21647j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m15445c(colorStateList, iArr), m15445c(colorStateList, iArr2), m15445c(colorStateList, iArr3), m15445c(colorStateList, iArr4), 0, m15445c(colorStateList, iArr5), m15445c(colorStateList, iArr6), m15445c(colorStateList, iArr7), m15445c(colorStateList, iArr8), 0});
    }

    /* renamed from: b */
    private static int m15446b(int i) {
        return C7603a.m18066h(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m15445c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f21638a ? m15446b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m15444d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f21648k, 0)) != 0) {
                Log.w(f21649l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: e */
    public static boolean m15443e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
