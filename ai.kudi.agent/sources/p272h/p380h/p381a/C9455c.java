package p272h.p380h.p381a;

import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p576m.C14342c;
/* compiled from: HttpUrl.java */
/* renamed from: h.h.a.c */
/* loaded from: classes2.dex */
public final class C9455c {

    /* renamed from: a */
    private final String f22114a;

    /* renamed from: b */
    private final int f22115b;

    /* renamed from: c */
    private final String f22116c;

    /* compiled from: HttpUrl.java */
    /* renamed from: h.h.a.c$b */
    /* loaded from: classes2.dex */
    public static final class C9457b {

        /* renamed from: a */
        String f22117a;

        /* renamed from: d */
        String f22120d;

        /* renamed from: f */
        final List<String> f22122f;

        /* renamed from: g */
        List<String> f22123g;

        /* renamed from: h */
        String f22124h;

        /* renamed from: b */
        String f22118b = "";

        /* renamed from: c */
        String f22119c = "";

        /* renamed from: e */
        int f22121e = -1;

        public C9457b() {
            ArrayList arrayList = new ArrayList();
            this.f22122f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private static String m14682b(String str, int i, int i2) {
            String m14688f = C9455c.m14688f(str, i, i2, false);
            if (m14688f.startsWith("[") && m14688f.endsWith("]")) {
                InetAddress m14679e = m14679e(m14688f, 1, m14688f.length() - 1);
                if (m14679e == null) {
                    return null;
                }
                byte[] address = m14679e.getAddress();
                if (address.length == 16) {
                    return m14675i(address);
                }
                throw new AssertionError();
            }
            return m14678f(m14688f);
        }

        /* renamed from: c */
        private static boolean m14681c(String str) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private static boolean m14680d(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress m14679e(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r4 = 0
                r5 = -1
                r6 = -1
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L27
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = m14680d(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r12 = r6
                r8 = 0
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = p272h.p380h.p381a.C9455c.m14693a(r9)
                if (r9 != r2) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                goto L97
            L96:
                throw r11
            L97:
                goto L96
            */
            throw new UnsupportedOperationException("Method not decompiled: p272h.p380h.p381a.C9455c.C9457b.m14679e(java.lang.String, int, int):java.net.InetAddress");
        }

        /* renamed from: f */
        private static String m14678f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m14681c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: i */
        private static String m14675i(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C14342c c14342c = new C14342c();
            while (i < bArr.length) {
                if (i == i2) {
                    c14342c.m2061Z0(58);
                    i += i4;
                    if (i == 16) {
                        c14342c.m2061Z0(58);
                    }
                } else {
                    if (i > 0) {
                        c14342c.m2061Z0(58);
                    }
                    c14342c.m2057c1(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return c14342c.m2044x0();
        }

        /* renamed from: a */
        public C9455c m14683a() {
            if (this.f22117a != null) {
                if (this.f22120d != null) {
                    return new C9455c(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: g */
        int m14677g() {
            int i = this.f22121e;
            return i != -1 ? i : C9455c.m14692b(this.f22117a);
        }

        /* renamed from: h */
        public C9457b m14676h(String str) {
            if (str != null) {
                String m14682b = m14682b(str, 0, str.length());
                if (m14682b != null) {
                    this.f22120d = m14682b;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* renamed from: j */
        public C9457b m14674j(int i) {
            if (i > 0 && i <= 65535) {
                this.f22121e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        /* renamed from: k */
        public C9457b m14673k(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f22117a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f22117a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22117a);
            sb.append("://");
            if (!this.f22118b.isEmpty() || !this.f22119c.isEmpty()) {
                sb.append(this.f22118b);
                if (!this.f22119c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f22119c);
                }
                sb.append('@');
            }
            if (this.f22120d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f22120d);
                sb.append(']');
            } else {
                sb.append(this.f22120d);
            }
            int m14677g = m14677g();
            if (m14677g != C9455c.m14692b(this.f22117a)) {
                sb.append(':');
                sb.append(m14677g);
            }
            C9455c.m14689e(sb, this.f22122f);
            if (this.f22123g != null) {
                sb.append('?');
                C9455c.m14690d(sb, this.f22123g);
            }
            if (this.f22124h != null) {
                sb.append('#');
                sb.append(this.f22124h);
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    static int m14693a(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    /* renamed from: b */
    public static int m14692b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    static void m14690d(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: e */
    static void m14689e(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: f */
    static String m14688f(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C14342c c14342c = new C14342c();
                c14342c.m2048i1(str, i, i3);
                m14685i(c14342c, str, i3, i2, z);
                return c14342c.m2044x0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: g */
    static String m14687g(String str, boolean z) {
        return m14688f(str, 0, str.length(), z);
    }

    /* renamed from: h */
    private List<String> m14686h(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m14687g(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    static void m14685i(C14342c c14342c, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int m14693a = m14693a(str.charAt(i + 1));
                int m14693a2 = m14693a(str.charAt(i3));
                if (m14693a != -1 && m14693a2 != -1) {
                    c14342c.m2061Z0((m14693a << 4) + m14693a2);
                    i = i3;
                }
                c14342c.m2047j1(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    c14342c.m2061Z0(32);
                }
                c14342c.m2047j1(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: c */
    public String m14691c() {
        return this.f22114a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9455c) && ((C9455c) obj).f22116c.equals(this.f22116c);
    }

    public int hashCode() {
        return this.f22116c.hashCode();
    }

    /* renamed from: j */
    public int m14684j() {
        return this.f22115b;
    }

    public String toString() {
        return this.f22116c;
    }

    private C9455c(C9457b c9457b) {
        String str = c9457b.f22117a;
        m14687g(c9457b.f22118b, false);
        m14687g(c9457b.f22119c, false);
        this.f22114a = c9457b.f22120d;
        this.f22115b = c9457b.m14677g();
        m14686h(c9457b.f22122f, false);
        List<String> list = c9457b.f22123g;
        if (list != null) {
            m14686h(list, true);
        }
        String str2 = c9457b.f22124h;
        if (str2 != null) {
            m14687g(str2, false);
        }
        this.f22116c = c9457b.toString();
    }
}
