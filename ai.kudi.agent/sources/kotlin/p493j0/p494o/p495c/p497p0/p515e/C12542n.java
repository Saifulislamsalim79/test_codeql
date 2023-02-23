package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12572u;
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
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.n */
/* loaded from: classes3.dex */
public final class C12542n extends AbstractC13580h.AbstractC13584d<C12542n> implements Object {

    /* renamed from: J */
    private static final C12542n f28040J;

    /* renamed from: K */
    public static InterfaceC13604q<C12542n> f28041K = new C12543a();

    /* renamed from: A */
    private List<C12565s> f28042A;

    /* renamed from: B */
    private C12555q f28043B;

    /* renamed from: C */
    private int f28044C;

    /* renamed from: D */
    private C12572u f28045D;

    /* renamed from: E */
    private int f28046E;

    /* renamed from: F */
    private int f28047F;

    /* renamed from: G */
    private List<Integer> f28048G;

    /* renamed from: H */
    private byte f28049H;

    /* renamed from: I */
    private int f28050I;

    /* renamed from: d */
    private final AbstractC13570d f28051d;

    /* renamed from: e */
    private int f28052e;

    /* renamed from: f */
    private int f28053f;

    /* renamed from: w */
    private int f28054w;

    /* renamed from: x */
    private int f28055x;

    /* renamed from: y */
    private C12555q f28056y;

    /* renamed from: z */
    private int f28057z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.n$a */
    /* loaded from: classes3.dex */
    static class C12543a extends AbstractC13566b<C12542n> {
        C12543a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12542n mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12542n(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.n$b */
    /* loaded from: classes3.dex */
    public static final class C12544b extends AbstractC13580h.AbstractC13583c<C12542n, C12544b> implements Object {

        /* renamed from: A */
        private int f28058A;

        /* renamed from: D */
        private int f28061D;

        /* renamed from: F */
        private int f28063F;

        /* renamed from: G */
        private int f28064G;

        /* renamed from: f */
        private int f28066f;

        /* renamed from: y */
        private int f28069y;

        /* renamed from: w */
        private int f28067w = 518;

        /* renamed from: x */
        private int f28068x = 2054;

        /* renamed from: z */
        private C12555q f28070z = C12555q.m7817Y();

        /* renamed from: B */
        private List<C12565s> f28059B = Collections.emptyList();

        /* renamed from: C */
        private C12555q f28060C = C12555q.m7817Y();

        /* renamed from: E */
        private C12572u f28062E = C12572u.m7565I();

        /* renamed from: H */
        private List<Integer> f28065H = Collections.emptyList();

        private C12544b() {
            m7942M();
        }

        /* renamed from: A */
        private void m7953A() {
            if ((this.f28066f & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 2048) {
                this.f28065H = new ArrayList(this.f28065H);
                this.f28066f |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
            }
        }

        /* renamed from: M */
        private void m7942M() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12544b m7925y() {
            return new C12544b();
        }

        /* renamed from: z */
        private void m7924z() {
            if ((this.f28066f & 32) != 32) {
                this.f28059B = new ArrayList(this.f28059B);
                this.f28066f |= 32;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: B */
        public C12542n mo4442k() {
            return C12542n.m7985Q();
        }

        /* renamed from: C */
        public C12555q m7951C() {
            return this.f28060C;
        }

        /* renamed from: D */
        public C12555q m7950D() {
            return this.f28070z;
        }

        /* renamed from: E */
        public C12572u m7949E() {
            return this.f28062E;
        }

        /* renamed from: F */
        public C12565s m7948F(int i) {
            return this.f28059B.get(i);
        }

        /* renamed from: G */
        public int m7947G() {
            return this.f28059B.size();
        }

        /* renamed from: H */
        public boolean m7946H() {
            return (this.f28066f & 4) == 4;
        }

        /* renamed from: I */
        public boolean m7945I() {
            return (this.f28066f & 64) == 64;
        }

        /* renamed from: K */
        public boolean m7944K() {
            return (this.f28066f & 8) == 8;
        }

        /* renamed from: L */
        public boolean m7943L() {
            return (this.f28066f & 256) == 256;
        }

        /* renamed from: N */
        public C12544b m7941N(C12542n c12542n) {
            if (c12542n == C12542n.m7985Q()) {
                return this;
            }
            if (c12542n.m7969h0()) {
                m7936S(c12542n.m7983S());
            }
            if (c12542n.m7966k0()) {
                m7933W(c12542n.m7980W());
            }
            if (c12542n.m7967j0()) {
                m7934U(c12542n.m7981U());
            }
            if (c12542n.m7963n0()) {
                m7938Q(c12542n.m7977Z());
            }
            if (c12542n.m7962o0()) {
                m7931Y(c12542n.m7976a0());
            }
            if (!c12542n.f28042A.isEmpty()) {
                if (this.f28059B.isEmpty()) {
                    this.f28059B = c12542n.f28042A;
                    this.f28066f &= -33;
                } else {
                    m7924z();
                    this.f28059B.addAll(c12542n.f28042A);
                }
            }
            if (c12542n.m7965l0()) {
                m7939P(c12542n.m7979X());
            }
            if (c12542n.m7964m0()) {
                m7932X(c12542n.m7978Y());
            }
            if (c12542n.m7960q0()) {
                m7937R(c12542n.m7974c0());
            }
            if (c12542n.m7968i0()) {
                m7935T(c12542n.m7982T());
            }
            if (c12542n.m7961p0()) {
                m7930a0(c12542n.m7975b0());
            }
            if (!c12542n.f28048G.isEmpty()) {
                if (this.f28065H.isEmpty()) {
                    this.f28065H = c12542n.f28048G;
                    this.f28066f &= -2049;
                } else {
                    m7953A();
                    this.f28065H.addAll(c12542n.f28048G);
                }
            }
            m4434t(c12542n);
            m4439o(m4441l().m4538e(c12542n.f28051d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n.C12544b m7940O(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.n> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n.f28041K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.n r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7941N(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.n r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7941N(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n.C12544b.m7940O(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.n$b");
        }

        /* renamed from: P */
        public C12544b m7939P(C12555q c12555q) {
            if ((this.f28066f & 64) == 64 && this.f28060C != C12555q.m7817Y()) {
                this.f28060C = C12555q.m7790z0(this.f28060C).mo4440n(c12555q).m7727w();
            } else {
                this.f28060C = c12555q;
            }
            this.f28066f |= 64;
            return this;
        }

        /* renamed from: Q */
        public C12544b m7938Q(C12555q c12555q) {
            if ((this.f28066f & 8) == 8 && this.f28070z != C12555q.m7817Y()) {
                this.f28070z = C12555q.m7790z0(this.f28070z).mo4440n(c12555q).m7727w();
            } else {
                this.f28070z = c12555q;
            }
            this.f28066f |= 8;
            return this;
        }

        /* renamed from: R */
        public C12544b m7937R(C12572u c12572u) {
            if ((this.f28066f & 256) == 256 && this.f28062E != C12572u.m7565I()) {
                C12572u.C12574b m7549Z = C12572u.m7549Z(this.f28062E);
                m7549Z.m7539G(c12572u);
                this.f28062E = m7549Z.m7529w();
            } else {
                this.f28062E = c12572u;
            }
            this.f28066f |= 256;
            return this;
        }

        /* renamed from: S */
        public C12544b m7936S(int i) {
            this.f28066f |= 1;
            this.f28067w = i;
            return this;
        }

        /* renamed from: T */
        public C12544b m7935T(int i) {
            this.f28066f |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            this.f28063F = i;
            return this;
        }

        /* renamed from: U */
        public C12544b m7934U(int i) {
            this.f28066f |= 4;
            this.f28069y = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7940O(c13573e, c13575f);
            return this;
        }

        /* renamed from: W */
        public C12544b m7933W(int i) {
            this.f28066f |= 2;
            this.f28068x = i;
            return this;
        }

        /* renamed from: X */
        public C12544b m7932X(int i) {
            this.f28066f |= 128;
            this.f28061D = i;
            return this;
        }

        /* renamed from: Y */
        public C12544b m7931Y(int i) {
            this.f28066f |= 16;
            this.f28058A = i;
            return this;
        }

        /* renamed from: a0 */
        public C12544b m7930a0(int i) {
            this.f28066f |= 1024;
            this.f28064G = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7940O(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m7946H()) {
                if (!m7944K() || m7950D().mo4379h()) {
                    for (int i = 0; i < m7947G(); i++) {
                        if (!m7948F(i).mo4379h()) {
                            return false;
                        }
                    }
                    if (!m7945I() || m7951C().mo4379h()) {
                        return (!m7943L() || m7949E().mo4379h()) && m4435s();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m7941N((C12542n) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12542n build() {
            C12542n m7927w = m7927w();
            if (m7927w.mo4379h()) {
                return m7927w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7927w);
        }

        /* renamed from: w */
        public C12542n m7927w() {
            C12542n c12542n = new C12542n(this);
            int i = this.f28066f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12542n.f28053f = this.f28067w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12542n.f28054w = this.f28068x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12542n.f28055x = this.f28069y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12542n.f28056y = this.f28070z;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c12542n.f28057z = this.f28058A;
            if ((this.f28066f & 32) == 32) {
                this.f28059B = Collections.unmodifiableList(this.f28059B);
                this.f28066f &= -33;
            }
            c12542n.f28042A = this.f28059B;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c12542n.f28043B = this.f28060C;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c12542n.f28044C = this.f28061D;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            c12542n.f28045D = this.f28062E;
            if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                i2 |= 256;
            }
            c12542n.f28046E = this.f28063F;
            if ((i & 1024) == 1024) {
                i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            c12542n.f28047F = this.f28064G;
            if ((this.f28066f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                this.f28065H = Collections.unmodifiableList(this.f28065H);
                this.f28066f &= -2049;
            }
            c12542n.f28048G = this.f28065H;
            c12542n.f28052e = i2;
            return c12542n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12544b mo4443j() {
            C12544b m7925y = m7925y();
            m7925y.m7941N(m7927w());
            return m7925y;
        }
    }

    static {
        C12542n c12542n = new C12542n(true);
        f28040J = c12542n;
        c12542n.m7959r0();
    }

    /* renamed from: Q */
    public static C12542n m7985Q() {
        return f28040J;
    }

    /* renamed from: r0 */
    private void m7959r0() {
        this.f28053f = 518;
        this.f28054w = 2054;
        this.f28055x = 0;
        this.f28056y = C12555q.m7817Y();
        this.f28057z = 0;
        this.f28042A = Collections.emptyList();
        this.f28043B = C12555q.m7817Y();
        this.f28044C = 0;
        this.f28045D = C12572u.m7565I();
        this.f28046E = 0;
        this.f28047F = 0;
        this.f28048G = Collections.emptyList();
    }

    /* renamed from: s0 */
    public static C12544b m7958s0() {
        return C12544b.m7925y();
    }

    /* renamed from: t0 */
    public static C12544b m7957t0(C12542n c12542n) {
        C12544b m7958s0 = m7958s0();
        m7958s0.m7941N(c12542n);
        return m7958s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: R */
    public C12542n mo4380a() {
        return f28040J;
    }

    /* renamed from: S */
    public int m7983S() {
        return this.f28053f;
    }

    /* renamed from: T */
    public int m7982T() {
        return this.f28046E;
    }

    /* renamed from: U */
    public int m7981U() {
        return this.f28055x;
    }

    /* renamed from: W */
    public int m7980W() {
        return this.f28054w;
    }

    /* renamed from: X */
    public C12555q m7979X() {
        return this.f28043B;
    }

    /* renamed from: Y */
    public int m7978Y() {
        return this.f28044C;
    }

    /* renamed from: Z */
    public C12555q m7977Z() {
        return this.f28056y;
    }

    /* renamed from: a0 */
    public int m7976a0() {
        return this.f28057z;
    }

    /* renamed from: b0 */
    public int m7975b0() {
        return this.f28047F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28052e & 2) == 2) {
            codedOutputStream.m4618a0(1, this.f28054w);
        }
        if ((this.f28052e & 4) == 4) {
            codedOutputStream.m4618a0(2, this.f28055x);
        }
        if ((this.f28052e & 8) == 8) {
            codedOutputStream.m4612d0(3, this.f28056y);
        }
        for (int i = 0; i < this.f28042A.size(); i++) {
            codedOutputStream.m4612d0(4, this.f28042A.get(i));
        }
        if ((this.f28052e & 32) == 32) {
            codedOutputStream.m4612d0(5, this.f28043B);
        }
        if ((this.f28052e & 128) == 128) {
            codedOutputStream.m4612d0(6, this.f28045D);
        }
        if ((this.f28052e & 256) == 256) {
            codedOutputStream.m4618a0(7, this.f28046E);
        }
        if ((this.f28052e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
            codedOutputStream.m4618a0(8, this.f28047F);
        }
        if ((this.f28052e & 16) == 16) {
            codedOutputStream.m4618a0(9, this.f28057z);
        }
        if ((this.f28052e & 64) == 64) {
            codedOutputStream.m4618a0(10, this.f28044C);
        }
        if ((this.f28052e & 1) == 1) {
            codedOutputStream.m4618a0(11, this.f28053f);
        }
        for (int i2 = 0; i2 < this.f28048G.size(); i2++) {
            codedOutputStream.m4618a0(31, this.f28048G.get(i2).intValue());
        }
        m4424y.m4422a(19000, codedOutputStream);
        codedOutputStream.m4602i0(this.f28051d);
    }

    /* renamed from: c0 */
    public C12572u m7974c0() {
        return this.f28045D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28050I;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28052e & 2) == 2 ? CodedOutputStream.m4591o(1, this.f28054w) + 0 : 0;
        if ((this.f28052e & 4) == 4) {
            m4591o += CodedOutputStream.m4591o(2, this.f28055x);
        }
        if ((this.f28052e & 8) == 8) {
            m4591o += CodedOutputStream.m4583s(3, this.f28056y);
        }
        for (int i2 = 0; i2 < this.f28042A.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(4, this.f28042A.get(i2));
        }
        if ((this.f28052e & 32) == 32) {
            m4591o += CodedOutputStream.m4583s(5, this.f28043B);
        }
        if ((this.f28052e & 128) == 128) {
            m4591o += CodedOutputStream.m4583s(6, this.f28045D);
        }
        if ((this.f28052e & 256) == 256) {
            m4591o += CodedOutputStream.m4591o(7, this.f28046E);
        }
        if ((this.f28052e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
            m4591o += CodedOutputStream.m4591o(8, this.f28047F);
        }
        if ((this.f28052e & 16) == 16) {
            m4591o += CodedOutputStream.m4591o(9, this.f28057z);
        }
        if ((this.f28052e & 64) == 64) {
            m4591o += CodedOutputStream.m4591o(10, this.f28044C);
        }
        if ((this.f28052e & 1) == 1) {
            m4591o += CodedOutputStream.m4591o(11, this.f28053f);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f28048G.size(); i4++) {
            i3 += CodedOutputStream.m4589p(this.f28048G.get(i4).intValue());
        }
        int size = m4591o + i3 + (m7970g0().size() * 2) + m4429t() + this.f28051d.size();
        this.f28050I = size;
        return size;
    }

    /* renamed from: d0 */
    public C12565s m7973d0(int i) {
        return this.f28042A.get(i);
    }

    /* renamed from: e0 */
    public int m7972e0() {
        return this.f28042A.size();
    }

    /* renamed from: f0 */
    public List<C12565s> m7971f0() {
        return this.f28042A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12542n> mo4382g() {
        return f28041K;
    }

    /* renamed from: g0 */
    public List<Integer> m7970g0() {
        return this.f28048G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28049H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m7967j0()) {
            this.f28049H = (byte) 0;
            return false;
        } else if (m7963n0() && !m7977Z().mo4379h()) {
            this.f28049H = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m7972e0(); i++) {
                if (!m7973d0(i).mo4379h()) {
                    this.f28049H = (byte) 0;
                    return false;
                }
            }
            if (m7965l0() && !m7979X().mo4379h()) {
                this.f28049H = (byte) 0;
                return false;
            } else if (m7960q0() && !m7974c0().mo4379h()) {
                this.f28049H = (byte) 0;
                return false;
            } else if (!m4430s()) {
                this.f28049H = (byte) 0;
                return false;
            } else {
                this.f28049H = (byte) 1;
                return true;
            }
        }
    }

    /* renamed from: h0 */
    public boolean m7969h0() {
        return (this.f28052e & 1) == 1;
    }

    /* renamed from: i0 */
    public boolean m7968i0() {
        return (this.f28052e & 256) == 256;
    }

    /* renamed from: j0 */
    public boolean m7967j0() {
        return (this.f28052e & 4) == 4;
    }

    /* renamed from: k0 */
    public boolean m7966k0() {
        return (this.f28052e & 2) == 2;
    }

    /* renamed from: l0 */
    public boolean m7965l0() {
        return (this.f28052e & 32) == 32;
    }

    /* renamed from: m0 */
    public boolean m7964m0() {
        return (this.f28052e & 64) == 64;
    }

    /* renamed from: n0 */
    public boolean m7963n0() {
        return (this.f28052e & 8) == 8;
    }

    /* renamed from: o0 */
    public boolean m7962o0() {
        return (this.f28052e & 16) == 16;
    }

    /* renamed from: p0 */
    public boolean m7961p0() {
        return (this.f28052e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
    }

    /* renamed from: q0 */
    public boolean m7960q0() {
        return (this.f28052e & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: u0 */
    public C12544b mo4383f() {
        return m7958s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: v0 */
    public C12544b mo4386b() {
        return m7957t0(this);
    }

    private C12542n(AbstractC13580h.AbstractC13583c<C12542n, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28049H = (byte) -1;
        this.f28050I = -1;
        this.f28051d = abstractC13583c.m4441l();
    }

    private C12542n(boolean z) {
        this.f28049H = (byte) -1;
        this.f28050I = -1;
        this.f28051d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C12542n(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f28049H = (byte) -1;
        this.f28050I = -1;
        m7959r0();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 2048;
            if (!z) {
                try {
                    try {
                        try {
                            int m4516K = c13573e.m4516K();
                            switch (m4516K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f28052e |= 2;
                                    this.f28054w = c13573e.m4488s();
                                    continue;
                                case 16:
                                    this.f28052e |= 4;
                                    this.f28055x = c13573e.m4488s();
                                    continue;
                                case 26:
                                    C12555q.C12561c mo4386b = (this.f28052e & 8) == 8 ? this.f28056y.mo4386b() : null;
                                    C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28056y = c12555q;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q);
                                        this.f28056y = mo4386b.m7727w();
                                    }
                                    this.f28052e |= 8;
                                    continue;
                                case 34:
                                    if (!(z2 & true)) {
                                        this.f28042A = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28042A.add(c13573e.m4486u(C12565s.f28185F, c13575f));
                                    continue;
                                case 42:
                                    C12555q.C12561c mo4386b2 = (this.f28052e & 32) == 32 ? this.f28043B.mo4386b() : null;
                                    C12555q c12555q2 = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28043B = c12555q2;
                                    if (mo4386b2 != null) {
                                        mo4386b2.mo4440n(c12555q2);
                                        this.f28043B = mo4386b2.m7727w();
                                    }
                                    this.f28052e |= 32;
                                    continue;
                                case 50:
                                    C12572u.C12574b mo4386b3 = (this.f28052e & 128) == 128 ? this.f28045D.mo4386b() : null;
                                    C12572u c12572u = (C12572u) c13573e.m4486u(C12572u.f28221E, c13575f);
                                    this.f28045D = c12572u;
                                    if (mo4386b3 != null) {
                                        mo4386b3.m7539G(c12572u);
                                        this.f28045D = mo4386b3.m7529w();
                                    }
                                    this.f28052e |= 128;
                                    continue;
                                case 56:
                                    this.f28052e |= 256;
                                    this.f28046E = c13573e.m4488s();
                                    continue;
                                case 64:
                                    this.f28052e |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                                    this.f28047F = c13573e.m4488s();
                                    continue;
                                case 72:
                                    this.f28052e |= 16;
                                    this.f28057z = c13573e.m4488s();
                                    continue;
                                case 80:
                                    this.f28052e |= 64;
                                    this.f28044C = c13573e.m4488s();
                                    continue;
                                case 88:
                                    this.f28052e |= 1;
                                    this.f28053f = c13573e.m4488s();
                                    continue;
                                case 248:
                                    if (!(z2 & true)) {
                                        this.f28048G = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28048G.add(Integer.valueOf(c13573e.m4488s()));
                                    continue;
                                case 250:
                                    int m4497j = c13573e.m4497j(c13573e.m4526A());
                                    if (!(z2 & true) && c13573e.m4502e() > 0) {
                                        this.f28048G = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c13573e.m4502e() > 0) {
                                        this.f28048G.add(Integer.valueOf(c13573e.m4488s()));
                                    }
                                    c13573e.m4498i(m4497j);
                                    continue;
                                    break;
                                default:
                                    r5 = mo4432p(c13573e, m4636J, c13575f, m4516K);
                                    if (r5 == 0) {
                                        break;
                                    } else {
                                        continue;
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
                        this.f28042A = Collections.unmodifiableList(this.f28042A);
                    }
                    if ((z2 & true) == r5) {
                        this.f28048G = Collections.unmodifiableList(this.f28048G);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f28051d = m4542O.m4530I();
                        throw th2;
                    }
                    this.f28051d = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            } else {
                if (z2 & true) {
                    this.f28042A = Collections.unmodifiableList(this.f28042A);
                }
                if (z2 & true) {
                    this.f28048G = Collections.unmodifiableList(this.f28048G);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f28051d = m4542O.m4530I();
                    throw th3;
                }
                this.f28051d = m4542O.m4530I();
                mo4433m();
                return;
            }
        }
    }
}
