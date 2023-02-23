package p565l.p566g0.p568f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.C14479f;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p565l.AbstractC14222p;
import p565l.C14115a;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14140e0;
import p565l.C14143g;
import p565l.C14231t;
import p565l.C14239x;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14233u;
import p565l.p566g0.C14148c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: RetryAndFollowUpInterceptor.java */
/* renamed from: l.g0.f.j */
/* loaded from: classes3.dex */
public final class C14177j implements InterfaceC14233u {

    /* renamed from: a */
    private final C14239x f31005a;

    /* renamed from: b */
    private volatile C14479f f31006b;

    /* renamed from: c */
    private Object f31007c;

    /* renamed from: d */
    private volatile boolean f31008d;

    public C14177j(C14239x c14239x, boolean z) {
        this.f31005a = c14239x;
    }

    /* renamed from: b */
    private C14115a m2700b(C14231t c14231t) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C14143g c14143g;
        if (c14231t.m2515n()) {
            SSLSocketFactory m2462C = this.f31005a.m2462C();
            hostnameVerifier = this.f31005a.m2446p();
            sSLSocketFactory = m2462C;
            c14143g = this.f31005a.m2456e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c14143g = null;
        }
        return new C14115a(c14231t.m2516m(), c14231t.m2503z(), this.f31005a.m2450k(), this.f31005a.m2463B(), sSLSocketFactory, hostnameVerifier, c14143g, this.f31005a.m2438x(), this.f31005a.m2439w(), this.f31005a.m2440v(), this.f31005a.m2453h(), this.f31005a.m2437y());
    }

    /* renamed from: c */
    private C14116a0 m2699c(C14131c0 c14131c0, C14140e0 c14140e0) throws IOException {
        String m2885J;
        C14231t m2532D;
        Proxy m2439w;
        if (c14131c0 != null) {
            int m2887F = c14131c0.m2887F();
            String m2915g = c14131c0.m2873k0().m2915g();
            if (m2887F == 307 || m2887F == 308) {
                if (!m2915g.equals("GET") && !m2915g.equals("HEAD")) {
                    return null;
                }
            } else if (m2887F != 401) {
                if (m2887F == 503) {
                    if ((c14131c0.m2877f0() == null || c14131c0.m2877f0().m2887F() != 503) && m2695g(c14131c0, Integer.MAX_VALUE) == 0) {
                        return c14131c0.m2873k0();
                    }
                    return null;
                } else if (m2887F == 407) {
                    if (c14140e0 != null) {
                        m2439w = c14140e0.m2831b();
                    } else {
                        m2439w = this.f31005a.m2439w();
                    }
                    if (m2439w.type() == Proxy.Type.HTTP) {
                        return this.f31005a.m2438x().mo2903a(c14140e0, c14131c0);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (m2887F == 408) {
                    if (this.f31005a.m2464A()) {
                        c14131c0.m2873k0().m2921a();
                        if ((c14131c0.m2877f0() == null || c14131c0.m2877f0().m2887F() != 408) && m2695g(c14131c0, 0) <= 0) {
                            return c14131c0.m2873k0();
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (m2887F) {
                        case IjkMediaCodecInfo.RANK_SECURE /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f31005a.m2459b().mo2903a(c14140e0, c14131c0);
            }
            if (!this.f31005a.m2448n() || (m2885J = c14131c0.m2885J("Location")) == null || (m2532D = c14131c0.m2873k0().m2913i().m2532D(m2885J)) == null) {
                return null;
            }
            if (m2532D.m2531E().equals(c14131c0.m2873k0().m2913i().m2531E()) || this.f31005a.m2447o()) {
                C14116a0.C14117a m2914h = c14131c0.m2873k0().m2914h();
                if (C14173f.m2713b(m2915g)) {
                    boolean m2711d = C14173f.m2711d(m2915g);
                    if (C14173f.m2712c(m2915g)) {
                        m2914h.m2907f("GET", null);
                    } else {
                        m2914h.m2907f(m2915g, m2711d ? c14131c0.m2873k0().m2921a() : null);
                    }
                    if (!m2711d) {
                        m2914h.m2906g("Transfer-Encoding");
                        m2914h.m2906g("Content-Length");
                        m2914h.m2906g("Content-Type");
                    }
                }
                if (!m2694h(c14131c0, m2532D)) {
                    m2914h.m2906g("Authorization");
                }
                m2914h.m2904i(m2532D);
                return m2914h.m2911b();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    private boolean m2697e(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: f */
    private boolean m2696f(IOException iOException, C14479f c14479f, boolean z, C14116a0 c14116a0) {
        c14479f.m1562q(iOException);
        if (this.f31005a.m2464A()) {
            if (z) {
                c14116a0.m2921a();
            }
            return m2697e(iOException, z) && c14479f.m1571h();
        }
        return false;
    }

    /* renamed from: g */
    private int m2695g(C14131c0 c14131c0, int i) {
        String m2885J = c14131c0.m2885J("Retry-After");
        if (m2885J == null) {
            return i;
        }
        if (m2885J.matches("\\d+")) {
            return Integer.valueOf(m2885J).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: h */
    private boolean m2694h(C14131c0 c14131c0, C14231t c14231t) {
        C14231t m2913i = c14131c0.m2873k0().m2913i();
        return m2913i.m2516m().equals(c14231t.m2516m()) && m2913i.m2503z() == c14231t.m2503z() && m2913i.m2531E().equals(c14231t.m2531E());
    }

    /* renamed from: a */
    public void m2701a() {
        this.f31008d = true;
        C14479f c14479f = this.f31006b;
        if (c14479f != null) {
            c14479f.m1577b();
        }
    }

    /* renamed from: d */
    public boolean m2698d() {
        return this.f31008d;
    }

    /* renamed from: i */
    public void m2693i(Object obj) {
        this.f31007c = obj;
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        C14131c0 m2706e;
        C14116a0 m2699c;
        C14116a0 request = interfaceC14234a.request();
        C14174g c14174g = (C14174g) interfaceC14234a;
        InterfaceC14138e m2709b = c14174g.m2709b();
        AbstractC14222p m2708c = c14174g.m2708c();
        C14479f c14479f = new C14479f(this.f31005a.m2454g(), m2700b(request.m2913i()), m2709b, m2708c, this.f31007c);
        this.f31006b = c14479f;
        C14131c0 c14131c0 = null;
        int i = 0;
        while (!this.f31008d) {
            try {
                try {
                    m2706e = c14174g.m2706e(request, c14479f, null, null);
                    if (c14131c0 != null) {
                        C14131c0.C14132a m2879b0 = m2706e.m2879b0();
                        C14131c0.C14132a m2879b02 = c14131c0.m2879b0();
                        m2879b02.m2869b(null);
                        m2879b0.m2858m(m2879b02.m2868c());
                        m2706e = m2879b0.m2868c();
                    }
                    try {
                        m2699c = m2699c(m2706e, c14479f.m1564o());
                    } catch (IOException e) {
                        c14479f.m1568k();
                        throw e;
                    }
                } catch (Throwable th) {
                    c14479f.m1562q(null);
                    c14479f.m1568k();
                    throw th;
                }
            } catch (IOException e2) {
                if (!m2696f(e2, c14479f, !(e2 instanceof ConnectionShutdownException), request)) {
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!m2696f(e3.m1613c(), c14479f, false, request)) {
                    throw e3.m1614b();
                }
            }
            if (m2699c == null) {
                c14479f.m1568k();
                return m2706e;
            }
            C14148c.m2801g(m2706e.m2878c());
            int i2 = i + 1;
            if (i2 <= 20) {
                m2699c.m2921a();
                if (!m2694h(m2706e, m2699c.m2913i())) {
                    c14479f.m1568k();
                    c14479f = new C14479f(this.f31005a.m2454g(), m2700b(m2699c.m2913i()), m2709b, m2708c, this.f31007c);
                    this.f31006b = c14479f;
                } else if (c14479f.m1576c() != null) {
                    throw new IllegalStateException("Closing the body of " + m2706e + " didn't close its backing stream. Bad interceptor?");
                }
                c14131c0 = m2706e;
                request = m2699c;
                i = i2;
            } else {
                c14479f.m1568k();
                throw new ProtocolException("Too many follow-up requests: " + i2);
            }
        }
        c14479f.m1568k();
        throw new IOException("Canceled");
    }
}
