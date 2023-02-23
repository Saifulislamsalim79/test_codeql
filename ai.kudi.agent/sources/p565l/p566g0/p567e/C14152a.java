package p565l.p566g0.p567e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.EnumC14242y;
import p565l.InterfaceC14233u;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.p567e.C14155c;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p568f.C14173f;
import p565l.p566g0.p568f.C14175h;
import p576m.C14342c;
import p576m.C14353l;
import p576m.C14366t;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14364r;
import p576m.InterfaceC14365s;
/* compiled from: CacheInterceptor.java */
/* renamed from: l.g0.e.a */
/* loaded from: classes3.dex */
public final class C14152a implements InterfaceC14233u {

    /* renamed from: a */
    final InterfaceC14165f f30924a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CacheInterceptor.java */
    /* renamed from: l.g0.e.a$a */
    /* loaded from: classes3.dex */
    public class C14153a implements InterfaceC14365s {

        /* renamed from: c */
        boolean f30925c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC14346e f30926d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC14154b f30927e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC14345d f30928f;

        C14153a(C14152a c14152a, InterfaceC14346e interfaceC14346e, InterfaceC14154b interfaceC14154b, InterfaceC14345d interfaceC14345d) {
            this.f30926d = interfaceC14346e;
            this.f30927e = interfaceC14154b;
            this.f30928f = interfaceC14345d;
        }

        @Override // p576m.InterfaceC14365s
        /* renamed from: O0 */
        public long mo312O0(C14342c c14342c, long j) throws IOException {
            try {
                long mo312O0 = this.f30926d.mo312O0(c14342c, j);
                if (mo312O0 == -1) {
                    if (!this.f30925c) {
                        this.f30925c = true;
                        this.f30928f.close();
                    }
                    return -1L;
                }
                c14342c.m2070I(this.f30928f.mo1992d(), c14342c.m2072F0() - mo312O0, mo312O0);
                this.f30928f.mo2004o();
                return mo312O0;
            } catch (IOException e) {
                if (!this.f30925c) {
                    this.f30925c = true;
                    this.f30927e.abort();
                }
                throw e;
            }
        }

        @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f30925c && !C14148c.m2792p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f30925c = true;
                this.f30927e.abort();
            }
            this.f30926d.close();
        }

        @Override // p576m.InterfaceC14365s
        public C14366t timeout() {
            return this.f30926d.timeout();
        }
    }

    public C14152a(InterfaceC14165f interfaceC14165f) {
        this.f30924a = interfaceC14165f;
    }

    /* renamed from: a */
    private C14131c0 m2779a(InterfaceC14154b interfaceC14154b, C14131c0 c14131c0) throws IOException {
        InterfaceC14364r body;
        if (interfaceC14154b == null || (body = interfaceC14154b.body()) == null) {
            return c14131c0;
        }
        C14153a c14153a = new C14153a(this, c14131c0.m2878c().mo310O(), interfaceC14154b, C14353l.m2022c(body));
        String m2885J = c14131c0.m2885J("Content-Type");
        long mo309m = c14131c0.m2878c().mo309m();
        C14131c0.C14132a m2879b0 = c14131c0.m2879b0();
        m2879b0.m2869b(new C14175h(m2885J, mo309m, C14353l.m2021d(c14153a)));
        return m2879b0.m2868c();
    }

    /* renamed from: b */
    private static C14229s m2778b(C14229s c14229s, C14229s c14229s2) {
        C14229s.C14230a c14230a = new C14229s.C14230a();
        int m2545h = c14229s.m2545h();
        for (int i = 0; i < m2545h; i++) {
            String m2548e = c14229s.m2548e(i);
            String m2544i = c14229s.m2544i(i);
            if ((!"Warning".equalsIgnoreCase(m2548e) || !m2544i.startsWith("1")) && (m2777c(m2548e) || !m2776d(m2548e) || c14229s2.m2550c(m2548e) == null)) {
                AbstractC14146a.f30903a.mo2434b(c14230a, m2548e, m2544i);
            }
        }
        int m2545h2 = c14229s2.m2545h();
        for (int i2 = 0; i2 < m2545h2; i2++) {
            String m2548e2 = c14229s2.m2548e(i2);
            if (!m2777c(m2548e2) && m2776d(m2548e2)) {
                AbstractC14146a.f30903a.mo2434b(c14230a, m2548e2, c14229s2.m2544i(i2));
            }
        }
        return c14230a.m2539d();
    }

    /* renamed from: c */
    static boolean m2777c(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: d */
    static boolean m2776d(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: e */
    private static C14131c0 m2775e(C14131c0 c14131c0) {
        if (c14131c0 == null || c14131c0.m2878c() == null) {
            return c14131c0;
        }
        C14131c0.C14132a m2879b0 = c14131c0.m2879b0();
        m2879b0.m2869b(null);
        return m2879b0.m2868c();
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        InterfaceC14165f interfaceC14165f = this.f30924a;
        C14131c0 mo2735d = interfaceC14165f != null ? interfaceC14165f.mo2735d(interfaceC14234a.request()) : null;
        C14155c m2771c = new C14155c.C14156a(System.currentTimeMillis(), interfaceC14234a.request(), mo2735d).m2771c();
        C14116a0 c14116a0 = m2771c.f30929a;
        C14131c0 c14131c0 = m2771c.f30930b;
        InterfaceC14165f interfaceC14165f2 = this.f30924a;
        if (interfaceC14165f2 != null) {
            interfaceC14165f2.mo2738a(m2771c);
        }
        if (mo2735d != null && c14131c0 == null) {
            C14148c.m2801g(mo2735d.m2878c());
        }
        if (c14116a0 == null && c14131c0 == null) {
            C14131c0.C14132a c14132a = new C14131c0.C14132a();
            c14132a.m2855p(interfaceC14234a.request());
            c14132a.m2857n(EnumC14242y.HTTP_1_1);
            c14132a.m2864g(504);
            c14132a.m2860k("Unsatisfiable Request (only-if-cached)");
            c14132a.m2869b(C14148c.f30907c);
            c14132a.m2854q(-1L);
            c14132a.m2856o(System.currentTimeMillis());
            return c14132a.m2868c();
        } else if (c14116a0 == null) {
            C14131c0.C14132a m2879b0 = c14131c0.m2879b0();
            m2879b0.m2867d(m2775e(c14131c0));
            return m2879b0.m2868c();
        } else {
            try {
                C14131c0 mo2478a = interfaceC14234a.mo2478a(c14116a0);
                if (mo2478a == null && mo2735d != null) {
                }
                if (c14131c0 != null) {
                    if (mo2478a.m2887F() == 304) {
                        C14131c0.C14132a m2879b02 = c14131c0.m2879b0();
                        m2879b02.m2861j(m2778b(c14131c0.m2883P(), mo2478a.m2883P()));
                        m2879b02.m2854q(mo2478a.m2871o0());
                        m2879b02.m2856o(mo2478a.m2874i0());
                        m2879b02.m2867d(m2775e(c14131c0));
                        m2879b02.m2859l(m2775e(mo2478a));
                        C14131c0 m2868c = m2879b02.m2868c();
                        mo2478a.m2878c().close();
                        this.f30924a.trackConditionalCacheHit();
                        this.f30924a.mo2734e(c14131c0, m2868c);
                        return m2868c;
                    }
                    C14148c.m2801g(c14131c0.m2878c());
                }
                C14131c0.C14132a m2879b03 = mo2478a.m2879b0();
                m2879b03.m2867d(m2775e(c14131c0));
                m2879b03.m2859l(m2775e(mo2478a));
                C14131c0 m2868c2 = m2879b03.m2868c();
                if (this.f30924a != null) {
                    if (C14172e.m2727c(m2868c2) && C14155c.m2774a(m2868c2, c14116a0)) {
                        return m2779a(this.f30924a.mo2736c(m2868c2), m2868c2);
                    }
                    if (C14173f.m2714a(c14116a0.m2915g())) {
                        try {
                            this.f30924a.mo2737b(c14116a0);
                        } catch (IOException unused) {
                        }
                    }
                }
                return m2868c2;
            } finally {
                if (mo2735d != null) {
                    C14148c.m2801g(mo2735d.m2878c());
                }
            }
        }
    }
}
