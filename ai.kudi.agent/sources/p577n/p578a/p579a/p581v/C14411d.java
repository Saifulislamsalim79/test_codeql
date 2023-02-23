package p577n.p578a.p579a.p581v;
/* compiled from: Parsing.java */
/* renamed from: n.a.a.v.d */
/* loaded from: classes3.dex */
public class C14411d {

    /* renamed from: a */
    public static int f31790a = 4;

    /* renamed from: a */
    public static int m1822a(int i) {
        return 4 - (i % 4);
    }

    /* renamed from: b */
    public static int m1821b(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static int m1820c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\n' || charAt == '\r') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: d */
    private static int m1819d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ') {
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m1818e(CharSequence charSequence) {
        int length = charSequence.length();
        return m1812k(' ', charSequence, 0, length) != length;
    }

    /* renamed from: f */
    public static boolean m1817f(CharSequence charSequence) {
        return m1819d(charSequence, 0) == -1;
    }

    /* renamed from: g */
    public static boolean m1816g(CharSequence charSequence, int i) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m1815h(CharSequence charSequence, int i) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    /* renamed from: i */
    public static boolean m1814i(CharSequence charSequence, int i) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            return charAt == '\t' || charAt == ' ';
        }
        return false;
    }

    /* renamed from: j */
    public static CharSequence m1813j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(charAt);
            }
        }
        return sb != null ? sb.toString() : charSequence;
    }

    /* renamed from: k */
    public static int m1812k(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: l */
    public static int m1811l(char c, CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    /* renamed from: m */
    public static int m1810m(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: n */
    public static int m1809n(CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }
}
