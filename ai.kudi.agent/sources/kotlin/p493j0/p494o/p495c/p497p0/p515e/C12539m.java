package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p;
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
/* renamed from: kotlin.j0.o.c.p0.e.m */
/* loaded from: classes3.dex */
public final class C12539m extends AbstractC13580h.AbstractC13584d<C12539m> implements Object {

    /* renamed from: B */
    private static final C12539m f28025B;

    /* renamed from: C */
    public static InterfaceC13604q<C12539m> f28026C = new C12540a();

    /* renamed from: A */
    private int f28027A;

    /* renamed from: d */
    private final AbstractC13570d f28028d;

    /* renamed from: e */
    private int f28029e;

    /* renamed from: f */
    private C12552p f28030f;

    /* renamed from: w */
    private C12545o f28031w;

    /* renamed from: x */
    private C12536l f28032x;

    /* renamed from: y */
    private List<C12509c> f28033y;

    /* renamed from: z */
    private byte f28034z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.m$a */
    /* loaded from: classes3.dex */
    static class C12540a extends AbstractC13566b<C12539m> {
        C12540a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12539m mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12539m(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.m$b */
    /* loaded from: classes3.dex */
    public static final class C12541b extends AbstractC13580h.AbstractC13583c<C12539m, C12541b> implements Object {

        /* renamed from: f */
        private int f28035f;

        /* renamed from: w */
        private C12552p f28036w = C12552p.m7859u();

        /* renamed from: x */
        private C12545o f28037x = C12545o.m7917u();

        /* renamed from: y */
        private C12536l f28038y = C12536l.m8089K();

        /* renamed from: z */
        private List<C12509c> f28039z = Collections.emptyList();

        private C12541b() {
            m8013H();
        }

        /* renamed from: H */
        private void m8013H() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12541b m8003y() {
            return new C12541b();
        }

        /* renamed from: z */
        private void m8002z() {
            if ((this.f28035f & 8) != 8) {
                this.f28039z = new ArrayList(this.f28039z);
                this.f28035f |= 8;
            }
        }

        /* renamed from: A */
        public C12509c m8020A(int i) {
            return this.f28039z.get(i);
        }

        /* renamed from: B */
        public int m8019B() {
            return this.f28039z.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: C */
        public C12539m mo4442k() {
            return C12539m.m8035K();
        }

        /* renamed from: D */
        public C12536l m8017D() {
            return this.f28038y;
        }

        /* renamed from: E */
        public C12545o m8016E() {
            return this.f28037x;
        }

        /* renamed from: F */
        public boolean m8015F() {
            return (this.f28035f & 4) == 4;
        }

        /* renamed from: G */
        public boolean m8014G() {
            return (this.f28035f & 2) == 2;
        }

        /* renamed from: I */
        public C12541b m8012I(C12539m c12539m) {
            if (c12539m == C12539m.m8035K()) {
                return this;
            }
            if (c12539m.m8028R()) {
                m8008N(c12539m.m8031O());
            }
            if (c12539m.m8029Q()) {
                m8009M(c12539m.m8032N());
            }
            if (c12539m.m8030P()) {
                m8010L(c12539m.m8033M());
            }
            if (!c12539m.f28033y.isEmpty()) {
                if (this.f28039z.isEmpty()) {
                    this.f28039z = c12539m.f28033y;
                    this.f28035f &= -9;
                } else {
                    m8002z();
                    this.f28039z.addAll(c12539m.f28033y);
                }
            }
            m4434t(c12539m);
            m4439o(m4441l().m4538e(c12539m.f28028d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m.C12541b m8011K(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.m> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m.f28026C     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.m r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8012I(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.m r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8012I(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12539m.C12541b.m8011K(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.m$b");
        }

        /* renamed from: L */
        public C12541b m8010L(C12536l c12536l) {
            if ((this.f28035f & 4) == 4 && this.f28038y != C12536l.m8089K()) {
                C12536l.C12538b m8072c0 = C12536l.m8072c0(this.f28038y);
                m8072c0.m8055N(c12536l);
                this.f28038y = m8072c0.m8049w();
            } else {
                this.f28038y = c12536l;
            }
            this.f28035f |= 4;
            return this;
        }

        /* renamed from: M */
        public C12541b m8009M(C12545o c12545o) {
            if ((this.f28035f & 2) == 2 && this.f28037x != C12545o.m7917u()) {
                C12545o.C12547b m7923A = C12545o.m7923A(this.f28037x);
                m7923A.m7899z(c12545o);
                this.f28037x = m7923A.m7907r();
            } else {
                this.f28037x = c12545o;
            }
            this.f28035f |= 2;
            return this;
        }

        /* renamed from: N */
        public C12541b m8008N(C12552p c12552p) {
            if ((this.f28035f & 1) == 1 && this.f28036w != C12552p.m7859u()) {
                C12552p.C12554b m7865A = C12552p.m7865A(this.f28036w);
                m7865A.m7844x(c12552p);
                this.f28036w = m7865A.m7850r();
            } else {
                this.f28036w = c12552p;
            }
            this.f28035f |= 1;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8011K(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8011K(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (!m8014G() || m8016E().mo4379h()) {
                if (!m8015F() || m8017D().mo4379h()) {
                    for (int i = 0; i < m8019B(); i++) {
                        if (!m8020A(i).mo4379h()) {
                            return false;
                        }
                    }
                    return m4435s();
                }
                return false;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m8012I((C12539m) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12539m build() {
            C12539m m8005w = m8005w();
            if (m8005w.mo4379h()) {
                return m8005w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8005w);
        }

        /* renamed from: w */
        public C12539m m8005w() {
            C12539m c12539m = new C12539m(this);
            int i = this.f28035f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12539m.f28030f = this.f28036w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12539m.f28031w = this.f28037x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12539m.f28032x = this.f28038y;
            if ((this.f28035f & 8) == 8) {
                this.f28039z = Collections.unmodifiableList(this.f28039z);
                this.f28035f &= -9;
            }
            c12539m.f28033y = this.f28039z;
            c12539m.f28029e = i2;
            return c12539m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12541b mo4443j() {
            C12541b m8003y = m8003y();
            m8003y.m8012I(m8005w());
            return m8003y;
        }
    }

    static {
        C12539m c12539m = new C12539m(true);
        f28025B = c12539m;
        c12539m.m8027S();
    }

    /* renamed from: K */
    public static C12539m m8035K() {
        return f28025B;
    }

    /* renamed from: S */
    private void m8027S() {
        this.f28030f = C12552p.m7859u();
        this.f28031w = C12545o.m7917u();
        this.f28032x = C12536l.m8089K();
        this.f28033y = Collections.emptyList();
    }

    /* renamed from: T */
    public static C12541b m8026T() {
        return C12541b.m8003y();
    }

    /* renamed from: U */
    public static C12541b m8025U(C12539m c12539m) {
        C12541b m8026T = m8026T();
        m8026T.m8012I(c12539m);
        return m8026T;
    }

    /* renamed from: X */
    public static C12539m m8023X(InputStream inputStream, C13575f c13575f) throws IOException {
        return f28026C.mo4378a(inputStream, c13575f);
    }

    /* renamed from: H */
    public C12509c m8038H(int i) {
        return this.f28033y.get(i);
    }

    /* renamed from: I */
    public int m8037I() {
        return this.f28033y.size();
    }

    /* renamed from: J */
    public List<C12509c> m8036J() {
        return this.f28033y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: L */
    public C12539m mo4380a() {
        return f28025B;
    }

    /* renamed from: M */
    public C12536l m8033M() {
        return this.f28032x;
    }

    /* renamed from: N */
    public C12545o m8032N() {
        return this.f28031w;
    }

    /* renamed from: O */
    public C12552p m8031O() {
        return this.f28030f;
    }

    /* renamed from: P */
    public boolean m8030P() {
        return (this.f28029e & 4) == 4;
    }

    /* renamed from: Q */
    public boolean m8029Q() {
        return (this.f28029e & 2) == 2;
    }

    /* renamed from: R */
    public boolean m8028R() {
        return (this.f28029e & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: W */
    public C12541b mo4383f() {
        return m8026T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: Y */
    public C12541b mo4386b() {
        return m8025U(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28029e & 1) == 1) {
            codedOutputStream.m4612d0(1, this.f28030f);
        }
        if ((this.f28029e & 2) == 2) {
            codedOutputStream.m4612d0(2, this.f28031w);
        }
        if ((this.f28029e & 4) == 4) {
            codedOutputStream.m4612d0(3, this.f28032x);
        }
        for (int i = 0; i < this.f28033y.size(); i++) {
            codedOutputStream.m4612d0(4, this.f28033y.get(i));
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f28028d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28027A;
        if (i != -1) {
            return i;
        }
        int m4583s = (this.f28029e & 1) == 1 ? CodedOutputStream.m4583s(1, this.f28030f) + 0 : 0;
        if ((this.f28029e & 2) == 2) {
            m4583s += CodedOutputStream.m4583s(2, this.f28031w);
        }
        if ((this.f28029e & 4) == 4) {
            m4583s += CodedOutputStream.m4583s(3, this.f28032x);
        }
        for (int i2 = 0; i2 < this.f28033y.size(); i2++) {
            m4583s += CodedOutputStream.m4583s(4, this.f28033y.get(i2));
        }
        int m4429t = m4583s + m4429t() + this.f28028d.size();
        this.f28027A = m4429t;
        return m4429t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12539m> mo4382g() {
        return f28026C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28034z;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m8029Q() && !m8032N().mo4379h()) {
            this.f28034z = (byte) 0;
            return false;
        } else if (m8030P() && !m8033M().mo4379h()) {
            this.f28034z = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m8037I(); i++) {
                if (!m8038H(i).mo4379h()) {
                    this.f28034z = (byte) 0;
                    return false;
                }
            }
            if (!m4430s()) {
                this.f28034z = (byte) 0;
                return false;
            }
            this.f28034z = (byte) 1;
            return true;
        }
    }

    private C12539m(AbstractC13580h.AbstractC13583c<C12539m, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28034z = (byte) -1;
        this.f28027A = -1;
        this.f28028d = abstractC13583c.m4441l();
    }

    private C12539m(boolean z) {
        this.f28034z = (byte) -1;
        this.f28027A = -1;
        this.f28028d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12539m(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28034z = (byte) -1;
        this.f28027A = -1;
        m8027S();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int m4516K = c13573e.m4516K();
                        if (m4516K != 0) {
                            if (m4516K == 10) {
                                C12552p.C12554b mo4386b = (this.f28029e & 1) == 1 ? this.f28030f.mo4386b() : null;
                                C12552p c12552p = (C12552p) c13573e.m4486u(C12552p.f28098x, c13575f);
                                this.f28030f = c12552p;
                                if (mo4386b != null) {
                                    mo4386b.m7844x(c12552p);
                                    this.f28030f = mo4386b.m7850r();
                                }
                                this.f28029e |= 1;
                            } else if (m4516K == 18) {
                                C12545o.C12547b mo4386b2 = (this.f28029e & 2) == 2 ? this.f28031w.mo4386b() : null;
                                C12545o c12545o = (C12545o) c13573e.m4486u(C12545o.f28072x, c13575f);
                                this.f28031w = c12545o;
                                if (mo4386b2 != null) {
                                    mo4386b2.m7899z(c12545o);
                                    this.f28031w = mo4386b2.m7907r();
                                }
                                this.f28029e |= 2;
                            } else if (m4516K == 26) {
                                C12536l.C12538b mo4386b3 = (this.f28029e & 4) == 4 ? this.f28032x.mo4386b() : null;
                                C12536l c12536l = (C12536l) c13573e.m4486u(C12536l.f28009D, c13575f);
                                this.f28032x = c12536l;
                                if (mo4386b3 != null) {
                                    mo4386b3.m8055N(c12536l);
                                    this.f28032x = mo4386b3.m8049w();
                                }
                                this.f28029e |= 4;
                            } else if (m4516K != 34) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f28033y = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28033y.add(c13573e.m4486u(C12509c.f27828U, c13575f));
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
                if (z2 & true) {
                    this.f28033y = Collections.unmodifiableList(this.f28033y);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28028d = m4542O.m4530I();
                    throw th2;
                }
                this.f28028d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28033y = Collections.unmodifiableList(this.f28033y);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28028d = m4542O.m4530I();
            throw th3;
        }
        this.f28028d = m4542O.m4530I();
        mo4433m();
    }
}
