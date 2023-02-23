package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
/* renamed from: kotlin.j0.o.c.p0.e.d */
/* loaded from: classes3.dex */
public final class C12513d extends AbstractC13580h.AbstractC13584d<C12513d> implements Object {

    /* renamed from: A */
    private static final C12513d f27884A;

    /* renamed from: B */
    public static InterfaceC13604q<C12513d> f27885B = new C12514a();

    /* renamed from: d */
    private final AbstractC13570d f27886d;

    /* renamed from: e */
    private int f27887e;

    /* renamed from: f */
    private int f27888f;

    /* renamed from: w */
    private List<C12572u> f27889w;

    /* renamed from: x */
    private List<Integer> f27890x;

    /* renamed from: y */
    private byte f27891y;

    /* renamed from: z */
    private int f27892z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.d$a */
    /* loaded from: classes3.dex */
    static class C12514a extends AbstractC13566b<C12513d> {
        C12514a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12513d mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12513d(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.d$b */
    /* loaded from: classes3.dex */
    public static final class C12515b extends AbstractC13580h.AbstractC13583c<C12513d, C12515b> implements Object {

        /* renamed from: f */
        private int f27893f;

        /* renamed from: w */
        private int f27894w = 6;

        /* renamed from: x */
        private List<C12572u> f27895x = Collections.emptyList();

        /* renamed from: y */
        private List<Integer> f27896y = Collections.emptyList();

        private C12515b() {
            m8340E();
        }

        /* renamed from: A */
        private void m8344A() {
            if ((this.f27893f & 4) != 4) {
                this.f27896y = new ArrayList(this.f27896y);
                this.f27893f |= 4;
            }
        }

        /* renamed from: E */
        private void m8340E() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12515b m8332y() {
            return new C12515b();
        }

        /* renamed from: z */
        private void m8331z() {
            if ((this.f27893f & 2) != 2) {
                this.f27895x = new ArrayList(this.f27895x);
                this.f27893f |= 2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: B */
        public C12513d mo4442k() {
            return C12513d.m8358H();
        }

        /* renamed from: C */
        public C12572u m8342C(int i) {
            return this.f27895x.get(i);
        }

        /* renamed from: D */
        public int m8341D() {
            return this.f27895x.size();
        }

        /* renamed from: F */
        public C12515b m8339F(C12513d c12513d) {
            if (c12513d == C12513d.m8358H()) {
                return this;
            }
            if (c12513d.m8351O()) {
                m8337H(c12513d.m8356J());
            }
            if (!c12513d.f27889w.isEmpty()) {
                if (this.f27895x.isEmpty()) {
                    this.f27895x = c12513d.f27889w;
                    this.f27893f &= -3;
                } else {
                    m8331z();
                    this.f27895x.addAll(c12513d.f27889w);
                }
            }
            if (!c12513d.f27890x.isEmpty()) {
                if (this.f27896y.isEmpty()) {
                    this.f27896y = c12513d.f27890x;
                    this.f27893f &= -5;
                } else {
                    m8344A();
                    this.f27896y.addAll(c12513d.f27890x);
                }
            }
            m4434t(c12513d);
            m4439o(m4441l().m4538e(c12513d.f27886d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d.C12515b m8338G(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.d> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d.f27885B     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.d r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8339F(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.d r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8339F(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d.C12515b.m8338G(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.d$b");
        }

        /* renamed from: H */
        public C12515b m8337H(int i) {
            this.f27893f |= 1;
            this.f27894w = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8338G(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8338G(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m8341D(); i++) {
                if (!m8342C(i).mo4379h()) {
                    return false;
                }
            }
            return m4435s();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m8339F((C12513d) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12513d build() {
            C12513d m8334w = m8334w();
            if (m8334w.mo4379h()) {
                return m8334w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8334w);
        }

        /* renamed from: w */
        public C12513d m8334w() {
            C12513d c12513d = new C12513d(this);
            int i = (this.f27893f & 1) != 1 ? 0 : 1;
            c12513d.f27888f = this.f27894w;
            if ((this.f27893f & 2) == 2) {
                this.f27895x = Collections.unmodifiableList(this.f27895x);
                this.f27893f &= -3;
            }
            c12513d.f27889w = this.f27895x;
            if ((this.f27893f & 4) == 4) {
                this.f27896y = Collections.unmodifiableList(this.f27896y);
                this.f27893f &= -5;
            }
            c12513d.f27890x = this.f27896y;
            c12513d.f27887e = i;
            return c12513d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12515b mo4443j() {
            C12515b m8332y = m8332y();
            m8332y.m8339F(m8334w());
            return m8332y;
        }
    }

    static {
        C12513d c12513d = new C12513d(true);
        f27884A = c12513d;
        c12513d.m8350P();
    }

    /* renamed from: H */
    public static C12513d m8358H() {
        return f27884A;
    }

    /* renamed from: P */
    private void m8350P() {
        this.f27888f = 6;
        this.f27889w = Collections.emptyList();
        this.f27890x = Collections.emptyList();
    }

    /* renamed from: Q */
    public static C12515b m8349Q() {
        return C12515b.m8332y();
    }

    /* renamed from: R */
    public static C12515b m8348R(C12513d c12513d) {
        C12515b m8349Q = m8349Q();
        m8349Q.m8339F(c12513d);
        return m8349Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: I */
    public C12513d mo4380a() {
        return f27884A;
    }

    /* renamed from: J */
    public int m8356J() {
        return this.f27888f;
    }

    /* renamed from: K */
    public C12572u m8355K(int i) {
        return this.f27889w.get(i);
    }

    /* renamed from: L */
    public int m8354L() {
        return this.f27889w.size();
    }

    /* renamed from: M */
    public List<C12572u> m8353M() {
        return this.f27889w;
    }

    /* renamed from: N */
    public List<Integer> m8352N() {
        return this.f27890x;
    }

    /* renamed from: O */
    public boolean m8351O() {
        return (this.f27887e & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: S */
    public C12515b mo4383f() {
        return m8349Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: T */
    public C12515b mo4386b() {
        return m8348R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f27887e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f27888f);
        }
        for (int i = 0; i < this.f27889w.size(); i++) {
            codedOutputStream.m4612d0(2, this.f27889w.get(i));
        }
        for (int i2 = 0; i2 < this.f27890x.size(); i2++) {
            codedOutputStream.m4618a0(31, this.f27890x.get(i2).intValue());
        }
        m4424y.m4422a(19000, codedOutputStream);
        codedOutputStream.m4602i0(this.f27886d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27892z;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f27887e & 1) == 1 ? CodedOutputStream.m4591o(1, this.f27888f) + 0 : 0;
        for (int i2 = 0; i2 < this.f27889w.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(2, this.f27889w.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f27890x.size(); i4++) {
            i3 += CodedOutputStream.m4589p(this.f27890x.get(i4).intValue());
        }
        int size = m4591o + i3 + (m8352N().size() * 2) + m4429t() + this.f27886d.size();
        this.f27892z = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12513d> mo4382g() {
        return f27885B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27891y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m8354L(); i++) {
            if (!m8355K(i).mo4379h()) {
                this.f27891y = (byte) 0;
                return false;
            }
        }
        if (!m4430s()) {
            this.f27891y = (byte) 0;
            return false;
        }
        this.f27891y = (byte) 1;
        return true;
    }

    private C12513d(AbstractC13580h.AbstractC13583c<C12513d, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f27891y = (byte) -1;
        this.f27892z = -1;
        this.f27886d = abstractC13583c.m4441l();
    }

    private C12513d(boolean z) {
        this.f27891y = (byte) -1;
        this.f27892z = -1;
        this.f27886d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12513d(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27891y = (byte) -1;
        this.f27892z = -1;
        m8350P();
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
                            if (m4516K == 8) {
                                this.f27887e |= 1;
                                this.f27888f = c13573e.m4488s();
                            } else if (m4516K == 18) {
                                if (!(z2 & true)) {
                                    this.f27889w = new ArrayList();
                                    z2 |= true;
                                }
                                this.f27889w.add(c13573e.m4486u(C12572u.f28221E, c13575f));
                            } else if (m4516K == 248) {
                                if (!(z2 & true)) {
                                    this.f27890x = new ArrayList();
                                    z2 |= true;
                                }
                                this.f27890x.add(Integer.valueOf(c13573e.m4488s()));
                            } else if (m4516K != 250) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                int m4497j = c13573e.m4497j(c13573e.m4526A());
                                if (!(z2 & true) && c13573e.m4502e() > 0) {
                                    this.f27890x = new ArrayList();
                                    z2 |= true;
                                }
                                while (c13573e.m4502e() > 0) {
                                    this.f27890x.add(Integer.valueOf(c13573e.m4488s()));
                                }
                                c13573e.m4498i(m4497j);
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
                    this.f27889w = Collections.unmodifiableList(this.f27889w);
                }
                if (z2 & true) {
                    this.f27890x = Collections.unmodifiableList(this.f27890x);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27886d = m4542O.m4530I();
                    throw th2;
                }
                this.f27886d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f27889w = Collections.unmodifiableList(this.f27889w);
        }
        if (z2 & true) {
            this.f27890x = Collections.unmodifiableList(this.f27890x);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27886d = m4542O.m4530I();
            throw th3;
        }
        this.f27886d = m4542O.m4530I();
        mo4433m();
    }
}
