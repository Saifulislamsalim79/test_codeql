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
/* renamed from: kotlin.j0.o.c.p0.e.w */
/* loaded from: classes3.dex */
public final class C12580w extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: w */
    private static final C12580w f28268w;

    /* renamed from: x */
    public static InterfaceC13604q<C12580w> f28269x = new C12581a();

    /* renamed from: c */
    private final AbstractC13570d f28270c;

    /* renamed from: d */
    private List<C12575v> f28271d;

    /* renamed from: e */
    private byte f28272e;

    /* renamed from: f */
    private int f28273f;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.w$a */
    /* loaded from: classes3.dex */
    static class C12581a extends AbstractC13566b<C12580w> {
        C12581a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12580w mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12580w(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.w$b */
    /* loaded from: classes3.dex */
    public static final class C12582b extends AbstractC13580h.AbstractC13582b<C12580w, C12582b> implements Object {

        /* renamed from: d */
        private int f28274d;

        /* renamed from: e */
        private List<C12575v> f28275e = Collections.emptyList();

        private C12582b() {
            m7460w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12582b m7463t() {
            return new C12582b();
        }

        /* renamed from: u */
        private void m7462u() {
            if ((this.f28274d & 1) != 1) {
                this.f28275e = new ArrayList(this.f28275e);
                this.f28274d |= 1;
            }
        }

        /* renamed from: w */
        private void m7460w() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7458y(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7458y(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12582b mo4440n(C12580w c12580w) {
            m7459x(c12580w);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12580w build() {
            C12580w m7465r = m7465r();
            if (m7465r.mo4379h()) {
                return m7465r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7465r);
        }

        /* renamed from: r */
        public C12580w m7465r() {
            C12580w c12580w = new C12580w(this);
            if ((this.f28274d & 1) == 1) {
                this.f28275e = Collections.unmodifiableList(this.f28275e);
                this.f28274d &= -2;
            }
            c12580w.f28271d = this.f28275e;
            return c12580w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12582b mo4443j() {
            C12582b m7463t = m7463t();
            m7463t.m7459x(m7465r());
            return m7463t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: v */
        public C12580w mo4442k() {
            return C12580w.m7474u();
        }

        /* renamed from: x */
        public C12582b m7459x(C12580w c12580w) {
            if (c12580w == C12580w.m7474u()) {
                return this;
            }
            if (!c12580w.f28271d.isEmpty()) {
                if (this.f28275e.isEmpty()) {
                    this.f28275e = c12580w.f28271d;
                    this.f28274d &= -2;
                } else {
                    m7462u();
                    this.f28275e.addAll(c12580w.f28271d);
                }
            }
            m4439o(m4441l().m4538e(c12580w.f28270c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w.C12582b m7458y(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.w> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w.f28269x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.w r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7459x(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.w r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7459x(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w.C12582b.m7458y(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.w$b");
        }
    }

    static {
        C12580w c12580w = new C12580w(true);
        f28268w = c12580w;
        c12580w.m7470y();
    }

    /* renamed from: A */
    public static C12582b m7480A(C12580w c12580w) {
        C12582b m7469z = m7469z();
        m7469z.m7459x(c12580w);
        return m7469z;
    }

    /* renamed from: u */
    public static C12580w m7474u() {
        return f28268w;
    }

    /* renamed from: y */
    private void m7470y() {
        this.f28271d = Collections.emptyList();
    }

    /* renamed from: z */
    public static C12582b m7469z() {
        return C12582b.m7463t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: B */
    public C12582b mo4383f() {
        return m7469z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: C */
    public C12582b mo4386b() {
        return m7480A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        for (int i = 0; i < this.f28271d.size(); i++) {
            codedOutputStream.m4612d0(1, this.f28271d.get(i));
        }
        codedOutputStream.m4602i0(this.f28270c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28273f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28271d.size(); i3++) {
            i2 += CodedOutputStream.m4583s(1, this.f28271d.get(i3));
        }
        int size = i2 + this.f28270c.size();
        this.f28273f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12580w> mo4382g() {
        return f28269x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28272e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f28272e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: v */
    public C12580w mo4380a() {
        return f28268w;
    }

    /* renamed from: w */
    public int m7472w() {
        return this.f28271d.size();
    }

    /* renamed from: x */
    public List<C12575v> m7471x() {
        return this.f28271d;
    }

    private C12580w(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f28272e = (byte) -1;
        this.f28273f = -1;
        this.f28270c = abstractC13582b.m4441l();
    }

    private C12580w(boolean z) {
        this.f28272e = (byte) -1;
        this.f28273f = -1;
        this.f28270c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12580w(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28272e = (byte) -1;
        this.f28273f = -1;
        m7470y();
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
                                    this.f28271d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28271d.add(c13573e.m4486u(C12575v.f28240D, c13575f));
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
                    this.f28271d = Collections.unmodifiableList(this.f28271d);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28270c = m4542O.m4530I();
                    throw th2;
                }
                this.f28270c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28271d = Collections.unmodifiableList(this.f28271d);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28270c = m4542O.m4530I();
            throw th3;
        }
        this.f28270c = m4542O.m4530I();
        mo4433m();
    }
}
