package com.google.common.base;
/* compiled from: Ascii.java */
/* renamed from: com.google.common.base.b */
/* loaded from: classes2.dex */
public final class C5027b {
    /* renamed from: a */
    public static boolean m25837a(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: b */
    public static boolean m25836b(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: c */
    public static String m25835c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m25836b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m25836b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: d */
    public static char m25834d(char c) {
        return m25837a(c) ? (char) (c ^ ' ') : c;
    }
}
