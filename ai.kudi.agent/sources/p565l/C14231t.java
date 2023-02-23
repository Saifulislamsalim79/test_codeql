package p565l;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p565l.p566g0.C14148c;
import p576m.C14342c;
/* compiled from: HttpUrl.java */
/* renamed from: l.t */
/* loaded from: classes3.dex */
public final class C14231t {

    /* renamed from: j */
    private static final char[] f31152j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f31153a;

    /* renamed from: b */
    private final String f31154b;

    /* renamed from: c */
    private final String f31155c;

    /* renamed from: d */
    final String f31156d;

    /* renamed from: e */
    final int f31157e;

    /* renamed from: f */
    private final List<String> f31158f;

    /* renamed from: g */
    private final List<String> f31159g;

    /* renamed from: h */
    private final String f31160h;

    /* renamed from: i */
    private final String f31161i;

    /* compiled from: HttpUrl.java */
    /* renamed from: l.t$a */
    /* loaded from: classes3.dex */
    public static final class C14232a {

        /* renamed from: a */
        String f31162a;

        /* renamed from: d */
        String f31165d;

        /* renamed from: f */
        final List<String> f31167f;

        /* renamed from: g */
        List<String> f31168g;

        /* renamed from: h */
        String f31169h;

        /* renamed from: b */
        String f31163b = "";

        /* renamed from: c */
        String f31164c = "";

        /* renamed from: e */
        int f31166e = -1;

        public C14232a() {
            ArrayList arrayList = new ArrayList();
            this.f31167f = arrayList;
            arrayList.add("");
        }

        /* renamed from: d */
        private static String m2499d(String str, int i, int i2) {
            return C14148c.m2804d(C14231t.m2508u(str, i, i2, false));
        }

        /* renamed from: i */
        private boolean m2494i(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: j */
        private boolean m2493j(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: l */
        private static int m2491l(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(C14231t.m2528a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: n */
        private void m2489n() {
            List<String> list = this.f31167f;
            if (list.remove(list.size() - 1).isEmpty() && !this.f31167f.isEmpty()) {
                List<String> list2 = this.f31167f;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.f31167f.add("");
        }

        /* renamed from: p */
        private static int m2487p(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: q */
        private void m2486q(String str, int i, int i2, boolean z, boolean z2) {
            String m2528a = C14231t.m2528a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m2494i(m2528a)) {
                return;
            }
            if (m2493j(m2528a)) {
                m2489n();
                return;
            }
            List<String> list = this.f31167f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f31167f;
                list2.set(list2.size() - 1, m2528a);
            } else {
                this.f31167f.add(m2528a);
            }
            if (z) {
                this.f31167f.add("");
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /* renamed from: t */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m2483t(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f31167f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f31167f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f31167f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = p565l.p566g0.C14148c.m2793o(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m2486q(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p565l.C14231t.C14232a.m2483t(java.lang.String, int, int):void");
        }

        /* renamed from: v */
        private static int m2481v(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: w */
        private static int m2480w(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C14232a m2502a(String str, String str2) {
            if (str != null) {
                if (this.f31168g == null) {
                    this.f31168g = new ArrayList();
                }
                this.f31168g.add(C14231t.m2527b(str, " \"'<>#&=", true, false, true, true));
                this.f31168g.add(str2 != null ? C14231t.m2527b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* renamed from: b */
        public C14232a m2501b(String str, String str2) {
            if (str != null) {
                if (this.f31168g == null) {
                    this.f31168g = new ArrayList();
                }
                this.f31168g.add(C14231t.m2527b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.f31168g.add(str2 != null ? C14231t.m2527b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: c */
        public C14231t m2500c() {
            if (this.f31162a != null) {
                if (this.f31165d != null) {
                    return new C14231t(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: e */
        int m2498e() {
            int i = this.f31166e;
            return i != -1 ? i : C14231t.m2524e(this.f31162a);
        }

        /* renamed from: f */
        public C14232a m2497f(String str) {
            this.f31168g = str != null ? C14231t.m2534B(C14231t.m2527b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: g */
        public C14232a m2496g(String str) {
            this.f31169h = str != null ? C14231t.m2527b(str, "", false, false, false, false) : null;
            return this;
        }

        /* renamed from: h */
        public C14232a m2495h(String str) {
            if (str != null) {
                String m2499d = m2499d(str, 0, str.length());
                if (m2499d != null) {
                    this.f31165d = m2499d;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: k */
        C14232a m2492k(C14231t c14231t, String str) {
            int m2481v;
            int m2793o;
            int i;
            int m2813E = C14148c.m2813E(str, 0, str.length());
            int m2812F = C14148c.m2812F(str, m2813E, str.length());
            if (m2481v(str, m2813E, m2812F) != -1) {
                if (str.regionMatches(true, m2813E, "https:", 0, 6)) {
                    this.f31162a = "https";
                    m2813E += 6;
                } else if (str.regionMatches(true, m2813E, "http:", 0, 5)) {
                    this.f31162a = "http";
                    m2813E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m2481v) + "'");
                }
            } else if (c14231t != null) {
                this.f31162a = c14231t.f31153a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int m2480w = m2480w(str, m2813E, m2812F);
            char c = '?';
            char c2 = '#';
            if (m2480w < 2 && c14231t != null && c14231t.f31153a.equals(this.f31162a)) {
                this.f31163b = c14231t.m2518k();
                this.f31164c = c14231t.m2522g();
                this.f31165d = c14231t.f31156d;
                this.f31166e = c14231t.f31157e;
                this.f31167f.clear();
                this.f31167f.addAll(c14231t.m2520i());
                if (m2813E == m2812F || str.charAt(m2813E) == '#') {
                    m2497f(c14231t.m2519j());
                }
            } else {
                int i2 = m2813E + m2480w;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    m2793o = C14148c.m2793o(str, i2, m2812F, "@/\\?#");
                    char charAt = m2793o != m2812F ? str.charAt(m2793o) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z) {
                            int m2794n = C14148c.m2794n(str, i2, m2793o, ':');
                            i = m2793o;
                            String m2528a = C14231t.m2528a(str, i2, m2794n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                m2528a = this.f31163b + "%40" + m2528a;
                            }
                            this.f31163b = m2528a;
                            if (m2794n != i) {
                                this.f31164c = C14231t.m2528a(str, m2794n + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = m2793o;
                            this.f31164c += "%40" + C14231t.m2528a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                    }
                    c = '?';
                    c2 = '#';
                }
                int m2487p = m2487p(str, i2, m2793o);
                int i3 = m2487p + 1;
                if (i3 < m2793o) {
                    this.f31165d = m2499d(str, i2, m2487p);
                    int m2491l = m2491l(str, i3, m2793o);
                    this.f31166e = m2491l;
                    if (m2491l == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, m2793o) + '\"');
                    }
                } else {
                    this.f31165d = m2499d(str, i2, m2487p);
                    this.f31166e = C14231t.m2524e(this.f31162a);
                }
                if (this.f31165d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, m2487p) + '\"');
                }
                m2813E = m2793o;
            }
            int m2793o2 = C14148c.m2793o(str, m2813E, m2812F, "?#");
            m2483t(str, m2813E, m2793o2);
            if (m2793o2 < m2812F && str.charAt(m2793o2) == '?') {
                int m2794n2 = C14148c.m2794n(str, m2793o2, m2812F, '#');
                this.f31168g = C14231t.m2534B(C14231t.m2528a(str, m2793o2 + 1, m2794n2, " \"'<>#", true, false, true, true, null));
                m2793o2 = m2794n2;
            }
            if (m2793o2 < m2812F && str.charAt(m2793o2) == '#') {
                this.f31169h = C14231t.m2528a(str, 1 + m2793o2, m2812F, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: m */
        public C14232a m2490m(String str) {
            if (str != null) {
                this.f31164c = C14231t.m2527b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /* renamed from: o */
        public C14232a m2488o(int i) {
            if (i > 0 && i <= 65535) {
                this.f31166e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        /* renamed from: r */
        public C14232a m2485r(String str) {
            this.f31168g = str != null ? C14231t.m2534B(C14231t.m2527b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        /* renamed from: s */
        C14232a m2484s() {
            int size = this.f31167f.size();
            for (int i = 0; i < size; i++) {
                this.f31167f.set(i, C14231t.m2527b(this.f31167f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f31168g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f31168g.get(i2);
                    if (str != null) {
                        this.f31168g.set(i2, C14231t.m2527b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f31169h;
            if (str2 != null) {
                this.f31169h = C14231t.m2527b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f31162a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f31163b.isEmpty() || !this.f31164c.isEmpty()) {
                sb.append(this.f31163b);
                if (!this.f31164c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f31164c);
                }
                sb.append('@');
            }
            String str2 = this.f31165d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f31165d);
                    sb.append(']');
                } else {
                    sb.append(this.f31165d);
                }
            }
            if (this.f31166e != -1 || this.f31162a != null) {
                int m2498e = m2498e();
                String str3 = this.f31162a;
                if (str3 == null || m2498e != C14231t.m2524e(str3)) {
                    sb.append(':');
                    sb.append(m2498e);
                }
            }
            C14231t.m2509t(sb, this.f31167f);
            if (this.f31168g != null) {
                sb.append('?');
                C14231t.m2514o(sb, this.f31168g);
            }
            if (this.f31169h != null) {
                sb.append('#');
                sb.append(this.f31169h);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public C14232a m2482u(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f31162a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f31162a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        /* renamed from: x */
        public C14232a m2479x(String str) {
            if (str != null) {
                this.f31163b = C14231t.m2527b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    C14231t(C14232a c14232a) {
        this.f31153a = c14232a.f31162a;
        this.f31154b = m2507v(c14232a.f31163b, false);
        this.f31155c = m2507v(c14232a.f31164c, false);
        this.f31156d = c14232a.f31165d;
        this.f31157e = c14232a.m2498e();
        this.f31158f = m2506w(c14232a.f31167f, false);
        List<String> list = c14232a.f31168g;
        this.f31159g = list != null ? m2506w(list, true) : null;
        String str = c14232a.f31169h;
        this.f31160h = str != null ? m2507v(str, false) : null;
        this.f31161i = c14232a.toString();
    }

    /* renamed from: B */
    static List<String> m2534B(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m2528a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m2504y(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            C14342c c14342c = new C14342c();
            c14342c.m2048i1(str, i, i3);
            m2525d(c14342c, str, i3, i2, str2, z, z2, z3, z4, charset);
            return c14342c.m2044x0();
        }
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m2527b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m2528a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m2526c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m2528a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: d */
    static void m2525d(C14342c c14342c, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C14342c c14342c2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    c14342c.m2050h1(z ? "+" : "%2B");
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || m2504y(str, i, i2)))))) {
                    c14342c.m2047j1(codePointAt);
                } else {
                    if (c14342c2 == null) {
                        c14342c2 = new C14342c();
                    }
                    if (charset != null && !charset.equals(C14148c.f30913i)) {
                        c14342c2.m2053f1(str, i, Character.charCount(codePointAt) + i, charset);
                    } else {
                        c14342c2.m2047j1(codePointAt);
                    }
                    while (!c14342c2.mo1987l()) {
                        int readByte = c14342c2.readByte() & 255;
                        c14342c.m2061Z0(37);
                        c14342c.m2061Z0(f31152j[(readByte >> 4) & 15]);
                        c14342c.m2061Z0(f31152j[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: e */
    public static int m2524e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: l */
    public static C14231t m2517l(String str) {
        C14232a c14232a = new C14232a();
        c14232a.m2492k(null, str);
        return c14232a.m2500c();
    }

    /* renamed from: o */
    static void m2514o(StringBuilder sb, List<String> list) {
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

    /* renamed from: r */
    public static C14231t m2511r(String str) {
        try {
            return m2517l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: t */
    static void m2509t(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: u */
    static String m2508u(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C14342c c14342c = new C14342c();
                c14342c.m2048i1(str, i, i3);
                m2505x(c14342c, str, i3, i2, z);
                return c14342c.m2044x0();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: v */
    static String m2507v(String str, boolean z) {
        return m2508u(str, 0, str.length(), z);
    }

    /* renamed from: w */
    private List<String> m2506w(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m2507v(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: x */
    static void m2505x(C14342c c14342c, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int m2797k = C14148c.m2797k(str.charAt(i + 1));
                int m2797k2 = C14148c.m2797k(str.charAt(i3));
                if (m2797k != -1 && m2797k2 != -1) {
                    c14342c.m2061Z0((m2797k << 4) + m2797k2);
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

    /* renamed from: y */
    static boolean m2504y(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C14148c.m2797k(str.charAt(i + 1)) != -1 && C14148c.m2797k(str.charAt(i3)) != -1;
    }

    /* renamed from: A */
    public String m2535A() {
        if (this.f31159g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m2514o(sb, this.f31159g);
        return sb.toString();
    }

    /* renamed from: C */
    public String m2533C() {
        C14232a m2512q = m2512q("/...");
        m2512q.m2479x("");
        m2512q.m2490m("");
        return m2512q.m2500c().toString();
    }

    /* renamed from: D */
    public C14231t m2532D(String str) {
        C14232a m2512q = m2512q(str);
        if (m2512q != null) {
            return m2512q.m2500c();
        }
        return null;
    }

    /* renamed from: E */
    public String m2531E() {
        return this.f31153a;
    }

    /* renamed from: F */
    public URI m2530F() {
        C14232a m2513p = m2513p();
        m2513p.m2484s();
        String c14232a = m2513p.toString();
        try {
            return new URI(c14232a);
        } catch (URISyntaxException e) {
            try {
                return URI.create(c14232a.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: G */
    public URL m2529G() {
        try {
            return new URL(this.f31161i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14231t) && ((C14231t) obj).f31161i.equals(this.f31161i);
    }

    /* renamed from: f */
    public String m2523f() {
        if (this.f31160h == null) {
            return null;
        }
        return this.f31161i.substring(this.f31161i.indexOf(35) + 1);
    }

    /* renamed from: g */
    public String m2522g() {
        if (this.f31155c.isEmpty()) {
            return "";
        }
        int indexOf = this.f31161i.indexOf(64);
        return this.f31161i.substring(this.f31161i.indexOf(58, this.f31153a.length() + 3) + 1, indexOf);
    }

    /* renamed from: h */
    public String m2521h() {
        int indexOf = this.f31161i.indexOf(47, this.f31153a.length() + 3);
        String str = this.f31161i;
        return this.f31161i.substring(indexOf, C14148c.m2793o(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.f31161i.hashCode();
    }

    /* renamed from: i */
    public List<String> m2520i() {
        int indexOf = this.f31161i.indexOf(47, this.f31153a.length() + 3);
        String str = this.f31161i;
        int m2793o = C14148c.m2793o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m2793o) {
            int i = indexOf + 1;
            int m2794n = C14148c.m2794n(this.f31161i, i, m2793o, '/');
            arrayList.add(this.f31161i.substring(i, m2794n));
            indexOf = m2794n;
        }
        return arrayList;
    }

    /* renamed from: j */
    public String m2519j() {
        if (this.f31159g == null) {
            return null;
        }
        int indexOf = this.f31161i.indexOf(63) + 1;
        String str = this.f31161i;
        return this.f31161i.substring(indexOf, C14148c.m2794n(str, indexOf, str.length(), '#'));
    }

    /* renamed from: k */
    public String m2518k() {
        if (this.f31154b.isEmpty()) {
            return "";
        }
        int length = this.f31153a.length() + 3;
        String str = this.f31161i;
        return this.f31161i.substring(length, C14148c.m2793o(str, length, str.length(), ":@"));
    }

    /* renamed from: m */
    public String m2516m() {
        return this.f31156d;
    }

    /* renamed from: n */
    public boolean m2515n() {
        return this.f31153a.equals("https");
    }

    /* renamed from: p */
    public C14232a m2513p() {
        C14232a c14232a = new C14232a();
        c14232a.f31162a = this.f31153a;
        c14232a.f31163b = m2518k();
        c14232a.f31164c = m2522g();
        c14232a.f31165d = this.f31156d;
        c14232a.f31166e = this.f31157e != m2524e(this.f31153a) ? this.f31157e : -1;
        c14232a.f31167f.clear();
        c14232a.f31167f.addAll(m2520i());
        c14232a.m2497f(m2519j());
        c14232a.f31169h = m2523f();
        return c14232a;
    }

    /* renamed from: q */
    public C14232a m2512q(String str) {
        try {
            C14232a c14232a = new C14232a();
            c14232a.m2492k(this, str);
            return c14232a;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: s */
    public List<String> m2510s() {
        return this.f31158f;
    }

    public String toString() {
        return this.f31161i;
    }

    /* renamed from: z */
    public int m2503z() {
        return this.f31157e;
    }
}
