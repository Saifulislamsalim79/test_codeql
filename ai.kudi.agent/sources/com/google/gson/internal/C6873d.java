package com.google.gson.internal;
/* compiled from: JavaVersion.java */
/* renamed from: com.google.gson.internal.d */
/* loaded from: classes2.dex */
public final class C6873d {

    /* renamed from: a */
    private static final int f16514a = m20589a();

    /* renamed from: a */
    private static int m20589a() {
        return m20586d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m20588b(String str) {
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
    public static int m20587c() {
        return f16514a;
    }

    /* renamed from: d */
    static int m20586d(String str) {
        int m20584f = m20584f(str);
        if (m20584f == -1) {
            m20584f = m20588b(str);
        }
        if (m20584f == -1) {
            return 6;
        }
        return m20584f;
    }

    /* renamed from: e */
    public static boolean m20585e() {
        return f16514a >= 9;
    }

    /* renamed from: f */
    private static int m20584f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
