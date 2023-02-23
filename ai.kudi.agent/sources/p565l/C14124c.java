package p565l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.p566g0.C14148c;
import p565l.p566g0.p567e.C14155c;
import p565l.p566g0.p567e.C14157d;
import p565l.p566g0.p567e.InterfaceC14154b;
import p565l.p566g0.p567e.InterfaceC14165f;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p568f.C14173f;
import p565l.p566g0.p568f.C14178k;
import p565l.p566g0.p570h.InterfaceC14187a;
import p565l.p566g0.p571i.C14198f;
import p576m.AbstractC14348g;
import p576m.AbstractC14349h;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: Cache.java */
/* renamed from: l.c */
/* loaded from: classes3.dex */
public final class C14124c implements Closeable, Flushable {

    /* renamed from: c */
    final InterfaceC14165f f30798c;

    /* renamed from: d */
    final C14157d f30799d;

    /* renamed from: e */
    int f30800e;

    /* renamed from: f */
    int f30801f;

    /* renamed from: w */
    private int f30802w;

    /* renamed from: x */
    private int f30803x;

    /* renamed from: y */
    private int f30804y;

    /* compiled from: Cache.java */
    /* renamed from: l.c$a */
    /* loaded from: classes3.dex */
    class C14125a implements InterfaceC14165f {
        C14125a() {
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        /* renamed from: a */
        public void mo2738a(C14155c c14155c) {
            C14124c.this.m2898P(c14155c);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        /* renamed from: b */
        public void mo2737b(C14116a0 c14116a0) throws IOException {
            C14124c.this.m2900J(c14116a0);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        /* renamed from: c */
        public InterfaceC14154b mo2736c(C14131c0 c14131c0) throws IOException {
            return C14124c.this.m2902F(c14131c0);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        /* renamed from: d */
        public C14131c0 mo2735d(C14116a0 c14116a0) throws IOException {
            return C14124c.this.m2895g(c14116a0);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        /* renamed from: e */
        public void mo2734e(C14131c0 c14131c0, C14131c0 c14131c02) {
            C14124c.this.m2897V(c14131c0, c14131c02);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14165f
        public void trackConditionalCacheHit() {
            C14124c.this.m2899O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* renamed from: l.c$b */
    /* loaded from: classes3.dex */
    public final class C14126b implements InterfaceC14154b {

        /* renamed from: a */
        private final C14157d.C14160c f30806a;

        /* renamed from: b */
        private InterfaceC14364r f30807b;

        /* renamed from: c */
        private InterfaceC14364r f30808c;

        /* renamed from: d */
        boolean f30809d;

        /* compiled from: Cache.java */
        /* renamed from: l.c$b$a */
        /* loaded from: classes3.dex */
        class C14127a extends AbstractC14348g {

            /* renamed from: d */
            final /* synthetic */ C14157d.C14160c f30811d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14127a(InterfaceC14364r interfaceC14364r, C14124c c14124c, C14157d.C14160c c14160c) {
                super(interfaceC14364r);
                this.f30811d = c14160c;
            }

            @Override // p576m.AbstractC14348g, p576m.InterfaceC14364r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (C14124c.this) {
                    if (C14126b.this.f30809d) {
                        return;
                    }
                    C14126b.this.f30809d = true;
                    C14124c.this.f30800e++;
                    super.close();
                    this.f30811d.m2748b();
                }
            }
        }

        C14126b(C14157d.C14160c c14160c) {
            this.f30806a = c14160c;
            InterfaceC14364r m2746d = c14160c.m2746d(1);
            this.f30807b = m2746d;
            this.f30808c = new C14127a(m2746d, C14124c.this, c14160c);
        }

        @Override // p565l.p566g0.p567e.InterfaceC14154b
        public void abort() {
            synchronized (C14124c.this) {
                if (this.f30809d) {
                    return;
                }
                this.f30809d = true;
                C14124c.this.f30801f++;
                C14148c.m2801g(this.f30807b);
                try {
                    this.f30806a.m2749a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // p565l.p566g0.p567e.InterfaceC14154b
        public InterfaceC14364r body() {
            return this.f30808c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* renamed from: l.c$c */
    /* loaded from: classes3.dex */
    public static class C14128c extends AbstractC14135d0 {

        /* renamed from: d */
        final C14157d.C14163e f30813d;

        /* renamed from: e */
        private final InterfaceC14346e f30814e;

        /* renamed from: f */
        private final String f30815f;

        /* renamed from: w */
        private final String f30816w;

        /* compiled from: Cache.java */
        /* renamed from: l.c$c$a */
        /* loaded from: classes3.dex */
        class C14129a extends AbstractC14349h {

            /* renamed from: d */
            final /* synthetic */ C14157d.C14163e f30817d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14129a(C14128c c14128c, InterfaceC14365s interfaceC14365s, C14157d.C14163e c14163e) {
                super(interfaceC14365s);
                this.f30817d = c14163e;
            }

            @Override // p576m.AbstractC14349h, p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f30817d.close();
                super.close();
            }
        }

        C14128c(C14157d.C14163e c14163e, String str, String str2) {
            this.f30813d = c14163e;
            this.f30815f = str;
            this.f30816w = str2;
            this.f30814e = C14353l.m2021d(new C14129a(this, c14163e.m2740g(1), c14163e));
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: F */
        public C14235v mo311F() {
            String str = this.f30815f;
            if (str != null) {
                return C14235v.m2474d(str);
            }
            return null;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: O */
        public InterfaceC14346e mo310O() {
            return this.f30814e;
        }

        @Override // p565l.AbstractC14135d0
        /* renamed from: m */
        public long mo309m() {
            try {
                if (this.f30816w != null) {
                    return Long.parseLong(this.f30816w);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
    }

    public C14124c(File file, long j) {
        this(file, j, InterfaceC14187a.f31035a);
    }

    /* renamed from: I */
    static int m2901I(InterfaceC14346e interfaceC14346e) throws IOException {
        try {
            long mo1985p = interfaceC14346e.mo1985p();
            String mo1982u = interfaceC14346e.mo1982u();
            if (mo1985p < 0 || mo1985p > 2147483647L || !mo1982u.isEmpty()) {
                throw new IOException("expected an int but was \"" + mo1985p + mo1982u + "\"");
            }
            return (int) mo1985p;
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: c */
    private void m2896c(C14157d.C14160c c14160c) {
        if (c14160c != null) {
            try {
                c14160c.m2749a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m */
    public static String m2894m(C14231t c14231t) {
        return C14347f.m2035m(c14231t.toString()).mo1958q().mo1959p();
    }

    /* renamed from: F */
    InterfaceC14154b m2902F(C14131c0 c14131c0) {
        C14157d.C14160c c14160c;
        String m2915g = c14131c0.m2873k0().m2915g();
        if (C14173f.m2714a(c14131c0.m2873k0().m2915g())) {
            try {
                m2900J(c14131c0.m2873k0());
            } catch (IOException unused) {
            }
            return null;
        } else if (!m2915g.equals("GET") || C14172e.m2725e(c14131c0)) {
            return null;
        } else {
            C14130d c14130d = new C14130d(c14131c0);
            try {
                c14160c = this.f30799d.m2766I(m2894m(c14131c0.m2873k0().m2913i()));
                if (c14160c == null) {
                    return null;
                }
                try {
                    c14130d.m2888f(c14160c);
                    return new C14126b(c14160c);
                } catch (IOException unused2) {
                    m2896c(c14160c);
                    return null;
                }
            } catch (IOException unused3) {
                c14160c = null;
            }
        }
    }

    /* renamed from: J */
    void m2900J(C14116a0 c14116a0) throws IOException {
        this.f30799d.m2754i0(m2894m(c14116a0.m2913i()));
    }

    /* renamed from: O */
    synchronized void m2899O() {
        this.f30803x++;
    }

    /* renamed from: P */
    synchronized void m2898P(C14155c c14155c) {
        this.f30804y++;
        if (c14155c.f30929a != null) {
            this.f30802w++;
        } else if (c14155c.f30930b != null) {
            this.f30803x++;
        }
    }

    /* renamed from: V */
    void m2897V(C14131c0 c14131c0, C14131c0 c14131c02) {
        C14157d.C14160c c14160c;
        C14130d c14130d = new C14130d(c14131c02);
        try {
            c14160c = ((C14128c) c14131c0.m2878c()).f30813d.m2741c();
            if (c14160c != null) {
                try {
                    c14130d.m2888f(c14160c);
                    c14160c.m2748b();
                } catch (IOException unused) {
                    m2896c(c14160c);
                }
            }
        } catch (IOException unused2) {
            c14160c = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30799d.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f30799d.flush();
    }

    /* renamed from: g */
    C14131c0 m2895g(C14116a0 c14116a0) {
        try {
            C14157d.C14163e m2764O = this.f30799d.m2764O(m2894m(c14116a0.m2913i()));
            if (m2764O == null) {
                return null;
            }
            try {
                C14130d c14130d = new C14130d(m2764O.m2740g(0));
                C14131c0 m2890d = c14130d.m2890d(m2764O);
                if (c14130d.m2892b(c14116a0, m2890d)) {
                    return m2890d;
                }
                C14148c.m2801g(m2890d.m2878c());
                return null;
            } catch (IOException unused) {
                C14148c.m2801g(m2764O);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    C14124c(File file, long j, InterfaceC14187a interfaceC14187a) {
        this.f30798c = new C14125a();
        this.f30799d = C14157d.m2752m(interfaceC14187a, file, 201105, 2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.java */
    /* renamed from: l.c$d */
    /* loaded from: classes3.dex */
    public static final class C14130d {

        /* renamed from: k */
        private static final String f30818k = C14198f.m2653j().m2652k() + "-Sent-Millis";

        /* renamed from: l */
        private static final String f30819l = C14198f.m2653j().m2652k() + "-Received-Millis";

        /* renamed from: a */
        private final String f30820a;

        /* renamed from: b */
        private final C14229s f30821b;

        /* renamed from: c */
        private final String f30822c;

        /* renamed from: d */
        private final EnumC14242y f30823d;

        /* renamed from: e */
        private final int f30824e;

        /* renamed from: f */
        private final String f30825f;

        /* renamed from: g */
        private final C14229s f30826g;

        /* renamed from: h */
        private final C14228r f30827h;

        /* renamed from: i */
        private final long f30828i;

        /* renamed from: j */
        private final long f30829j;

        C14130d(InterfaceC14365s interfaceC14365s) throws IOException {
            EnumC14142f0 enumC14142f0;
            try {
                InterfaceC14346e m2021d = C14353l.m2021d(interfaceC14365s);
                this.f30820a = m2021d.mo1982u();
                this.f30822c = m2021d.mo1982u();
                C14229s.C14230a c14230a = new C14229s.C14230a();
                int m2901I = C14124c.m2901I(m2021d);
                for (int i = 0; i < m2901I; i++) {
                    c14230a.m2541b(m2021d.mo1982u());
                }
                this.f30821b = c14230a.m2539d();
                C14178k m2692a = C14178k.m2692a(m2021d.mo1982u());
                this.f30823d = m2692a.f31009a;
                this.f30824e = m2692a.f31010b;
                this.f30825f = m2692a.f31011c;
                C14229s.C14230a c14230a2 = new C14229s.C14230a();
                int m2901I2 = C14124c.m2901I(m2021d);
                for (int i2 = 0; i2 < m2901I2; i2++) {
                    c14230a2.m2541b(m2021d.mo1982u());
                }
                String m2538e = c14230a2.m2538e(f30818k);
                String m2538e2 = c14230a2.m2538e(f30819l);
                c14230a2.m2537f(f30818k);
                c14230a2.m2537f(f30819l);
                this.f30828i = m2538e != null ? Long.parseLong(m2538e) : 0L;
                this.f30829j = m2538e2 != null ? Long.parseLong(m2538e2) : 0L;
                this.f30826g = c14230a2.m2539d();
                if (m2893a()) {
                    String mo1982u = m2021d.mo1982u();
                    if (mo1982u.length() <= 0) {
                        C14205h m2635a = C14205h.m2635a(m2021d.mo1982u());
                        List<Certificate> m2891c = m2891c(m2021d);
                        List<Certificate> m2891c2 = m2891c(m2021d);
                        if (!m2021d.mo1987l()) {
                            enumC14142f0 = EnumC14142f0.m2828a(m2021d.mo1982u());
                        } else {
                            enumC14142f0 = EnumC14142f0.SSL_3_0;
                        }
                        this.f30827h = C14228r.m2556c(enumC14142f0, m2635a, m2891c, m2891c2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + mo1982u + "\"");
                    }
                } else {
                    this.f30827h = null;
                }
            } finally {
                interfaceC14365s.close();
            }
        }

        /* renamed from: a */
        private boolean m2893a() {
            return this.f30820a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m2891c(InterfaceC14346e interfaceC14346e) throws IOException {
            int m2901I = C14124c.m2901I(interfaceC14346e);
            if (m2901I == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(m2901I);
                for (int i = 0; i < m2901I; i++) {
                    String mo1982u = interfaceC14346e.mo1982u();
                    C14342c c14342c = new C14342c();
                    c14342c.m2065P0(C14347f.m2039g(mo1982u));
                    arrayList.add(certificateFactory.generateCertificate(c14342c.mo1997D()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: e */
        private void m2889e(InterfaceC14345d interfaceC14345d, List<Certificate> list) throws IOException {
            try {
                interfaceC14345d.mo2010A(list.size()).mo2005n(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    interfaceC14345d.mo2003r(C14347f.m2034r(list.get(i).getEncoded()).mo1961a()).mo2005n(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean m2892b(C14116a0 c14116a0, C14131c0 c14131c0) {
            return this.f30820a.equals(c14116a0.m2913i().toString()) && this.f30822c.equals(c14116a0.m2915g()) && C14172e.m2715o(c14131c0, this.f30821b, c14116a0);
        }

        /* renamed from: d */
        public C14131c0 m2890d(C14157d.C14163e c14163e) {
            String m2550c = this.f30826g.m2550c("Content-Type");
            String m2550c2 = this.f30826g.m2550c("Content-Length");
            C14116a0.C14117a c14117a = new C14116a0.C14117a();
            c14117a.m2905h(this.f30820a);
            c14117a.m2907f(this.f30822c, null);
            c14117a.m2908e(this.f30821b);
            C14116a0 m2911b = c14117a.m2911b();
            C14131c0.C14132a c14132a = new C14131c0.C14132a();
            c14132a.m2855p(m2911b);
            c14132a.m2857n(this.f30823d);
            c14132a.m2864g(this.f30824e);
            c14132a.m2860k(this.f30825f);
            c14132a.m2861j(this.f30826g);
            c14132a.m2869b(new C14128c(c14163e, m2550c, m2550c2));
            c14132a.m2863h(this.f30827h);
            c14132a.m2854q(this.f30828i);
            c14132a.m2856o(this.f30829j);
            return c14132a.m2868c();
        }

        /* renamed from: f */
        public void m2888f(C14157d.C14160c c14160c) throws IOException {
            InterfaceC14345d m2022c = C14353l.m2022c(c14160c.m2746d(0));
            m2022c.mo2003r(this.f30820a).mo2005n(10);
            m2022c.mo2003r(this.f30822c).mo2005n(10);
            m2022c.mo2010A(this.f30821b.m2545h()).mo2005n(10);
            int m2545h = this.f30821b.m2545h();
            for (int i = 0; i < m2545h; i++) {
                m2022c.mo2003r(this.f30821b.m2548e(i)).mo2003r(": ").mo2003r(this.f30821b.m2544i(i)).mo2005n(10);
            }
            m2022c.mo2003r(new C14178k(this.f30823d, this.f30824e, this.f30825f).toString()).mo2005n(10);
            m2022c.mo2010A(this.f30826g.m2545h() + 2).mo2005n(10);
            int m2545h2 = this.f30826g.m2545h();
            for (int i2 = 0; i2 < m2545h2; i2++) {
                m2022c.mo2003r(this.f30826g.m2548e(i2)).mo2003r(": ").mo2003r(this.f30826g.m2544i(i2)).mo2005n(10);
            }
            m2022c.mo2003r(f30818k).mo2003r(": ").mo2010A(this.f30828i).mo2005n(10);
            m2022c.mo2003r(f30819l).mo2003r(": ").mo2010A(this.f30829j).mo2005n(10);
            if (m2893a()) {
                m2022c.mo2005n(10);
                m2022c.mo2003r(this.f30827h.m2558a().m2632d()).mo2005n(10);
                m2889e(m2022c, this.f30827h.m2554e());
                m2889e(m2022c, this.f30827h.m2555d());
                m2022c.mo2003r(this.f30827h.m2553f().m2826e()).mo2005n(10);
            }
            m2022c.close();
        }

        C14130d(C14131c0 c14131c0) {
            this.f30820a = c14131c0.m2873k0().m2913i().toString();
            this.f30821b = C14172e.m2716n(c14131c0);
            this.f30822c = c14131c0.m2873k0().m2915g();
            this.f30823d = c14131c0.m2875g0();
            this.f30824e = c14131c0.m2887F();
            this.f30825f = c14131c0.m2881X();
            this.f30826g = c14131c0.m2883P();
            this.f30827h = c14131c0.m2886I();
            this.f30828i = c14131c0.m2871o0();
            this.f30829j = c14131c0.m2874i0();
        }
    }
}
