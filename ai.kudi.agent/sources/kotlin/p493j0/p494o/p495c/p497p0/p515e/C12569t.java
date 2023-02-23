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
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.t */
/* loaded from: classes3.dex */
public final class C12569t extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: y */
    private static final C12569t f28209y;

    /* renamed from: z */
    public static InterfaceC13604q<C12569t> f28210z = new C12570a();

    /* renamed from: c */
    private final AbstractC13570d f28211c;

    /* renamed from: d */
    private int f28212d;

    /* renamed from: e */
    private List<C12555q> f28213e;

    /* renamed from: f */
    private int f28214f;

    /* renamed from: w */
    private byte f28215w;

    /* renamed from: x */
    private int f28216x;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.t$a */
    /* loaded from: classes3.dex */
    static class C12570a extends AbstractC13566b<C12569t> {
        C12570a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12569t mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12569t(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.t$b */
    /* loaded from: classes3.dex */
    public static final class C12571b extends AbstractC13580h.AbstractC13582b<C12569t, C12571b> implements Object {

        /* renamed from: d */
        private int f28217d;

        /* renamed from: e */
        private List<C12555q> f28218e = Collections.emptyList();

        /* renamed from: f */
        private int f28219f = -1;

        private C12571b() {
            m7575y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12571b m7580t() {
            return new C12571b();
        }

        /* renamed from: u */
        private void m7579u() {
            if ((this.f28217d & 1) != 1) {
                this.f28218e = new ArrayList(this.f28218e);
                this.f28217d |= 1;
            }
        }

        /* renamed from: y */
        private void m7575y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t.C12571b m7586A(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.t> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t.f28210z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.t r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7574z(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.t r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7574z(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t.C12571b.m7586A(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.t$b");
        }

        /* renamed from: B */
        public C12571b m7585B(int i) {
            this.f28217d |= 2;
            this.f28219f = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7586A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7586A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m7576x(); i++) {
                if (!m7577w(i).mo4379h()) {
                    return false;
                }
            }
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12571b mo4440n(C12569t c12569t) {
            m7574z(c12569t);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12569t build() {
            C12569t m7582r = m7582r();
            if (m7582r.mo4379h()) {
                return m7582r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7582r);
        }

        /* renamed from: r */
        public C12569t m7582r() {
            C12569t c12569t = new C12569t(this);
            int i = this.f28217d;
            if ((i & 1) == 1) {
                this.f28218e = Collections.unmodifiableList(this.f28218e);
                this.f28217d &= -2;
            }
            c12569t.f28213e = this.f28218e;
            int i2 = (i & 2) != 2 ? 0 : 1;
            c12569t.f28214f = this.f28219f;
            c12569t.f28212d = i2;
            return c12569t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12571b mo4443j() {
            C12571b m7580t = m7580t();
            m7580t.m7574z(m7582r());
            return m7580t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: v */
        public C12569t mo4442k() {
            return C12569t.m7591w();
        }

        /* renamed from: w */
        public C12555q m7577w(int i) {
            return this.f28218e.get(i);
        }

        /* renamed from: x */
        public int m7576x() {
            return this.f28218e.size();
        }

        /* renamed from: z */
        public C12571b m7574z(C12569t c12569t) {
            if (c12569t == C12569t.m7591w()) {
                return this;
            }
            if (!c12569t.f28213e.isEmpty()) {
                if (this.f28218e.isEmpty()) {
                    this.f28218e = c12569t.f28213e;
                    this.f28217d &= -2;
                } else {
                    m7579u();
                    this.f28218e.addAll(c12569t.f28213e);
                }
            }
            if (c12569t.m7602C()) {
                m7585B(c12569t.m7589y());
            }
            m4439o(m4441l().m4538e(c12569t.f28211c));
            return this;
        }
    }

    static {
        C12569t c12569t = new C12569t(true);
        f28209y = c12569t;
        c12569t.m7601D();
    }

    /* renamed from: D */
    private void m7601D() {
        this.f28213e = Collections.emptyList();
        this.f28214f = -1;
    }

    /* renamed from: E */
    public static C12571b m7600E() {
        return C12571b.m7580t();
    }

    /* renamed from: F */
    public static C12571b m7599F(C12569t c12569t) {
        C12571b m7600E = m7600E();
        m7600E.m7574z(c12569t);
        return m7600E;
    }

    /* renamed from: w */
    public static C12569t m7591w() {
        return f28209y;
    }

    /* renamed from: A */
    public int m7604A() {
        return this.f28213e.size();
    }

    /* renamed from: B */
    public List<C12555q> m7603B() {
        return this.f28213e;
    }

    /* renamed from: C */
    public boolean m7602C() {
        return (this.f28212d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: G */
    public C12571b mo4383f() {
        return m7600E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: H */
    public C12571b mo4386b() {
        return m7599F(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        for (int i = 0; i < this.f28213e.size(); i++) {
            codedOutputStream.m4612d0(1, this.f28213e.get(i));
        }
        if ((this.f28212d & 1) == 1) {
            codedOutputStream.m4618a0(2, this.f28214f);
        }
        codedOutputStream.m4602i0(this.f28211c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28216x;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28213e.size(); i3++) {
            i2 += CodedOutputStream.m4583s(1, this.f28213e.get(i3));
        }
        if ((this.f28212d & 1) == 1) {
            i2 += CodedOutputStream.m4591o(2, this.f28214f);
        }
        int size = i2 + this.f28211c.size();
        this.f28216x = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12569t> mo4382g() {
        return f28210z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28215w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m7604A(); i++) {
            if (!m7588z(i).mo4379h()) {
                this.f28215w = (byte) 0;
                return false;
            }
        }
        this.f28215w = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: x */
    public C12569t mo4380a() {
        return f28209y;
    }

    /* renamed from: y */
    public int m7589y() {
        return this.f28214f;
    }

    /* renamed from: z */
    public C12555q m7588z(int i) {
        return this.f28213e.get(i);
    }

    private C12569t(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f28215w = (byte) -1;
        this.f28216x = -1;
        this.f28211c = abstractC13582b.m4441l();
    }

    private C12569t(boolean z) {
        this.f28215w = (byte) -1;
        this.f28216x = -1;
        this.f28211c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12569t(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28215w = (byte) -1;
        this.f28216x = -1;
        m7601D();
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
                                if (!(z2 & true)) {
                                    this.f28213e = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28213e.add(c13573e.m4486u(C12555q.f28106M, c13575f));
                            } else if (m4516K != 16) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                this.f28212d |= 1;
                                this.f28214f = c13573e.m4488s();
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
                    this.f28213e = Collections.unmodifiableList(this.f28213e);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28211c = m4542O.m4530I();
                    throw th2;
                }
                this.f28211c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28213e = Collections.unmodifiableList(this.f28213e);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28211c = m4542O.m4530I();
            throw th3;
        }
        this.f28211c = m4542O.m4530I();
        mo4433m();
    }
}
