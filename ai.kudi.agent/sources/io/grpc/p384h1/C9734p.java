package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import com.google.common.util.concurrent.C5162d;
import io.grpc.AbstractC10001l;
import io.grpc.AbstractC9509e0;
import io.grpc.AbstractC9524h;
import io.grpc.C10036p;
import io.grpc.C10043s;
import io.grpc.C10049s0;
import io.grpc.C10059t;
import io.grpc.C10060t0;
import io.grpc.C10065u;
import io.grpc.C10082w;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.C9518f0;
import io.grpc.InterfaceC10014m;
import io.grpc.InterfaceC10033o;
import io.grpc.p384h1.C9685j1;
import io.grpc.p384h1.InterfaceC9695k2;
import io.grpc.p384h1.InterfaceC9753r;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p425j.p443d.C11266b;
import p425j.p443d.C11267c;
import p425j.p443d.C11268d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClientCallImpl.java */
/* renamed from: io.grpc.h1.p */
/* loaded from: classes2.dex */
public final class C9734p<ReqT, RespT> extends AbstractC9524h<ReqT, RespT> {

    /* renamed from: t */
    private static final Logger f22844t = Logger.getLogger(C9734p.class.getName());

    /* renamed from: u */
    private static final byte[] f22845u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: a */
    private final C10060t0<ReqT, RespT> f22846a;

    /* renamed from: b */
    private final C11268d f22847b;

    /* renamed from: c */
    private final Executor f22848c;

    /* renamed from: d */
    private final boolean f22849d;

    /* renamed from: e */
    private final C9710m f22850e;

    /* renamed from: f */
    private final C10043s f22851f;

    /* renamed from: g */
    private volatile ScheduledFuture<?> f22852g;

    /* renamed from: h */
    private final boolean f22853h;

    /* renamed from: i */
    private C9502d f22854i;

    /* renamed from: j */
    private InterfaceC9749q f22855j;

    /* renamed from: k */
    private volatile boolean f22856k;

    /* renamed from: l */
    private boolean f22857l;

    /* renamed from: m */
    private boolean f22858m;

    /* renamed from: n */
    private final InterfaceC9743e f22859n;

    /* renamed from: p */
    private final ScheduledExecutorService f22861p;

    /* renamed from: q */
    private boolean f22862q;

    /* renamed from: o */
    private final C9734p<ReqT, RespT>.C9744f f22860o = new C9744f();

    /* renamed from: r */
    private C10082w f22863r = C10082w.m13099c();

    /* renamed from: s */
    private C10036p f22864s = C10036p.m13253a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$b */
    /* loaded from: classes2.dex */
    public class C9736b extends AbstractRunnableC9810x {

        /* renamed from: d */
        final /* synthetic */ AbstractC9524h.AbstractC9525a f22865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9736b(AbstractC9524h.AbstractC9525a abstractC9525a) {
            super(C9734p.this.f22851f);
            this.f22865d = abstractC9525a;
        }

        @Override // io.grpc.p384h1.AbstractRunnableC9810x
        /* renamed from: a */
        public void mo13845a() {
            C9734p c9734p = C9734p.this;
            c9734p.m14092r(this.f22865d, C10059t.m13171a(c9734p.f22851f), new C10049s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$c */
    /* loaded from: classes2.dex */
    public class C9737c extends AbstractRunnableC9810x {

        /* renamed from: d */
        final /* synthetic */ AbstractC9524h.AbstractC9525a f22867d;

        /* renamed from: e */
        final /* synthetic */ String f22868e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9737c(AbstractC9524h.AbstractC9525a abstractC9525a, String str) {
            super(C9734p.this.f22851f);
            this.f22867d = abstractC9525a;
            this.f22868e = str;
        }

        @Override // io.grpc.p384h1.AbstractRunnableC9810x
        /* renamed from: a */
        public void mo13845a() {
            C9734p.this.m14092r(this.f22867d, C9497c1.f22194m.m14578r(String.format("Unable to find compressor by name %s", this.f22868e)), new C10049s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$d */
    /* loaded from: classes2.dex */
    public class C9738d implements InterfaceC9753r {

        /* renamed from: a */
        private final AbstractC9524h.AbstractC9525a<RespT> f22870a;

        /* renamed from: b */
        private C9497c1 f22871b;

        /* compiled from: ClientCallImpl.java */
        /* renamed from: io.grpc.h1.p$d$a */
        /* loaded from: classes2.dex */
        final class C9739a extends AbstractRunnableC9810x {

            /* renamed from: d */
            final /* synthetic */ C11266b f22873d;

            /* renamed from: e */
            final /* synthetic */ C10049s0 f22874e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9739a(C11266b c11266b, C10049s0 c10049s0) {
                super(C9734p.this.f22851f);
                this.f22873d = c11266b;
                this.f22874e = c10049s0;
            }

            /* renamed from: b */
            private void m14078b() {
                if (C9738d.this.f22871b != null) {
                    return;
                }
                try {
                    C9738d.this.f22870a.mo13342b(this.f22874e);
                } catch (Throwable th) {
                    C9738d.this.m14079i(C9497c1.f22188g.m14579q(th).m14578r("Failed to read headers"));
                }
            }

            @Override // io.grpc.p384h1.AbstractRunnableC9810x
            /* renamed from: a */
            public void mo13845a() {
                C11267c.m11253g("ClientCall$Listener.headersRead", C9734p.this.f22847b);
                C11267c.m11256d(this.f22873d);
                try {
                    m14078b();
                } finally {
                    C11267c.m11251i("ClientCall$Listener.headersRead", C9734p.this.f22847b);
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* renamed from: io.grpc.h1.p$d$b */
        /* loaded from: classes2.dex */
        final class C9740b extends AbstractRunnableC9810x {

            /* renamed from: d */
            final /* synthetic */ C11266b f22876d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC9695k2.InterfaceC9696a f22877e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9740b(C11266b c11266b, InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
                super(C9734p.this.f22851f);
                this.f22876d = c11266b;
                this.f22877e = interfaceC9696a;
            }

            /* renamed from: b */
            private void m14077b() {
                if (C9738d.this.f22871b != null) {
                    C9755r0.m14064d(this.f22877e);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f22877e.next();
                        if (next == null) {
                            return;
                        }
                        C9738d.this.f22870a.mo13341c(C9734p.this.f22846a.m13162i(next));
                        next.close();
                    } catch (Throwable th) {
                        C9755r0.m14064d(this.f22877e);
                        C9738d.this.m14079i(C9497c1.f22188g.m14579q(th).m14578r("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.p384h1.AbstractRunnableC9810x
            /* renamed from: a */
            public void mo13845a() {
                C11267c.m11253g("ClientCall$Listener.messagesAvailable", C9734p.this.f22847b);
                C11267c.m11256d(this.f22876d);
                try {
                    m14077b();
                } finally {
                    C11267c.m11251i("ClientCall$Listener.messagesAvailable", C9734p.this.f22847b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ClientCallImpl.java */
        /* renamed from: io.grpc.h1.p$d$c */
        /* loaded from: classes2.dex */
        public final class C9741c extends AbstractRunnableC9810x {

            /* renamed from: d */
            final /* synthetic */ C11266b f22879d;

            /* renamed from: e */
            final /* synthetic */ C9497c1 f22880e;

            /* renamed from: f */
            final /* synthetic */ C10049s0 f22881f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9741c(C11266b c11266b, C9497c1 c9497c1, C10049s0 c10049s0) {
                super(C9734p.this.f22851f);
                this.f22879d = c11266b;
                this.f22880e = c9497c1;
                this.f22881f = c10049s0;
            }

            /* renamed from: b */
            private void m14076b() {
                C9497c1 c9497c1 = this.f22880e;
                C10049s0 c10049s0 = this.f22881f;
                if (C9738d.this.f22871b != null) {
                    c9497c1 = C9738d.this.f22871b;
                    c10049s0 = new C10049s0();
                }
                C9734p.this.f22856k = true;
                try {
                    C9734p.this.m14092r(C9738d.this.f22870a, c9497c1, c10049s0);
                } finally {
                    C9734p.this.m14086x();
                    C9734p.this.f22850e.m14157a(c9497c1.m14580p());
                }
            }

            @Override // io.grpc.p384h1.AbstractRunnableC9810x
            /* renamed from: a */
            public void mo13845a() {
                C11267c.m11253g("ClientCall$Listener.onClose", C9734p.this.f22847b);
                C11267c.m11256d(this.f22879d);
                try {
                    m14076b();
                } finally {
                    C11267c.m11251i("ClientCall$Listener.onClose", C9734p.this.f22847b);
                }
            }
        }

        /* compiled from: ClientCallImpl.java */
        /* renamed from: io.grpc.h1.p$d$d */
        /* loaded from: classes2.dex */
        final class C9742d extends AbstractRunnableC9810x {

            /* renamed from: d */
            final /* synthetic */ C11266b f22883d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9742d(C11266b c11266b) {
                super(C9734p.this.f22851f);
                this.f22883d = c11266b;
            }

            /* renamed from: b */
            private void m14075b() {
                if (C9738d.this.f22871b != null) {
                    return;
                }
                try {
                    C9738d.this.f22870a.mo13844d();
                } catch (Throwable th) {
                    C9738d.this.m14079i(C9497c1.f22188g.m14579q(th).m14578r("Failed to call onReady."));
                }
            }

            @Override // io.grpc.p384h1.AbstractRunnableC9810x
            /* renamed from: a */
            public void mo13845a() {
                C11267c.m11253g("ClientCall$Listener.onReady", C9734p.this.f22847b);
                C11267c.m11256d(this.f22883d);
                try {
                    m14075b();
                } finally {
                    C11267c.m11251i("ClientCall$Listener.onReady", C9734p.this.f22847b);
                }
            }
        }

        public C9738d(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a) {
            C5051n.m25779o(abstractC9525a, "observer");
            this.f22870a = abstractC9525a;
        }

        /* renamed from: h */
        private void m14080h(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
            C10065u m14091s = C9734p.this.m14091s();
            if (c9497c1.m14582n() == C9497c1.EnumC9499b.CANCELLED && m14091s != null && m14091s.m13145j()) {
                C9811x0 c9811x0 = new C9811x0();
                C9734p.this.f22855j.mo13785k(c9811x0);
                C9497c1 c9497c12 = C9497c1.f22190i;
                c9497c1 = c9497c12.m14590f("ClientCall was cancelled at or after deadline. " + c9811x0);
                c10049s0 = new C10049s0();
            }
            C9734p.this.f22848c.execute(new C9741c(C11267c.m11255e(), c9497c1, c10049s0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public void m14079i(C9497c1 c9497c1) {
            this.f22871b = c9497c1;
            C9734p.this.f22855j.mo13804a(c9497c1);
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: a */
        public void mo13769a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
            C11267c.m11253g("ClientStreamListener.messagesAvailable", C9734p.this.f22847b);
            try {
                C9734p.this.f22848c.execute(new C9740b(C11267c.m11255e(), interfaceC9696a));
            } finally {
                C11267c.m11251i("ClientStreamListener.messagesAvailable", C9734p.this.f22847b);
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: b */
        public void mo13768b(C10049s0 c10049s0) {
            C11267c.m11253g("ClientStreamListener.headersRead", C9734p.this.f22847b);
            try {
                C9734p.this.f22848c.execute(new C9739a(C11267c.m11255e(), c10049s0));
            } finally {
                C11267c.m11251i("ClientStreamListener.headersRead", C9734p.this.f22847b);
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9695k2
        /* renamed from: c */
        public void mo13767c() {
            if (C9734p.this.f22846a.m13166e().m13152a()) {
                return;
            }
            C11267c.m11253g("ClientStreamListener.onReady", C9734p.this.f22847b);
            try {
                C9734p.this.f22848c.execute(new C9742d(C11267c.m11255e()));
            } finally {
                C11267c.m11251i("ClientStreamListener.onReady", C9734p.this.f22847b);
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9753r
        /* renamed from: d */
        public void mo13766d(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
            C11267c.m11253g("ClientStreamListener.closed", C9734p.this.f22847b);
            try {
                m14080h(c9497c1, enumC9754a, c10049s0);
            } finally {
                C11267c.m11251i("ClientStreamListener.closed", C9734p.this.f22847b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC9743e {
        /* renamed from: a */
        InterfaceC9749q mo14074a(C10060t0<?, ?> c10060t0, C9502d c9502d, C10049s0 c10049s0, C10043s c10043s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$f */
    /* loaded from: classes2.dex */
    public final class C9744f implements C10043s.InterfaceC10045b {
        private C9744f() {
        }

        @Override // io.grpc.C10043s.InterfaceC10045b
        /* renamed from: a */
        public void mo13223a(C10043s c10043s) {
            C9734p.this.f22855j.mo13804a(C10059t.m13171a(c10043s));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ClientCallImpl.java */
    /* renamed from: io.grpc.h1.p$g */
    /* loaded from: classes2.dex */
    public class RunnableC9745g implements Runnable {

        /* renamed from: c */
        private final long f22886c;

        RunnableC9745g(long j) {
            this.f22886c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9811x0 c9811x0 = new C9811x0();
            C9734p.this.f22855j.mo13785k(c9811x0);
            long abs = Math.abs(this.f22886c) / TimeUnit.SECONDS.toNanos(1L);
            long abs2 = Math.abs(this.f22886c) % TimeUnit.SECONDS.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f22886c < 0) {
                sb.append('-');
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            sb.append(c9811x0);
            C9734p.this.f22855j.mo13804a(C9497c1.f22190i.m14590f(sb.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9734p(C10060t0<ReqT, RespT> c10060t0, Executor executor, C9502d c9502d, InterfaceC9743e interfaceC9743e, ScheduledExecutorService scheduledExecutorService, C9710m c9710m, AbstractC9509e0 abstractC9509e0) {
        this.f22846a = c10060t0;
        this.f22847b = C11267c.m11258b(c10060t0.m13168c(), System.identityHashCode(this));
        boolean z = true;
        if (executor == C5162d.m25489a()) {
            this.f22848c = new ExecutorC9581c2();
            this.f22849d = true;
        } else {
            this.f22848c = new ExecutorC9587d2(executor);
            this.f22849d = false;
        }
        this.f22850e = c9710m;
        this.f22851f = C10043s.m13237I();
        if (c10060t0.m13166e() != C10060t0.EnumC10064d.UNARY && c10060t0.m13166e() != C10060t0.EnumC10064d.SERVER_STREAMING) {
            z = false;
        }
        this.f22853h = z;
        this.f22854i = c9502d;
        this.f22859n = interfaceC9743e;
        this.f22861p = scheduledExecutorService;
        C11267c.m11257c("ClientCall.<init>", this.f22847b);
    }

    /* renamed from: C */
    private ScheduledFuture<?> m14106C(C10065u c10065u) {
        long m13143n = c10065u.m13143n(TimeUnit.NANOSECONDS);
        return this.f22861p.schedule(new RunnableC9586d1(new RunnableC9745g(m13143n)), m13143n, TimeUnit.NANOSECONDS);
    }

    /* renamed from: D */
    private void m14105D(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
        InterfaceC10033o interfaceC10033o;
        boolean z = true;
        C5051n.m25773u(this.f22855j == null, "Already started");
        C5051n.m25773u(!this.f22857l, "call was cancelled");
        C5051n.m25779o(abstractC9525a, "observer");
        C5051n.m25779o(c10049s0, "headers");
        if (this.f22851f.mo13230P()) {
            this.f22855j = C9729o1.f22834a;
            this.f22848c.execute(new C9736b(abstractC9525a));
            return;
        }
        m14094p();
        String m14565b = this.f22854i.m14565b();
        if (m14565b != null) {
            interfaceC10033o = this.f22864s.m13252b(m14565b);
            if (interfaceC10033o == null) {
                this.f22855j = C9729o1.f22834a;
                this.f22848c.execute(new C9737c(abstractC9525a, m14565b));
                return;
            }
        } else {
            interfaceC10033o = InterfaceC10014m.C10016b.f23740a;
        }
        m14087w(c10049s0, this.f22863r, interfaceC10033o, this.f22862q);
        C10065u m14091s = m14091s();
        if (!((m14091s == null || !m14091s.m13145j()) ? false : false)) {
            m14089u(m14091s, this.f22851f.mo13231O(), this.f22854i.m14563d());
            this.f22855j = this.f22859n.mo14074a(this.f22846a, this.f22854i, c10049s0, this.f22851f);
        } else {
            AbstractC10001l[] m14062f = C9755r0.m14062f(this.f22854i, c10049s0, 0, false);
            C9497c1 c9497c1 = C9497c1.f22190i;
            this.f22855j = new C9608f0(c9497c1.m14578r("ClientCall started after deadline exceeded: " + m14091s), m14062f);
        }
        if (this.f22849d) {
            this.f22855j.mo13794f();
        }
        if (this.f22854i.m14566a() != null) {
            this.f22855j.mo13691j(this.f22854i.m14566a());
        }
        if (this.f22854i.m14561f() != null) {
            this.f22855j.mo13792g(this.f22854i.m14561f().intValue());
        }
        if (this.f22854i.m14560g() != null) {
            this.f22855j.mo13790h(this.f22854i.m14560g().intValue());
        }
        if (m14091s != null) {
            this.f22855j.mo13782n(m14091s);
        }
        this.f22855j.mo13802b(interfaceC10033o);
        boolean z2 = this.f22862q;
        if (z2) {
            this.f22855j.mo13779q(z2);
        }
        this.f22855j.mo13788i(this.f22863r);
        this.f22850e.m14156b();
        this.f22855j.mo13781o(new C9738d(abstractC9525a));
        this.f22851f.m13233c(this.f22860o, C5162d.m25489a());
        if (m14091s != null && !m14091s.equals(this.f22851f.mo13231O()) && this.f22861p != null) {
            this.f22852g = m14106C(m14091s);
        }
        if (this.f22856k) {
            m14086x();
        }
    }

    /* renamed from: p */
    private void m14094p() {
        C9685j1.C9687b c9687b = (C9685j1.C9687b) this.f22854i.m14559h(C9685j1.C9687b.f22742g);
        if (c9687b == null) {
            return;
        }
        Long l = c9687b.f22743a;
        if (l != null) {
            C10065u m13151a = C10065u.m13151a(l.longValue(), TimeUnit.NANOSECONDS);
            C10065u m14563d = this.f22854i.m14563d();
            if (m14563d == null || m13151a.compareTo(m14563d) < 0) {
                this.f22854i = this.f22854i.m14556k(m13151a);
            }
        }
        Boolean bool = c9687b.f22744b;
        if (bool != null) {
            this.f22854i = bool.booleanValue() ? this.f22854i.m14549r() : this.f22854i.m14548s();
        }
        if (c9687b.f22745c != null) {
            Integer m14561f = this.f22854i.m14561f();
            if (m14561f != null) {
                this.f22854i = this.f22854i.m14553n(Math.min(m14561f.intValue(), c9687b.f22745c.intValue()));
            } else {
                this.f22854i = this.f22854i.m14553n(c9687b.f22745c.intValue());
            }
        }
        if (c9687b.f22746d != null) {
            Integer m14560g = this.f22854i.m14560g();
            if (m14560g != null) {
                this.f22854i = this.f22854i.m14552o(Math.min(m14560g.intValue(), c9687b.f22746d.intValue()));
            } else {
                this.f22854i = this.f22854i.m14552o(c9687b.f22746d.intValue());
            }
        }
    }

    /* renamed from: q */
    private void m14093q(String str, Throwable th) {
        C9497c1 m14578r;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f22844t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f22857l) {
            return;
        }
        this.f22857l = true;
        try {
            if (this.f22855j != null) {
                C9497c1 c9497c1 = C9497c1.f22188g;
                if (str != null) {
                    m14578r = c9497c1.m14578r(str);
                } else {
                    m14578r = c9497c1.m14578r("Call cancelled without message");
                }
                if (th != null) {
                    m14578r = m14578r.m14579q(th);
                }
                this.f22855j.mo13804a(m14578r);
            }
        } finally {
            m14086x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m14092r(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C9497c1 c9497c1, C10049s0 c10049s0) {
        abstractC9525a.mo13343a(c9497c1, c10049s0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public C10065u m14091s() {
        return m14088v(this.f22854i.m14563d(), this.f22851f.mo13231O());
    }

    /* renamed from: t */
    private void m14090t() {
        C5051n.m25773u(this.f22855j != null, "Not started");
        C5051n.m25773u(!this.f22857l, "call was cancelled");
        C5051n.m25773u(!this.f22858m, "call already half-closed");
        this.f22858m = true;
        this.f22855j.mo13783l();
    }

    /* renamed from: u */
    private static void m14089u(C10065u c10065u, C10065u c10065u2, C10065u c10065u3) {
        if (f22844t.isLoggable(Level.FINE) && c10065u != null && c10065u.equals(c10065u2)) {
            StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, c10065u.m13143n(TimeUnit.NANOSECONDS)))));
            if (c10065u3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(c10065u3.m13143n(TimeUnit.NANOSECONDS))));
            }
            f22844t.fine(sb.toString());
        }
    }

    /* renamed from: v */
    private static C10065u m14088v(C10065u c10065u, C10065u c10065u2) {
        return c10065u == null ? c10065u2 : c10065u2 == null ? c10065u : c10065u.m13144m(c10065u2);
    }

    /* renamed from: w */
    static void m14087w(C10049s0 c10049s0, C10082w c10082w, InterfaceC10033o interfaceC10033o, boolean z) {
        c10049s0.m13213d(C9755r0.f22903c);
        if (interfaceC10033o != InterfaceC10014m.C10016b.f23740a) {
            c10049s0.m13203n(C9755r0.f22903c, interfaceC10033o.mo13106a());
        }
        c10049s0.m13213d(C9755r0.f22904d);
        byte[] m14528a = C9518f0.m14528a(c10082w);
        if (m14528a.length != 0) {
            c10049s0.m13203n(C9755r0.f22904d, m14528a);
        }
        c10049s0.m13213d(C9755r0.f22905e);
        c10049s0.m13213d(C9755r0.f22906f);
        if (z) {
            c10049s0.m13203n(C9755r0.f22906f, f22845u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m14086x() {
        this.f22851f.mo13229V(this.f22860o);
        ScheduledFuture<?> scheduledFuture = this.f22852g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: y */
    private void m14085y(ReqT reqt) {
        C5051n.m25773u(this.f22855j != null, "Not started");
        C5051n.m25773u(!this.f22857l, "call was cancelled");
        C5051n.m25773u(!this.f22858m, "call was half-closed");
        try {
            if (this.f22855j instanceof AbstractC9857z1) {
                ((AbstractC9857z1) this.f22855j).m13786j0(reqt);
            } else {
                this.f22855j.mo13796e(this.f22846a.m13161j(reqt));
            }
            if (this.f22853h) {
                return;
            }
            this.f22855j.flush();
        } catch (Error e) {
            this.f22855j.mo13804a(C9497c1.f22188g.m14578r("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f22855j.mo13804a(C9497c1.f22188g.m14579q(e2).m14578r("Failed to stream message"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public C9734p<ReqT, RespT> m14108A(C10082w c10082w) {
        this.f22863r = c10082w;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public C9734p<ReqT, RespT> m14107B(boolean z) {
        this.f22862q = z;
        return this;
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: a */
    public void mo13081a(String str, Throwable th) {
        C11267c.m11253g("ClientCall.cancel", this.f22847b);
        try {
            m14093q(str, th);
        } finally {
            C11267c.m11251i("ClientCall.cancel", this.f22847b);
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: b */
    public void mo13080b() {
        C11267c.m11253g("ClientCall.halfClose", this.f22847b);
        try {
            m14090t();
        } finally {
            C11267c.m11251i("ClientCall.halfClose", this.f22847b);
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: c */
    public void mo13079c(int i) {
        C11267c.m11253g("ClientCall.request", this.f22847b);
        try {
            boolean z = true;
            C5051n.m25773u(this.f22855j != null, "Not started");
            if (i < 0) {
                z = false;
            }
            C5051n.m25789e(z, "Number requested must be non-negative");
            this.f22855j.mo13800c(i);
        } finally {
            C11267c.m11251i("ClientCall.request", this.f22847b);
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: d */
    public void mo13076d(ReqT reqt) {
        C11267c.m11253g("ClientCall.sendMessage", this.f22847b);
        try {
            m14085y(reqt);
        } finally {
            C11267c.m11251i("ClientCall.sendMessage", this.f22847b);
        }
    }

    @Override // io.grpc.AbstractC9524h
    /* renamed from: e */
    public void mo13075e(AbstractC9524h.AbstractC9525a<RespT> abstractC9525a, C10049s0 c10049s0) {
        C11267c.m11253g("ClientCall.start", this.f22847b);
        try {
            m14105D(abstractC9525a, c10049s0);
        } finally {
            C11267c.m11251i("ClientCall.start", this.f22847b);
        }
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("method", this.f22846a);
        return m25812c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public C9734p<ReqT, RespT> m14084z(C10036p c10036p) {
        this.f22864s = c10036p;
        return this;
    }
}
