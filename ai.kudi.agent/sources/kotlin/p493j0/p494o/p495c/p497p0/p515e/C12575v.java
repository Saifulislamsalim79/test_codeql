package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13566b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.C13573e;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.v */
/* loaded from: classes3.dex */
public final class C12575v extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: C */
    private static final C12575v f28239C;

    /* renamed from: D */
    public static InterfaceC13604q<C12575v> f28240D = new C12576a();

    /* renamed from: A */
    private byte f28241A;

    /* renamed from: B */
    private int f28242B;

    /* renamed from: c */
    private final AbstractC13570d f28243c;

    /* renamed from: d */
    private int f28244d;

    /* renamed from: e */
    private int f28245e;

    /* renamed from: f */
    private int f28246f;

    /* renamed from: w */
    private EnumC12578c f28247w;

    /* renamed from: x */
    private int f28248x;

    /* renamed from: y */
    private int f28249y;

    /* renamed from: z */
    private EnumC12579d f28250z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.v$a */
    /* loaded from: classes3.dex */
    static class C12576a extends AbstractC13566b<C12575v> {
        C12576a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12575v mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12575v(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.v$b */
    /* loaded from: classes3.dex */
    public static final class C12577b extends AbstractC13580h.AbstractC13582b<C12575v, C12577b> implements Object {

        /* renamed from: d */
        private int f28251d;

        /* renamed from: e */
        private int f28252e;

        /* renamed from: f */
        private int f28253f;

        /* renamed from: x */
        private int f28255x;

        /* renamed from: y */
        private int f28256y;

        /* renamed from: w */
        private EnumC12578c f28254w = EnumC12578c.ERROR;

        /* renamed from: z */
        private EnumC12579d f28257z = EnumC12579d.LANGUAGE_VERSION;

        private C12577b() {
            m7487v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12577b m7489t() {
            return new C12577b();
        }

        /* renamed from: v */
        private void m7487v() {
        }

        /* renamed from: A */
        public C12577b m7497A(int i) {
            this.f28251d |= 16;
            this.f28256y = i;
            return this;
        }

        /* renamed from: B */
        public C12577b m7496B(int i) {
            this.f28251d |= 1;
            this.f28252e = i;
            return this;
        }

        /* renamed from: C */
        public C12577b m7495C(int i) {
            this.f28251d |= 2;
            this.f28253f = i;
            return this;
        }

        /* renamed from: D */
        public C12577b m7494D(EnumC12579d enumC12579d) {
            if (enumC12579d != null) {
                this.f28251d |= 32;
                this.f28257z = enumC12579d;
                return this;
            }
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7485x(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7485x(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12577b mo4440n(C12575v c12575v) {
            m7486w(c12575v);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12575v build() {
            C12575v m7491r = m7491r();
            if (m7491r.mo4379h()) {
                return m7491r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7491r);
        }

        /* renamed from: r */
        public C12575v m7491r() {
            C12575v c12575v = new C12575v(this);
            int i = this.f28251d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12575v.f28245e = this.f28252e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12575v.f28246f = this.f28253f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12575v.f28247w = this.f28254w;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12575v.f28248x = this.f28255x;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c12575v.f28249y = this.f28256y;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            c12575v.f28250z = this.f28257z;
            c12575v.f28244d = i2;
            return c12575v;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12577b mo4443j() {
            C12577b m7489t = m7489t();
            m7489t.m7486w(m7491r());
            return m7489t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: u */
        public C12575v mo4442k() {
            return C12575v.m7499z();
        }

        /* renamed from: w */
        public C12577b m7486w(C12575v c12575v) {
            if (c12575v == C12575v.m7499z()) {
                return this;
            }
            if (c12575v.m7515K()) {
                m7496B(c12575v.m7521E());
            }
            if (c12575v.m7514L()) {
                m7495C(c12575v.m7520F());
            }
            if (c12575v.m7517I()) {
                m7483z(c12575v.m7523C());
            }
            if (c12575v.m7518H()) {
                m7484y(c12575v.m7524B());
            }
            if (c12575v.m7516J()) {
                m7497A(c12575v.m7522D());
            }
            if (c12575v.m7513M()) {
                m7494D(c12575v.m7519G());
            }
            m4439o(m4441l().m4538e(c12575v.f28243c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v.C12577b m7485x(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.v> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v.f28240D     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.v r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7486w(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.v r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7486w(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12575v.C12577b.m7485x(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.v$b");
        }

        /* renamed from: y */
        public C12577b m7484y(int i) {
            this.f28251d |= 8;
            this.f28255x = i;
            return this;
        }

        /* renamed from: z */
        public C12577b m7483z(EnumC12578c enumC12578c) {
            if (enumC12578c != null) {
                this.f28251d |= 4;
                this.f28254w = enumC12578c;
                return this;
            }
            throw null;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.v$c */
    /* loaded from: classes3.dex */
    public enum EnumC12578c implements C13588i.InterfaceC13589a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: c */
        private final int f28262c;

        EnumC12578c(int i, int i2) {
            this.f28262c = i2;
        }

        /* renamed from: a */
        public static EnumC12578c m7482a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return HIDDEN;
                }
                return ERROR;
            }
            return WARNING;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f28262c;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.v$d */
    /* loaded from: classes3.dex */
    public enum EnumC12579d implements C13588i.InterfaceC13589a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: c */
        private final int f28267c;

        EnumC12579d(int i, int i2) {
            this.f28267c = i2;
        }

        /* renamed from: a */
        public static EnumC12579d m7481a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return API_VERSION;
                }
                return COMPILER_VERSION;
            }
            return LANGUAGE_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f28267c;
        }
    }

    static {
        C12575v c12575v = new C12575v(true);
        f28239C = c12575v;
        c12575v.m7512N();
    }

    /* renamed from: N */
    private void m7512N() {
        this.f28245e = 0;
        this.f28246f = 0;
        this.f28247w = EnumC12578c.ERROR;
        this.f28248x = 0;
        this.f28249y = 0;
        this.f28250z = EnumC12579d.LANGUAGE_VERSION;
    }

    /* renamed from: O */
    public static C12577b m7511O() {
        return C12577b.m7489t();
    }

    /* renamed from: P */
    public static C12577b m7510P(C12575v c12575v) {
        C12577b m7511O = m7511O();
        m7511O.m7486w(c12575v);
        return m7511O;
    }

    /* renamed from: z */
    public static C12575v m7499z() {
        return f28239C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: A */
    public C12575v mo4380a() {
        return f28239C;
    }

    /* renamed from: B */
    public int m7524B() {
        return this.f28248x;
    }

    /* renamed from: C */
    public EnumC12578c m7523C() {
        return this.f28247w;
    }

    /* renamed from: D */
    public int m7522D() {
        return this.f28249y;
    }

    /* renamed from: E */
    public int m7521E() {
        return this.f28245e;
    }

    /* renamed from: F */
    public int m7520F() {
        return this.f28246f;
    }

    /* renamed from: G */
    public EnumC12579d m7519G() {
        return this.f28250z;
    }

    /* renamed from: H */
    public boolean m7518H() {
        return (this.f28244d & 8) == 8;
    }

    /* renamed from: I */
    public boolean m7517I() {
        return (this.f28244d & 4) == 4;
    }

    /* renamed from: J */
    public boolean m7516J() {
        return (this.f28244d & 16) == 16;
    }

    /* renamed from: K */
    public boolean m7515K() {
        return (this.f28244d & 1) == 1;
    }

    /* renamed from: L */
    public boolean m7514L() {
        return (this.f28244d & 2) == 2;
    }

    /* renamed from: M */
    public boolean m7513M() {
        return (this.f28244d & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: Q */
    public C12577b mo4383f() {
        return m7511O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: R */
    public C12577b mo4386b() {
        return m7510P(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        if ((this.f28244d & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f28245e);
        }
        if ((this.f28244d & 2) == 2) {
            codedOutputStream.m4618a0(2, this.f28246f);
        }
        if ((this.f28244d & 4) == 4) {
            codedOutputStream.m4627S(3, this.f28247w.mo4405d());
        }
        if ((this.f28244d & 8) == 8) {
            codedOutputStream.m4618a0(4, this.f28248x);
        }
        if ((this.f28244d & 16) == 16) {
            codedOutputStream.m4618a0(5, this.f28249y);
        }
        if ((this.f28244d & 32) == 32) {
            codedOutputStream.m4627S(6, this.f28250z.mo4405d());
        }
        codedOutputStream.m4602i0(this.f28243c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28242B;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28244d & 1) == 1 ? 0 + CodedOutputStream.m4591o(1, this.f28245e) : 0;
        if ((this.f28244d & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(2, this.f28246f);
        }
        if ((this.f28244d & 4) == 4) {
            m4591o += CodedOutputStream.m4605h(3, this.f28247w.mo4405d());
        }
        if ((this.f28244d & 8) == 8) {
            m4591o += CodedOutputStream.m4591o(4, this.f28248x);
        }
        if ((this.f28244d & 16) == 16) {
            m4591o += CodedOutputStream.m4591o(5, this.f28249y);
        }
        if ((this.f28244d & 32) == 32) {
            m4591o += CodedOutputStream.m4605h(6, this.f28250z.mo4405d());
        }
        int size = m4591o + this.f28243c.size();
        this.f28242B = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12575v> mo4382g() {
        return f28240D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28241A;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f28241A = (byte) 1;
        return true;
    }

    private C12575v(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f28241A = (byte) -1;
        this.f28242B = -1;
        this.f28243c = abstractC13582b.m4441l();
    }

    private C12575v(boolean z) {
        this.f28241A = (byte) -1;
        this.f28242B = -1;
        this.f28243c = AbstractC13570d.f29926c;
    }

    private C12575v(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28241A = (byte) -1;
        this.f28242B = -1;
        m7512N();
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
                                this.f28244d |= 1;
                                this.f28245e = c13573e.m4488s();
                            } else if (m4516K == 16) {
                                this.f28244d |= 2;
                                this.f28246f = c13573e.m4488s();
                            } else if (m4516K == 24) {
                                int m4493n = c13573e.m4493n();
                                EnumC12578c m7482a = EnumC12578c.m7482a(m4493n);
                                if (m7482a == null) {
                                    m4636J.m4590o0(m4516K);
                                    m4636J.m4590o0(m4493n);
                                } else {
                                    this.f28244d |= 4;
                                    this.f28247w = m7482a;
                                }
                            } else if (m4516K == 32) {
                                this.f28244d |= 8;
                                this.f28248x = c13573e.m4488s();
                            } else if (m4516K == 40) {
                                this.f28244d |= 16;
                                this.f28249y = c13573e.m4488s();
                            } else if (m4516K != 48) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                int m4493n2 = c13573e.m4493n();
                                EnumC12579d m7481a = EnumC12579d.m7481a(m4493n2);
                                if (m7481a == null) {
                                    m4636J.m4590o0(m4516K);
                                    m4636J.m4590o0(m4493n2);
                                } else {
                                    this.f28244d |= 32;
                                    this.f28250z = m7481a;
                                }
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
                    this.f28243c = m4542O.m4530I();
                    throw th2;
                }
                this.f28243c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28243c = m4542O.m4530I();
            throw th3;
        }
        this.f28243c = m4542O.m4530I();
        mo4433m();
    }
}
