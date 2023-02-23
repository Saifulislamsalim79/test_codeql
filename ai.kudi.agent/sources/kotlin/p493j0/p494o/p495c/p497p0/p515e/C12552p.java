package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13566b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.C13573e;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
import kotlin.reflect.jvm.internal.impl.protobuf.C13596l;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13597m;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13605r;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.p */
/* loaded from: classes3.dex */
public final class C12552p extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: w */
    private static final C12552p f28097w;

    /* renamed from: x */
    public static InterfaceC13604q<C12552p> f28098x = new C12553a();

    /* renamed from: c */
    private final AbstractC13570d f28099c;

    /* renamed from: d */
    private InterfaceC13597m f28100d;

    /* renamed from: e */
    private byte f28101e;

    /* renamed from: f */
    private int f28102f;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.p$a */
    /* loaded from: classes3.dex */
    static class C12553a extends AbstractC13566b<C12552p> {
        C12553a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12552p mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12552p(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.p$b */
    /* loaded from: classes3.dex */
    public static final class C12554b extends AbstractC13580h.AbstractC13582b<C12552p, C12554b> implements Object {

        /* renamed from: d */
        private int f28103d;

        /* renamed from: e */
        private InterfaceC13597m f28104e = C13596l.f29984d;

        private C12554b() {
            m7845w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12554b m7848t() {
            return new C12554b();
        }

        /* renamed from: u */
        private void m7847u() {
            if ((this.f28103d & 1) != 1) {
                this.f28104e = new C13596l(this.f28104e);
                this.f28103d |= 1;
            }
        }

        /* renamed from: w */
        private void m7845w() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7843y(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7843y(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12554b mo4440n(C12552p c12552p) {
            m7844x(c12552p);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12552p build() {
            C12552p m7850r = m7850r();
            if (m7850r.mo4379h()) {
                return m7850r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7850r);
        }

        /* renamed from: r */
        public C12552p m7850r() {
            C12552p c12552p = new C12552p(this);
            if ((this.f28103d & 1) == 1) {
                this.f28104e = this.f28104e.mo4316q();
                this.f28103d &= -2;
            }
            c12552p.f28100d = this.f28104e;
            return c12552p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12554b mo4443j() {
            C12554b m7848t = m7848t();
            m7848t.m7844x(m7850r());
            return m7848t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: v */
        public C12552p mo4442k() {
            return C12552p.m7859u();
        }

        /* renamed from: x */
        public C12554b m7844x(C12552p c12552p) {
            if (c12552p == C12552p.m7859u()) {
                return this;
            }
            if (!c12552p.f28100d.isEmpty()) {
                if (this.f28104e.isEmpty()) {
                    this.f28104e = c12552p.f28100d;
                    this.f28103d &= -2;
                } else {
                    m7847u();
                    this.f28104e.addAll(c12552p.f28100d);
                }
            }
            m4439o(m4441l().m4538e(c12552p.f28099c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p.C12554b m7843y(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.p> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p.f28098x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.p r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7844x(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.p r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7844x(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p.C12554b.m7843y(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.p$b");
        }
    }

    static {
        C12552p c12552p = new C12552p(true);
        f28097w = c12552p;
        c12552p.m7855y();
    }

    /* renamed from: A */
    public static C12554b m7865A(C12552p c12552p) {
        C12554b m7854z = m7854z();
        m7854z.m7844x(c12552p);
        return m7854z;
    }

    /* renamed from: u */
    public static C12552p m7859u() {
        return f28097w;
    }

    /* renamed from: y */
    private void m7855y() {
        this.f28100d = C13596l.f29984d;
    }

    /* renamed from: z */
    public static C12554b m7854z() {
        return C12554b.m7848t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: B */
    public C12554b mo4383f() {
        return m7854z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: C */
    public C12554b mo4386b() {
        return m7865A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        for (int i = 0; i < this.f28100d.size(); i++) {
            codedOutputStream.m4631O(1, this.f28100d.mo4321M(i));
        }
        codedOutputStream.m4602i0(this.f28099c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28102f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28100d.size(); i3++) {
            i2 += CodedOutputStream.m4611e(this.f28100d.mo4321M(i3));
        }
        int size = 0 + i2 + (m7856x().size() * 1) + this.f28099c.size();
        this.f28102f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12552p> mo4382g() {
        return f28098x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28101e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f28101e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: v */
    public C12552p mo4380a() {
        return f28097w;
    }

    /* renamed from: w */
    public String m7857w(int i) {
        return this.f28100d.get(i);
    }

    /* renamed from: x */
    public InterfaceC13605r m7856x() {
        return this.f28100d;
    }

    private C12552p(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f28101e = (byte) -1;
        this.f28102f = -1;
        this.f28099c = abstractC13582b.m4441l();
    }

    private C12552p(boolean z) {
        this.f28101e = (byte) -1;
        this.f28102f = -1;
        this.f28099c = AbstractC13570d.f29926c;
    }

    private C12552p(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28101e = (byte) -1;
        this.f28102f = -1;
        m7855y();
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
                            if (m4516K != 10) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                AbstractC13570d m4495l = c13573e.m4495l();
                                if (!(z2 & true)) {
                                    this.f28100d = new C13596l();
                                    z2 |= true;
                                }
                                this.f28100d.mo4320Y(m4495l);
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
                    this.f28100d = this.f28100d.mo4316q();
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28099c = m4542O.m4530I();
                    throw th2;
                }
                this.f28099c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28100d = this.f28100d.mo4316q();
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28099c = m4542O.m4530I();
            throw th3;
        }
        this.f28099c = m4542O.m4530I();
        mo4433m();
    }
}
