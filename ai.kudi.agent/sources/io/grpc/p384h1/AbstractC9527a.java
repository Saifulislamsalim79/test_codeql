package io.grpc.p384h1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5051n;
import com.google.common.p109io.C5141a;
import io.grpc.C10049s0;
import io.grpc.C10065u;
import io.grpc.C10082w;
import io.grpc.C9481a0;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.InterfaceC10033o;
import io.grpc.p384h1.AbstractC9582d;
import io.grpc.p384h1.C9713m1;
import io.grpc.p384h1.InterfaceC9753r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: AbstractClientStream.java */
/* renamed from: io.grpc.h1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC9527a extends AbstractC9582d implements InterfaceC9749q, C9713m1.InterfaceC9717d {

    /* renamed from: g */
    private static final Logger f22283g = Logger.getLogger(AbstractC9527a.class.getName());

    /* renamed from: a */
    private final C9730o2 f22284a;

    /* renamed from: b */
    private final InterfaceC9746p0 f22285b;

    /* renamed from: c */
    private boolean f22286c;

    /* renamed from: d */
    private boolean f22287d;

    /* renamed from: e */
    private C10049s0 f22288e;

    /* renamed from: f */
    private volatile boolean f22289f;

    /* compiled from: AbstractClientStream.java */
    /* renamed from: io.grpc.h1.a$a */
    /* loaded from: classes2.dex */
    private class C9528a implements InterfaceC9746p0 {

        /* renamed from: a */
        private C10049s0 f22290a;

        /* renamed from: b */
        private boolean f22291b;

        /* renamed from: c */
        private final C9676i2 f22292c;

        /* renamed from: d */
        private byte[] f22293d;

        public C9528a(C10049s0 c10049s0, C9676i2 c9676i2) {
            C5051n.m25779o(c10049s0, "headers");
            this.f22290a = c10049s0;
            C5051n.m25779o(c9676i2, "statsTraceCtx");
            this.f22292c = c9676i2;
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        /* renamed from: b */
        public InterfaceC9746p0 mo14073b(InterfaceC10033o interfaceC10033o) {
            return this;
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        /* renamed from: c */
        public void mo14072c(InputStream inputStream) {
            C5051n.m25773u(this.f22293d == null, "writePayload should not be called multiple times");
            try {
                this.f22293d = C5141a.m25525d(inputStream);
                this.f22292c.m14211i(0);
                C9676i2 c9676i2 = this.f22292c;
                byte[] bArr = this.f22293d;
                c9676i2.m14210j(0, bArr.length, bArr.length);
                this.f22292c.m14209k(this.f22293d.length);
                this.f22292c.m14208l(this.f22293d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        public void close() {
            this.f22291b = true;
            C5051n.m25773u(this.f22293d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC9527a.this.mo13688v().mo13684c(this.f22290a, this.f22293d);
            this.f22293d = null;
            this.f22290a = null;
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        public void flush() {
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        /* renamed from: h */
        public void mo14071h(int i) {
        }

        @Override // io.grpc.p384h1.InterfaceC9746p0
        public boolean isClosed() {
            return this.f22291b;
        }
    }

    /* compiled from: AbstractClientStream.java */
    /* renamed from: io.grpc.h1.a$b */
    /* loaded from: classes2.dex */
    protected interface InterfaceC9529b {
        /* renamed from: a */
        void mo13686a(C9497c1 c9497c1);

        /* renamed from: b */
        void mo13685b(InterfaceC9748p2 interfaceC9748p2, boolean z, boolean z2, int i);

        /* renamed from: c */
        void mo13684c(C10049s0 c10049s0, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AbstractClientStream.java */
    /* renamed from: io.grpc.h1.a$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9530c extends AbstractC9582d.AbstractC9583a {

        /* renamed from: h */
        private final C9676i2 f22295h;

        /* renamed from: i */
        private boolean f22296i;

        /* renamed from: j */
        private InterfaceC9753r f22297j;

        /* renamed from: k */
        private boolean f22298k;

        /* renamed from: l */
        private C10082w f22299l;

        /* renamed from: m */
        private boolean f22300m;

        /* renamed from: n */
        private Runnable f22301n;

        /* renamed from: o */
        private volatile boolean f22302o;

        /* renamed from: p */
        private boolean f22303p;

        /* renamed from: q */
        private boolean f22304q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractClientStream.java */
        /* renamed from: io.grpc.h1.a$c$a */
        /* loaded from: classes2.dex */
        public class RunnableC9531a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C9497c1 f22305c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC9753r.EnumC9754a f22306d;

            /* renamed from: e */
            final /* synthetic */ C10049s0 f22307e;

            RunnableC9531a(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
                this.f22305c = c9497c1;
                this.f22306d = enumC9754a;
                this.f22307e = c10049s0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC9530c.this.m14516C(this.f22305c, this.f22306d, this.f22307e);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC9530c(int i, C9676i2 c9676i2, C9730o2 c9730o2) {
            super(i, c9676i2, c9730o2);
            this.f22299l = C10082w.m13099c();
            this.f22300m = false;
            C5051n.m25779o(c9676i2, "statsTraceCtx");
            this.f22295h = c9676i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public void m14516C(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, C10049s0 c10049s0) {
            if (this.f22296i) {
                return;
            }
            this.f22296i = true;
            this.f22295h.m14207m(c9497c1);
            mo14390n().mo13766d(c9497c1, enumC9754a, c10049s0);
            if (m14392l() != null) {
                m14392l().m14111f(c9497c1.m14580p());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public void m14510I(C10082w c10082w) {
            C5051n.m25773u(this.f22297j == null, "Already called start");
            C5051n.m25779o(c10082w, "decompressorRegistry");
            this.f22299l = c10082w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public void m14509J(boolean z) {
            this.f22298k = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m14507L() {
            this.f22302o = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: D */
        public void m14515D(InterfaceC9802v1 interfaceC9802v1) {
            C5051n.m25779o(interfaceC9802v1, "frame");
            try {
                if (this.f22303p) {
                    AbstractC9527a.f22283g.log(Level.INFO, "Received data on closed stream");
                    interfaceC9802v1.close();
                    return;
                }
                m14393k(interfaceC9802v1);
            } catch (Throwable th) {
                if (1 != 0) {
                    interfaceC9802v1.close();
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m14514E(io.grpc.C10049s0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f22303p
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                com.google.common.base.C5051n.m25773u(r0, r2)
                io.grpc.h1.i2 r0 = r5.f22295h
                r0.m14219a()
                io.grpc.s0$f<java.lang.String> r0 = io.grpc.p384h1.C9755r0.f22905e
                java.lang.Object r0 = r6.m13211f(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f22298k
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.h1.s0 r0 = new io.grpc.h1.s0
                r0.<init>()
                r5.m14382w(r0)
                r0 = 1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                io.grpc.c1 r6 = io.grpc.C9497c1.f22194m
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                io.grpc.c1 r6 = r6.m14578r(r0)
                io.grpc.StatusRuntimeException r6 = r6.m14592d()
                r5.mo13673d(r6)
                return
            L4f:
                r0 = 0
            L50:
                io.grpc.s0$f<java.lang.String> r2 = io.grpc.p384h1.C9755r0.f22903c
                java.lang.Object r2 = r6.m13211f(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L99
                io.grpc.w r4 = r5.f22299l
                io.grpc.v r4 = r4.m13097e(r2)
                if (r4 != 0) goto L7a
                io.grpc.c1 r6 = io.grpc.C9497c1.f22194m
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.c1 r6 = r6.m14578r(r0)
                io.grpc.StatusRuntimeException r6 = r6.m14592d()
                r5.mo13673d(r6)
                return
            L7a:
                io.grpc.m r1 = io.grpc.InterfaceC10014m.C10016b.f23740a
                if (r4 == r1) goto L99
                if (r0 == 0) goto L96
                io.grpc.c1 r6 = io.grpc.C9497c1.f22194m
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                io.grpc.c1 r6 = r6.m14578r(r0)
                io.grpc.StatusRuntimeException r6 = r6.m14592d()
                r5.mo13673d(r6)
                return
            L96:
                r5.m14383v(r4)
            L99:
                io.grpc.h1.r r0 = r5.mo14390n()
                r0.mo13768b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.AbstractC9527a.AbstractC9530c.m14514E(io.grpc.s0):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: F */
        public void m14513F(C10049s0 c10049s0, C9497c1 c9497c1) {
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            C5051n.m25779o(c10049s0, "trailers");
            if (this.f22303p) {
                AbstractC9527a.f22283g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c9497c1, c10049s0});
                return;
            }
            this.f22295h.m14218b(c10049s0);
            m14505N(c9497c1, false, c10049s0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: G */
        public final boolean m14512G() {
            return this.f22302o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.p384h1.AbstractC9582d.AbstractC9583a
        /* renamed from: H */
        public final InterfaceC9753r mo14390n() {
            return this.f22297j;
        }

        /* renamed from: K */
        public final void m14508K(InterfaceC9753r interfaceC9753r) {
            C5051n.m25773u(this.f22297j == null, "Already called setListener");
            C5051n.m25779o(interfaceC9753r, "listener");
            this.f22297j = interfaceC9753r;
        }

        /* renamed from: M */
        public final void m14506M(C9497c1 c9497c1, InterfaceC9753r.EnumC9754a enumC9754a, boolean z, C10049s0 c10049s0) {
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            C5051n.m25779o(c10049s0, "trailers");
            if (!this.f22303p || z) {
                this.f22303p = true;
                this.f22304q = c9497c1.m14580p();
                m14386s();
                if (this.f22300m) {
                    this.f22301n = null;
                    m14516C(c9497c1, enumC9754a, c10049s0);
                    return;
                }
                this.f22301n = new RunnableC9531a(c9497c1, enumC9754a, c10049s0);
                m14394j(z);
            }
        }

        /* renamed from: N */
        public final void m14505N(C9497c1 c9497c1, boolean z, C10049s0 c10049s0) {
            m14506M(c9497c1, InterfaceC9753r.EnumC9754a.PROCESSED, z, c10049s0);
        }

        @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
        /* renamed from: b */
        public void mo13677b(boolean z) {
            C5051n.m25773u(this.f22303p, "status should have been reported on deframer closed");
            this.f22300m = true;
            if (this.f22304q && z) {
                m14505N(C9497c1.f22194m.m14578r("Encountered end-of-stream mid-frame"), true, new C10049s0());
            }
            Runnable runnable = this.f22301n;
            if (runnable != null) {
                runnable.run();
                this.f22301n = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9527a(InterfaceC9752q2 interfaceC9752q2, C9676i2 c9676i2, C9730o2 c9730o2, C10049s0 c10049s0, C9502d c9502d, boolean z) {
        C5051n.m25779o(c10049s0, "headers");
        C5051n.m25779o(c9730o2, "transportTracer");
        this.f22284a = c9730o2;
        this.f22286c = C9755r0.m14053o(c9502d);
        this.f22287d = z;
        if (!z) {
            this.f22285b = new C9713m1(this, interfaceC9752q2, c9676i2);
            this.f22288e = c10049s0;
            return;
        }
        this.f22285b = new C9528a(c10049s0, c9676i2);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: a */
    public final void mo13804a(C9497c1 c9497c1) {
        C5051n.m25789e(!c9497c1.m14580p(), "Should not cancel with OK status");
        this.f22289f = true;
        mo13688v().mo13686a(c9497c1);
    }

    @Override // io.grpc.p384h1.AbstractC9582d, io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: d */
    public final boolean mo13798d() {
        return super.mo13798d() && !this.f22289f;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: g */
    public void mo13792g(int i) {
        mo13689u().m14381x(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: h */
    public void mo13790h(int i) {
        this.f22285b.mo14071h(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: i */
    public final void mo13788i(C10082w c10082w) {
        mo13689u().m14510I(c10082w);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: k */
    public final void mo13785k(C9811x0 c9811x0) {
        c9811x0.m13938b("remote_addr", mo13690m().m14630b(C9481a0.f22164a));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: l */
    public final void mo13783l() {
        if (mo13689u().m14512G()) {
            return;
        }
        mo13689u().m14507L();
        m14401r();
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: n */
    public void mo13782n(C10065u c10065u) {
        this.f22288e.m13213d(C9755r0.f22902b);
        this.f22288e.m13203n(C9755r0.f22902b, Long.valueOf(Math.max(0L, c10065u.m13143n(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: o */
    public final void mo13781o(InterfaceC9753r interfaceC9753r) {
        mo13689u().m14508K(interfaceC9753r);
        if (this.f22287d) {
            return;
        }
        mo13688v().mo13684c(this.f22288e, null);
        this.f22288e = null;
    }

    @Override // io.grpc.p384h1.C9713m1.InterfaceC9717d
    /* renamed from: p */
    public final void mo14139p(InterfaceC9748p2 interfaceC9748p2, boolean z, boolean z2, int i) {
        C5051n.m25789e(interfaceC9748p2 != null || z, "null frame before EOS");
        mo13688v().mo13685b(interfaceC9748p2, z, z2, i);
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: q */
    public final void mo13779q(boolean z) {
        mo13689u().m14509J(z);
    }

    @Override // io.grpc.p384h1.AbstractC9582d
    /* renamed from: s */
    protected final InterfaceC9746p0 mo14400s() {
        return this.f22285b;
    }

    /* renamed from: v */
    protected abstract InterfaceC9529b mo13688v();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public C9730o2 m14520x() {
        return this.f22284a;
    }

    /* renamed from: y */
    public final boolean m14519y() {
        return this.f22286c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.p384h1.AbstractC9582d
    /* renamed from: z */
    public abstract AbstractC9530c mo13689u();
}
