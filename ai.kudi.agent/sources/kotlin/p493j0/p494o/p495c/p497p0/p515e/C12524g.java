package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
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
/* renamed from: kotlin.j0.o.c.p0.e.g */
/* loaded from: classes3.dex */
public final class C12524g extends AbstractC13580h.AbstractC13584d<C12524g> implements Object {

    /* renamed from: y */
    private static final C12524g f27930y;

    /* renamed from: z */
    public static InterfaceC13604q<C12524g> f27931z = new C12525a();

    /* renamed from: d */
    private final AbstractC13570d f27932d;

    /* renamed from: e */
    private int f27933e;

    /* renamed from: f */
    private int f27934f;

    /* renamed from: w */
    private byte f27935w;

    /* renamed from: x */
    private int f27936x;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.g$a */
    /* loaded from: classes3.dex */
    static class C12525a extends AbstractC13566b<C12524g> {
        C12525a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12524g mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12524g(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.g$b */
    /* loaded from: classes3.dex */
    public static final class C12526b extends AbstractC13580h.AbstractC13583c<C12524g, C12526b> implements Object {

        /* renamed from: f */
        private int f27937f;

        /* renamed from: w */
        private int f27938w;

        private C12526b() {
            m8250A();
        }

        /* renamed from: A */
        private void m8250A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12526b m8242y() {
            return new C12526b();
        }

        /* renamed from: B */
        public C12526b m8249B(C12524g c12524g) {
            if (c12524g == C12524g.m8260D()) {
                return this;
            }
            if (c12524g.m8257G()) {
                m8247D(c12524g.m8258F());
            }
            m4434t(c12524g);
            m4439o(m4441l().m4538e(c12524g.f27932d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g.C12526b m8248C(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.g> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g.f27931z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.g r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8249B(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.g r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8249B(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12524g.C12526b.m8248C(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.g$b");
        }

        /* renamed from: D */
        public C12526b m8247D(int i) {
            this.f27937f |= 1;
            this.f27938w = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8248C(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8248C(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            return m4435s();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m8249B((C12524g) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12524g build() {
            C12524g m8244w = m8244w();
            if (m8244w.mo4379h()) {
                return m8244w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8244w);
        }

        /* renamed from: w */
        public C12524g m8244w() {
            C12524g c12524g = new C12524g(this);
            int i = (this.f27937f & 1) != 1 ? 0 : 1;
            c12524g.f27934f = this.f27938w;
            c12524g.f27933e = i;
            return c12524g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12526b mo4443j() {
            C12526b m8242y = m8242y();
            m8242y.m8249B(m8244w());
            return m8242y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: z */
        public C12524g mo4442k() {
            return C12524g.m8260D();
        }
    }

    static {
        C12524g c12524g = new C12524g(true);
        f27930y = c12524g;
        c12524g.m8256H();
    }

    /* renamed from: D */
    public static C12524g m8260D() {
        return f27930y;
    }

    /* renamed from: H */
    private void m8256H() {
        this.f27934f = 0;
    }

    /* renamed from: I */
    public static C12526b m8255I() {
        return C12526b.m8242y();
    }

    /* renamed from: J */
    public static C12526b m8254J(C12524g c12524g) {
        C12526b m8255I = m8255I();
        m8255I.m8249B(c12524g);
        return m8255I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: E */
    public C12524g mo4380a() {
        return f27930y;
    }

    /* renamed from: F */
    public int m8258F() {
        return this.f27934f;
    }

    /* renamed from: G */
    public boolean m8257G() {
        return (this.f27933e & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: K */
    public C12526b mo4383f() {
        return m8255I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: L */
    public C12526b mo4386b() {
        return m8254J(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f27933e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f27934f);
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f27932d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27936x;
        if (i != -1) {
            return i;
        }
        int m4591o = ((this.f27933e & 1) == 1 ? 0 + CodedOutputStream.m4591o(1, this.f27934f) : 0) + m4429t() + this.f27932d.size();
        this.f27936x = m4591o;
        return m4591o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12524g> mo4382g() {
        return f27931z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27935w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m4430s()) {
            this.f27935w = (byte) 0;
            return false;
        }
        this.f27935w = (byte) 1;
        return true;
    }

    private C12524g(AbstractC13580h.AbstractC13583c<C12524g, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f27935w = (byte) -1;
        this.f27936x = -1;
        this.f27932d = abstractC13583c.m4441l();
    }

    private C12524g(boolean z) {
        this.f27935w = (byte) -1;
        this.f27936x = -1;
        this.f27932d = AbstractC13570d.f29926c;
    }

    private C12524g(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27935w = (byte) -1;
        this.f27936x = -1;
        m8256H();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int m4516K = c13573e.m4516K();
                    if (m4516K != 0) {
                        if (m4516K != 8) {
                            if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                            }
                        } else {
                            this.f27933e |= 1;
                            this.f27934f = c13573e.m4488s();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.m4559i(this);
                    throw e;
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
                    this.f27932d = m4542O.m4530I();
                    throw th2;
                }
                this.f27932d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27932d = m4542O.m4530I();
            throw th3;
        }
        this.f27932d = m4542O.m4530I();
        mo4433m();
    }
}
