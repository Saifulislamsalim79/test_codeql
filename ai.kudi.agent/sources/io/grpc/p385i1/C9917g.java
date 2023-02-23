package io.grpc.p385i1;

import com.google.common.base.C5051n;
import com.google.common.p109io.BaseEncoding;
import io.grpc.C10049s0;
import io.grpc.C10060t0;
import io.grpc.C9477a;
import io.grpc.C9497c1;
import io.grpc.C9502d;
import io.grpc.p384h1.AbstractC9527a;
import io.grpc.p384h1.AbstractC9792u0;
import io.grpc.p384h1.C9676i2;
import io.grpc.p384h1.C9730o2;
import io.grpc.p384h1.InterfaceC9748p2;
import io.grpc.p384h1.InterfaceC9753r;
import io.grpc.p385i1.p386r.p387j.C9966d;
import io.grpc.p385i1.p386r.p387j.EnumC9962a;
import java.util.List;
import p425j.p443d.C11267c;
import p425j.p443d.C11268d;
import p576m.C14342c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OkHttpClientStream.java */
/* renamed from: io.grpc.i1.g */
/* loaded from: classes2.dex */
public class C9917g extends AbstractC9527a {

    /* renamed from: r */
    private static final C14342c f23314r = new C14342c();

    /* renamed from: h */
    private final C10060t0<?, ?> f23315h;

    /* renamed from: i */
    private final String f23316i;

    /* renamed from: j */
    private final C9676i2 f23317j;

    /* renamed from: k */
    private String f23318k;

    /* renamed from: l */
    private Object f23319l;

    /* renamed from: m */
    private volatile int f23320m;

    /* renamed from: n */
    private final C9919b f23321n;

    /* renamed from: o */
    private final C9918a f23322o;

    /* renamed from: p */
    private final C9477a f23323p;

    /* renamed from: q */
    private boolean f23324q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientStream.java */
    /* renamed from: io.grpc.i1.g$a */
    /* loaded from: classes2.dex */
    public class C9918a implements AbstractC9527a.InterfaceC9529b {
        C9918a() {
        }

        @Override // io.grpc.p384h1.AbstractC9527a.InterfaceC9529b
        /* renamed from: a */
        public void mo13686a(C9497c1 c9497c1) {
            C11267c.m11254f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C9917g.this.f23321n.f23339y) {
                    C9917g.this.f23321n.m13678a0(c9497c1, true, null);
                }
            } finally {
                C11267c.m11252h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.p384h1.AbstractC9527a.InterfaceC9529b
        /* renamed from: b */
        public void mo13685b(InterfaceC9748p2 interfaceC9748p2, boolean z, boolean z2, int i) {
            C14342c m13559a;
            C11267c.m11254f("OkHttpClientStream$Sink.writeFrame");
            if (interfaceC9748p2 == null) {
                m13559a = C9917g.f23314r;
            } else {
                m13559a = ((C9936n) interfaceC9748p2).m13559a();
                int m2072F0 = (int) m13559a.m2072F0();
                if (m2072F0 > 0) {
                    C9917g.this.m14399t(m2072F0);
                }
            }
            try {
                synchronized (C9917g.this.f23321n.f23339y) {
                    C9917g.this.f23321n.m13674c0(m13559a, z, z2);
                    C9917g.this.m14520x().m14112e(i);
                }
            } finally {
                C11267c.m11252h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.p384h1.AbstractC9527a.InterfaceC9529b
        /* renamed from: c */
        public void mo13684c(C10049s0 c10049s0, byte[] bArr) {
            C11267c.m11254f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C9917g.this.f23315h.m13168c();
            if (bArr != null) {
                C9917g.this.f23324q = true;
                str = str + "?" + BaseEncoding.m25551b().m25548f(bArr);
            }
            try {
                synchronized (C9917g.this.f23321n.f23339y) {
                    C9917g.this.f23321n.m13670e0(c10049s0, str);
                }
            } finally {
                C11267c.m11252h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpClientStream.java */
    /* renamed from: io.grpc.i1.g$b */
    /* loaded from: classes2.dex */
    public class C9919b extends AbstractC9792u0 {

        /* renamed from: A */
        private C14342c f23326A;

        /* renamed from: B */
        private boolean f23327B;

        /* renamed from: C */
        private boolean f23328C;

        /* renamed from: D */
        private boolean f23329D;

        /* renamed from: E */
        private int f23330E;

        /* renamed from: F */
        private int f23331F;

        /* renamed from: G */
        private final C9904b f23332G;

        /* renamed from: H */
        private final C9938p f23333H;

        /* renamed from: I */
        private final C9920h f23334I;

        /* renamed from: J */
        private boolean f23335J;

        /* renamed from: K */
        private final C11268d f23336K;

        /* renamed from: x */
        private final int f23338x;

        /* renamed from: y */
        private final Object f23339y;

        /* renamed from: z */
        private List<C9966d> f23340z;

        public C9919b(int i, C9676i2 c9676i2, Object obj, C9904b c9904b, C9938p c9938p, C9920h c9920h, int i2, String str) {
            super(i, c9676i2, C9917g.this.m14520x());
            this.f23326A = new C14342c();
            this.f23327B = false;
            this.f23328C = false;
            this.f23329D = false;
            this.f23335J = true;
            C5051n.m25779o(obj, "lock");
            this.f23339y = obj;
            this.f23332G = c9904b;
            this.f23333H = c9938p;
            this.f23334I = c9920h;
            this.f23330E = i2;
            this.f23331F = i2;
            this.f23338x = i2;
            this.f23336K = C11267c.m11259a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public void m13678a0(C9497c1 c9497c1, boolean z, C10049s0 c10049s0) {
            if (this.f23329D) {
                return;
            }
            this.f23329D = true;
            if (this.f23335J) {
                this.f23334I.m13621j0(C9917g.this);
                this.f23340z = null;
                this.f23326A.m2058c();
                this.f23335J = false;
                if (c10049s0 == null) {
                    c10049s0 = new C10049s0();
                }
                m14505N(c9497c1, true, c10049s0);
                return;
            }
            this.f23334I.m13645U(C9917g.this.m13695Q(), c9497c1, InterfaceC9753r.EnumC9754a.PROCESSED, z, EnumC9962a.CANCEL, c10049s0);
        }

        /* renamed from: b0 */
        private void m13676b0() {
            if (!m14512G()) {
                this.f23334I.m13645U(C9917g.this.m13695Q(), null, InterfaceC9753r.EnumC9754a.PROCESSED, false, EnumC9962a.CANCEL, null);
            } else {
                this.f23334I.m13645U(C9917g.this.m13695Q(), null, InterfaceC9753r.EnumC9754a.PROCESSED, false, null, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public void m13674c0(C14342c c14342c, boolean z, boolean z2) {
            if (this.f23329D) {
                return;
            }
            if (this.f23335J) {
                this.f23326A.mo1444r0(c14342c, (int) c14342c.m2072F0());
                this.f23327B |= z;
                this.f23328C |= z2;
                return;
            }
            C5051n.m25773u(C9917g.this.m13695Q() != -1, "streamId should be set");
            this.f23333H.m13551c(z, C9917g.this.m13695Q(), c14342c, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public void m13670e0(C10049s0 c10049s0, String str) {
            this.f23340z = C9906c.m13730a(c10049s0, str, C9917g.this.f23318k, C9917g.this.f23316i, C9917g.this.f23324q, this.f23334I.m13632d0());
            this.f23334I.m13607q0(C9917g.this);
        }

        @Override // io.grpc.p384h1.AbstractC9792u0
        /* renamed from: P */
        protected void mo13683P(C9497c1 c9497c1, boolean z, C10049s0 c10049s0) {
            m13678a0(c9497c1, z, c10049s0);
        }

        @Override // io.grpc.p384h1.AbstractC9527a.AbstractC9530c, io.grpc.p384h1.C9702l1.InterfaceC9704b
        /* renamed from: b */
        public void mo13677b(boolean z) {
            m13676b0();
            super.mo13677b(z);
        }

        @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
        /* renamed from: c */
        public void mo13675c(int i) {
            int i2 = this.f23331F - i;
            this.f23331F = i2;
            int i3 = this.f23338x;
            if (i2 <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.f23330E += i4;
                this.f23331F = i2 + i4;
                this.f23332G.windowUpdate(C9917g.this.m13695Q(), i4);
            }
        }

        @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
        /* renamed from: d */
        public void mo13673d(Throwable th) {
            mo13683P(C9497c1.m14584l(th), true, new C10049s0());
        }

        /* renamed from: d0 */
        public void m13672d0(int i) {
            C5051n.m25772v(C9917g.this.f23320m == -1, "the stream has been started with id %s", i);
            C9917g.this.f23320m = i;
            C9917g.this.f23321n.mo13666r();
            if (this.f23335J) {
                this.f23332G.mo13402W0(C9917g.this.f23324q, false, C9917g.this.f23320m, 0, this.f23340z);
                C9917g.this.f23317j.m14217c();
                this.f23340z = null;
                if (this.f23326A.m2072F0() > 0) {
                    this.f23333H.m13551c(this.f23327B, C9917g.this.f23320m, this.f23326A, this.f23328C);
                }
                this.f23335J = false;
            }
        }

        @Override // io.grpc.p384h1.C9616g.InterfaceC9620d
        /* renamed from: e */
        public void mo13671e(Runnable runnable) {
            synchronized (this.f23339y) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f0 */
        public C11268d m13669f0() {
            return this.f23336K;
        }

        /* renamed from: g0 */
        public void m13668g0(C14342c c14342c, boolean z) {
            int m2072F0 = this.f23330E - ((int) c14342c.m2072F0());
            this.f23330E = m2072F0;
            if (m2072F0 < 0) {
                this.f23332G.mo13405E(C9917g.this.m13695Q(), EnumC9962a.FLOW_CONTROL_ERROR);
                this.f23334I.m13645U(C9917g.this.m13695Q(), C9497c1.f22194m.m14578r("Received data size exceeded our receiving window size"), InterfaceC9753r.EnumC9754a.PROCESSED, false, null, null);
                return;
            }
            super.m13971S(new C9933k(c14342c), z);
        }

        /* renamed from: h0 */
        public void m13667h0(List<C9966d> list, boolean z) {
            if (z) {
                m13969U(C9942q.m13529c(list));
            } else {
                m13970T(C9942q.m13531a(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.p384h1.AbstractC9582d.AbstractC9583a
        /* renamed from: r */
        public void mo13666r() {
            super.mo13666r();
            m14392l().m14114c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9917g(C10060t0<?, ?> c10060t0, C10049s0 c10049s0, C9904b c9904b, C9920h c9920h, C9938p c9938p, Object obj, int i, int i2, String str, String str2, C9676i2 c9676i2, C9730o2 c9730o2, C9502d c9502d, boolean z) {
        super(new C9937o(), c9676i2, c9730o2, c10049s0, c9502d, z && c10060t0.m13165f());
        this.f23320m = -1;
        this.f23322o = new C9918a();
        this.f23324q = false;
        C5051n.m25779o(c9676i2, "statsTraceCtx");
        this.f23317j = c9676i2;
        this.f23315h = c10060t0;
        this.f23318k = str;
        this.f23316i = str2;
        this.f23323p = c9920h.m13643W();
        this.f23321n = new C9919b(i, c9676i2, obj, c9904b, c9938p, c9920h, i2, c10060t0.m13168c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.p384h1.AbstractC9527a
    /* renamed from: A */
    public C9918a mo13688v() {
        return this.f23322o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public Object m13697O() {
        return this.f23319l;
    }

    /* renamed from: P */
    public C10060t0.EnumC10064d m13696P() {
        return this.f23315h.m13166e();
    }

    /* renamed from: Q */
    public int m13695Q() {
        return this.f23320m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m13694R(Object obj) {
        this.f23319l = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.p384h1.AbstractC9527a
    /* renamed from: S */
    public C9919b mo13687z() {
        return this.f23321n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean m13692T() {
        return this.f23324q;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: j */
    public void mo13691j(String str) {
        C5051n.m25779o(str, "authority");
        this.f23318k = str;
    }

    @Override // io.grpc.p384h1.InterfaceC9749q
    /* renamed from: m */
    public C9477a mo13690m() {
        return this.f23323p;
    }
}
