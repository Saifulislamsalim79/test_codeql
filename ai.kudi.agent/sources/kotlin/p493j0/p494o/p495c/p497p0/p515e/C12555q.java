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
/* renamed from: kotlin.j0.o.c.p0.e.q */
/* loaded from: classes3.dex */
public final class C12555q extends AbstractC13580h.AbstractC13584d<C12555q> implements Object {

    /* renamed from: L */
    private static final C12555q f28105L;

    /* renamed from: M */
    public static InterfaceC13604q<C12555q> f28106M = new C12556a();

    /* renamed from: A */
    private int f28107A;

    /* renamed from: B */
    private int f28108B;

    /* renamed from: C */
    private int f28109C;

    /* renamed from: D */
    private int f28110D;

    /* renamed from: E */
    private C12555q f28111E;

    /* renamed from: F */
    private int f28112F;

    /* renamed from: G */
    private C12555q f28113G;

    /* renamed from: H */
    private int f28114H;

    /* renamed from: I */
    private int f28115I;

    /* renamed from: J */
    private byte f28116J;

    /* renamed from: K */
    private int f28117K;

    /* renamed from: d */
    private final AbstractC13570d f28118d;

    /* renamed from: e */
    private int f28119e;

    /* renamed from: f */
    private List<C12557b> f28120f;

    /* renamed from: w */
    private boolean f28121w;

    /* renamed from: x */
    private int f28122x;

    /* renamed from: y */
    private C12555q f28123y;

    /* renamed from: z */
    private int f28124z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.q$a */
    /* loaded from: classes3.dex */
    static class C12556a extends AbstractC13566b<C12555q> {
        C12556a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12555q mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12555q(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.q$c */
    /* loaded from: classes3.dex */
    public static final class C12561c extends AbstractC13580h.AbstractC13583c<C12555q, C12561c> implements Object {

        /* renamed from: A */
        private int f28144A;

        /* renamed from: B */
        private int f28145B;

        /* renamed from: C */
        private int f28146C;

        /* renamed from: D */
        private int f28147D;

        /* renamed from: E */
        private int f28148E;

        /* renamed from: G */
        private int f28150G;

        /* renamed from: I */
        private int f28152I;

        /* renamed from: J */
        private int f28153J;

        /* renamed from: f */
        private int f28154f;

        /* renamed from: x */
        private boolean f28156x;

        /* renamed from: y */
        private int f28157y;

        /* renamed from: w */
        private List<C12557b> f28155w = Collections.emptyList();

        /* renamed from: z */
        private C12555q f28158z = C12555q.m7817Y();

        /* renamed from: F */
        private C12555q f28149F = C12555q.m7817Y();

        /* renamed from: H */
        private C12555q f28151H = C12555q.m7817Y();

        private C12561c() {
            m7745K();
        }

        /* renamed from: K */
        private void m7745K() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12561c m7725y() {
            return new C12561c();
        }

        /* renamed from: z */
        private void m7724z() {
            if ((this.f28154f & 1) != 1) {
                this.f28155w = new ArrayList(this.f28155w);
                this.f28154f |= 1;
            }
        }

        /* renamed from: A */
        public C12555q m7754A() {
            return this.f28151H;
        }

        /* renamed from: B */
        public C12557b m7753B(int i) {
            return this.f28155w.get(i);
        }

        /* renamed from: C */
        public int m7752C() {
            return this.f28155w.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: D */
        public C12555q mo4442k() {
            return C12555q.m7817Y();
        }

        /* renamed from: E */
        public C12555q m7750E() {
            return this.f28158z;
        }

        /* renamed from: F */
        public C12555q m7749F() {
            return this.f28149F;
        }

        /* renamed from: G */
        public boolean m7748G() {
            return (this.f28154f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048;
        }

        /* renamed from: H */
        public boolean m7747H() {
            return (this.f28154f & 8) == 8;
        }

        /* renamed from: I */
        public boolean m7746I() {
            return (this.f28154f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
        }

        /* renamed from: L */
        public C12561c m7744L(C12555q c12555q) {
            if ((this.f28154f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048 && this.f28151H != C12555q.m7817Y()) {
                this.f28151H = C12555q.m7790z0(this.f28151H).mo4440n(c12555q).m7727w();
            } else {
                this.f28151H = c12555q;
            }
            this.f28154f |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
            return this;
        }

        /* renamed from: M */
        public C12561c m7743M(C12555q c12555q) {
            if ((this.f28154f & 8) == 8 && this.f28158z != C12555q.m7817Y()) {
                this.f28158z = C12555q.m7790z0(this.f28158z).mo4440n(c12555q).m7727w();
            } else {
                this.f28158z = c12555q;
            }
            this.f28154f |= 8;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: N */
        public C12561c mo4440n(C12555q c12555q) {
            if (c12555q == C12555q.m7817Y()) {
                return this;
            }
            if (!c12555q.f28120f.isEmpty()) {
                if (this.f28155w.isEmpty()) {
                    this.f28155w = c12555q.f28120f;
                    this.f28154f &= -2;
                } else {
                    m7724z();
                    this.f28155w.addAll(c12555q.f28120f);
                }
            }
            if (c12555q.m7798r0()) {
                m7734W(c12555q.m7811e0());
            }
            if (c12555q.m7801o0()) {
                m7736T(c12555q.m7814b0());
            }
            if (c12555q.m7800p0()) {
                m7743M(c12555q.m7813c0());
            }
            if (c12555q.m7799q0()) {
                m7735U(c12555q.m7812d0());
            }
            if (c12555q.m7803m0()) {
                m7738R(c12555q.m7818X());
            }
            if (c12555q.m7794v0()) {
                m7731a0(c12555q.m7807i0());
            }
            if (c12555q.m7793w0()) {
                m7730b0(c12555q.m7806j0());
            }
            if (c12555q.m7795u0()) {
                m7732Y(c12555q.m7808h0());
            }
            if (c12555q.m7797s0()) {
                m7740P(c12555q.m7810f0());
            }
            if (c12555q.m7796t0()) {
                m7733X(c12555q.m7809g0());
            }
            if (c12555q.m7805k0()) {
                m7744L(c12555q.m7823R());
            }
            if (c12555q.m7804l0()) {
                m7739Q(c12555q.m7822S());
            }
            if (c12555q.m7802n0()) {
                m7737S(c12555q.m7815a0());
            }
            m4434t(c12555q);
            m4439o(m4441l().m4538e(c12555q.f28118d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12561c m7741O(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.q> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.f28106M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.q r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.mo4440n(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.q r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo4440n(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12561c.m7741O(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.q$c");
        }

        /* renamed from: P */
        public C12561c m7740P(C12555q c12555q) {
            if ((this.f28154f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512 && this.f28149F != C12555q.m7817Y()) {
                this.f28149F = C12555q.m7790z0(this.f28149F).mo4440n(c12555q).m7727w();
            } else {
                this.f28149F = c12555q;
            }
            this.f28154f |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            return this;
        }

        /* renamed from: Q */
        public C12561c m7739Q(int i) {
            this.f28154f |= 4096;
            this.f28152I = i;
            return this;
        }

        /* renamed from: R */
        public C12561c m7738R(int i) {
            this.f28154f |= 32;
            this.f28145B = i;
            return this;
        }

        /* renamed from: S */
        public C12561c m7737S(int i) {
            this.f28154f |= 8192;
            this.f28153J = i;
            return this;
        }

        /* renamed from: T */
        public C12561c m7736T(int i) {
            this.f28154f |= 4;
            this.f28157y = i;
            return this;
        }

        /* renamed from: U */
        public C12561c m7735U(int i) {
            this.f28154f |= 16;
            this.f28144A = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7741O(c13573e, c13575f);
            return this;
        }

        /* renamed from: W */
        public C12561c m7734W(boolean z) {
            this.f28154f |= 2;
            this.f28156x = z;
            return this;
        }

        /* renamed from: X */
        public C12561c m7733X(int i) {
            this.f28154f |= 1024;
            this.f28150G = i;
            return this;
        }

        /* renamed from: Y */
        public C12561c m7732Y(int i) {
            this.f28154f |= 256;
            this.f28148E = i;
            return this;
        }

        /* renamed from: a0 */
        public C12561c m7731a0(int i) {
            this.f28154f |= 64;
            this.f28146C = i;
            return this;
        }

        /* renamed from: b0 */
        public C12561c m7730b0(int i) {
            this.f28154f |= 128;
            this.f28147D = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7741O(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            for (int i = 0; i < m7752C(); i++) {
                if (!m7753B(i).mo4379h()) {
                    return false;
                }
            }
            if (!m7747H() || m7750E().mo4379h()) {
                if (!m7746I() || m7749F().mo4379h()) {
                    return (!m7748G() || m7754A().mo4379h()) && m4435s();
                }
                return false;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12555q build() {
            C12555q m7727w = m7727w();
            if (m7727w.mo4379h()) {
                return m7727w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7727w);
        }

        /* renamed from: w */
        public C12555q m7727w() {
            C12555q c12555q = new C12555q(this);
            int i = this.f28154f;
            if ((i & 1) == 1) {
                this.f28155w = Collections.unmodifiableList(this.f28155w);
                this.f28154f &= -2;
            }
            c12555q.f28120f = this.f28155w;
            int i2 = (i & 2) != 2 ? 0 : 1;
            c12555q.f28121w = this.f28156x;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            c12555q.f28122x = this.f28157y;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c12555q.f28123y = this.f28158z;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c12555q.f28124z = this.f28144A;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c12555q.f28107A = this.f28145B;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c12555q.f28108B = this.f28146C;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c12555q.f28109C = this.f28147D;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            c12555q.f28110D = this.f28148E;
            if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                i2 |= 256;
            }
            c12555q.f28111E = this.f28149F;
            if ((i & 1024) == 1024) {
                i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
            c12555q.f28112F = this.f28150G;
            if ((i & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                i2 |= 1024;
            }
            c12555q.f28113G = this.f28151H;
            if ((i & 4096) == 4096) {
                i2 |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
            }
            c12555q.f28114H = this.f28152I;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            c12555q.f28115I = this.f28153J;
            c12555q.f28119e = i2;
            return c12555q;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12561c mo4443j() {
            C12561c m7725y = m7725y();
            m7725y.mo4440n(m7727w());
            return m7725y;
        }
    }

    static {
        C12555q c12555q = new C12555q(true);
        f28105L = c12555q;
        c12555q.m7792x0();
    }

    /* renamed from: Y */
    public static C12555q m7817Y() {
        return f28105L;
    }

    /* renamed from: x0 */
    private void m7792x0() {
        this.f28120f = Collections.emptyList();
        this.f28121w = false;
        this.f28122x = 0;
        this.f28123y = m7817Y();
        this.f28124z = 0;
        this.f28107A = 0;
        this.f28108B = 0;
        this.f28109C = 0;
        this.f28110D = 0;
        this.f28111E = m7817Y();
        this.f28112F = 0;
        this.f28113G = m7817Y();
        this.f28114H = 0;
        this.f28115I = 0;
    }

    /* renamed from: y0 */
    public static C12561c m7791y0() {
        return C12561c.m7725y();
    }

    /* renamed from: z0 */
    public static C12561c m7790z0(C12555q c12555q) {
        C12561c m7791y0 = m7791y0();
        m7791y0.mo4440n(c12555q);
        return m7791y0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: A0 */
    public C12561c mo4383f() {
        return m7791y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: B0 */
    public C12561c mo4386b() {
        return m7790z0(this);
    }

    /* renamed from: R */
    public C12555q m7823R() {
        return this.f28113G;
    }

    /* renamed from: S */
    public int m7822S() {
        return this.f28114H;
    }

    /* renamed from: T */
    public C12557b m7821T(int i) {
        return this.f28120f.get(i);
    }

    /* renamed from: U */
    public int m7820U() {
        return this.f28120f.size();
    }

    /* renamed from: W */
    public List<C12557b> m7819W() {
        return this.f28120f;
    }

    /* renamed from: X */
    public int m7818X() {
        return this.f28107A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: Z */
    public C12555q mo4380a() {
        return f28105L;
    }

    /* renamed from: a0 */
    public int m7815a0() {
        return this.f28115I;
    }

    /* renamed from: b0 */
    public int m7814b0() {
        return this.f28122x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28119e & 4096) == 4096) {
            codedOutputStream.m4618a0(1, this.f28115I);
        }
        for (int i = 0; i < this.f28120f.size(); i++) {
            codedOutputStream.m4612d0(2, this.f28120f.get(i));
        }
        if ((this.f28119e & 1) == 1) {
            codedOutputStream.m4634L(3, this.f28121w);
        }
        if ((this.f28119e & 2) == 2) {
            codedOutputStream.m4618a0(4, this.f28122x);
        }
        if ((this.f28119e & 4) == 4) {
            codedOutputStream.m4612d0(5, this.f28123y);
        }
        if ((this.f28119e & 16) == 16) {
            codedOutputStream.m4618a0(6, this.f28107A);
        }
        if ((this.f28119e & 32) == 32) {
            codedOutputStream.m4618a0(7, this.f28108B);
        }
        if ((this.f28119e & 8) == 8) {
            codedOutputStream.m4618a0(8, this.f28124z);
        }
        if ((this.f28119e & 64) == 64) {
            codedOutputStream.m4618a0(9, this.f28109C);
        }
        if ((this.f28119e & 256) == 256) {
            codedOutputStream.m4612d0(10, this.f28111E);
        }
        if ((this.f28119e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
            codedOutputStream.m4618a0(11, this.f28112F);
        }
        if ((this.f28119e & 128) == 128) {
            codedOutputStream.m4618a0(12, this.f28110D);
        }
        if ((this.f28119e & 1024) == 1024) {
            codedOutputStream.m4612d0(13, this.f28113G);
        }
        if ((this.f28119e & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
            codedOutputStream.m4618a0(14, this.f28114H);
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f28118d);
    }

    /* renamed from: c0 */
    public C12555q m7813c0() {
        return this.f28123y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28117K;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28119e & 4096) == 4096 ? CodedOutputStream.m4591o(1, this.f28115I) + 0 : 0;
        for (int i2 = 0; i2 < this.f28120f.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(2, this.f28120f.get(i2));
        }
        if ((this.f28119e & 1) == 1) {
            m4591o += CodedOutputStream.m4619a(3, this.f28121w);
        }
        if ((this.f28119e & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(4, this.f28122x);
        }
        if ((this.f28119e & 4) == 4) {
            m4591o += CodedOutputStream.m4583s(5, this.f28123y);
        }
        if ((this.f28119e & 16) == 16) {
            m4591o += CodedOutputStream.m4591o(6, this.f28107A);
        }
        if ((this.f28119e & 32) == 32) {
            m4591o += CodedOutputStream.m4591o(7, this.f28108B);
        }
        if ((this.f28119e & 8) == 8) {
            m4591o += CodedOutputStream.m4591o(8, this.f28124z);
        }
        if ((this.f28119e & 64) == 64) {
            m4591o += CodedOutputStream.m4591o(9, this.f28109C);
        }
        if ((this.f28119e & 256) == 256) {
            m4591o += CodedOutputStream.m4583s(10, this.f28111E);
        }
        if ((this.f28119e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
            m4591o += CodedOutputStream.m4591o(11, this.f28112F);
        }
        if ((this.f28119e & 128) == 128) {
            m4591o += CodedOutputStream.m4591o(12, this.f28110D);
        }
        if ((this.f28119e & 1024) == 1024) {
            m4591o += CodedOutputStream.m4583s(13, this.f28113G);
        }
        if ((this.f28119e & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
            m4591o += CodedOutputStream.m4591o(14, this.f28114H);
        }
        int m4429t = m4591o + m4429t() + this.f28118d.size();
        this.f28117K = m4429t;
        return m4429t;
    }

    /* renamed from: d0 */
    public int m7812d0() {
        return this.f28124z;
    }

    /* renamed from: e0 */
    public boolean m7811e0() {
        return this.f28121w;
    }

    /* renamed from: f0 */
    public C12555q m7810f0() {
        return this.f28111E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12555q> mo4382g() {
        return f28106M;
    }

    /* renamed from: g0 */
    public int m7809g0() {
        return this.f28112F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28116J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < m7820U(); i++) {
            if (!m7821T(i).mo4379h()) {
                this.f28116J = (byte) 0;
                return false;
            }
        }
        if (m7800p0() && !m7813c0().mo4379h()) {
            this.f28116J = (byte) 0;
            return false;
        } else if (m7797s0() && !m7810f0().mo4379h()) {
            this.f28116J = (byte) 0;
            return false;
        } else if (m7805k0() && !m7823R().mo4379h()) {
            this.f28116J = (byte) 0;
            return false;
        } else if (!m4430s()) {
            this.f28116J = (byte) 0;
            return false;
        } else {
            this.f28116J = (byte) 1;
            return true;
        }
    }

    /* renamed from: h0 */
    public int m7808h0() {
        return this.f28110D;
    }

    /* renamed from: i0 */
    public int m7807i0() {
        return this.f28108B;
    }

    /* renamed from: j0 */
    public int m7806j0() {
        return this.f28109C;
    }

    /* renamed from: k0 */
    public boolean m7805k0() {
        return (this.f28119e & 1024) == 1024;
    }

    /* renamed from: l0 */
    public boolean m7804l0() {
        return (this.f28119e & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048;
    }

    /* renamed from: m0 */
    public boolean m7803m0() {
        return (this.f28119e & 16) == 16;
    }

    /* renamed from: n0 */
    public boolean m7802n0() {
        return (this.f28119e & 4096) == 4096;
    }

    /* renamed from: o0 */
    public boolean m7801o0() {
        return (this.f28119e & 2) == 2;
    }

    /* renamed from: p0 */
    public boolean m7800p0() {
        return (this.f28119e & 4) == 4;
    }

    /* renamed from: q0 */
    public boolean m7799q0() {
        return (this.f28119e & 8) == 8;
    }

    /* renamed from: r0 */
    public boolean m7798r0() {
        return (this.f28119e & 1) == 1;
    }

    /* renamed from: s0 */
    public boolean m7797s0() {
        return (this.f28119e & 256) == 256;
    }

    /* renamed from: t0 */
    public boolean m7796t0() {
        return (this.f28119e & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
    }

    /* renamed from: u0 */
    public boolean m7795u0() {
        return (this.f28119e & 128) == 128;
    }

    /* renamed from: v0 */
    public boolean m7794v0() {
        return (this.f28119e & 32) == 32;
    }

    /* renamed from: w0 */
    public boolean m7793w0() {
        return (this.f28119e & 64) == 64;
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.q$b */
    /* loaded from: classes3.dex */
    public static final class C12557b extends AbstractC13580h implements InterfaceC13603p {

        /* renamed from: A */
        public static InterfaceC13604q<C12557b> f28125A = new C12558a();

        /* renamed from: z */
        private static final C12557b f28126z;

        /* renamed from: c */
        private final AbstractC13570d f28127c;

        /* renamed from: d */
        private int f28128d;

        /* renamed from: e */
        private EnumC12560c f28129e;

        /* renamed from: f */
        private C12555q f28130f;

        /* renamed from: w */
        private int f28131w;

        /* renamed from: x */
        private byte f28132x;

        /* renamed from: y */
        private int f28133y;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.q$b$a */
        /* loaded from: classes3.dex */
        static class C12558a extends AbstractC13566b<C12557b> {
            C12558a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
            /* renamed from: m */
            public C12557b mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
                return new C12557b(c13573e, c13575f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.q$b$b */
        /* loaded from: classes3.dex */
        public static final class C12559b extends AbstractC13580h.AbstractC13582b<C12557b, C12559b> implements Object {

            /* renamed from: d */
            private int f28134d;

            /* renamed from: e */
            private EnumC12560c f28135e = EnumC12560c.INV;

            /* renamed from: f */
            private C12555q f28136f = C12555q.m7817Y();

            /* renamed from: w */
            private int f28137w;

            private C12559b() {
                m7758x();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t */
            public static C12559b m7762t() {
                return new C12559b();
            }

            /* renamed from: x */
            private void m7758x() {
            }

            /* renamed from: A */
            public C12559b m7769A(C12555q c12555q) {
                if ((this.f28134d & 2) == 2 && this.f28136f != C12555q.m7817Y()) {
                    this.f28136f = C12555q.m7790z0(this.f28136f).mo4440n(c12555q).m7727w();
                } else {
                    this.f28136f = c12555q;
                }
                this.f28134d |= 2;
                return this;
            }

            /* renamed from: B */
            public C12559b m7768B(EnumC12560c enumC12560c) {
                if (enumC12560c != null) {
                    this.f28134d |= 1;
                    this.f28135e = enumC12560c;
                    return this;
                }
                throw null;
            }

            /* renamed from: C */
            public C12559b m7767C(int i) {
                this.f28134d |= 4;
                this.f28137w = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: V */
            public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
                m7756z(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
            /* renamed from: e */
            public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
                m7756z(c13573e, c13575f);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
            /* renamed from: h */
            public final boolean mo4379h() {
                return !m7759w() || m7760v().mo4379h();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: n */
            public /* bridge */ /* synthetic */ C12559b mo4440n(C12557b c12557b) {
                m7757y(c12557b);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
            /* renamed from: q */
            public C12557b build() {
                C12557b m7764r = m7764r();
                if (m7764r.mo4379h()) {
                    return m7764r;
                }
                throw AbstractC13563a.AbstractC13564a.m4552i(m7764r);
            }

            /* renamed from: r */
            public C12557b m7764r() {
                C12557b c12557b = new C12557b(this);
                int i = this.f28134d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                c12557b.f28129e = this.f28135e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                c12557b.f28130f = this.f28136f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                c12557b.f28131w = this.f28137w;
                c12557b.f28128d = i2;
                return c12557b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: s */
            public C12559b mo4443j() {
                C12559b m7762t = m7762t();
                m7762t.m7757y(m7764r());
                return m7762t;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
            /* renamed from: u */
            public C12557b mo4442k() {
                return C12557b.m7774w();
            }

            /* renamed from: v */
            public C12555q m7760v() {
                return this.f28136f;
            }

            /* renamed from: w */
            public boolean m7759w() {
                return (this.f28134d & 2) == 2;
            }

            /* renamed from: y */
            public C12559b m7757y(C12557b c12557b) {
                if (c12557b == C12557b.m7774w()) {
                    return this;
                }
                if (c12557b.m7787B()) {
                    m7768B(c12557b.m7772y());
                }
                if (c12557b.m7786C()) {
                    m7769A(c12557b.m7771z());
                }
                if (c12557b.m7785D()) {
                    m7767C(c12557b.m7788A());
                }
                m4439o(m4441l().m4538e(c12557b.f28127c));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            /* renamed from: z */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12557b.C12559b m7756z(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.q$b> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12557b.f28125A     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.j0.o.c.p0.e.q$b r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12557b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.m7757y(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.j0.o.c.p0.e.q$b r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12557b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m7757y(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q.C12557b.C12559b.m7756z(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.q$b$b");
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.j0.o.c.p0.e.q$b$c */
        /* loaded from: classes3.dex */
        public enum EnumC12560c implements C13588i.InterfaceC13589a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: c */
            private final int f28143c;

            EnumC12560c(int i, int i2) {
                this.f28143c = i2;
            }

            /* renamed from: a */
            public static EnumC12560c m7755a(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return STAR;
                        }
                        return INV;
                    }
                    return OUT;
                }
                return IN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
            /* renamed from: d */
            public final int mo4405d() {
                return this.f28143c;
            }
        }

        static {
            C12557b c12557b = new C12557b(true);
            f28126z = c12557b;
            c12557b.m7784E();
        }

        /* renamed from: E */
        private void m7784E() {
            this.f28129e = EnumC12560c.INV;
            this.f28130f = C12555q.m7817Y();
            this.f28131w = 0;
        }

        /* renamed from: F */
        public static C12559b m7783F() {
            return C12559b.m7762t();
        }

        /* renamed from: G */
        public static C12559b m7782G(C12557b c12557b) {
            C12559b m7783F = m7783F();
            m7783F.m7757y(c12557b);
            return m7783F;
        }

        /* renamed from: w */
        public static C12557b m7774w() {
            return f28126z;
        }

        /* renamed from: A */
        public int m7788A() {
            return this.f28131w;
        }

        /* renamed from: B */
        public boolean m7787B() {
            return (this.f28128d & 1) == 1;
        }

        /* renamed from: C */
        public boolean m7786C() {
            return (this.f28128d & 2) == 2;
        }

        /* renamed from: D */
        public boolean m7785D() {
            return (this.f28128d & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: H */
        public C12559b mo4383f() {
            return m7783F();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: I */
        public C12559b mo4386b() {
            return m7782G(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: c */
        public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
            mo4384d();
            if ((this.f28128d & 1) == 1) {
                codedOutputStream.m4627S(1, this.f28129e.mo4405d());
            }
            if ((this.f28128d & 2) == 2) {
                codedOutputStream.m4612d0(2, this.f28130f);
            }
            if ((this.f28128d & 4) == 4) {
                codedOutputStream.m4618a0(3, this.f28131w);
            }
            codedOutputStream.m4602i0(this.f28127c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: d */
        public int mo4384d() {
            int i = this.f28133y;
            if (i != -1) {
                return i;
            }
            int m4605h = (this.f28128d & 1) == 1 ? 0 + CodedOutputStream.m4605h(1, this.f28129e.mo4405d()) : 0;
            if ((this.f28128d & 2) == 2) {
                m4605h += CodedOutputStream.m4583s(2, this.f28130f);
            }
            if ((this.f28128d & 4) == 4) {
                m4605h += CodedOutputStream.m4591o(3, this.f28131w);
            }
            int size = m4605h + this.f28127c.size();
            this.f28133y = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
        /* renamed from: g */
        public InterfaceC13604q<C12557b> mo4382g() {
            return f28125A;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            byte b = this.f28132x;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (m7786C() && !m7771z().mo4379h()) {
                this.f28132x = (byte) 0;
                return false;
            }
            this.f28132x = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: x */
        public C12557b mo4380a() {
            return f28126z;
        }

        /* renamed from: y */
        public EnumC12560c m7772y() {
            return this.f28129e;
        }

        /* renamed from: z */
        public C12555q m7771z() {
            return this.f28130f;
        }

        private C12557b(AbstractC13580h.AbstractC13582b abstractC13582b) {
            super(abstractC13582b);
            this.f28132x = (byte) -1;
            this.f28133y = -1;
            this.f28127c = abstractC13582b.m4441l();
        }

        private C12557b(boolean z) {
            this.f28132x = (byte) -1;
            this.f28133y = -1;
            this.f28127c = AbstractC13570d.f29926c;
        }

        private C12557b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            this.f28132x = (byte) -1;
            this.f28133y = -1;
            m7784E();
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
                                    int m4493n = c13573e.m4493n();
                                    EnumC12560c m7755a = EnumC12560c.m7755a(m4493n);
                                    if (m7755a == null) {
                                        m4636J.m4590o0(m4516K);
                                        m4636J.m4590o0(m4493n);
                                    } else {
                                        this.f28128d |= 1;
                                        this.f28129e = m7755a;
                                    }
                                } else if (m4516K == 18) {
                                    C12561c mo4386b = (this.f28128d & 2) == 2 ? this.f28130f.mo4386b() : null;
                                    C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28130f = c12555q;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q);
                                        this.f28130f = mo4386b.m7727w();
                                    }
                                    this.f28128d |= 2;
                                } else if (m4516K != 24) {
                                    if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                    }
                                } else {
                                    this.f28128d |= 4;
                                    this.f28131w = c13573e.m4488s();
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
                        this.f28127c = m4542O.m4530I();
                        throw th2;
                    }
                    this.f28127c = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            }
            try {
                m4636J.m4637I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28127c = m4542O.m4530I();
                throw th3;
            }
            this.f28127c = m4542O.m4530I();
            mo4433m();
        }
    }

    private C12555q(AbstractC13580h.AbstractC13583c<C12555q, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28116J = (byte) -1;
        this.f28117K = -1;
        this.f28118d = abstractC13583c.m4441l();
    }

    private C12555q(boolean z) {
        this.f28116J = (byte) -1;
        this.f28117K = -1;
        this.f28118d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12555q(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        C12561c mo4386b;
        this.f28116J = (byte) -1;
        this.f28117K = -1;
        m7792x0();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int m4516K = c13573e.m4516K();
                    switch (m4516K) {
                        case 0:
                            break;
                        case 8:
                            this.f28119e |= 4096;
                            this.f28115I = c13573e.m4488s();
                            continue;
                        case 18:
                            if (!(z2 & true)) {
                                this.f28120f = new ArrayList();
                                z2 |= true;
                            }
                            this.f28120f.add(c13573e.m4486u(C12557b.f28125A, c13575f));
                            continue;
                        case 24:
                            this.f28119e |= 1;
                            this.f28121w = c13573e.m4496k();
                            continue;
                        case 32:
                            this.f28119e |= 2;
                            this.f28122x = c13573e.m4488s();
                            continue;
                        case 42:
                            mo4386b = (this.f28119e & 4) == 4 ? this.f28123y.mo4386b() : null;
                            C12555q c12555q = (C12555q) c13573e.m4486u(f28106M, c13575f);
                            this.f28123y = c12555q;
                            if (mo4386b != null) {
                                mo4386b.mo4440n(c12555q);
                                this.f28123y = mo4386b.m7727w();
                            }
                            this.f28119e |= 4;
                            continue;
                        case 48:
                            this.f28119e |= 16;
                            this.f28107A = c13573e.m4488s();
                            continue;
                        case 56:
                            this.f28119e |= 32;
                            this.f28108B = c13573e.m4488s();
                            continue;
                        case 64:
                            this.f28119e |= 8;
                            this.f28124z = c13573e.m4488s();
                            continue;
                        case 72:
                            this.f28119e |= 64;
                            this.f28109C = c13573e.m4488s();
                            continue;
                        case 82:
                            mo4386b = (this.f28119e & 256) == 256 ? this.f28111E.mo4386b() : null;
                            C12555q c12555q2 = (C12555q) c13573e.m4486u(f28106M, c13575f);
                            this.f28111E = c12555q2;
                            if (mo4386b != null) {
                                mo4386b.mo4440n(c12555q2);
                                this.f28111E = mo4386b.m7727w();
                            }
                            this.f28119e |= 256;
                            continue;
                        case 88:
                            this.f28119e |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                            this.f28112F = c13573e.m4488s();
                            continue;
                        case 96:
                            this.f28119e |= 128;
                            this.f28110D = c13573e.m4488s();
                            continue;
                        case 106:
                            mo4386b = (this.f28119e & 1024) == 1024 ? this.f28113G.mo4386b() : null;
                            C12555q c12555q3 = (C12555q) c13573e.m4486u(f28106M, c13575f);
                            this.f28113G = c12555q3;
                            if (mo4386b != null) {
                                mo4386b.mo4440n(c12555q3);
                                this.f28113G = mo4386b.m7727w();
                            }
                            this.f28119e |= 1024;
                            continue;
                        case 112:
                            this.f28119e |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                            this.f28114H = c13573e.m4488s();
                            continue;
                        default:
                            if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                break;
                            } else {
                                continue;
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
                if (z2 & true) {
                    this.f28120f = Collections.unmodifiableList(this.f28120f);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f28118d = m4542O.m4530I();
                    throw th2;
                }
                this.f28118d = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f28120f = Collections.unmodifiableList(this.f28120f);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f28118d = m4542O.m4530I();
            throw th3;
        }
        this.f28118d = m4542O.m4530I();
        mo4433m();
    }
}
