package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13566b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.C13573e;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.u */
/* loaded from: classes3.dex */
public final class C12572u extends AbstractC13580h.AbstractC13584d<C12572u> implements Object {

    /* renamed from: D */
    private static final C12572u f28220D;

    /* renamed from: E */
    public static InterfaceC13604q<C12572u> f28221E = new C12573a();

    /* renamed from: A */
    private int f28222A;

    /* renamed from: B */
    private byte f28223B;

    /* renamed from: C */
    private int f28224C;

    /* renamed from: d */
    private final AbstractC13570d f28225d;

    /* renamed from: e */
    private int f28226e;

    /* renamed from: f */
    private int f28227f;

    /* renamed from: w */
    private int f28228w;

    /* renamed from: x */
    private C12555q f28229x;

    /* renamed from: y */
    private int f28230y;

    /* renamed from: z */
    private C12555q f28231z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.u$a */
    /* loaded from: classes3.dex */
    static class C12573a extends AbstractC13566b<C12572u> {
        C12573a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12572u mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12572u(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.u$b */
    /* loaded from: classes3.dex */
    public static final class C12574b extends AbstractC13580h.AbstractC13583c<C12572u, C12574b> implements Object {

        /* renamed from: B */
        private int f28233B;

        /* renamed from: f */
        private int f28234f;

        /* renamed from: w */
        private int f28235w;

        /* renamed from: x */
        private int f28236x;

        /* renamed from: z */
        private int f28238z;

        /* renamed from: y */
        private C12555q f28237y = C12555q.m7817Y();

        /* renamed from: A */
        private C12555q f28232A = C12555q.m7817Y();

        private C12574b() {
            m7540F();
        }

        /* renamed from: F */
        private void m7540F() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12574b m7527y() {
            return new C12574b();
        }

        /* renamed from: A */
        public C12555q m7545A() {
            return this.f28237y;
        }

        /* renamed from: B */
        public C12555q m7544B() {
            return this.f28232A;
        }

        /* renamed from: C */
        public boolean m7543C() {
            return (this.f28234f & 2) == 2;
        }

        /* renamed from: D */
        public boolean m7542D() {
            return (this.f28234f & 4) == 4;
        }

        /* renamed from: E */
        public boolean m7541E() {
            return (this.f28234f & 16) == 16;
        }

        /* renamed from: G */
        public C12574b m7539G(C12572u c12572u) {
            if (c12572u == C12572u.m7565I()) {
                return this;
            }
            if (c12572u.m7557Q()) {
                m7535L(c12572u.m7563K());
            }
            if (c12572u.m7556R()) {
                m7534M(c12572u.m7562L());
            }
            if (c12572u.m7555S()) {
                m7537I(c12572u.m7561M());
            }
            if (c12572u.m7554T()) {
                m7533N(c12572u.m7560N());
            }
            if (c12572u.m7553U()) {
                m7536K(c12572u.m7559O());
            }
            if (c12572u.m7552W()) {
                m7532O(c12572u.m7558P());
            }
            m4434t(c12572u);
            m4439o(m4441l().m4538e(c12572u.f28225d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u.C12574b m7538H(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.u> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u.f28221E     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.u r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7539G(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.u r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7539G(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u.C12574b.m7538H(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.u$b");
        }

        /* renamed from: I */
        public C12574b m7537I(C12555q c12555q) {
            if ((this.f28234f & 4) == 4 && this.f28237y != C12555q.m7817Y()) {
                this.f28237y = C12555q.m7790z0(this.f28237y).mo4440n(c12555q).m7727w();
            } else {
                this.f28237y = c12555q;
            }
            this.f28234f |= 4;
            return this;
        }

        /* renamed from: K */
        public C12574b m7536K(C12555q c12555q) {
            if ((this.f28234f & 16) == 16 && this.f28232A != C12555q.m7817Y()) {
                this.f28232A = C12555q.m7790z0(this.f28232A).mo4440n(c12555q).m7727w();
            } else {
                this.f28232A = c12555q;
            }
            this.f28234f |= 16;
            return this;
        }

        /* renamed from: L */
        public C12574b m7535L(int i) {
            this.f28234f |= 1;
            this.f28235w = i;
            return this;
        }

        /* renamed from: M */
        public C12574b m7534M(int i) {
            this.f28234f |= 2;
            this.f28236x = i;
            return this;
        }

        /* renamed from: N */
        public C12574b m7533N(int i) {
            this.f28234f |= 8;
            this.f28238z = i;
            return this;
        }

        /* renamed from: O */
        public C12574b m7532O(int i) {
            this.f28234f |= 32;
            this.f28233B = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7538H(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7538H(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m7543C()) {
                if (!m7542D() || m7545A().mo4379h()) {
                    return (!m7541E() || m7544B().mo4379h()) && m4435s();
                }
                return false;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m7539G((C12572u) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12572u build() {
            C12572u m7529w = m7529w();
            if (m7529w.mo4379h()) {
                return m7529w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7529w);
        }

        /* renamed from: w */
        public C12572u m7529w() {
            C12572u c12572u = new C12572u(this);
            int i = this.f28234f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12572u.f28227f = this.f28235w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12572u.f28228w = this.f28236x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12572u.f28229x = this.f28237y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12572u.f28230y = this.f28238z;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c12572u.f28231z = this.f28232A;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c12572u.f28222A = this.f28233B;
            c12572u.f28226e = i2;
            return c12572u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12574b mo4443j() {
            C12574b m7527y = m7527y();
            m7527y.m7539G(m7529w());
            return m7527y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: z */
        public C12572u mo4442k() {
            return C12572u.m7565I();
        }
    }

    static {
        C12572u c12572u = new C12572u(true);
        f28220D = c12572u;
        c12572u.m7551X();
    }

    /* renamed from: I */
    public static C12572u m7565I() {
        return f28220D;
    }

    /* renamed from: X */
    private void m7551X() {
        this.f28227f = 0;
        this.f28228w = 0;
        this.f28229x = C12555q.m7817Y();
        this.f28230y = 0;
        this.f28231z = C12555q.m7817Y();
        this.f28222A = 0;
    }

    /* renamed from: Y */
    public static C12574b m7550Y() {
        return C12574b.m7527y();
    }

    /* renamed from: Z */
    public static C12574b m7549Z(C12572u c12572u) {
        C12574b m7550Y = m7550Y();
        m7550Y.m7539G(c12572u);
        return m7550Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: J */
    public C12572u mo4380a() {
        return f28220D;
    }

    /* renamed from: K */
    public int m7563K() {
        return this.f28227f;
    }

    /* renamed from: L */
    public int m7562L() {
        return this.f28228w;
    }

    /* renamed from: M */
    public C12555q m7561M() {
        return this.f28229x;
    }

    /* renamed from: N */
    public int m7560N() {
        return this.f28230y;
    }

    /* renamed from: O */
    public C12555q m7559O() {
        return this.f28231z;
    }

    /* renamed from: P */
    public int m7558P() {
        return this.f28222A;
    }

    /* renamed from: Q */
    public boolean m7557Q() {
        return (this.f28226e & 1) == 1;
    }

    /* renamed from: R */
    public boolean m7556R() {
        return (this.f28226e & 2) == 2;
    }

    /* renamed from: S */
    public boolean m7555S() {
        return (this.f28226e & 4) == 4;
    }

    /* renamed from: T */
    public boolean m7554T() {
        return (this.f28226e & 8) == 8;
    }

    /* renamed from: U */
    public boolean m7553U() {
        return (this.f28226e & 16) == 16;
    }

    /* renamed from: W */
    public boolean m7552W() {
        return (this.f28226e & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: a0 */
    public C12574b mo4383f() {
        return m7550Y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: b0 */
    public C12574b mo4386b() {
        return m7549Z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28226e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f28227f);
        }
        if ((this.f28226e & 2) == 2) {
            codedOutputStream.m4618a0(2, this.f28228w);
        }
        if ((this.f28226e & 4) == 4) {
            codedOutputStream.m4612d0(3, this.f28229x);
        }
        if ((this.f28226e & 16) == 16) {
            codedOutputStream.m4612d0(4, this.f28231z);
        }
        if ((this.f28226e & 8) == 8) {
            codedOutputStream.m4618a0(5, this.f28230y);
        }
        if ((this.f28226e & 32) == 32) {
            codedOutputStream.m4618a0(6, this.f28222A);
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f28225d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28224C;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28226e & 1) == 1 ? 0 + CodedOutputStream.m4591o(1, this.f28227f) : 0;
        if ((this.f28226e & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(2, this.f28228w);
        }
        if ((this.f28226e & 4) == 4) {
            m4591o += CodedOutputStream.m4583s(3, this.f28229x);
        }
        if ((this.f28226e & 16) == 16) {
            m4591o += CodedOutputStream.m4583s(4, this.f28231z);
        }
        if ((this.f28226e & 8) == 8) {
            m4591o += CodedOutputStream.m4591o(5, this.f28230y);
        }
        if ((this.f28226e & 32) == 32) {
            m4591o += CodedOutputStream.m4591o(6, this.f28222A);
        }
        int m4429t = m4591o + m4429t() + this.f28225d.size();
        this.f28224C = m4429t;
        return m4429t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12572u> mo4382g() {
        return f28221E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28223B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m7556R()) {
            this.f28223B = (byte) 0;
            return false;
        } else if (m7555S() && !m7561M().mo4379h()) {
            this.f28223B = (byte) 0;
            return false;
        } else if (m7553U() && !m7559O().mo4379h()) {
            this.f28223B = (byte) 0;
            return false;
        } else if (!m4430s()) {
            this.f28223B = (byte) 0;
            return false;
        } else {
            this.f28223B = (byte) 1;
            return true;
        }
    }

    private C12572u(AbstractC13580h.AbstractC13583c<C12572u, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28223B = (byte) -1;
        this.f28224C = -1;
        this.f28225d = abstractC13583c.m4441l();
    }

    private C12572u(boolean z) {
        this.f28223B = (byte) -1;
        this.f28224C = -1;
        this.f28225d = AbstractC13570d.f29926c;
    }

    private C12572u(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        C12555q.C12561c mo4386b;
        this.f28223B = (byte) -1;
        this.f28224C = -1;
        m7551X();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int m4516K = c13573e.m4516K();
                        if (m4516K != 0) {
                            if (m4516K == 8) {
                                this.f28226e |= 1;
                                this.f28227f = c13573e.m4488s();
                            } else if (m4516K != 16) {
                                if (m4516K == 26) {
                                    mo4386b = (this.f28226e & 4) == 4 ? this.f28229x.mo4386b() : null;
                                    C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28229x = c12555q;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q);
                                        this.f28229x = mo4386b.m7727w();
                                    }
                                    this.f28226e |= 4;
                                } else if (m4516K == 34) {
                                    mo4386b = (this.f28226e & 16) == 16 ? this.f28231z.mo4386b() : null;
                                    C12555q c12555q2 = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28231z = c12555q2;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q2);
                                        this.f28231z = mo4386b.m7727w();
                                    }
                                    this.f28226e |= 16;
                                } else if (m4516K == 40) {
                                    this.f28226e |= 8;
                                    this.f28230y = c13573e.m4488s();
                                } else if (m4516K != 48) {
                                    if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                    }
                                } else {
                                    this.f28226e |= 32;
                                    this.f28222A = c13573e.m4488s();
                                }
                            } else {
                                this.f28226e |= 2;
                                this.f28228w = c13573e.m4488s();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.m4559i(this);
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.m4559i(this);
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28225d = m4542O.m4530I();
                    throw th2;
                }
                this.f28225d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28225d = m4542O.m4530I();
            throw th3;
        }
        this.f28225d = m4542O.m4530I();
        mo4433m();
    }
}
