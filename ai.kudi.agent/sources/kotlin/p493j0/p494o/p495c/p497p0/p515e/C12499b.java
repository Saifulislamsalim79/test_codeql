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
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.b */
/* loaded from: classes3.dex */
public final class C12499b extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: y */
    private static final C12499b f27761y;

    /* renamed from: z */
    public static InterfaceC13604q<C12499b> f27762z = new C12500a();

    /* renamed from: c */
    private final AbstractC13570d f27763c;

    /* renamed from: d */
    private int f27764d;

    /* renamed from: e */
    private int f27765e;

    /* renamed from: f */
    private List<C12501b> f27766f;

    /* renamed from: w */
    private byte f27767w;

    /* renamed from: x */
    private int f27768x;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.b$a */
    /* loaded from: classes3.dex */
    static class C12500a extends AbstractC13566b<C12499b> {
        C12500a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12499b mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12499b(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.b$b */
    /* loaded from: classes3.dex */
    public static final class C12501b extends AbstractC13580h implements InterfaceC13603p {

        /* renamed from: y */
        private static final C12501b f27769y;

        /* renamed from: z */
        public static InterfaceC13604q<C12501b> f27770z = new C12502a();

        /* renamed from: c */
        private final AbstractC13570d f27771c;

        /* renamed from: d */
        private int f27772d;

        /* renamed from: e */
        private int f27773e;

        /* renamed from: f */
        private C12504c f27774f;

        /* renamed from: w */
        private byte f27775w;

        /* renamed from: x */
        private int f27776x;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.b$b$a */
        /* loaded from: classes3.dex */
        static class C12502a extends AbstractC13566b<C12501b> {
            C12502a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
            /* renamed from: m */
            public C12501b mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
                return new C12501b(c13573e, c13575f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C12503b extends AbstractC13580h.AbstractC13582b<C12501b, C12503b> implements Object {

            /* renamed from: d */
            private int f27777d;

            /* renamed from: e */
            private int f27778e;

            /* renamed from: f */
            private C12504c f27779f = C12504c.m8567L();

            private C12503b() {
                m8580y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t */
            public static C12503b m8585t() {
                return new C12503b();
            }

            /* renamed from: y */
            private void m8580y() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            /* renamed from: A */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12503b m8592A(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.b$b> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.f27770z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.j0.o.c.p0.e.b$b r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.m8579z(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.j0.o.c.p0.e.b$b r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m8579z(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12503b.m8592A(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.b$b$b");
            }

            /* renamed from: B */
            public C12503b m8591B(C12504c c12504c) {
                if ((this.f27777d & 2) == 2 && this.f27779f != C12504c.m8567L()) {
                    C12504c.C12506b m8546h0 = C12504c.m8546h0(this.f27779f);
                    m8546h0.m8531C(c12504c);
                    this.f27779f = m8546h0.m8518r();
                } else {
                    this.f27779f = c12504c;
                }
                this.f27777d |= 2;
                return this;
            }

            /* renamed from: C */
            public C12503b m8590C(int i) {
                this.f27777d |= 1;
                this.f27778e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: V */
            public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
                m8592A(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
            /* renamed from: e */
            public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
                m8592A(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
            /* renamed from: h */
            public final boolean mo4379h() {
                return m8582w() && m8581x() && m8583v().mo4379h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: n */
            public /* bridge */ /* synthetic */ C12503b mo4440n(C12501b c12501b) {
                m8579z(c12501b);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: q */
            public C12501b build() {
                C12501b m8587r = m8587r();
                if (m8587r.mo4379h()) {
                    return m8587r;
                }
                throw AbstractC13563a.AbstractC13564a.m4552i(m8587r);
            }

            /* renamed from: r */
            public C12501b m8587r() {
                C12501b c12501b = new C12501b(this);
                int i = this.f27777d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                c12501b.f27773e = this.f27778e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c12501b.f27774f = this.f27779f;
                c12501b.f27772d = i2;
                return c12501b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: s */
            public C12503b mo4443j() {
                C12503b m8585t = m8585t();
                m8585t.m8579z(m8587r());
                return m8585t;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: u */
            public C12501b mo4442k() {
                return C12501b.m8598v();
            }

            /* renamed from: v */
            public C12504c m8583v() {
                return this.f27779f;
            }

            /* renamed from: w */
            public boolean m8582w() {
                return (this.f27777d & 1) == 1;
            }

            /* renamed from: x */
            public boolean m8581x() {
                return (this.f27777d & 2) == 2;
            }

            /* renamed from: z */
            public C12503b m8579z(C12501b c12501b) {
                if (c12501b == C12501b.m8598v()) {
                    return this;
                }
                if (c12501b.m8594z()) {
                    m8590C(c12501b.m8596x());
                }
                if (c12501b.m8608A()) {
                    m8591B(c12501b.m8595y());
                }
                m4439o(m4441l().m4538e(c12501b.f27771c));
                return this;
            }
        }

        static {
            C12501b c12501b = new C12501b(true);
            f27769y = c12501b;
            c12501b.m8607B();
        }

        /* renamed from: B */
        private void m8607B() {
            this.f27773e = 0;
            this.f27774f = C12504c.m8567L();
        }

        /* renamed from: C */
        public static C12503b m8606C() {
            return C12503b.m8585t();
        }

        /* renamed from: D */
        public static C12503b m8605D(C12501b c12501b) {
            C12503b m8606C = m8606C();
            m8606C.m8579z(c12501b);
            return m8606C;
        }

        /* renamed from: v */
        public static C12501b m8598v() {
            return f27769y;
        }

        /* renamed from: A */
        public boolean m8608A() {
            return (this.f27772d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: E */
        public C12503b mo4383f() {
            return m8606C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: F */
        public C12503b mo4386b() {
            return m8605D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: c */
        public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
            mo4384d();
            if ((this.f27772d & 1) == 1) {
                codedOutputStream.m4618a0(1, this.f27773e);
            }
            if ((this.f27772d & 2) == 2) {
                codedOutputStream.m4612d0(2, this.f27774f);
            }
            codedOutputStream.m4602i0(this.f27771c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: d */
        public int mo4384d() {
            int i = this.f27776x;
            if (i != -1) {
                return i;
            }
            int m4591o = (this.f27772d & 1) == 1 ? 0 + CodedOutputStream.m4591o(1, this.f27773e) : 0;
            if ((this.f27772d & 2) == 2) {
                m4591o += CodedOutputStream.m4583s(2, this.f27774f);
            }
            int size = m4591o + this.f27771c.size();
            this.f27776x = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: g */
        public InterfaceC13604q<C12501b> mo4382g() {
            return f27770z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            byte b = this.f27775w;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!m8594z()) {
                this.f27775w = (byte) 0;
                return false;
            } else if (!m8608A()) {
                this.f27775w = (byte) 0;
                return false;
            } else if (!m8595y().mo4379h()) {
                this.f27775w = (byte) 0;
                return false;
            } else {
                this.f27775w = (byte) 1;
                return true;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: w */
        public C12501b mo4380a() {
            return f27769y;
        }

        /* renamed from: x */
        public int m8596x() {
            return this.f27773e;
        }

        /* renamed from: y */
        public C12504c m8595y() {
            return this.f27774f;
        }

        /* renamed from: z */
        public boolean m8594z() {
            return (this.f27772d & 1) == 1;
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.b$b$c */
        /* loaded from: classes3.dex */
        public static final class C12504c extends AbstractC13580h implements InterfaceC13603p {

            /* renamed from: H */
            private static final C12504c f27780H;

            /* renamed from: I */
            public static InterfaceC13604q<C12504c> f27781I = new C12505a();

            /* renamed from: A */
            private int f27782A;

            /* renamed from: B */
            private C12499b f27783B;

            /* renamed from: C */
            private List<C12504c> f27784C;

            /* renamed from: D */
            private int f27785D;

            /* renamed from: E */
            private int f27786E;

            /* renamed from: F */
            private byte f27787F;

            /* renamed from: G */
            private int f27788G;

            /* renamed from: c */
            private final AbstractC13570d f27789c;

            /* renamed from: d */
            private int f27790d;

            /* renamed from: e */
            private EnumC12507c f27791e;

            /* renamed from: f */
            private long f27792f;

            /* renamed from: w */
            private float f27793w;

            /* renamed from: x */
            private double f27794x;

            /* renamed from: y */
            private int f27795y;

            /* renamed from: z */
            private int f27796z;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.j0.o.c.p0.e.b$b$c$a */
            /* loaded from: classes3.dex */
            static class C12505a extends AbstractC13566b<C12504c> {
                C12505a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
                /* renamed from: m */
                public C12504c mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
                    return new C12504c(c13573e, c13575f);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.j0.o.c.p0.e.b$b$c$b */
            /* loaded from: classes3.dex */
            public static final class C12506b extends AbstractC13580h.AbstractC13582b<C12504c, C12506b> implements Object {

                /* renamed from: A */
                private int f27797A;

                /* renamed from: D */
                private int f27800D;

                /* renamed from: E */
                private int f27801E;

                /* renamed from: d */
                private int f27802d;

                /* renamed from: f */
                private long f27804f;

                /* renamed from: w */
                private float f27805w;

                /* renamed from: x */
                private double f27806x;

                /* renamed from: y */
                private int f27807y;

                /* renamed from: z */
                private int f27808z;

                /* renamed from: e */
                private EnumC12507c f27803e = EnumC12507c.BYTE;

                /* renamed from: B */
                private C12499b f27798B = C12499b.m8610z();

                /* renamed from: C */
                private List<C12504c> f27799C = Collections.emptyList();

                private C12506b() {
                    m8533A();
                }

                /* renamed from: A */
                private void m8533A() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: t */
                public static C12506b m8516t() {
                    return new C12506b();
                }

                /* renamed from: u */
                private void m8515u() {
                    if ((this.f27802d & 256) != 256) {
                        this.f27799C = new ArrayList(this.f27799C);
                        this.f27802d |= 256;
                    }
                }

                /* renamed from: B */
                public C12506b m8532B(C12499b c12499b) {
                    if ((this.f27802d & 128) == 128 && this.f27798B != C12499b.m8610z()) {
                        C12508c m8621F = C12499b.m8621F(this.f27798B);
                        m8621F.m8508A(c12499b);
                        this.f27798B = m8621F.m8503r();
                    } else {
                        this.f27798B = c12499b;
                    }
                    this.f27802d |= 128;
                    return this;
                }

                /* renamed from: C */
                public C12506b m8531C(C12504c c12504c) {
                    if (c12504c == C12504c.m8567L()) {
                        return this;
                    }
                    if (c12504c.m8549e0()) {
                        m8521N(c12504c.m8559T());
                    }
                    if (c12504c.m8551c0()) {
                        m8523L(c12504c.m8561R());
                    }
                    if (c12504c.m8552b0()) {
                        m8524K(c12504c.m8562Q());
                    }
                    if (c12504c.m8555Y()) {
                        m8527G(c12504c.m8565N());
                    }
                    if (c12504c.m8550d0()) {
                        m8522M(c12504c.m8560S());
                    }
                    if (c12504c.m8556X()) {
                        m8528F(c12504c.m8568K());
                    }
                    if (c12504c.m8554Z()) {
                        m8526H(c12504c.m8564O());
                    }
                    if (c12504c.m8558U()) {
                        m8532B(c12504c.m8573F());
                    }
                    if (!c12504c.f27784C.isEmpty()) {
                        if (this.f27799C.isEmpty()) {
                            this.f27799C = c12504c.f27784C;
                            this.f27802d &= -257;
                        } else {
                            m8515u();
                            this.f27799C.addAll(c12504c.f27784C);
                        }
                    }
                    if (c12504c.m8557W()) {
                        m8529E(c12504c.m8572G());
                    }
                    if (c12504c.m8553a0()) {
                        m8525I(c12504c.m8563P());
                    }
                    m4439o(m4441l().m4538e(c12504c.f27789c));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                /* renamed from: D */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12504c.C12506b m8530D(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.b$b$c> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12504c.f27781I     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.j0.o.c.p0.e.b$b$c r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12504c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.m8531C(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.j0.o.c.p0.e.b$b$c r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12504c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.m8531C(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12501b.C12504c.C12506b.m8530D(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.b$b$c$b");
                }

                /* renamed from: E */
                public C12506b m8529E(int i) {
                    this.f27802d |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                    this.f27800D = i;
                    return this;
                }

                /* renamed from: F */
                public C12506b m8528F(int i) {
                    this.f27802d |= 32;
                    this.f27808z = i;
                    return this;
                }

                /* renamed from: G */
                public C12506b m8527G(double d) {
                    this.f27802d |= 8;
                    this.f27806x = d;
                    return this;
                }

                /* renamed from: H */
                public C12506b m8526H(int i) {
                    this.f27802d |= 64;
                    this.f27797A = i;
                    return this;
                }

                /* renamed from: I */
                public C12506b m8525I(int i) {
                    this.f27802d |= 1024;
                    this.f27801E = i;
                    return this;
                }

                /* renamed from: K */
                public C12506b m8524K(float f) {
                    this.f27802d |= 4;
                    this.f27805w = f;
                    return this;
                }

                /* renamed from: L */
                public C12506b m8523L(long j) {
                    this.f27802d |= 2;
                    this.f27804f = j;
                    return this;
                }

                /* renamed from: M */
                public C12506b m8522M(int i) {
                    this.f27802d |= 16;
                    this.f27807y = i;
                    return this;
                }

                /* renamed from: N */
                public C12506b m8521N(EnumC12507c enumC12507c) {
                    if (enumC12507c != null) {
                        this.f27802d |= 1;
                        this.f27803e = enumC12507c;
                        return this;
                    }
                    throw null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
                /* renamed from: V */
                public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
                    m8530D(c13573e, c13575f);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
                /* renamed from: e */
                public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
                    m8530D(c13573e, c13575f);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
                /* renamed from: h */
                public final boolean mo4379h() {
                    if (!m8510z() || m8514v().mo4379h()) {
                        for (int i = 0; i < m8512x(); i++) {
                            if (!m8513w(i).mo4379h()) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
                /* renamed from: n */
                public /* bridge */ /* synthetic */ C12506b mo4440n(C12504c c12504c) {
                    m8531C(c12504c);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
                /* renamed from: q */
                public C12504c build() {
                    C12504c m8518r = m8518r();
                    if (m8518r.mo4379h()) {
                        return m8518r;
                    }
                    throw AbstractC13563a.AbstractC13564a.m4552i(m8518r);
                }

                /* renamed from: r */
                public C12504c m8518r() {
                    C12504c c12504c = new C12504c(this);
                    int i = this.f27802d;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    c12504c.f27791e = this.f27803e;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    c12504c.f27792f = this.f27804f;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    c12504c.f27793w = this.f27805w;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    c12504c.f27794x = this.f27806x;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    c12504c.f27795y = this.f27807y;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    c12504c.f27796z = this.f27808z;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    c12504c.f27782A = this.f27797A;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    c12504c.f27783B = this.f27798B;
                    if ((this.f27802d & 256) == 256) {
                        this.f27799C = Collections.unmodifiableList(this.f27799C);
                        this.f27802d &= -257;
                    }
                    c12504c.f27784C = this.f27799C;
                    if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                        i2 |= 256;
                    }
                    c12504c.f27785D = this.f27800D;
                    if ((i & 1024) == 1024) {
                        i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                    }
                    c12504c.f27786E = this.f27801E;
                    c12504c.f27790d = i2;
                    return c12504c;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
                /* renamed from: s */
                public C12506b mo4443j() {
                    C12506b m8516t = m8516t();
                    m8516t.m8531C(m8518r());
                    return m8516t;
                }

                /* renamed from: v */
                public C12499b m8514v() {
                    return this.f27798B;
                }

                /* renamed from: w */
                public C12504c m8513w(int i) {
                    return this.f27799C.get(i);
                }

                /* renamed from: x */
                public int m8512x() {
                    return this.f27799C.size();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
                /* renamed from: y */
                public C12504c mo4442k() {
                    return C12504c.m8567L();
                }

                /* renamed from: z */
                public boolean m8510z() {
                    return (this.f27802d & 128) == 128;
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.j0.o.c.p0.e.b$b$c$c */
            /* loaded from: classes3.dex */
            public enum EnumC12507c implements C13588i.InterfaceC13589a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: c */
                private final int f27823c;

                EnumC12507c(int i, int i2) {
                    this.f27823c = i2;
                }

                /* renamed from: a */
                public static EnumC12507c m8509a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
                /* renamed from: d */
                public final int mo4405d() {
                    return this.f27823c;
                }
            }

            static {
                C12504c c12504c = new C12504c(true);
                f27780H = c12504c;
                c12504c.m8548f0();
            }

            /* renamed from: L */
            public static C12504c m8567L() {
                return f27780H;
            }

            /* renamed from: f0 */
            private void m8548f0() {
                this.f27791e = EnumC12507c.BYTE;
                this.f27792f = 0L;
                this.f27793w = 0.0f;
                this.f27794x = 0.0d;
                this.f27795y = 0;
                this.f27796z = 0;
                this.f27782A = 0;
                this.f27783B = C12499b.m8610z();
                this.f27784C = Collections.emptyList();
                this.f27785D = 0;
                this.f27786E = 0;
            }

            /* renamed from: g0 */
            public static C12506b m8547g0() {
                return C12506b.m8516t();
            }

            /* renamed from: h0 */
            public static C12506b m8546h0(C12504c c12504c) {
                C12506b m8547g0 = m8547g0();
                m8547g0.m8531C(c12504c);
                return m8547g0;
            }

            /* renamed from: F */
            public C12499b m8573F() {
                return this.f27783B;
            }

            /* renamed from: G */
            public int m8572G() {
                return this.f27785D;
            }

            /* renamed from: H */
            public C12504c m8571H(int i) {
                return this.f27784C.get(i);
            }

            /* renamed from: I */
            public int m8570I() {
                return this.f27784C.size();
            }

            /* renamed from: J */
            public List<C12504c> m8569J() {
                return this.f27784C;
            }

            /* renamed from: K */
            public int m8568K() {
                return this.f27796z;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
            /* renamed from: M */
            public C12504c mo4380a() {
                return f27780H;
            }

            /* renamed from: N */
            public double m8565N() {
                return this.f27794x;
            }

            /* renamed from: O */
            public int m8564O() {
                return this.f27782A;
            }

            /* renamed from: P */
            public int m8563P() {
                return this.f27786E;
            }

            /* renamed from: Q */
            public float m8562Q() {
                return this.f27793w;
            }

            /* renamed from: R */
            public long m8561R() {
                return this.f27792f;
            }

            /* renamed from: S */
            public int m8560S() {
                return this.f27795y;
            }

            /* renamed from: T */
            public EnumC12507c m8559T() {
                return this.f27791e;
            }

            /* renamed from: U */
            public boolean m8558U() {
                return (this.f27790d & 128) == 128;
            }

            /* renamed from: W */
            public boolean m8557W() {
                return (this.f27790d & 256) == 256;
            }

            /* renamed from: X */
            public boolean m8556X() {
                return (this.f27790d & 32) == 32;
            }

            /* renamed from: Y */
            public boolean m8555Y() {
                return (this.f27790d & 8) == 8;
            }

            /* renamed from: Z */
            public boolean m8554Z() {
                return (this.f27790d & 64) == 64;
            }

            /* renamed from: a0 */
            public boolean m8553a0() {
                return (this.f27790d & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
            }

            /* renamed from: b0 */
            public boolean m8552b0() {
                return (this.f27790d & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            /* renamed from: c */
            public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
                mo4384d();
                if ((this.f27790d & 1) == 1) {
                    codedOutputStream.m4627S(1, this.f27791e.mo4405d());
                }
                if ((this.f27790d & 2) == 2) {
                    codedOutputStream.m4580t0(2, this.f27792f);
                }
                if ((this.f27790d & 4) == 4) {
                    codedOutputStream.m4623W(3, this.f27793w);
                }
                if ((this.f27790d & 8) == 8) {
                    codedOutputStream.m4629Q(4, this.f27794x);
                }
                if ((this.f27790d & 16) == 16) {
                    codedOutputStream.m4618a0(5, this.f27795y);
                }
                if ((this.f27790d & 32) == 32) {
                    codedOutputStream.m4618a0(6, this.f27796z);
                }
                if ((this.f27790d & 64) == 64) {
                    codedOutputStream.m4618a0(7, this.f27782A);
                }
                if ((this.f27790d & 128) == 128) {
                    codedOutputStream.m4612d0(8, this.f27783B);
                }
                for (int i = 0; i < this.f27784C.size(); i++) {
                    codedOutputStream.m4612d0(9, this.f27784C.get(i));
                }
                if ((this.f27790d & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                    codedOutputStream.m4618a0(10, this.f27786E);
                }
                if ((this.f27790d & 256) == 256) {
                    codedOutputStream.m4618a0(11, this.f27785D);
                }
                codedOutputStream.m4602i0(this.f27789c);
            }

            /* renamed from: c0 */
            public boolean m8551c0() {
                return (this.f27790d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            /* renamed from: d */
            public int mo4384d() {
                int i = this.f27788G;
                if (i != -1) {
                    return i;
                }
                int m4605h = (this.f27790d & 1) == 1 ? CodedOutputStream.m4605h(1, this.f27791e.mo4405d()) + 0 : 0;
                if ((this.f27790d & 2) == 2) {
                    m4605h += CodedOutputStream.m4645A(2, this.f27792f);
                }
                if ((this.f27790d & 4) == 4) {
                    m4605h += CodedOutputStream.m4597l(3, this.f27793w);
                }
                if ((this.f27790d & 8) == 8) {
                    m4605h += CodedOutputStream.m4609f(4, this.f27794x);
                }
                if ((this.f27790d & 16) == 16) {
                    m4605h += CodedOutputStream.m4591o(5, this.f27795y);
                }
                if ((this.f27790d & 32) == 32) {
                    m4605h += CodedOutputStream.m4591o(6, this.f27796z);
                }
                if ((this.f27790d & 64) == 64) {
                    m4605h += CodedOutputStream.m4591o(7, this.f27782A);
                }
                if ((this.f27790d & 128) == 128) {
                    m4605h += CodedOutputStream.m4583s(8, this.f27783B);
                }
                for (int i2 = 0; i2 < this.f27784C.size(); i2++) {
                    m4605h += CodedOutputStream.m4583s(9, this.f27784C.get(i2));
                }
                if ((this.f27790d & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                    m4605h += CodedOutputStream.m4591o(10, this.f27786E);
                }
                if ((this.f27790d & 256) == 256) {
                    m4605h += CodedOutputStream.m4591o(11, this.f27785D);
                }
                int size = m4605h + this.f27789c.size();
                this.f27788G = size;
                return size;
            }

            /* renamed from: d0 */
            public boolean m8550d0() {
                return (this.f27790d & 16) == 16;
            }

            /* renamed from: e0 */
            public boolean m8549e0() {
                return (this.f27790d & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            /* renamed from: g */
            public InterfaceC13604q<C12504c> mo4382g() {
                return f27781I;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
            /* renamed from: h */
            public final boolean mo4379h() {
                byte b = this.f27787F;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (m8558U() && !m8573F().mo4379h()) {
                    this.f27787F = (byte) 0;
                    return false;
                }
                for (int i = 0; i < m8570I(); i++) {
                    if (!m8571H(i).mo4379h()) {
                        this.f27787F = (byte) 0;
                        return false;
                    }
                }
                this.f27787F = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            /* renamed from: i0 */
            public C12506b mo4383f() {
                return m8547g0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
            /* renamed from: j0 */
            public C12506b mo4386b() {
                return m8546h0(this);
            }

            private C12504c(AbstractC13580h.AbstractC13582b abstractC13582b) {
                super(abstractC13582b);
                this.f27787F = (byte) -1;
                this.f27788G = -1;
                this.f27789c = abstractC13582b.m4441l();
            }

            private C12504c(boolean z) {
                this.f27787F = (byte) -1;
                this.f27788G = -1;
                this.f27789c = AbstractC13570d.f29926c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private C12504c(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
                this.f27787F = (byte) -1;
                this.f27788G = -1;
                m8548f0();
                AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
                CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    ?? r5 = 256;
                    if (!z) {
                        try {
                            try {
                                int m4516K = c13573e.m4516K();
                                switch (m4516K) {
                                    case 0:
                                        break;
                                    case 8:
                                        int m4493n = c13573e.m4493n();
                                        EnumC12507c m8509a = EnumC12507c.m8509a(m4493n);
                                        if (m8509a == null) {
                                            m4636J.m4590o0(m4516K);
                                            m4636J.m4590o0(m4493n);
                                        } else {
                                            this.f27790d |= 1;
                                            this.f27791e = m8509a;
                                            continue;
                                        }
                                    case 16:
                                        this.f27790d |= 2;
                                        this.f27792f = c13573e.m4519H();
                                        continue;
                                    case 29:
                                        this.f27790d |= 4;
                                        this.f27793w = c13573e.m4490q();
                                        continue;
                                    case 33:
                                        this.f27790d |= 8;
                                        this.f27794x = c13573e.m4494m();
                                        continue;
                                    case 40:
                                        this.f27790d |= 16;
                                        this.f27795y = c13573e.m4488s();
                                        continue;
                                    case 48:
                                        this.f27790d |= 32;
                                        this.f27796z = c13573e.m4488s();
                                        continue;
                                    case 56:
                                        this.f27790d |= 64;
                                        this.f27782A = c13573e.m4488s();
                                        continue;
                                    case 66:
                                        C12508c mo4386b = (this.f27790d & 128) == 128 ? this.f27783B.mo4386b() : null;
                                        C12499b c12499b = (C12499b) c13573e.m4486u(C12499b.f27762z, c13575f);
                                        this.f27783B = c12499b;
                                        if (mo4386b != null) {
                                            mo4386b.m8508A(c12499b);
                                            this.f27783B = mo4386b.m8503r();
                                        }
                                        this.f27790d |= 128;
                                        continue;
                                    case 74:
                                        if (!(z2 & true)) {
                                            this.f27784C = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.f27784C.add(c13573e.m4486u(f27781I, c13575f));
                                        continue;
                                    case 80:
                                        this.f27790d |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                                        this.f27786E = c13573e.m4488s();
                                        continue;
                                    case 88:
                                        this.f27790d |= 256;
                                        this.f27785D = c13573e.m4488s();
                                        continue;
                                    default:
                                        r5 = mo4432p(c13573e, m4636J, c13575f, m4516K);
                                        if (r5 == 0) {
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                                z = true;
                            } catch (Throwable th) {
                                if ((z2 & true) == r5) {
                                    this.f27784C = Collections.unmodifiableList(this.f27784C);
                                }
                                try {
                                    m4636J.m4637I();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    this.f27789c = m4542O.m4530I();
                                    throw th2;
                                }
                                this.f27789c = m4542O.m4530I();
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
                    } else {
                        if (z2 & true) {
                            this.f27784C = Collections.unmodifiableList(this.f27784C);
                        }
                        try {
                            m4636J.m4637I();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f27789c = m4542O.m4530I();
                            throw th3;
                        }
                        this.f27789c = m4542O.m4530I();
                        mo4433m();
                        return;
                    }
                }
            }
        }

        private C12501b(AbstractC13580h.AbstractC13582b abstractC13582b) {
            super(abstractC13582b);
            this.f27775w = (byte) -1;
            this.f27776x = -1;
            this.f27771c = abstractC13582b.m4441l();
        }

        private C12501b(boolean z) {
            this.f27775w = (byte) -1;
            this.f27776x = -1;
            this.f27771c = AbstractC13570d.f29926c;
        }

        private C12501b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            this.f27775w = (byte) -1;
            this.f27776x = -1;
            m8607B();
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
                                    this.f27772d |= 1;
                                    this.f27773e = c13573e.m4488s();
                                } else if (m4516K != 18) {
                                    if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                    }
                                } else {
                                    C12504c.C12506b mo4386b = (this.f27772d & 2) == 2 ? this.f27774f.mo4386b() : null;
                                    C12504c c12504c = (C12504c) c13573e.m4486u(C12504c.f27781I, c13575f);
                                    this.f27774f = c12504c;
                                    if (mo4386b != null) {
                                        mo4386b.m8531C(c12504c);
                                        this.f27774f = mo4386b.m8518r();
                                    }
                                    this.f27772d |= 2;
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
                        this.f27771c = m4542O.m4530I();
                        throw th2;
                    }
                    this.f27771c = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            }
            try {
                m4636J.m4637I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27771c = m4542O.m4530I();
                throw th3;
            }
            this.f27771c = m4542O.m4530I();
            mo4433m();
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.b$c */
    /* loaded from: classes3.dex */
    public static final class C12508c extends AbstractC13580h.AbstractC13582b<C12499b, C12508c> implements Object {

        /* renamed from: d */
        private int f27824d;

        /* renamed from: e */
        private int f27825e;

        /* renamed from: f */
        private List<C12501b> f27826f = Collections.emptyList();

        private C12508c() {
            m8495z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12508c m8501t() {
            return new C12508c();
        }

        /* renamed from: u */
        private void m8500u() {
            if ((this.f27824d & 2) != 2) {
                this.f27826f = new ArrayList(this.f27826f);
                this.f27824d |= 2;
            }
        }

        /* renamed from: z */
        private void m8495z() {
        }

        /* renamed from: A */
        public C12508c m8508A(C12499b c12499b) {
            if (c12499b == C12499b.m8610z()) {
                return this;
            }
            if (c12499b.m8624C()) {
                m8506C(c12499b.m8625B());
            }
            if (!c12499b.f27766f.isEmpty()) {
                if (this.f27826f.isEmpty()) {
                    this.f27826f = c12499b.f27766f;
                    this.f27824d &= -3;
                } else {
                    m8500u();
                    this.f27826f.addAll(c12499b.f27766f);
                }
            }
            m4439o(m4441l().m4538e(c12499b.f27763c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12508c m8507B(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.b> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.f27762z     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.b r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8508A(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.b r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8508A(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12499b.C12508c.m8507B(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.b$c");
        }

        /* renamed from: C */
        public C12508c m8506C(int i) {
            this.f27824d |= 1;
            this.f27825e = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8507B(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8507B(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m8496y()) {
                for (int i = 0; i < m8498w(); i++) {
                    if (!m8499v(i).mo4379h()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12508c mo4440n(C12499b c12499b) {
            m8508A(c12499b);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12499b build() {
            C12499b m8503r = m8503r();
            if (m8503r.mo4379h()) {
                return m8503r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8503r);
        }

        /* renamed from: r */
        public C12499b m8503r() {
            C12499b c12499b = new C12499b(this);
            int i = (this.f27824d & 1) != 1 ? 0 : 1;
            c12499b.f27765e = this.f27825e;
            if ((this.f27824d & 2) == 2) {
                this.f27826f = Collections.unmodifiableList(this.f27826f);
                this.f27824d &= -3;
            }
            c12499b.f27766f = this.f27826f;
            c12499b.f27764d = i;
            return c12499b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12508c mo4443j() {
            C12508c m8501t = m8501t();
            m8501t.m8508A(m8503r());
            return m8501t;
        }

        /* renamed from: v */
        public C12501b m8499v(int i) {
            return this.f27826f.get(i);
        }

        /* renamed from: w */
        public int m8498w() {
            return this.f27826f.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12499b mo4442k() {
            return C12499b.m8610z();
        }

        /* renamed from: y */
        public boolean m8496y() {
            return (this.f27824d & 1) == 1;
        }
    }

    static {
        C12499b c12499b = new C12499b(true);
        f27761y = c12499b;
        c12499b.m8623D();
    }

    /* renamed from: D */
    private void m8623D() {
        this.f27765e = 0;
        this.f27766f = Collections.emptyList();
    }

    /* renamed from: E */
    public static C12508c m8622E() {
        return C12508c.m8501t();
    }

    /* renamed from: F */
    public static C12508c m8621F(C12499b c12499b) {
        C12508c m8622E = m8622E();
        m8622E.m8508A(c12499b);
        return m8622E;
    }

    /* renamed from: z */
    public static C12499b m8610z() {
        return f27761y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: A */
    public C12499b mo4380a() {
        return f27761y;
    }

    /* renamed from: B */
    public int m8625B() {
        return this.f27765e;
    }

    /* renamed from: C */
    public boolean m8624C() {
        return (this.f27764d & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: G */
    public C12508c mo4383f() {
        return m8622E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: H */
    public C12508c mo4386b() {
        return m8621F(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        if ((this.f27764d & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f27765e);
        }
        for (int i = 0; i < this.f27766f.size(); i++) {
            codedOutputStream.m4612d0(2, this.f27766f.get(i));
        }
        codedOutputStream.m4602i0(this.f27763c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27768x;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f27764d & 1) == 1 ? CodedOutputStream.m4591o(1, this.f27765e) + 0 : 0;
        for (int i2 = 0; i2 < this.f27766f.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(2, this.f27766f.get(i2));
        }
        int size = m4591o + this.f27763c.size();
        this.f27768x = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12499b> mo4382g() {
        return f27762z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27767w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m8624C()) {
            this.f27767w = (byte) 0;
            return false;
        }
        for (int i = 0; i < m8612x(); i++) {
            if (!m8613w(i).mo4379h()) {
                this.f27767w = (byte) 0;
                return false;
            }
        }
        this.f27767w = (byte) 1;
        return true;
    }

    /* renamed from: w */
    public C12501b m8613w(int i) {
        return this.f27766f.get(i);
    }

    /* renamed from: x */
    public int m8612x() {
        return this.f27766f.size();
    }

    /* renamed from: y */
    public List<C12501b> m8611y() {
        return this.f27766f;
    }

    private C12499b(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f27767w = (byte) -1;
        this.f27768x = -1;
        this.f27763c = abstractC13582b.m4441l();
    }

    private C12499b(boolean z) {
        this.f27767w = (byte) -1;
        this.f27768x = -1;
        this.f27763c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12499b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27767w = (byte) -1;
        this.f27768x = -1;
        m8623D();
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
                            this.f27764d |= 1;
                            this.f27765e = c13573e.m4488s();
                        } else if (m4516K != 18) {
                            if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f27766f = new ArrayList();
                                z2 |= true;
                            }
                            this.f27766f.add(c13573e.m4486u(C12501b.f27770z, c13575f));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f27766f = Collections.unmodifiableList(this.f27766f);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27763c = m4542O.m4530I();
                        throw th2;
                    }
                    this.f27763c = m4542O.m4530I();
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
            this.f27766f = Collections.unmodifiableList(this.f27766f);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27763c = m4542O.m4530I();
            throw th3;
        }
        this.f27763c = m4542O.m4530I();
        mo4433m();
    }
}
