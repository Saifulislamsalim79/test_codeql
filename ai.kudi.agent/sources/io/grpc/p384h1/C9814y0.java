package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.base.C5055p;
import com.google.common.base.InterfaceC5058r;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC9520g;
import io.grpc.C10041r;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C10090y;
import io.grpc.C9477a;
import io.grpc.C9484b0;
import io.grpc.C9493c0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9526h0;
import io.grpc.EnumC10039q;
import io.grpc.ExecutorC9513e1;
import io.grpc.InterfaceC9522g0;
import io.grpc.p384h1.InterfaceC9690k;
import io.grpc.p384h1.InterfaceC9693k1;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p384h1.InterfaceC9780t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternalSubchannel.java */
/* renamed from: io.grpc.h1.y0 */
/* loaded from: classes2.dex */
public final class C9814y0 implements InterfaceC9522g0<Object>, InterfaceC9724n2 {

    /* renamed from: a */
    private final C9526h0 f23041a;

    /* renamed from: b */
    private final String f23042b;

    /* renamed from: c */
    private final String f23043c;

    /* renamed from: d */
    private final InterfaceC9690k.InterfaceC9691a f23044d;

    /* renamed from: e */
    private final AbstractC9827j f23045e;

    /* renamed from: f */
    private final InterfaceC9780t f23046f;

    /* renamed from: g */
    private final ScheduledExecutorService f23047g;

    /* renamed from: h */
    private final C9493c0 f23048h;

    /* renamed from: i */
    private final C9710m f23049i;

    /* renamed from: j */
    private final AbstractC9520g f23050j;

    /* renamed from: k */
    private final ExecutorC9513e1 f23051k;

    /* renamed from: l */
    private final C9828k f23052l;

    /* renamed from: m */
    private volatile List<C10090y> f23053m;

    /* renamed from: n */
    private InterfaceC9690k f23054n;

    /* renamed from: o */
    private final C5055p f23055o;

    /* renamed from: p */
    private ExecutorC9513e1.C9516c f23056p;

    /* renamed from: q */
    private ExecutorC9513e1.C9516c f23057q;

    /* renamed from: r */
    private InterfaceC9693k1 f23058r;

    /* renamed from: u */
    private InterfaceC9798v f23061u;

    /* renamed from: v */
    private volatile InterfaceC9693k1 f23062v;

    /* renamed from: x */
    private C9497c1 f23064x;

    /* renamed from: s */
    private final Collection<InterfaceC9798v> f23059s = new ArrayList();

    /* renamed from: t */
    private final AbstractC9805w0<InterfaceC9798v> f23060t = new C9815a();

    /* renamed from: w */
    private volatile C10041r f23063w = C10041r.m13244a(EnumC10039q.IDLE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$a */
    /* loaded from: classes2.dex */
    public class C9815a extends AbstractC9805w0<InterfaceC9798v> {
        C9815a() {
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: b */
        protected void mo13596b() {
            C9814y0.this.f23045e.mo13884a(C9814y0.this);
        }

        @Override // io.grpc.p384h1.AbstractC9805w0
        /* renamed from: c */
        protected void mo13595c() {
            C9814y0.this.f23045e.mo13883b(C9814y0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$b */
    /* loaded from: classes2.dex */
    public class RunnableC9816b implements Runnable {
        RunnableC9816b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9814y0.this.f23056p = null;
            C9814y0.this.f23050j.mo13868a(AbstractC9520g.EnumC9521a.INFO, "CONNECTING after backoff");
            C9814y0.this.m13918M(EnumC10039q.CONNECTING);
            C9814y0.this.m13912S();
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$c */
    /* loaded from: classes2.dex */
    class RunnableC9817c implements Runnable {
        RunnableC9817c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9814y0.this.f23063w.m13242c() == EnumC10039q.IDLE) {
                C9814y0.this.f23050j.mo13868a(AbstractC9520g.EnumC9521a.INFO, "CONNECTING as requested");
                C9814y0.this.m13918M(EnumC10039q.CONNECTING);
                C9814y0.this.m13912S();
            }
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$d */
    /* loaded from: classes2.dex */
    class RunnableC9818d implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f23068c;

        /* compiled from: InternalSubchannel.java */
        /* renamed from: io.grpc.h1.y0$d$a */
        /* loaded from: classes2.dex */
        class RunnableC9819a implements Runnable {
            RunnableC9819a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC9693k1 interfaceC9693k1 = C9814y0.this.f23058r;
                C9814y0.this.f23057q = null;
                C9814y0.this.f23058r = null;
                interfaceC9693k1.mo13635c(C9497c1.f22195n.m14578r("InternalSubchannel closed transport due to address change"));
            }
        }

        RunnableC9818d(List list) {
            this.f23068c = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.y0$k r0 = io.grpc.p384h1.C9814y0.m13922I(r0)
                java.net.SocketAddress r0 = r0.m13880a()
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.y0$k r1 = io.grpc.p384h1.C9814y0.m13922I(r1)
                java.util.List r2 = r7.f23068c
                r1.m13873h(r2)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                java.util.List r2 = r7.f23068c
                io.grpc.p384h1.C9814y0.m13921J(r1, r2)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.r r1 = io.grpc.p384h1.C9814y0.m13906i(r1)
                io.grpc.q r1 = r1.m13242c()
                io.grpc.q r2 = io.grpc.EnumC10039q.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.r r1 = io.grpc.p384h1.C9814y0.m13906i(r1)
                io.grpc.q r1 = r1.m13242c()
                io.grpc.q r2 = io.grpc.EnumC10039q.CONNECTING
                if (r1 != r2) goto L93
            L39:
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.y0$k r1 = io.grpc.p384h1.C9814y0.m13922I(r1)
                boolean r0 = r1.m13874g(r0)
                if (r0 != 0) goto L93
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.r r0 = io.grpc.p384h1.C9814y0.m13906i(r0)
                io.grpc.q r0 = r0.m13242c()
                io.grpc.q r1 = io.grpc.EnumC10039q.READY
                if (r0 != r1) goto L6f
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.k1 r0 = io.grpc.p384h1.C9814y0.m13905j(r0)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13904k(r1, r3)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.y0$k r1 = io.grpc.p384h1.C9814y0.m13922I(r1)
                r1.m13875f()
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.q r2 = io.grpc.EnumC10039q.IDLE
                io.grpc.p384h1.C9814y0.m13926E(r1, r2)
                goto L94
            L6f:
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.v r0 = io.grpc.p384h1.C9814y0.m13903l(r0)
                io.grpc.c1 r1 = io.grpc.C9497c1.f22195n
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                io.grpc.c1 r1 = r1.m14578r(r2)
                r0.mo13635c(r1)
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13902m(r0, r3)
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.y0$k r0 = io.grpc.p384h1.C9814y0.m13922I(r0)
                r0.m13875f()
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13925F(r0)
            L93:
                r0 = r3
            L94:
                if (r0 == 0) goto Le3
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.e1$c r1 = io.grpc.p384h1.C9814y0.m13901n(r1)
                if (r1 == 0) goto Lc2
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.h1.k1 r1 = io.grpc.p384h1.C9814y0.m13899p(r1)
                io.grpc.c1 r2 = io.grpc.C9497c1.f22195n
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                io.grpc.c1 r2 = r2.m14578r(r4)
                r1.mo13635c(r2)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.e1$c r1 = io.grpc.p384h1.C9814y0.m13901n(r1)
                r1.m14530a()
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13900o(r1, r3)
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13898q(r1, r3)
            Lc2:
                io.grpc.h1.y0 r1 = io.grpc.p384h1.C9814y0.this
                io.grpc.p384h1.C9814y0.m13898q(r1, r0)
                io.grpc.h1.y0 r0 = io.grpc.p384h1.C9814y0.this
                io.grpc.e1 r1 = io.grpc.p384h1.C9814y0.m13896s(r0)
                io.grpc.h1.y0$d$a r2 = new io.grpc.h1.y0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.h1.y0 r6 = io.grpc.p384h1.C9814y0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.p384h1.C9814y0.m13897r(r6)
                io.grpc.e1$c r1 = r1.m14532c(r2, r3, r5, r6)
                io.grpc.p384h1.C9814y0.m13900o(r0, r1)
            Le3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.C9814y0.RunnableC9818d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$e */
    /* loaded from: classes2.dex */
    public class RunnableC9820e implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f23071c;

        RunnableC9820e(C9497c1 c9497c1) {
            this.f23071c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9814y0.this.f23063w.m13242c() == EnumC10039q.SHUTDOWN) {
                return;
            }
            C9814y0.this.f23064x = this.f23071c;
            InterfaceC9693k1 interfaceC9693k1 = C9814y0.this.f23062v;
            InterfaceC9798v interfaceC9798v = C9814y0.this.f23061u;
            C9814y0.this.f23062v = null;
            C9814y0.this.f23061u = null;
            C9814y0.this.m13918M(EnumC10039q.SHUTDOWN);
            C9814y0.this.f23052l.m13875f();
            if (C9814y0.this.f23059s.isEmpty()) {
                C9814y0.this.m13916O();
            }
            C9814y0.this.m13920K();
            if (C9814y0.this.f23057q != null) {
                C9814y0.this.f23057q.m14530a();
                C9814y0.this.f23058r.mo13635c(this.f23071c);
                C9814y0.this.f23057q = null;
                C9814y0.this.f23058r = null;
            }
            if (interfaceC9693k1 != null) {
                interfaceC9693k1.mo13635c(this.f23071c);
            }
            if (interfaceC9798v != null) {
                interfaceC9798v.mo13635c(this.f23071c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$f */
    /* loaded from: classes2.dex */
    public class RunnableC9821f implements Runnable {
        RunnableC9821f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9814y0.this.f23050j.mo13868a(AbstractC9520g.EnumC9521a.INFO, "Terminated");
            C9814y0.this.f23045e.mo13881d(C9814y0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$g */
    /* loaded from: classes2.dex */
    public class RunnableC9822g implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9798v f23074c;

        /* renamed from: d */
        final /* synthetic */ boolean f23075d;

        RunnableC9822g(InterfaceC9798v interfaceC9798v, boolean z) {
            this.f23074c = interfaceC9798v;
            this.f23075d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9814y0.this.f23060t.m13948e(this.f23074c, this.f23075d);
        }
    }

    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$h */
    /* loaded from: classes2.dex */
    class RunnableC9823h implements Runnable {

        /* renamed from: c */
        final /* synthetic */ C9497c1 f23077c;

        RunnableC9823h(C9497c1 c9497c1) {
            this.f23077c = c9497c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC9693k1 interfaceC9693k1 : new ArrayList(C9814y0.this.f23059s)) {
                interfaceC9693k1.mo13633d(this.f23077c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$i */
    /* loaded from: classes2.dex */
    public static final class C9824i extends AbstractC9692k0 {

        /* renamed from: a */
        private final InterfaceC9798v f23079a;

        /* renamed from: b */
        private final C9710m f23080b;

        /* compiled from: InternalSubchannel.java */
        /* renamed from: io.grpc.h1.y0$i$a */
        /* loaded from: classes2.dex */
        class C9825a extends AbstractC9665h0 {

            /* renamed from: a */
            final /* synthetic */ InterfaceC9749q f23081a;

            /* compiled from: InternalSubchannel.java */
            /* renamed from: io.grpc.h1.y0$i$a$a */
            /* loaded from: classes2.dex */
            class C9826a extends AbstractC9673i0 {

                /* renamed from: a */
                final /* synthetic */ InterfaceC9753r f23083a;

                C9826a(InterfaceC9753r interfaceC9753r) {
                    this.f23083a = interfaceC9753r;
                }

                @Override // io.grpc.p384h1.AbstractC9673i0, io.grpc.p384h1.InterfaceC9753r
                /* renamed from: d */
                public void mo13766d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
                    C9824i.this.f23080b.m14157a(c9497c1.m14580p());
                    super.mo13766d(c9497c1, enumC9754a, c10049s0);
                }

                @Override // io.grpc.p384h1.AbstractC9673i0
                /* renamed from: e */
                protected InterfaceC9753r mo13885e() {
                    return this.f23083a;
                }
            }

            C9825a(InterfaceC9749q interfaceC9749q) {
                this.f23081a = interfaceC9749q;
            }

            @Override // io.grpc.p384h1.AbstractC9665h0, io.grpc.p384h1.InterfaceC9749q
            /* renamed from: o */
            public void mo13781o(InterfaceC9753r interfaceC9753r) {
                C9824i.this.f23080b.m14156b();
                super.mo13781o(new C9826a(interfaceC9753r));
            }

            @Override // io.grpc.p384h1.AbstractC9665h0
            /* renamed from: p */
            protected InterfaceC9749q mo13886p() {
                return this.f23081a;
            }
        }

        /* synthetic */ C9824i(InterfaceC9798v interfaceC9798v, C9710m c9710m, C9815a c9815a) {
            this(interfaceC9798v, c9710m);
        }

        @Override // io.grpc.p384h1.AbstractC9692k0
        /* renamed from: a */
        protected InterfaceC9798v mo13888a() {
            return this.f23079a;
        }

        @Override // io.grpc.p384h1.AbstractC9692k0, io.grpc.p384h1.InterfaceC9773s
        /* renamed from: b */
        public InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
            return new C9825a(super.mo13637b(c10060t0, c10049s0, c9502d, abstractC10001lArr));
        }

        private C9824i(InterfaceC9798v interfaceC9798v, C9710m c9710m) {
            this.f23079a = interfaceC9798v;
            this.f23080b = c9710m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$j */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9827j {
        /* renamed from: a */
        abstract void mo13884a(C9814y0 c9814y0);

        /* renamed from: b */
        abstract void mo13883b(C9814y0 c9814y0);

        /* renamed from: c */
        abstract void mo13882c(C9814y0 c9814y0, C10041r c10041r);

        /* renamed from: d */
        abstract void mo13881d(C9814y0 c9814y0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$k */
    /* loaded from: classes2.dex */
    public static final class C9828k {

        /* renamed from: a */
        private List<C10090y> f23085a;

        /* renamed from: b */
        private int f23086b;

        /* renamed from: c */
        private int f23087c;

        public C9828k(List<C10090y> list) {
            this.f23085a = list;
        }

        /* renamed from: a */
        public SocketAddress m13880a() {
            return this.f23085a.get(this.f23086b).m13078a().get(this.f23087c);
        }

        /* renamed from: b */
        public C9477a m13879b() {
            return this.f23085a.get(this.f23086b).m13077b();
        }

        /* renamed from: c */
        public void m13878c() {
            int i = this.f23087c + 1;
            this.f23087c = i;
            if (i >= this.f23085a.get(this.f23086b).m13078a().size()) {
                this.f23086b++;
                this.f23087c = 0;
            }
        }

        /* renamed from: d */
        public boolean m13877d() {
            return this.f23086b == 0 && this.f23087c == 0;
        }

        /* renamed from: e */
        public boolean m13876e() {
            return this.f23086b < this.f23085a.size();
        }

        /* renamed from: f */
        public void m13875f() {
            this.f23086b = 0;
            this.f23087c = 0;
        }

        /* renamed from: g */
        public boolean m13874g(SocketAddress socketAddress) {
            for (int i = 0; i < this.f23085a.size(); i++) {
                int indexOf = this.f23085a.get(i).m13078a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f23086b = i;
                    this.f23087c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void m13873h(List<C10090y> list) {
            this.f23085a = list;
            m13875f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$l */
    /* loaded from: classes2.dex */
    public class C9829l implements InterfaceC9693k1.InterfaceC9694a {

        /* renamed from: a */
        final InterfaceC9798v f23088a;

        /* renamed from: b */
        boolean f23089b = false;

        /* compiled from: InternalSubchannel.java */
        /* renamed from: io.grpc.h1.y0$l$a */
        /* loaded from: classes2.dex */
        class RunnableC9830a implements Runnable {
            RunnableC9830a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9814y0.this.f23054n = null;
                if (C9814y0.this.f23064x != null) {
                    C5051n.m25773u(C9814y0.this.f23062v == null, "Unexpected non-null activeTransport");
                    C9829l c9829l = C9829l.this;
                    c9829l.f23088a.mo13635c(C9814y0.this.f23064x);
                    return;
                }
                InterfaceC9798v interfaceC9798v = C9814y0.this.f23061u;
                C9829l c9829l2 = C9829l.this;
                InterfaceC9798v interfaceC9798v2 = c9829l2.f23088a;
                if (interfaceC9798v == interfaceC9798v2) {
                    C9814y0.this.f23062v = interfaceC9798v2;
                    C9814y0.this.f23061u = null;
                    C9814y0.this.m13918M(EnumC10039q.READY);
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* renamed from: io.grpc.h1.y0$l$b */
        /* loaded from: classes2.dex */
        class RunnableC9831b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f23092c;

            RunnableC9831b(C9497c1 c9497c1) {
                this.f23092c = c9497c1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C9814y0.this.f23063w.m13242c() == EnumC10039q.SHUTDOWN) {
                    return;
                }
                InterfaceC9693k1 interfaceC9693k1 = C9814y0.this.f23062v;
                C9829l c9829l = C9829l.this;
                if (interfaceC9693k1 == c9829l.f23088a) {
                    C9814y0.this.f23062v = null;
                    C9814y0.this.f23052l.m13875f();
                    C9814y0.this.m13918M(EnumC10039q.IDLE);
                    return;
                }
                InterfaceC9798v interfaceC9798v = C9814y0.this.f23061u;
                C9829l c9829l2 = C9829l.this;
                if (interfaceC9798v == c9829l2.f23088a) {
                    C5051n.m25771w(C9814y0.this.f23063w.m13242c() == EnumC10039q.CONNECTING, "Expected state is CONNECTING, actual state is %s", C9814y0.this.f23063w.m13242c());
                    C9814y0.this.f23052l.m13878c();
                    if (!C9814y0.this.f23052l.m13876e()) {
                        C9814y0.this.f23061u = null;
                        C9814y0.this.f23052l.m13875f();
                        C9814y0.this.m13913R(this.f23092c);
                        return;
                    }
                    C9814y0.this.m13912S();
                }
            }
        }

        /* compiled from: InternalSubchannel.java */
        /* renamed from: io.grpc.h1.y0$l$c */
        /* loaded from: classes2.dex */
        class RunnableC9832c implements Runnable {
            RunnableC9832c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9814y0.this.f23059s.remove(C9829l.this.f23088a);
                if (C9814y0.this.f23063w.m13242c() == EnumC10039q.SHUTDOWN && C9814y0.this.f23059s.isEmpty()) {
                    C9814y0.this.m13916O();
                }
            }
        }

        C9829l(InterfaceC9798v interfaceC9798v, SocketAddress socketAddress) {
            this.f23088a = interfaceC9798v;
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: a */
        public void mo13872a(C9497c1 c9497c1) {
            C9814y0.this.f23050j.mo13867b(AbstractC9520g.EnumC9521a.INFO, "{0} SHUTDOWN with {1}", this.f23088a.mo13324f(), C9814y0.this.m13914Q(c9497c1));
            this.f23089b = true;
            C9814y0.this.f23051k.execute(new RunnableC9831b(c9497c1));
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: b */
        public void mo13871b() {
            C9814y0.this.f23050j.mo13868a(AbstractC9520g.EnumC9521a.INFO, "READY");
            C9814y0.this.f23051k.execute(new RunnableC9830a());
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: c */
        public void mo13870c() {
            C5051n.m25773u(this.f23089b, "transportShutdown() must be called before transportTerminated().");
            C9814y0.this.f23050j.mo13867b(AbstractC9520g.EnumC9521a.INFO, "{0} Terminated", this.f23088a.mo13324f());
            C9814y0.this.f23048h.m14598i(this.f23088a);
            C9814y0.this.m13915P(this.f23088a, false);
            C9814y0.this.f23051k.execute(new RunnableC9832c());
        }

        @Override // io.grpc.p384h1.InterfaceC9693k1.InterfaceC9694a
        /* renamed from: d */
        public void mo13869d(boolean z) {
            C9814y0.this.m13915P(this.f23088a, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InternalSubchannel.java */
    /* renamed from: io.grpc.h1.y0$m */
    /* loaded from: classes2.dex */
    public static final class C9833m extends AbstractC9520g {

        /* renamed from: a */
        C9526h0 f23095a;

        C9833m() {
        }

        @Override // io.grpc.AbstractC9520g
        /* renamed from: a */
        public void mo13868a(AbstractC9520g.EnumC9521a enumC9521a, String str) {
            C9719n.m14132d(this.f23095a, enumC9521a, str);
        }

        @Override // io.grpc.AbstractC9520g
        /* renamed from: b */
        public void mo13867b(AbstractC9520g.EnumC9521a enumC9521a, String str, Object... objArr) {
            C9719n.m14131e(this.f23095a, enumC9521a, str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9814y0(List<C10090y> list, String str, String str2, InterfaceC9690k.InterfaceC9691a interfaceC9691a, InterfaceC9780t interfaceC9780t, ScheduledExecutorService scheduledExecutorService, InterfaceC5058r<C5055p> interfaceC5058r, ExecutorC9513e1 executorC9513e1, AbstractC9827j abstractC9827j, C9493c0 c9493c0, C9710m c9710m, C9725o c9725o, C9526h0 c9526h0, AbstractC9520g abstractC9520g) {
        C5051n.m25779o(list, "addressGroups");
        C5051n.m25789e(!list.isEmpty(), "addressGroups is empty");
        m13919L(list, "addressGroups contains null entry");
        List<C10090y> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f23053m = unmodifiableList;
        this.f23052l = new C9828k(unmodifiableList);
        this.f23042b = str;
        this.f23043c = str2;
        this.f23044d = interfaceC9691a;
        this.f23046f = interfaceC9780t;
        this.f23047g = scheduledExecutorService;
        this.f23055o = interfaceC5058r.get();
        this.f23051k = executorC9513e1;
        this.f23045e = abstractC9827j;
        this.f23048h = c9493c0;
        this.f23049i = c9710m;
        C5051n.m25779o(c9725o, "channelTracer");
        C5051n.m25779o(c9526h0, "logId");
        this.f23041a = c9526h0;
        C5051n.m25779o(abstractC9520g, "channelLogger");
        this.f23050j = abstractC9520g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public void m13920K() {
        this.f23051k.m14531d();
        ExecutorC9513e1.C9516c c9516c = this.f23056p;
        if (c9516c != null) {
            c9516c.m14530a();
            this.f23056p = null;
            this.f23054n = null;
        }
    }

    /* renamed from: L */
    private static void m13919L(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            C5051n.m25779o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m13918M(EnumC10039q enumC10039q) {
        this.f23051k.m14531d();
        m13917N(C10041r.m13244a(enumC10039q));
    }

    /* renamed from: N */
    private void m13917N(C10041r c10041r) {
        this.f23051k.m14531d();
        if (this.f23063w.m13242c() != c10041r.m13242c()) {
            boolean z = this.f23063w.m13242c() != EnumC10039q.SHUTDOWN;
            C5051n.m25773u(z, "Cannot transition out of SHUTDOWN to " + c10041r);
            this.f23063w = c10041r;
            this.f23045e.mo13882c(this, c10041r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m13916O() {
        this.f23051k.execute(new RunnableC9821f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m13915P(InterfaceC9798v interfaceC9798v, boolean z) {
        this.f23051k.execute(new RunnableC9822g(interfaceC9798v, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public String m13914Q(C9497c1 c9497c1) {
        StringBuilder sb = new StringBuilder();
        sb.append(c9497c1.m14582n());
        if (c9497c1.m14581o() != null) {
            sb.append("(");
            sb.append(c9497c1.m14581o());
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m13913R(C9497c1 c9497c1) {
        this.f23051k.m14531d();
        m13917N(C10041r.m13243b(c9497c1));
        if (this.f23054n == null) {
            this.f23054n = this.f23044d.get();
        }
        long mo14179a = this.f23054n.mo14179a() - this.f23055o.m25763d(TimeUnit.NANOSECONDS);
        this.f23050j.mo13867b(AbstractC9520g.EnumC9521a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m13914Q(c9497c1), Long.valueOf(mo14179a));
        C5051n.m25773u(this.f23056p == null, "previous reconnectTask is not done");
        this.f23056p = this.f23051k.m14532c(new RunnableC9816b(), mo14179a, TimeUnit.NANOSECONDS, this.f23047g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m13912S() {
        InetSocketAddress inetSocketAddress;
        C9484b0 c9484b0;
        this.f23051k.m14531d();
        C5051n.m25773u(this.f23056p == null, "Should have no reconnectTask scheduled");
        if (this.f23052l.m13877d()) {
            C5055p c5055p = this.f23055o;
            c5055p.m25761f();
            c5055p.m25760g();
        }
        SocketAddress m13880a = this.f23052l.m13880a();
        if (m13880a instanceof C9484b0) {
            c9484b0 = (C9484b0) m13880a;
            inetSocketAddress = c9484b0.m14619c();
        } else {
            inetSocketAddress = m13880a;
            c9484b0 = null;
        }
        C9477a m13879b = this.f23052l.m13879b();
        String str = (String) m13879b.m14630b(C10090y.f23866d);
        InterfaceC9780t.C9781a c9781a = new InterfaceC9780t.C9781a();
        if (str == null) {
            str = this.f23042b;
        }
        c9781a.m13990e(str);
        c9781a.m13989f(m13879b);
        c9781a.m13987h(this.f23043c);
        c9781a.m13988g(c9484b0);
        C9833m c9833m = new C9833m();
        c9833m.f23095a = mo13324f();
        C9824i c9824i = new C9824i(this.f23046f.mo13716q0(inetSocketAddress, c9781a, c9833m), this.f23049i, null);
        c9833m.f23095a = c9824i.mo13324f();
        this.f23048h.m14604c(c9824i);
        this.f23061u = c9824i;
        this.f23059s.add(c9824i);
        Runnable mo13631e = c9824i.mo13631e(new C9829l(c9824i, inetSocketAddress));
        if (mo13631e != null) {
            this.f23051k.m14533b(mo13631e);
        }
        this.f23050j.mo13867b(AbstractC9520g.EnumC9521a.INFO, "Started transport {0}", c9833m.f23095a);
    }

    /* renamed from: T */
    public void m13911T(List<C10090y> list) {
        C5051n.m25779o(list, "newAddressGroups");
        m13919L(list, "newAddressGroups contains null entry");
        C5051n.m25789e(!list.isEmpty(), "newAddressGroups is empty");
        this.f23051k.execute(new RunnableC9818d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.p384h1.InterfaceC9724n2
    /* renamed from: a */
    public InterfaceC9773s mo13910a() {
        InterfaceC9693k1 interfaceC9693k1 = this.f23062v;
        if (interfaceC9693k1 != null) {
            return interfaceC9693k1;
        }
        this.f23051k.execute(new RunnableC9817c());
        return null;
    }

    /* renamed from: c */
    public void m13909c(C9497c1 c9497c1) {
        this.f23051k.execute(new RunnableC9820e(c9497c1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13908d(C9497c1 c9497c1) {
        m13909c(c9497c1);
        this.f23051k.execute(new RunnableC9823h(c9497c1));
    }

    @Override // io.grpc.InterfaceC10006l0
    /* renamed from: f */
    public C9526h0 mo13324f() {
        return this.f23041a;
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25809c("logId", this.f23041a.m14524d());
        m25812c.m25808d("addressGroups", this.f23053m);
        return m25812c.toString();
    }
}
