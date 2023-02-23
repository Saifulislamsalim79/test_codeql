package io.grpc.p384h1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC9490c;
import io.grpc.AbstractC9520g;
import io.grpc.C10018n;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.p384h1.C9722n1;
import io.grpc.p384h1.InterfaceC9780t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: CallCredentialsApplyingTransportFactory.java */
/* renamed from: io.grpc.h1.l */
/* loaded from: classes2.dex */
final class C9697l implements InterfaceC9780t {

    /* renamed from: c */
    private final InterfaceC9780t f22750c;

    /* renamed from: d */
    private final AbstractC9490c f22751d;

    /* renamed from: e */
    private final Executor f22752e;

    /* compiled from: CallCredentialsApplyingTransportFactory.java */
    /* renamed from: io.grpc.h1.l$a */
    /* loaded from: classes2.dex */
    private class C9698a extends AbstractC9692k0 {

        /* renamed from: a */
        private final InterfaceC9798v f22753a;

        /* renamed from: c */
        private volatile C9497c1 f22755c;

        /* renamed from: d */
        private C9497c1 f22756d;

        /* renamed from: e */
        private C9497c1 f22757e;

        /* renamed from: b */
        private final AtomicInteger f22754b = new AtomicInteger(-2147483647);

        /* renamed from: f */
        private final C9722n1.InterfaceC9723a f22758f = new C9699a();

        /* compiled from: CallCredentialsApplyingTransportFactory.java */
        /* renamed from: io.grpc.h1.l$a$a */
        /* loaded from: classes2.dex */
        class C9699a implements C9722n1.InterfaceC9723a {
            C9699a() {
            }

            @Override // io.grpc.p384h1.C9722n1.InterfaceC9723a
            /* renamed from: a */
            public void mo14124a() {
                if (C9698a.this.f22754b.decrementAndGet() == 0) {
                    C9698a.this.m14174j();
                }
            }
        }

        /* compiled from: CallCredentialsApplyingTransportFactory.java */
        /* renamed from: io.grpc.h1.l$a$b */
        /* loaded from: classes2.dex */
        class C9700b extends AbstractC9490c.AbstractC9492b {
            C9700b(C9698a c9698a, C10060t0 c10060t0, C9502d c9502d) {
            }
        }

        C9698a(InterfaceC9798v interfaceC9798v, String str) {
            C5051n.m25779o(interfaceC9798v, "delegate");
            this.f22753a = interfaceC9798v;
            C5051n.m25779o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m14174j() {
            synchronized (this) {
                if (this.f22754b.get() != 0) {
                    return;
                }
                C9497c1 c9497c1 = this.f22756d;
                C9497c1 c9497c12 = this.f22757e;
                this.f22756d = null;
                this.f22757e = null;
                if (c9497c1 != null) {
                    super.mo13635c(c9497c1);
                }
                if (c9497c12 != null) {
                    super.mo13633d(c9497c12);
                }
            }
        }

        @Override // io.grpc.p384h1.AbstractC9692k0
        /* renamed from: a */
        protected InterfaceC9798v mo13888a() {
            return this.f22753a;
        }

        @Override // io.grpc.p384h1.AbstractC9692k0, io.grpc.p384h1.InterfaceC9773s
        /* renamed from: b */
        public InterfaceC9749q mo13637b(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9502d c9502d, AbstractC10001l[] abstractC10001lArr) {
            AbstractC9490c m14564c = c9502d.m14564c();
            if (m14564c == null) {
                m14564c = C9697l.this.f22751d;
            } else if (C9697l.this.f22751d != null) {
                m14564c = new C10018n(C9697l.this.f22751d, m14564c);
            }
            if (m14564c != null) {
                C9722n1 c9722n1 = new C9722n1(this.f22753a, c10060t0, c10049s0, c9502d, this.f22758f, abstractC10001lArr);
                if (this.f22754b.incrementAndGet() > 0) {
                    this.f22758f.mo14124a();
                    return new C9608f0(this.f22755c, abstractC10001lArr);
                }
                try {
                    m14564c.mo13309a(new C9700b(this, c10060t0, c9502d), (Executor) C5042j.m25814a(c9502d.m14562e(), C9697l.this.f22752e), c9722n1);
                } catch (Throwable th) {
                    c9722n1.m14127a(C9497c1.f22192k.m14578r("Credentials should use fail() instead of throwing exceptions").m14579q(th));
                }
                return c9722n1.m14125c();
            } else if (this.f22754b.get() >= 0) {
                return new C9608f0(this.f22755c, abstractC10001lArr);
            } else {
                return this.f22753a.mo13637b(c10060t0, c10049s0, c9502d, abstractC10001lArr);
            }
        }

        @Override // io.grpc.p384h1.AbstractC9692k0, io.grpc.p384h1.InterfaceC9693k1
        /* renamed from: c */
        public void mo13635c(C9497c1 c9497c1) {
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            synchronized (this) {
                if (this.f22754b.get() < 0) {
                    this.f22755c = c9497c1;
                    this.f22754b.addAndGet(Integer.MAX_VALUE);
                    if (this.f22754b.get() != 0) {
                        this.f22756d = c9497c1;
                    } else {
                        super.mo13635c(c9497c1);
                    }
                }
            }
        }

        @Override // io.grpc.p384h1.AbstractC9692k0, io.grpc.p384h1.InterfaceC9693k1
        /* renamed from: d */
        public void mo13633d(C9497c1 c9497c1) {
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            synchronized (this) {
                if (this.f22754b.get() < 0) {
                    this.f22755c = c9497c1;
                    this.f22754b.addAndGet(Integer.MAX_VALUE);
                } else if (this.f22757e != null) {
                    return;
                }
                if (this.f22754b.get() != 0) {
                    this.f22757e = c9497c1;
                } else {
                    super.mo13633d(c9497c1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9697l(InterfaceC9780t interfaceC9780t, AbstractC9490c abstractC9490c, Executor executor) {
        C5051n.m25779o(interfaceC9780t, "delegate");
        this.f22750c = interfaceC9780t;
        this.f22751d = abstractC9490c;
        C5051n.m25779o(executor, "appExecutor");
        this.f22752e = executor;
    }

    @Override // io.grpc.p384h1.InterfaceC9780t
    /* renamed from: S0 */
    public ScheduledExecutorService mo13717S0() {
        return this.f22750c.mo13717S0();
    }

    @Override // io.grpc.p384h1.InterfaceC9780t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22750c.close();
    }

    @Override // io.grpc.p384h1.InterfaceC9780t
    /* renamed from: q0 */
    public InterfaceC9798v mo13716q0(SocketAddress socketAddress, InterfaceC9780t.C9781a c9781a, AbstractC9520g abstractC9520g) {
        return new C9698a(this.f22750c.mo13716q0(socketAddress, c9781a, abstractC9520g), c9781a.m13994a());
    }
}
