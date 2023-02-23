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
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.o */
/* loaded from: classes3.dex */
public final class C12545o extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: w */
    private static final C12545o f28071w;

    /* renamed from: x */
    public static InterfaceC13604q<C12545o> f28072x = new C12546a();

    /* renamed from: c */
    private final AbstractC13570d f28073c;

    /* renamed from: d */
    private List<C12548c> f28074d;

    /* renamed from: e */
    private byte f28075e;

    /* renamed from: f */
    private int f28076f;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.o$a */
    /* loaded from: classes3.dex */
    static class C12546a extends AbstractC13566b<C12545o> {
        C12546a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12545o mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12545o(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.o$b */
    /* loaded from: classes3.dex */
    public static final class C12547b extends AbstractC13580h.AbstractC13582b<C12545o, C12547b> implements Object {

        /* renamed from: d */
        private int f28077d;

        /* renamed from: e */
        private List<C12548c> f28078e = Collections.emptyList();

        private C12547b() {
            m7900y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12547b m7905t() {
            return new C12547b();
        }

        /* renamed from: u */
        private void m7904u() {
            if ((this.f28077d & 1) != 1) {
                this.f28078e = new ArrayList(this.f28078e);
                this.f28077d |= 1;
            }
        }

        /* renamed from: y */
        private void m7900y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12547b m7910A(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.o> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.f28072x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.o r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7899z(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.o r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7899z(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12547b.m7910A(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.o$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7910A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7910A(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m7901x(); i++) {
                if (!m7902w(i).mo4379h()) {
                    return false;
                }
            }
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12547b mo4440n(C12545o c12545o) {
            m7899z(c12545o);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12545o build() {
            C12545o m7907r = m7907r();
            if (m7907r.mo4379h()) {
                return m7907r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7907r);
        }

        /* renamed from: r */
        public C12545o m7907r() {
            C12545o c12545o = new C12545o(this);
            if ((this.f28077d & 1) == 1) {
                this.f28078e = Collections.unmodifiableList(this.f28078e);
                this.f28077d &= -2;
            }
            c12545o.f28074d = this.f28078e;
            return c12545o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12547b mo4443j() {
            C12547b m7905t = m7905t();
            m7905t.m7899z(m7907r());
            return m7905t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: v */
        public C12545o mo4442k() {
            return C12545o.m7917u();
        }

        /* renamed from: w */
        public C12548c m7902w(int i) {
            return this.f28078e.get(i);
        }

        /* renamed from: x */
        public int m7901x() {
            return this.f28078e.size();
        }

        /* renamed from: z */
        public C12547b m7899z(C12545o c12545o) {
            if (c12545o == C12545o.m7917u()) {
                return this;
            }
            if (!c12545o.f28074d.isEmpty()) {
                if (this.f28078e.isEmpty()) {
                    this.f28078e = c12545o.f28074d;
                    this.f28077d &= -2;
                } else {
                    m7904u();
                    this.f28078e.addAll(c12545o.f28074d);
                }
            }
            m4439o(m4441l().m4538e(c12545o.f28073c));
            return this;
        }
    }

    static {
        C12545o c12545o = new C12545o(true);
        f28071w = c12545o;
        c12545o.m7913y();
    }

    /* renamed from: A */
    public static C12547b m7923A(C12545o c12545o) {
        C12547b m7912z = m7912z();
        m7912z.m7899z(c12545o);
        return m7912z;
    }

    /* renamed from: u */
    public static C12545o m7917u() {
        return f28071w;
    }

    /* renamed from: y */
    private void m7913y() {
        this.f28074d = Collections.emptyList();
    }

    /* renamed from: z */
    public static C12547b m7912z() {
        return C12547b.m7905t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: B */
    public C12547b mo4383f() {
        return m7912z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: C */
    public C12547b mo4386b() {
        return m7923A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        for (int i = 0; i < this.f28074d.size(); i++) {
            codedOutputStream.m4612d0(1, this.f28074d.get(i));
        }
        codedOutputStream.m4602i0(this.f28073c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28076f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f28074d.size(); i3++) {
            i2 += CodedOutputStream.m4583s(1, this.f28074d.get(i3));
        }
        int size = i2 + this.f28073c.size();
        this.f28076f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12545o> mo4382g() {
        return f28072x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28075e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m7914x(); i++) {
            if (!m7915w(i).mo4379h()) {
                this.f28075e = (byte) 0;
                return false;
            }
        }
        this.f28075e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: v */
    public C12545o mo4380a() {
        return f28071w;
    }

    /* renamed from: w */
    public C12548c m7915w(int i) {
        return this.f28074d.get(i);
    }

    /* renamed from: x */
    public int m7914x() {
        return this.f28074d.size();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.o$c */
    /* loaded from: classes3.dex */
    public static final class C12548c extends AbstractC13580h implements InterfaceC13603p {

        /* renamed from: A */
        public static InterfaceC13604q<C12548c> f28079A = new C12549a();

        /* renamed from: z */
        private static final C12548c f28080z;

        /* renamed from: c */
        private final AbstractC13570d f28081c;

        /* renamed from: d */
        private int f28082d;

        /* renamed from: e */
        private int f28083e;

        /* renamed from: f */
        private int f28084f;

        /* renamed from: w */
        private EnumC12551c f28085w;

        /* renamed from: x */
        private byte f28086x;

        /* renamed from: y */
        private int f28087y;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.o$c$a */
        /* loaded from: classes3.dex */
        static class C12549a extends AbstractC13566b<C12548c> {
            C12549a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
            /* renamed from: m */
            public C12548c mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
                return new C12548c(c13573e, c13575f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.o$c$b */
        /* loaded from: classes3.dex */
        public static final class C12550b extends AbstractC13580h.AbstractC13582b<C12548c, C12550b> implements Object {

            /* renamed from: d */
            private int f28088d;

            /* renamed from: f */
            private int f28090f;

            /* renamed from: e */
            private int f28089e = -1;

            /* renamed from: w */
            private EnumC12551c f28091w = EnumC12551c.PACKAGE;

            private C12550b() {
                m7870w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t */
            public static C12550b m7873t() {
                return new C12550b();
            }

            /* renamed from: w */
            private void m7870w() {
            }

            /* renamed from: A */
            public C12550b m7879A(int i) {
                this.f28088d |= 1;
                this.f28089e = i;
                return this;
            }

            /* renamed from: B */
            public C12550b m7878B(int i) {
                this.f28088d |= 2;
                this.f28090f = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: V */
            public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
                m7868y(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
            /* renamed from: e */
            public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
                m7868y(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
            /* renamed from: h */
            public final boolean mo4379h() {
                return m7871v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: n */
            public /* bridge */ /* synthetic */ C12550b mo4440n(C12548c c12548c) {
                m7869x(c12548c);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: q */
            public C12548c build() {
                C12548c m7875r = m7875r();
                if (m7875r.mo4379h()) {
                    return m7875r;
                }
                throw AbstractC13563a.AbstractC13564a.m4552i(m7875r);
            }

            /* renamed from: r */
            public C12548c m7875r() {
                C12548c c12548c = new C12548c(this);
                int i = this.f28088d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                c12548c.f28083e = this.f28089e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c12548c.f28084f = this.f28090f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                c12548c.f28085w = this.f28091w;
                c12548c.f28082d = i2;
                return c12548c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: s */
            public C12550b mo4443j() {
                C12550b m7873t = m7873t();
                m7873t.m7869x(m7875r());
                return m7873t;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: u */
            public C12548c mo4442k() {
                return C12548c.m7884w();
            }

            /* renamed from: v */
            public boolean m7871v() {
                return (this.f28088d & 2) == 2;
            }

            /* renamed from: x */
            public C12550b m7869x(C12548c c12548c) {
                if (c12548c == C12548c.m7884w()) {
                    return this;
                }
                if (c12548c.m7896C()) {
                    m7879A(c12548c.m7881z());
                }
                if (c12548c.m7895D()) {
                    m7878B(c12548c.m7898A());
                }
                if (c12548c.m7897B()) {
                    m7867z(c12548c.m7882y());
                }
                m4439o(m4441l().m4538e(c12548c.f28081c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            /* renamed from: y */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12548c.C12550b m7868y(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.o$c> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12548c.f28079A     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.j0.o.c.p0.e.o$c r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12548c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.m7869x(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.j0.o.c.p0.e.o$c r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12548c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m7869x(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o.C12548c.C12550b.m7868y(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.o$c$b");
            }

            /* renamed from: z */
            public C12550b m7867z(EnumC12551c enumC12551c) {
                if (enumC12551c != null) {
                    this.f28088d |= 4;
                    this.f28091w = enumC12551c;
                    return this;
                }
                throw null;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.o$c$c */
        /* loaded from: classes3.dex */
        public enum EnumC12551c implements C13588i.InterfaceC13589a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: c */
            private final int f28096c;

            EnumC12551c(int i, int i2) {
                this.f28096c = i2;
            }

            /* renamed from: a */
            public static EnumC12551c m7866a(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LOCAL;
                    }
                    return PACKAGE;
                }
                return CLASS;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
            /* renamed from: d */
            public final int mo4405d() {
                return this.f28096c;
            }
        }

        static {
            C12548c c12548c = new C12548c(true);
            f28080z = c12548c;
            c12548c.m7894E();
        }

        /* renamed from: E */
        private void m7894E() {
            this.f28083e = -1;
            this.f28084f = 0;
            this.f28085w = EnumC12551c.PACKAGE;
        }

        /* renamed from: F */
        public static C12550b m7893F() {
            return C12550b.m7873t();
        }

        /* renamed from: G */
        public static C12550b m7892G(C12548c c12548c) {
            C12550b m7893F = m7893F();
            m7893F.m7869x(c12548c);
            return m7893F;
        }

        /* renamed from: w */
        public static C12548c m7884w() {
            return f28080z;
        }

        /* renamed from: A */
        public int m7898A() {
            return this.f28084f;
        }

        /* renamed from: B */
        public boolean m7897B() {
            return (this.f28082d & 4) == 4;
        }

        /* renamed from: C */
        public boolean m7896C() {
            return (this.f28082d & 1) == 1;
        }

        /* renamed from: D */
        public boolean m7895D() {
            return (this.f28082d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: H */
        public C12550b mo4383f() {
            return m7893F();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: I */
        public C12550b mo4386b() {
            return m7892G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: c */
        public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
            mo4384d();
            if ((this.f28082d & 1) == 1) {
                codedOutputStream.m4618a0(1, this.f28083e);
            }
            if ((this.f28082d & 2) == 2) {
                codedOutputStream.m4618a0(2, this.f28084f);
            }
            if ((this.f28082d & 4) == 4) {
                codedOutputStream.m4627S(3, this.f28085w.mo4405d());
            }
            codedOutputStream.m4602i0(this.f28081c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: d */
        public int mo4384d() {
            int i = this.f28087y;
            if (i != -1) {
                return i;
            }
            int m4591o = (this.f28082d & 1) == 1 ? 0 + CodedOutputStream.m4591o(1, this.f28083e) : 0;
            if ((this.f28082d & 2) == 2) {
                m4591o += CodedOutputStream.m4591o(2, this.f28084f);
            }
            if ((this.f28082d & 4) == 4) {
                m4591o += CodedOutputStream.m4605h(3, this.f28085w.mo4405d());
            }
            int size = m4591o + this.f28081c.size();
            this.f28087y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: g */
        public InterfaceC13604q<C12548c> mo4382g() {
            return f28079A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            byte b = this.f28086x;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m7895D()) {
                this.f28086x = (byte) 0;
                return false;
            }
            this.f28086x = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: x */
        public C12548c mo4380a() {
            return f28080z;
        }

        /* renamed from: y */
        public EnumC12551c m7882y() {
            return this.f28085w;
        }

        /* renamed from: z */
        public int m7881z() {
            return this.f28083e;
        }

        private C12548c(AbstractC13580h.AbstractC13582b abstractC13582b) {
            super(abstractC13582b);
            this.f28086x = (byte) -1;
            this.f28087y = -1;
            this.f28081c = abstractC13582b.m4441l();
        }

        private C12548c(boolean z) {
            this.f28086x = (byte) -1;
            this.f28087y = -1;
            this.f28081c = AbstractC13570d.f29926c;
        }

        private C12548c(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            this.f28086x = (byte) -1;
            this.f28087y = -1;
            m7894E();
            AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
            CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int m4516K = c13573e.m4516K();
                        if (m4516K != 0) {
                            if (m4516K == 8) {
                                this.f28082d |= 1;
                                this.f28083e = c13573e.m4488s();
                            } else if (m4516K == 16) {
                                this.f28082d |= 2;
                                this.f28084f = c13573e.m4488s();
                            } else if (m4516K != 24) {
                                if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                }
                            } else {
                                int m4493n = c13573e.m4493n();
                                EnumC12551c m7866a = EnumC12551c.m7866a(m4493n);
                                if (m7866a == null) {
                                    m4636J.m4590o0(m4516K);
                                    m4636J.m4590o0(m4493n);
                                } else {
                                    this.f28082d |= 4;
                                    this.f28085w = m7866a;
                                }
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
                        this.f28081c = m4542O.m4530I();
                        throw th2;
                    }
                    this.f28081c = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            }
            try {
                m4636J.m4637I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28081c = m4542O.m4530I();
                throw th3;
            }
            this.f28081c = m4542O.m4530I();
            mo4433m();
        }
    }

    private C12545o(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f28075e = (byte) -1;
        this.f28076f = -1;
        this.f28073c = abstractC13582b.m4441l();
    }

    private C12545o(boolean z) {
        this.f28075e = (byte) -1;
        this.f28076f = -1;
        this.f28073c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12545o(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28075e = (byte) -1;
        this.f28076f = -1;
        m7913y();
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
                                    this.f28074d = new ArrayList();
                                    z2 |= true;
                                }
                                this.f28074d.add(c13573e.m4486u(C12548c.f28079A, c13575f));
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
                    this.f28074d = Collections.unmodifiableList(this.f28074d);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28073c = m4542O.m4530I();
                    throw th2;
                }
                this.f28073c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28074d = Collections.unmodifiableList(this.f28074d);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28073c = m4542O.m4530I();
            throw th3;
        }
        this.f28073c = m4542O.m4530I();
        mo4433m();
    }
}
