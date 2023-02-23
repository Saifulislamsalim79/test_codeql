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
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.s */
/* loaded from: classes3.dex */
public final class C12565s extends AbstractC13580h.AbstractC13584d<C12565s> implements Object {

    /* renamed from: E */
    private static final C12565s f28184E;

    /* renamed from: F */
    public static InterfaceC13604q<C12565s> f28185F = new C12566a();

    /* renamed from: A */
    private List<Integer> f28186A;

    /* renamed from: B */
    private int f28187B;

    /* renamed from: C */
    private byte f28188C;

    /* renamed from: D */
    private int f28189D;

    /* renamed from: d */
    private final AbstractC13570d f28190d;

    /* renamed from: e */
    private int f28191e;

    /* renamed from: f */
    private int f28192f;

    /* renamed from: w */
    private int f28193w;

    /* renamed from: x */
    private boolean f28194x;

    /* renamed from: y */
    private EnumC12568c f28195y;

    /* renamed from: z */
    private List<C12555q> f28196z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.s$a */
    /* loaded from: classes3.dex */
    static class C12566a extends AbstractC13566b<C12565s> {
        C12566a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12565s mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12565s(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.s$b */
    /* loaded from: classes3.dex */
    public static final class C12567b extends AbstractC13580h.AbstractC13583c<C12565s, C12567b> implements Object {

        /* renamed from: f */
        private int f28199f;

        /* renamed from: w */
        private int f28200w;

        /* renamed from: x */
        private int f28201x;

        /* renamed from: y */
        private boolean f28202y;

        /* renamed from: z */
        private EnumC12568c f28203z = EnumC12568c.INV;

        /* renamed from: A */
        private List<C12555q> f28197A = Collections.emptyList();

        /* renamed from: B */
        private List<Integer> f28198B = Collections.emptyList();

        private C12567b() {
            m7618G();
        }

        /* renamed from: A */
        private void m7624A() {
            if ((this.f28199f & 16) != 16) {
                this.f28197A = new ArrayList(this.f28197A);
                this.f28199f |= 16;
            }
        }

        /* renamed from: G */
        private void m7618G() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12567b m7607y() {
            return new C12567b();
        }

        /* renamed from: z */
        private void m7606z() {
            if ((this.f28199f & 32) != 32) {
                this.f28198B = new ArrayList(this.f28198B);
                this.f28199f |= 32;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: B */
        public C12565s mo4442k() {
            return C12565s.m7644K();
        }

        /* renamed from: C */
        public C12555q m7622C(int i) {
            return this.f28197A.get(i);
        }

        /* renamed from: D */
        public int m7621D() {
            return this.f28197A.size();
        }

        /* renamed from: E */
        public boolean m7620E() {
            return (this.f28199f & 1) == 1;
        }

        /* renamed from: F */
        public boolean m7619F() {
            return (this.f28199f & 2) == 2;
        }

        /* renamed from: H */
        public C12567b m7617H(C12565s c12565s) {
            if (c12565s == C12565s.m7644K()) {
                return this;
            }
            if (c12565s.m7634U()) {
                m7615K(c12565s.m7642M());
            }
            if (c12565s.m7633W()) {
                m7614L(c12565s.m7641N());
            }
            if (c12565s.m7632X()) {
                m7613M(c12565s.m7640O());
            }
            if (c12565s.m7631Y()) {
                m7612N(c12565s.m7635T());
            }
            if (!c12565s.f28196z.isEmpty()) {
                if (this.f28197A.isEmpty()) {
                    this.f28197A = c12565s.f28196z;
                    this.f28199f &= -17;
                } else {
                    m7624A();
                    this.f28197A.addAll(c12565s.f28196z);
                }
            }
            if (!c12565s.f28186A.isEmpty()) {
                if (this.f28198B.isEmpty()) {
                    this.f28198B = c12565s.f28186A;
                    this.f28199f &= -33;
                } else {
                    m7606z();
                    this.f28198B.addAll(c12565s.f28186A);
                }
            }
            m4434t(c12565s);
            m4439o(m4441l().m4538e(c12565s.f28190d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s.C12567b m7616I(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.s> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s.f28185F     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.s r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7617H(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.s r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7617H(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12565s.C12567b.m7616I(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.s$b");
        }

        /* renamed from: K */
        public C12567b m7615K(int i) {
            this.f28199f |= 1;
            this.f28200w = i;
            return this;
        }

        /* renamed from: L */
        public C12567b m7614L(int i) {
            this.f28199f |= 2;
            this.f28201x = i;
            return this;
        }

        /* renamed from: M */
        public C12567b m7613M(boolean z) {
            this.f28199f |= 4;
            this.f28202y = z;
            return this;
        }

        /* renamed from: N */
        public C12567b m7612N(EnumC12568c enumC12568c) {
            if (enumC12568c != null) {
                this.f28199f |= 8;
                this.f28203z = enumC12568c;
                return this;
            }
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7616I(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7616I(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m7620E() && m7619F()) {
                for (int i = 0; i < m7621D(); i++) {
                    if (!m7622C(i).mo4379h()) {
                        return false;
                    }
                }
                return m4435s();
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m7617H((C12565s) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12565s build() {
            C12565s m7609w = m7609w();
            if (m7609w.mo4379h()) {
                return m7609w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7609w);
        }

        /* renamed from: w */
        public C12565s m7609w() {
            C12565s c12565s = new C12565s(this);
            int i = this.f28199f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12565s.f28192f = this.f28200w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12565s.f28193w = this.f28201x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12565s.f28194x = this.f28202y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12565s.f28195y = this.f28203z;
            if ((this.f28199f & 16) == 16) {
                this.f28197A = Collections.unmodifiableList(this.f28197A);
                this.f28199f &= -17;
            }
            c12565s.f28196z = this.f28197A;
            if ((this.f28199f & 32) == 32) {
                this.f28198B = Collections.unmodifiableList(this.f28198B);
                this.f28199f &= -33;
            }
            c12565s.f28186A = this.f28198B;
            c12565s.f28191e = i2;
            return c12565s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12567b mo4443j() {
            C12567b m7607y = m7607y();
            m7607y.m7617H(m7609w());
            return m7607y;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.s$c */
    /* loaded from: classes3.dex */
    public enum EnumC12568c implements C13588i.InterfaceC13589a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: c */
        private final int f28208c;

        EnumC12568c(int i, int i2) {
            this.f28208c = i2;
        }

        /* renamed from: a */
        public static EnumC12568c m7605a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return INV;
                }
                return OUT;
            }
            return IN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f28208c;
        }
    }

    static {
        C12565s c12565s = new C12565s(true);
        f28184E = c12565s;
        c12565s.m7630Z();
    }

    /* renamed from: K */
    public static C12565s m7644K() {
        return f28184E;
    }

    /* renamed from: Z */
    private void m7630Z() {
        this.f28192f = 0;
        this.f28193w = 0;
        this.f28194x = false;
        this.f28195y = EnumC12568c.INV;
        this.f28196z = Collections.emptyList();
        this.f28186A = Collections.emptyList();
    }

    /* renamed from: a0 */
    public static C12567b m7629a0() {
        return C12567b.m7607y();
    }

    /* renamed from: b0 */
    public static C12567b m7628b0(C12565s c12565s) {
        C12567b m7629a0 = m7629a0();
        m7629a0.m7617H(c12565s);
        return m7629a0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: L */
    public C12565s mo4380a() {
        return f28184E;
    }

    /* renamed from: M */
    public int m7642M() {
        return this.f28192f;
    }

    /* renamed from: N */
    public int m7641N() {
        return this.f28193w;
    }

    /* renamed from: O */
    public boolean m7640O() {
        return this.f28194x;
    }

    /* renamed from: P */
    public C12555q m7639P(int i) {
        return this.f28196z.get(i);
    }

    /* renamed from: Q */
    public int m7638Q() {
        return this.f28196z.size();
    }

    /* renamed from: R */
    public List<Integer> m7637R() {
        return this.f28186A;
    }

    /* renamed from: S */
    public List<C12555q> m7636S() {
        return this.f28196z;
    }

    /* renamed from: T */
    public EnumC12568c m7635T() {
        return this.f28195y;
    }

    /* renamed from: U */
    public boolean m7634U() {
        return (this.f28191e & 1) == 1;
    }

    /* renamed from: W */
    public boolean m7633W() {
        return (this.f28191e & 2) == 2;
    }

    /* renamed from: X */
    public boolean m7632X() {
        return (this.f28191e & 4) == 4;
    }

    /* renamed from: Y */
    public boolean m7631Y() {
        return (this.f28191e & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28191e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f28192f);
        }
        if ((this.f28191e & 2) == 2) {
            codedOutputStream.m4618a0(2, this.f28193w);
        }
        if ((this.f28191e & 4) == 4) {
            codedOutputStream.m4634L(3, this.f28194x);
        }
        if ((this.f28191e & 8) == 8) {
            codedOutputStream.m4627S(4, this.f28195y.mo4405d());
        }
        for (int i = 0; i < this.f28196z.size(); i++) {
            codedOutputStream.m4612d0(5, this.f28196z.get(i));
        }
        if (m7637R().size() > 0) {
            codedOutputStream.m4590o0(50);
            codedOutputStream.m4590o0(this.f28187B);
        }
        for (int i2 = 0; i2 < this.f28186A.size(); i2++) {
            codedOutputStream.m4616b0(this.f28186A.get(i2).intValue());
        }
        m4424y.m4422a(1000, codedOutputStream);
        codedOutputStream.m4602i0(this.f28190d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c0 */
    public C12567b mo4383f() {
        return m7629a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28189D;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28191e & 1) == 1 ? CodedOutputStream.m4591o(1, this.f28192f) + 0 : 0;
        if ((this.f28191e & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(2, this.f28193w);
        }
        if ((this.f28191e & 4) == 4) {
            m4591o += CodedOutputStream.m4619a(3, this.f28194x);
        }
        if ((this.f28191e & 8) == 8) {
            m4591o += CodedOutputStream.m4605h(4, this.f28195y.mo4405d());
        }
        for (int i2 = 0; i2 < this.f28196z.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(5, this.f28196z.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f28186A.size(); i4++) {
            i3 += CodedOutputStream.m4589p(this.f28186A.get(i4).intValue());
        }
        int i5 = m4591o + i3;
        if (!m7637R().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m4589p(i3);
        }
        this.f28187B = i3;
        int m4429t = i5 + m4429t() + this.f28190d.size();
        this.f28189D = m4429t;
        return m4429t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d0 */
    public C12567b mo4386b() {
        return m7628b0(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12565s> mo4382g() {
        return f28185F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28188C;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m7634U()) {
            this.f28188C = (byte) 0;
            return false;
        } else if (!m7633W()) {
            this.f28188C = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m7638Q(); i++) {
                if (!m7639P(i).mo4379h()) {
                    this.f28188C = (byte) 0;
                    return false;
                }
            }
            if (!m4430s()) {
                this.f28188C = (byte) 0;
                return false;
            }
            this.f28188C = (byte) 1;
            return true;
        }
    }

    private C12565s(AbstractC13580h.AbstractC13583c<C12565s, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28187B = -1;
        this.f28188C = (byte) -1;
        this.f28189D = -1;
        this.f28190d = abstractC13583c.m4441l();
    }

    private C12565s(boolean z) {
        this.f28187B = -1;
        this.f28188C = (byte) -1;
        this.f28189D = -1;
        this.f28190d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12565s(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28187B = -1;
        this.f28188C = (byte) -1;
        this.f28189D = -1;
        m7630Z();
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
                                this.f28191e |= 1;
                                this.f28192f = c13573e.m4488s();
                            } else if (m4516K == 16) {
                                this.f28191e |= 2;
                                this.f28193w = c13573e.m4488s();
                            } else if (m4516K == 24) {
                                this.f28191e |= 4;
                                this.f28194x = c13573e.m4496k();
                            } else if (m4516K == 32) {
                                int m4493n = c13573e.m4493n();
                                EnumC12568c m7605a = EnumC12568c.m7605a(m4493n);
                                if (m7605a == null) {
                                    m4636J.m4590o0(m4516K);
                                    m4636J.m4590o0(m4493n);
                                } else {
                                    this.f28191e |= 8;
                                    this.f28195y = m7605a;
                                }
                            } else if (m4516K == 42) {
                                if (!(z2 & true)) {
                                    this.f28196z = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28196z.add(c13573e.m4486u(C12555q.f28106M, c13575f));
                            } else if (m4516K == 48) {
                                if (!(z2 & true)) {
                                    this.f28186A = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28186A.add(Integer.valueOf(c13573e.m4488s()));
                            } else if (m4516K != 50) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                int m4497j = c13573e.m4497j(c13573e.m4526A());
                                if (!(z2 & true) && c13573e.m4502e() > 0) {
                                    this.f28186A = new ArrayList();
                                    z2 |= true;
                                }
                                while (c13573e.m4502e() > 0) {
                                    this.f28186A.add(Integer.valueOf(c13573e.m4488s()));
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
                    this.f28196z = Collections.unmodifiableList(this.f28196z);
                }
                if (z2 & true) {
                    this.f28186A = Collections.unmodifiableList(this.f28186A);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28190d = m4542O.m4530I();
                    throw th2;
                }
                this.f28190d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28196z = Collections.unmodifiableList(this.f28196z);
        }
        if (z2 & true) {
            this.f28186A = Collections.unmodifiableList(this.f28186A);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28190d = m4542O.m4530I();
            throw th3;
        }
        this.f28190d = m4542O.m4530I();
        mo4433m();
    }
}
