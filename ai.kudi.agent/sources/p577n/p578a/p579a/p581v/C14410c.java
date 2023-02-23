package p577n.p578a.p579a.p581v;
/* compiled from: LinkScanner.java */
/* renamed from: n.a.a.v.c */
/* loaded from: classes3.dex */
public class C14410c {
    /* renamed from: a */
    public static int m1827a(CharSequence charSequence, int i) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                } else if (charAt == '>') {
                    return i + 1;
                } else {
                    if (charAt == '\\') {
                        int i2 = i + 1;
                        if (C14411d.m1816g(charSequence, i2)) {
                            i = i2;
                        }
                    }
                }
            }
            return -1;
        }
        return m1826b(charSequence, i);
    }

    /* renamed from: b */
    private static int m1826b(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
            if (charAt == 0 || charAt == ' ') {
                if (i3 != i) {
                    return i3;
                }
                return -1;
            }
            if (charAt == '\\') {
                int i4 = i3 + 1;
                if (C14411d.m1816g(charSequence, i4)) {
                    i3 = i4;
                }
            } else if (charAt == '(') {
                i2++;
                if (i2 > 32) {
                    return -1;
                }
            } else if (charAt != ')') {
                if (Character.isISOControl(charAt)) {
                    if (i3 != i) {
                        return i3;
                    }
                    return -1;
                }
            } else if (i2 == 0) {
                return i3;
            } else {
                i2--;
            }
            i3++;
        }
        return charSequence.length();
    }

    /* renamed from: c */
    public static int m1825c(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!C14411d.m1816g(charSequence, i2)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* renamed from: d */
    public static int m1824d(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i);
        char c = '\'';
        if (charAt == '\"') {
            c = '\"';
        } else if (charAt != '\'') {
            if (charAt != '(') {
                return -1;
            }
            c = ')';
        }
        int m1823e = m1823e(charSequence, i + 1, c);
        if (m1823e != -1 && m1823e < charSequence.length() && charSequence.charAt(m1823e) == c) {
            return m1823e + 1;
        }
        return -1;
    }

    /* renamed from: e */
    public static int m1823e(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (C14411d.m1816g(charSequence, i2)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }
}
