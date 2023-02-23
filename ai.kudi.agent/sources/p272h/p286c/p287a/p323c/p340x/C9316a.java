package p272h.p286c.p287a.p323c.p340x;
/* compiled from: MathUtils.java */
/* renamed from: h.c.a.c.x.a */
/* loaded from: classes2.dex */
public final class C9316a {
    /* renamed from: a */
    public static float m15064a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m15063b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m15061d(m15064a(f, f2, f3, f4), m15064a(f, f2, f5, f4), m15064a(f, f2, f5, f6), m15064a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m15062c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m15061d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
