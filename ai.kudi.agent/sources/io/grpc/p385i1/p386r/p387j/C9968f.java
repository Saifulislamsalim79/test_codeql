package io.grpc.p385i1.p386r.p387j;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hpack.java */
/* renamed from: io.grpc.i1.r.j.f */
/* loaded from: classes2.dex */
public final class C9968f {

    /* renamed from: a */
    private static final C14347f f23641a = C14347f.m2035m(":");

    /* renamed from: b */
    private static final C9966d[] f23642b = {new C9966d(C9966d.f23632h, ""), new C9966d(C9966d.f23629e, "GET"), new C9966d(C9966d.f23629e, "POST"), new C9966d(C9966d.f23630f, "/"), new C9966d(C9966d.f23630f, "/index.html"), new C9966d(C9966d.f23631g, "http"), new C9966d(C9966d.f23631g, "https"), new C9966d(C9966d.f23628d, "200"), new C9966d(C9966d.f23628d, "204"), new C9966d(C9966d.f23628d, "206"), new C9966d(C9966d.f23628d, "304"), new C9966d(C9966d.f23628d, "400"), new C9966d(C9966d.f23628d, "404"), new C9966d(C9966d.f23628d, "500"), new C9966d("accept-charset", ""), new C9966d("accept-encoding", "gzip, deflate"), new C9966d("accept-language", ""), new C9966d("accept-ranges", ""), new C9966d("accept", ""), new C9966d("access-control-allow-origin", ""), new C9966d("age", ""), new C9966d("allow", ""), new C9966d("authorization", ""), new C9966d("cache-control", ""), new C9966d("content-disposition", ""), new C9966d("content-encoding", ""), new C9966d("content-language", ""), new C9966d("content-length", ""), new C9966d("content-location", ""), new C9966d("content-range", ""), new C9966d("content-type", ""), new C9966d("cookie", ""), new C9966d(AttributeType.DATE, ""), new C9966d("etag", ""), new C9966d("expect", ""), new C9966d("expires", ""), new C9966d("from", ""), new C9966d("host", ""), new C9966d("if-match", ""), new C9966d("if-modified-since", ""), new C9966d("if-none-match", ""), new C9966d("if-range", ""), new C9966d("if-unmodified-since", ""), new C9966d("last-modified", ""), new C9966d("link", ""), new C9966d("location", ""), new C9966d("max-forwards", ""), new C9966d("proxy-authenticate", ""), new C9966d("proxy-authorization", ""), new C9966d("range", ""), new C9966d("referer", ""), new C9966d("refresh", ""), new C9966d("retry-after", ""), new C9966d("server", ""), new C9966d("set-cookie", ""), new C9966d("strict-transport-security", ""), new C9966d("transfer-encoding", ""), new C9966d("user-agent", ""), new C9966d("vary", ""), new C9966d("via", ""), new C9966d("www-authenticate", "")};

    /* renamed from: c */
    private static final Map<C14347f, Integer> f23643c = m13457f();

    /* compiled from: Hpack.java */
    /* renamed from: io.grpc.i1.r.j.f$a */
    /* loaded from: classes2.dex */
    static final class C9969a {

        /* renamed from: a */
        private final List<C9966d> f23644a;

        /* renamed from: b */
        private final InterfaceC14346e f23645b;

        /* renamed from: c */
        private int f23646c;

        /* renamed from: d */
        private int f23647d;

        /* renamed from: e */
        C9966d[] f23648e;

        /* renamed from: f */
        int f23649f;

        /* renamed from: g */
        int f23650g;

        /* renamed from: h */
        int f23651h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9969a(int i, InterfaceC14365s interfaceC14365s) {
            this(i, i, interfaceC14365s);
        }

        /* renamed from: a */
        private void m13456a() {
            int i = this.f23647d;
            int i2 = this.f23651h;
            if (i < i2) {
                if (i == 0) {
                    m13455b();
                } else {
                    m13453d(i2 - i);
                }
            }
        }

        /* renamed from: b */
        private void m13455b() {
            Arrays.fill(this.f23648e, (Object) null);
            this.f23649f = this.f23648e.length - 1;
            this.f23650g = 0;
            this.f23651h = 0;
        }

        /* renamed from: c */
        private int m13454c(int i) {
            return this.f23649f + 1 + i;
        }

        /* renamed from: d */
        private int m13453d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f23648e.length;
                while (true) {
                    length--;
                    if (length < this.f23649f || i <= 0) {
                        break;
                    }
                    C9966d[] c9966dArr = this.f23648e;
                    i -= c9966dArr[length].f23635c;
                    this.f23651h -= c9966dArr[length].f23635c;
                    this.f23650g--;
                    i2++;
                }
                C9966d[] c9966dArr2 = this.f23648e;
                int i3 = this.f23649f;
                System.arraycopy(c9966dArr2, i3 + 1, c9966dArr2, i3 + 1 + i2, this.f23650g);
                this.f23649f += i2;
            }
            return i2;
        }

        /* renamed from: f */
        private C14347f m13451f(int i) throws IOException {
            if (m13448i(i)) {
                return C9968f.f23642b[i].f23633a;
            }
            int m13454c = m13454c(i - C9968f.f23642b.length);
            if (m13454c >= 0) {
                C9966d[] c9966dArr = this.f23648e;
                if (m13454c < c9966dArr.length) {
                    return c9966dArr[m13454c].f23633a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: h */
        private void m13449h(int i, C9966d c9966d) {
            this.f23644a.add(c9966d);
            int i2 = c9966d.f23635c;
            if (i != -1) {
                i2 -= this.f23648e[m13454c(i)].f23635c;
            }
            int i3 = this.f23647d;
            if (i2 > i3) {
                m13455b();
                return;
            }
            int m13453d = m13453d((this.f23651h + i2) - i3);
            if (i == -1) {
                int i4 = this.f23650g + 1;
                C9966d[] c9966dArr = this.f23648e;
                if (i4 > c9966dArr.length) {
                    C9966d[] c9966dArr2 = new C9966d[c9966dArr.length * 2];
                    System.arraycopy(c9966dArr, 0, c9966dArr2, c9966dArr.length, c9966dArr.length);
                    this.f23649f = this.f23648e.length - 1;
                    this.f23648e = c9966dArr2;
                }
                int i5 = this.f23649f;
                this.f23649f = i5 - 1;
                this.f23648e[i5] = c9966d;
                this.f23650g++;
            } else {
                this.f23648e[i + m13454c(i) + m13453d] = c9966d;
            }
            this.f23651h += i2;
        }

        /* renamed from: i */
        private boolean m13448i(int i) {
            return i >= 0 && i <= C9968f.f23642b.length - 1;
        }

        /* renamed from: j */
        private int m13447j() throws IOException {
            return this.f23645b.readByte() & 255;
        }

        /* renamed from: m */
        private void m13444m(int i) throws IOException {
            if (m13448i(i)) {
                this.f23644a.add(C9968f.f23642b[i]);
                return;
            }
            int m13454c = m13454c(i - C9968f.f23642b.length);
            if (m13454c >= 0) {
                C9966d[] c9966dArr = this.f23648e;
                if (m13454c <= c9966dArr.length - 1) {
                    this.f23644a.add(c9966dArr[m13454c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m13442o(int i) throws IOException {
            m13449h(-1, new C9966d(m13451f(i), m13446k()));
        }

        /* renamed from: p */
        private void m13441p() throws IOException {
            C14347f m13446k = m13446k();
            C9968f.m13458e(m13446k);
            m13449h(-1, new C9966d(m13446k, m13446k()));
        }

        /* renamed from: q */
        private void m13440q(int i) throws IOException {
            this.f23644a.add(new C9966d(m13451f(i), m13446k()));
        }

        /* renamed from: r */
        private void m13439r() throws IOException {
            C14347f m13446k = m13446k();
            C9968f.m13458e(m13446k);
            this.f23644a.add(new C9966d(m13446k, m13446k()));
        }

        /* renamed from: e */
        public List<C9966d> m13452e() {
            ArrayList arrayList = new ArrayList(this.f23644a);
            this.f23644a.clear();
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m13450g(int i) {
            this.f23646c = i;
            this.f23647d = i;
            m13456a();
        }

        /* renamed from: k */
        C14347f m13446k() throws IOException {
            int m13447j = m13447j();
            boolean z = (m13447j & 128) == 128;
            int m13443n = m13443n(m13447j, 127);
            if (z) {
                return C14347f.m2034r(C9976h.m13390f().m13393c(this.f23645b.mo1980w(m13443n)));
            }
            return this.f23645b.mo1990f(m13443n);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l */
        public void m13445l() throws IOException {
            while (!this.f23645b.mo1987l()) {
                int readByte = this.f23645b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m13444m(m13443n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m13441p();
                } else if ((readByte & 64) == 64) {
                    m13442o(m13443n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m13443n = m13443n(readByte, 31);
                    this.f23647d = m13443n;
                    if (m13443n >= 0 && m13443n <= this.f23646c) {
                        m13456a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f23647d);
                    }
                } else if (readByte != 16 && readByte != 0) {
                    m13440q(m13443n(readByte, 15) - 1);
                } else {
                    m13439r();
                }
            }
        }

        /* renamed from: n */
        int m13443n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int m13447j = m13447j();
                if ((m13447j & 128) == 0) {
                    return i2 + (m13447j << i4);
                }
                i2 += (m13447j & 127) << i4;
                i4 += 7;
            }
        }

        C9969a(int i, int i2, InterfaceC14365s interfaceC14365s) {
            this.f23644a = new ArrayList();
            C9966d[] c9966dArr = new C9966d[8];
            this.f23648e = c9966dArr;
            this.f23649f = c9966dArr.length - 1;
            this.f23650g = 0;
            this.f23651h = 0;
            this.f23646c = i;
            this.f23647d = i2;
            this.f23645b = C14353l.m2021d(interfaceC14365s);
        }
    }

    /* compiled from: Hpack.java */
    /* renamed from: io.grpc.i1.r.j.f$b */
    /* loaded from: classes2.dex */
    static final class C9970b {

        /* renamed from: a */
        private final C14342c f23652a;

        /* renamed from: b */
        private boolean f23653b;

        /* renamed from: c */
        private int f23654c;

        /* renamed from: d */
        private boolean f23655d;

        /* renamed from: e */
        private int f23656e;

        /* renamed from: f */
        C9966d[] f23657f;

        /* renamed from: g */
        int f23658g;

        /* renamed from: h */
        private int f23659h;

        /* renamed from: i */
        private int f23660i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9970b(C14342c c14342c) {
            this(4096, false, c14342c);
        }

        /* renamed from: a */
        private void m13438a() {
            Arrays.fill(this.f23657f, (Object) null);
            this.f23659h = this.f23657f.length - 1;
            this.f23658g = 0;
            this.f23660i = 0;
        }

        /* renamed from: b */
        private int m13437b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f23657f.length;
                while (true) {
                    length--;
                    if (length < this.f23659h || i <= 0) {
                        break;
                    }
                    C9966d[] c9966dArr = this.f23657f;
                    i -= c9966dArr[length].f23635c;
                    this.f23660i -= c9966dArr[length].f23635c;
                    this.f23658g--;
                    i2++;
                }
                C9966d[] c9966dArr2 = this.f23657f;
                int i3 = this.f23659h;
                System.arraycopy(c9966dArr2, i3 + 1, c9966dArr2, i3 + 1 + i2, this.f23658g);
                this.f23659h += i2;
            }
            return i2;
        }

        /* renamed from: c */
        private void m13436c(C9966d c9966d) {
            int i = c9966d.f23635c;
            int i2 = this.f23656e;
            if (i > i2) {
                m13438a();
                return;
            }
            m13437b((this.f23660i + i) - i2);
            int i3 = this.f23658g + 1;
            C9966d[] c9966dArr = this.f23657f;
            if (i3 > c9966dArr.length) {
                C9966d[] c9966dArr2 = new C9966d[c9966dArr.length * 2];
                System.arraycopy(c9966dArr, 0, c9966dArr2, c9966dArr.length, c9966dArr.length);
                this.f23659h = this.f23657f.length - 1;
                this.f23657f = c9966dArr2;
            }
            int i4 = this.f23659h;
            this.f23659h = i4 - 1;
            this.f23657f[i4] = c9966d;
            this.f23658g++;
            this.f23660i += i;
        }

        /* renamed from: d */
        void m13435d(C14347f c14347f) throws IOException {
            if (this.f23653b && C9976h.m13390f().m13391e(c14347f.mo1966J()) < c14347f.mo1969A()) {
                C14342c c14342c = new C14342c();
                C9976h.m13390f().m13392d(c14347f.mo1966J(), c14342c.m2060b0());
                C14347f m2046o0 = c14342c.m2046o0();
                m13433f(m2046o0.mo1969A(), 127, 128);
                this.f23652a.m2065P0(m2046o0);
                return;
            }
            m13433f(c14347f.mo1969A(), 127, 0);
            this.f23652a.m2065P0(c14347f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public void m13434e(List<C9966d> list) throws IOException {
            int i;
            int i2;
            if (this.f23655d) {
                int i3 = this.f23654c;
                if (i3 < this.f23656e) {
                    m13433f(i3, 31, 32);
                }
                this.f23655d = false;
                this.f23654c = Integer.MAX_VALUE;
                m13433f(this.f23656e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C9966d c9966d = list.get(i4);
                C14347f mo1967I = c9966d.f23633a.mo1967I();
                C14347f c14347f = c9966d.f23634b;
                Integer num = (Integer) C9968f.f23643c.get(mo1967I);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i >= 2 && i <= 7) {
                        if (C9968f.f23642b[i - 1].f23634b.equals(c14347f)) {
                            i2 = i;
                        } else if (C9968f.f23642b[i].f23634b.equals(c14347f)) {
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
                    int i5 = this.f23659h;
                    while (true) {
                        i5++;
                        C9966d[] c9966dArr = this.f23657f;
                        if (i5 >= c9966dArr.length) {
                            break;
                        } else if (c9966dArr[i5].f23633a.equals(mo1967I)) {
                            if (this.f23657f[i5].f23634b.equals(c14347f)) {
                                i = C9968f.f23642b.length + (i5 - this.f23659h);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f23659h) + C9968f.f23642b.length;
                            }
                        }
                    }
                }
                if (i != -1) {
                    m13433f(i, 127, 128);
                } else if (i2 != -1) {
                    if (mo1967I.m2042C(C9968f.f23641a) && !C9966d.f23632h.equals(mo1967I)) {
                        m13433f(i2, 15, 0);
                        m13435d(c14347f);
                    } else {
                        m13433f(i2, 63, 64);
                        m13435d(c14347f);
                        m13436c(c9966d);
                    }
                } else {
                    this.f23652a.m2061Z0(64);
                    m13435d(mo1967I);
                    m13435d(c14347f);
                    m13436c(c9966d);
                }
            }
        }

        /* renamed from: f */
        void m13433f(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f23652a.m2061Z0(i | i3);
                return;
            }
            this.f23652a.m2061Z0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f23652a.m2061Z0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f23652a.m2061Z0(i4);
        }

        C9970b(int i, boolean z, C14342c c14342c) {
            this.f23654c = Integer.MAX_VALUE;
            C9966d[] c9966dArr = new C9966d[8];
            this.f23657f = c9966dArr;
            this.f23659h = c9966dArr.length - 1;
            this.f23656e = i;
            this.f23653b = z;
            this.f23652a = c14342c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static C14347f m13458e(C14347f c14347f) throws IOException {
        int mo1969A = c14347f.mo1969A();
        for (int i = 0; i < mo1969A; i++) {
            byte mo1960n = c14347f.mo1960n(i);
            if (mo1960n >= 65 && mo1960n <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c14347f.mo1965M());
            }
        }
        return c14347f;
    }

    /* renamed from: f */
    private static Map<C14347f, Integer> m13457f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f23642b.length);
        int i = 0;
        while (true) {
            C9966d[] c9966dArr = f23642b;
            if (i < c9966dArr.length) {
                if (!linkedHashMap.containsKey(c9966dArr[i].f23633a)) {
                    linkedHashMap.put(f23642b[i].f23633a, Integer.valueOf(i));
                }
                i++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
