package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10042r0;
import io.grpc.AbstractC9520g;
import io.grpc.EnumC9523g1;
import io.grpc.p384h1.AbstractC9541b;
import io.grpc.p384h1.C9610f2;
import io.grpc.p384h1.C9662h;
import io.grpc.p384h1.C9666h1;
import io.grpc.p384h1.C9730o2;
import io.grpc.p384h1.C9755r0;
import io.grpc.p384h1.InterfaceC9780t;
import io.grpc.p384h1.InterfaceC9798v;
import io.grpc.p385i1.p386r.C9944b;
import io.grpc.p385i1.p386r.C9950f;
import io.grpc.p385i1.p386r.EnumC9943a;
import io.grpc.p385i1.p386r.EnumC9960h;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: OkHttpChannelBuilder.java */
/* renamed from: io.grpc.i1.e */
/* loaded from: classes2.dex */
public final class C9908e extends AbstractC9541b<C9908e> {

    /* renamed from: p */
    static final C9944b f23271p;

    /* renamed from: q */
    private static final C9610f2.InterfaceC9614d<Executor> f23272q;

    /* renamed from: a */
    private final C9666h1 f23273a;

    /* renamed from: c */
    private Executor f23275c;

    /* renamed from: d */
    private ScheduledExecutorService f23276d;

    /* renamed from: e */
    private SocketFactory f23277e;

    /* renamed from: f */
    private SSLSocketFactory f23278f;

    /* renamed from: g */
    private HostnameVerifier f23279g;

    /* renamed from: m */
    private boolean f23285m;

    /* renamed from: b */
    private C9730o2.C9732b f23274b = C9730o2.m14116a();

    /* renamed from: h */
    private C9944b f23280h = f23271p;

    /* renamed from: i */
    private EnumC9911c f23281i = EnumC9911c.TLS;

    /* renamed from: j */
    private long f23282j = Long.MAX_VALUE;

    /* renamed from: k */
    private long f23283k = C9755r0.f22910j;

    /* renamed from: l */
    private int f23284l = 65535;

    /* renamed from: n */
    private int f23286n = 4194304;

    /* renamed from: o */
    private int f23287o = Integer.MAX_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$a */
    /* loaded from: classes2.dex */
    public class C9909a implements C9610f2.InterfaceC9614d<Executor> {
        C9909a() {
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: a */
        public void mo13721b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.p384h1.C9610f2.InterfaceC9614d
        /* renamed from: c */
        public Executor create() {
            return Executors.newCachedThreadPool(C9755r0.m14059i("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9910b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23288a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23289b;

        static {
            int[] iArr = new int[EnumC9911c.values().length];
            f23289b = iArr;
            try {
                iArr[EnumC9911c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23289b[EnumC9911c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC9907d.values().length];
            f23288a = iArr2;
            try {
                iArr2[EnumC9907d.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23288a[EnumC9907d.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$c */
    /* loaded from: classes2.dex */
    public enum EnumC9911c {
        TLS,
        PLAINTEXT
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$d */
    /* loaded from: classes2.dex */
    private final class C9912d implements C9666h1.InterfaceC9668b {
        private C9912d() {
        }

        @Override // io.grpc.p384h1.C9666h1.InterfaceC9668b
        /* renamed from: a */
        public int mo13719a() {
            return C9908e.this.m13723h();
        }

        /* synthetic */ C9912d(C9908e c9908e, C9909a c9909a) {
            this();
        }
    }

    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$e */
    /* loaded from: classes2.dex */
    private final class C9913e implements C9666h1.InterfaceC9669c {
        private C9913e() {
        }

        @Override // io.grpc.p384h1.C9666h1.InterfaceC9669c
        /* renamed from: a */
        public InterfaceC9780t mo13718a() {
            return C9908e.this.m13726e();
        }

        /* synthetic */ C9913e(C9908e c9908e, C9909a c9909a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpChannelBuilder.java */
    /* renamed from: io.grpc.i1.e$f */
    /* loaded from: classes2.dex */
    public static final class C9914f implements InterfaceC9780t {

        /* renamed from: A */
        private final int f23295A;

        /* renamed from: B */
        private final boolean f23296B;

        /* renamed from: C */
        private final C9662h f23297C;

        /* renamed from: D */
        private final long f23298D;

        /* renamed from: E */
        private final int f23299E;

        /* renamed from: F */
        private final boolean f23300F;

        /* renamed from: G */
        private final int f23301G;

        /* renamed from: H */
        private final ScheduledExecutorService f23302H;

        /* renamed from: I */
        private final boolean f23303I;

        /* renamed from: J */
        private boolean f23304J;

        /* renamed from: c */
        private final Executor f23305c;

        /* renamed from: d */
        private final boolean f23306d;

        /* renamed from: e */
        private final boolean f23307e;

        /* renamed from: f */
        private final C9730o2.C9732b f23308f;

        /* renamed from: w */
        private final SocketFactory f23309w;

        /* renamed from: x */
        private final SSLSocketFactory f23310x;

        /* renamed from: y */
        private final HostnameVerifier f23311y;

        /* renamed from: z */
        private final C9944b f23312z;

        /* compiled from: OkHttpChannelBuilder.java */
        /* renamed from: io.grpc.i1.e$f$a */
        /* loaded from: classes2.dex */
        class RunnableC9915a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9662h.C9664b f23313c;

            RunnableC9915a(C9914f c9914f, C9662h.C9664b c9664b) {
                this.f23313c = c9664b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23313c.m14227a();
            }
        }

        /* synthetic */ C9914f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C9944b c9944b, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C9730o2.C9732b c9732b, boolean z3, C9909a c9909a) {
            this(executor, scheduledExecutorService, socketFactory, sSLSocketFactory, hostnameVerifier, c9944b, i, z, j, j2, i2, z2, i3, c9732b, z3);
        }

        @Override // io.grpc.p384h1.InterfaceC9780t
        /* renamed from: S0 */
        public ScheduledExecutorService mo13717S0() {
            return this.f23302H;
        }

        @Override // io.grpc.p384h1.InterfaceC9780t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f23304J) {
                return;
            }
            this.f23304J = true;
            if (this.f23307e) {
                C9610f2.m14334f(C9755r0.f22915o, this.f23302H);
            }
            if (this.f23306d) {
                C9610f2.m14334f(C9908e.f23272q, this.f23305c);
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9780t
        /* renamed from: q0 */
        public InterfaceC9798v mo13716q0(SocketAddress socketAddress, InterfaceC9780t.C9781a c9781a, AbstractC9520g abstractC9520g) {
            if (!this.f23304J) {
                C9662h.C9664b m14228d = this.f23297C.m14228d();
                C9920h c9920h = new C9920h((InetSocketAddress) socketAddress, c9781a.m13994a(), c9781a.m13991d(), c9781a.m13993b(), this.f23305c, this.f23309w, this.f23310x, this.f23311y, this.f23312z, this.f23295A, this.f23299E, c9781a.m13992c(), new RunnableC9915a(this, m14228d), this.f23301G, this.f23308f.m14109a(), this.f23303I);
                if (this.f23296B) {
                    c9920h.m13646T(true, m14228d.m14226b(), this.f23298D, this.f23300F);
                }
                return c9920h;
            }
            throw new IllegalStateException("The transport factory is closed.");
        }

        private C9914f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C9944b c9944b, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, C9730o2.C9732b c9732b, boolean z3) {
            boolean z4 = scheduledExecutorService == null;
            this.f23307e = z4;
            this.f23302H = z4 ? (ScheduledExecutorService) C9610f2.m14336d(C9755r0.f22915o) : scheduledExecutorService;
            this.f23309w = socketFactory;
            this.f23310x = sSLSocketFactory;
            this.f23311y = hostnameVerifier;
            this.f23312z = c9944b;
            this.f23295A = i;
            this.f23296B = z;
            this.f23297C = new C9662h("keepalive time nanos", j);
            this.f23298D = j2;
            this.f23299E = i2;
            this.f23300F = z2;
            this.f23301G = i3;
            this.f23303I = z3;
            this.f23306d = executor == null;
            C5051n.m25779o(c9732b, "transportTracerFactory");
            this.f23308f = c9732b;
            if (this.f23306d) {
                this.f23305c = (Executor) C9610f2.m14336d(C9908e.f23272q);
            } else {
                this.f23305c = executor;
            }
        }
    }

    static {
        Logger.getLogger(C9908e.class.getName());
        C9944b.C9946b c9946b = new C9944b.C9946b(C9944b.f23550f);
        c9946b.m13515f(EnumC9943a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC9943a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC9943a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, EnumC9943a.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, EnumC9943a.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        c9946b.m13512i(EnumC9960h.TLS_1_2);
        c9946b.m13513h(true);
        f23271p = c9946b.m13516e();
        TimeUnit.DAYS.toNanos(1000L);
        f23272q = new C9909a();
        EnumSet.of(EnumC9523g1.MTLS, EnumC9523g1.CUSTOM_MANAGERS);
    }

    private C9908e(String str) {
        this.f23273a = new C9666h1(str, new C9913e(this, null), new C9912d(this, null));
    }

    /* renamed from: g */
    public static C9908e m13724g(String str) {
        return new C9908e(str);
    }

    @Override // io.grpc.p384h1.AbstractC9541b
    /* renamed from: c */
    protected AbstractC10042r0<?> mo13728c() {
        return this.f23273a;
    }

    /* renamed from: e */
    InterfaceC9780t m13726e() {
        return new C9914f(this.f23275c, this.f23276d, this.f23277e, m13725f(), this.f23279g, this.f23280h, this.f23286n, this.f23282j != Long.MAX_VALUE, this.f23282j, this.f23283k, this.f23284l, this.f23285m, this.f23287o, this.f23274b, false, null);
    }

    /* renamed from: f */
    SSLSocketFactory m13725f() {
        int i = C9910b.f23289b[this.f23281i.ordinal()];
        if (i != 1) {
            if (i == 2) {
                try {
                    if (this.f23278f == null) {
                        this.f23278f = SSLContext.getInstance("Default", C9950f.m13487e().m13485g()).getSocketFactory();
                    }
                    return this.f23278f;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            }
            throw new RuntimeException("Unknown negotiation type: " + this.f23281i);
        }
        return null;
    }

    /* renamed from: h */
    int m13723h() {
        int i = C9910b.f23289b[this.f23281i.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 443;
            }
            throw new AssertionError(this.f23281i + " not handled");
        }
        return 80;
    }
}
