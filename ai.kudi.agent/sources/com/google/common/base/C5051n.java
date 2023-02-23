package com.google.common.base;
/* compiled from: Preconditions.java */
/* renamed from: com.google.common.base.n */
/* loaded from: classes2.dex */
public final class C5051n {
    /* renamed from: a */
    private static String m25793a(int i, int i2, String str) {
        if (i < 0) {
            return C5057q.m25757c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C5057q.m25757c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static String m25792b(int i, int i2, String str) {
        if (i < 0) {
            return C5057q.m25757c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C5057q.m25757c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static String m25791c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m25792b(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? m25792b(i2, i3, "end index") : C5057q.m25757c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m25790d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m25789e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m25788f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static void m25787g(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, Character.valueOf(c), obj));
        }
    }

    /* renamed from: h */
    public static void m25786h(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: i */
    public static void m25785i(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, Long.valueOf(j)));
        }
    }

    /* renamed from: j */
    public static void m25784j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, obj));
        }
    }

    /* renamed from: k */
    public static void m25783k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C5057q.m25757c(str, obj, obj2));
        }
    }

    /* renamed from: l */
    public static int m25782l(int i, int i2) {
        m25781m(i, i2, "index");
        return i;
    }

    /* renamed from: m */
    public static int m25781m(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(m25793a(i, i2, str));
        }
        return i;
    }

    /* renamed from: n */
    public static <T> T m25780n(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: o */
    public static <T> T m25779o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: p */
    public static <T> T m25778p(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C5057q.m25757c(str, obj));
    }

    /* renamed from: q */
    public static int m25777q(int i, int i2) {
        m25776r(i, i2, "index");
        return i;
    }

    /* renamed from: r */
    public static int m25776r(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m25792b(i, i2, str));
        }
        return i;
    }

    /* renamed from: s */
    public static void m25775s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m25791c(i, i2, i3));
        }
    }

    /* renamed from: t */
    public static void m25774t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public static void m25773u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: v */
    public static void m25772v(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C5057q.m25757c(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: w */
    public static void m25771w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C5057q.m25757c(str, obj));
        }
    }
}
