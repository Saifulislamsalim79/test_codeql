package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p565l.AbstractC14222p;
import p565l.C14115a;
import p565l.C14140e0;
import p565l.C14231t;
import p565l.InterfaceC14138e;
import p565l.p566g0.C14148c;
/* compiled from: RouteSelector.java */
/* renamed from: okhttp3.internal.connection.e */
/* loaded from: classes3.dex */
public final class C14477e {

    /* renamed from: a */
    private final C14115a f31865a;

    /* renamed from: b */
    private final C14476d f31866b;

    /* renamed from: c */
    private final InterfaceC14138e f31867c;

    /* renamed from: d */
    private final AbstractC14222p f31868d;

    /* renamed from: f */
    private int f31870f;

    /* renamed from: e */
    private List<Proxy> f31869e = Collections.emptyList();

    /* renamed from: g */
    private List<InetSocketAddress> f31871g = Collections.emptyList();

    /* renamed from: h */
    private final List<C14140e0> f31872h = new ArrayList();

    /* compiled from: RouteSelector.java */
    /* renamed from: okhttp3.internal.connection.e$a */
    /* loaded from: classes3.dex */
    public static final class C14478a {

        /* renamed from: a */
        private final List<C14140e0> f31873a;

        /* renamed from: b */
        private int f31874b = 0;

        C14478a(List<C14140e0> list) {
            this.f31873a = list;
        }

        /* renamed from: a */
        public List<C14140e0> m1581a() {
            return new ArrayList(this.f31873a);
        }

        /* renamed from: b */
        public boolean m1580b() {
            return this.f31874b < this.f31873a.size();
        }

        /* renamed from: c */
        public C14140e0 m1579c() {
            if (m1580b()) {
                List<C14140e0> list = this.f31873a;
                int i = this.f31874b;
                this.f31874b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C14477e(C14115a c14115a, C14476d c14476d, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p) {
        this.f31865a = c14115a;
        this.f31866b = c14476d;
        this.f31867c = interfaceC14138e;
        this.f31868d = abstractC14222p;
        m1582h(c14115a.m2922l(), c14115a.m2927g());
    }

    /* renamed from: b */
    static String m1588b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: d */
    private boolean m1586d() {
        return this.f31870f < this.f31869e.size();
    }

    /* renamed from: f */
    private Proxy m1584f() throws IOException {
        if (m1586d()) {
            List<Proxy> list = this.f31869e;
            int i = this.f31870f;
            this.f31870f = i + 1;
            Proxy proxy = list.get(i);
            m1583g(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f31865a.m2922l().m2516m() + "; exhausted proxy configurations: " + this.f31869e);
    }

    /* renamed from: g */
    private void m1583g(Proxy proxy) throws IOException {
        String m2516m;
        int m2503z;
        this.f31871g = new ArrayList();
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                m2516m = m1588b(inetSocketAddress);
                m2503z = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        } else {
            m2516m = this.f31865a.m2922l().m2516m();
            m2503z = this.f31865a.m2922l().m2503z();
        }
        if (m2503z >= 1 && m2503z <= 65535) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f31871g.add(InetSocketAddress.createUnresolved(m2516m, m2503z));
                return;
            }
            this.f31868d.m2575j(this.f31867c, m2516m);
            List<InetAddress> lookup = this.f31865a.m2931c().lookup(m2516m);
            if (!lookup.isEmpty()) {
                this.f31868d.m2576i(this.f31867c, m2516m, lookup);
                int size = lookup.size();
                for (int i = 0; i < size; i++) {
                    this.f31871g.add(new InetSocketAddress(lookup.get(i), m2503z));
                }
                return;
            }
            throw new UnknownHostException(this.f31865a.m2931c() + " returned no addresses for " + m2516m);
        }
        throw new SocketException("No route to " + m2516m + ":" + m2503z + "; port is out of range");
    }

    /* renamed from: h */
    private void m1582h(C14231t c14231t, Proxy proxy) {
        if (proxy != null) {
            this.f31869e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f31865a.m2925i().select(c14231t.m2530F());
            this.f31869e = (select == null || select.isEmpty()) ? C14148c.m2787u(Proxy.NO_PROXY) : C14148c.m2788t(select);
        }
        this.f31870f = 0;
    }

    /* renamed from: a */
    public void m1589a(C14140e0 c14140e0, IOException iOException) {
        if (c14140e0.m2831b().type() != Proxy.Type.DIRECT && this.f31865a.m2925i() != null) {
            this.f31865a.m2925i().connectFailed(this.f31865a.m2922l().m2530F(), c14140e0.m2831b().address(), iOException);
        }
        this.f31866b.m1591b(c14140e0);
    }

    /* renamed from: c */
    public boolean m1587c() {
        return m1586d() || !this.f31872h.isEmpty();
    }

    /* renamed from: e */
    public C14478a m1585e() throws IOException {
        if (m1587c()) {
            ArrayList arrayList = new ArrayList();
            while (m1586d()) {
                Proxy m1584f = m1584f();
                int size = this.f31871g.size();
                for (int i = 0; i < size; i++) {
                    C14140e0 c14140e0 = new C14140e0(this.f31865a, m1584f, this.f31871g.get(i));
                    if (this.f31866b.m1590c(c14140e0)) {
                        this.f31872h.add(c14140e0);
                    } else {
                        arrayList.add(c14140e0);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f31872h);
                this.f31872h.clear();
            }
            return new C14478a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
