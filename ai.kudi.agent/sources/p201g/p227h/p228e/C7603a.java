package p201g.p227h.p228e;

import android.graphics.Color;
/* compiled from: ColorUtils.java */
/* renamed from: g.h.e.a */
/* loaded from: classes2.dex */
public final class C7603a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f18271a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m18073a(int i, int i2, int i3, double[] dArr) {
        if (dArr.length == 3) {
            double d = i;
            Double.isNaN(d);
            double d2 = d / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = i2;
            Double.isNaN(d3);
            double d4 = d3 / 255.0d;
            double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            double d5 = i3;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: b */
    public static double m18072b(int i) {
        double[] m18067g = m18067g();
        m18071c(i, m18067g);
        return m18067g[1] / 100.0d;
    }

    /* renamed from: c */
    public static void m18071c(int i, double[] dArr) {
        m18073a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: d */
    private static int m18070d(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: e */
    public static int m18069e(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int m18070d = m18070d(alpha2, alpha);
        return Color.argb(m18070d, m18068f(Color.red(i), alpha2, Color.red(i2), alpha, m18070d), m18068f(Color.green(i), alpha2, Color.green(i2), alpha, m18070d), m18068f(Color.blue(i), alpha2, Color.blue(i2), alpha, m18070d));
    }

    /* renamed from: f */
    private static int m18068f(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: g */
    private static double[] m18067g() {
        double[] dArr = f18271a.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            f18271a.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    /* renamed from: h */
    public static int m18066h(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
