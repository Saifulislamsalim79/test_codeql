package io.intercom.com.google.gson.p418t;
/* compiled from: JavaVersion.java */
/* renamed from: io.intercom.com.google.gson.t.e */
/* loaded from: classes3.dex */
public final class C10965e {

    /* renamed from: a */
    private static final int f24969a = m11830a();

    /* renamed from: a */
    private static int m11830a() {
        return m11827d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m11829b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m11828c() {
        return f24969a;
    }

    /* renamed from: d */
    static int m11827d(String str) {
        int m11825f = m11825f(str);
        if (m11825f == -1) {
            m11825f = m11829b(str);
        }
        if (m11825f == -1) {
            return 6;
        }
        return m11825f;
    }

    /* renamed from: e */
    public static boolean m11826e() {
        return f24969a >= 9;
    }

    /* renamed from: f */
    private static int m11825f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
