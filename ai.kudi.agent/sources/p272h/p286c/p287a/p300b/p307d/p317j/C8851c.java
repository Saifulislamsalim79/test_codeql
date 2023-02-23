package p272h.p286c.p287a.p300b.p307d.p317j;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.c */
/* loaded from: classes2.dex */
public final class C8851c {
    /* renamed from: a */
    public static int m15806a(int i, int i2, String str) {
        String m15769a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m15769a = C8866d.m15769a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                m15769a = C8866d.m15769a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m15769a);
        }
        return i;
    }

    /* renamed from: b */
    public static int m15805b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m15802e(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: c */
    public static void m15804c(int i, int i2, int i3) {
        String m15802e;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                m15802e = (i2 < 0 || i2 > i3) ? m15802e(i2, i3, "end index") : C8866d.m15769a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m15802e = m15802e(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(m15802e);
        }
    }

    /* renamed from: d */
    public static void m15803d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: e */
    private static String m15802e(int i, int i2, String str) {
        if (i < 0) {
            return C8866d.m15769a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C8866d.m15769a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
