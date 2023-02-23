package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12580w;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13566b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13570d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.C13573e;
import kotlin.reflect.jvm.internal.impl.protobuf.C13575f;
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.c */
/* loaded from: classes3.dex */
public final class C12509c extends AbstractC13580h.AbstractC13584d<C12509c> implements Object {

    /* renamed from: T */
    private static final C12509c f27827T;

    /* renamed from: U */
    public static InterfaceC13604q<C12509c> f27828U = new C12510a();

    /* renamed from: A */
    private List<Integer> f27829A;

    /* renamed from: B */
    private int f27830B;

    /* renamed from: C */
    private List<Integer> f27831C;

    /* renamed from: D */
    private int f27832D;

    /* renamed from: E */
    private List<C12513d> f27833E;

    /* renamed from: F */
    private List<C12531i> f27834F;

    /* renamed from: G */
    private List<C12542n> f27835G;

    /* renamed from: H */
    private List<C12562r> f27836H;

    /* renamed from: I */
    private List<C12524g> f27837I;

    /* renamed from: J */
    private List<Integer> f27838J;

    /* renamed from: K */
    private int f27839K;

    /* renamed from: L */
    private int f27840L;

    /* renamed from: M */
    private C12555q f27841M;

    /* renamed from: N */
    private int f27842N;

    /* renamed from: O */
    private C12569t f27843O;

    /* renamed from: P */
    private List<Integer> f27844P;

    /* renamed from: Q */
    private C12580w f27845Q;

    /* renamed from: R */
    private byte f27846R;

    /* renamed from: S */
    private int f27847S;

    /* renamed from: d */
    private final AbstractC13570d f27848d;

    /* renamed from: e */
    private int f27849e;

    /* renamed from: f */
    private int f27850f;

    /* renamed from: w */
    private int f27851w;

    /* renamed from: x */
    private int f27852x;

    /* renamed from: y */
    private List<C12565s> f27853y;

    /* renamed from: z */
    private List<C12555q> f27854z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.c$a */
    /* loaded from: classes3.dex */
    static class C12510a extends AbstractC13566b<C12509c> {
        C12510a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12509c mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12509c(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.c$b */
    /* loaded from: classes3.dex */
    public static final class C12511b extends AbstractC13580h.AbstractC13583c<C12509c, C12511b> implements Object {

        /* renamed from: J */
        private int f27864J;

        /* renamed from: L */
        private int f27866L;

        /* renamed from: f */
        private int f27870f;

        /* renamed from: x */
        private int f27872x;

        /* renamed from: y */
        private int f27873y;

        /* renamed from: w */
        private int f27871w = 6;

        /* renamed from: z */
        private List<C12565s> f27874z = Collections.emptyList();

        /* renamed from: A */
        private List<C12555q> f27855A = Collections.emptyList();

        /* renamed from: B */
        private List<Integer> f27856B = Collections.emptyList();

        /* renamed from: C */
        private List<Integer> f27857C = Collections.emptyList();

        /* renamed from: D */
        private List<C12513d> f27858D = Collections.emptyList();

        /* renamed from: E */
        private List<C12531i> f27859E = Collections.emptyList();

        /* renamed from: F */
        private List<C12542n> f27860F = Collections.emptyList();

        /* renamed from: G */
        private List<C12562r> f27861G = Collections.emptyList();

        /* renamed from: H */
        private List<C12524g> f27862H = Collections.emptyList();

        /* renamed from: I */
        private List<Integer> f27863I = Collections.emptyList();

        /* renamed from: K */
        private C12555q f27865K = C12555q.m7817Y();

        /* renamed from: M */
        private C12569t f27867M = C12569t.m7591w();

        /* renamed from: N */
        private List<Integer> f27868N = Collections.emptyList();

        /* renamed from: O */
        private C12580w f27869O = C12580w.m7474u();

        private C12511b() {
            m8382i0();
        }

        /* renamed from: A */
        private void m8412A() {
            if ((this.f27870f & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 2048) {
                this.f27862H = new ArrayList(this.f27862H);
                this.f27870f |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
            }
        }

        /* renamed from: B */
        private void m8411B() {
            if ((this.f27870f & 256) != 256) {
                this.f27859E = new ArrayList(this.f27859E);
                this.f27870f |= 256;
            }
        }

        /* renamed from: C */
        private void m8410C() {
            if ((this.f27870f & 64) != 64) {
                this.f27857C = new ArrayList(this.f27857C);
                this.f27870f |= 64;
            }
        }

        /* renamed from: D */
        private void m8409D() {
            if ((this.f27870f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 512) {
                this.f27860F = new ArrayList(this.f27860F);
                this.f27870f |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            }
        }

        /* renamed from: E */
        private void m8408E() {
            if ((this.f27870f & 4096) != 4096) {
                this.f27863I = new ArrayList(this.f27863I);
                this.f27870f |= 4096;
            }
        }

        /* renamed from: F */
        private void m8407F() {
            if ((this.f27870f & 32) != 32) {
                this.f27856B = new ArrayList(this.f27856B);
                this.f27870f |= 32;
            }
        }

        /* renamed from: G */
        private void m8406G() {
            if ((this.f27870f & 16) != 16) {
                this.f27855A = new ArrayList(this.f27855A);
                this.f27870f |= 16;
            }
        }

        /* renamed from: H */
        private void m8405H() {
            if ((this.f27870f & 1024) != 1024) {
                this.f27861G = new ArrayList(this.f27861G);
                this.f27870f |= 1024;
            }
        }

        /* renamed from: I */
        private void m8404I() {
            if ((this.f27870f & 8) != 8) {
                this.f27874z = new ArrayList(this.f27874z);
                this.f27870f |= 8;
            }
        }

        /* renamed from: K */
        private void m8403K() {
            if ((this.f27870f & 131072) != 131072) {
                this.f27868N = new ArrayList(this.f27868N);
                this.f27870f |= 131072;
            }
        }

        /* renamed from: i0 */
        private void m8382i0() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12511b m8367y() {
            return new C12511b();
        }

        /* renamed from: z */
        private void m8366z() {
            if ((this.f27870f & 128) != 128) {
                this.f27858D = new ArrayList(this.f27858D);
                this.f27870f |= 128;
            }
        }

        /* renamed from: L */
        public C12513d m8402L(int i) {
            return this.f27858D.get(i);
        }

        /* renamed from: M */
        public int m8401M() {
            return this.f27858D.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: N */
        public C12509c mo4442k() {
            return C12509c.m8428l0();
        }

        /* renamed from: O */
        public C12524g m8399O(int i) {
            return this.f27862H.get(i);
        }

        /* renamed from: P */
        public int m8398P() {
            return this.f27862H.size();
        }

        /* renamed from: Q */
        public C12531i m8397Q(int i) {
            return this.f27859E.get(i);
        }

        /* renamed from: R */
        public int m8396R() {
            return this.f27859E.size();
        }

        /* renamed from: S */
        public C12555q m8395S() {
            return this.f27865K;
        }

        /* renamed from: T */
        public C12542n m8394T(int i) {
            return this.f27860F.get(i);
        }

        /* renamed from: U */
        public int m8393U() {
            return this.f27860F.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8380l0(c13573e, c13575f);
            return this;
        }

        /* renamed from: W */
        public C12555q m8392W(int i) {
            return this.f27855A.get(i);
        }

        /* renamed from: X */
        public int m8391X() {
            return this.f27855A.size();
        }

        /* renamed from: Y */
        public C12562r m8390Y(int i) {
            return this.f27861G.get(i);
        }

        /* renamed from: a0 */
        public int m8389a0() {
            return this.f27861G.size();
        }

        /* renamed from: b0 */
        public C12565s m8388b0(int i) {
            return this.f27874z.get(i);
        }

        /* renamed from: c0 */
        public int m8387c0() {
            return this.f27874z.size();
        }

        /* renamed from: d0 */
        public C12569t m8386d0() {
            return this.f27867M;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8380l0(c13573e, c13575f);
            return this;
        }

        /* renamed from: e0 */
        public boolean m8385e0() {
            return (this.f27870f & 2) == 2;
        }

        /* renamed from: f0 */
        public boolean m8384f0() {
            return (this.f27870f & 16384) == 16384;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m8385e0()) {
                for (int i = 0; i < m8387c0(); i++) {
                    if (!m8388b0(i).mo4379h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < m8391X(); i2++) {
                    if (!m8392W(i2).mo4379h()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < m8401M(); i3++) {
                    if (!m8402L(i3).mo4379h()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < m8396R(); i4++) {
                    if (!m8397Q(i4).mo4379h()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < m8393U(); i5++) {
                    if (!m8394T(i5).mo4379h()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < m8389a0(); i6++) {
                    if (!m8390Y(i6).mo4379h()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < m8398P(); i7++) {
                    if (!m8399O(i7).mo4379h()) {
                        return false;
                    }
                }
                if (!m8384f0() || m8395S().mo4379h()) {
                    return (!m8383h0() || m8386d0().mo4379h()) && m4435s();
                }
                return false;
            }
            return false;
        }

        /* renamed from: h0 */
        public boolean m8383h0() {
            return (this.f27870f & 65536) == 65536;
        }

        /* renamed from: j0 */
        public C12511b m8381j0(C12509c c12509c) {
            if (c12509c == C12509c.m8428l0()) {
                return this;
            }
            if (c12509c.m8459R0()) {
                m8375q0(c12509c.m8423q0());
            }
            if (c12509c.m8457S0()) {
                m8374r0(c12509c.m8422r0());
            }
            if (c12509c.m8461Q0()) {
                m8376p0(c12509c.m8432h0());
            }
            if (!c12509c.f27853y.isEmpty()) {
                if (this.f27874z.isEmpty()) {
                    this.f27874z = c12509c.f27853y;
                    this.f27870f &= -9;
                } else {
                    m8404I();
                    this.f27874z.addAll(c12509c.f27853y);
                }
            }
            if (!c12509c.f27854z.isEmpty()) {
                if (this.f27855A.isEmpty()) {
                    this.f27855A = c12509c.f27854z;
                    this.f27870f &= -17;
                } else {
                    m8406G();
                    this.f27855A.addAll(c12509c.f27854z);
                }
            }
            if (!c12509c.f27829A.isEmpty()) {
                if (this.f27856B.isEmpty()) {
                    this.f27856B = c12509c.f27829A;
                    this.f27870f &= -33;
                } else {
                    m8407F();
                    this.f27856B.addAll(c12509c.f27829A);
                }
            }
            if (!c12509c.f27831C.isEmpty()) {
                if (this.f27857C.isEmpty()) {
                    this.f27857C = c12509c.f27831C;
                    this.f27870f &= -65;
                } else {
                    m8410C();
                    this.f27857C.addAll(c12509c.f27831C);
                }
            }
            if (!c12509c.f27833E.isEmpty()) {
                if (this.f27858D.isEmpty()) {
                    this.f27858D = c12509c.f27833E;
                    this.f27870f &= -129;
                } else {
                    m8366z();
                    this.f27858D.addAll(c12509c.f27833E);
                }
            }
            if (!c12509c.f27834F.isEmpty()) {
                if (this.f27859E.isEmpty()) {
                    this.f27859E = c12509c.f27834F;
                    this.f27870f &= -257;
                } else {
                    m8411B();
                    this.f27859E.addAll(c12509c.f27834F);
                }
            }
            if (!c12509c.f27835G.isEmpty()) {
                if (this.f27860F.isEmpty()) {
                    this.f27860F = c12509c.f27835G;
                    this.f27870f &= -513;
                } else {
                    m8409D();
                    this.f27860F.addAll(c12509c.f27835G);
                }
            }
            if (!c12509c.f27836H.isEmpty()) {
                if (this.f27861G.isEmpty()) {
                    this.f27861G = c12509c.f27836H;
                    this.f27870f &= -1025;
                } else {
                    m8405H();
                    this.f27861G.addAll(c12509c.f27836H);
                }
            }
            if (!c12509c.f27837I.isEmpty()) {
                if (this.f27862H.isEmpty()) {
                    this.f27862H = c12509c.f27837I;
                    this.f27870f &= -2049;
                } else {
                    m8412A();
                    this.f27862H.addAll(c12509c.f27837I);
                }
            }
            if (!c12509c.f27838J.isEmpty()) {
                if (this.f27863I.isEmpty()) {
                    this.f27863I = c12509c.f27838J;
                    this.f27870f &= -4097;
                } else {
                    m8408E();
                    this.f27863I.addAll(c12509c.f27838J);
                }
            }
            if (c12509c.m8455T0()) {
                m8373s0(c12509c.m8418v0());
            }
            if (c12509c.m8453U0()) {
                m8379m0(c12509c.m8417w0());
            }
            if (c12509c.m8452V0()) {
                m8372t0(c12509c.m8416x0());
            }
            if (c12509c.m8450W0()) {
                m8378n0(c12509c.m8467N0());
            }
            if (!c12509c.f27844P.isEmpty()) {
                if (this.f27868N.isEmpty()) {
                    this.f27868N = c12509c.f27844P;
                    this.f27870f &= -131073;
                } else {
                    m8403K();
                    this.f27868N.addAll(c12509c.f27844P);
                }
            }
            if (c12509c.m8448X0()) {
                m8377o0(c12509c.m8463P0());
            }
            m4434t(c12509c);
            m4439o(m4441l().m4538e(c12509c.f27848d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: l0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c.C12511b m8380l0(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.c> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c.f27828U     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.c r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8381j0(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.c r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8381j0(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c.C12511b.m8380l0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.c$b");
        }

        /* renamed from: m0 */
        public C12511b m8379m0(C12555q c12555q) {
            if ((this.f27870f & 16384) == 16384 && this.f27865K != C12555q.m7817Y()) {
                this.f27865K = C12555q.m7790z0(this.f27865K).mo4440n(c12555q).m7727w();
            } else {
                this.f27865K = c12555q;
            }
            this.f27870f |= 16384;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ AbstractC13580h.AbstractC13582b mo4440n(AbstractC13580h abstractC13580h) {
            m8381j0((C12509c) abstractC13580h);
            return this;
        }

        /* renamed from: n0 */
        public C12511b m8378n0(C12569t c12569t) {
            if ((this.f27870f & 65536) == 65536 && this.f27867M != C12569t.m7591w()) {
                C12569t.C12571b m7599F = C12569t.m7599F(this.f27867M);
                m7599F.m7574z(c12569t);
                this.f27867M = m7599F.m7582r();
            } else {
                this.f27867M = c12569t;
            }
            this.f27870f |= 65536;
            return this;
        }

        /* renamed from: o0 */
        public C12511b m8377o0(C12580w c12580w) {
            if ((this.f27870f & 262144) == 262144 && this.f27869O != C12580w.m7474u()) {
                C12580w.C12582b m7480A = C12580w.m7480A(this.f27869O);
                m7480A.m7459x(c12580w);
                this.f27869O = m7480A.m7465r();
            } else {
                this.f27869O = c12580w;
            }
            this.f27870f |= 262144;
            return this;
        }

        /* renamed from: p0 */
        public C12511b m8376p0(int i) {
            this.f27870f |= 4;
            this.f27873y = i;
            return this;
        }

        /* renamed from: q0 */
        public C12511b m8375q0(int i) {
            this.f27870f |= 1;
            this.f27871w = i;
            return this;
        }

        /* renamed from: r0 */
        public C12511b m8374r0(int i) {
            this.f27870f |= 2;
            this.f27872x = i;
            return this;
        }

        /* renamed from: s0 */
        public C12511b m8373s0(int i) {
            this.f27870f |= 8192;
            this.f27864J = i;
            return this;
        }

        /* renamed from: t0 */
        public C12511b m8372t0(int i) {
            this.f27870f |= 32768;
            this.f27866L = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12509c build() {
            C12509c m8369w = m8369w();
            if (m8369w.mo4379h()) {
                return m8369w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8369w);
        }

        /* renamed from: w */
        public C12509c m8369w() {
            C12509c c12509c = new C12509c(this);
            int i = this.f27870f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12509c.f27850f = this.f27871w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12509c.f27851w = this.f27872x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12509c.f27852x = this.f27873y;
            if ((this.f27870f & 8) == 8) {
                this.f27874z = Collections.unmodifiableList(this.f27874z);
                this.f27870f &= -9;
            }
            c12509c.f27853y = this.f27874z;
            if ((this.f27870f & 16) == 16) {
                this.f27855A = Collections.unmodifiableList(this.f27855A);
                this.f27870f &= -17;
            }
            c12509c.f27854z = this.f27855A;
            if ((this.f27870f & 32) == 32) {
                this.f27856B = Collections.unmodifiableList(this.f27856B);
                this.f27870f &= -33;
            }
            c12509c.f27829A = this.f27856B;
            if ((this.f27870f & 64) == 64) {
                this.f27857C = Collections.unmodifiableList(this.f27857C);
                this.f27870f &= -65;
            }
            c12509c.f27831C = this.f27857C;
            if ((this.f27870f & 128) == 128) {
                this.f27858D = Collections.unmodifiableList(this.f27858D);
                this.f27870f &= -129;
            }
            c12509c.f27833E = this.f27858D;
            if ((this.f27870f & 256) == 256) {
                this.f27859E = Collections.unmodifiableList(this.f27859E);
                this.f27870f &= -257;
            }
            c12509c.f27834F = this.f27859E;
            if ((this.f27870f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                this.f27860F = Collections.unmodifiableList(this.f27860F);
                this.f27870f &= -513;
            }
            c12509c.f27835G = this.f27860F;
            if ((this.f27870f & 1024) == 1024) {
                this.f27861G = Collections.unmodifiableList(this.f27861G);
                this.f27870f &= -1025;
            }
            c12509c.f27836H = this.f27861G;
            if ((this.f27870f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                this.f27862H = Collections.unmodifiableList(this.f27862H);
                this.f27870f &= -2049;
            }
            c12509c.f27837I = this.f27862H;
            if ((this.f27870f & 4096) == 4096) {
                this.f27863I = Collections.unmodifiableList(this.f27863I);
                this.f27870f &= -4097;
            }
            c12509c.f27838J = this.f27863I;
            if ((i & 8192) == 8192) {
                i2 |= 8;
            }
            c12509c.f27840L = this.f27864J;
            if ((i & 16384) == 16384) {
                i2 |= 16;
            }
            c12509c.f27841M = this.f27865K;
            if ((i & 32768) == 32768) {
                i2 |= 32;
            }
            c12509c.f27842N = this.f27866L;
            if ((i & 65536) == 65536) {
                i2 |= 64;
            }
            c12509c.f27843O = this.f27867M;
            if ((this.f27870f & 131072) == 131072) {
                this.f27868N = Collections.unmodifiableList(this.f27868N);
                this.f27870f &= -131073;
            }
            c12509c.f27844P = this.f27868N;
            if ((i & 262144) == 262144) {
                i2 |= 128;
            }
            c12509c.f27845Q = this.f27869O;
            c12509c.f27849e = i2;
            return c12509c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12511b mo4443j() {
            C12511b m8367y = m8367y();
            m8367y.m8381j0(m8369w());
            return m8367y;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.c$c */
    /* loaded from: classes3.dex */
    public enum EnumC12512c implements C13588i.InterfaceC13589a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: c */
        private final int f27883c;

        EnumC12512c(int i, int i2) {
            this.f27883c = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f27883c;
        }
    }

    static {
        C12509c c12509c = new C12509c(true);
        f27827T = c12509c;
        c12509c.m8446Y0();
    }

    /* renamed from: Y0 */
    private void m8446Y0() {
        this.f27850f = 6;
        this.f27851w = 0;
        this.f27852x = 0;
        this.f27853y = Collections.emptyList();
        this.f27854z = Collections.emptyList();
        this.f27829A = Collections.emptyList();
        this.f27831C = Collections.emptyList();
        this.f27833E = Collections.emptyList();
        this.f27834F = Collections.emptyList();
        this.f27835G = Collections.emptyList();
        this.f27836H = Collections.emptyList();
        this.f27837I = Collections.emptyList();
        this.f27838J = Collections.emptyList();
        this.f27840L = 0;
        this.f27841M = C12555q.m7817Y();
        this.f27842N = 0;
        this.f27843O = C12569t.m7591w();
        this.f27844P = Collections.emptyList();
        this.f27845Q = C12580w.m7474u();
    }

    /* renamed from: Z0 */
    public static C12511b m8444Z0() {
        return C12511b.m8367y();
    }

    /* renamed from: a1 */
    public static C12511b m8442a1(C12509c c12509c) {
        C12511b m8444Z0 = m8444Z0();
        m8444Z0.m8381j0(c12509c);
        return m8444Z0;
    }

    /* renamed from: c1 */
    public static C12509c m8438c1(InputStream inputStream, C13575f c13575f) throws IOException {
        return f27828U.mo4378a(inputStream, c13575f);
    }

    /* renamed from: l0 */
    public static C12509c m8428l0() {
        return f27827T;
    }

    /* renamed from: A0 */
    public int m8493A0() {
        return this.f27835G.size();
    }

    /* renamed from: B0 */
    public List<C12542n> m8491B0() {
        return this.f27835G;
    }

    /* renamed from: C0 */
    public List<Integer> m8489C0() {
        return this.f27838J;
    }

    /* renamed from: D0 */
    public C12555q m8487D0(int i) {
        return this.f27854z.get(i);
    }

    /* renamed from: E0 */
    public int m8485E0() {
        return this.f27854z.size();
    }

    /* renamed from: F0 */
    public List<Integer> m8483F0() {
        return this.f27829A;
    }

    /* renamed from: G0 */
    public List<C12555q> m8481G0() {
        return this.f27854z;
    }

    /* renamed from: H0 */
    public C12562r m8479H0(int i) {
        return this.f27836H.get(i);
    }

    /* renamed from: I0 */
    public int m8477I0() {
        return this.f27836H.size();
    }

    /* renamed from: J0 */
    public List<C12562r> m8475J0() {
        return this.f27836H;
    }

    /* renamed from: K0 */
    public C12565s m8473K0(int i) {
        return this.f27853y.get(i);
    }

    /* renamed from: L0 */
    public int m8471L0() {
        return this.f27853y.size();
    }

    /* renamed from: M0 */
    public List<C12565s> m8469M0() {
        return this.f27853y;
    }

    /* renamed from: N0 */
    public C12569t m8467N0() {
        return this.f27843O;
    }

    /* renamed from: O0 */
    public List<Integer> m8465O0() {
        return this.f27844P;
    }

    /* renamed from: P0 */
    public C12580w m8463P0() {
        return this.f27845Q;
    }

    /* renamed from: Q0 */
    public boolean m8461Q0() {
        return (this.f27849e & 4) == 4;
    }

    /* renamed from: R0 */
    public boolean m8459R0() {
        return (this.f27849e & 1) == 1;
    }

    /* renamed from: S0 */
    public boolean m8457S0() {
        return (this.f27849e & 2) == 2;
    }

    /* renamed from: T0 */
    public boolean m8455T0() {
        return (this.f27849e & 8) == 8;
    }

    /* renamed from: U0 */
    public boolean m8453U0() {
        return (this.f27849e & 16) == 16;
    }

    /* renamed from: V0 */
    public boolean m8452V0() {
        return (this.f27849e & 32) == 32;
    }

    /* renamed from: W0 */
    public boolean m8450W0() {
        return (this.f27849e & 64) == 64;
    }

    /* renamed from: X0 */
    public boolean m8448X0() {
        return (this.f27849e & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: b1 */
    public C12511b mo4383f() {
        return m8444Z0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f27849e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f27850f);
        }
        if (m8483F0().size() > 0) {
            codedOutputStream.m4590o0(18);
            codedOutputStream.m4590o0(this.f27830B);
        }
        for (int i = 0; i < this.f27829A.size(); i++) {
            codedOutputStream.m4616b0(this.f27829A.get(i).intValue());
        }
        if ((this.f27849e & 2) == 2) {
            codedOutputStream.m4618a0(3, this.f27851w);
        }
        if ((this.f27849e & 4) == 4) {
            codedOutputStream.m4618a0(4, this.f27852x);
        }
        for (int i2 = 0; i2 < this.f27853y.size(); i2++) {
            codedOutputStream.m4612d0(5, this.f27853y.get(i2));
        }
        for (int i3 = 0; i3 < this.f27854z.size(); i3++) {
            codedOutputStream.m4612d0(6, this.f27854z.get(i3));
        }
        if (m8415y0().size() > 0) {
            codedOutputStream.m4590o0(58);
            codedOutputStream.m4590o0(this.f27832D);
        }
        for (int i4 = 0; i4 < this.f27831C.size(); i4++) {
            codedOutputStream.m4616b0(this.f27831C.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f27833E.size(); i5++) {
            codedOutputStream.m4612d0(8, this.f27833E.get(i5));
        }
        for (int i6 = 0; i6 < this.f27834F.size(); i6++) {
            codedOutputStream.m4612d0(9, this.f27834F.get(i6));
        }
        for (int i7 = 0; i7 < this.f27835G.size(); i7++) {
            codedOutputStream.m4612d0(10, this.f27835G.get(i7));
        }
        for (int i8 = 0; i8 < this.f27836H.size(); i8++) {
            codedOutputStream.m4612d0(11, this.f27836H.get(i8));
        }
        for (int i9 = 0; i9 < this.f27837I.size(); i9++) {
            codedOutputStream.m4612d0(13, this.f27837I.get(i9));
        }
        if (m8489C0().size() > 0) {
            codedOutputStream.m4590o0(130);
            codedOutputStream.m4590o0(this.f27839K);
        }
        for (int i10 = 0; i10 < this.f27838J.size(); i10++) {
            codedOutputStream.m4616b0(this.f27838J.get(i10).intValue());
        }
        if ((this.f27849e & 8) == 8) {
            codedOutputStream.m4618a0(17, this.f27840L);
        }
        if ((this.f27849e & 16) == 16) {
            codedOutputStream.m4612d0(18, this.f27841M);
        }
        if ((this.f27849e & 32) == 32) {
            codedOutputStream.m4618a0(19, this.f27842N);
        }
        if ((this.f27849e & 64) == 64) {
            codedOutputStream.m4612d0(30, this.f27843O);
        }
        for (int i11 = 0; i11 < this.f27844P.size(); i11++) {
            codedOutputStream.m4618a0(31, this.f27844P.get(i11).intValue());
        }
        if ((this.f27849e & 128) == 128) {
            codedOutputStream.m4612d0(32, this.f27845Q);
        }
        m4424y.m4422a(19000, codedOutputStream);
        codedOutputStream.m4602i0(this.f27848d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27847S;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f27849e & 1) == 1 ? CodedOutputStream.m4591o(1, this.f27850f) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27829A.size(); i3++) {
            i2 += CodedOutputStream.m4589p(this.f27829A.get(i3).intValue());
        }
        int i4 = m4591o + i2;
        if (!m8483F0().isEmpty()) {
            i4 = i4 + 1 + CodedOutputStream.m4589p(i2);
        }
        this.f27830B = i2;
        if ((this.f27849e & 2) == 2) {
            i4 += CodedOutputStream.m4591o(3, this.f27851w);
        }
        if ((this.f27849e & 4) == 4) {
            i4 += CodedOutputStream.m4591o(4, this.f27852x);
        }
        for (int i5 = 0; i5 < this.f27853y.size(); i5++) {
            i4 += CodedOutputStream.m4583s(5, this.f27853y.get(i5));
        }
        for (int i6 = 0; i6 < this.f27854z.size(); i6++) {
            i4 += CodedOutputStream.m4583s(6, this.f27854z.get(i6));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f27831C.size(); i8++) {
            i7 += CodedOutputStream.m4589p(this.f27831C.get(i8).intValue());
        }
        int i9 = i4 + i7;
        if (!m8415y0().isEmpty()) {
            i9 = i9 + 1 + CodedOutputStream.m4589p(i7);
        }
        this.f27832D = i7;
        for (int i10 = 0; i10 < this.f27833E.size(); i10++) {
            i9 += CodedOutputStream.m4583s(8, this.f27833E.get(i10));
        }
        for (int i11 = 0; i11 < this.f27834F.size(); i11++) {
            i9 += CodedOutputStream.m4583s(9, this.f27834F.get(i11));
        }
        for (int i12 = 0; i12 < this.f27835G.size(); i12++) {
            i9 += CodedOutputStream.m4583s(10, this.f27835G.get(i12));
        }
        for (int i13 = 0; i13 < this.f27836H.size(); i13++) {
            i9 += CodedOutputStream.m4583s(11, this.f27836H.get(i13));
        }
        for (int i14 = 0; i14 < this.f27837I.size(); i14++) {
            i9 += CodedOutputStream.m4583s(13, this.f27837I.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f27838J.size(); i16++) {
            i15 += CodedOutputStream.m4589p(this.f27838J.get(i16).intValue());
        }
        int i17 = i9 + i15;
        if (!m8489C0().isEmpty()) {
            i17 = i17 + 2 + CodedOutputStream.m4589p(i15);
        }
        this.f27839K = i15;
        if ((this.f27849e & 8) == 8) {
            i17 += CodedOutputStream.m4591o(17, this.f27840L);
        }
        if ((this.f27849e & 16) == 16) {
            i17 += CodedOutputStream.m4583s(18, this.f27841M);
        }
        if ((this.f27849e & 32) == 32) {
            i17 += CodedOutputStream.m4591o(19, this.f27842N);
        }
        if ((this.f27849e & 64) == 64) {
            i17 += CodedOutputStream.m4583s(30, this.f27843O);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f27844P.size(); i19++) {
            i18 += CodedOutputStream.m4589p(this.f27844P.get(i19).intValue());
        }
        int size = i17 + i18 + (m8465O0().size() * 2);
        if ((this.f27849e & 128) == 128) {
            size += CodedOutputStream.m4583s(32, this.f27845Q);
        }
        int m4429t = size + m4429t() + this.f27848d.size();
        this.f27847S = m4429t;
        return m4429t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d1 */
    public C12511b mo4386b() {
        return m8442a1(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12509c> mo4382g() {
        return f27828U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27846R;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m8457S0()) {
            this.f27846R = (byte) 0;
            return false;
        }
        for (int i = 0; i < m8471L0(); i++) {
            if (!m8473K0(i).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m8485E0(); i2++) {
            if (!m8487D0(i2).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < m8430j0(); i3++) {
            if (!m8431i0(i3).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < m8420t0(); i4++) {
            if (!m8421s0(i4).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < m8493A0(); i5++) {
            if (!m8414z0(i5).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < m8477I0(); i6++) {
            if (!m8479H0(i6).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < m8425o0(); i7++) {
            if (!m8426n0(i7).mo4379h()) {
                this.f27846R = (byte) 0;
                return false;
            }
        }
        if (m8453U0() && !m8417w0().mo4379h()) {
            this.f27846R = (byte) 0;
            return false;
        } else if (m8450W0() && !m8467N0().mo4379h()) {
            this.f27846R = (byte) 0;
            return false;
        } else if (!m4430s()) {
            this.f27846R = (byte) 0;
            return false;
        } else {
            this.f27846R = (byte) 1;
            return true;
        }
    }

    /* renamed from: h0 */
    public int m8432h0() {
        return this.f27852x;
    }

    /* renamed from: i0 */
    public C12513d m8431i0(int i) {
        return this.f27833E.get(i);
    }

    /* renamed from: j0 */
    public int m8430j0() {
        return this.f27833E.size();
    }

    /* renamed from: k0 */
    public List<C12513d> m8429k0() {
        return this.f27833E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: m0 */
    public C12509c mo4380a() {
        return f27827T;
    }

    /* renamed from: n0 */
    public C12524g m8426n0(int i) {
        return this.f27837I.get(i);
    }

    /* renamed from: o0 */
    public int m8425o0() {
        return this.f27837I.size();
    }

    /* renamed from: p0 */
    public List<C12524g> m8424p0() {
        return this.f27837I;
    }

    /* renamed from: q0 */
    public int m8423q0() {
        return this.f27850f;
    }

    /* renamed from: r0 */
    public int m8422r0() {
        return this.f27851w;
    }

    /* renamed from: s0 */
    public C12531i m8421s0(int i) {
        return this.f27834F.get(i);
    }

    /* renamed from: t0 */
    public int m8420t0() {
        return this.f27834F.size();
    }

    /* renamed from: u0 */
    public List<C12531i> m8419u0() {
        return this.f27834F;
    }

    /* renamed from: v0 */
    public int m8418v0() {
        return this.f27840L;
    }

    /* renamed from: w0 */
    public C12555q m8417w0() {
        return this.f27841M;
    }

    /* renamed from: x0 */
    public int m8416x0() {
        return this.f27842N;
    }

    /* renamed from: y0 */
    public List<Integer> m8415y0() {
        return this.f27831C;
    }

    /* renamed from: z0 */
    public C12542n m8414z0(int i) {
        return this.f27835G.get(i);
    }

    private C12509c(AbstractC13580h.AbstractC13583c<C12509c, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f27830B = -1;
        this.f27832D = -1;
        this.f27839K = -1;
        this.f27846R = (byte) -1;
        this.f27847S = -1;
        this.f27848d = abstractC13583c.m4441l();
    }

    private C12509c(boolean z) {
        this.f27830B = -1;
        this.f27832D = -1;
        this.f27839K = -1;
        this.f27846R = (byte) -1;
        this.f27847S = -1;
        this.f27848d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12509c(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27830B = -1;
        this.f27832D = -1;
        this.f27839K = -1;
        this.f27846R = (byte) -1;
        this.f27847S = -1;
        m8446Y0();
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
                            z = true;
                            break;
                        case 8:
                            this.f27849e |= 1;
                            this.f27850f = c13573e.m4488s();
                            break;
                        case 16:
                            if (!(z2 & true)) {
                                this.f27829A = new ArrayList();
                                z2 |= true;
                            }
                            this.f27829A.add(Integer.valueOf(c13573e.m4488s()));
                            break;
                        case 18:
                            int m4497j = c13573e.m4497j(c13573e.m4526A());
                            if (!(z2 & true) && c13573e.m4502e() > 0) {
                                this.f27829A = new ArrayList();
                                z2 |= true;
                            }
                            while (c13573e.m4502e() > 0) {
                                this.f27829A.add(Integer.valueOf(c13573e.m4488s()));
                            }
                            c13573e.m4498i(m4497j);
                            break;
                        case 24:
                            this.f27849e |= 2;
                            this.f27851w = c13573e.m4488s();
                            break;
                        case 32:
                            this.f27849e |= 4;
                            this.f27852x = c13573e.m4488s();
                            break;
                        case 42:
                            if (!(z2 & true)) {
                                this.f27853y = new ArrayList();
                                z2 |= true;
                            }
                            this.f27853y.add(c13573e.m4486u(C12565s.f28185F, c13575f));
                            break;
                        case 50:
                            if (!(z2 & true)) {
                                this.f27854z = new ArrayList();
                                z2 |= true;
                            }
                            this.f27854z.add(c13573e.m4486u(C12555q.f28106M, c13575f));
                            break;
                        case 56:
                            if (!(z2 & true)) {
                                this.f27831C = new ArrayList();
                                z2 |= true;
                            }
                            this.f27831C.add(Integer.valueOf(c13573e.m4488s()));
                            break;
                        case 58:
                            int m4497j2 = c13573e.m4497j(c13573e.m4526A());
                            if (!(z2 & true) && c13573e.m4502e() > 0) {
                                this.f27831C = new ArrayList();
                                z2 |= true;
                            }
                            while (c13573e.m4502e() > 0) {
                                this.f27831C.add(Integer.valueOf(c13573e.m4488s()));
                            }
                            c13573e.m4498i(m4497j2);
                            break;
                        case 66:
                            if (!(z2 & true)) {
                                this.f27833E = new ArrayList();
                                z2 |= true;
                            }
                            this.f27833E.add(c13573e.m4486u(C12513d.f27885B, c13575f));
                            break;
                        case 74:
                            if (!(z2 & true)) {
                                this.f27834F = new ArrayList();
                                z2 |= true;
                            }
                            this.f27834F.add(c13573e.m4486u(C12531i.f27966K, c13575f));
                            break;
                        case 82:
                            if (!(z2 & true)) {
                                this.f27835G = new ArrayList();
                                z2 |= true;
                            }
                            this.f27835G.add(c13573e.m4486u(C12542n.f28041K, c13575f));
                            break;
                        case 90:
                            if (!(z2 & true)) {
                                this.f27836H = new ArrayList();
                                z2 |= true;
                            }
                            this.f27836H.add(c13573e.m4486u(C12562r.f28160H, c13575f));
                            break;
                        case 106:
                            if (!(z2 & true)) {
                                this.f27837I = new ArrayList();
                                z2 |= true;
                            }
                            this.f27837I.add(c13573e.m4486u(C12524g.f27931z, c13575f));
                            break;
                        case 128:
                            if (!(z2 & true)) {
                                this.f27838J = new ArrayList();
                                z2 |= true;
                            }
                            this.f27838J.add(Integer.valueOf(c13573e.m4488s()));
                            break;
                        case 130:
                            int m4497j3 = c13573e.m4497j(c13573e.m4526A());
                            if (!(z2 & true) && c13573e.m4502e() > 0) {
                                this.f27838J = new ArrayList();
                                z2 |= true;
                            }
                            while (c13573e.m4502e() > 0) {
                                this.f27838J.add(Integer.valueOf(c13573e.m4488s()));
                            }
                            c13573e.m4498i(m4497j3);
                            break;
                        case 136:
                            this.f27849e |= 8;
                            this.f27840L = c13573e.m4488s();
                            break;
                        case 146:
                            C12555q.C12561c mo4386b = (this.f27849e & 16) == 16 ? this.f27841M.mo4386b() : null;
                            C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                            this.f27841M = c12555q;
                            if (mo4386b != null) {
                                mo4386b.mo4440n(c12555q);
                                this.f27841M = mo4386b.m7727w();
                            }
                            this.f27849e |= 16;
                            break;
                        case 152:
                            this.f27849e |= 32;
                            this.f27842N = c13573e.m4488s();
                            break;
                        case 242:
                            C12569t.C12571b mo4386b2 = (this.f27849e & 64) == 64 ? this.f27843O.mo4386b() : null;
                            C12569t c12569t = (C12569t) c13573e.m4486u(C12569t.f28210z, c13575f);
                            this.f27843O = c12569t;
                            if (mo4386b2 != null) {
                                mo4386b2.m7574z(c12569t);
                                this.f27843O = mo4386b2.m7582r();
                            }
                            this.f27849e |= 64;
                            break;
                        case 248:
                            if (!(z2 & true)) {
                                this.f27844P = new ArrayList();
                                z2 |= true;
                            }
                            this.f27844P.add(Integer.valueOf(c13573e.m4488s()));
                            break;
                        case 250:
                            int m4497j4 = c13573e.m4497j(c13573e.m4526A());
                            if (!(z2 & true) && c13573e.m4502e() > 0) {
                                this.f27844P = new ArrayList();
                                z2 |= true;
                            }
                            while (c13573e.m4502e() > 0) {
                                this.f27844P.add(Integer.valueOf(c13573e.m4488s()));
                            }
                            c13573e.m4498i(m4497j4);
                            break;
                        case 258:
                            C12580w.C12582b mo4386b3 = (this.f27849e & 128) == 128 ? this.f27845Q.mo4386b() : null;
                            C12580w c12580w = (C12580w) c13573e.m4486u(C12580w.f28269x, c13575f);
                            this.f27845Q = c12580w;
                            if (mo4386b3 != null) {
                                mo4386b3.m7459x(c12580w);
                                this.f27845Q = mo4386b3.m7465r();
                            }
                            this.f27849e |= 128;
                            break;
                        default:
                            if (mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f27829A = Collections.unmodifiableList(this.f27829A);
                    }
                    if (z2 & true) {
                        this.f27853y = Collections.unmodifiableList(this.f27853y);
                    }
                    if (z2 & true) {
                        this.f27854z = Collections.unmodifiableList(this.f27854z);
                    }
                    if (z2 & true) {
                        this.f27831C = Collections.unmodifiableList(this.f27831C);
                    }
                    if (z2 & true) {
                        this.f27833E = Collections.unmodifiableList(this.f27833E);
                    }
                    if (z2 & true) {
                        this.f27834F = Collections.unmodifiableList(this.f27834F);
                    }
                    if (z2 & true) {
                        this.f27835G = Collections.unmodifiableList(this.f27835G);
                    }
                    if (z2 & true) {
                        this.f27836H = Collections.unmodifiableList(this.f27836H);
                    }
                    if (z2 & true) {
                        this.f27837I = Collections.unmodifiableList(this.f27837I);
                    }
                    if (z2 & true) {
                        this.f27838J = Collections.unmodifiableList(this.f27838J);
                    }
                    if (z2 & true) {
                        this.f27844P = Collections.unmodifiableList(this.f27844P);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27848d = m4542O.m4530I();
                        throw th2;
                    }
                    this.f27848d = m4542O.m4530I();
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
            this.f27829A = Collections.unmodifiableList(this.f27829A);
        }
        if (z2 & true) {
            this.f27853y = Collections.unmodifiableList(this.f27853y);
        }
        if (z2 & true) {
            this.f27854z = Collections.unmodifiableList(this.f27854z);
        }
        if (z2 & true) {
            this.f27831C = Collections.unmodifiableList(this.f27831C);
        }
        if (z2 & true) {
            this.f27833E = Collections.unmodifiableList(this.f27833E);
        }
        if (z2 & true) {
            this.f27834F = Collections.unmodifiableList(this.f27834F);
        }
        if (z2 & true) {
            this.f27835G = Collections.unmodifiableList(this.f27835G);
        }
        if (z2 & true) {
            this.f27836H = Collections.unmodifiableList(this.f27836H);
        }
        if (z2 & true) {
            this.f27837I = Collections.unmodifiableList(this.f27837I);
        }
        if (z2 & true) {
            this.f27838J = Collections.unmodifiableList(this.f27838J);
        }
        if (z2 & true) {
            this.f27844P = Collections.unmodifiableList(this.f27844P);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27848d = m4542O.m4530I();
            throw th3;
        }
        this.f27848d = m4542O.m4530I();
        mo4433m();
    }
}
