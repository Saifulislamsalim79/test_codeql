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
/* renamed from: kotlin.j0.o.c.p0.e.e */
/* loaded from: classes3.dex */
public final class C12516e extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: w */
    private static final C12516e f27897w;

    /* renamed from: x */
    public static InterfaceC13604q<C12516e> f27898x = new C12517a();

    /* renamed from: c */
    private final AbstractC13570d f27899c;

    /* renamed from: d */
    private List<C12519f> f27900d;

    /* renamed from: e */
    private byte f27901e;

    /* renamed from: f */
    private int f27902f;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.e$a */
    /* loaded from: classes3.dex */
    static class C12517a extends AbstractC13566b<C12516e> {
        C12517a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12516e mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12516e(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.e$b */
    /* loaded from: classes3.dex */
    public static final class C12518b extends AbstractC13580h.AbstractC13582b<C12516e, C12518b> implements Object {

        /* renamed from: d */
        private int f27903d;

        /* renamed from: e */
        private List<C12519f> f27904e = Collections.emptyList();

        private C12518b() {
            m8307y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12518b m8312t() {
            return new C12518b();
        }

        /* renamed from: u */
        private void m8311u() {
            if ((this.f27903d & 1) != 1) {
                this.f27904e = new ArrayList(this.f27904e);
                this.f27903d |= 1;
            }
        }

        /* renamed from: y */
        private void m8307y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e.C12518b m8317A(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.e> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e.f27898x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.e r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8306z(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.e r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8306z(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e.C12518b.m8317A(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.e$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8317A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8317A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m8308x(); i++) {
                if (!m8309w(i).mo4379h()) {
                    return false;
                }
            }
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12518b mo4440n(C12516e c12516e) {
            m8306z(c12516e);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12516e build() {
            C12516e m8314r = m8314r();
            if (m8314r.mo4379h()) {
                return m8314r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8314r);
        }

        /* renamed from: r */
        public C12516e m8314r() {
            C12516e c12516e = new C12516e(this);
            if ((this.f27903d & 1) == 1) {
                this.f27904e = Collections.unmodifiableList(this.f27904e);
                this.f27903d &= -2;
            }
            c12516e.f27900d = this.f27904e;
            return c12516e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12518b mo4443j() {
            C12518b m8312t = m8312t();
            m8312t.m8306z(m8314r());
            return m8312t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: v */
        public C12516e mo4442k() {
            return C12516e.m8324u();
        }

        /* renamed from: w */
        public C12519f m8309w(int i) {
            return this.f27904e.get(i);
        }

        /* renamed from: x */
        public int m8308x() {
            return this.f27904e.size();
        }

        /* renamed from: z */
        public C12518b m8306z(C12516e c12516e) {
            if (c12516e == C12516e.m8324u()) {
                return this;
            }
            if (!c12516e.f27900d.isEmpty()) {
                if (this.f27904e.isEmpty()) {
                    this.f27904e = c12516e.f27900d;
                    this.f27903d &= -2;
                } else {
                    m8311u();
                    this.f27904e.addAll(c12516e.f27900d);
                }
            }
            m4439o(m4441l().m4538e(c12516e.f27899c));
            return this;
        }
    }

    static {
        C12516e c12516e = new C12516e(true);
        f27897w = c12516e;
        c12516e.m8320y();
    }

    /* renamed from: A */
    public static C12518b m8330A(C12516e c12516e) {
        C12518b m8319z = m8319z();
        m8319z.m8306z(c12516e);
        return m8319z;
    }

    /* renamed from: u */
    public static C12516e m8324u() {
        return f27897w;
    }

    /* renamed from: y */
    private void m8320y() {
        this.f27900d = Collections.emptyList();
    }

    /* renamed from: z */
    public static C12518b m8319z() {
        return C12518b.m8312t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: B */
    public C12518b mo4383f() {
        return m8319z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: C */
    public C12518b mo4386b() {
        return m8330A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        for (int i = 0; i < this.f27900d.size(); i++) {
            codedOutputStream.m4612d0(1, this.f27900d.get(i));
        }
        codedOutputStream.m4602i0(this.f27899c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27902f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27900d.size(); i3++) {
            i2 += CodedOutputStream.m4583s(1, this.f27900d.get(i3));
        }
        int size = i2 + this.f27899c.size();
        this.f27902f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12516e> mo4382g() {
        return f27898x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27901e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m8321x(); i++) {
            if (!m8322w(i).mo4379h()) {
                this.f27901e = (byte) 0;
                return false;
            }
        }
        this.f27901e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: v */
    public C12516e mo4380a() {
        return f27897w;
    }

    /* renamed from: w */
    public C12519f m8322w(int i) {
        return this.f27900d.get(i);
    }

    /* renamed from: x */
    public int m8321x() {
        return this.f27900d.size();
    }

    private C12516e(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f27901e = (byte) -1;
        this.f27902f = -1;
        this.f27899c = abstractC13582b.m4441l();
    }

    private C12516e(boolean z) {
        this.f27901e = (byte) -1;
        this.f27902f = -1;
        this.f27899c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12516e(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27901e = (byte) -1;
        this.f27902f = -1;
        m8320y();
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
                                if (!(z2 & true)) {
                                    this.f27900d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f27900d.add(c13573e.m4486u(C12519f.f27906B, c13575f));
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
                    this.f27900d = Collections.unmodifiableList(this.f27900d);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27899c = m4542O.m4530I();
                    throw th2;
                }
                this.f27899c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f27900d = Collections.unmodifiableList(this.f27900d);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27899c = m4542O.m4530I();
            throw th3;
        }
        this.f27899c = m4542O.m4530I();
        mo4433m();
    }
}
