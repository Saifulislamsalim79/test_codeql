package p577n.p578a.p579a;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p577n.p578a.p579a.p580u.C14403a;
import p577n.p578a.p579a.p580u.C14405c;
import p577n.p578a.p579a.p581v.C14406a;
import p577n.p578a.p579a.p581v.C14409b;
import p577n.p578a.p579a.p581v.C14410c;
import p577n.p578a.p579a.p581v.C14411d;
import p577n.p578a.p582b.AbstractC14429r;
import p577n.p578a.p582b.C14415d;
import p577n.p578a.p582b.C14419h;
import p577n.p578a.p582b.C14422k;
import p577n.p578a.p582b.C14425n;
import p577n.p578a.p582b.C14432u;
import p577n.p578a.p582b.C14434w;
import p577n.p578a.p583c.InterfaceC14437a;
import p577n.p578a.p583c.InterfaceC14438b;
import p577n.p578a.p583c.p585g.InterfaceC14453a;
/* compiled from: InlineParserImpl.java */
/* renamed from: n.a.a.n */
/* loaded from: classes3.dex */
public class C14389n implements InterfaceC14437a {

    /* renamed from: i */
    private static final Pattern f31726i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j */
    private static final Pattern f31727j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k */
    private static final Pattern f31728k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l */
    private static final Pattern f31729l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m */
    private static final Pattern f31730m = Pattern.compile("`+");

    /* renamed from: n */
    private static final Pattern f31731n = Pattern.compile("^`+");

    /* renamed from: o */
    private static final Pattern f31732o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p */
    private static final Pattern f31733p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q */
    private static final Pattern f31734q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r */
    private static final Pattern f31735r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s */
    private static final Pattern f31736s = Pattern.compile("\\s+");

    /* renamed from: t */
    private static final Pattern f31737t = Pattern.compile(" *$");

    /* renamed from: a */
    private final BitSet f31738a;

    /* renamed from: b */
    private final BitSet f31739b;

    /* renamed from: c */
    private final Map<Character, InterfaceC14453a> f31740c;

    /* renamed from: d */
    private final InterfaceC14438b f31741d;

    /* renamed from: e */
    private String f31742e;

    /* renamed from: f */
    private int f31743f;

    /* renamed from: g */
    private C14375f f31744g;

    /* renamed from: h */
    private C14374e f31745h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InlineParserImpl.java */
    /* renamed from: n.a.a.n$a */
    /* loaded from: classes3.dex */
    public static class C14390a {

        /* renamed from: a */
        final int f31746a;

        /* renamed from: b */
        final boolean f31747b;

        /* renamed from: c */
        final boolean f31748c;

        C14390a(int i, boolean z, boolean z2) {
            this.f31746a = i;
            this.f31748c = z;
            this.f31747b = z2;
        }
    }

    public C14389n(InterfaceC14438b interfaceC14438b) {
        Map<Character, InterfaceC14453a> m1878f = m1878f(interfaceC14438b.mo1739b());
        this.f31740c = m1878f;
        BitSet m1879e = m1879e(m1878f.keySet());
        this.f31739b = m1879e;
        this.f31738a = m1877g(m1879e);
        this.f31741d = interfaceC14438b;
    }

    /* renamed from: A */
    private AbstractC14429r m1895A() {
        int i = this.f31743f;
        int length = this.f31742e.length();
        while (true) {
            int i2 = this.f31743f;
            if (i2 == length || this.f31738a.get(this.f31742e.charAt(i2))) {
                break;
            }
            this.f31743f++;
        }
        int i3 = this.f31743f;
        if (i != i3) {
            return m1883M(this.f31742e, i, i3);
        }
        return null;
    }

    /* renamed from: B */
    private char m1894B() {
        if (this.f31743f < this.f31742e.length()) {
            return this.f31742e.charAt(this.f31743f);
        }
        return (char) 0;
    }

    /* renamed from: C */
    private void m1893C(C14375f c14375f) {
        boolean z;
        HashMap hashMap = new HashMap();
        C14375f c14375f2 = this.f31744g;
        while (c14375f2 != null) {
            C14375f c14375f3 = c14375f2.f31689e;
            if (c14375f3 == c14375f) {
                break;
            }
            c14375f2 = c14375f3;
        }
        while (c14375f2 != null) {
            char c = c14375f2.f31686b;
            InterfaceC14453a interfaceC14453a = this.f31740c.get(Character.valueOf(c));
            if (c14375f2.f31688d && interfaceC14453a != null) {
                char mo1695e = interfaceC14453a.mo1695e();
                C14375f c14375f4 = c14375f2.f31689e;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (c14375f4 == null || c14375f4 == c14375f || c14375f4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (c14375f4.f31687c && c14375f4.f31686b == mo1695e) {
                        i = interfaceC14453a.mo1697c(c14375f4, c14375f2);
                        z2 = true;
                        if (i > 0) {
                            break;
                        }
                    }
                    c14375f4 = c14375f4.f31689e;
                }
                z = false;
                if (!z) {
                    if (!z2) {
                        hashMap.put(Character.valueOf(c), c14375f2.f31689e);
                        if (!c14375f2.f31687c) {
                            m1890F(c14375f2);
                        }
                    }
                    c14375f2 = c14375f2.f31690f;
                } else {
                    C14434w c14434w = c14375f4.f31685a;
                    C14434w c14434w2 = c14375f2.f31685a;
                    c14375f4.f31691g -= i;
                    c14375f2.f31691g -= i;
                    c14434w.m1764n(c14434w.m1765m().substring(0, c14434w.m1765m().length() - i));
                    c14434w2.m1764n(c14434w2.m1765m().substring(0, c14434w2.m1765m().length() - i));
                    m1889G(c14375f4, c14375f2);
                    m1873k(c14434w, c14434w2);
                    interfaceC14453a.mo1699a(c14434w, c14434w2, i);
                    if (c14375f4.f31691g == 0) {
                        m1891E(c14375f4);
                    }
                    if (c14375f2.f31691g == 0) {
                        C14375f c14375f5 = c14375f2.f31690f;
                        m1891E(c14375f2);
                        c14375f2 = c14375f5;
                    }
                }
            } else {
                c14375f2 = c14375f2.f31690f;
            }
        }
        while (true) {
            C14375f c14375f6 = this.f31744g;
            if (c14375f6 == null || c14375f6 == c14375f) {
                return;
            }
            m1890F(c14375f6);
        }
    }

    /* renamed from: D */
    private void m1892D(C14375f c14375f) {
        C14375f c14375f2 = c14375f.f31689e;
        if (c14375f2 != null) {
            c14375f2.f31690f = c14375f.f31690f;
        }
        C14375f c14375f3 = c14375f.f31690f;
        if (c14375f3 == null) {
            this.f31744g = c14375f.f31689e;
        } else {
            c14375f3.f31689e = c14375f.f31689e;
        }
    }

    /* renamed from: E */
    private void m1891E(C14375f c14375f) {
        c14375f.f31685a.m1771l();
        m1892D(c14375f);
    }

    /* renamed from: F */
    private void m1890F(C14375f c14375f) {
        m1892D(c14375f);
    }

    /* renamed from: G */
    private void m1889G(C14375f c14375f, C14375f c14375f2) {
        C14375f c14375f3 = c14375f2.f31689e;
        while (c14375f3 != null && c14375f3 != c14375f) {
            C14375f c14375f4 = c14375f3.f31689e;
            m1890F(c14375f3);
            c14375f3 = c14375f4;
        }
    }

    /* renamed from: H */
    private void m1888H() {
        this.f31745h = this.f31745h.f31681d;
    }

    /* renamed from: J */
    private C14390a m1886J(InterfaceC14453a interfaceC14453a, char c) {
        boolean z;
        int i = this.f31743f;
        boolean z2 = false;
        int i2 = 0;
        while (m1894B() == c) {
            i2++;
            this.f31743f++;
        }
        if (i2 < interfaceC14453a.mo1696d()) {
            this.f31743f = i;
            return null;
        }
        String substring = i == 0 ? "\n" : this.f31742e.substring(i - 1, i);
        char m1894B = m1894B();
        String valueOf = m1894B != 0 ? String.valueOf(m1894B) : "\n";
        boolean matches = f31726i.matcher(substring).matches();
        boolean matches2 = f31735r.matcher(substring).matches();
        boolean matches3 = f31726i.matcher(valueOf).matches();
        boolean matches4 = f31735r.matcher(valueOf).matches();
        boolean z3 = !matches4 && (!matches3 || matches2 || matches);
        boolean z4 = !matches2 && (!matches || matches4 || matches3);
        if (c == '_') {
            z = z3 && (!z4 || matches);
            if (z4 && (!z3 || matches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == interfaceC14453a.mo1695e();
            if (z4 && c == interfaceC14453a.mo1698b()) {
                z2 = true;
            }
            z = z5;
        }
        this.f31743f = i;
        return new C14390a(i2, z, z2);
    }

    /* renamed from: K */
    private void m1885K() {
        m1876h(f31734q);
    }

    /* renamed from: L */
    private C14434w m1884L(String str) {
        return new C14434w(str);
    }

    /* renamed from: M */
    private C14434w m1883M(String str, int i, int i2) {
        return new C14434w(str.substring(i, i2));
    }

    /* renamed from: b */
    private void m1882b(C14374e c14374e) {
        C14374e c14374e2 = this.f31745h;
        if (c14374e2 != null) {
            c14374e2.f31684g = true;
        }
        this.f31745h = c14374e;
    }

    /* renamed from: c */
    private static void m1881c(char c, InterfaceC14453a interfaceC14453a, Map<Character, InterfaceC14453a> map) {
        if (map.put(Character.valueOf(c), interfaceC14453a) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* renamed from: d */
    private static void m1880d(Iterable<InterfaceC14453a> iterable, Map<Character, InterfaceC14453a> map) {
        C14400s c14400s;
        for (InterfaceC14453a interfaceC14453a : iterable) {
            char mo1695e = interfaceC14453a.mo1695e();
            char mo1698b = interfaceC14453a.mo1698b();
            if (mo1695e == mo1698b) {
                InterfaceC14453a interfaceC14453a2 = map.get(Character.valueOf(mo1695e));
                if (interfaceC14453a2 != null && interfaceC14453a2.mo1695e() == interfaceC14453a2.mo1698b()) {
                    if (interfaceC14453a2 instanceof C14400s) {
                        c14400s = (C14400s) interfaceC14453a2;
                    } else {
                        C14400s c14400s2 = new C14400s(mo1695e);
                        c14400s2.m1838f(interfaceC14453a2);
                        c14400s = c14400s2;
                    }
                    c14400s.m1838f(interfaceC14453a);
                    map.put(Character.valueOf(mo1695e), c14400s);
                } else {
                    m1881c(mo1695e, interfaceC14453a, map);
                }
            } else {
                m1881c(mo1695e, interfaceC14453a, map);
                m1881c(mo1698b, interfaceC14453a, map);
            }
        }
    }

    /* renamed from: e */
    public static BitSet m1879e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        for (Character ch : set) {
            bitSet.set(ch.charValue());
        }
        return bitSet;
    }

    /* renamed from: f */
    public static Map<Character, InterfaceC14453a> m1878f(List<InterfaceC14453a> list) {
        HashMap hashMap = new HashMap();
        m1880d(Arrays.asList(new C14403a(), new C14405c()), hashMap);
        m1880d(list, hashMap);
        return hashMap;
    }

    /* renamed from: g */
    public static BitSet m1877g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    /* renamed from: h */
    private String m1876h(Pattern pattern) {
        if (this.f31743f >= this.f31742e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f31742e);
        matcher.region(this.f31743f, this.f31742e.length());
        if (matcher.find()) {
            this.f31743f = matcher.end();
            return matcher.group();
        }
        return null;
    }

    /* renamed from: i */
    private void m1875i(AbstractC14429r abstractC14429r) {
        if (abstractC14429r.m1779c() == abstractC14429r.m1778d()) {
            return;
        }
        m1872l(abstractC14429r.m1779c(), abstractC14429r.m1778d());
    }

    /* renamed from: j */
    private void m1874j(C14434w c14434w, C14434w c14434w2, int i) {
        if (c14434w == null || c14434w2 == null || c14434w == c14434w2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c14434w.m1765m());
        AbstractC14429r m1777e = c14434w.m1777e();
        AbstractC14429r m1777e2 = c14434w2.m1777e();
        while (m1777e != m1777e2) {
            sb.append(((C14434w) m1777e).m1765m());
            AbstractC14429r m1777e3 = m1777e.m1777e();
            m1777e.m1771l();
            m1777e = m1777e3;
        }
        c14434w.m1764n(sb.toString());
    }

    /* renamed from: k */
    private void m1873k(AbstractC14429r abstractC14429r, AbstractC14429r abstractC14429r2) {
        if (abstractC14429r == abstractC14429r2 || abstractC14429r.m1777e() == abstractC14429r2) {
            return;
        }
        m1872l(abstractC14429r.m1777e(), abstractC14429r2.m1775g());
    }

    /* renamed from: l */
    private void m1872l(AbstractC14429r abstractC14429r, AbstractC14429r abstractC14429r2) {
        C14434w c14434w = null;
        C14434w c14434w2 = null;
        int i = 0;
        while (abstractC14429r != null) {
            if (abstractC14429r instanceof C14434w) {
                c14434w2 = (C14434w) abstractC14429r;
                if (c14434w == null) {
                    c14434w = c14434w2;
                }
                i += c14434w2.m1765m().length();
            } else {
                m1874j(c14434w, c14434w2, i);
                c14434w = null;
                c14434w2 = null;
                i = 0;
            }
            if (abstractC14429r == abstractC14429r2) {
                break;
            }
            abstractC14429r = abstractC14429r.m1777e();
        }
        m1874j(c14434w, c14434w2, i);
    }

    /* renamed from: m */
    private AbstractC14429r m1871m() {
        String m1876h = m1876h(f31732o);
        if (m1876h != null) {
            String substring = m1876h.substring(1, m1876h.length() - 1);
            C14425n c14425n = new C14425n("mailto:" + substring, null);
            c14425n.m1780b(new C14434w(substring));
            return c14425n;
        }
        String m1876h2 = m1876h(f31733p);
        if (m1876h2 != null) {
            String substring2 = m1876h2.substring(1, m1876h2.length() - 1);
            C14425n c14425n2 = new C14425n(substring2, null);
            c14425n2.m1780b(new C14434w(substring2));
            return c14425n2;
        }
        return null;
    }

    /* renamed from: n */
    private AbstractC14429r m1870n() {
        this.f31743f++;
        if (m1894B() == '\n') {
            C14419h c14419h = new C14419h();
            this.f31743f++;
            return c14419h;
        }
        if (this.f31743f < this.f31742e.length()) {
            Pattern pattern = f31728k;
            String str = this.f31742e;
            int i = this.f31743f;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.f31742e;
                int i2 = this.f31743f;
                C14434w m1883M = m1883M(str2, i2, i2 + 1);
                this.f31743f++;
                return m1883M;
            }
        }
        return m1884L("\\");
    }

    /* renamed from: o */
    private AbstractC14429r m1869o() {
        String m1876h;
        String m1876h2 = m1876h(f31731n);
        if (m1876h2 == null) {
            return null;
        }
        int i = this.f31743f;
        do {
            m1876h = m1876h(f31730m);
            if (m1876h == null) {
                this.f31743f = i;
                return m1884L(m1876h2);
            }
        } while (!m1876h.equals(m1876h2));
        C14415d c14415d = new C14415d();
        String replace = this.f31742e.substring(i, this.f31743f - m1876h2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && C14411d.m1818e(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        c14415d.m1804n(replace);
        return c14415d;
    }

    /* renamed from: p */
    private AbstractC14429r m1868p() {
        int i = this.f31743f;
        this.f31743f = i + 1;
        if (m1894B() == '[') {
            this.f31743f++;
            C14434w m1884L = m1884L("![");
            m1882b(C14374e.m1927a(m1884L, i + 1, this.f31745h, this.f31744g));
            return m1884L;
        }
        return m1884L("!");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p577n.p578a.p582b.AbstractC14429r m1867q() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p577n.p578a.p579a.C14389n.m1867q():n.a.b.r");
    }

    /* renamed from: r */
    private AbstractC14429r m1866r(InterfaceC14453a interfaceC14453a, char c) {
        C14390a m1886J = m1886J(interfaceC14453a, c);
        if (m1886J == null) {
            return null;
        }
        int i = m1886J.f31746a;
        int i2 = this.f31743f;
        int i3 = i2 + i;
        this.f31743f = i3;
        C14434w m1883M = m1883M(this.f31742e, i2, i3);
        C14375f c14375f = new C14375f(m1883M, c, m1886J.f31748c, m1886J.f31747b, this.f31744g);
        this.f31744g = c14375f;
        c14375f.f31691g = i;
        c14375f.f31692h = i;
        C14375f c14375f2 = c14375f.f31689e;
        if (c14375f2 != null) {
            c14375f2.f31690f = c14375f;
        }
        return m1883M;
    }

    /* renamed from: s */
    private AbstractC14429r m1865s() {
        String m1876h = m1876h(f31729l);
        if (m1876h != null) {
            return m1884L(C14409b.m1829a(m1876h));
        }
        return null;
    }

    /* renamed from: t */
    private AbstractC14429r m1864t() {
        String m1876h = m1876h(f31727j);
        if (m1876h != null) {
            C14422k c14422k = new C14422k();
            c14422k.m1790m(m1876h);
            return c14422k;
        }
        return null;
    }

    /* renamed from: u */
    private AbstractC14429r m1863u(AbstractC14429r abstractC14429r) {
        AbstractC14429r m1859y;
        char m1894B = m1894B();
        if (m1894B == 0) {
            return null;
        }
        if (m1894B == '\n') {
            m1859y = m1859y(abstractC14429r);
        } else if (m1894B == '!') {
            m1859y = m1868p();
        } else if (m1894B == '&') {
            m1859y = m1865s();
        } else if (m1894B == '<') {
            m1859y = m1871m();
            if (m1859y == null) {
                m1859y = m1864t();
            }
        } else if (m1894B != '`') {
            switch (m1894B) {
                case '[':
                    m1859y = m1858z();
                    break;
                case '\\':
                    m1859y = m1870n();
                    break;
                case ']':
                    m1859y = m1867q();
                    break;
                default:
                    if (this.f31739b.get(m1894B)) {
                        m1859y = m1866r(this.f31740c.get(Character.valueOf(m1894B)), m1894B);
                        break;
                    } else {
                        m1859y = m1895A();
                        break;
                    }
            }
        } else {
            m1859y = m1869o();
        }
        if (m1859y != null) {
            return m1859y;
        }
        this.f31743f++;
        return m1884L(String.valueOf(m1894B));
    }

    /* renamed from: v */
    private String m1862v() {
        String substring;
        int m1827a = C14410c.m1827a(this.f31742e, this.f31743f);
        if (m1827a == -1) {
            return null;
        }
        if (m1894B() == '<') {
            substring = this.f31742e.substring(this.f31743f + 1, m1827a - 1);
        } else {
            substring = this.f31742e.substring(this.f31743f, m1827a);
        }
        this.f31743f = m1827a;
        return C14406a.m1831d(substring);
    }

    /* renamed from: x */
    private String m1860x() {
        int m1824d = C14410c.m1824d(this.f31742e, this.f31743f);
        if (m1824d == -1) {
            return null;
        }
        String substring = this.f31742e.substring(this.f31743f + 1, m1824d - 1);
        this.f31743f = m1824d;
        return C14406a.m1831d(substring);
    }

    /* renamed from: y */
    private AbstractC14429r m1859y(AbstractC14429r abstractC14429r) {
        this.f31743f++;
        if (abstractC14429r instanceof C14434w) {
            C14434w c14434w = (C14434w) abstractC14429r;
            if (c14434w.m1765m().endsWith(" ")) {
                String m1765m = c14434w.m1765m();
                Matcher matcher = f31737t.matcher(m1765m);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    c14434w.m1764n(m1765m.substring(0, m1765m.length() - end));
                }
                if (end >= 2) {
                    return new C14419h();
                }
                return new C14432u();
            }
        }
        return new C14432u();
    }

    /* renamed from: z */
    private AbstractC14429r m1858z() {
        int i = this.f31743f;
        this.f31743f = i + 1;
        C14434w m1884L = m1884L("[");
        m1882b(C14374e.m1926b(m1884L, i, this.f31745h, this.f31744g));
        return m1884L;
    }

    /* renamed from: I */
    void m1887I(String str) {
        this.f31742e = str;
        this.f31743f = 0;
        this.f31744g = null;
        this.f31745h = null;
    }

    @Override // p577n.p578a.p583c.InterfaceC14437a
    /* renamed from: a */
    public void mo1741a(String str, AbstractC14429r abstractC14429r) {
        m1887I(str.trim());
        AbstractC14429r abstractC14429r2 = null;
        while (true) {
            abstractC14429r2 = m1863u(abstractC14429r2);
            if (abstractC14429r2 != null) {
                abstractC14429r.m1780b(abstractC14429r2);
            } else {
                m1893C(null);
                m1875i(abstractC14429r);
                return;
            }
        }
    }

    /* renamed from: w */
    int m1861w() {
        if (this.f31743f < this.f31742e.length() && this.f31742e.charAt(this.f31743f) == '[') {
            int i = this.f31743f + 1;
            int m1825c = C14410c.m1825c(this.f31742e, i);
            int i2 = m1825c - i;
            if (m1825c != -1 && i2 <= 999 && m1825c < this.f31742e.length() && this.f31742e.charAt(m1825c) == ']') {
                this.f31743f = m1825c + 1;
                return i2 + 2;
            }
        }
        return 0;
    }
}
