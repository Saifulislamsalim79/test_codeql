package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import com.google.common.base.InterfaceC5058r;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC10020n0;
import io.grpc.AbstractC10040q0;
import io.grpc.AbstractC10069u0;
import io.grpc.AbstractC10092z;
import io.grpc.AbstractC9483b;
import io.grpc.AbstractC9508e;
import io.grpc.AbstractC9509e0;
import io.grpc.AbstractC9517f;
import io.grpc.AbstractC9520g;
import io.grpc.AbstractC9524h;
import io.grpc.C10036p;
import io.grpc.C10041r;
import io.grpc.C10043s;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C10082w;
import io.grpc.C10084w0;
import io.grpc.C10090y;
import io.grpc.C9477a;
import io.grpc.C9493c0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9504d0;
import io.grpc.C9526h0;
import io.grpc.C9985k;
import io.grpc.EnumC10039q;
import io.grpc.ExecutorC9513e1;
import io.grpc.InterfaceC10094z0;
import io.grpc.InterfaceC9522g0;
import io.grpc.InterfaceC9896i;
import io.grpc.p384h1.AbstractC9857z1;
import io.grpc.p384h1.C9677j;
import io.grpc.p384h1.C9685j1;
import io.grpc.p384h1.C9710m;
import io.grpc.p384h1.C9734p;
import io.grpc.p384h1.C9814y0;
import io.grpc.p384h1.InterfaceC9690k;
import io.grpc.p384h1.InterfaceC9693k1;
import java.lang.Thread;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedChannelImpl.java */
/* renamed from: io.grpc.h1.g1 */
/* loaded from: classes2.dex */
public final class C9623g1 extends AbstractC10040q0 implements InterfaceC9522g0<Object> {

    /* renamed from: j0 */
    static final Logger f22521j0 = Logger.getLogger(C9623g1.class.getName());

    /* renamed from: k0 */
    static final Pattern f22522k0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: l0 */
    static final C9497c1 f22523l0 = C9497c1.f22195n.m14578r("Channel shutdownNow invoked");

    /* renamed from: m0 */
    static final C9497c1 f22524m0 = C9497c1.f22195n.m14578r("Channel shutdown invoked");

    /* renamed from: n0 */
    static final C9497c1 f22525n0 = C9497c1.f22195n.m14578r("Subchannel shutdown invoked");

    /* renamed from: o0 */
    private static final C9685j1 f22526o0 = C9685j1.m14189a();

    /* renamed from: p0 */
    private static final AbstractC9509e0 f22527p0 = new C9624a();

    /* renamed from: q0 */
    private static final AbstractC9524h<Object, Object> f22528q0 = new C9630g();

    /* renamed from: A */
    private C9641o f22529A;

    /* renamed from: B */
    private volatile AbstractC10020n0.AbstractC10031i f22530B;

    /* renamed from: C */
    private boolean f22531C;

    /* renamed from: E */
    private Collection<C9647q.C9652e<?, ?>> f22533E;

    /* renamed from: H */
    private final C9532a0 f22536H;

    /* renamed from: K */
    private boolean f22539K;

    /* renamed from: L */
    private boolean f22540L;

    /* renamed from: M */
    private volatile boolean f22541M;

    /* renamed from: O */
    private final C9710m.InterfaceC9711a f22543O;

    /* renamed from: P */
    private final C9710m f22544P;

    /* renamed from: Q */
    private final C9725o f22545Q;

    /* renamed from: R */
    private final AbstractC9520g f22546R;

    /* renamed from: S */
    private final C9493c0 f22547S;

    /* renamed from: T */
    private final C9647q f22548T;

    /* renamed from: V */
    private C9685j1 f22550V;

    /* renamed from: W */
    private final C9685j1 f22551W;

    /* renamed from: X */
    private boolean f22552X;

    /* renamed from: Y */
    private final boolean f22553Y;

    /* renamed from: a */
    private final C9526h0 f22555a;

    /* renamed from: a0 */
    private final long f22556a0;

    /* renamed from: b */
    private final String f22557b;

    /* renamed from: b0 */
    private final long f22558b0;

    /* renamed from: c */
    private final String f22559c;

    /* renamed from: c0 */
    private final boolean f22560c0;

    /* renamed from: d */
    private final AbstractC10069u0.AbstractC10074d f22561d;

    /* renamed from: e */
    private final AbstractC10069u0.C10071b f22563e;

    /* renamed from: f */
    private final C9677j f22565f;

    /* renamed from: f0 */
    private ExecutorC9513e1.C9516c f22566f0;

    /* renamed from: g */
    private final InterfaceC9780t f22567g;

    /* renamed from: g0 */
    private InterfaceC9690k f22568g0;

    /* renamed from: h */
    private final ScheduledExecutorServiceC9656s f22569h;

    /* renamed from: i */
    private final Executor f22571i;

    /* renamed from: i0 */
    private final C9834y1 f22572i0;

    /* renamed from: j */
    private final InterfaceC9747p1<? extends Executor> f22573j;

    /* renamed from: k */
    private final C9638l f22574k;

    /* renamed from: l */
    private final C9638l f22575l;

    /* renamed from: m */
    private final InterfaceC9708l2 f22576m;

    /* renamed from: n */
    private final int f22577n;

    /* renamed from: p */
    private boolean f22579p;

    /* renamed from: q */
    private final C10082w f22580q;

    /* renamed from: r */
    private final C10036p f22581r;

    /* renamed from: s */
    private final InterfaceC5058r<C5055p> f22582s;

    /* renamed from: t */
    private final long f22583t;

    /* renamed from: v */
    private final InterfaceC9690k.InterfaceC9691a f22585v;

    /* renamed from: w */
    private final AbstractC9508e f22586w;

    /* renamed from: x */
    private final String f22587x;

    /* renamed from: y */
    private AbstractC10069u0 f22588y;

    /* renamed from: z */
    private boolean f22589z;

    /* renamed from: o */
    final ExecutorC9513e1 f22578o = new ExecutorC9513e1(new C9627d());

    /* renamed from: u */
    private final C9803w f22584u = new C9803w();

    /* renamed from: D */
    private final Set<C9814y0> f22532D = new HashSet(16, 0.75f);

    /* renamed from: F */
    private final Object f22534F = new Object();

    /* renamed from: G */
    private final Set<C9751q1> f22535G = new HashSet(1, 0.75f);

    /* renamed from: I */
    private final C9660u f22537I = new C9660u(this, null);

    /* renamed from: J */
    private final AtomicBoolean f22538J = new AtomicBoolean(false);

    /* renamed from: N */
    private final CountDownLatch f22542N = new CountDownLatch(1);

    /* renamed from: U */
    private EnumC9655r f22549U = EnumC9655r.NO_RESOLUTION;

    /* renamed from: Z */
    private final AbstractC9857z1.C9888t f22554Z = new AbstractC9857z1.C9888t();

    /* renamed from: d0 */
    private final InterfaceC9693k1.InterfaceC9694a f22562d0 = new C9637k(this, null);

    /* renamed from: e0 */
    final AbstractC9805w0<Object> f22564e0 = new C9639m(this, null);

    /* renamed from: h0 */
    private final C9734p.InterfaceC9743e f22570h0 = new C9631h(this, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$a */
    /* loaded from: classes2.dex */
    public class C9624a extends AbstractC9509e0 {
        C9624a() {
        }

        @Override // io.grpc.AbstractC9509e0
        /* renamed from: a */
        public AbstractC9509e0.C9511b mo14180a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$b */
    /* loaded from: classes2.dex */
    final class C9625b implements C9710m.InterfaceC9711a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9708l2 f22590a;

        C9625b(C9623g1 c9623g1, InterfaceC9708l2 interfaceC9708l2) {
            this.f22590a = interfaceC9708l2;
        }

        @Override // io.grpc.p384h1.C9710m.InterfaceC9711a
        public C9710m create() {
            return new C9710m(this.f22590a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$c */
    /* loaded from: classes2.dex */
    public final class C9626c extends AbstractC10020n0.AbstractC10031i {

        /* renamed from: a */
        private final AbstractC10020n0.C10026e f22591a;

        /* renamed from: b */
        final /* synthetic */ Throwable f22592b;

        C9626c(C9623g1 c9623g1, Throwable th) {
            this.f22592b = th;
            this.f22591a = AbstractC10020n0.C10026e.m13284e(C9497c1.f22194m.m14578r("Panic! This is a bug!").m14579q(this.f22592b));
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10031i
        /* renamed from: a */
        public AbstractC10020n0.C10026e mo13260a(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            return this.f22591a;
        }

        public String toString() {
            C5042j.C5044b m25813b = C5042j.m25813b(C9626c.class);
            m25813b.m25808d("panicPickResult", this.f22591a);
            return m25813b.toString();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$d */
    /* loaded from: classes2.dex */
    class C9627d implements Thread.UncaughtExceptionHandler {
        C9627d() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = C9623g1.f22521j0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + C9623g1.this.mo13324f() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C9623g1.this.m14328A0(th);
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$e */
    /* loaded from: classes2.dex */
    class ExecutorC9628e implements Executor {
        ExecutorC9628e() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C9623g1.this.f22575l.m14249a().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$f */
    /* loaded from: classes2.dex */
    public class C9629f extends AbstractC9721n0 {

        /* renamed from: b */
        final /* synthetic */ String f22595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9629f(AbstractC10069u0 abstractC10069u0, String str) {
            super(abstractC10069u0);
            this.f22595b = str;
        }

        @Override // io.grpc.AbstractC10069u0
        /* renamed from: a */
        public String mo13141a() {
            return this.f22595b;
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$g */
    /* loaded from: classes2.dex */
    class C9630g extends AbstractC9524h<Object, Object> {
        C9630g() {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: a */
        public void mo13081a(String str, Throwable th) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: b */
        public void mo13080b() {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: c */
        public void mo13079c(int i) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: d */
        public void mo13076d(Object obj) {
        }

        @Override // io.grpc.AbstractC9524h
        /* renamed from: e */
        public void mo13075e(AbstractC9524h.AbstractC9525a<Object> abstractC9525a, C10049s0 c10049s0) {
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$h */
    /* loaded from: classes2.dex */
    private final class C9631h implements C9734p.InterfaceC9743e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$h$a */
        /* loaded from: classes2.dex */
        public final class RunnableC9632a implements Runnable {
            RunnableC9632a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9623g1.this.m14264u0();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$h$b */
        /* loaded from: classes2.dex */
        final class C9633b<ReqT> extends AbstractC9857z1<ReqT> {

            /* renamed from: B */
            final /* synthetic */ C10060t0 f22598B;

            /* renamed from: C */
            final /* synthetic */ C9502d f22599C;

            /* renamed from: D */
            final /* synthetic */ C10043s f22600D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9633b(C10060t0 c10060t0, C10049s0 c10049s0, C9502d c9502d, C9540a2 c9540a2, C9782t0 c9782t0, AbstractC9857z1.C9871c0 c9871c0, C10043s c10043s) {
                super(c10060t0, c10049s0, C9623g1.this.f22554Z, C9623g1.this.f22556a0, C9623g1.this.f22558b0, C9623g1.this.m14262v0(c9502d), C9623g1.this.f22567g.mo13717S0(), c9540a2, c9782t0, c9871c0);
                this.f22598B = c10060t0;
                this.f22599C = c9502d;
                this.f22600D = c10043s;
            }

            @Override // io.grpc.p384h1.AbstractC9857z1
            /* renamed from: f0 */
            InterfaceC9749q mo13793f0(C10049s0 c10049s0, AbstractC10001l.AbstractC10002a abstractC10002a, int i, boolean z) {
                C9502d m14550q = this.f22599C.m14550q(abstractC10002a);
                AbstractC10001l[] m14062f = C9755r0.m14062f(m14550q, c10049s0, i, z);
                InterfaceC9773s m14252c = C9631h.this.m14252c(new C9783t1(this.f22598B, c10049s0, m14550q));
                C10043s m13232g = this.f22600D.m13232g();
                try {
                    return m14252c.mo13637b(this.f22598B, c10049s0, m14550q, m14062f);
                } finally {
                    this.f22600D.m13236J(m13232g);
                }
            }

            @Override // io.grpc.p384h1.AbstractC9857z1
            /* renamed from: g0 */
            void mo13791g0() {
                C9623g1.this.f22537I.m14233c(this);
            }

            @Override // io.grpc.p384h1.AbstractC9857z1
            /* renamed from: h0 */
            C9497c1 mo13789h0() {
                return C9623g1.this.f22537I.m14235a(this);
            }
        }

        private C9631h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public InterfaceC9773s m14252c(AbstractC10020n0.AbstractC10027f abstractC10027f) {
            AbstractC10020n0.AbstractC10031i abstractC10031i = C9623g1.this.f22530B;
            if (C9623g1.this.f22538J.get()) {
                return C9623g1.this.f22536H;
            }
            if (abstractC10031i == null) {
                C9623g1.this.f22578o.execute(new RunnableC9632a());
                return C9623g1.this.f22536H;
            }
            InterfaceC9773s m14058j = C9755r0.m14058j(abstractC10031i.mo13260a(abstractC10027f), abstractC10027f.mo13279a().m14557j());
            return m14058j != null ? m14058j : C9623g1.this.f22536H;
        }

        @Override // io.grpc.p384h1.C9734p.InterfaceC9743e
        /* renamed from: a */
        public InterfaceC9749q mo14074a(C10060t0<?, ?> c10060t0, C9502d c9502d, C10049s0 c10049s0, C10043s c10043s) {
            if (C9623g1.this.f22560c0) {
                AbstractC9857z1.C9871c0 m14183g = C9623g1.this.f22550V.m14183g();
                C9685j1.C9687b c9687b = (C9685j1.C9687b) c9502d.m14559h(C9685j1.C9687b.f22742g);
                return new C9633b(c10060t0, c10049s0, c9502d, c9687b == null ? null : c9687b.f22747e, c9687b == null ? null : c9687b.f22748f, m14183g, c10043s);
            }
            InterfaceC9773s m14252c = m14252c(new C9783t1(c10060t0, c10049s0, c9502d));
            C10043s m13232g = c10043s.m13232g();
            try {
                return m14252c.mo13637b(c10060t0, c10049s0, c9502d, C9755r0.m14062f(c9502d, c10049s0, 0, false));
            } finally {
                c10043s.m13236J(m13232g);
            }
        }

        /* synthetic */ C9631h(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$i */
    /* loaded from: classes2.dex */
    public static final class C9634i<ReqT, RespT> extends AbstractC10092z<ReqT, RespT> {

        /* renamed from: a */
        private final AbstractC9509e0 f22602a;

        /* renamed from: b */
        private final AbstractC9508e f22603b;

        /* renamed from: c */
        private final Executor f22604c;

        /* renamed from: d */
        private final C10060t0<ReqT, RespT> f22605d;

        /* renamed from: e */
        private final C10043s f22606e;

        /* renamed from: f */
        private C9502d f22607f;

        /* renamed from: g */
        private AbstractC9524h<ReqT, RespT> f22608g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$i$a */
        /* loaded from: classes2.dex */
        public class C9635a extends AbstractRunnableC9810x {

            /* renamed from: d */
            final /* synthetic */ AbstractC9524h.AbstractC9525a f22609d;

            /* renamed from: e */
            final /* synthetic */ C9497c1 f22610e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9635a(C9634i c9634i, AbstractC9524h.AbstractC9525a abstractC9525a, C9497c1 c9497c1) {
                super(c9634i.f22606e);
                this.f22609d = abstractC9525a;
                this.f22610e = c9497c1;
            }

            @Override // io.grpc.p384h1.AbstractRunnableC9810x
            /* renamed from: a */
            public void mo13845a() {
                this.f22609d.mo13343a(this.f22610e, new C10049s0());
            }
        }

        C9634i(AbstractC9509e0 abstractC9509e0, AbstractC9508e abstractC9508e, Executor executor, C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
            this.f22602a = abstractC9509e0;
            this.f22603b = abstractC9508e;
            this.f22605d = c10060t0;
            executor = c9502d.m14562e() != null ? c9502d.m14562e() : executor;
            this.f22604c = executor;
            this.f22607f = c9502d.m14554m(executor);
            this.f22606e = C10043s.m13237I();
        }

        /* renamed from: h */
        private void m14250h(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C9497c1 c9497c1) {
            this.f22604c.execute(new C9635a(this, abstractC9525a, c9497c1));
        }

        @Override // io.grpc.AbstractC10089x0, io.grpc.AbstractC9524h
        /* renamed from: a */
        public void mo13081a(String str, Throwable th) {
            AbstractC9524h<ReqT, RespT> abstractC9524h = this.f22608g;
            if (abstractC9524h != null) {
                abstractC9524h.mo13081a(str, th);
            }
        }

        @Override // io.grpc.AbstractC10092z, io.grpc.AbstractC9524h
        /* renamed from: e */
        public void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
            AbstractC9509e0.C9511b mo14180a = this.f22602a.mo14180a(new C9783t1(this.f22605d, c10049s0, this.f22607f));
            C9497c1 m14538c = mo14180a.m14538c();
            if (!m14538c.m14580p()) {
                m14250h(abstractC9525a, m14538c);
                this.f22608g = C9623g1.f22528q0;
                return;
            }
            InterfaceC9896i m14539b = mo14180a.m14539b();
            C9685j1.C9687b m14184f = ((C9685j1) mo14180a.m14540a()).m14184f(this.f22605d);
            if (m14184f != null) {
                this.f22607f = this.f22607f.m14551p(C9685j1.C9687b.f22742g, m14184f);
            }
            if (m14539b != null) {
                this.f22608g = m14539b.mo13338a(this.f22605d, this.f22607f, this.f22603b);
            } else {
                this.f22608g = this.f22603b.mo13365h(this.f22605d, this.f22607f);
            }
            this.f22608g.mo13075e(abstractC9525a, c10049s0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.AbstractC10089x0
        /* renamed from: f */
        public AbstractC9524h<ReqT, RespT> mo13074f() {
            return this.f22608g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$j */
    /* loaded from: classes2.dex */
    public class RunnableC9636j implements Runnable {
        RunnableC9636j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9623g1.this.f22566f0 = null;
            C9623g1.this.m14324C0();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$k */
    /* loaded from: classes2.dex */
    private final class C9637k implements InterfaceC9693k1.InterfaceC9694a {
        private C9637k() {
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: a */
        public void mo13872a(C9497c1 c9497c1) {
            C5051n.m25773u(C9623g1.this.f22538J.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: b */
        public void mo13871b() {
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: c */
        public void mo13870c() {
            C5051n.m25773u(C9623g1.this.f22538J.get(), "Channel must have been shut down");
            C9623g1.this.f22540L = true;
            C9623g1.this.m14320E0(false);
            C9623g1.this.m14256y0();
            C9623g1.this.m14254z0();
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: d */
        public void mo13869d(boolean z) {
            C9623g1 c9623g1 = C9623g1.this;
            c9623g1.f22564e0.m13948e(c9623g1.f22536H, z);
        }

        /* synthetic */ C9637k(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$l */
    /* loaded from: classes2.dex */
    public static final class C9638l {

        /* renamed from: a */
        private final InterfaceC9747p1<? extends Executor> f22613a;

        /* renamed from: b */
        private Executor f22614b;

        C9638l(InterfaceC9747p1<? extends Executor> interfaceC9747p1) {
            C5051n.m25779o(interfaceC9747p1, "executorPool");
            this.f22613a = interfaceC9747p1;
        }

        /* renamed from: a */
        synchronized Executor m14249a() {
            if (this.f22614b == null) {
                Executor mo14070a = this.f22613a.mo14070a();
                C5051n.m25778p(mo14070a, "%s.getObject()", this.f22614b);
                this.f22614b = mo14070a;
            }
            return this.f22614b;
        }

        /* renamed from: b */
        synchronized void m14248b() {
            if (this.f22614b != null) {
                this.f22614b = this.f22613a.mo14069b(this.f22614b);
            }
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$m */
    /* loaded from: classes2.dex */
    private final class C9639m extends AbstractC9805w0<Object> {
        private C9639m() {
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: b */
        protected void mo13596b() {
            C9623g1.this.m14264u0();
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: c */
        protected void mo13595c() {
            if (C9623g1.this.f22538J.get()) {
                return;
            }
            C9623g1.this.m14322D0();
        }

        /* synthetic */ C9639m(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$n */
    /* loaded from: classes2.dex */
    private class RunnableC9640n implements Runnable {
        private RunnableC9640n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9623g1.this.m14266t0();
        }

        /* synthetic */ RunnableC9640n(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$o */
    /* loaded from: classes2.dex */
    public final class C9641o extends AbstractC10020n0.AbstractC10025d {

        /* renamed from: a */
        C9677j.C9679b f22617a;

        /* renamed from: b */
        boolean f22618b;

        /* renamed from: c */
        boolean f22619c;

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$o$a */
        /* loaded from: classes2.dex */
        final class RunnableC9642a implements Runnable {
            RunnableC9642a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9623g1.this.m14326B0();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$o$b */
        /* loaded from: classes2.dex */
        final class RunnableC9643b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AbstractC10020n0.AbstractC10031i f22622c;

            /* renamed from: d */
            final /* synthetic */ EnumC10039q f22623d;

            RunnableC9643b(AbstractC10020n0.AbstractC10031i abstractC10031i, EnumC10039q enumC10039q) {
                this.f22622c = abstractC10031i;
                this.f22623d = enumC10039q;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9641o c9641o = C9641o.this;
                if (c9641o != C9623g1.this.f22529A) {
                    return;
                }
                C9623g1.this.m14318F0(this.f22622c);
                if (this.f22623d != EnumC10039q.SHUTDOWN) {
                    C9623g1.this.f22546R.mo13867b(AbstractC9520g.EnumC9521a.INFO, "Entering {0} state with picker: {1}", this.f22623d, this.f22622c);
                    C9623g1.this.f22584u.m13952a(this.f22623d);
                }
            }
        }

        private C9641o() {
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10025d
        /* renamed from: b */
        public AbstractC9520g mo13292b() {
            return C9623g1.this.f22546R;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10025d
        /* renamed from: c */
        public ExecutorC9513e1 mo13291c() {
            return C9623g1.this.f22578o;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10025d
        /* renamed from: d */
        public void mo13290d() {
            C9623g1.this.f22578o.m14531d();
            this.f22618b = true;
            C9623g1.this.f22578o.execute(new RunnableC9642a());
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10025d
        /* renamed from: e */
        public void mo13289e(EnumC10039q enumC10039q, AbstractC10020n0.AbstractC10031i abstractC10031i) {
            C9623g1.this.f22578o.m14531d();
            C5051n.m25779o(enumC10039q, "newState");
            C5051n.m25779o(abstractC10031i, "newPicker");
            C9623g1.this.f22578o.execute(new RunnableC9643b(abstractC10031i, enumC10039q));
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10025d
        /* renamed from: f */
        public AbstractC9592e mo13293a(AbstractC10020n0.C10022b c10022b) {
            C9623g1.this.f22578o.m14531d();
            C5051n.m25773u(!C9623g1.this.f22540L, "Channel is being terminated");
            return new C9657t(c10022b, this);
        }

        /* synthetic */ C9641o(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$p */
    /* loaded from: classes2.dex */
    public final class C9644p extends AbstractC10069u0.AbstractC10075e {

        /* renamed from: a */
        final C9641o f22625a;

        /* renamed from: b */
        final AbstractC10069u0 f22626b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$p$a */
        /* loaded from: classes2.dex */
        public final class RunnableC9645a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f22628c;

            RunnableC9645a(C9497c1 c9497c1) {
                this.f22628c = c9497c1;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9644p.this.m14245e(this.f22628c);
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$p$b */
        /* loaded from: classes2.dex */
        final class RunnableC9646b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AbstractC10069u0.C10077g f22630c;

            RunnableC9646b(AbstractC10069u0.C10077g c10077g) {
                this.f22630c = c10077g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9685j1 c9685j1;
                List<C10090y> m13115a = this.f22630c.m13115a();
                C9623g1.this.f22546R.mo13867b(AbstractC9520g.EnumC9521a.DEBUG, "Resolved address: {0}, config={1}", m13115a, this.f22630c.m13114b());
                if (C9623g1.this.f22549U != EnumC9655r.SUCCESS) {
                    C9623g1.this.f22546R.mo13867b(AbstractC9520g.EnumC9521a.INFO, "Address resolved: {0}", m13115a);
                    C9623g1.this.f22549U = EnumC9655r.SUCCESS;
                }
                C9623g1.this.f22568g0 = null;
                AbstractC10069u0.C10073c m13113c = this.f22630c.m13113c();
                AbstractC9509e0 abstractC9509e0 = (AbstractC9509e0) this.f22630c.m13114b().m14630b(AbstractC9509e0.f22251a);
                C9685j1 c9685j12 = (m13113c == null || m13113c.m13120c() == null) ? null : (C9685j1) m13113c.m13120c();
                C9497c1 m13119d = m13113c != null ? m13113c.m13119d() : null;
                if (!C9623g1.this.f22553Y) {
                    if (c9685j12 != null) {
                        C9623g1.this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    c9685j1 = C9623g1.this.f22551W == null ? C9623g1.f22526o0 : C9623g1.this.f22551W;
                    if (abstractC9509e0 != null) {
                        C9623g1.this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C9623g1.this.f22548T.m14238n(c9685j1.m14187c());
                } else {
                    if (c9685j12 != null) {
                        if (abstractC9509e0 != null) {
                            C9623g1.this.f22548T.m14238n(abstractC9509e0);
                            if (c9685j12.m14187c() != null) {
                                C9623g1.this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.DEBUG, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C9623g1.this.f22548T.m14238n(c9685j12.m14187c());
                        }
                    } else if (C9623g1.this.f22551W != null) {
                        c9685j12 = C9623g1.this.f22551W;
                        C9623g1.this.f22548T.m14238n(c9685j12.m14187c());
                        C9623g1.this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Received no service config, using default service config");
                    } else if (m13119d != null) {
                        if (!C9623g1.this.f22552X) {
                            C9623g1.this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Fallback to error due to invalid first service config without default config");
                            C9644p.this.mo13117a(m13113c.m13119d());
                            return;
                        }
                        c9685j12 = C9623g1.this.f22550V;
                    } else {
                        c9685j12 = C9623g1.f22526o0;
                        C9623g1.this.f22548T.m14238n(null);
                    }
                    if (!c9685j12.equals(C9623g1.this.f22550V)) {
                        AbstractC9520g abstractC9520g = C9623g1.this.f22546R;
                        AbstractC9520g.EnumC9521a enumC9521a = AbstractC9520g.EnumC9521a.INFO;
                        Object[] objArr = new Object[1];
                        objArr[0] = c9685j12 == C9623g1.f22526o0 ? " to empty" : "";
                        abstractC9520g.mo13867b(enumC9521a, "Service config changed{0}", objArr);
                        C9623g1.this.f22550V = c9685j12;
                    }
                    try {
                        C9623g1.this.f22552X = true;
                    } catch (RuntimeException e) {
                        Logger logger = C9623g1.f22521j0;
                        Level level = Level.WARNING;
                        logger.log(level, "[" + C9623g1.this.mo13324f() + "] Unexpected exception from parsing service config", (Throwable) e);
                    }
                    c9685j1 = c9685j12;
                }
                C9477a m13114b = this.f22630c.m13114b();
                C9644p c9644p = C9644p.this;
                if (c9644p.f22625a == C9623g1.this.f22529A) {
                    C9477a.C9479b m14628d = m13114b.m14628d();
                    m14628d.m14625c(AbstractC9509e0.f22251a);
                    Map<String, ?> m14186d = c9685j1.m14186d();
                    if (m14186d != null) {
                        m14628d.m14624d(AbstractC10020n0.f23742a, m14186d);
                        m14628d.m14627a();
                    }
                    C9677j.C9679b c9679b = C9644p.this.f22625a.f22617a;
                    AbstractC10020n0.C10028g.C10029a m13273d = AbstractC10020n0.C10028g.m13273d();
                    m13273d.m13271b(m13115a);
                    m13273d.m13270c(m14628d.m14627a());
                    m13273d.m13269d(c9685j1.m14185e());
                    C9497c1 m14197d = c9679b.m14197d(m13273d.m13272a());
                    if (m14197d.m14580p()) {
                        return;
                    }
                    C9644p c9644p2 = C9644p.this;
                    c9644p2.m14245e(m14197d.m14590f(C9644p.this.f22626b + " was used"));
                }
            }
        }

        C9644p(C9641o c9641o, AbstractC10069u0 abstractC10069u0) {
            C5051n.m25779o(c9641o, "helperImpl");
            this.f22625a = c9641o;
            C5051n.m25779o(abstractC10069u0, "resolver");
            this.f22626b = abstractC10069u0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m14245e(C9497c1 c9497c1) {
            C9623g1.f22521j0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C9623g1.this.mo13324f(), c9497c1});
            C9623g1.this.f22548T.m14239m();
            if (C9623g1.this.f22549U != EnumC9655r.ERROR) {
                C9623g1.this.f22546R.mo13867b(AbstractC9520g.EnumC9521a.WARNING, "Failed to resolve name: {0}", c9497c1);
                C9623g1.this.f22549U = EnumC9655r.ERROR;
            }
            if (this.f22625a != C9623g1.this.f22529A) {
                return;
            }
            this.f22625a.f22617a.m14199b(c9497c1);
            m14244f();
        }

        /* renamed from: f */
        private void m14244f() {
            if (C9623g1.this.f22566f0 == null || !C9623g1.this.f22566f0.m14529b()) {
                if (C9623g1.this.f22568g0 == null) {
                    C9623g1 c9623g1 = C9623g1.this;
                    c9623g1.f22568g0 = c9623g1.f22585v.get();
                }
                long mo14179a = C9623g1.this.f22568g0.mo14179a();
                C9623g1.this.f22546R.mo13867b(AbstractC9520g.EnumC9521a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(mo14179a));
                C9623g1 c9623g12 = C9623g1.this;
                c9623g12.f22566f0 = c9623g12.f22578o.m14532c(new RunnableC9636j(), mo14179a, TimeUnit.NANOSECONDS, C9623g1.this.f22567g.mo13717S0());
            }
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10075e, io.grpc.AbstractC10069u0.InterfaceC10076f
        /* renamed from: a */
        public void mo13117a(C9497c1 c9497c1) {
            C5051n.m25789e(!c9497c1.m14580p(), "the error status must not be OK");
            C9623g1.this.f22578o.execute(new RunnableC9645a(c9497c1));
        }

        @Override // io.grpc.AbstractC10069u0.AbstractC10075e
        /* renamed from: c */
        public void mo13118c(AbstractC10069u0.C10077g c10077g) {
            C9623g1.this.f22578o.execute(new RunnableC9646b(c10077g));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$q */
    /* loaded from: classes2.dex */
    public class C9647q extends AbstractC9508e {

        /* renamed from: a */
        private final AtomicReference<AbstractC9509e0> f22632a;

        /* renamed from: b */
        private final String f22633b;

        /* renamed from: c */
        private final AbstractC9508e f22634c;

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$q$a */
        /* loaded from: classes2.dex */
        class C9648a extends AbstractC9508e {
            C9648a() {
            }

            @Override // io.grpc.AbstractC9508e
            /* renamed from: a */
            public String mo13366a() {
                return C9647q.this.f22633b;
            }

            @Override // io.grpc.AbstractC9508e
            /* renamed from: h */
            public <RequestT, ResponseT> AbstractC9524h<RequestT, ResponseT> mo13365h(C10060t0<RequestT, ResponseT> c10060t0, C9502d c9502d) {
                C9734p c9734p = new C9734p(c10060t0, C9623g1.this.m14262v0(c9502d), c9502d, C9623g1.this.f22570h0, C9623g1.this.f22541M ? null : C9623g1.this.f22567g.mo13717S0(), C9623g1.this.f22544P, null);
                c9734p.m14107B(C9623g1.this.f22579p);
                c9734p.m14108A(C9623g1.this.f22580q);
                c9734p.m14084z(C9623g1.this.f22581r);
                return c9734p;
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$q$b */
        /* loaded from: classes2.dex */
        class RunnableC9649b implements Runnable {
            RunnableC9649b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9623g1.this.m14264u0();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$q$c */
        /* loaded from: classes2.dex */
        class C9650c extends AbstractC9524h<ReqT, RespT> {
            C9650c(C9647q c9647q) {
            }

            @Override // io.grpc.AbstractC9524h
            /* renamed from: a */
            public void mo13081a(String str, Throwable th) {
            }

            @Override // io.grpc.AbstractC9524h
            /* renamed from: b */
            public void mo13080b() {
            }

            @Override // io.grpc.AbstractC9524h
            /* renamed from: c */
            public void mo13079c(int i) {
            }

            @Override // io.grpc.AbstractC9524h
            /* renamed from: d */
            public void mo13076d(ReqT reqt) {
            }

            @Override // io.grpc.AbstractC9524h
            /* renamed from: e */
            public void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
                abstractC9525a.mo13343a(C9623g1.f22524m0, new C10049s0());
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$q$d */
        /* loaded from: classes2.dex */
        class RunnableC9651d implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9652e f22638c;

            RunnableC9651d(C9652e c9652e) {
                this.f22638c = c9652e;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C9647q.this.f22632a.get() == C9623g1.f22527p0) {
                    if (C9623g1.this.f22533E == null) {
                        C9623g1.this.f22533E = new LinkedHashSet();
                        C9623g1 c9623g1 = C9623g1.this;
                        c9623g1.f22564e0.m13948e(c9623g1.f22534F, true);
                    }
                    C9623g1.this.f22533E.add(this.f22638c);
                    return;
                }
                this.f22638c.m14237p();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$q$e */
        /* loaded from: classes2.dex */
        public final class C9652e<ReqT, RespT> extends C9838z<ReqT, RespT> {

            /* renamed from: l */
            final C10043s f22640l;

            /* renamed from: m */
            final C10060t0<ReqT, RespT> f22641m;

            /* renamed from: n */
            final C9502d f22642n;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ManagedChannelImpl.java */
            /* renamed from: io.grpc.h1.g1$q$e$a */
            /* loaded from: classes2.dex */
            public class RunnableC9653a implements Runnable {
                RunnableC9653a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    C10043s m13232g = C9652e.this.f22640l.m13232g();
                    try {
                        AbstractC9524h<ReqT, RespT> m14240l = C9647q.this.m14240l(C9652e.this.f22641m, C9652e.this.f22642n);
                        C9652e.this.f22640l.m13236J(m13232g);
                        C9652e.this.m13847n(m14240l);
                        C9652e c9652e = C9652e.this;
                        C9623g1.this.f22578o.execute(new RunnableC9654b());
                    } catch (Throwable th) {
                        C9652e.this.f22640l.m13236J(m13232g);
                        throw th;
                    }
                }
            }

            /* compiled from: ManagedChannelImpl.java */
            /* renamed from: io.grpc.h1.g1$q$e$b */
            /* loaded from: classes2.dex */
            final class RunnableC9654b implements Runnable {
                RunnableC9654b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C9623g1.this.f22533E != null) {
                        C9623g1.this.f22533E.remove(C9652e.this);
                        if (C9623g1.this.f22533E.isEmpty()) {
                            C9623g1 c9623g1 = C9623g1.this;
                            c9623g1.f22564e0.m13948e(c9623g1.f22534F, false);
                            C9623g1.this.f22533E = null;
                            if (C9623g1.this.f22538J.get()) {
                                C9623g1.this.f22537I.m14234b(C9623g1.f22524m0);
                            }
                        }
                    }
                }
            }

            C9652e(C10043s c10043s, C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
                super(C9623g1.this.m14262v0(c9502d), C9623g1.this.f22569h, c9502d.m14563d());
                this.f22640l = c10043s;
                this.f22641m = c10060t0;
                this.f22642n = c9502d;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.grpc.p384h1.C9838z
            /* renamed from: i */
            public void mo13852i() {
                super.mo13852i();
                C9623g1.this.f22578o.execute(new RunnableC9654b());
            }

            /* renamed from: p */
            void m14237p() {
                C9623g1.this.m14262v0(this.f22642n).execute(new RunnableC9653a());
            }
        }

        /* synthetic */ C9647q(C9623g1 c9623g1, String str, C9624a c9624a) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public <ReqT, RespT> AbstractC9524h<ReqT, RespT> m14240l(C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
            AbstractC9509e0 abstractC9509e0 = this.f22632a.get();
            if (abstractC9509e0 == null) {
                return this.f22634c.mo13365h(c10060t0, c9502d);
            }
            if (abstractC9509e0 instanceof C9685j1.C9688c) {
                C9685j1.C9687b m14184f = ((C9685j1.C9688c) abstractC9509e0).f22749b.m14184f(c10060t0);
                if (m14184f != null) {
                    c9502d = c9502d.m14551p(C9685j1.C9687b.f22742g, m14184f);
                }
                return this.f22634c.mo13365h(c10060t0, c9502d);
            }
            return new C9634i(abstractC9509e0, this.f22634c, C9623g1.this.f22571i, c10060t0, c9502d);
        }

        @Override // io.grpc.AbstractC9508e
        /* renamed from: a */
        public String mo13366a() {
            return this.f22633b;
        }

        @Override // io.grpc.AbstractC9508e
        /* renamed from: h */
        public <ReqT, RespT> AbstractC9524h<ReqT, RespT> mo13365h(C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
            if (this.f22632a.get() != C9623g1.f22527p0) {
                return m14240l(c10060t0, c9502d);
            }
            C9623g1.this.f22578o.execute(new RunnableC9649b());
            if (this.f22632a.get() == C9623g1.f22527p0) {
                if (C9623g1.this.f22538J.get()) {
                    return new C9650c(this);
                }
                C9652e c9652e = new C9652e(C10043s.m13237I(), c10060t0, c9502d);
                C9623g1.this.f22578o.execute(new RunnableC9651d(c9652e));
                return c9652e;
            }
            return m14240l(c10060t0, c9502d);
        }

        /* renamed from: m */
        void m14239m() {
            if (this.f22632a.get() == C9623g1.f22527p0) {
                m14238n(null);
            }
        }

        /* renamed from: n */
        void m14238n(AbstractC9509e0 abstractC9509e0) {
            AbstractC9509e0 abstractC9509e02 = this.f22632a.get();
            this.f22632a.set(abstractC9509e0);
            if (abstractC9509e02 != C9623g1.f22527p0 || C9623g1.this.f22533E == null) {
                return;
            }
            for (C9652e c9652e : C9623g1.this.f22533E) {
                c9652e.m14237p();
            }
        }

        private C9647q(String str) {
            this.f22632a = new AtomicReference<>(C9623g1.f22527p0);
            this.f22634c = new C9648a();
            C5051n.m25779o(str, "authority");
            this.f22633b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$r */
    /* loaded from: classes2.dex */
    public enum EnumC9655r {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$s */
    /* loaded from: classes2.dex */
    private static final class ScheduledExecutorServiceC9656s implements ScheduledExecutorService {

        /* renamed from: c */
        final ScheduledExecutorService f22650c;

        /* synthetic */ ScheduledExecutorServiceC9656s(ScheduledExecutorService scheduledExecutorService, C9624a c9624a) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f22650c.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f22650c.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f22650c.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
            return (T) this.f22650c.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f22650c.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f22650c.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f22650c.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f22650c.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f22650c.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f22650c.submit(callable);
        }

        private ScheduledExecutorServiceC9656s(ScheduledExecutorService scheduledExecutorService) {
            C5051n.m25779o(scheduledExecutorService, "delegate");
            this.f22650c = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f22650c.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (T) this.f22650c.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f22650c.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f22650c.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.f22650c.submit(runnable, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$t */
    /* loaded from: classes2.dex */
    public final class C9657t extends AbstractC9592e {

        /* renamed from: a */
        final AbstractC10020n0.C10022b f22651a;

        /* renamed from: b */
        final C9641o f22652b;

        /* renamed from: c */
        final C9526h0 f22653c;

        /* renamed from: d */
        final C9719n f22654d;

        /* renamed from: e */
        final C9725o f22655e;

        /* renamed from: f */
        List<C10090y> f22656f;

        /* renamed from: g */
        C9814y0 f22657g;

        /* renamed from: h */
        boolean f22658h;

        /* renamed from: i */
        boolean f22659i;

        /* renamed from: j */
        ExecutorC9513e1.C9516c f22660j;

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$t$a */
        /* loaded from: classes2.dex */
        final class C9658a extends C9814y0.AbstractC9827j {

            /* renamed from: a */
            final /* synthetic */ AbstractC10020n0.InterfaceC10032j f22662a;

            C9658a(AbstractC10020n0.InterfaceC10032j interfaceC10032j) {
                this.f22662a = interfaceC10032j;
            }

            @Override // io.grpc.p384h1.C9814y0.AbstractC9827j
            /* renamed from: a */
            void mo13884a(C9814y0 c9814y0) {
                C9623g1.this.f22564e0.m13948e(c9814y0, true);
            }

            @Override // io.grpc.p384h1.C9814y0.AbstractC9827j
            /* renamed from: b */
            void mo13883b(C9814y0 c9814y0) {
                C9623g1.this.f22564e0.m13948e(c9814y0, false);
            }

            @Override // io.grpc.p384h1.C9814y0.AbstractC9827j
            /* renamed from: c */
            void mo13882c(C9814y0 c9814y0, C10041r c10041r) {
                C5051n.m25773u(this.f22662a != null, "listener is null");
                this.f22662a.mo13259a(c10041r);
                if (c10041r.m13242c() == EnumC10039q.TRANSIENT_FAILURE || c10041r.m13242c() == EnumC10039q.IDLE) {
                    C9641o c9641o = C9657t.this.f22652b;
                    if (c9641o.f22619c || c9641o.f22618b) {
                        return;
                    }
                    C9623g1.f22521j0.log(Level.WARNING, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                    C9623g1.this.m14326B0();
                    C9657t.this.f22652b.f22618b = true;
                }
            }

            @Override // io.grpc.p384h1.C9814y0.AbstractC9827j
            /* renamed from: d */
            void mo13881d(C9814y0 c9814y0) {
                C9623g1.this.f22532D.remove(c9814y0);
                C9623g1.this.f22547S.m14596k(c9814y0);
                C9623g1.this.m14254z0();
            }
        }

        /* compiled from: ManagedChannelImpl.java */
        /* renamed from: io.grpc.h1.g1$t$b */
        /* loaded from: classes2.dex */
        final class RunnableC9659b implements Runnable {
            RunnableC9659b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9657t.this.f22657g.m13909c(C9623g1.f22525n0);
            }
        }

        C9657t(AbstractC10020n0.C10022b c10022b, C9641o c9641o) {
            this.f22656f = c10022b.m13304a();
            if (C9623g1.this.f22559c != null) {
                List<C10090y> m14236i = m14236i(c10022b.m13304a());
                AbstractC10020n0.C10022b.C10023a m13301d = c10022b.m13301d();
                m13301d.m13296e(m14236i);
                c10022b = m13301d.m13299b();
            }
            C5051n.m25779o(c10022b, "args");
            this.f22651a = c10022b;
            C5051n.m25779o(c9641o, "helper");
            this.f22652b = c9641o;
            this.f22653c = C9526h0.m14526b("Subchannel", C9623g1.this.mo13366a());
            C9526h0 c9526h0 = this.f22653c;
            int i = C9623g1.this.f22577n;
            long mo14158a = C9623g1.this.f22576m.mo14158a();
            C9725o c9725o = new C9725o(c9526h0, i, mo14158a, "Subchannel for " + c10022b.m13304a());
            this.f22655e = c9725o;
            this.f22654d = new C9719n(c9725o, C9623g1.this.f22576m);
        }

        /* renamed from: i */
        private List<C10090y> m14236i(List<C10090y> list) {
            ArrayList arrayList = new ArrayList();
            for (C10090y c10090y : list) {
                List<SocketAddress> m13078a = c10090y.m13078a();
                C9477a.C9479b m14628d = c10090y.m13077b().m14628d();
                m14628d.m14625c(C10090y.f23866d);
                arrayList.add(new C10090y(m13078a, m14628d.m14627a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: b */
        public List<C10090y> mo13267b() {
            C9623g1.this.f22578o.m14531d();
            C5051n.m25773u(this.f22658h, "not started");
            return this.f22656f;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: c */
        public C9477a mo13266c() {
            return this.f22651a.m13303b();
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: d */
        public Object mo13265d() {
            C5051n.m25773u(this.f22658h, "Subchannel is not started");
            return this.f22657g;
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: e */
        public void mo13264e() {
            C9623g1.this.f22578o.m14531d();
            C5051n.m25773u(this.f22658h, "not started");
            this.f22657g.mo13910a();
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: f */
        public void mo13263f() {
            ExecutorC9513e1.C9516c c9516c;
            C9623g1.this.f22578o.m14531d();
            if (this.f22657g == null) {
                this.f22659i = true;
                return;
            }
            if (this.f22659i) {
                if (!C9623g1.this.f22540L || (c9516c = this.f22660j) == null) {
                    return;
                }
                c9516c.m14530a();
                this.f22660j = null;
            } else {
                this.f22659i = true;
            }
            if (!C9623g1.this.f22540L) {
                this.f22660j = C9623g1.this.f22578o.m14532c(new RunnableC9586d1(new RunnableC9659b()), 5L, TimeUnit.SECONDS, C9623g1.this.f22567g.mo13717S0());
            } else {
                this.f22657g.m13909c(C9623g1.f22524m0);
            }
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: g */
        public void mo13262g(AbstractC10020n0.InterfaceC10032j interfaceC10032j) {
            C9623g1.this.f22578o.m14531d();
            C5051n.m25773u(!this.f22658h, "already started");
            C5051n.m25773u(!this.f22659i, "already shutdown");
            C5051n.m25773u(!C9623g1.this.f22540L, "Channel is being terminated");
            this.f22658h = true;
            C9814y0 c9814y0 = new C9814y0(this.f22651a.m13304a(), C9623g1.this.mo13366a(), C9623g1.this.f22587x, C9623g1.this.f22585v, C9623g1.this.f22567g, C9623g1.this.f22567g.mo13717S0(), C9623g1.this.f22582s, C9623g1.this.f22578o, new C9658a(interfaceC10032j), C9623g1.this.f22547S, C9623g1.this.f22543O.create(), this.f22655e, this.f22653c, this.f22654d);
            C9725o c9725o = C9623g1.this.f22545Q;
            C9504d0.C9505a c9505a = new C9504d0.C9505a();
            c9505a.m14544b("Child Subchannel started");
            c9505a.m14543c(C9504d0.EnumC9506b.CT_INFO);
            c9505a.m14541e(C9623g1.this.f22576m.mo14158a());
            c9505a.m14542d(c9814y0);
            c9725o.m14119e(c9505a.m14545a());
            this.f22657g = c9814y0;
            C9623g1.this.f22547S.m14602e(c9814y0);
            C9623g1.this.f22532D.add(c9814y0);
        }

        @Override // io.grpc.AbstractC10020n0.AbstractC10030h
        /* renamed from: h */
        public void mo13261h(List<C10090y> list) {
            C9623g1.this.f22578o.m14531d();
            this.f22656f = list;
            if (C9623g1.this.f22559c != null) {
                list = m14236i(list);
            }
            this.f22657g.m13911T(list);
        }

        public String toString() {
            return this.f22653c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9623g1(C9666h1 c9666h1, InterfaceC9780t interfaceC9780t, InterfaceC9690k.InterfaceC9691a interfaceC9691a, InterfaceC9747p1<? extends Executor> interfaceC9747p1, InterfaceC5058r<C5055p> interfaceC5058r, List<InterfaceC9896i> list, InterfaceC9708l2 interfaceC9708l2) {
        this.f22550V = f22526o0;
        this.f22552X = false;
        String str = c9666h1.f22693f;
        C5051n.m25779o(str, "target");
        String str2 = str;
        this.f22557b = str2;
        this.f22555a = C9526h0.m14526b("Channel", str2);
        C5051n.m25779o(interfaceC9708l2, "timeProvider");
        this.f22576m = interfaceC9708l2;
        InterfaceC9747p1<? extends Executor> interfaceC9747p12 = c9666h1.f22688a;
        C5051n.m25779o(interfaceC9747p12, "executorPool");
        InterfaceC9747p1<? extends Executor> interfaceC9747p13 = interfaceC9747p12;
        this.f22573j = interfaceC9747p13;
        Executor mo14070a = interfaceC9747p13.mo14070a();
        C5051n.m25779o(mo14070a, "executor");
        Executor executor = mo14070a;
        this.f22571i = executor;
        AbstractC9517f abstractC9517f = c9666h1.f22694g;
        this.f22567g = new C9697l(interfaceC9780t, c9666h1.f22695h, executor);
        new C9697l(interfaceC9780t, null, this.f22571i);
        this.f22569h = new ScheduledExecutorServiceC9656s(this.f22567g.mo13717S0(), null);
        this.f22577n = c9666h1.f22709v;
        C9526h0 c9526h0 = this.f22555a;
        int i = c9666h1.f22709v;
        long mo14158a = interfaceC9708l2.mo14158a();
        C9725o c9725o = new C9725o(c9526h0, i, mo14158a, "Channel for '" + this.f22557b + "'");
        this.f22545Q = c9725o;
        this.f22546R = new C9719n(c9725o, interfaceC9708l2);
        InterfaceC10094z0 interfaceC10094z0 = c9666h1.f22713z;
        interfaceC10094z0 = interfaceC10094z0 == null ? C9755r0.f22911k : interfaceC10094z0;
        this.f22560c0 = c9666h1.f22707t;
        this.f22565f = new C9677j(c9666h1.f22698k);
        InterfaceC9747p1<? extends Executor> interfaceC9747p14 = c9666h1.f22689b;
        C5051n.m25779o(interfaceC9747p14, "offloadExecutorPool");
        this.f22575l = new C9638l(interfaceC9747p14);
        C10084w0 c10084w0 = c9666h1.f22691d;
        C9563b2 c9563b2 = new C9563b2(this.f22560c0, c9666h1.f22703p, c9666h1.f22704q, this.f22565f);
        AbstractC10069u0.C10071b.C10072a m13131f = AbstractC10069u0.C10071b.m13131f();
        m13131f.m13128c(c9666h1.m14225c());
        m13131f.m13126e(interfaceC10094z0);
        m13131f.m13123h(this.f22578o);
        m13131f.m13125f(this.f22569h);
        m13131f.m13124g(c9563b2);
        m13131f.m13129b(this.f22546R);
        m13131f.m13127d(new ExecutorC9628e());
        AbstractC10069u0.C10071b m13130a = m13131f.m13130a();
        this.f22563e = m13130a;
        String str3 = c9666h1.f22697j;
        this.f22559c = str3;
        AbstractC10069u0.AbstractC10074d abstractC10074d = c9666h1.f22692e;
        this.f22561d = abstractC10074d;
        this.f22588y = m14258x0(this.f22557b, str3, abstractC10074d, m13130a);
        C5051n.m25779o(interfaceC9747p1, "balancerRpcExecutorPool");
        this.f22574k = new C9638l(interfaceC9747p1);
        C9532a0 c9532a0 = new C9532a0(this.f22571i, this.f22578o);
        this.f22536H = c9532a0;
        c9532a0.mo13631e(this.f22562d0);
        this.f22585v = interfaceC9691a;
        Map<String, ?> map = c9666h1.f22710w;
        if (map != null) {
            AbstractC10069u0.C10073c mo13107a = c9563b2.mo13107a(map);
            C5051n.m25771w(mo13107a.m13119d() == null, "Default config is invalid: %s", mo13107a.m13119d());
            C9685j1 c9685j1 = (C9685j1) mo13107a.m13120c();
            this.f22551W = c9685j1;
            this.f22550V = c9685j1;
        } else {
            this.f22551W = null;
        }
        this.f22553Y = c9666h1.f22711x;
        C9647q c9647q = new C9647q(this, this.f22588y.mo13141a(), null);
        this.f22548T = c9647q;
        AbstractC9483b abstractC9483b = c9666h1.f22712y;
        this.f22586w = C9985k.m13368a(abstractC9483b != null ? abstractC9483b.m14622c(c9647q) : c9647q, list);
        C5051n.m25779o(interfaceC5058r, "stopwatchSupplier");
        this.f22582s = interfaceC5058r;
        long j = c9666h1.f22702o;
        if (j == -1) {
            this.f22583t = j;
        } else {
            C5051n.m25785i(j >= C9666h1.f22677J, "invalid idleTimeoutMillis %s", c9666h1.f22702o);
            this.f22583t = c9666h1.f22702o;
        }
        this.f22572i0 = new C9834y1(new RunnableC9640n(this, null), this.f22578o, this.f22567g.mo13717S0(), interfaceC5058r.get());
        this.f22579p = c9666h1.f22699l;
        C10082w c10082w = c9666h1.f22700m;
        C5051n.m25779o(c10082w, "decompressorRegistry");
        this.f22580q = c10082w;
        C10036p c10036p = c9666h1.f22701n;
        C5051n.m25779o(c10036p, "compressorRegistry");
        this.f22581r = c10036p;
        this.f22587x = c9666h1.f22696i;
        this.f22558b0 = c9666h1.f22705r;
        this.f22556a0 = c9666h1.f22706s;
        C9625b c9625b = new C9625b(this, interfaceC9708l2);
        this.f22543O = c9625b;
        this.f22544P = c9625b.create();
        C9493c0 c9493c0 = c9666h1.f22708u;
        C5051n.m25780n(c9493c0);
        C9493c0 c9493c02 = c9493c0;
        this.f22547S = c9493c02;
        c9493c02.m14603d(this);
        if (this.f22553Y) {
            return;
        }
        if (this.f22551W != null) {
            this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f22552X = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public void m14326B0() {
        this.f22578o.m14531d();
        m14268s0();
        m14324C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public void m14324C0() {
        this.f22578o.m14531d();
        if (this.f22589z) {
            this.f22588y.mo13140b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m14322D0() {
        long j = this.f22583t;
        if (j == -1) {
            return;
        }
        this.f22572i0.m13856k(j, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public void m14320E0(boolean z) {
        this.f22578o.m14531d();
        if (z) {
            C5051n.m25773u(this.f22589z, "nameResolver is not started");
            C5051n.m25773u(this.f22529A != null, "lbHelper is null");
        }
        if (this.f22588y != null) {
            m14268s0();
            this.f22588y.mo13139c();
            this.f22589z = false;
            if (z) {
                this.f22588y = m14258x0(this.f22557b, this.f22559c, this.f22561d, this.f22563e);
            } else {
                this.f22588y = null;
            }
        }
        C9641o c9641o = this.f22529A;
        if (c9641o != null) {
            c9641o.f22617a.m14198c();
            this.f22529A = null;
        }
        this.f22530B = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m14318F0(AbstractC10020n0.AbstractC10031i abstractC10031i) {
        this.f22530B = abstractC10031i;
        this.f22536H.m14491r(abstractC10031i);
    }

    /* renamed from: r0 */
    private void m14270r0(boolean z) {
        this.f22572i0.m13858i(z);
    }

    /* renamed from: s0 */
    private void m14268s0() {
        this.f22578o.m14531d();
        ExecutorC9513e1.C9516c c9516c = this.f22566f0;
        if (c9516c != null) {
            c9516c.m14530a();
            this.f22566f0 = null;
            this.f22568g0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m14266t0() {
        m14320E0(true);
        this.f22536H.m14491r(null);
        this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Entering IDLE state");
        this.f22584u.m13952a(EnumC10039q.IDLE);
        if (this.f22564e0.m13950a(this.f22534F, this.f22536H)) {
            m14264u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public Executor m14262v0(C9502d c9502d) {
        Executor m14562e = c9502d.m14562e();
        return m14562e == null ? this.f22571i : m14562e;
    }

    /* renamed from: w0 */
    private static AbstractC10069u0 m14260w0(String str, AbstractC10069u0.AbstractC10074d abstractC10074d, AbstractC10069u0.C10071b c10071b) {
        URI uri;
        AbstractC10069u0 mo13087b;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri == null || (mo13087b = abstractC10074d.mo13087b(uri, c10071b)) == null) {
            String str2 = "";
            if (!f22522k0.matcher(str).matches()) {
                try {
                    AbstractC10069u0 mo13087b2 = abstractC10074d.mo13087b(new URI(abstractC10074d.mo13088a(), "", "/" + str, null), c10071b);
                    if (mo13087b2 != null) {
                        return mo13087b2;
                    }
                } catch (URISyntaxException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return mo13087b;
    }

    /* renamed from: x0 */
    static AbstractC10069u0 m14258x0(String str, String str2, AbstractC10069u0.AbstractC10074d abstractC10074d, AbstractC10069u0.C10071b c10071b) {
        AbstractC10069u0 m14260w0 = m14260w0(str, abstractC10074d, c10071b);
        return str2 == null ? m14260w0 : new C9629f(m14260w0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m14256y0() {
        if (this.f22539K) {
            for (C9814y0 c9814y0 : this.f22532D) {
                c9814y0.m13908d(f22523l0);
            }
            for (C9751q1 c9751q1 : this.f22535G) {
                c9751q1.m14068i().m13908d(f22523l0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m14254z0() {
        if (!this.f22541M && this.f22538J.get() && this.f22532D.isEmpty() && this.f22535G.isEmpty()) {
            this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Terminated");
            this.f22547S.m14597j(this);
            this.f22573j.mo14069b(this.f22571i);
            this.f22574k.m14248b();
            this.f22575l.m14248b();
            this.f22567g.close();
            this.f22541M = true;
            this.f22542N.countDown();
        }
    }

    /* renamed from: A0 */
    void m14328A0(Throwable th) {
        if (this.f22531C) {
            return;
        }
        this.f22531C = true;
        m14270r0(true);
        m14320E0(false);
        m14318F0(new C9626c(this, th));
        this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f22584u.m13952a(EnumC10039q.TRANSIENT_FAILURE);
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: a */
    public String mo13366a() {
        return this.f22586w.mo13366a();
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return this.f22555a;
    }

    @Override // io.grpc.AbstractC9508e
    /* renamed from: h */
    public <ReqT, RespT> AbstractC9524h<ReqT, RespT> mo13365h(C10060t0<ReqT, RespT> c10060t0, C9502d c9502d) {
        return this.f22586w.mo13365h(c10060t0, c9502d);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25809c("logId", this.f22555a.m14524d());
        m25812c.m25808d("target", this.f22557b);
        return m25812c.toString();
    }

    /* renamed from: u0 */
    void m14264u0() {
        this.f22578o.m14531d();
        if (this.f22538J.get() || this.f22531C) {
            return;
        }
        if (this.f22564e0.m13949d()) {
            m14270r0(false);
        } else {
            m14322D0();
        }
        if (this.f22529A != null) {
            return;
        }
        this.f22546R.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Exiting idle mode");
        C9641o c9641o = new C9641o(this, null);
        c9641o.f22617a = this.f22565f.m14202e(c9641o);
        this.f22529A = c9641o;
        this.f22588y.mo13138d(new C9644p(c9641o, this.f22588y));
        this.f22589z = true;
    }

    /* compiled from: ManagedChannelImpl.java */
    /* renamed from: io.grpc.h1.g1$u */
    /* loaded from: classes2.dex */
    private final class C9660u {

        /* renamed from: a */
        final Object f22665a;

        /* renamed from: b */
        Collection<InterfaceC9749q> f22666b;

        /* renamed from: c */
        C9497c1 f22667c;

        private C9660u() {
            this.f22665a = new Object();
            this.f22666b = new HashSet();
        }

        /* renamed from: a */
        C9497c1 m14235a(AbstractC9857z1<?> abstractC9857z1) {
            synchronized (this.f22665a) {
                if (this.f22667c != null) {
                    return this.f22667c;
                }
                this.f22666b.add(abstractC9857z1);
                return null;
            }
        }

        /* renamed from: b */
        void m14234b(C9497c1 c9497c1) {
            synchronized (this.f22665a) {
                if (this.f22667c != null) {
                    return;
                }
                this.f22667c = c9497c1;
                boolean isEmpty = this.f22666b.isEmpty();
                if (isEmpty) {
                    C9623g1.this.f22536H.mo13635c(c9497c1);
                }
            }
        }

        /* renamed from: c */
        void m14233c(AbstractC9857z1<?> abstractC9857z1) {
            C9497c1 c9497c1;
            synchronized (this.f22665a) {
                this.f22666b.remove(abstractC9857z1);
                if (this.f22666b.isEmpty()) {
                    c9497c1 = this.f22667c;
                    this.f22666b = new HashSet();
                } else {
                    c9497c1 = null;
                }
            }
            if (c9497c1 != null) {
                C9623g1.this.f22536H.mo13635c(c9497c1);
            }
        }

        /* synthetic */ C9660u(C9623g1 c9623g1, C9624a c9624a) {
            this();
        }
    }
}
