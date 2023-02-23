package io.grpc.p385i1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import com.google.common.base.InterfaceC5058r;
import com.google.common.util.concurrent.C5164f;
import com.squareup.okhttp.internal.http.C7315a;
import io.grpc.AbstractC10001l;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9477a;
import io.grpc.C9481a0;
import io.grpc.C9484b0;
import io.grpc.C9493c0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.EnumC9482a1;
import io.grpc.StatusException;
import io.grpc.p384h1.AbstractC9805w0;
import io.grpc.p384h1.C9574c1;
import io.grpc.p384h1.C9610f2;
import io.grpc.p384h1.C9676i2;
import io.grpc.p384h1.C9730o2;
import io.grpc.p384h1.C9750q0;
import io.grpc.p384h1.C9755r0;
import io.grpc.p384h1.C9799v0;
import io.grpc.p384h1.ExecutorC9587d2;
import io.grpc.p384h1.InterfaceC9693k1;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p384h1.InterfaceC9773s;
import io.grpc.p384h1.InterfaceC9798v;
import io.grpc.p385i1.C9904b;
import io.grpc.p385i1.C9917g;
import io.grpc.p385i1.C9928i;
import io.grpc.p385i1.p386r.C9944b;
import io.grpc.p385i1.p386r.p387j.C9966d;
import io.grpc.p385i1.p386r.p387j.C9971g;
import io.grpc.p385i1.p386r.p387j.C9978i;
import io.grpc.p385i1.p386r.p387j.EnumC9962a;
import io.grpc.p385i1.p386r.p387j.EnumC9967e;
import io.grpc.p385i1.p386r.p387j.InterfaceC9963b;
import io.grpc.p385i1.p386r.p387j.InterfaceC9965c;
import io.grpc.p385i1.p386r.p387j.InterfaceC9979j;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p272h.p380h.p381a.C9451a;
import p272h.p380h.p381a.C9455c;
import p272h.p380h.p381a.C9459e;
import p425j.p443d.C11267c;
import p576m.C14342c;
import p576m.C14347f;
import p576m.C14353l;
import p576m.C14366t;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttpClientTransport.java */
/* renamed from: io.grpc.i1.h */
/* loaded from: classes2.dex */
public class C9920h implements InterfaceC9798v, C9904b.InterfaceC9905a {

    /* renamed from: X */
    private static final Map<EnumC9962a, C9497c1> f23341X = m13649Q();

    /* renamed from: Y */
    private static final Logger f23342Y = Logger.getLogger(C9920h.class.getName());

    /* renamed from: Z */
    private static final C9917g[] f23343Z = new C9917g[0];

    /* renamed from: A */
    private final SocketFactory f23344A;

    /* renamed from: B */
    private SSLSocketFactory f23345B;

    /* renamed from: C */
    private HostnameVerifier f23346C;

    /* renamed from: D */
    private Socket f23347D;

    /* renamed from: G */
    private final C9944b f23350G;

    /* renamed from: H */
    private InterfaceC9965c f23351H;

    /* renamed from: I */
    private ScheduledExecutorService f23352I;

    /* renamed from: J */
    private C9574c1 f23353J;

    /* renamed from: K */
    private boolean f23354K;

    /* renamed from: L */
    private long f23355L;

    /* renamed from: M */
    private long f23356M;

    /* renamed from: N */
    private boolean f23357N;

    /* renamed from: O */
    private final Runnable f23358O;

    /* renamed from: P */
    private final int f23359P;

    /* renamed from: Q */
    private final boolean f23360Q;

    /* renamed from: R */
    private final C9730o2 f23361R;

    /* renamed from: T */
    private C9493c0.C9495b f23363T;

    /* renamed from: U */
    final C9484b0 f23364U;

    /* renamed from: V */
    Runnable f23365V;

    /* renamed from: W */
    C5164f<Void> f23366W;

    /* renamed from: a */
    private final InetSocketAddress f23367a;

    /* renamed from: b */
    private final String f23368b;

    /* renamed from: c */
    private final String f23369c;

    /* renamed from: e */
    private final InterfaceC5058r<C5055p> f23371e;

    /* renamed from: f */
    private final int f23372f;

    /* renamed from: g */
    private InterfaceC9693k1.InterfaceC9694a f23373g;

    /* renamed from: h */
    private InterfaceC9963b f23374h;

    /* renamed from: i */
    private C9928i f23375i;

    /* renamed from: j */
    private C9904b f23376j;

    /* renamed from: k */
    private C9938p f23377k;

    /* renamed from: m */
    private final C9526h0 f23379m;

    /* renamed from: n */
    private int f23380n;

    /* renamed from: p */
    private final Executor f23382p;

    /* renamed from: q */
    private final ExecutorC9587d2 f23383q;

    /* renamed from: r */
    private final int f23384r;

    /* renamed from: s */
    private int f23385s;

    /* renamed from: t */
    private RunnableC9927f f23386t;

    /* renamed from: u */
    private C9477a f23387u;

    /* renamed from: v */
    private C9497c1 f23388v;

    /* renamed from: w */
    private boolean f23389w;

    /* renamed from: x */
    private C9799v0 f23390x;

    /* renamed from: y */
    private boolean f23391y;

    /* renamed from: z */
    private boolean f23392z;

    /* renamed from: d */
    private final Random f23370d = new Random();

    /* renamed from: l */
    private final Object f23378l = new Object();

    /* renamed from: o */
    private final Map<Integer, C9917g> f23381o = new HashMap();

    /* renamed from: E */
    private int f23348E = 0;

    /* renamed from: F */
    private final Deque<C9917g> f23349F = new LinkedList();

    /* renamed from: S */
    private final AbstractC9805w0<C9917g> f23362S = new C9921a();

    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$a */
    /* loaded from: classes2.dex */
    class C9921a extends AbstractC9805w0<C9917g> {
        C9921a() {
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: b */
        protected void mo13596b() {
            C9920h.this.f23373g.mo13869d(true);
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: c */
        protected void mo13595c() {
            C9920h.this.f23373g.mo13869d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$b */
    /* loaded from: classes2.dex */
    public class C9922b implements C9730o2.InterfaceC9733c {
        C9922b(C9920h c9920h) {
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$c */
    /* loaded from: classes2.dex */
    class RunnableC9923c implements Runnable {
        RunnableC9923c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = C9920h.this.f23365V;
            if (runnable != null) {
                runnable.run();
            }
            C9920h c9920h = C9920h.this;
            c9920h.f23386t = new RunnableC9927f(c9920h.f23374h, C9920h.this.f23375i);
            C9920h.this.f23382p.execute(C9920h.this.f23386t);
            synchronized (C9920h.this.f23378l) {
                C9920h.this.f23348E = Integer.MAX_VALUE;
                C9920h.this.m13613n0();
            }
            C9920h.this.f23366W.mo13350B(null);
            throw null;
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$d */
    /* loaded from: classes2.dex */
    class RunnableC9924d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f23395c;

        /* renamed from: d */
        final /* synthetic */ C9899a f23396d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC9979j f23397e;

        /* compiled from: OkHttpClientTransport.java */
        /* renamed from: io.grpc.i1.h$d$a */
        /* loaded from: classes2.dex */
        class C9925a implements InterfaceC14365s {
            C9925a(RunnableC9924d runnableC9924d) {
            }

            @Override // p576m.InterfaceC14365s
            /* renamed from: O0 */
            public long mo312O0(C14342c c14342c, long j) {
                return -1L;
            }

            @Override // p576m.InterfaceC14365s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // p576m.InterfaceC14365s
            public C14366t timeout() {
                return C14366t.f31663d;
            }
        }

        RunnableC9924d(CountDownLatch countDownLatch, C9899a c9899a, InterfaceC9979j interfaceC9979j) {
            this.f23395c = countDownLatch;
            this.f23396d = c9899a;
            this.f23397e = interfaceC9979j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9920h c9920h;
            RunnableC9927f runnableC9927f;
            Socket m13647S;
            try {
                this.f23395c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            InterfaceC14346e m2021d = C14353l.m2021d(new C9925a(this));
            SSLSession sSLSession = null;
            try {
                try {
                    if (C9920h.this.f23364U == null) {
                        m13647S = C9920h.this.f23344A.createSocket(C9920h.this.f23367a.getAddress(), C9920h.this.f23367a.getPort());
                    } else if (C9920h.this.f23364U.m14620b() instanceof InetSocketAddress) {
                        m13647S = C9920h.this.m13647S(C9920h.this.f23364U.m14619c(), (InetSocketAddress) C9920h.this.f23364U.m14620b(), C9920h.this.f23364U.m14618d(), C9920h.this.f23364U.m14621a());
                    } else {
                        C9497c1 c9497c1 = C9497c1.f22194m;
                        throw c9497c1.m14578r("Unsupported SocketAddress implementation " + C9920h.this.f23364U.m14620b().getClass()).m14593c();
                    }
                    Socket socket = m13647S;
                    SSLSocket sSLSocket = socket;
                    if (C9920h.this.f23345B != null) {
                        SSLSocket m13560b = C9935m.m13560b(C9920h.this.f23345B, C9920h.this.f23346C, socket, C9920h.this.m13642X(), C9920h.this.m13641Y(), C9920h.this.f23350G);
                        sSLSession = m13560b.getSession();
                        sSLSocket = m13560b;
                    }
                    sSLSocket.setTcpNoDelay(true);
                    InterfaceC14346e m2021d2 = C14353l.m2021d(C14353l.m2012m(sSLSocket));
                    this.f23396d.m13737P(C14353l.m2016i(sSLSocket), sSLSocket);
                    C9920h c9920h2 = C9920h.this;
                    C9477a.C9479b m14628d = C9920h.this.f23387u.m14628d();
                    m14628d.m14624d(C9481a0.f22164a, sSLSocket.getRemoteSocketAddress());
                    m14628d.m14624d(C9481a0.f22165b, sSLSocket.getLocalSocketAddress());
                    m14628d.m14624d(C9481a0.f22166c, sSLSession);
                    m14628d.m14624d(C9750q0.f22888a, sSLSession == null ? EnumC9482a1.NONE : EnumC9482a1.PRIVACY_AND_INTEGRITY);
                    c9920h2.f23387u = m14628d.m14627a();
                    C9920h c9920h3 = C9920h.this;
                    c9920h3.f23386t = new RunnableC9927f(c9920h3, this.f23397e.mo13380a(m2021d2, true));
                    synchronized (C9920h.this.f23378l) {
                        C9920h c9920h4 = C9920h.this;
                        C5051n.m25779o(sSLSocket, "socket");
                        c9920h4.f23347D = sSLSocket;
                        if (sSLSession != null) {
                            C9920h.this.f23363T = new C9493c0.C9495b(new C9493c0.C9496c(sSLSession));
                        }
                    }
                } catch (StatusException e) {
                    C9920h.this.m13615m0(0, EnumC9962a.INTERNAL_ERROR, e.m14635a());
                    c9920h = C9920h.this;
                    runnableC9927f = new RunnableC9927f(c9920h, this.f23397e.mo13380a(m2021d, true));
                    c9920h.f23386t = runnableC9927f;
                } catch (Exception e2) {
                    C9920h.this.mo13639a(e2);
                    c9920h = C9920h.this;
                    runnableC9927f = new RunnableC9927f(c9920h, this.f23397e.mo13380a(m2021d, true));
                    c9920h.f23386t = runnableC9927f;
                }
            } catch (Throwable th) {
                C9920h c9920h5 = C9920h.this;
                c9920h5.f23386t = new RunnableC9927f(c9920h5, this.f23397e.mo13380a(m2021d, true));
                throw th;
            }
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$e */
    /* loaded from: classes2.dex */
    class RunnableC9926e implements Runnable {
        RunnableC9926e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9920h.this.f23382p.execute(C9920h.this.f23386t);
            synchronized (C9920h.this.f23378l) {
                C9920h.this.f23348E = Integer.MAX_VALUE;
                C9920h.this.m13613n0();
            }
        }
    }

    /* compiled from: OkHttpClientTransport.java */
    /* renamed from: io.grpc.i1.h$f */
    /* loaded from: classes2.dex */
    class RunnableC9927f implements InterfaceC9963b.InterfaceC9964a, Runnable {

        /* renamed from: c */
        private final C9928i f23400c;

        /* renamed from: d */
        InterfaceC9963b f23401d;

        /* renamed from: e */
        boolean f23402e;

        RunnableC9927f(C9920h c9920h, InterfaceC9963b interfaceC9963b) {
            this(interfaceC9963b, new C9928i(Level.FINE, C9920h.class));
        }

        /* renamed from: b */
        private int m13594b(List<C9966d> list) {
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                C9966d c9966d = list.get(i);
                j += c9966d.f23633a.mo1969A() + 32 + c9966d.f23634b.mo1969A();
            }
            return (int) Math.min(j, 2147483647L);
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        /* renamed from: E */
        public void mo13467E(int i, EnumC9962a enumC9962a) {
            this.f23400c.m13586h(C9928i.EnumC9929a.INBOUND, i, enumC9962a);
            C9497c1 m14590f = C9920h.m13605r0(enumC9962a).m14590f("Rst Stream");
            boolean z = m14590f.m14582n() == C9497c1.EnumC9499b.CANCELLED || m14590f.m14582n() == C9497c1.EnumC9499b.DEADLINE_EXCEEDED;
            synchronized (C9920h.this.f23378l) {
                C9917g c9917g = (C9917g) C9920h.this.f23381o.get(Integer.valueOf(i));
                if (c9917g != null) {
                    C11267c.m11257c("OkHttpClientTransport$ClientFrameHandler.rstStream", c9917g.mo13687z().m13669f0());
                    C9920h.this.m13645U(i, m14590f, enumC9962a == EnumC9962a.REFUSED_STREAM ? InterfaceC9753r.EnumC9754a.REFUSED : InterfaceC9753r.EnumC9754a.PROCESSED, z, null, null);
                }
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        /* renamed from: F */
        public void mo13466F(int i, EnumC9962a enumC9962a, C14347f c14347f) {
            this.f23400c.m13591c(C9928i.EnumC9929a.INBOUND, i, enumC9962a, c14347f);
            if (enumC9962a == EnumC9962a.ENHANCE_YOUR_CALM) {
                String mo1965M = c14347f.mo1965M();
                C9920h.f23342Y.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, mo1965M));
                if ("too_many_pings".equals(mo1965M)) {
                    C9920h.this.f23358O.run();
                }
            }
            C9497c1 m14590f = C9755r0.EnumC9765i.m14038h(enumC9962a.f23627c).m14590f("Received Goaway");
            if (c14347f.mo1969A() > 0) {
                m14590f = m14590f.m14590f(c14347f.mo1965M());
            }
            C9920h.this.m13615m0(i, null, m14590f);
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        /* renamed from: G */
        public void mo13465G(boolean z, C9978i c9978i) {
            boolean z2;
            this.f23400c.m13585i(C9928i.EnumC9929a.INBOUND, c9978i);
            synchronized (C9920h.this.f23378l) {
                if (C9934l.m13563b(c9978i, 4)) {
                    C9920h.this.f23348E = C9934l.m13564a(c9978i, 4);
                }
                if (C9934l.m13563b(c9978i, 7)) {
                    z2 = C9920h.this.f23377k.m13549e(C9934l.m13564a(c9978i, 7));
                } else {
                    z2 = false;
                }
                if (this.f23402e) {
                    C9920h.this.f23373g.mo13871b();
                    this.f23402e = false;
                }
                C9920h.this.f23376j.mo13397p0(c9978i);
                if (z2) {
                    C9920h.this.f23377k.m13546h();
                }
                C9920h.this.m13613n0();
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        /* renamed from: H */
        public void mo13464H(boolean z, boolean z2, int i, int i2, List<C9966d> list, EnumC9967e enumC9967e) {
            C9497c1 c9497c1;
            int m13594b;
            this.f23400c.m13590d(C9928i.EnumC9929a.INBOUND, i, list, z2);
            boolean z3 = true;
            if (C9920h.this.f23359P == Integer.MAX_VALUE || (m13594b = m13594b(list)) <= C9920h.this.f23359P) {
                c9497c1 = null;
            } else {
                C9497c1 c9497c12 = C9497c1.f22193l;
                Object[] objArr = new Object[3];
                objArr[0] = z2 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(C9920h.this.f23359P);
                objArr[2] = Integer.valueOf(m13594b);
                c9497c1 = c9497c12.m14578r(String.format("Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (C9920h.this.f23378l) {
                C9917g c9917g = (C9917g) C9920h.this.f23381o.get(Integer.valueOf(i));
                if (c9917g == null) {
                    if (C9920h.this.m13630e0(i)) {
                        C9920h.this.f23376j.mo13405E(i, EnumC9962a.INVALID_STREAM);
                    }
                } else if (c9497c1 == null) {
                    C11267c.m11257c("OkHttpClientTransport$ClientFrameHandler.headers", c9917g.mo13687z().m13669f0());
                    c9917g.mo13687z().m13667h0(list, z2);
                } else {
                    if (!z2) {
                        C9920h.this.f23376j.mo13405E(i, EnumC9962a.CANCEL);
                    }
                    c9917g.mo13687z().m14505N(c9497c1, false, new C10049s0());
                }
                z3 = false;
            }
            if (z3) {
                C9920h c9920h = C9920h.this;
                EnumC9962a enumC9962a = EnumC9962a.PROTOCOL_ERROR;
                c9920h.m13625h0(enumC9962a, "Received header for unknown stream: " + i);
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        /* renamed from: a */
        public void mo13463a(boolean z, int i, InterfaceC14346e interfaceC14346e, int i2) throws IOException {
            this.f23400c.m13592b(C9928i.EnumC9929a.INBOUND, i, interfaceC14346e.mo1996R(), i2, z);
            C9917g m13638a0 = C9920h.this.m13638a0(i);
            if (m13638a0 == null) {
                if (C9920h.this.m13630e0(i)) {
                    synchronized (C9920h.this.f23378l) {
                        C9920h.this.f23376j.mo13405E(i, EnumC9962a.INVALID_STREAM);
                    }
                    interfaceC14346e.mo1994a(i2);
                } else {
                    C9920h.this.m13625h0(EnumC9962a.PROTOCOL_ERROR, "Received data for unknown stream: " + i);
                    return;
                }
            } else {
                long j = i2;
                interfaceC14346e.mo1978z(j);
                C14342c c14342c = new C14342c();
                c14342c.mo1444r0(interfaceC14346e.mo1996R(), j);
                C11267c.m11257c("OkHttpClientTransport$ClientFrameHandler.data", m13638a0.mo13687z().m13669f0());
                synchronized (C9920h.this.f23378l) {
                    m13638a0.mo13687z().m13668g0(c14342c, z);
                }
            }
            C9920h.m13664B(C9920h.this, i2);
            if (C9920h.this.f23385s >= C9920h.this.f23372f * 0.5f) {
                synchronized (C9920h.this.f23378l) {
                    C9920h.this.f23376j.windowUpdate(0, C9920h.this.f23385s);
                }
                C9920h.this.f23385s = 0;
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        public void ackSettings() {
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        public void ping(boolean z, int i, int i2) {
            C9799v0 c9799v0;
            long j = (i << 32) | (i2 & 4294967295L);
            this.f23400c.m13589e(C9928i.EnumC9929a.INBOUND, j);
            if (!z) {
                synchronized (C9920h.this.f23378l) {
                    C9920h.this.f23376j.ping(true, i, i2);
                }
                return;
            }
            synchronized (C9920h.this.f23378l) {
                c9799v0 = null;
                if (C9920h.this.f23390x != null) {
                    if (C9920h.this.f23390x.m13953h() == j) {
                        C9799v0 c9799v02 = C9920h.this.f23390x;
                        C9920h.this.f23390x = null;
                        c9799v0 = c9799v02;
                    } else {
                        C9920h.f23342Y.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(C9920h.this.f23390x.m13953h()), Long.valueOf(j)));
                    }
                } else {
                    C9920h.f23342Y.warning("Received unexpected ping ack. No ping outstanding");
                }
            }
            if (c9799v0 != null) {
                c9799v0.m13957d();
            }
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        public void pushPromise(int i, int i2, List<C9966d> list) throws IOException {
            this.f23400c.m13587g(C9928i.EnumC9929a.INBOUND, i, i2, list);
            synchronized (C9920h.this.f23378l) {
                C9920h.this.f23376j.mo13405E(i, EnumC9962a.PROTOCOL_ERROR);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C9497c1 c9497c1;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f23401d.mo13412S(this)) {
                try {
                    if (C9920h.this.f23353J != null) {
                        C9920h.this.f23353J.m14411l();
                    }
                } catch (Throwable th) {
                    try {
                        C9920h.this.m13615m0(0, EnumC9962a.PROTOCOL_ERROR, C9497c1.f22194m.m14578r("error in frame handler").m14579q(th));
                        try {
                            this.f23401d.close();
                        } catch (IOException e) {
                            e = e;
                            C9920h.f23342Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            C9920h.this.f23373g.mo13870c();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f23401d.close();
                        } catch (IOException e2) {
                            C9920h.f23342Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e2);
                        }
                        C9920h.this.f23373g.mo13870c();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (C9920h.this.f23378l) {
                c9497c1 = C9920h.this.f23388v;
            }
            if (c9497c1 == null) {
                c9497c1 = C9497c1.f22195n.m14578r("End of stream or IOException");
            }
            C9920h.this.m13615m0(0, EnumC9962a.INTERNAL_ERROR, c9497c1);
            try {
                this.f23401d.close();
            } catch (IOException e3) {
                e = e3;
                C9920h.f23342Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                C9920h.this.f23373g.mo13870c();
                Thread.currentThread().setName(name);
            }
            C9920h.this.f23373g.mo13870c();
            Thread.currentThread().setName(name);
        }

        @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9963b.InterfaceC9964a
        public void windowUpdate(int i, long j) {
            this.f23400c.m13583k(C9928i.EnumC9929a.INBOUND, i, j);
            if (j == 0) {
                if (i == 0) {
                    C9920h.this.m13625h0(EnumC9962a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    C9920h.this.m13645U(i, C9497c1.f22194m.m14578r("Received 0 flow control window increment."), InterfaceC9753r.EnumC9754a.PROCESSED, false, EnumC9962a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            boolean z = false;
            synchronized (C9920h.this.f23378l) {
                if (i == 0) {
                    C9920h.this.f23377k.m13547g(null, (int) j);
                    return;
                }
                C9917g c9917g = (C9917g) C9920h.this.f23381o.get(Integer.valueOf(i));
                if (c9917g != null) {
                    C9920h.this.f23377k.m13547g(c9917g, (int) j);
                } else if (!C9920h.this.m13630e0(i)) {
                    z = true;
                }
                if (z) {
                    C9920h c9920h = C9920h.this;
                    EnumC9962a enumC9962a = EnumC9962a.PROTOCOL_ERROR;
                    c9920h.m13625h0(enumC9962a, "Received window_update for unknown stream: " + i);
                }
            }
        }

        RunnableC9927f(InterfaceC9963b interfaceC9963b, C9928i c9928i) {
            this.f23402e = true;
            this.f23401d = interfaceC9963b;
            this.f23400c = c9928i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9920h(InetSocketAddress inetSocketAddress, String str, String str2, C9477a c9477a, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C9944b c9944b, int i, int i2, C9484b0 c9484b0, Runnable runnable, int i3, C9730o2 c9730o2, boolean z) {
        C5051n.m25779o(inetSocketAddress, "address");
        this.f23367a = inetSocketAddress;
        this.f23368b = str;
        this.f23384r = i;
        this.f23372f = i2;
        C5051n.m25779o(executor, "executor");
        this.f23382p = executor;
        this.f23383q = new ExecutorC9587d2(executor);
        this.f23380n = 3;
        this.f23344A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f23345B = sSLSocketFactory;
        this.f23346C = hostnameVerifier;
        C5051n.m25779o(c9944b, "connectionSpec");
        this.f23350G = c9944b;
        this.f23371e = C9755r0.f22916p;
        this.f23369c = C9755r0.m14061g("okhttp", str2);
        this.f23364U = c9484b0;
        C5051n.m25779o(runnable, "tooManyPingsRunnable");
        this.f23358O = runnable;
        this.f23359P = i3;
        C5051n.m25780n(c9730o2);
        this.f23361R = c9730o2;
        this.f23379m = C9526h0.m14527a(C9920h.class, inetSocketAddress.toString());
        C9477a.C9479b m14629c = C9477a.m14629c();
        m14629c.m14624d(C9750q0.f22889b, c9477a);
        this.f23387u = m14629c.m14627a();
        this.f23360Q = z;
        m13636b0();
    }

    /* renamed from: B */
    static /* synthetic */ int m13664B(C9920h c9920h, int i) {
        int i2 = c9920h.f23385s + i;
        c9920h.f23385s = i2;
        return i2;
    }

    /* renamed from: Q */
    private static Map<EnumC9962a, C9497c1> m13649Q() {
        EnumMap enumMap = new EnumMap(EnumC9962a.class);
        enumMap.put((EnumMap) EnumC9962a.NO_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) EnumC9962a.PROTOCOL_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("Protocol error"));
        enumMap.put((EnumMap) EnumC9962a.INTERNAL_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("Internal error"));
        enumMap.put((EnumMap) EnumC9962a.FLOW_CONTROL_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("Flow control error"));
        enumMap.put((EnumMap) EnumC9962a.STREAM_CLOSED, (EnumC9962a) C9497c1.f22194m.m14578r("Stream closed"));
        enumMap.put((EnumMap) EnumC9962a.FRAME_TOO_LARGE, (EnumC9962a) C9497c1.f22194m.m14578r("Frame too large"));
        enumMap.put((EnumMap) EnumC9962a.REFUSED_STREAM, (EnumC9962a) C9497c1.f22195n.m14578r("Refused stream"));
        enumMap.put((EnumMap) EnumC9962a.CANCEL, (EnumC9962a) C9497c1.f22188g.m14578r("Cancelled"));
        enumMap.put((EnumMap) EnumC9962a.COMPRESSION_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("Compression error"));
        enumMap.put((EnumMap) EnumC9962a.CONNECT_ERROR, (EnumC9962a) C9497c1.f22194m.m14578r("Connect error"));
        enumMap.put((EnumMap) EnumC9962a.ENHANCE_YOUR_CALM, (EnumC9962a) C9497c1.f22193l.m14578r("Enhance your calm"));
        enumMap.put((EnumMap) EnumC9962a.INADEQUATE_SECURITY, (EnumC9962a) C9497c1.f22191j.m14578r("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: R */
    private C9459e m13648R(InetSocketAddress inetSocketAddress, String str, String str2) {
        C9455c.C9457b c9457b = new C9455c.C9457b();
        c9457b.m14673k("https");
        c9457b.m14676h(inetSocketAddress.getHostName());
        c9457b.m14674j(inetSocketAddress.getPort());
        C9455c m14683a = c9457b.m14683a();
        C9459e.C9461b c9461b = new C9459e.C9461b();
        c9461b.m14663h(m14683a);
        c9461b.m14664g("Host", m14683a.m14691c() + ":" + m14683a.m14684j());
        c9461b.m14664g("User-Agent", this.f23369c);
        if (str != null && str2 != null) {
            c9461b.m14664g("Proxy-Authorization", C9451a.m14703a(str, str2));
        }
        return c9461b.m14665f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public Socket m13647S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        Socket createSocket;
        try {
            if (inetSocketAddress2.getAddress() != null) {
                createSocket = this.f23344A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = this.f23344A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            createSocket.setTcpNoDelay(true);
            InterfaceC14365s m2012m = C14353l.m2012m(createSocket);
            InterfaceC14345d m2022c = C14353l.m2022c(C14353l.m2016i(createSocket));
            C9459e m13648R = m13648R(inetSocketAddress, str, str2);
            C9455c m14671b = m13648R.m14671b();
            m2022c.mo2003r(String.format("CONNECT %s:%d HTTP/1.1", m14671b.m14691c(), Integer.valueOf(m14671b.m14684j()))).mo2003r("\r\n");
            int m14701b = m13648R.m14672a().m14701b();
            for (int i = 0; i < m14701b; i++) {
                m2022c.mo2003r(m13648R.m14672a().m14702a(i)).mo2003r(": ").mo2003r(m13648R.m14672a().m14700c(i)).mo2003r("\r\n");
            }
            m2022c.mo2003r("\r\n");
            m2022c.flush();
            C7315a m19009a = C7315a.m19009a(m13623i0(m2012m));
            while (!m13623i0(m2012m).equals("")) {
            }
            if (m19009a.f17290b < 200 || m19009a.f17290b >= 300) {
                C14342c c14342c = new C14342c();
                try {
                    createSocket.shutdownOutput();
                    m2012m.mo312O0(c14342c, 1024L);
                } catch (IOException e) {
                    c14342c.m2050h1("Unable to read body: " + e.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                throw C9497c1.f22195n.m14578r(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(m19009a.f17290b), m19009a.f17291c, c14342c.m2044x0())).m14593c();
            }
            return createSocket;
        } catch (IOException e2) {
            throw C9497c1.f22195n.m14578r("Failed trying to connect with proxy").m14579q(e2).m14593c();
        }
    }

    /* renamed from: Z */
    private Throwable m13640Z() {
        synchronized (this.f23378l) {
            if (this.f23388v != null) {
                return this.f23388v.m14593c();
            }
            return C9497c1.f22195n.m14578r("Connection closed").m14593c();
        }
    }

    /* renamed from: b0 */
    private void m13636b0() {
        synchronized (this.f23378l) {
            this.f23361R.m14110g(new C9922b(this));
        }
    }

    /* renamed from: c0 */
    private boolean m13634c0() {
        return this.f23367a == null;
    }

    /* renamed from: f0 */
    private void m13629f0(C9917g c9917g) {
        if (this.f23392z && this.f23349F.isEmpty() && this.f23381o.isEmpty()) {
            this.f23392z = false;
            C9574c1 c9574c1 = this.f23353J;
            if (c9574c1 != null) {
                c9574c1.m14409n();
            }
        }
        if (c9917g.m14519y()) {
            this.f23362S.m13948e(c9917g, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m13625h0(EnumC9962a enumC9962a, String str) {
        m13615m0(0, enumC9962a, m13605r0(enumC9962a).m14590f(str));
    }

    /* renamed from: i0 */
    private static String m13623i0(InterfaceC14365s interfaceC14365s) throws IOException {
        C14342c c14342c = new C14342c();
        while (interfaceC14365s.mo312O0(c14342c, 1L) != -1) {
            if (c14342c.m2066P(c14342c.m2072F0() - 1) == 10) {
                return c14342c.mo1982u();
            }
        }
        throw new EOFException("\\n not found: " + c14342c.m2046o0().mo1959p());
    }

    /* renamed from: l0 */
    private void m13617l0(C9917g c9917g) {
        if (!this.f23392z) {
            this.f23392z = true;
            C9574c1 c9574c1 = this.f23353J;
            if (c9574c1 != null) {
                c9574c1.m14410m();
            }
        }
        if (c9917g.m14519y()) {
            this.f23362S.m13948e(c9917g, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m13615m0(int i, EnumC9962a enumC9962a, C9497c1 c9497c1) {
        synchronized (this.f23378l) {
            if (this.f23388v == null) {
                this.f23388v = c9497c1;
                this.f23373g.mo13872a(c9497c1);
            }
            if (enumC9962a != null && !this.f23389w) {
                this.f23389w = true;
                this.f23376j.mo13401a1(0, enumC9962a, new byte[0]);
            }
            Iterator<Map.Entry<Integer, C9917g>> it = this.f23381o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, C9917g> next = it.next();
                if (next.getKey().intValue() > i) {
                    it.remove();
                    next.getValue().mo13687z().m14506M(c9497c1, InterfaceC9753r.EnumC9754a.REFUSED, false, new C10049s0());
                    m13629f0(next.getValue());
                }
            }
            for (C9917g c9917g : this.f23349F) {
                c9917g.mo13687z().m14506M(c9497c1, InterfaceC9753r.EnumC9754a.REFUSED, true, new C10049s0());
                m13629f0(c9917g);
            }
            this.f23349F.clear();
            m13609p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public boolean m13613n0() {
        boolean z = false;
        while (!this.f23349F.isEmpty() && this.f23381o.size() < this.f23348E) {
            m13611o0(this.f23349F.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: o0 */
    private void m13611o0(C9917g c9917g) {
        C5051n.m25773u(c9917g.m13695Q() == -1, "StreamId already assigned");
        this.f23381o.put(Integer.valueOf(this.f23380n), c9917g);
        m13617l0(c9917g);
        c9917g.mo13687z().m13672d0(this.f23380n);
        if ((c9917g.m13696P() != C10060t0.EnumC10064d.UNARY && c9917g.m13696P() != C10060t0.EnumC10064d.SERVER_STREAMING) || c9917g.m13692T()) {
            this.f23376j.flush();
        }
        int i = this.f23380n;
        if (i >= 2147483645) {
            this.f23380n = Integer.MAX_VALUE;
            m13615m0(Integer.MAX_VALUE, EnumC9962a.NO_ERROR, C9497c1.f22195n.m14578r("Stream ids exhausted"));
            return;
        }
        this.f23380n = i + 2;
    }

    /* renamed from: p0 */
    private void m13609p0() {
        if (this.f23388v == null || !this.f23381o.isEmpty() || !this.f23349F.isEmpty() || this.f23391y) {
            return;
        }
        this.f23391y = true;
        C9574c1 c9574c1 = this.f23353J;
        if (c9574c1 != null) {
            c9574c1.m14407p();
            this.f23352I = (ScheduledExecutorService) C9610f2.m14334f(C9755r0.f22915o, this.f23352I);
        }
        C9799v0 c9799v0 = this.f23390x;
        if (c9799v0 != null) {
            c9799v0.m13955f(m13640Z());
            this.f23390x = null;
        }
        if (!this.f23389w) {
            this.f23389w = true;
            this.f23376j.mo13401a1(0, EnumC9962a.NO_ERROR, new byte[0]);
        }
        this.f23376j.close();
    }

    /* renamed from: r0 */
    static C9497c1 m13605r0(EnumC9962a enumC9962a) {
        C9497c1 c9497c1 = f23341X.get(enumC9962a);
        if (c9497c1 != null) {
            return c9497c1;
        }
        C9497c1 c9497c12 = C9497c1.f22189h;
        return c9497c12.m14578r("Unknown http2 error code: " + enumC9962a.f23627c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m13646T(boolean z, long j, long j2, boolean z2) {
        this.f23354K = z;
        this.f23355L = j;
        this.f23356M = j2;
        this.f23357N = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m13645U(int i, C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, boolean z, EnumC9962a enumC9962a, C10049s0 c10049s0) {
        synchronized (this.f23378l) {
            C9917g remove = this.f23381o.remove(Integer.valueOf(i));
            if (remove != null) {
                if (enumC9962a != null) {
                    this.f23376j.mo13405E(i, EnumC9962a.CANCEL);
                }
                if (c9497c1 != null) {
                    C9917g.C9919b mo13687z = remove.mo13687z();
                    if (c10049s0 == null) {
                        c10049s0 = new C10049s0();
                    }
                    mo13687z.m14506M(c9497c1, enumC9754a, z, c10049s0);
                }
                if (!m13613n0()) {
                    m13609p0();
                    m13629f0(remove);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public C9917g[] m13644V() {
        C9917g[] c9917gArr;
        synchronized (this.f23378l) {
            c9917gArr = (C9917g[]) this.f23381o.values().toArray(f23343Z);
        }
        return c9917gArr;
    }

    /* renamed from: W */
    public C9477a m13643W() {
        return this.f23387u;
    }

    /* renamed from: X */
    String m13642X() {
        URI m14066b = C9755r0.m14066b(this.f23368b);
        if (m14066b.getHost() != null) {
            return m14066b.getHost();
        }
        return this.f23368b;
    }

    /* renamed from: Y */
    int m13641Y() {
        URI m14066b = C9755r0.m14066b(this.f23368b);
        if (m14066b.getPort() != -1) {
            return m14066b.getPort();
        }
        return this.f23367a.getPort();
    }

    @Override // io.grpc.p385i1.C9904b.InterfaceC9905a
    /* renamed from: a */
    public void mo13639a(Throwable th) {
        C5051n.m25779o(th, "failureCause");
        m13615m0(0, EnumC9962a.INTERNAL_ERROR, C9497c1.f22195n.m14579q(th));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C9917g m13638a0(int i) {
        C9917g c9917g;
        synchronized (this.f23378l) {
            c9917g = this.f23381o.get(Integer.valueOf(i));
        }
        return c9917g;
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: c */
    public void mo13635c(C9497c1 c9497c1) {
        synchronized (this.f23378l) {
            if (this.f23388v != null) {
                return;
            }
            this.f23388v = c9497c1;
            this.f23373g.mo13872a(c9497c1);
            m13609p0();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: d */
    public void mo13633d(C9497c1 c9497c1) {
        mo13635c(c9497c1);
        synchronized (this.f23378l) {
            Iterator<Map.Entry<Integer, C9917g>> it = this.f23381o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, C9917g> next = it.next();
                it.remove();
                next.getValue().mo13687z().m14505N(c9497c1, false, new C10049s0());
                m13629f0(next.getValue());
            }
            for (C9917g c9917g : this.f23349F) {
                c9917g.mo13687z().m14505N(c9497c1, true, new C10049s0());
                m13629f0(c9917g);
            }
            this.f23349F.clear();
            m13609p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public boolean m13632d0() {
        return this.f23345B == null;
    }

    @Override // io.grpc.p384h1.InterfaceC9693k1
    /* renamed from: e */
    public Runnable mo13631e(InterfaceC9693k1.InterfaceC9694a interfaceC9694a) {
        C5051n.m25779o(interfaceC9694a, "listener");
        this.f23373g = interfaceC9694a;
        if (this.f23354K) {
            this.f23352I = (ScheduledExecutorService) C9610f2.m14336d(C9755r0.f22915o);
            C9574c1 c9574c1 = new C9574c1(new C9574c1.C9577c(this), this.f23352I, this.f23355L, this.f23356M, this.f23357N);
            this.f23353J = c9574c1;
            c9574c1.m14408o();
        }
        if (m13634c0()) {
            synchronized (this.f23378l) {
                C9904b c9904b = new C9904b(this, this.f23351H, this.f23375i);
                this.f23376j = c9904b;
                this.f23377k = new C9938p(this, c9904b);
            }
            this.f23383q.execute(new RunnableC9923c());
            return null;
        }
        C9899a m13736V = C9899a.m13736V(this.f23383q, this);
        C9971g c9971g = new C9971g();
        InterfaceC9965c mo13379b = c9971g.mo13379b(C14353l.m2022c(m13736V), true);
        synchronized (this.f23378l) {
            C9904b c9904b2 = new C9904b(this, mo13379b);
            this.f23376j = c9904b2;
            this.f23377k = new C9938p(this, c9904b2);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f23383q.execute(new RunnableC9924d(countDownLatch, m13736V, c9971g));
        try {
            m13619k0();
            countDownLatch.countDown();
            this.f23383q.execute(new RunnableC9926e());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* renamed from: e0 */
    boolean m13630e0(int i) {
        boolean z;
        synchronized (this.f23378l) {
            z = true;
            if (i >= this.f23380n || (i & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return this.f23379m;
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: g */
    public void mo13628g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
        long nextLong;
        C9799v0 c9799v0;
        synchronized (this.f23378l) {
            boolean z = true;
            C5051n.m25774t(this.f23376j != null);
            if (this.f23391y) {
                C9799v0.m13954g(interfaceC9774a, executor, m13640Z());
                return;
            }
            if (this.f23390x != null) {
                c9799v0 = this.f23390x;
                nextLong = 0;
                z = false;
            } else {
                nextLong = this.f23370d.nextLong();
                C5055p c5055p = this.f23371e.get();
                c5055p.m25760g();
                C9799v0 c9799v02 = new C9799v0(nextLong, c5055p);
                this.f23390x = c9799v02;
                this.f23361R.m14115b();
                c9799v0 = c9799v02;
            }
            if (z) {
                this.f23376j.ping(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            c9799v0.m13960a(interfaceC9774a, executor);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9773s
    /* renamed from: g0 */
    public C9917g mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
        C5051n.m25779o(c10060t0, "method");
        C5051n.m25779o(c10049s0, "headers");
        C9676i2 m14212h = C9676i2.m14212h(abstractC10001lArr, m13643W(), c10049s0);
        synchronized (this.f23378l) {
            try {
                try {
                    return new C9917g(c10060t0, c10049s0, this.f23376j, this, this.f23377k, this.f23378l, this.f23384r, this.f23372f, this.f23368b, this.f23369c, m14212h, this.f23361R, c9502d, this.f23360Q);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void m13621j0(C9917g c9917g) {
        this.f23349F.remove(c9917g);
        m13629f0(c9917g);
    }

    /* renamed from: k0 */
    void m13619k0() {
        synchronized (this.f23378l) {
            this.f23376j.connectionPreface();
            C9978i c9978i = new C9978i();
            C9934l.m13562c(c9978i, 7, this.f23372f);
            this.f23376j.mo13396t0(c9978i);
            if (this.f23372f > 65535) {
                this.f23376j.windowUpdate(0, this.f23372f - 65535);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m13607q0(C9917g c9917g) {
        if (this.f23388v != null) {
            c9917g.mo13687z().m14506M(this.f23388v, InterfaceC9753r.EnumC9754a.REFUSED, true, new C10049s0());
        } else if (this.f23381o.size() >= this.f23348E) {
            this.f23349F.add(c9917g);
            m13617l0(c9917g);
        } else {
            m13611o0(c9917g);
        }
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25809c("logId", this.f23379m.m14524d());
        m25812c.m25808d("address", this.f23367a);
        return m25812c.toString();
    }
}
