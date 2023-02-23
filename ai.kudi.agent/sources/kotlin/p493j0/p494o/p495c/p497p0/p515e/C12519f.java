package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h;
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
/* renamed from: kotlin.j0.o.c.p0.e.f */
/* loaded from: classes3.dex */
public final class C12519f extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: A */
    private static final C12519f f27905A;

    /* renamed from: B */
    public static InterfaceC13604q<C12519f> f27906B = new C12520a();

    /* renamed from: c */
    private final AbstractC13570d f27907c;

    /* renamed from: d */
    private int f27908d;

    /* renamed from: e */
    private EnumC12522c f27909e;

    /* renamed from: f */
    private List<C12527h> f27910f;

    /* renamed from: w */
    private C12527h f27911w;

    /* renamed from: x */
    private EnumC12523d f27912x;

    /* renamed from: y */
    private byte f27913y;

    /* renamed from: z */
    private int f27914z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.f$a */
    /* loaded from: classes3.dex */
    static class C12520a extends AbstractC13566b<C12519f> {
        C12520a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12519f mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12519f(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.f$b */
    /* loaded from: classes3.dex */
    public static final class C12521b extends AbstractC13580h.AbstractC13582b<C12519f, C12521b> implements Object {

        /* renamed from: d */
        private int f27915d;

        /* renamed from: e */
        private EnumC12522c f27916e = EnumC12522c.RETURNS_CONSTANT;

        /* renamed from: f */
        private List<C12527h> f27917f = Collections.emptyList();

        /* renamed from: w */
        private C12527h f27918w = C12527h.m8235F();

        /* renamed from: x */
        private EnumC12523d f27919x = EnumC12523d.AT_MOST_ONCE;

        private C12521b() {
            m8282A();
        }

        /* renamed from: A */
        private void m8282A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12521b m8272t() {
            return new C12521b();
        }

        /* renamed from: u */
        private void m8271u() {
            if ((this.f27915d & 2) != 2) {
                this.f27917f = new ArrayList(this.f27917f);
                this.f27915d |= 2;
            }
        }

        /* renamed from: B */
        public C12521b m8281B(C12527h c12527h) {
            if ((this.f27915d & 4) == 4 && this.f27918w != C12527h.m8235F()) {
                C12527h.C12529b m8220U = C12527h.m8220U(this.f27918w);
                m8220U.m8203E(c12527h);
                this.f27918w = m8220U.m8194r();
            } else {
                this.f27918w = c12527h;
            }
            this.f27915d |= 4;
            return this;
        }

        /* renamed from: C */
        public C12521b m8280C(C12519f c12519f) {
            if (c12519f == C12519f.m8284z()) {
                return this;
            }
            if (c12519f.m8299G()) {
                m8278E(c12519f.m8302D());
            }
            if (!c12519f.f27910f.isEmpty()) {
                if (this.f27917f.isEmpty()) {
                    this.f27917f = c12519f.f27910f;
                    this.f27915d &= -3;
                } else {
                    m8271u();
                    this.f27917f.addAll(c12519f.f27910f);
                }
            }
            if (c12519f.m8300F()) {
                m8281B(c12519f.m8285y());
            }
            if (c12519f.m8298H()) {
                m8277F(c12519f.m8301E());
            }
            m4439o(m4441l().m4538e(c12519f.f27907c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12519f.C12521b m8279D(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.f> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12519f.f27906B     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.f r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12519f) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8280C(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.f r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12519f) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8280C(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12519f.C12521b.m8279D(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.f$b");
        }

        /* renamed from: E */
        public C12521b m8278E(EnumC12522c enumC12522c) {
            if (enumC12522c != null) {
                this.f27915d |= 1;
                this.f27916e = enumC12522c;
                return this;
            }
            throw null;
        }

        /* renamed from: F */
        public C12521b m8277F(EnumC12523d enumC12523d) {
            if (enumC12523d != null) {
                this.f27915d |= 8;
                this.f27919x = enumC12523d;
                return this;
            }
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8279D(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8279D(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m8267y(); i++) {
                if (!m8268x(i).mo4379h()) {
                    return false;
                }
            }
            return !m8266z() || m8270v().mo4379h();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12521b mo4440n(C12519f c12519f) {
            m8280C(c12519f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12519f build() {
            C12519f m8274r = m8274r();
            if (m8274r.mo4379h()) {
                return m8274r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8274r);
        }

        /* renamed from: r */
        public C12519f m8274r() {
            C12519f c12519f = new C12519f(this);
            int i = this.f27915d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12519f.f27909e = this.f27916e;
            if ((this.f27915d & 2) == 2) {
                this.f27917f = Collections.unmodifiableList(this.f27917f);
                this.f27915d &= -3;
            }
            c12519f.f27910f = this.f27917f;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c12519f.f27911w = this.f27918w;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c12519f.f27912x = this.f27919x;
            c12519f.f27908d = i2;
            return c12519f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12521b mo4443j() {
            C12521b m8272t = m8272t();
            m8272t.m8280C(m8274r());
            return m8272t;
        }

        /* renamed from: v */
        public C12527h m8270v() {
            return this.f27918w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: w */
        public C12519f mo4442k() {
            return C12519f.m8284z();
        }

        /* renamed from: x */
        public C12527h m8268x(int i) {
            return this.f27917f.get(i);
        }

        /* renamed from: y */
        public int m8267y() {
            return this.f27917f.size();
        }

        /* renamed from: z */
        public boolean m8266z() {
            return (this.f27915d & 4) == 4;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.f$c */
    /* loaded from: classes3.dex */
    public enum EnumC12522c implements C13588i.InterfaceC13589a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: c */
        private final int f27924c;

        EnumC12522c(int i, int i2) {
            this.f27924c = i2;
        }

        /* renamed from: a */
        public static EnumC12522c m8265a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return RETURNS_NOT_NULL;
                }
                return CALLS;
            }
            return RETURNS_CONSTANT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f27924c;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.f$d */
    /* loaded from: classes3.dex */
    public enum EnumC12523d implements C13588i.InterfaceC13589a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: c */
        private final int f27929c;

        EnumC12523d(int i, int i2) {
            this.f27929c = i2;
        }

        /* renamed from: a */
        public static EnumC12523d m8264a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return AT_LEAST_ONCE;
                }
                return EXACTLY_ONCE;
            }
            return AT_MOST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f27929c;
        }
    }

    static {
        C12519f c12519f = new C12519f(true);
        f27905A = c12519f;
        c12519f.m8297I();
    }

    /* renamed from: I */
    private void m8297I() {
        this.f27909e = EnumC12522c.RETURNS_CONSTANT;
        this.f27910f = Collections.emptyList();
        this.f27911w = C12527h.m8235F();
        this.f27912x = EnumC12523d.AT_MOST_ONCE;
    }

    /* renamed from: J */
    public static C12521b m8296J() {
        return C12521b.m8272t();
    }

    /* renamed from: K */
    public static C12521b m8295K(C12519f c12519f) {
        C12521b m8296J = m8296J();
        m8296J.m8280C(c12519f);
        return m8296J;
    }

    /* renamed from: z */
    public static C12519f m8284z() {
        return f27905A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: A */
    public C12519f mo4380a() {
        return f27905A;
    }

    /* renamed from: B */
    public C12527h m8304B(int i) {
        return this.f27910f.get(i);
    }

    /* renamed from: C */
    public int m8303C() {
        return this.f27910f.size();
    }

    /* renamed from: D */
    public EnumC12522c m8302D() {
        return this.f27909e;
    }

    /* renamed from: E */
    public EnumC12523d m8301E() {
        return this.f27912x;
    }

    /* renamed from: F */
    public boolean m8300F() {
        return (this.f27908d & 2) == 2;
    }

    /* renamed from: G */
    public boolean m8299G() {
        return (this.f27908d & 1) == 1;
    }

    /* renamed from: H */
    public boolean m8298H() {
        return (this.f27908d & 4) == 4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: L */
    public C12521b mo4383f() {
        return m8296J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: M */
    public C12521b mo4386b() {
        return m8295K(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        if ((this.f27908d & 1) == 1) {
            codedOutputStream.m4627S(1, this.f27909e.mo4405d());
        }
        for (int i = 0; i < this.f27910f.size(); i++) {
            codedOutputStream.m4612d0(2, this.f27910f.get(i));
        }
        if ((this.f27908d & 2) == 2) {
            codedOutputStream.m4612d0(3, this.f27911w);
        }
        if ((this.f27908d & 4) == 4) {
            codedOutputStream.m4627S(4, this.f27912x.mo4405d());
        }
        codedOutputStream.m4602i0(this.f27907c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27914z;
        if (i != -1) {
            return i;
        }
        int m4605h = (this.f27908d & 1) == 1 ? CodedOutputStream.m4605h(1, this.f27909e.mo4405d()) + 0 : 0;
        for (int i2 = 0; i2 < this.f27910f.size(); i2++) {
            m4605h += CodedOutputStream.m4583s(2, this.f27910f.get(i2));
        }
        if ((this.f27908d & 2) == 2) {
            m4605h += CodedOutputStream.m4583s(3, this.f27911w);
        }
        if ((this.f27908d & 4) == 4) {
            m4605h += CodedOutputStream.m4605h(4, this.f27912x.mo4405d());
        }
        int size = m4605h + this.f27907c.size();
        this.f27914z = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12519f> mo4382g() {
        return f27906B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27913y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m8303C(); i++) {
            if (!m8304B(i).mo4379h()) {
                this.f27913y = (byte) 0;
                return false;
            }
        }
        if (m8300F() && !m8285y().mo4379h()) {
            this.f27913y = (byte) 0;
            return false;
        }
        this.f27913y = (byte) 1;
        return true;
    }

    /* renamed from: y */
    public C12527h m8285y() {
        return this.f27911w;
    }

    private C12519f(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f27913y = (byte) -1;
        this.f27914z = -1;
        this.f27907c = abstractC13582b.m4441l();
    }

    private C12519f(boolean z) {
        this.f27913y = (byte) -1;
        this.f27914z = -1;
        this.f27907c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12519f(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27913y = (byte) -1;
        this.f27914z = -1;
        m8297I();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m4516K = c13573e.m4516K();
                    if (m4516K != 0) {
                        if (m4516K == 8) {
                            int m4493n = c13573e.m4493n();
                            EnumC12522c m8265a = EnumC12522c.m8265a(m4493n);
                            if (m8265a == null) {
                                m4636J.m4590o0(m4516K);
                                m4636J.m4590o0(m4493n);
                            } else {
                                this.f27908d |= 1;
                                this.f27909e = m8265a;
                            }
                        } else if (m4516K == 18) {
                            if (!(z2 & true)) {
                                this.f27910f = new ArrayList();
                                z2 |= true;
                            }
                            this.f27910f.add(c13573e.m4486u(C12527h.f27940E, c13575f));
                        } else if (m4516K == 26) {
                            C12527h.C12529b mo4386b = (this.f27908d & 2) == 2 ? this.f27911w.mo4386b() : null;
                            C12527h c12527h = (C12527h) c13573e.m4486u(C12527h.f27940E, c13575f);
                            this.f27911w = c12527h;
                            if (mo4386b != null) {
                                mo4386b.m8203E(c12527h);
                                this.f27911w = mo4386b.m8194r();
                            }
                            this.f27908d |= 2;
                        } else if (m4516K != 32) {
                            if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                            }
                        } else {
                            int m4493n2 = c13573e.m4493n();
                            EnumC12523d m8264a = EnumC12523d.m8264a(m4493n2);
                            if (m8264a == null) {
                                m4636J.m4590o0(m4516K);
                                m4636J.m4590o0(m4493n2);
                            } else {
                                this.f27908d |= 4;
                                this.f27912x = m8264a;
                            }
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f27910f = Collections.unmodifiableList(this.f27910f);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27907c = m4542O.m4530I();
                        throw th2;
                    }
                    this.f27907c = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.m4559i(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.m4559i(this);
                throw invalidProtocolBufferException;
            }
        }
        if (z2 & true) {
            this.f27910f = Collections.unmodifiableList(this.f27910f);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27907c = m4542O.m4530I();
            throw th3;
        }
        this.f27907c = m4542O.m4530I();
        mo4433m();
    }
}
