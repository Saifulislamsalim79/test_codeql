package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.http2.C14488e;
import okhttp3.internal.http2.C14490f;
import okhttp3.internal.http2.C14508h;
import okhttp3.internal.http2.EnumC14481a;
import p565l.AbstractC14222p;
import p565l.C14115a;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14140e0;
import p565l.C14143g;
import p565l.C14212j;
import p565l.C14214k;
import p565l.C14228r;
import p565l.C14231t;
import p565l.C14239x;
import p565l.EnumC14242y;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14211i;
import p565l.InterfaceC14233u;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.C14151d;
import p565l.p566g0.p568f.C14172e;
import p565l.p566g0.p568f.InterfaceC14169c;
import p565l.p566g0.p569g.C14179a;
import p565l.p566g0.p571i.C14198f;
import p565l.p566g0.p573k.C14203d;
import p576m.C14353l;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* compiled from: RealConnection.java */
/* renamed from: okhttp3.internal.connection.c */
/* loaded from: classes3.dex */
public final class C14475c extends C14490f.AbstractC14498h implements InterfaceC14211i {

    /* renamed from: b */
    private final C14212j f31850b;

    /* renamed from: c */
    private final C14140e0 f31851c;

    /* renamed from: d */
    private Socket f31852d;

    /* renamed from: e */
    private Socket f31853e;

    /* renamed from: f */
    private C14228r f31854f;

    /* renamed from: g */
    private EnumC14242y f31855g;

    /* renamed from: h */
    private C14490f f31856h;

    /* renamed from: i */
    private InterfaceC14346e f31857i;

    /* renamed from: j */
    private InterfaceC14345d f31858j;

    /* renamed from: k */
    public boolean f31859k;

    /* renamed from: l */
    public int f31860l;

    /* renamed from: m */
    public int f31861m = 1;

    /* renamed from: n */
    public final List<Reference<C14479f>> f31862n = new ArrayList();

    /* renamed from: o */
    public long f31863o = Long.MAX_VALUE;

    public C14475c(C14212j c14212j, C14140e0 c14140e0) {
        this.f31850b = c14212j;
        this.f31851c = c14140e0;
    }

    /* renamed from: e */
    private void m1607e(int i, int i2, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p) throws IOException {
        Socket createSocket;
        Proxy m2831b = this.f31851c.m2831b();
        C14115a m2832a = this.f31851c.m2832a();
        if (m2831b.type() != Proxy.Type.DIRECT && m2831b.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(m2831b);
        } else {
            createSocket = m2832a.m2924j().createSocket();
        }
        this.f31852d = createSocket;
        abstractC14222p.m2579f(interfaceC14138e, this.f31851c.m2829d(), m2831b);
        this.f31852d.setSoTimeout(i2);
        try {
            C14198f.m2653j().mo2655h(this.f31852d, this.f31851c.m2829d(), i);
            try {
                this.f31857i = C14353l.m2021d(C14353l.m2012m(this.f31852d));
                this.f31858j = C14353l.m2022c(C14353l.m2016i(this.f31852d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f31851c.m2829d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: f */
    private void m1606f(C14474b c14474b) throws IOException {
        SSLSocket sSLSocket;
        EnumC14242y enumC14242y;
        C14115a m2832a = this.f31851c.m2832a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) m2832a.m2923k().createSocket(this.f31852d, m2832a.m2922l().m2516m(), m2832a.m2922l().m2503z(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C14214k m1612a = c14474b.m1612a(sSLSocket);
            if (m1612a.m2614f()) {
                C14198f.m2653j().mo2656g(sSLSocket, m2832a.m2922l().m2516m(), m2832a.m2928f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C14228r m2557b = C14228r.m2557b(session);
            if (m2832a.m2929e().verify(m2832a.m2922l().m2516m(), session)) {
                m2832a.m2933a().m2825a(m2832a.m2922l().m2516m(), m2557b.m2554e());
                String mo2650m = m1612a.m2614f() ? C14198f.m2653j().mo2650m(sSLSocket) : null;
                this.f31853e = sSLSocket;
                this.f31857i = C14353l.m2021d(C14353l.m2012m(sSLSocket));
                this.f31858j = C14353l.m2022c(C14353l.m2016i(this.f31853e));
                this.f31854f = m2557b;
                if (mo2650m != null) {
                    enumC14242y = EnumC14242y.m2418a(mo2650m);
                } else {
                    enumC14242y = EnumC14242y.HTTP_1_1;
                }
                this.f31855g = enumC14242y;
                if (sSLSocket != null) {
                    C14198f.m2653j().mo2662a(sSLSocket);
                    return;
                }
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) m2557b.m2554e().get(0);
            throw new SSLPeerUnverifiedException("Hostname " + m2832a.m2922l().m2516m() + " not verified:\n    certificate: " + C14143g.m2823c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C14203d.m2641a(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!C14148c.m2817A(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C14198f.m2653j().mo2662a(sSLSocket2);
            }
            C14148c.m2800h(sSLSocket2);
            throw th;
        }
    }

    /* renamed from: g */
    private void m1605g(int i, int i2, int i3, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p) throws IOException {
        C14116a0 m1603i = m1603i();
        C14231t m2913i = m1603i.m2913i();
        for (int i4 = 0; i4 < 21; i4++) {
            m1607e(i, i2, interfaceC14138e, abstractC14222p);
            m1603i = m1604h(i2, i3, m1603i, m2913i);
            if (m1603i == null) {
                return;
            }
            C14148c.m2800h(this.f31852d);
            this.f31852d = null;
            this.f31858j = null;
            this.f31857i = null;
            abstractC14222p.m2581d(interfaceC14138e, this.f31851c.m2829d(), this.f31851c.m2831b(), null);
        }
    }

    /* renamed from: h */
    private C14116a0 m1604h(int i, int i2, C14116a0 c14116a0, C14231t c14231t) throws IOException {
        String str = "CONNECT " + C14148c.m2789s(c14231t, true) + " HTTP/1.1";
        while (true) {
            C14179a c14179a = new C14179a(null, null, this.f31857i, this.f31858j);
            this.f31857i.timeout().mo1946g(i, TimeUnit.MILLISECONDS);
            this.f31858j.timeout().mo1946g(i2, TimeUnit.MILLISECONDS);
            c14179a.m2683l(c14116a0.m2917e(), str);
            c14179a.finishRequest();
            C14131c0.C14132a readResponseHeaders = c14179a.readResponseHeaders(false);
            readResponseHeaders.m2855p(c14116a0);
            C14131c0 m2868c = readResponseHeaders.m2868c();
            long m2728b = C14172e.m2728b(m2868c);
            if (m2728b == -1) {
                m2728b = 0;
            }
            InterfaceC14365s m2687h = c14179a.m2687h(m2728b);
            C14148c.m2814D(m2687h, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            m2687h.close();
            int m2887F = m2868c.m2887F();
            if (m2887F == 200) {
                if (this.f31857i.mo1992d().mo1987l() && this.f31858j.mo1992d().mo1987l()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (m2887F == 407) {
                C14116a0 mo2903a = this.f31851c.m2832a().m2926h().mo2903a(this.f31851c, m2868c);
                if (mo2903a != null) {
                    if ("close".equalsIgnoreCase(m2868c.m2885J("Connection"))) {
                        return mo2903a;
                    }
                    c14116a0 = mo2903a;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + m2868c.m2887F());
            }
        }
    }

    /* renamed from: i */
    private C14116a0 m1603i() throws IOException {
        C14116a0.C14117a c14117a = new C14116a0.C14117a();
        c14117a.m2904i(this.f31851c.m2832a().m2922l());
        c14117a.m2907f("CONNECT", null);
        c14117a.m2909d("Host", C14148c.m2789s(this.f31851c.m2832a().m2922l(), true));
        c14117a.m2909d("Proxy-Connection", "Keep-Alive");
        c14117a.m2909d("User-Agent", C14151d.m2780a());
        C14116a0 m2911b = c14117a.m2911b();
        C14131c0.C14132a c14132a = new C14131c0.C14132a();
        c14132a.m2855p(m2911b);
        c14132a.m2857n(EnumC14242y.HTTP_1_1);
        c14132a.m2864g(407);
        c14132a.m2860k("Preemptive Authenticate");
        c14132a.m2869b(C14148c.f30907c);
        c14132a.m2854q(-1L);
        c14132a.m2856o(-1L);
        c14132a.m2862i("Proxy-Authenticate", "OkHttp-Preemptive");
        C14116a0 mo2903a = this.f31851c.m2832a().m2926h().mo2903a(this.f31851c, c14132a.m2868c());
        return mo2903a != null ? mo2903a : m2911b;
    }

    /* renamed from: j */
    private void m1602j(C14474b c14474b, int i, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p) throws IOException {
        if (this.f31851c.m2832a().m2923k() == null) {
            if (this.f31851c.m2832a().m2928f().contains(EnumC14242y.H2_PRIOR_KNOWLEDGE)) {
                this.f31853e = this.f31852d;
                this.f31855g = EnumC14242y.H2_PRIOR_KNOWLEDGE;
                m1594r(i);
                return;
            }
            this.f31853e = this.f31852d;
            this.f31855g = EnumC14242y.HTTP_1_1;
            return;
        }
        abstractC14222p.m2564u(interfaceC14138e);
        m1606f(c14474b);
        abstractC14222p.m2565t(interfaceC14138e, this.f31854f);
        if (this.f31855g == EnumC14242y.HTTP_2) {
            m1594r(i);
        }
    }

    /* renamed from: r */
    private void m1594r(int i) throws IOException {
        this.f31853e.setSoTimeout(0);
        C14490f.C14497g c14497g = new C14490f.C14497g(true);
        c14497g.m1491d(this.f31853e, this.f31851c.m2832a().m2922l().m2516m(), this.f31857i, this.f31858j);
        c14497g.m1493b(this);
        c14497g.m1492c(i);
        C14490f m1494a = c14497g.m1494a();
        this.f31856h = m1494a;
        m1494a.m1496x0();
    }

    @Override // okhttp3.internal.http2.C14490f.AbstractC14498h
    /* renamed from: a */
    public void mo1490a(C14490f c14490f) {
        synchronized (this.f31850b) {
            this.f31861m = c14490f.m1510V();
        }
    }

    @Override // okhttp3.internal.http2.C14490f.AbstractC14498h
    /* renamed from: b */
    public void mo1489b(C14508h c14508h) throws IOException {
        c14508h.m1461f(EnumC14481a.REFUSED_STREAM);
    }

    /* renamed from: c */
    public void m1609c() {
        C14148c.m2800h(this.f31852d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[Catch: IOException -> 0x00f9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00f9, blocks: (B:18:0x0088, B:20:0x0090), top: B:67:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[EDGE_INSN: B:77:0x0142->B:61:0x0142 ?: BREAK  ] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1608d(int r17, int r18, int r19, int r20, boolean r21, p565l.InterfaceC14138e r22, p565l.AbstractC14222p r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C14475c.m1608d(int, int, int, int, boolean, l.e, l.p):void");
    }

    /* renamed from: k */
    public C14228r m1601k() {
        return this.f31854f;
    }

    /* renamed from: l */
    public boolean m1600l(C14115a c14115a, C14140e0 c14140e0) {
        if (this.f31862n.size() >= this.f31861m || this.f31859k || !AbstractC14146a.f30903a.mo2429g(this.f31851c.m2832a(), c14115a)) {
            return false;
        }
        if (c14115a.m2922l().m2516m().equals(m1596p().m2832a().m2922l().m2516m())) {
            return true;
        }
        if (this.f31856h != null && c14140e0 != null && c14140e0.m2831b().type() == Proxy.Type.DIRECT && this.f31851c.m2831b().type() == Proxy.Type.DIRECT && this.f31851c.m2829d().equals(c14140e0.m2829d()) && c14140e0.m2832a().m2929e() == C14203d.f31065a && m1593s(c14115a.m2922l())) {
            try {
                c14115a.m2933a().m2825a(c14115a.m2922l().m2516m(), m1601k().m2554e());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m1599m(boolean z) {
        if (this.f31853e.isClosed() || this.f31853e.isInputShutdown() || this.f31853e.isOutputShutdown()) {
            return false;
        }
        C14490f c14490f = this.f31856h;
        if (c14490f != null) {
            return !c14490f.m1511P();
        }
        if (z) {
            try {
                int soTimeout = this.f31853e.getSoTimeout();
                try {
                    this.f31853e.setSoTimeout(1);
                    return !this.f31857i.mo1987l();
                } finally {
                    this.f31853e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean m1598n() {
        return this.f31856h != null;
    }

    /* renamed from: o */
    public InterfaceC14169c m1597o(C14239x c14239x, InterfaceC14233u.InterfaceC14234a interfaceC14234a, C14479f c14479f) throws SocketException {
        if (this.f31856h != null) {
            return new C14488e(c14239x, interfaceC14234a, c14479f, this.f31856h);
        }
        this.f31853e.setSoTimeout(interfaceC14234a.readTimeoutMillis());
        this.f31857i.timeout().mo1946g(interfaceC14234a.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f31858j.timeout().mo1946g(interfaceC14234a.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new C14179a(c14239x, c14479f, this.f31857i, this.f31858j);
    }

    /* renamed from: p */
    public C14140e0 m1596p() {
        return this.f31851c;
    }

    @Override // p565l.InterfaceC14211i
    public EnumC14242y protocol() {
        return this.f31855g;
    }

    /* renamed from: q */
    public Socket m1595q() {
        return this.f31853e;
    }

    /* renamed from: s */
    public boolean m1593s(C14231t c14231t) {
        if (c14231t.m2503z() != this.f31851c.m2832a().m2922l().m2503z()) {
            return false;
        }
        if (c14231t.m2516m().equals(this.f31851c.m2832a().m2922l().m2516m())) {
            return true;
        }
        return this.f31854f != null && C14203d.f31065a.m2639c(c14231t.m2516m(), (X509Certificate) this.f31854f.m2554e().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f31851c.m2832a().m2922l().m2516m());
        sb.append(":");
        sb.append(this.f31851c.m2832a().m2922l().m2503z());
        sb.append(", proxy=");
        sb.append(this.f31851c.m2831b());
        sb.append(" hostAddress=");
        sb.append(this.f31851c.m2829d());
        sb.append(" cipherSuite=");
        C14228r c14228r = this.f31854f;
        sb.append(c14228r != null ? c14228r.m2558a() : "none");
        sb.append(" protocol=");
        sb.append(this.f31855g);
        sb.append('}');
        return sb.toString();
    }
}
