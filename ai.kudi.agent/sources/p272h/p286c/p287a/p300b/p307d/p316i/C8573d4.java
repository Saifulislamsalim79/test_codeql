package p272h.p286c.p287a.p300b.p307d.p316i;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.d4 */
/* loaded from: classes2.dex */
public final class C8573d4 {
    /* renamed from: a */
    public static int m15981a(int i, int i2, String str) {
        String m15974a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m15974a = C8586e5.m15974a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                m15974a = C8586e5.m15974a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m15974a);
        }
        return i;
    }

    /* renamed from: b */
    public static int m15980b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m15978d(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m15979c(int i, int i2, int i3) {
        String m15978d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                m15978d = (i2 < 0 || i2 > i3) ? m15978d(i2, i3, "end index") : C8586e5.m15974a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m15978d = m15978d(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(m15978d);
        }
    }

    /* renamed from: d */
    private static String m15978d(int i, int i2, String str) {
        if (i < 0) {
            return C8586e5.m15974a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C8586e5.m15974a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
