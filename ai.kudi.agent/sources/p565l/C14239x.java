package p565l;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.connection.C14475c;
import okhttp3.internal.connection.C14476d;
import okhttp3.internal.connection.C14479f;
import p565l.AbstractC14222p;
import p565l.C14131c0;
import p565l.C14229s;
import p565l.InterfaceC14138e;
import p565l.p566g0.AbstractC14146a;
import p565l.p566g0.C14148c;
import p565l.p566g0.p567e.InterfaceC14165f;
import p565l.p566g0.p571i.C14198f;
import p565l.p566g0.p572j.C14199a;
import p565l.p566g0.p573k.AbstractC14202c;
import p565l.p566g0.p573k.C14203d;
/* compiled from: OkHttpClient.java */
/* renamed from: l.x */
/* loaded from: classes3.dex */
public class C14239x implements Cloneable, InterfaceC14138e.InterfaceC14139a {

    /* renamed from: U */
    static final List<EnumC14242y> f31189U = C14148c.m2787u(EnumC14242y.HTTP_2, EnumC14242y.HTTP_1_1);

    /* renamed from: V */
    static final List<C14214k> f31190V = C14148c.m2787u(C14214k.f31106g, C14214k.f31107h);

    /* renamed from: A */
    final InterfaceC14217m f31191A;

    /* renamed from: B */
    final C14124c f31192B;

    /* renamed from: C */
    final InterfaceC14165f f31193C;

    /* renamed from: D */
    final SocketFactory f31194D;

    /* renamed from: E */
    final SSLSocketFactory f31195E;

    /* renamed from: F */
    final AbstractC14202c f31196F;

    /* renamed from: G */
    final HostnameVerifier f31197G;

    /* renamed from: H */
    final C14143g f31198H;

    /* renamed from: I */
    final InterfaceC14118b f31199I;

    /* renamed from: J */
    final InterfaceC14118b f31200J;

    /* renamed from: K */
    final C14212j f31201K;

    /* renamed from: L */
    final InterfaceC14220o f31202L;

    /* renamed from: M */
    final boolean f31203M;

    /* renamed from: N */
    final boolean f31204N;

    /* renamed from: O */
    final boolean f31205O;

    /* renamed from: P */
    final int f31206P;

    /* renamed from: Q */
    final int f31207Q;

    /* renamed from: R */
    final int f31208R;

    /* renamed from: S */
    final int f31209S;

    /* renamed from: T */
    final int f31210T;

    /* renamed from: c */
    final C14219n f31211c;

    /* renamed from: d */
    final Proxy f31212d;

    /* renamed from: e */
    final List<EnumC14242y> f31213e;

    /* renamed from: f */
    final List<C14214k> f31214f;

    /* renamed from: w */
    final List<InterfaceC14233u> f31215w;

    /* renamed from: x */
    final List<InterfaceC14233u> f31216x;

    /* renamed from: y */
    final AbstractC14222p.InterfaceC14225c f31217y;

    /* renamed from: z */
    final ProxySelector f31218z;

    /* compiled from: OkHttpClient.java */
    /* renamed from: l.x$a */
    /* loaded from: classes3.dex */
    class C14240a extends AbstractC14146a {
        C14240a() {
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: a */
        public void mo2435a(C14229s.C14230a c14230a, String str) {
            c14230a.m2541b(str);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: b */
        public void mo2434b(C14229s.C14230a c14230a, String str, String str2) {
            c14230a.m2540c(str, str2);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: c */
        public void mo2433c(C14214k c14214k, SSLSocket sSLSocket, boolean z) {
            c14214k.m2619a(sSLSocket, z);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: d */
        public int mo2432d(C14131c0.C14132a c14132a) {
            return c14132a.f30845c;
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: e */
        public boolean mo2431e(C14212j c14212j, C14475c c14475c) {
            return c14212j.m2624b(c14475c);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: f */
        public Socket mo2430f(C14212j c14212j, C14115a c14115a, C14479f c14479f) {
            return c14212j.m2623c(c14115a, c14479f);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: g */
        public boolean mo2429g(C14115a c14115a, C14115a c14115a2) {
            return c14115a.m2930d(c14115a2);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: h */
        public C14475c mo2428h(C14212j c14212j, C14115a c14115a, C14479f c14479f, C14140e0 c14140e0) {
            return c14212j.m2622d(c14115a, c14479f, c14140e0);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: i */
        public void mo2427i(C14212j c14212j, C14475c c14475c) {
            c14212j.m2620f(c14475c);
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: j */
        public C14476d mo2426j(C14212j c14212j) {
            return c14212j.f31101e;
        }

        @Override // p565l.p566g0.AbstractC14146a
        /* renamed from: k */
        public IOException mo2425k(InterfaceC14138e interfaceC14138e, IOException iOException) {
            return ((C14243z) interfaceC14138e).m2410g(iOException);
        }
    }

    /* compiled from: OkHttpClient.java */
    /* renamed from: l.x$b */
    /* loaded from: classes3.dex */
    public static final class C14241b {

        /* renamed from: A */
        int f31219A;

        /* renamed from: B */
        int f31220B;

        /* renamed from: b */
        Proxy f31222b;

        /* renamed from: h */
        ProxySelector f31228h;

        /* renamed from: i */
        InterfaceC14217m f31229i;

        /* renamed from: j */
        C14124c f31230j;

        /* renamed from: k */
        InterfaceC14165f f31231k;

        /* renamed from: l */
        SocketFactory f31232l;

        /* renamed from: m */
        SSLSocketFactory f31233m;

        /* renamed from: n */
        AbstractC14202c f31234n;

        /* renamed from: o */
        HostnameVerifier f31235o;

        /* renamed from: p */
        C14143g f31236p;

        /* renamed from: q */
        InterfaceC14118b f31237q;

        /* renamed from: r */
        InterfaceC14118b f31238r;

        /* renamed from: s */
        C14212j f31239s;

        /* renamed from: t */
        InterfaceC14220o f31240t;

        /* renamed from: u */
        boolean f31241u;

        /* renamed from: v */
        boolean f31242v;

        /* renamed from: w */
        boolean f31243w;

        /* renamed from: x */
        int f31244x;

        /* renamed from: y */
        int f31245y;

        /* renamed from: z */
        int f31246z;

        /* renamed from: e */
        final List<InterfaceC14233u> f31225e = new ArrayList();

        /* renamed from: f */
        final List<InterfaceC14233u> f31226f = new ArrayList();

        /* renamed from: a */
        C14219n f31221a = new C14219n();

        /* renamed from: c */
        List<EnumC14242y> f31223c = C14239x.f31189U;

        /* renamed from: d */
        List<C14214k> f31224d = C14239x.f31190V;

        /* renamed from: g */
        AbstractC14222p.InterfaceC14225c f31227g = AbstractC14222p.m2574k(AbstractC14222p.f31138a);

        public C14241b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f31228h = proxySelector;
            if (proxySelector == null) {
                this.f31228h = new C14199a();
            }
            this.f31229i = InterfaceC14217m.f31129a;
            this.f31232l = SocketFactory.getDefault();
            this.f31235o = C14203d.f31065a;
            this.f31236p = C14143g.f30895c;
            InterfaceC14118b interfaceC14118b = InterfaceC14118b.f30789a;
            this.f31237q = interfaceC14118b;
            this.f31238r = interfaceC14118b;
            this.f31239s = new C14212j();
            this.f31240t = InterfaceC14220o.f31137a;
            this.f31241u = true;
            this.f31242v = true;
            this.f31243w = true;
            this.f31244x = 0;
            this.f31245y = 10000;
            this.f31246z = 10000;
            this.f31219A = 10000;
            this.f31220B = 0;
        }

        /* renamed from: a */
        public C14241b m2424a(InterfaceC14233u interfaceC14233u) {
            if (interfaceC14233u != null) {
                this.f31225e.add(interfaceC14233u);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public C14239x m2423b() {
            return new C14239x(this);
        }

        /* renamed from: c */
        public C14241b m2422c(C14124c c14124c) {
            this.f31230j = c14124c;
            this.f31231k = null;
            return this;
        }

        /* renamed from: d */
        public C14241b m2421d(long j, TimeUnit timeUnit) {
            this.f31245y = C14148c.m2803e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public C14241b m2420e(long j, TimeUnit timeUnit) {
            this.f31246z = C14148c.m2803e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: f */
        public C14241b m2419f(long j, TimeUnit timeUnit) {
            this.f31219A = C14148c.m2803e("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        AbstractC14146a.f30903a = new C14240a();
    }

    public C14239x() {
        this(new C14241b());
    }

    /* renamed from: t */
    private static SSLSocketFactory m2442t(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo2651l = C14198f.m2653j().mo2651l();
            mo2651l.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo2651l.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C14148c.m2806b("No System TLS", e);
        }
    }

    /* renamed from: A */
    public boolean m2464A() {
        return this.f31205O;
    }

    /* renamed from: B */
    public SocketFactory m2463B() {
        return this.f31194D;
    }

    /* renamed from: C */
    public SSLSocketFactory m2462C() {
        return this.f31195E;
    }

    /* renamed from: D */
    public int m2461D() {
        return this.f31209S;
    }

    @Override // p565l.InterfaceC14138e.InterfaceC14139a
    /* renamed from: a */
    public InterfaceC14138e mo2460a(C14116a0 c14116a0) {
        return C14243z.m2412e(this, c14116a0, false);
    }

    /* renamed from: b */
    public InterfaceC14118b m2459b() {
        return this.f31200J;
    }

    /* renamed from: c */
    public C14124c m2458c() {
        return this.f31192B;
    }

    /* renamed from: d */
    public int m2457d() {
        return this.f31206P;
    }

    /* renamed from: e */
    public C14143g m2456e() {
        return this.f31198H;
    }

    /* renamed from: f */
    public int m2455f() {
        return this.f31207Q;
    }

    /* renamed from: g */
    public C14212j m2454g() {
        return this.f31201K;
    }

    /* renamed from: h */
    public List<C14214k> m2453h() {
        return this.f31214f;
    }

    /* renamed from: i */
    public InterfaceC14217m m2452i() {
        return this.f31191A;
    }

    /* renamed from: j */
    public C14219n m2451j() {
        return this.f31211c;
    }

    /* renamed from: k */
    public InterfaceC14220o m2450k() {
        return this.f31202L;
    }

    /* renamed from: l */
    public AbstractC14222p.InterfaceC14225c m2449l() {
        return this.f31217y;
    }

    /* renamed from: n */
    public boolean m2448n() {
        return this.f31204N;
    }

    /* renamed from: o */
    public boolean m2447o() {
        return this.f31203M;
    }

    /* renamed from: p */
    public HostnameVerifier m2446p() {
        return this.f31197G;
    }

    /* renamed from: q */
    public List<InterfaceC14233u> m2445q() {
        return this.f31215w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public InterfaceC14165f m2444r() {
        C14124c c14124c = this.f31192B;
        return c14124c != null ? c14124c.f30798c : this.f31193C;
    }

    /* renamed from: s */
    public List<InterfaceC14233u> m2443s() {
        return this.f31216x;
    }

    /* renamed from: u */
    public int m2441u() {
        return this.f31210T;
    }

    /* renamed from: v */
    public List<EnumC14242y> m2440v() {
        return this.f31213e;
    }

    /* renamed from: w */
    public Proxy m2439w() {
        return this.f31212d;
    }

    /* renamed from: x */
    public InterfaceC14118b m2438x() {
        return this.f31199I;
    }

    /* renamed from: y */
    public ProxySelector m2437y() {
        return this.f31218z;
    }

    /* renamed from: z */
    public int m2436z() {
        return this.f31208R;
    }

    C14239x(C14241b c14241b) {
        boolean z;
        this.f31211c = c14241b.f31221a;
        this.f31212d = c14241b.f31222b;
        this.f31213e = c14241b.f31223c;
        this.f31214f = c14241b.f31224d;
        this.f31215w = C14148c.m2788t(c14241b.f31225e);
        this.f31216x = C14148c.m2788t(c14241b.f31226f);
        this.f31217y = c14241b.f31227g;
        this.f31218z = c14241b.f31228h;
        this.f31191A = c14241b.f31229i;
        this.f31192B = c14241b.f31230j;
        this.f31193C = c14241b.f31231k;
        this.f31194D = c14241b.f31232l;
        loop0: while (true) {
            for (C14214k c14214k : this.f31214f) {
                z = z || c14214k.m2616d();
            }
        }
        if (c14241b.f31233m == null && z) {
            X509TrustManager m2815C = C14148c.m2815C();
            this.f31195E = m2442t(m2815C);
            this.f31196F = AbstractC14202c.m2642b(m2815C);
        } else {
            this.f31195E = c14241b.f31233m;
            this.f31196F = c14241b.f31234n;
        }
        if (this.f31195E != null) {
            C14198f.m2653j().mo2657f(this.f31195E);
        }
        this.f31197G = c14241b.f31235o;
        this.f31198H = c14241b.f31236p.m2820f(this.f31196F);
        this.f31199I = c14241b.f31237q;
        this.f31200J = c14241b.f31238r;
        this.f31201K = c14241b.f31239s;
        this.f31202L = c14241b.f31240t;
        this.f31203M = c14241b.f31241u;
        this.f31204N = c14241b.f31242v;
        this.f31205O = c14241b.f31243w;
        this.f31206P = c14241b.f31244x;
        this.f31207Q = c14241b.f31245y;
        this.f31208R = c14241b.f31246z;
        this.f31209S = c14241b.f31219A;
        this.f31210T = c14241b.f31220B;
        if (!this.f31215w.contains(null)) {
            if (this.f31216x.contains(null)) {
                throw new IllegalStateException("Null network interceptor: " + this.f31216x);
            }
            return;
        }
        throw new IllegalStateException("Null interceptor: " + this.f31215w);
    }
}
