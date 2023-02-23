package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w;
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
/* renamed from: kotlin.j0.o.c.p0.e.l */
/* loaded from: classes3.dex */
public final class C12536l extends AbstractC13580h.AbstractC13584d<C12536l> implements Object {

    /* renamed from: C */
    private static final C12536l f28008C;

    /* renamed from: D */
    public static InterfaceC13604q<C12536l> f28009D = new C12537a();

    /* renamed from: A */
    private byte f28010A;

    /* renamed from: B */
    private int f28011B;

    /* renamed from: d */
    private final AbstractC13570d f28012d;

    /* renamed from: e */
    private int f28013e;

    /* renamed from: f */
    private List<C12531i> f28014f;

    /* renamed from: w */
    private List<C12542n> f28015w;

    /* renamed from: x */
    private List<C12562r> f28016x;

    /* renamed from: y */
    private C12569t f28017y;

    /* renamed from: z */
    private C12580w f28018z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.l$a */
    /* loaded from: classes3.dex */
    static class C12537a extends AbstractC13566b<C12536l> {
        C12537a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12536l mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12536l(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.l$b */
    /* loaded from: classes3.dex */
    public static final class C12538b extends AbstractC13580h.AbstractC13583c<C12536l, C12538b> implements Object {

        /* renamed from: f */
        private int f28020f;

        /* renamed from: w */
        private List<C12531i> f28021w = Collections.emptyList();

        /* renamed from: x */
        private List<C12542n> f28022x = Collections.emptyList();

        /* renamed from: y */
        private List<C12562r> f28023y = Collections.emptyList();

        /* renamed from: z */
        private C12569t f28024z = C12569t.m7591w();

        /* renamed from: A */
        private C12580w f28019A = C12580w.m7474u();

        private C12538b() {
            m8056M();
        }

        /* renamed from: A */
        private void m8067A() {
            if ((this.f28020f & 2) != 2) {
                this.f28022x = new ArrayList(this.f28022x);
                this.f28020f |= 2;
            }
        }

        /* renamed from: B */
        private void m8066B() {
            if ((this.f28020f & 4) != 4) {
                this.f28023y = new ArrayList(this.f28023y);
                this.f28020f |= 4;
            }
        }

        /* renamed from: M */
        private void m8056M() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12538b m8047y() {
            return new C12538b();
        }

        /* renamed from: z */
        private void m8046z() {
            if ((this.f28020f & 1) != 1) {
                this.f28021w = new ArrayList(this.f28021w);
                this.f28020f |= 1;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: C */
        public C12536l mo4442k() {
            return C12536l.m8089K();
        }

        /* renamed from: D */
        public C12531i m8064D(int i) {
            return this.f28021w.get(i);
        }

        /* renamed from: E */
        public int m8063E() {
            return this.f28021w.size();
        }

        /* renamed from: F */
        public C12542n m8062F(int i) {
            return this.f28022x.get(i);
        }

        /* renamed from: G */
        public int m8061G() {
            return this.f28022x.size();
        }

        /* renamed from: H */
        public C12562r m8060H(int i) {
            return this.f28023y.get(i);
        }

        /* renamed from: I */
        public int m8059I() {
            return this.f28023y.size();
        }

        /* renamed from: K */
        public C12569t m8058K() {
            return this.f28024z;
        }

        /* renamed from: L */
        public boolean m8057L() {
            return (this.f28020f & 8) == 8;
        }

        /* renamed from: N */
        public C12538b m8055N(C12536l c12536l) {
            if (c12536l == C12536l.m8089K()) {
                return this;
            }
            if (!c12536l.f28014f.isEmpty()) {
                if (this.f28021w.isEmpty()) {
                    this.f28021w = c12536l.f28014f;
                    this.f28020f &= -2;
                } else {
                    m8046z();
                    this.f28021w.addAll(c12536l.f28014f);
                }
            }
            if (!c12536l.f28015w.isEmpty()) {
                if (this.f28022x.isEmpty()) {
                    this.f28022x = c12536l.f28015w;
                    this.f28020f &= -3;
                } else {
                    m8067A();
                    this.f28022x.addAll(c12536l.f28015w);
                }
            }
            if (!c12536l.f28016x.isEmpty()) {
                if (this.f28023y.isEmpty()) {
                    this.f28023y = c12536l.f28016x;
                    this.f28020f &= -5;
                } else {
                    m8066B();
                    this.f28023y.addAll(c12536l.f28016x);
                }
            }
            if (c12536l.m8076Y()) {
                m8053P(c12536l.m8078W());
            }
            if (c12536l.m8075Z()) {
                m8052Q(c12536l.m8077X());
            }
            m4434t(c12536l);
            m4439o(m4441l().m4538e(c12536l.f28012d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l.C12538b m8054O(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.l> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l.f28009D     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.l r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8055N(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.l r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8055N(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l.C12538b.m8054O(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.l$b");
        }

        /* renamed from: P */
        public C12538b m8053P(C12569t c12569t) {
            if ((this.f28020f & 8) == 8 && this.f28024z != C12569t.m7591w()) {
                C12569t.C12571b m7599F = C12569t.m7599F(this.f28024z);
                m7599F.m7574z(c12569t);
                this.f28024z = m7599F.m7582r();
            } else {
                this.f28024z = c12569t;
            }
            this.f28020f |= 8;
            return this;
        }

        /* renamed from: Q */
        public C12538b m8052Q(C12580w c12580w) {
            if ((this.f28020f & 16) == 16 && this.f28019A != C12580w.m7474u()) {
                C12580w.C12582b m7480A = C12580w.m7480A(this.f28019A);
                m7480A.m7459x(c12580w);
                this.f28019A = m7480A.m7465r();
            } else {
                this.f28019A = c12580w;
            }
            this.f28020f |= 16;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8054O(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8054O(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m8063E(); i++) {
                if (!m8064D(i).mo4379h()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < m8061G(); i2++) {
                if (!m8062F(i2).mo4379h()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < m8059I(); i3++) {
                if (!m8060H(i3).mo4379h()) {
                    return false;
                }
            }
            return (!m8057L() || m8058K().mo4379h()) && m4435s();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m8055N((C12536l) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12536l build() {
            C12536l m8049w = m8049w();
            if (m8049w.mo4379h()) {
                return m8049w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8049w);
        }

        /* renamed from: w */
        public C12536l m8049w() {
            C12536l c12536l = new C12536l(this);
            int i = this.f28020f;
            if ((i & 1) == 1) {
                this.f28021w = Collections.unmodifiableList(this.f28021w);
                this.f28020f &= -2;
            }
            c12536l.f28014f = this.f28021w;
            if ((this.f28020f & 2) == 2) {
                this.f28022x = Collections.unmodifiableList(this.f28022x);
                this.f28020f &= -3;
            }
            c12536l.f28015w = this.f28022x;
            if ((this.f28020f & 4) == 4) {
                this.f28023y = Collections.unmodifiableList(this.f28023y);
                this.f28020f &= -5;
            }
            c12536l.f28016x = this.f28023y;
            int i2 = (i & 8) != 8 ? 0 : 1;
            c12536l.f28017y = this.f28024z;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            c12536l.f28018z = this.f28019A;
            c12536l.f28013e = i2;
            return c12536l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12538b mo4443j() {
            C12538b m8047y = m8047y();
            m8047y.m8055N(m8049w());
            return m8047y;
        }
    }

    static {
        C12536l c12536l = new C12536l(true);
        f28008C = c12536l;
        c12536l.m8074a0();
    }

    /* renamed from: K */
    public static C12536l m8089K() {
        return f28008C;
    }

    /* renamed from: a0 */
    private void m8074a0() {
        this.f28014f = Collections.emptyList();
        this.f28015w = Collections.emptyList();
        this.f28016x = Collections.emptyList();
        this.f28017y = C12569t.m7591w();
        this.f28018z = C12580w.m7474u();
    }

    /* renamed from: b0 */
    public static C12538b m8073b0() {
        return C12538b.m8047y();
    }

    /* renamed from: c0 */
    public static C12538b m8072c0(C12536l c12536l) {
        C12538b m8073b0 = m8073b0();
        m8073b0.m8055N(c12536l);
        return m8073b0;
    }

    /* renamed from: e0 */
    public static C12536l m8070e0(InputStream inputStream, C13575f c13575f) throws IOException {
        return f28009D.mo4378a(inputStream, c13575f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: L */
    public C12536l mo4380a() {
        return f28008C;
    }

    /* renamed from: M */
    public C12531i m8087M(int i) {
        return this.f28014f.get(i);
    }

    /* renamed from: N */
    public int m8086N() {
        return this.f28014f.size();
    }

    /* renamed from: O */
    public List<C12531i> m8085O() {
        return this.f28014f;
    }

    /* renamed from: P */
    public C12542n m8084P(int i) {
        return this.f28015w.get(i);
    }

    /* renamed from: Q */
    public int m8083Q() {
        return this.f28015w.size();
    }

    /* renamed from: R */
    public List<C12542n> m8082R() {
        return this.f28015w;
    }

    /* renamed from: S */
    public C12562r m8081S(int i) {
        return this.f28016x.get(i);
    }

    /* renamed from: T */
    public int m8080T() {
        return this.f28016x.size();
    }

    /* renamed from: U */
    public List<C12562r> m8079U() {
        return this.f28016x;
    }

    /* renamed from: W */
    public C12569t m8078W() {
        return this.f28017y;
    }

    /* renamed from: X */
    public C12580w m8077X() {
        return this.f28018z;
    }

    /* renamed from: Y */
    public boolean m8076Y() {
        return (this.f28013e & 1) == 1;
    }

    /* renamed from: Z */
    public boolean m8075Z() {
        return (this.f28013e & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        for (int i = 0; i < this.f28014f.size(); i++) {
            codedOutputStream.m4612d0(3, this.f28014f.get(i));
        }
        for (int i2 = 0; i2 < this.f28015w.size(); i2++) {
            codedOutputStream.m4612d0(4, this.f28015w.get(i2));
        }
        for (int i3 = 0; i3 < this.f28016x.size(); i3++) {
            codedOutputStream.m4612d0(5, this.f28016x.get(i3));
        }
        if ((this.f28013e & 1) == 1) {
            codedOutputStream.m4612d0(30, this.f28017y);
        }
        if ((this.f28013e & 2) == 2) {
            codedOutputStream.m4612d0(32, this.f28018z);
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f28012d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28011B;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28014f.size(); i3++) {
            i2 += CodedOutputStream.m4583s(3, this.f28014f.get(i3));
        }
        for (int i4 = 0; i4 < this.f28015w.size(); i4++) {
            i2 += CodedOutputStream.m4583s(4, this.f28015w.get(i4));
        }
        for (int i5 = 0; i5 < this.f28016x.size(); i5++) {
            i2 += CodedOutputStream.m4583s(5, this.f28016x.get(i5));
        }
        if ((this.f28013e & 1) == 1) {
            i2 += CodedOutputStream.m4583s(30, this.f28017y);
        }
        if ((this.f28013e & 2) == 2) {
            i2 += CodedOutputStream.m4583s(32, this.f28018z);
        }
        int m4429t = i2 + m4429t() + this.f28012d.size();
        this.f28011B = m4429t;
        return m4429t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d0 */
    public C12538b mo4383f() {
        return m8073b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: f0 */
    public C12538b mo4386b() {
        return m8072c0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12536l> mo4382g() {
        return f28009D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28010A;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m8086N(); i++) {
            if (!m8087M(i).mo4379h()) {
                this.f28010A = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m8083Q(); i2++) {
            if (!m8084P(i2).mo4379h()) {
                this.f28010A = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m8080T(); i3++) {
            if (!m8081S(i3).mo4379h()) {
                this.f28010A = (byte) 0;
                return false;
            }
        }
        if (m8076Y() && !m8078W().mo4379h()) {
            this.f28010A = (byte) 0;
            return false;
        } else if (!m4430s()) {
            this.f28010A = (byte) 0;
            return false;
        } else {
            this.f28010A = (byte) 1;
            return true;
        }
    }

    private C12536l(AbstractC13580h.AbstractC13583c<C12536l, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28010A = (byte) -1;
        this.f28011B = -1;
        this.f28012d = abstractC13583c.m4441l();
    }

    private C12536l(boolean z) {
        this.f28010A = (byte) -1;
        this.f28011B = -1;
        this.f28012d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12536l(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28010A = (byte) -1;
        this.f28011B = -1;
        m8074a0();
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
                            if (m4516K == 26) {
                                if (!(z2 & true)) {
                                    this.f28014f = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28014f.add(c13573e.m4486u(C12531i.f27966K, c13575f));
                            } else if (m4516K == 34) {
                                if (!(z2 & true)) {
                                    this.f28015w = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28015w.add(c13573e.m4486u(C12542n.f28041K, c13575f));
                            } else if (m4516K != 42) {
                                if (m4516K == 242) {
                                    C12569t.C12571b mo4386b = (this.f28013e & 1) == 1 ? this.f28017y.mo4386b() : null;
                                    C12569t c12569t = (C12569t) c13573e.m4486u(C12569t.f28210z, c13575f);
                                    this.f28017y = c12569t;
                                    if (mo4386b != null) {
                                        mo4386b.m7574z(c12569t);
                                        this.f28017y = mo4386b.m7582r();
                                    }
                                    this.f28013e |= 1;
                                } else if (m4516K != 258) {
                                    if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                    }
                                } else {
                                    C12580w.C12582b mo4386b2 = (this.f28013e & 2) == 2 ? this.f28018z.mo4386b() : null;
                                    C12580w c12580w = (C12580w) c13573e.m4486u(C12580w.f28269x, c13575f);
                                    this.f28018z = c12580w;
                                    if (mo4386b2 != null) {
                                        mo4386b2.m7459x(c12580w);
                                        this.f28018z = mo4386b2.m7465r();
                                    }
                                    this.f28013e |= 2;
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.f28016x = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28016x.add(c13573e.m4486u(C12562r.f28160H, c13575f));
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
                    this.f28014f = Collections.unmodifiableList(this.f28014f);
                }
                if (z2 & true) {
                    this.f28015w = Collections.unmodifiableList(this.f28015w);
                }
                if (z2 & true) {
                    this.f28016x = Collections.unmodifiableList(this.f28016x);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28012d = m4542O.m4530I();
                    throw th2;
                }
                this.f28012d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28014f = Collections.unmodifiableList(this.f28014f);
        }
        if (z2 & true) {
            this.f28015w = Collections.unmodifiableList(this.f28015w);
        }
        if (z2 & true) {
            this.f28016x = Collections.unmodifiableList(this.f28016x);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28012d = m4542O.m4530I();
            throw th3;
        }
        this.f28012d = m4542O.m4530I();
        mo4433m();
    }
}
