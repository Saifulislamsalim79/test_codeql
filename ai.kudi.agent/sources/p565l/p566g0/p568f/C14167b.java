package p565l.p566g0.p568f;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.connection.C14475c;
import okhttp3.internal.connection.C14479f;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.InterfaceC14233u;
import p565l.p566g0.C14148c;
import p576m.AbstractC14348g;
import p576m.C14342c;
import p576m.C14353l;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14364r;
/* compiled from: CallServerInterceptor.java */
/* renamed from: l.g0.f.b */
/* loaded from: classes3.dex */
public final class C14167b implements InterfaceC14233u {

    /* renamed from: a */
    private final boolean f30985a;

    /* compiled from: CallServerInterceptor.java */
    /* renamed from: l.g0.f.b$a */
    /* loaded from: classes3.dex */
    static final class C14168a extends AbstractC14348g {

        /* renamed from: d */
        long f30986d;

        C14168a(InterfaceC14364r interfaceC14364r) {
            super(interfaceC14364r);
        }

        @Override // p576m.AbstractC14348g, p576m.InterfaceC14364r
        /* renamed from: r0 */
        public void mo1444r0(C14342c c14342c, long j) throws IOException {
            super.mo1444r0(c14342c, j);
            this.f30986d += j;
        }
    }

    public C14167b(boolean z) {
        this.f30985a = z;
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        C14131c0 m2868c;
        C14174g c14174g = (C14174g) interfaceC14234a;
        InterfaceC14169c m2707d = c14174g.m2707d();
        C14479f m2705f = c14174g.m2705f();
        C14475c c14475c = (C14475c) c14174g.connection();
        C14116a0 request = c14174g.request();
        long currentTimeMillis = System.currentTimeMillis();
        c14174g.m2708c().m2570o(c14174g.m2709b());
        m2707d.mo1527a(request);
        c14174g.m2708c().m2571n(c14174g.m2709b(), request);
        C14131c0.C14132a c14132a = null;
        if (C14173f.m2713b(request.m2915g()) && request.m2921a() != null) {
            if ("100-continue".equalsIgnoreCase(request.m2919c("Expect"))) {
                m2707d.flushRequest();
                c14174g.m2708c().m2566s(c14174g.m2709b());
                c14132a = m2707d.readResponseHeaders(true);
            }
            if (c14132a == null) {
                c14174g.m2708c().m2572m(c14174g.m2709b());
                C14168a c14168a = new C14168a(m2707d.mo1525c(request, request.m2921a().contentLength()));
                InterfaceC14345d m2022c = C14353l.m2022c(c14168a);
                request.m2921a().writeTo(m2022c);
                m2022c.close();
                c14174g.m2708c().m2573l(c14174g.m2709b(), c14168a.f30986d);
            } else if (!c14475c.m1598n()) {
                m2705f.m1569j();
            }
        }
        m2707d.finishRequest();
        if (c14132a == null) {
            c14174g.m2708c().m2566s(c14174g.m2709b());
            c14132a = m2707d.readResponseHeaders(false);
        }
        c14132a.m2855p(request);
        c14132a.m2863h(m2705f.m1575d().m1601k());
        c14132a.m2854q(currentTimeMillis);
        c14132a.m2856o(System.currentTimeMillis());
        C14131c0 m2868c2 = c14132a.m2868c();
        int m2887F = m2868c2.m2887F();
        if (m2887F == 100) {
            C14131c0.C14132a readResponseHeaders = m2707d.readResponseHeaders(false);
            readResponseHeaders.m2855p(request);
            readResponseHeaders.m2863h(m2705f.m1575d().m1601k());
            readResponseHeaders.m2854q(currentTimeMillis);
            readResponseHeaders.m2856o(System.currentTimeMillis());
            m2868c2 = readResponseHeaders.m2868c();
            m2887F = m2868c2.m2887F();
        }
        c14174g.m2708c().m2567r(c14174g.m2709b(), m2868c2);
        if (this.f30985a && m2887F == 101) {
            C14131c0.C14132a m2879b0 = m2868c2.m2879b0();
            m2879b0.m2869b(C14148c.f30907c);
            m2868c = m2879b0.m2868c();
        } else {
            C14131c0.C14132a m2879b02 = m2868c2.m2879b0();
            m2879b02.m2869b(m2707d.mo1526b(m2868c2));
            m2868c = m2879b02.m2868c();
        }
        if ("close".equalsIgnoreCase(m2868c.m2873k0().m2919c("Connection")) || "close".equalsIgnoreCase(m2868c.m2885J("Connection"))) {
            m2705f.m1569j();
        }
        if ((m2887F == 204 || m2887F == 205) && m2868c.m2878c().mo309m() > 0) {
            throw new ProtocolException("HTTP " + m2887F + " had non-zero Content-Length: " + m2868c.m2878c().mo309m());
        }
        return m2868c;
    }
}
