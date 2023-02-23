package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.internal.connection.C14477e;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.EnumC14481a;
import okhttp3.internal.http2.StreamResetException;
import p565l.AbstractC14222p;
import p565l.C14115a;
import p565l.C14140e0;
import p565l.C14212j;
import p565l.C14239x;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14233u;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.p568f.InterfaceC14169c;
/* compiled from: StreamAllocation.java */
/* renamed from: okhttp3.internal.connection.f */
/* loaded from: classes3.dex */
public final class C14479f {

    /* renamed from: a */
    public final C14115a f31875a;

    /* renamed from: b */
    private C14477e.C14478a f31876b;

    /* renamed from: c */
    private C14140e0 f31877c;

    /* renamed from: d */
    private final C14212j f31878d;

    /* renamed from: e */
    public final InterfaceC14138e f31879e;

    /* renamed from: f */
    public final AbstractC14222p f31880f;

    /* renamed from: g */
    private final Object f31881g;

    /* renamed from: h */
    private final C14477e f31882h;

    /* renamed from: i */
    private int f31883i;

    /* renamed from: j */
    private C14475c f31884j;

    /* renamed from: k */
    private boolean f31885k;

    /* renamed from: l */
    private boolean f31886l;

    /* renamed from: m */
    private boolean f31887m;

    /* renamed from: n */
    private InterfaceC14169c f31888n;

    /* compiled from: StreamAllocation.java */
    /* renamed from: okhttp3.internal.connection.f$a */
    /* loaded from: classes3.dex */
    public static final class C14480a extends WeakReference<C14479f> {

        /* renamed from: a */
        public final Object f31889a;

        C14480a(C14479f c14479f, Object obj) {
            super(c14479f);
            this.f31889a = obj;
        }
    }

    public C14479f(C14212j c14212j, C14115a c14115a, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p, Object obj) {
        this.f31878d = c14212j;
        this.f31875a = c14115a;
        this.f31879e = interfaceC14138e;
        this.f31880f = abstractC14222p;
        this.f31882h = new C14477e(c14115a, m1563p(), interfaceC14138e, abstractC14222p);
        this.f31881g = obj;
    }

    /* renamed from: e */
    private Socket m1574e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f31888n = null;
        }
        if (z2) {
            this.f31886l = true;
        }
        C14475c c14475c = this.f31884j;
        if (c14475c != null) {
            if (z) {
                c14475c.f31859k = true;
            }
            if (this.f31888n == null) {
                if (this.f31886l || this.f31884j.f31859k) {
                    m1567l(this.f31884j);
                    if (this.f31884j.f31862n.isEmpty()) {
                        this.f31884j.f31863o = System.nanoTime();
                        if (AbstractC14146a.f30903a.mo2431e(this.f31878d, this.f31884j)) {
                            socket = this.f31884j.m1595q();
                            this.f31884j = null;
                            return socket;
                        }
                    }
                    socket = null;
                    this.f31884j = null;
                    return socket;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    private C14475c m1573f(int i, int i2, int i3, int i4, boolean z) throws IOException {
        Socket m1565n;
        Socket socket;
        C14475c c14475c;
        C14475c c14475c2;
        C14140e0 c14140e0;
        boolean z2;
        boolean z3;
        C14477e.C14478a c14478a;
        synchronized (this.f31878d) {
            if (!this.f31886l) {
                if (this.f31888n == null) {
                    if (!this.f31887m) {
                        C14475c c14475c3 = this.f31884j;
                        m1565n = m1565n();
                        socket = null;
                        if (this.f31884j != null) {
                            c14475c2 = this.f31884j;
                            c14475c = null;
                        } else {
                            c14475c = c14475c3;
                            c14475c2 = null;
                        }
                        if (!this.f31885k) {
                            c14475c = null;
                        }
                        if (c14475c2 == null) {
                            AbstractC14146a.f30903a.mo2428h(this.f31878d, this.f31875a, this, null);
                            if (this.f31884j != null) {
                                c14475c2 = this.f31884j;
                                c14140e0 = null;
                                z2 = true;
                            } else {
                                c14140e0 = this.f31877c;
                            }
                        } else {
                            c14140e0 = null;
                        }
                        z2 = false;
                    } else {
                        throw new IOException("Canceled");
                    }
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        C14148c.m2800h(m1565n);
        if (c14475c != null) {
            this.f31880f.m2577h(this.f31879e, c14475c);
        }
        if (z2) {
            this.f31880f.m2578g(this.f31879e, c14475c2);
        }
        if (c14475c2 != null) {
            return c14475c2;
        }
        if (c14140e0 != null || ((c14478a = this.f31876b) != null && c14478a.m1580b())) {
            z3 = false;
        } else {
            this.f31876b = this.f31882h.m1585e();
            z3 = true;
        }
        synchronized (this.f31878d) {
            if (this.f31887m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<C14140e0> m1581a = this.f31876b.m1581a();
                int size = m1581a.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    C14140e0 c14140e02 = m1581a.get(i5);
                    AbstractC14146a.f30903a.mo2428h(this.f31878d, this.f31875a, this, c14140e02);
                    if (this.f31884j != null) {
                        c14475c2 = this.f31884j;
                        this.f31877c = c14140e02;
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (!z2) {
                if (c14140e0 == null) {
                    c14140e0 = this.f31876b.m1579c();
                }
                this.f31877c = c14140e0;
                this.f31883i = 0;
                c14475c2 = new C14475c(this.f31878d, c14140e0);
                m1578a(c14475c2, false);
            }
        }
        if (z2) {
            this.f31880f.m2578g(this.f31879e, c14475c2);
            return c14475c2;
        }
        c14475c2.m1608d(i, i2, i3, i4, z, this.f31879e, this.f31880f);
        m1563p().m1592a(c14475c2.m1596p());
        synchronized (this.f31878d) {
            this.f31885k = true;
            AbstractC14146a.f30903a.mo2427i(this.f31878d, c14475c2);
            if (c14475c2.m1598n()) {
                socket = AbstractC14146a.f30903a.mo2430f(this.f31878d, this.f31875a, this);
                c14475c2 = this.f31884j;
            }
        }
        C14148c.m2800h(socket);
        this.f31880f.m2578g(this.f31879e, c14475c2);
        return c14475c2;
    }

    /* renamed from: g */
    private C14475c m1572g(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            C14475c m1573f = m1573f(i, i2, i3, i4, z);
            synchronized (this.f31878d) {
                if (m1573f.f31860l == 0) {
                    return m1573f;
                }
                if (m1573f.m1599m(z2)) {
                    return m1573f;
                }
                m1569j();
            }
        }
    }

    /* renamed from: l */
    private void m1567l(C14475c c14475c) {
        int size = c14475c.f31862n.size();
        for (int i = 0; i < size; i++) {
            if (c14475c.f31862n.get(i).get() == this) {
                c14475c.f31862n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    private Socket m1565n() {
        C14475c c14475c = this.f31884j;
        if (c14475c == null || !c14475c.f31859k) {
            return null;
        }
        return m1574e(false, false, true);
    }

    /* renamed from: p */
    private C14476d m1563p() {
        return AbstractC14146a.f30903a.mo2426j(this.f31878d);
    }

    /* renamed from: a */
    public void m1578a(C14475c c14475c, boolean z) {
        if (this.f31884j == null) {
            this.f31884j = c14475c;
            this.f31885k = z;
            c14475c.f31862n.add(new C14480a(this, this.f31881g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void m1577b() {
        InterfaceC14169c interfaceC14169c;
        C14475c c14475c;
        synchronized (this.f31878d) {
            this.f31887m = true;
            interfaceC14169c = this.f31888n;
            c14475c = this.f31884j;
        }
        if (interfaceC14169c != null) {
            interfaceC14169c.cancel();
        } else if (c14475c != null) {
            c14475c.m1609c();
        }
    }

    /* renamed from: c */
    public InterfaceC14169c m1576c() {
        InterfaceC14169c interfaceC14169c;
        synchronized (this.f31878d) {
            interfaceC14169c = this.f31888n;
        }
        return interfaceC14169c;
    }

    /* renamed from: d */
    public synchronized C14475c m1575d() {
        return this.f31884j;
    }

    /* renamed from: h */
    public boolean m1571h() {
        C14477e.C14478a c14478a;
        return this.f31877c != null || ((c14478a = this.f31876b) != null && c14478a.m1580b()) || this.f31882h.m1587c();
    }

    /* renamed from: i */
    public InterfaceC14169c m1570i(C14239x c14239x, InterfaceC14233u.InterfaceC14234a interfaceC14234a, boolean z) {
        try {
            InterfaceC14169c m1597o = m1572g(interfaceC14234a.connectTimeoutMillis(), interfaceC14234a.readTimeoutMillis(), interfaceC14234a.writeTimeoutMillis(), c14239x.m2441u(), c14239x.m2464A(), z).m1597o(c14239x, interfaceC14234a, this);
            synchronized (this.f31878d) {
                this.f31888n = m1597o;
            }
            return m1597o;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* renamed from: j */
    public void m1569j() {
        C14475c c14475c;
        Socket m1574e;
        synchronized (this.f31878d) {
            c14475c = this.f31884j;
            m1574e = m1574e(true, false, false);
            if (this.f31884j != null) {
                c14475c = null;
            }
        }
        C14148c.m2800h(m1574e);
        if (c14475c != null) {
            this.f31880f.m2577h(this.f31879e, c14475c);
        }
    }

    /* renamed from: k */
    public void m1568k() {
        C14475c c14475c;
        Socket m1574e;
        synchronized (this.f31878d) {
            c14475c = this.f31884j;
            m1574e = m1574e(false, true, false);
            if (this.f31884j != null) {
                c14475c = null;
            }
        }
        C14148c.m2800h(m1574e);
        if (c14475c != null) {
            AbstractC14146a.f30903a.mo2425k(this.f31879e, null);
            this.f31880f.m2577h(this.f31879e, c14475c);
            this.f31880f.m2584a(this.f31879e);
        }
    }

    /* renamed from: m */
    public Socket m1566m(C14475c c14475c) {
        if (this.f31888n == null && this.f31884j.f31862n.size() == 1) {
            Socket m1574e = m1574e(true, false, false);
            this.f31884j = c14475c;
            c14475c.f31862n.add(this.f31884j.f31862n.get(0));
            return m1574e;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public C14140e0 m1564o() {
        return this.f31877c;
    }

    /* renamed from: q */
    public void m1562q(IOException iOException) {
        C14475c c14475c;
        boolean z;
        Socket m1574e;
        synchronized (this.f31878d) {
            c14475c = null;
            if (iOException instanceof StreamResetException) {
                EnumC14481a enumC14481a = ((StreamResetException) iOException).f31890c;
                if (enumC14481a == EnumC14481a.REFUSED_STREAM) {
                    int i = this.f31883i + 1;
                    this.f31883i = i;
                    if (i > 1) {
                        this.f31877c = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (enumC14481a != EnumC14481a.CANCEL) {
                        this.f31877c = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                if (this.f31884j != null && (!this.f31884j.m1598n() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.f31884j.f31860l == 0) {
                        if (this.f31877c != null && iOException != null) {
                            this.f31882h.m1589a(this.f31877c, iOException);
                        }
                        this.f31877c = null;
                    }
                    z = true;
                }
                z = false;
            }
            C14475c c14475c2 = this.f31884j;
            m1574e = m1574e(z, false, true);
            if (this.f31884j == null && this.f31885k) {
                c14475c = c14475c2;
            }
        }
        C14148c.m2800h(m1574e);
        if (c14475c != null) {
            this.f31880f.m2577h(this.f31879e, c14475c);
        }
    }

    /* renamed from: r */
    public void m1561r(boolean z, InterfaceC14169c interfaceC14169c, long j, IOException iOException) {
        C14475c c14475c;
        Socket m1574e;
        boolean z2;
        this.f31880f.m2569p(this.f31879e, j);
        synchronized (this.f31878d) {
            if (interfaceC14169c != null) {
                if (interfaceC14169c == this.f31888n) {
                    if (!z) {
                        this.f31884j.f31860l++;
                    }
                    c14475c = this.f31884j;
                    m1574e = m1574e(z, false, true);
                    if (this.f31884j != null) {
                        c14475c = null;
                    }
                    z2 = this.f31886l;
                }
            }
            throw new IllegalStateException("expected " + this.f31888n + " but was " + interfaceC14169c);
        }
        C14148c.m2800h(m1574e);
        if (c14475c != null) {
            this.f31880f.m2577h(this.f31879e, c14475c);
        }
        if (iOException != null) {
            this.f31880f.m2583b(this.f31879e, AbstractC14146a.f30903a.mo2425k(this.f31879e, iOException));
        } else if (z2) {
            AbstractC14146a.f30903a.mo2425k(this.f31879e, null);
            this.f31880f.m2584a(this.f31879e);
        }
    }

    public String toString() {
        C14475c m1575d = m1575d();
        return m1575d != null ? m1575d.toString() : this.f31875a.toString();
    }
}
