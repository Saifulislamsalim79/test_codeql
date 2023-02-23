package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12516e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12569t;
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
/* renamed from: kotlin.j0.o.c.p0.e.i */
/* loaded from: classes3.dex */
public final class C12531i extends AbstractC13580h.AbstractC13584d<C12531i> implements Object {

    /* renamed from: J */
    private static final C12531i f27965J;

    /* renamed from: K */
    public static InterfaceC13604q<C12531i> f27966K = new C12532a();

    /* renamed from: A */
    private List<C12565s> f27967A;

    /* renamed from: B */
    private C12555q f27968B;

    /* renamed from: C */
    private int f27969C;

    /* renamed from: D */
    private List<C12572u> f27970D;

    /* renamed from: E */
    private C12569t f27971E;

    /* renamed from: F */
    private List<Integer> f27972F;

    /* renamed from: G */
    private C12516e f27973G;

    /* renamed from: H */
    private byte f27974H;

    /* renamed from: I */
    private int f27975I;

    /* renamed from: d */
    private final AbstractC13570d f27976d;

    /* renamed from: e */
    private int f27977e;

    /* renamed from: f */
    private int f27978f;

    /* renamed from: w */
    private int f27979w;

    /* renamed from: x */
    private int f27980x;

    /* renamed from: y */
    private C12555q f27981y;

    /* renamed from: z */
    private int f27982z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.i$a */
    /* loaded from: classes3.dex */
    static class C12532a extends AbstractC13566b<C12531i> {
        C12532a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12531i mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12531i(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.i$b */
    /* loaded from: classes3.dex */
    public static final class C12533b extends AbstractC13580h.AbstractC13583c<C12531i, C12533b> implements Object {

        /* renamed from: A */
        private int f27983A;

        /* renamed from: D */
        private int f27986D;

        /* renamed from: f */
        private int f27991f;

        /* renamed from: y */
        private int f27994y;

        /* renamed from: w */
        private int f27992w = 6;

        /* renamed from: x */
        private int f27993x = 6;

        /* renamed from: z */
        private C12555q f27995z = C12555q.m7817Y();

        /* renamed from: B */
        private List<C12565s> f27984B = Collections.emptyList();

        /* renamed from: C */
        private C12555q f27985C = C12555q.m7817Y();

        /* renamed from: E */
        private List<C12572u> f27987E = Collections.emptyList();

        /* renamed from: F */
        private C12569t f27988F = C12569t.m7591w();

        /* renamed from: G */
        private List<Integer> f27989G = Collections.emptyList();

        /* renamed from: H */
        private C12516e f27990H = C12516e.m8324u();

        private C12533b() {
            m8117R();
        }

        /* renamed from: A */
        private void m8133A() {
            if ((this.f27991f & 256) != 256) {
                this.f27987E = new ArrayList(this.f27987E);
                this.f27991f |= 256;
            }
        }

        /* renamed from: B */
        private void m8132B() {
            if ((this.f27991f & 1024) != 1024) {
                this.f27989G = new ArrayList(this.f27989G);
                this.f27991f |= 1024;
            }
        }

        /* renamed from: R */
        private void m8117R() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12533b m8101y() {
            return new C12533b();
        }

        /* renamed from: z */
        private void m8100z() {
            if ((this.f27991f & 32) != 32) {
                this.f27984B = new ArrayList(this.f27984B);
                this.f27991f |= 32;
            }
        }

        /* renamed from: C */
        public C12516e m8131C() {
            return this.f27990H;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: D */
        public C12531i mo4442k() {
            return C12531i.m8166S();
        }

        /* renamed from: E */
        public C12555q m8129E() {
            return this.f27985C;
        }

        /* renamed from: F */
        public C12555q m8128F() {
            return this.f27995z;
        }

        /* renamed from: G */
        public C12565s m8127G(int i) {
            return this.f27984B.get(i);
        }

        /* renamed from: H */
        public int m8126H() {
            return this.f27984B.size();
        }

        /* renamed from: I */
        public C12569t m8125I() {
            return this.f27988F;
        }

        /* renamed from: K */
        public C12572u m8124K(int i) {
            return this.f27987E.get(i);
        }

        /* renamed from: L */
        public int m8123L() {
            return this.f27987E.size();
        }

        /* renamed from: M */
        public boolean m8122M() {
            return (this.f27991f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048;
        }

        /* renamed from: N */
        public boolean m8121N() {
            return (this.f27991f & 4) == 4;
        }

        /* renamed from: O */
        public boolean m8120O() {
            return (this.f27991f & 64) == 64;
        }

        /* renamed from: P */
        public boolean m8119P() {
            return (this.f27991f & 8) == 8;
        }

        /* renamed from: Q */
        public boolean m8118Q() {
            return (this.f27991f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
        }

        /* renamed from: S */
        public C12533b m8116S(C12516e c12516e) {
            if ((this.f27991f & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048 && this.f27990H != C12516e.m8324u()) {
                C12516e.C12518b m8330A = C12516e.m8330A(this.f27990H);
                m8330A.m8306z(c12516e);
                this.f27990H = m8330A.m8314r();
            } else {
                this.f27990H = c12516e;
            }
            this.f27991f |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
            return this;
        }

        /* renamed from: T */
        public C12533b m8115T(C12531i c12531i) {
            if (c12531i == C12531i.m8166S()) {
                return this;
            }
            if (c12531i.m8148l0()) {
                m8110a0(c12531i.m8164U());
            }
            if (c12531i.m8146n0()) {
                m8108c0(c12531i.m8162X());
            }
            if (c12531i.m8147m0()) {
                m8109b0(c12531i.m8163W());
            }
            if (c12531i.m8143q0()) {
                m8112X(c12531i.m8159a0());
            }
            if (c12531i.m8142r0()) {
                m8106e0(c12531i.m8158b0());
            }
            if (!c12531i.f27967A.isEmpty()) {
                if (this.f27984B.isEmpty()) {
                    this.f27984B = c12531i.f27967A;
                    this.f27991f &= -33;
                } else {
                    m8100z();
                    this.f27984B.addAll(c12531i.f27967A);
                }
            }
            if (c12531i.m8145o0()) {
                m8113W(c12531i.m8161Y());
            }
            if (c12531i.m8144p0()) {
                m8107d0(c12531i.m8160Z());
            }
            if (!c12531i.f27970D.isEmpty()) {
                if (this.f27987E.isEmpty()) {
                    this.f27987E = c12531i.f27970D;
                    this.f27991f &= -257;
                } else {
                    m8133A();
                    this.f27987E.addAll(c12531i.f27970D);
                }
            }
            if (c12531i.m8141s0()) {
                m8111Y(c12531i.m8154f0());
            }
            if (!c12531i.f27972F.isEmpty()) {
                if (this.f27989G.isEmpty()) {
                    this.f27989G = c12531i.f27972F;
                    this.f27991f &= -1025;
                } else {
                    m8132B();
                    this.f27989G.addAll(c12531i.f27972F);
                }
            }
            if (c12531i.m8149k0()) {
                m8116S(c12531i.m8167R());
            }
            m4434t(c12531i);
            m4439o(m4441l().m4538e(c12531i.f27976d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: U */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i.C12533b m8114U(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.i> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i.f27966K     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.i r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8115T(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.i r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8115T(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i.C12533b.m8114U(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.i$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8114U(c13573e, c13575f);
            return this;
        }

        /* renamed from: W */
        public C12533b m8113W(C12555q c12555q) {
            if ((this.f27991f & 64) == 64 && this.f27985C != C12555q.m7817Y()) {
                this.f27985C = C12555q.m7790z0(this.f27985C).mo4440n(c12555q).m7727w();
            } else {
                this.f27985C = c12555q;
            }
            this.f27991f |= 64;
            return this;
        }

        /* renamed from: X */
        public C12533b m8112X(C12555q c12555q) {
            if ((this.f27991f & 8) == 8 && this.f27995z != C12555q.m7817Y()) {
                this.f27995z = C12555q.m7790z0(this.f27995z).mo4440n(c12555q).m7727w();
            } else {
                this.f27995z = c12555q;
            }
            this.f27991f |= 8;
            return this;
        }

        /* renamed from: Y */
        public C12533b m8111Y(C12569t c12569t) {
            if ((this.f27991f & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512 && this.f27988F != C12569t.m7591w()) {
                C12569t.C12571b m7599F = C12569t.m7599F(this.f27988F);
                m7599F.m7574z(c12569t);
                this.f27988F = m7599F.m7582r();
            } else {
                this.f27988F = c12569t;
            }
            this.f27991f |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            return this;
        }

        /* renamed from: a0 */
        public C12533b m8110a0(int i) {
            this.f27991f |= 1;
            this.f27992w = i;
            return this;
        }

        /* renamed from: b0 */
        public C12533b m8109b0(int i) {
            this.f27991f |= 4;
            this.f27994y = i;
            return this;
        }

        /* renamed from: c0 */
        public C12533b m8108c0(int i) {
            this.f27991f |= 2;
            this.f27993x = i;
            return this;
        }

        /* renamed from: d0 */
        public C12533b m8107d0(int i) {
            this.f27991f |= 128;
            this.f27986D = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8114U(c13573e, c13575f);
            return this;
        }

        /* renamed from: e0 */
        public C12533b m8106e0(int i) {
            this.f27991f |= 16;
            this.f27983A = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m8121N()) {
                if (!m8119P() || m8128F().mo4379h()) {
                    for (int i = 0; i < m8126H(); i++) {
                        if (!m8127G(i).mo4379h()) {
                            return false;
                        }
                    }
                    if (!m8120O() || m8129E().mo4379h()) {
                        for (int i2 = 0; i2 < m8123L(); i2++) {
                            if (!m8124K(i2).mo4379h()) {
                                return false;
                            }
                        }
                        if (!m8118Q() || m8125I().mo4379h()) {
                            return (!m8122M() || m8131C().mo4379h()) && m4435s();
                        }
                        return false;
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
            m8115T((C12531i) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12531i build() {
            C12531i m8103w = m8103w();
            if (m8103w.mo4379h()) {
                return m8103w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8103w);
        }

        /* renamed from: w */
        public C12531i m8103w() {
            C12531i c12531i = new C12531i(this);
            int i = this.f27991f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12531i.f27978f = this.f27992w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12531i.f27979w = this.f27993x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12531i.f27980x = this.f27994y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12531i.f27981y = this.f27995z;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c12531i.f27982z = this.f27983A;
            if ((this.f27991f & 32) == 32) {
                this.f27984B = Collections.unmodifiableList(this.f27984B);
                this.f27991f &= -33;
            }
            c12531i.f27967A = this.f27984B;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c12531i.f27968B = this.f27985C;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            c12531i.f27969C = this.f27986D;
            if ((this.f27991f & 256) == 256) {
                this.f27987E = Collections.unmodifiableList(this.f27987E);
                this.f27991f &= -257;
            }
            c12531i.f27970D = this.f27987E;
            if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                i2 |= 128;
            }
            c12531i.f27971E = this.f27988F;
            if ((this.f27991f & 1024) == 1024) {
                this.f27989G = Collections.unmodifiableList(this.f27989G);
                this.f27991f &= -1025;
            }
            c12531i.f27972F = this.f27989G;
            if ((i & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                i2 |= 256;
            }
            c12531i.f27973G = this.f27990H;
            c12531i.f27977e = i2;
            return c12531i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12533b mo4443j() {
            C12533b m8101y = m8101y();
            m8101y.m8115T(m8103w());
            return m8101y;
        }
    }

    static {
        C12531i c12531i = new C12531i(true);
        f27965J = c12531i;
        c12531i.m8140t0();
    }

    /* renamed from: S */
    public static C12531i m8166S() {
        return f27965J;
    }

    /* renamed from: t0 */
    private void m8140t0() {
        this.f27978f = 6;
        this.f27979w = 6;
        this.f27980x = 0;
        this.f27981y = C12555q.m7817Y();
        this.f27982z = 0;
        this.f27967A = Collections.emptyList();
        this.f27968B = C12555q.m7817Y();
        this.f27969C = 0;
        this.f27970D = Collections.emptyList();
        this.f27971E = C12569t.m7591w();
        this.f27972F = Collections.emptyList();
        this.f27973G = C12516e.m8324u();
    }

    /* renamed from: u0 */
    public static C12533b m8139u0() {
        return C12533b.m8101y();
    }

    /* renamed from: v0 */
    public static C12533b m8138v0(C12531i c12531i) {
        C12533b m8139u0 = m8139u0();
        m8139u0.m8115T(c12531i);
        return m8139u0;
    }

    /* renamed from: x0 */
    public static C12531i m8136x0(InputStream inputStream, C13575f c13575f) throws IOException {
        return f27966K.mo4378a(inputStream, c13575f);
    }

    /* renamed from: R */
    public C12516e m8167R() {
        return this.f27973G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: T */
    public C12531i mo4380a() {
        return f27965J;
    }

    /* renamed from: U */
    public int m8164U() {
        return this.f27978f;
    }

    /* renamed from: W */
    public int m8163W() {
        return this.f27980x;
    }

    /* renamed from: X */
    public int m8162X() {
        return this.f27979w;
    }

    /* renamed from: Y */
    public C12555q m8161Y() {
        return this.f27968B;
    }

    /* renamed from: Z */
    public int m8160Z() {
        return this.f27969C;
    }

    /* renamed from: a0 */
    public C12555q m8159a0() {
        return this.f27981y;
    }

    /* renamed from: b0 */
    public int m8158b0() {
        return this.f27982z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f27977e & 2) == 2) {
            codedOutputStream.m4618a0(1, this.f27979w);
        }
        if ((this.f27977e & 4) == 4) {
            codedOutputStream.m4618a0(2, this.f27980x);
        }
        if ((this.f27977e & 8) == 8) {
            codedOutputStream.m4612d0(3, this.f27981y);
        }
        for (int i = 0; i < this.f27967A.size(); i++) {
            codedOutputStream.m4612d0(4, this.f27967A.get(i));
        }
        if ((this.f27977e & 32) == 32) {
            codedOutputStream.m4612d0(5, this.f27968B);
        }
        for (int i2 = 0; i2 < this.f27970D.size(); i2++) {
            codedOutputStream.m4612d0(6, this.f27970D.get(i2));
        }
        if ((this.f27977e & 16) == 16) {
            codedOutputStream.m4618a0(7, this.f27982z);
        }
        if ((this.f27977e & 64) == 64) {
            codedOutputStream.m4618a0(8, this.f27969C);
        }
        if ((this.f27977e & 1) == 1) {
            codedOutputStream.m4618a0(9, this.f27978f);
        }
        if ((this.f27977e & 128) == 128) {
            codedOutputStream.m4612d0(30, this.f27971E);
        }
        for (int i3 = 0; i3 < this.f27972F.size(); i3++) {
            codedOutputStream.m4618a0(31, this.f27972F.get(i3).intValue());
        }
        if ((this.f27977e & 256) == 256) {
            codedOutputStream.m4612d0(32, this.f27973G);
        }
        m4424y.m4422a(19000, codedOutputStream);
        codedOutputStream.m4602i0(this.f27976d);
    }

    /* renamed from: c0 */
    public C12565s m8157c0(int i) {
        return this.f27967A.get(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27975I;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f27977e & 2) == 2 ? CodedOutputStream.m4591o(1, this.f27979w) + 0 : 0;
        if ((this.f27977e & 4) == 4) {
            m4591o += CodedOutputStream.m4591o(2, this.f27980x);
        }
        if ((this.f27977e & 8) == 8) {
            m4591o += CodedOutputStream.m4583s(3, this.f27981y);
        }
        for (int i2 = 0; i2 < this.f27967A.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(4, this.f27967A.get(i2));
        }
        if ((this.f27977e & 32) == 32) {
            m4591o += CodedOutputStream.m4583s(5, this.f27968B);
        }
        for (int i3 = 0; i3 < this.f27970D.size(); i3++) {
            m4591o += CodedOutputStream.m4583s(6, this.f27970D.get(i3));
        }
        if ((this.f27977e & 16) == 16) {
            m4591o += CodedOutputStream.m4591o(7, this.f27982z);
        }
        if ((this.f27977e & 64) == 64) {
            m4591o += CodedOutputStream.m4591o(8, this.f27969C);
        }
        if ((this.f27977e & 1) == 1) {
            m4591o += CodedOutputStream.m4591o(9, this.f27978f);
        }
        if ((this.f27977e & 128) == 128) {
            m4591o += CodedOutputStream.m4583s(30, this.f27971E);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f27972F.size(); i5++) {
            i4 += CodedOutputStream.m4589p(this.f27972F.get(i5).intValue());
        }
        int size = m4591o + i4 + (m8150j0().size() * 2);
        if ((this.f27977e & 256) == 256) {
            size += CodedOutputStream.m4583s(32, this.f27973G);
        }
        int m4429t = size + m4429t() + this.f27976d.size();
        this.f27975I = m4429t;
        return m4429t;
    }

    /* renamed from: d0 */
    public int m8156d0() {
        return this.f27967A.size();
    }

    /* renamed from: e0 */
    public List<C12565s> m8155e0() {
        return this.f27967A;
    }

    /* renamed from: f0 */
    public C12569t m8154f0() {
        return this.f27971E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12531i> mo4382g() {
        return f27966K;
    }

    /* renamed from: g0 */
    public C12572u m8153g0(int i) {
        return this.f27970D.get(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27974H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m8147m0()) {
            this.f27974H = (byte) 0;
            return false;
        } else if (m8143q0() && !m8159a0().mo4379h()) {
            this.f27974H = (byte) 0;
            return false;
        } else {
            for (int i = 0; i < m8156d0(); i++) {
                if (!m8157c0(i).mo4379h()) {
                    this.f27974H = (byte) 0;
                    return false;
                }
            }
            if (m8145o0() && !m8161Y().mo4379h()) {
                this.f27974H = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < m8152h0(); i2++) {
                if (!m8153g0(i2).mo4379h()) {
                    this.f27974H = (byte) 0;
                    return false;
                }
            }
            if (m8141s0() && !m8154f0().mo4379h()) {
                this.f27974H = (byte) 0;
                return false;
            } else if (m8149k0() && !m8167R().mo4379h()) {
                this.f27974H = (byte) 0;
                return false;
            } else if (!m4430s()) {
                this.f27974H = (byte) 0;
                return false;
            } else {
                this.f27974H = (byte) 1;
                return true;
            }
        }
    }

    /* renamed from: h0 */
    public int m8152h0() {
        return this.f27970D.size();
    }

    /* renamed from: i0 */
    public List<C12572u> m8151i0() {
        return this.f27970D;
    }

    /* renamed from: j0 */
    public List<Integer> m8150j0() {
        return this.f27972F;
    }

    /* renamed from: k0 */
    public boolean m8149k0() {
        return (this.f27977e & 256) == 256;
    }

    /* renamed from: l0 */
    public boolean m8148l0() {
        return (this.f27977e & 1) == 1;
    }

    /* renamed from: m0 */
    public boolean m8147m0() {
        return (this.f27977e & 4) == 4;
    }

    /* renamed from: n0 */
    public boolean m8146n0() {
        return (this.f27977e & 2) == 2;
    }

    /* renamed from: o0 */
    public boolean m8145o0() {
        return (this.f27977e & 32) == 32;
    }

    /* renamed from: p0 */
    public boolean m8144p0() {
        return (this.f27977e & 64) == 64;
    }

    /* renamed from: q0 */
    public boolean m8143q0() {
        return (this.f27977e & 8) == 8;
    }

    /* renamed from: r0 */
    public boolean m8142r0() {
        return (this.f27977e & 16) == 16;
    }

    /* renamed from: s0 */
    public boolean m8141s0() {
        return (this.f27977e & 128) == 128;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: w0 */
    public C12533b mo4383f() {
        return m8139u0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: y0 */
    public C12533b mo4386b() {
        return m8138v0(this);
    }

    private C12531i(AbstractC13580h.AbstractC13583c<C12531i, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f27974H = (byte) -1;
        this.f27975I = -1;
        this.f27976d = abstractC13583c.m4441l();
    }

    private C12531i(boolean z) {
        this.f27974H = (byte) -1;
        this.f27975I = -1;
        this.f27976d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C12531i(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27974H = (byte) -1;
        this.f27975I = -1;
        m8140t0();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 1024;
            if (!z) {
                try {
                    try {
                        try {
                            int m4516K = c13573e.m4516K();
                            switch (m4516K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f27977e |= 2;
                                    this.f27979w = c13573e.m4488s();
                                    continue;
                                case 16:
                                    this.f27977e |= 4;
                                    this.f27980x = c13573e.m4488s();
                                    continue;
                                case 26:
                                    C12555q.C12561c mo4386b = (this.f27977e & 8) == 8 ? this.f27981y.mo4386b() : null;
                                    C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f27981y = c12555q;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q);
                                        this.f27981y = mo4386b.m7727w();
                                    }
                                    this.f27977e |= 8;
                                    continue;
                                case 34:
                                    if (!(z2 & true)) {
                                        this.f27967A = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f27967A.add(c13573e.m4486u(C12565s.f28185F, c13575f));
                                    continue;
                                case 42:
                                    C12555q.C12561c mo4386b2 = (this.f27977e & 32) == 32 ? this.f27968B.mo4386b() : null;
                                    C12555q c12555q2 = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f27968B = c12555q2;
                                    if (mo4386b2 != null) {
                                        mo4386b2.mo4440n(c12555q2);
                                        this.f27968B = mo4386b2.m7727w();
                                    }
                                    this.f27977e |= 32;
                                    continue;
                                case 50:
                                    if (!(z2 & true)) {
                                        this.f27970D = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f27970D.add(c13573e.m4486u(C12572u.f28221E, c13575f));
                                    continue;
                                case 56:
                                    this.f27977e |= 16;
                                    this.f27982z = c13573e.m4488s();
                                    continue;
                                case 64:
                                    this.f27977e |= 64;
                                    this.f27969C = c13573e.m4488s();
                                    continue;
                                case 72:
                                    this.f27977e |= 1;
                                    this.f27978f = c13573e.m4488s();
                                    continue;
                                case 242:
                                    C12569t.C12571b mo4386b3 = (this.f27977e & 128) == 128 ? this.f27971E.mo4386b() : null;
                                    C12569t c12569t = (C12569t) c13573e.m4486u(C12569t.f28210z, c13575f);
                                    this.f27971E = c12569t;
                                    if (mo4386b3 != null) {
                                        mo4386b3.m7574z(c12569t);
                                        this.f27971E = mo4386b3.m7582r();
                                    }
                                    this.f27977e |= 128;
                                    continue;
                                case 248:
                                    if (!(z2 & true)) {
                                        this.f27972F = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f27972F.add(Integer.valueOf(c13573e.m4488s()));
                                    continue;
                                case 250:
                                    int m4497j = c13573e.m4497j(c13573e.m4526A());
                                    if (!(z2 & true) && c13573e.m4502e() > 0) {
                                        this.f27972F = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c13573e.m4502e() > 0) {
                                        this.f27972F.add(Integer.valueOf(c13573e.m4488s()));
                                    }
                                    c13573e.m4498i(m4497j);
                                    continue;
                                    break;
                                case 258:
                                    C12516e.C12518b mo4386b4 = (this.f27977e & 256) == 256 ? this.f27973G.mo4386b() : null;
                                    C12516e c12516e = (C12516e) c13573e.m4486u(C12516e.f27898x, c13575f);
                                    this.f27973G = c12516e;
                                    if (mo4386b4 != null) {
                                        mo4386b4.m8306z(c12516e);
                                        this.f27973G = mo4386b4.m8314r();
                                    }
                                    this.f27977e |= 256;
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
                        this.f27967A = Collections.unmodifiableList(this.f27967A);
                    }
                    if (z2 & true) {
                        this.f27970D = Collections.unmodifiableList(this.f27970D);
                    }
                    if ((z2 & true) == r5) {
                        this.f27972F = Collections.unmodifiableList(this.f27972F);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27976d = m4542O.m4530I();
                        throw th2;
                    }
                    this.f27976d = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            } else {
                if (z2 & true) {
                    this.f27967A = Collections.unmodifiableList(this.f27967A);
                }
                if (z2 & true) {
                    this.f27970D = Collections.unmodifiableList(this.f27970D);
                }
                if (z2 & true) {
                    this.f27972F = Collections.unmodifiableList(this.f27972F);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f27976d = m4542O.m4530I();
                    throw th3;
                }
                this.f27976d = m4542O.m4530I();
                mo4433m();
                return;
            }
        }
    }
}
