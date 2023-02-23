package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12555q;
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
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.r */
/* loaded from: classes3.dex */
public final class C12562r extends AbstractC13580h.AbstractC13584d<C12562r> implements Object {

    /* renamed from: G */
    private static final C12562r f28159G;

    /* renamed from: H */
    public static InterfaceC13604q<C12562r> f28160H = new C12563a();

    /* renamed from: A */
    private C12555q f28161A;

    /* renamed from: B */
    private int f28162B;

    /* renamed from: C */
    private List<C12499b> f28163C;

    /* renamed from: D */
    private List<Integer> f28164D;

    /* renamed from: E */
    private byte f28165E;

    /* renamed from: F */
    private int f28166F;

    /* renamed from: d */
    private final AbstractC13570d f28167d;

    /* renamed from: e */
    private int f28168e;

    /* renamed from: f */
    private int f28169f;

    /* renamed from: w */
    private int f28170w;

    /* renamed from: x */
    private List<C12565s> f28171x;

    /* renamed from: y */
    private C12555q f28172y;

    /* renamed from: z */
    private int f28173z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.r$a */
    /* loaded from: classes3.dex */
    static class C12563a extends AbstractC13566b<C12562r> {
        C12563a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12562r mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12562r(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.r$b */
    /* loaded from: classes3.dex */
    public static final class C12564b extends AbstractC13580h.AbstractC13583c<C12562r, C12564b> implements Object {

        /* renamed from: A */
        private int f28174A;

        /* renamed from: C */
        private int f28176C;

        /* renamed from: f */
        private int f28179f;

        /* renamed from: x */
        private int f28181x;

        /* renamed from: w */
        private int f28180w = 6;

        /* renamed from: y */
        private List<C12565s> f28182y = Collections.emptyList();

        /* renamed from: z */
        private C12555q f28183z = C12555q.m7817Y();

        /* renamed from: B */
        private C12555q f28175B = C12555q.m7817Y();

        /* renamed from: D */
        private List<C12499b> f28177D = Collections.emptyList();

        /* renamed from: E */
        private List<Integer> f28178E = Collections.emptyList();

        private C12564b() {
            m7669N();
        }

        /* renamed from: A */
        private void m7681A() {
            if ((this.f28179f & 4) != 4) {
                this.f28182y = new ArrayList(this.f28182y);
                this.f28179f |= 4;
            }
        }

        /* renamed from: B */
        private void m7680B() {
            if ((this.f28179f & 256) != 256) {
                this.f28178E = new ArrayList(this.f28178E);
                this.f28179f |= 256;
            }
        }

        /* renamed from: N */
        private void m7669N() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public static C12564b m7656y() {
            return new C12564b();
        }

        /* renamed from: z */
        private void m7655z() {
            if ((this.f28179f & 128) != 128) {
                this.f28177D = new ArrayList(this.f28177D);
                this.f28179f |= 128;
            }
        }

        /* renamed from: C */
        public C12499b m7679C(int i) {
            return this.f28177D.get(i);
        }

        /* renamed from: D */
        public int m7678D() {
            return this.f28177D.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: E */
        public C12562r mo4442k() {
            return C12562r.m7706R();
        }

        /* renamed from: F */
        public C12555q m7676F() {
            return this.f28175B;
        }

        /* renamed from: G */
        public C12565s m7675G(int i) {
            return this.f28182y.get(i);
        }

        /* renamed from: H */
        public int m7674H() {
            return this.f28182y.size();
        }

        /* renamed from: I */
        public C12555q m7673I() {
            return this.f28183z;
        }

        /* renamed from: K */
        public boolean m7672K() {
            return (this.f28179f & 32) == 32;
        }

        /* renamed from: L */
        public boolean m7671L() {
            return (this.f28179f & 2) == 2;
        }

        /* renamed from: M */
        public boolean m7670M() {
            return (this.f28179f & 8) == 8;
        }

        /* renamed from: O */
        public C12564b m7668O(C12555q c12555q) {
            if ((this.f28179f & 32) == 32 && this.f28175B != C12555q.m7817Y()) {
                this.f28175B = C12555q.m7790z0(this.f28175B).mo4440n(c12555q).m7727w();
            } else {
                this.f28175B = c12555q;
            }
            this.f28179f |= 32;
            return this;
        }

        /* renamed from: P */
        public C12564b m7667P(C12562r c12562r) {
            if (c12562r == C12562r.m7706R()) {
                return this;
            }
            if (c12562r.m7692g0()) {
                m7663T(c12562r.m7702W());
            }
            if (c12562r.m7691h0()) {
                m7662U(c12562r.m7701X());
            }
            if (!c12562r.f28171x.isEmpty()) {
                if (this.f28182y.isEmpty()) {
                    this.f28182y = c12562r.f28171x;
                    this.f28179f &= -5;
                } else {
                    m7681A();
                    this.f28182y.addAll(c12562r.f28171x);
                }
            }
            if (c12562r.m7690i0()) {
                m7665R(c12562r.m7697b0());
            }
            if (c12562r.m7689j0()) {
                m7661W(c12562r.m7696c0());
            }
            if (c12562r.m7694e0()) {
                m7668O(c12562r.m7704T());
            }
            if (c12562r.m7693f0()) {
                m7664S(c12562r.m7703U());
            }
            if (!c12562r.f28163C.isEmpty()) {
                if (this.f28177D.isEmpty()) {
                    this.f28177D = c12562r.f28163C;
                    this.f28179f &= -129;
                } else {
                    m7655z();
                    this.f28177D.addAll(c12562r.f28163C);
                }
            }
            if (!c12562r.f28164D.isEmpty()) {
                if (this.f28178E.isEmpty()) {
                    this.f28178E = c12562r.f28164D;
                    this.f28179f &= -257;
                } else {
                    m7680B();
                    this.f28178E.addAll(c12562r.f28164D);
                }
            }
            m4434t(c12562r);
            m4439o(m4441l().m4538e(c12562r.f28167d));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: Q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r.C12564b m7666Q(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.r> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r.f28160H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.r r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m7667P(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.r r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m7667P(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12562r.C12564b.m7666Q(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.r$b");
        }

        /* renamed from: R */
        public C12564b m7665R(C12555q c12555q) {
            if ((this.f28179f & 8) == 8 && this.f28183z != C12555q.m7817Y()) {
                this.f28183z = C12555q.m7790z0(this.f28183z).mo4440n(c12555q).m7727w();
            } else {
                this.f28183z = c12555q;
            }
            this.f28179f |= 8;
            return this;
        }

        /* renamed from: S */
        public C12564b m7664S(int i) {
            this.f28179f |= 64;
            this.f28176C = i;
            return this;
        }

        /* renamed from: T */
        public C12564b m7663T(int i) {
            this.f28179f |= 1;
            this.f28180w = i;
            return this;
        }

        /* renamed from: U */
        public C12564b m7662U(int i) {
            this.f28179f |= 2;
            this.f28181x = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m7666Q(c13573e, c13575f);
            return this;
        }

        /* renamed from: W */
        public C12564b m7661W(int i) {
            this.f28179f |= 16;
            this.f28174A = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m7666Q(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (m7671L()) {
                for (int i = 0; i < m7674H(); i++) {
                    if (!m7675G(i).mo4379h()) {
                        return false;
                    }
                }
                if (!m7670M() || m7673I().mo4379h()) {
                    if (!m7672K() || m7676F().mo4379h()) {
                        for (int i2 = 0; i2 < m7678D(); i2++) {
                            if (!m7679C(i2).mo4379h()) {
                                return false;
                            }
                        }
                        return m4435s();
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
            m7667P((C12562r) abstractC13580h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: v */
        public C12562r build() {
            C12562r m7658w = m7658w();
            if (m7658w.mo4379h()) {
                return m7658w;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m7658w);
        }

        /* renamed from: w */
        public C12562r m7658w() {
            C12562r c12562r = new C12562r(this);
            int i = this.f28179f;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12562r.f28169f = this.f28180w;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12562r.f28170w = this.f28181x;
            if ((this.f28179f & 4) == 4) {
                this.f28182y = Collections.unmodifiableList(this.f28182y);
                this.f28179f &= -5;
            }
            c12562r.f28171x = this.f28182y;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            c12562r.f28172y = this.f28183z;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            c12562r.f28173z = this.f28174A;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            c12562r.f28161A = this.f28175B;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            c12562r.f28162B = this.f28176C;
            if ((this.f28179f & 128) == 128) {
                this.f28177D = Collections.unmodifiableList(this.f28177D);
                this.f28179f &= -129;
            }
            c12562r.f28163C = this.f28177D;
            if ((this.f28179f & 256) == 256) {
                this.f28178E = Collections.unmodifiableList(this.f28178E);
                this.f28179f &= -257;
            }
            c12562r.f28164D = this.f28178E;
            c12562r.f28168e = i2;
            return c12562r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: x */
        public C12564b mo4443j() {
            C12564b m7656y = m7656y();
            m7656y.m7667P(m7658w());
            return m7656y;
        }
    }

    static {
        C12562r c12562r = new C12562r(true);
        f28159G = c12562r;
        c12562r.m7688k0();
    }

    /* renamed from: R */
    public static C12562r m7706R() {
        return f28159G;
    }

    /* renamed from: k0 */
    private void m7688k0() {
        this.f28169f = 6;
        this.f28170w = 0;
        this.f28171x = Collections.emptyList();
        this.f28172y = C12555q.m7817Y();
        this.f28173z = 0;
        this.f28161A = C12555q.m7817Y();
        this.f28162B = 0;
        this.f28163C = Collections.emptyList();
        this.f28164D = Collections.emptyList();
    }

    /* renamed from: l0 */
    public static C12564b m7687l0() {
        return C12564b.m7656y();
    }

    /* renamed from: m0 */
    public static C12564b m7686m0(C12562r c12562r) {
        C12564b m7687l0 = m7687l0();
        m7687l0.m7667P(c12562r);
        return m7687l0;
    }

    /* renamed from: o0 */
    public static C12562r m7684o0(InputStream inputStream, C13575f c13575f) throws IOException {
        return f28160H.mo4376c(inputStream, c13575f);
    }

    /* renamed from: O */
    public C12499b m7709O(int i) {
        return this.f28163C.get(i);
    }

    /* renamed from: P */
    public int m7708P() {
        return this.f28163C.size();
    }

    /* renamed from: Q */
    public List<C12499b> m7707Q() {
        return this.f28163C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: S */
    public C12562r mo4380a() {
        return f28159G;
    }

    /* renamed from: T */
    public C12555q m7704T() {
        return this.f28161A;
    }

    /* renamed from: U */
    public int m7703U() {
        return this.f28162B;
    }

    /* renamed from: W */
    public int m7702W() {
        return this.f28169f;
    }

    /* renamed from: X */
    public int m7701X() {
        return this.f28170w;
    }

    /* renamed from: Y */
    public C12565s m7700Y(int i) {
        return this.f28171x.get(i);
    }

    /* renamed from: Z */
    public int m7699Z() {
        return this.f28171x.size();
    }

    /* renamed from: a0 */
    public List<C12565s> m7698a0() {
        return this.f28171x;
    }

    /* renamed from: b0 */
    public C12555q m7697b0() {
        return this.f28172y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        AbstractC13580h.AbstractC13584d<MessageType>.C13585a m4424y = m4424y();
        if ((this.f28168e & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f28169f);
        }
        if ((this.f28168e & 2) == 2) {
            codedOutputStream.m4618a0(2, this.f28170w);
        }
        for (int i = 0; i < this.f28171x.size(); i++) {
            codedOutputStream.m4612d0(3, this.f28171x.get(i));
        }
        if ((this.f28168e & 4) == 4) {
            codedOutputStream.m4612d0(4, this.f28172y);
        }
        if ((this.f28168e & 8) == 8) {
            codedOutputStream.m4618a0(5, this.f28173z);
        }
        if ((this.f28168e & 16) == 16) {
            codedOutputStream.m4612d0(6, this.f28161A);
        }
        if ((this.f28168e & 32) == 32) {
            codedOutputStream.m4618a0(7, this.f28162B);
        }
        for (int i2 = 0; i2 < this.f28163C.size(); i2++) {
            codedOutputStream.m4612d0(8, this.f28163C.get(i2));
        }
        for (int i3 = 0; i3 < this.f28164D.size(); i3++) {
            codedOutputStream.m4618a0(31, this.f28164D.get(i3).intValue());
        }
        m4424y.m4422a(200, codedOutputStream);
        codedOutputStream.m4602i0(this.f28167d);
    }

    /* renamed from: c0 */
    public int m7696c0() {
        return this.f28173z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f28166F;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f28168e & 1) == 1 ? CodedOutputStream.m4591o(1, this.f28169f) + 0 : 0;
        if ((this.f28168e & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(2, this.f28170w);
        }
        for (int i2 = 0; i2 < this.f28171x.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(3, this.f28171x.get(i2));
        }
        if ((this.f28168e & 4) == 4) {
            m4591o += CodedOutputStream.m4583s(4, this.f28172y);
        }
        if ((this.f28168e & 8) == 8) {
            m4591o += CodedOutputStream.m4591o(5, this.f28173z);
        }
        if ((this.f28168e & 16) == 16) {
            m4591o += CodedOutputStream.m4583s(6, this.f28161A);
        }
        if ((this.f28168e & 32) == 32) {
            m4591o += CodedOutputStream.m4591o(7, this.f28162B);
        }
        for (int i3 = 0; i3 < this.f28163C.size(); i3++) {
            m4591o += CodedOutputStream.m4583s(8, this.f28163C.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f28164D.size(); i5++) {
            i4 += CodedOutputStream.m4589p(this.f28164D.get(i5).intValue());
        }
        int size = m4591o + i4 + (m7695d0().size() * 2) + m4429t() + this.f28167d.size();
        this.f28166F = size;
        return size;
    }

    /* renamed from: d0 */
    public List<Integer> m7695d0() {
        return this.f28164D;
    }

    /* renamed from: e0 */
    public boolean m7694e0() {
        return (this.f28168e & 16) == 16;
    }

    /* renamed from: f0 */
    public boolean m7693f0() {
        return (this.f28168e & 32) == 32;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12562r> mo4382g() {
        return f28160H;
    }

    /* renamed from: g0 */
    public boolean m7692g0() {
        return (this.f28168e & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f28165E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m7691h0()) {
            this.f28165E = (byte) 0;
            return false;
        }
        for (int i = 0; i < m7699Z(); i++) {
            if (!m7700Y(i).mo4379h()) {
                this.f28165E = (byte) 0;
                return false;
            }
        }
        if (m7690i0() && !m7697b0().mo4379h()) {
            this.f28165E = (byte) 0;
            return false;
        } else if (m7694e0() && !m7704T().mo4379h()) {
            this.f28165E = (byte) 0;
            return false;
        } else {
            for (int i2 = 0; i2 < m7708P(); i2++) {
                if (!m7709O(i2).mo4379h()) {
                    this.f28165E = (byte) 0;
                    return false;
                }
            }
            if (!m4430s()) {
                this.f28165E = (byte) 0;
                return false;
            }
            this.f28165E = (byte) 1;
            return true;
        }
    }

    /* renamed from: h0 */
    public boolean m7691h0() {
        return (this.f28168e & 2) == 2;
    }

    /* renamed from: i0 */
    public boolean m7690i0() {
        return (this.f28168e & 4) == 4;
    }

    /* renamed from: j0 */
    public boolean m7689j0() {
        return (this.f28168e & 8) == 8;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: n0 */
    public C12564b mo4383f() {
        return m7687l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: p0 */
    public C12564b mo4386b() {
        return m7686m0(this);
    }

    private C12562r(AbstractC13580h.AbstractC13583c<C12562r, ?> abstractC13583c) {
        super(abstractC13583c);
        this.f28165E = (byte) -1;
        this.f28166F = -1;
        this.f28167d = abstractC13583c.m4441l();
    }

    private C12562r(boolean z) {
        this.f28165E = (byte) -1;
        this.f28166F = -1;
        this.f28167d = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private C12562r(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        C12555q.C12561c mo4386b;
        this.f28165E = (byte) -1;
        this.f28166F = -1;
        m7688k0();
        AbstractC13570d.C13572b m4542O = AbstractC13570d.m4542O();
        CodedOutputStream m4636J = CodedOutputStream.m4636J(m4542O, 1);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            ?? r5 = 128;
            if (!z) {
                try {
                    try {
                        try {
                            int m4516K = c13573e.m4516K();
                            switch (m4516K) {
                                case 0:
                                    break;
                                case 8:
                                    this.f28168e |= 1;
                                    this.f28169f = c13573e.m4488s();
                                    continue;
                                case 16:
                                    this.f28168e |= 2;
                                    this.f28170w = c13573e.m4488s();
                                    continue;
                                case 26:
                                    if (!(z2 & true)) {
                                        this.f28171x = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28171x.add(c13573e.m4486u(C12565s.f28185F, c13575f));
                                    continue;
                                case 34:
                                    mo4386b = (this.f28168e & 4) == 4 ? this.f28172y.mo4386b() : null;
                                    C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28172y = c12555q;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q);
                                        this.f28172y = mo4386b.m7727w();
                                    }
                                    this.f28168e |= 4;
                                    continue;
                                case 40:
                                    this.f28168e |= 8;
                                    this.f28173z = c13573e.m4488s();
                                    continue;
                                case 50:
                                    mo4386b = (this.f28168e & 16) == 16 ? this.f28161A.mo4386b() : null;
                                    C12555q c12555q2 = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                                    this.f28161A = c12555q2;
                                    if (mo4386b != null) {
                                        mo4386b.mo4440n(c12555q2);
                                        this.f28161A = mo4386b.m7727w();
                                    }
                                    this.f28168e |= 16;
                                    continue;
                                case 56:
                                    this.f28168e |= 32;
                                    this.f28162B = c13573e.m4488s();
                                    continue;
                                case 66:
                                    if (!(z2 & true)) {
                                        this.f28163C = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28163C.add(c13573e.m4486u(C12499b.f27762z, c13575f));
                                    continue;
                                case 248:
                                    if (!(z2 & true)) {
                                        this.f28164D = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f28164D.add(Integer.valueOf(c13573e.m4488s()));
                                    continue;
                                case 250:
                                    int m4497j = c13573e.m4497j(c13573e.m4526A());
                                    if (!(z2 & true) && c13573e.m4502e() > 0) {
                                        this.f28164D = new ArrayList();
                                        z2 |= true;
                                    }
                                    while (c13573e.m4502e() > 0) {
                                        this.f28164D.add(Integer.valueOf(c13573e.m4488s()));
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
                        this.f28171x = Collections.unmodifiableList(this.f28171x);
                    }
                    if ((z2 & true) == r5) {
                        this.f28163C = Collections.unmodifiableList(this.f28163C);
                    }
                    if (z2 & true) {
                        this.f28164D = Collections.unmodifiableList(this.f28164D);
                    }
                    try {
                        m4636J.m4637I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f28167d = m4542O.m4530I();
                        throw th2;
                    }
                    this.f28167d = m4542O.m4530I();
                    mo4433m();
                    throw th;
                }
            } else {
                if (z2 & true) {
                    this.f28171x = Collections.unmodifiableList(this.f28171x);
                }
                if (z2 & true) {
                    this.f28163C = Collections.unmodifiableList(this.f28163C);
                }
                if (z2 & true) {
                    this.f28164D = Collections.unmodifiableList(this.f28164D);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f28167d = m4542O.m4530I();
                    throw th3;
                }
                this.f28167d = m4542O.m4530I();
                mo4433m();
                return;
            }
        }
    }
}
