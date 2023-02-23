package p272h.p286c.p287a.p300b.p307d.p315h;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.b */
/* loaded from: classes2.dex */
public final class C8487b {
    /* renamed from: a */
    public static int m16039a(int i, int i2, String str) {
        String m16035a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m16035a = C8489c.m16035a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                m16035a = C8489c.m16035a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m16035a);
        }
        return i;
    }

    /* renamed from: b */
    public static int m16038b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m16036d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m16037c(int i, int i2, int i3) {
        String m16036d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                m16036d = (i2 < 0 || i2 > i3) ? m16036d(i2, i3, "end index") : C8489c.m16035a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m16036d = m16036d(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(m16036d);
        }
    }

    /* renamed from: d */
    private static String m16036d(int i, int i2, String str) {
        if (i < 0) {
            return C8489c.m16035a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C8489c.m16035a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
