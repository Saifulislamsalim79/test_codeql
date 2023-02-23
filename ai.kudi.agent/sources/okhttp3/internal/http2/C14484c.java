package okhttp3.internal.http2;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p565l.p566g0.C14148c;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hpack.java */
/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes3.dex */
public final class C14484c {

    /* renamed from: a */
    static final C14482b[] f31913a = {new C14482b(C14482b.f31909i, ""), new C14482b(C14482b.f31906f, "GET"), new C14482b(C14482b.f31906f, "POST"), new C14482b(C14482b.f31907g, "/"), new C14482b(C14482b.f31907g, "/index.html"), new C14482b(C14482b.f31908h, "http"), new C14482b(C14482b.f31908h, "https"), new C14482b(C14482b.f31905e, "200"), new C14482b(C14482b.f31905e, "204"), new C14482b(C14482b.f31905e, "206"), new C14482b(C14482b.f31905e, "304"), new C14482b(C14482b.f31905e, "400"), new C14482b(C14482b.f31905e, "404"), new C14482b(C14482b.f31905e, "500"), new C14482b("accept-charset", ""), new C14482b("accept-encoding", "gzip, deflate"), new C14482b("accept-language", ""), new C14482b("accept-ranges", ""), new C14482b("accept", ""), new C14482b("access-control-allow-origin", ""), new C14482b("age", ""), new C14482b("allow", ""), new C14482b("authorization", ""), new C14482b("cache-control", ""), new C14482b("content-disposition", ""), new C14482b("content-encoding", ""), new C14482b("content-language", ""), new C14482b("content-length", ""), new C14482b("content-location", ""), new C14482b("content-range", ""), new C14482b("content-type", ""), new C14482b("cookie", ""), new C14482b(AttributeType.DATE, ""), new C14482b("etag", ""), new C14482b("expect", ""), new C14482b("expires", ""), new C14482b("from", ""), new C14482b("host", ""), new C14482b("if-match", ""), new C14482b("if-modified-since", ""), new C14482b("if-none-match", ""), new C14482b("if-range", ""), new C14482b("if-unmodified-since", ""), new C14482b("last-modified", ""), new C14482b("link", ""), new C14482b("location", ""), new C14482b("max-forwards", ""), new C14482b("proxy-authenticate", ""), new C14482b("proxy-authorization", ""), new C14482b("range", ""), new C14482b("referer", ""), new C14482b("refresh", ""), new C14482b("retry-after", ""), new C14482b("server", ""), new C14482b("set-cookie", ""), new C14482b("strict-transport-security", ""), new C14482b("transfer-encoding", ""), new C14482b("user-agent", ""), new C14482b("vary", ""), new C14482b("via", ""), new C14482b("www-authenticate", "")};

    /* renamed from: b */
    static final Map<C14347f, Integer> f31914b = m1557b();

    /* compiled from: Hpack.java */
    /* renamed from: okhttp3.internal.http2.c$a */
    /* loaded from: classes3.dex */
    static final class C14485a {

        /* renamed from: a */
        private final List<C14482b> f31915a;

        /* renamed from: b */
        private final InterfaceC14346e f31916b;

        /* renamed from: c */
        private final int f31917c;

        /* renamed from: d */
        private int f31918d;

        /* renamed from: e */
        C14482b[] f31919e;

        /* renamed from: f */
        int f31920f;

        /* renamed from: g */
        int f31921g;

        /* renamed from: h */
        int f31922h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14485a(int i, InterfaceC14365s interfaceC14365s) {
            this(i, i, interfaceC14365s);
        }

        /* renamed from: a */
        private void m1556a() {
            int i = this.f31918d;
            int i2 = this.f31922h;
            if (i < i2) {
                if (i == 0) {
                    m1555b();
                } else {
                    m1553d(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private void m1555b() {
            Arrays.fill(this.f31919e, (Object) null);
            this.f31920f = this.f31919e.length - 1;
            this.f31921g = 0;
            this.f31922h = 0;
        }

        /* renamed from: c */
        private int m1554c(int i) {
            return this.f31920f + 1 + i;
        }

        /* renamed from: d */
        private int m1553d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f31919e.length;
                while (true) {
                    length--;
                    if (length < this.f31920f || i <= 0) {
                        break;
                    }
                    C14482b[] c14482bArr = this.f31919e;
                    i -= c14482bArr[length].f31912c;
                    this.f31922h -= c14482bArr[length].f31912c;
                    this.f31921g--;
                    i2++;
                }
                C14482b[] c14482bArr2 = this.f31919e;
                int i3 = this.f31920f;
                System.arraycopy(c14482bArr2, i3 + 1, c14482bArr2, i3 + 1 + i2, this.f31921g);
                this.f31920f += i2;
            }
            return i2;
        }

        /* renamed from: f */
        private C14347f m1551f(int i) throws IOException {
            if (m1549h(i)) {
                return C14484c.f31913a[i].f31910a;
            }
            int m1554c = m1554c(i - C14484c.f31913a.length);
            if (m1554c >= 0) {
                C14482b[] c14482bArr = this.f31919e;
                if (m1554c < c14482bArr.length) {
                    return c14482bArr[m1554c].f31910a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        private void m1550g(int i, C14482b c14482b) {
            this.f31915a.add(c14482b);
            int i2 = c14482b.f31912c;
            if (i != -1) {
                i2 -= this.f31919e[m1554c(i)].f31912c;
            }
            int i3 = this.f31918d;
            if (i2 > i3) {
                m1555b();
                return;
            }
            int m1553d = m1553d((this.f31922h + i2) - i3);
            if (i == -1) {
                int i4 = this.f31921g + 1;
                C14482b[] c14482bArr = this.f31919e;
                if (i4 > c14482bArr.length) {
                    C14482b[] c14482bArr2 = new C14482b[c14482bArr.length * 2];
                    System.arraycopy(c14482bArr, 0, c14482bArr2, c14482bArr.length, c14482bArr.length);
                    this.f31920f = this.f31919e.length - 1;
                    this.f31919e = c14482bArr2;
                }
                int i5 = this.f31920f;
                this.f31920f = i5 - 1;
                this.f31919e[i5] = c14482b;
                this.f31921g++;
            } else {
                this.f31919e[i + m1554c(i) + m1553d] = c14482b;
            }
            this.f31922h += i2;
        }

        /* renamed from: h */
        private boolean m1549h(int i) {
            return i >= 0 && i <= C14484c.f31913a.length - 1;
        }

        /* renamed from: i */
        private int m1548i() throws IOException {
            return this.f31916b.readByte() & 255;
        }

        /* renamed from: l */
        private void m1545l(int i) throws IOException {
            if (m1549h(i)) {
                this.f31915a.add(C14484c.f31913a[i]);
                return;
            }
            int m1554c = m1554c(i - C14484c.f31913a.length);
            if (m1554c >= 0) {
                C14482b[] c14482bArr = this.f31919e;
                if (m1554c < c14482bArr.length) {
                    this.f31915a.add(c14482bArr[m1554c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private void m1543n(int i) throws IOException {
            m1550g(-1, new C14482b(m1551f(i), m1547j()));
        }

        /* renamed from: o */
        private void m1542o() throws IOException {
            C14347f m1547j = m1547j();
            C14484c.m1558a(m1547j);
            m1550g(-1, new C14482b(m1547j, m1547j()));
        }

        /* renamed from: p */
        private void m1541p(int i) throws IOException {
            this.f31915a.add(new C14482b(m1551f(i), m1547j()));
        }

        /* renamed from: q */
        private void m1540q() throws IOException {
            C14347f m1547j = m1547j();
            C14484c.m1558a(m1547j);
            this.f31915a.add(new C14482b(m1547j, m1547j()));
        }

        /* renamed from: e */
        public List<C14482b> m1552e() {
            ArrayList arrayList = new ArrayList(this.f31915a);
            this.f31915a.clear();
            return arrayList;
        }

        /* renamed from: j */
        C14347f m1547j() throws IOException {
            int m1548i = m1548i();
            boolean z = (m1548i & 128) == 128;
            int m1544m = m1544m(m1548i, 127);
            if (z) {
                return C14347f.m2034r(C14513j.m1421f().m1424c(this.f31916b.mo1980w(m1544m)));
            }
            return this.f31916b.mo1990f(m1544m);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public void m1546k() throws IOException {
            while (!this.f31916b.mo1987l()) {
                int readByte = this.f31916b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m1545l(m1544m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m1542o();
                } else if ((readByte & 64) == 64) {
                    m1543n(m1544m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m1544m = m1544m(readByte, 31);
                    this.f31918d = m1544m;
                    if (m1544m >= 0 && m1544m <= this.f31917c) {
                        m1556a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f31918d);
                    }
                } else if (readByte != 16 && readByte != 0) {
                    m1541p(m1544m(readByte, 15) - 1);
                } else {
                    m1540q();
                }
            }
        }

        /* renamed from: m */
        int m1544m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int m1548i = m1548i();
                if ((m1548i & 128) == 0) {
                    return i2 + (m1548i << i4);
                }
                i2 += (m1548i & 127) << i4;
                i4 += 7;
            }
        }

        C14485a(int i, int i2, InterfaceC14365s interfaceC14365s) {
            this.f31915a = new ArrayList();
            C14482b[] c14482bArr = new C14482b[8];
            this.f31919e = c14482bArr;
            this.f31920f = c14482bArr.length - 1;
            this.f31921g = 0;
            this.f31922h = 0;
            this.f31917c = i;
            this.f31918d = i2;
            this.f31916b = C14353l.m2021d(interfaceC14365s);
        }
    }

    /* compiled from: Hpack.java */
    /* renamed from: okhttp3.internal.http2.c$b */
    /* loaded from: classes3.dex */
    static final class C14486b {

        /* renamed from: a */
        private final C14342c f31923a;

        /* renamed from: b */
        private final boolean f31924b;

        /* renamed from: c */
        private int f31925c;

        /* renamed from: d */
        private boolean f31926d;

        /* renamed from: e */
        int f31927e;

        /* renamed from: f */
        C14482b[] f31928f;

        /* renamed from: g */
        int f31929g;

        /* renamed from: h */
        int f31930h;

        /* renamed from: i */
        int f31931i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C14486b(C14342c c14342c) {
            this(4096, true, c14342c);
        }

        /* renamed from: a */
        private void m1539a() {
            int i = this.f31927e;
            int i2 = this.f31931i;
            if (i < i2) {
                if (i == 0) {
                    m1538b();
                } else {
                    m1537c(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private void m1538b() {
            Arrays.fill(this.f31928f, (Object) null);
            this.f31929g = this.f31928f.length - 1;
            this.f31930h = 0;
            this.f31931i = 0;
        }

        /* renamed from: c */
        private int m1537c(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f31928f.length;
                while (true) {
                    length--;
                    if (length < this.f31929g || i <= 0) {
                        break;
                    }
                    C14482b[] c14482bArr = this.f31928f;
                    i -= c14482bArr[length].f31912c;
                    this.f31931i -= c14482bArr[length].f31912c;
                    this.f31930h--;
                    i2++;
                }
                C14482b[] c14482bArr2 = this.f31928f;
                int i3 = this.f31929g;
                System.arraycopy(c14482bArr2, i3 + 1, c14482bArr2, i3 + 1 + i2, this.f31930h);
                C14482b[] c14482bArr3 = this.f31928f;
                int i4 = this.f31929g;
                Arrays.fill(c14482bArr3, i4 + 1, i4 + 1 + i2, (Object) null);
                this.f31929g += i2;
            }
            return i2;
        }

        /* renamed from: d */
        private void m1536d(C14482b c14482b) {
            int i = c14482b.f31912c;
            int i2 = this.f31927e;
            if (i > i2) {
                m1538b();
                return;
            }
            m1537c((this.f31931i + i) - i2);
            int i3 = this.f31930h + 1;
            C14482b[] c14482bArr = this.f31928f;
            if (i3 > c14482bArr.length) {
                C14482b[] c14482bArr2 = new C14482b[c14482bArr.length * 2];
                System.arraycopy(c14482bArr, 0, c14482bArr2, c14482bArr.length, c14482bArr.length);
                this.f31929g = this.f31928f.length - 1;
                this.f31928f = c14482bArr2;
            }
            int i4 = this.f31929g;
            this.f31929g = i4 - 1;
            this.f31928f[i4] = c14482b;
            this.f31930h++;
            this.f31931i += i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public void m1535e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f31927e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.f31925c = Math.min(this.f31925c, min);
            }
            this.f31926d = true;
            this.f31927e = min;
            m1539a();
        }

        /* renamed from: f */
        void m1534f(C14347f c14347f) throws IOException {
            if (this.f31924b && C14513j.m1421f().m1422e(c14347f) < c14347f.mo1969A()) {
                C14342c c14342c = new C14342c();
                C14513j.m1421f().m1423d(c14347f, c14342c);
                C14347f m2046o0 = c14342c.m2046o0();
                m1532h(m2046o0.mo1969A(), 127, 128);
                this.f31923a.m2065P0(m2046o0);
                return;
            }
            m1532h(c14347f.mo1969A(), 127, 0);
            this.f31923a.m2065P0(c14347f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m1533g(List<C14482b> list) throws IOException {
            int i;
            int i2;
            if (this.f31926d) {
                int i3 = this.f31925c;
                if (i3 < this.f31927e) {
                    m1532h(i3, 31, 32);
                }
                this.f31926d = false;
                this.f31925c = Integer.MAX_VALUE;
                m1532h(this.f31927e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C14482b c14482b = list.get(i4);
                C14347f mo1967I = c14482b.f31910a.mo1967I();
                C14347f c14347f = c14482b.f31911b;
                Integer num = C14484c.f31914b.get(mo1967I);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (C14148c.m2791q(C14484c.f31913a[i - 1].f31911b, c14347f)) {
                            i2 = i;
                        } else if (C14148c.m2791q(C14484c.f31913a[i].f31911b, c14347f)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.f31929g + 1;
                    int length = this.f31928f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C14148c.m2791q(this.f31928f[i5].f31910a, mo1967I)) {
                            if (C14148c.m2791q(this.f31928f[i5].f31911b, c14347f)) {
                                i = C14484c.f31913a.length + (i5 - this.f31929g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f31929g) + C14484c.f31913a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    m1532h(i, 127, 128);
                } else if (i2 == -1) {
                    this.f31923a.m2061Z0(64);
                    m1534f(mo1967I);
                    m1534f(c14347f);
                    m1536d(c14482b);
                } else if (mo1967I.m2042C(C14482b.f31904d) && !C14482b.f31909i.equals(mo1967I)) {
                    m1532h(i2, 15, 0);
                    m1534f(c14347f);
                } else {
                    m1532h(i2, 63, 64);
                    m1534f(c14347f);
                    m1536d(c14482b);
                }
            }
        }

        /* renamed from: h */
        void m1532h(int i, int i2, int i3) {
            if (i < i2) {
                this.f31923a.m2061Z0(i | i3);
                return;
            }
            this.f31923a.m2061Z0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f31923a.m2061Z0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f31923a.m2061Z0(i4);
        }

        C14486b(int i, boolean z, C14342c c14342c) {
            this.f31925c = Integer.MAX_VALUE;
            C14482b[] c14482bArr = new C14482b[8];
            this.f31928f = c14482bArr;
            this.f31929g = c14482bArr.length - 1;
            this.f31930h = 0;
            this.f31931i = 0;
            this.f31927e = i;
            this.f31924b = z;
            this.f31923a = c14342c;
        }
    }

    /* renamed from: a */
    static C14347f m1558a(C14347f c14347f) throws IOException {
        int mo1969A = c14347f.mo1969A();
        for (int i = 0; i < mo1969A; i++) {
            byte mo1960n = c14347f.mo1960n(i);
            if (mo1960n >= 65 && mo1960n <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c14347f.mo1965M());
            }
        }
        return c14347f;
    }

    /* renamed from: b */
    private static Map<C14347f, Integer> m1557b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f31913a.length);
        int i = 0;
        while (true) {
            C14482b[] c14482bArr = f31913a;
            if (i < c14482bArr.length) {
                if (!linkedHashMap.containsKey(c14482bArr[i].f31910a)) {
                    linkedHashMap.put(f31913a[i].f31910a, Integer.valueOf(i));
                }
                i++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
