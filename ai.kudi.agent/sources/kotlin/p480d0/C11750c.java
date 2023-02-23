package kotlin.p480d0;
/* compiled from: progressionUtil.kt */
/* renamed from: kotlin.d0.c */
/* loaded from: classes3.dex */
public final class C11750c {
    /* renamed from: a */
    private static final int m10370a(int i, int i2, int i3) {
        return m10368c(m10368c(i, i3) - m10368c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m10369b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m10370a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m10370a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    private static final int m10368c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
