package kotlin.p493j0.p494o.p495c.p497p0.p515e;

import java.io.IOException;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C13588i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.j0.o.c.p0.e.h */
/* loaded from: classes3.dex */
public final class C12527h extends AbstractC13580h implements InterfaceC13603p {

    /* renamed from: D */
    private static final C12527h f27939D;

    /* renamed from: E */
    public static InterfaceC13604q<C12527h> f27940E = new C12528a();

    /* renamed from: A */
    private List<C12527h> f27941A;

    /* renamed from: B */
    private byte f27942B;

    /* renamed from: C */
    private int f27943C;

    /* renamed from: c */
    private final AbstractC13570d f27944c;

    /* renamed from: d */
    private int f27945d;

    /* renamed from: e */
    private int f27946e;

    /* renamed from: f */
    private int f27947f;

    /* renamed from: w */
    private EnumC12530c f27948w;

    /* renamed from: x */
    private C12555q f27949x;

    /* renamed from: y */
    private int f27950y;

    /* renamed from: z */
    private List<C12527h> f27951z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.h$a */
    /* loaded from: classes3.dex */
    static class C12528a extends AbstractC13566b<C12527h> {
        C12528a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13604q
        /* renamed from: m */
        public C12527h mo4377b(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
            return new C12527h(c13573e, c13575f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.h$b */
    /* loaded from: classes3.dex */
    public static final class C12529b extends AbstractC13580h.AbstractC13582b<C12527h, C12529b> implements Object {

        /* renamed from: d */
        private int f27953d;

        /* renamed from: e */
        private int f27954e;

        /* renamed from: f */
        private int f27955f;

        /* renamed from: y */
        private int f27958y;

        /* renamed from: w */
        private EnumC12530c f27956w = EnumC12530c.TRUE;

        /* renamed from: x */
        private C12555q f27957x = C12555q.m7817Y();

        /* renamed from: z */
        private List<C12527h> f27959z = Collections.emptyList();

        /* renamed from: A */
        private List<C12527h> f27952A = Collections.emptyList();

        private C12529b() {
            m8204D();
        }

        /* renamed from: D */
        private void m8204D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static C12529b m8192t() {
            return new C12529b();
        }

        /* renamed from: u */
        private void m8191u() {
            if ((this.f27953d & 32) != 32) {
                this.f27959z = new ArrayList(this.f27959z);
                this.f27953d |= 32;
            }
        }

        /* renamed from: v */
        private void m8190v() {
            if ((this.f27953d & 64) != 64) {
                this.f27952A = new ArrayList(this.f27952A);
                this.f27953d |= 64;
            }
        }

        /* renamed from: A */
        public C12527h m8207A(int i) {
            return this.f27952A.get(i);
        }

        /* renamed from: B */
        public int m8206B() {
            return this.f27952A.size();
        }

        /* renamed from: C */
        public boolean m8205C() {
            return (this.f27953d & 8) == 8;
        }

        /* renamed from: E */
        public C12529b m8203E(C12527h c12527h) {
            if (c12527h == C12527h.m8235F()) {
                return this;
            }
            if (c12527h.m8226O()) {
                m8199I(c12527h.m8233H());
            }
            if (c12527h.m8223R()) {
                m8197L(c12527h.m8228M());
            }
            if (c12527h.m8227N()) {
                m8200H(c12527h.m8236E());
            }
            if (c12527h.m8225P()) {
                m8201G(c12527h.m8232I());
            }
            if (c12527h.m8224Q()) {
                m8198K(c12527h.m8231J());
            }
            if (!c12527h.f27951z.isEmpty()) {
                if (this.f27959z.isEmpty()) {
                    this.f27959z = c12527h.f27951z;
                    this.f27953d &= -33;
                } else {
                    m8191u();
                    this.f27959z.addAll(c12527h.f27951z);
                }
            }
            if (!c12527h.f27941A.isEmpty()) {
                if (this.f27952A.isEmpty()) {
                    this.f27952A = c12527h.f27941A;
                    this.f27953d &= -65;
                } else {
                    m8190v();
                    this.f27952A.addAll(c12527h.f27941A);
                }
            }
            m4439o(m4441l().m4538e(c12527h.f27944c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h.C12529b m8202F(kotlin.reflect.jvm.internal.impl.protobuf.C13573e r3, kotlin.reflect.jvm.internal.impl.protobuf.C13575f r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.j0.o.c.p0.e.h> r1 = kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h.f27940E     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo4377b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.j0.o.c.p0.e.h r3 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.m8203E(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m4567a()     // Catch: java.lang.Throwable -> Lf
                kotlin.j0.o.c.p0.e.h r4 = (kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m8203E(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.C12527h.C12529b.m8202F(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.j0.o.c.p0.e.h$b");
        }

        /* renamed from: G */
        public C12529b m8201G(C12555q c12555q) {
            if ((this.f27953d & 8) == 8 && this.f27957x != C12555q.m7817Y()) {
                this.f27957x = C12555q.m7790z0(this.f27957x).mo4440n(c12555q).m7727w();
            } else {
                this.f27957x = c12555q;
            }
            this.f27953d |= 8;
            return this;
        }

        /* renamed from: H */
        public C12529b m8200H(EnumC12530c enumC12530c) {
            if (enumC12530c != null) {
                this.f27953d |= 4;
                this.f27956w = enumC12530c;
                return this;
            }
            throw null;
        }

        /* renamed from: I */
        public C12529b m8199I(int i) {
            this.f27953d |= 1;
            this.f27954e = i;
            return this;
        }

        /* renamed from: K */
        public C12529b m8198K(int i) {
            this.f27953d |= 16;
            this.f27958y = i;
            return this;
        }

        /* renamed from: L */
        public C12529b m8197L(int i) {
            this.f27953d |= 2;
            this.f27955f = i;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: V */
        public /* bridge */ /* synthetic */ InterfaceC13601o.InterfaceC13602a mo4381V(C13573e c13573e, C13575f c13575f) throws IOException {
            m8202F(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13563a.AbstractC13564a
        /* renamed from: e */
        public /* bridge */ /* synthetic */ AbstractC13563a.AbstractC13564a mo4553e(C13573e c13573e, C13575f c13575f) throws IOException {
            m8202F(c13573e, c13575f);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
        /* renamed from: h */
        public final boolean mo4379h() {
            if (!m8205C() || m8186z().mo4379h()) {
                for (int i = 0; i < m8188x(); i++) {
                    if (!m8189w(i).mo4379h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < m8206B(); i2++) {
                    if (!m8207A(i2).mo4379h()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: n */
        public /* bridge */ /* synthetic */ C12529b mo4440n(C12527h c12527h) {
            m8203E(c12527h);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o.InterfaceC13602a
        /* renamed from: q */
        public C12527h build() {
            C12527h m8194r = m8194r();
            if (m8194r.mo4379h()) {
                return m8194r;
            }
            throw AbstractC13563a.AbstractC13564a.m4552i(m8194r);
        }

        /* renamed from: r */
        public C12527h m8194r() {
            C12527h c12527h = new C12527h(this);
            int i = this.f27953d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c12527h.f27946e = this.f27954e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c12527h.f27947f = this.f27955f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c12527h.f27948w = this.f27956w;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            c12527h.f27949x = this.f27957x;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            c12527h.f27950y = this.f27958y;
            if ((this.f27953d & 32) == 32) {
                this.f27959z = Collections.unmodifiableList(this.f27959z);
                this.f27953d &= -33;
            }
            c12527h.f27951z = this.f27959z;
            if ((this.f27953d & 64) == 64) {
                this.f27952A = Collections.unmodifiableList(this.f27952A);
                this.f27953d &= -65;
            }
            c12527h.f27941A = this.f27952A;
            c12527h.f27945d = i2;
            return c12527h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: s */
        public C12529b mo4443j() {
            C12529b m8192t = m8192t();
            m8192t.m8203E(m8194r());
            return m8192t;
        }

        /* renamed from: w */
        public C12527h m8189w(int i) {
            return this.f27959z.get(i);
        }

        /* renamed from: x */
        public int m8188x() {
            return this.f27959z.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h.AbstractC13582b
        /* renamed from: y */
        public C12527h mo4442k() {
            return C12527h.m8235F();
        }

        /* renamed from: z */
        public C12555q m8186z() {
            return this.f27957x;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.j0.o.c.p0.e.h$c */
    /* loaded from: classes3.dex */
    public enum EnumC12530c implements C13588i.InterfaceC13589a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: c */
        private final int f27964c;

        EnumC12530c(int i, int i2) {
            this.f27964c = i2;
        }

        /* renamed from: a */
        public static EnumC12530c m8185a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return NULL;
                }
                return FALSE;
            }
            return TRUE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C13588i.InterfaceC13589a
        /* renamed from: d */
        public final int mo4405d() {
            return this.f27964c;
        }
    }

    static {
        C12527h c12527h = new C12527h(true);
        f27939D = c12527h;
        c12527h.m8222S();
    }

    /* renamed from: F */
    public static C12527h m8235F() {
        return f27939D;
    }

    /* renamed from: S */
    private void m8222S() {
        this.f27946e = 0;
        this.f27947f = 0;
        this.f27948w = EnumC12530c.TRUE;
        this.f27949x = C12555q.m7817Y();
        this.f27950y = 0;
        this.f27951z = Collections.emptyList();
        this.f27941A = Collections.emptyList();
    }

    /* renamed from: T */
    public static C12529b m8221T() {
        return C12529b.m8192t();
    }

    /* renamed from: U */
    public static C12529b m8220U(C12527h c12527h) {
        C12529b m8221T = m8221T();
        m8221T.m8203E(c12527h);
        return m8221T;
    }

    /* renamed from: C */
    public C12527h m8238C(int i) {
        return this.f27951z.get(i);
    }

    /* renamed from: D */
    public int m8237D() {
        return this.f27951z.size();
    }

    /* renamed from: E */
    public EnumC12530c m8236E() {
        return this.f27948w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: G */
    public C12527h mo4380a() {
        return f27939D;
    }

    /* renamed from: H */
    public int m8233H() {
        return this.f27946e;
    }

    /* renamed from: I */
    public C12555q m8232I() {
        return this.f27949x;
    }

    /* renamed from: J */
    public int m8231J() {
        return this.f27950y;
    }

    /* renamed from: K */
    public C12527h m8230K(int i) {
        return this.f27941A.get(i);
    }

    /* renamed from: L */
    public int m8229L() {
        return this.f27941A.size();
    }

    /* renamed from: M */
    public int m8228M() {
        return this.f27947f;
    }

    /* renamed from: N */
    public boolean m8227N() {
        return (this.f27945d & 4) == 4;
    }

    /* renamed from: O */
    public boolean m8226O() {
        return (this.f27945d & 1) == 1;
    }

    /* renamed from: P */
    public boolean m8225P() {
        return (this.f27945d & 8) == 8;
    }

    /* renamed from: Q */
    public boolean m8224Q() {
        return (this.f27945d & 16) == 16;
    }

    /* renamed from: R */
    public boolean m8223R() {
        return (this.f27945d & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: W */
    public C12529b mo4383f() {
        return m8221T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: X */
    public C12529b mo4386b() {
        return m8220U(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: c */
    public void mo4385c(CodedOutputStream codedOutputStream) throws IOException {
        mo4384d();
        if ((this.f27945d & 1) == 1) {
            codedOutputStream.m4618a0(1, this.f27946e);
        }
        if ((this.f27945d & 2) == 2) {
            codedOutputStream.m4618a0(2, this.f27947f);
        }
        if ((this.f27945d & 4) == 4) {
            codedOutputStream.m4627S(3, this.f27948w.mo4405d());
        }
        if ((this.f27945d & 8) == 8) {
            codedOutputStream.m4612d0(4, this.f27949x);
        }
        if ((this.f27945d & 16) == 16) {
            codedOutputStream.m4618a0(5, this.f27950y);
        }
        for (int i = 0; i < this.f27951z.size(); i++) {
            codedOutputStream.m4612d0(6, this.f27951z.get(i));
        }
        for (int i2 = 0; i2 < this.f27941A.size(); i2++) {
            codedOutputStream.m4612d0(7, this.f27941A.get(i2));
        }
        codedOutputStream.m4602i0(this.f27944c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: d */
    public int mo4384d() {
        int i = this.f27943C;
        if (i != -1) {
            return i;
        }
        int m4591o = (this.f27945d & 1) == 1 ? CodedOutputStream.m4591o(1, this.f27946e) + 0 : 0;
        if ((this.f27945d & 2) == 2) {
            m4591o += CodedOutputStream.m4591o(2, this.f27947f);
        }
        if ((this.f27945d & 4) == 4) {
            m4591o += CodedOutputStream.m4605h(3, this.f27948w.mo4405d());
        }
        if ((this.f27945d & 8) == 8) {
            m4591o += CodedOutputStream.m4583s(4, this.f27949x);
        }
        if ((this.f27945d & 16) == 16) {
            m4591o += CodedOutputStream.m4591o(5, this.f27950y);
        }
        for (int i2 = 0; i2 < this.f27951z.size(); i2++) {
            m4591o += CodedOutputStream.m4583s(6, this.f27951z.get(i2));
        }
        for (int i3 = 0; i3 < this.f27941A.size(); i3++) {
            m4591o += CodedOutputStream.m4583s(7, this.f27941A.get(i3));
        }
        int size = m4591o + this.f27944c.size();
        this.f27943C = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o
    /* renamed from: g */
    public InterfaceC13604q<C12527h> mo4382g() {
        return f27940E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13603p
    /* renamed from: h */
    public final boolean mo4379h() {
        byte b = this.f27942B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m8225P() && !m8232I().mo4379h()) {
            this.f27942B = (byte) 0;
            return false;
        }
        for (int i = 0; i < m8237D(); i++) {
            if (!m8238C(i).mo4379h()) {
                this.f27942B = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < m8229L(); i2++) {
            if (!m8230K(i2).mo4379h()) {
                this.f27942B = (byte) 0;
                return false;
            }
        }
        this.f27942B = (byte) 1;
        return true;
    }

    private C12527h(AbstractC13580h.AbstractC13582b abstractC13582b) {
        super(abstractC13582b);
        this.f27942B = (byte) -1;
        this.f27943C = -1;
        this.f27944c = abstractC13582b.m4441l();
    }

    private C12527h(boolean z) {
        this.f27942B = (byte) -1;
        this.f27943C = -1;
        this.f27944c = AbstractC13570d.f29926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12527h(C13573e c13573e, C13575f c13575f) throws InvalidProtocolBufferException {
        this.f27942B = (byte) -1;
        this.f27943C = -1;
        m8222S();
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
                            this.f27945d |= 1;
                            this.f27946e = c13573e.m4488s();
                        } else if (m4516K == 16) {
                            this.f27945d |= 2;
                            this.f27947f = c13573e.m4488s();
                        } else if (m4516K == 24) {
                            int m4493n = c13573e.m4493n();
                            EnumC12530c m8185a = EnumC12530c.m8185a(m4493n);
                            if (m8185a == null) {
                                m4636J.m4590o0(m4516K);
                                m4636J.m4590o0(m4493n);
                            } else {
                                this.f27945d |= 4;
                                this.f27948w = m8185a;
                            }
                        } else if (m4516K == 34) {
                            C12555q.C12561c mo4386b = (this.f27945d & 8) == 8 ? this.f27949x.mo4386b() : null;
                            C12555q c12555q = (C12555q) c13573e.m4486u(C12555q.f28106M, c13575f);
                            this.f27949x = c12555q;
                            if (mo4386b != null) {
                                mo4386b.mo4440n(c12555q);
                                this.f27949x = mo4386b.m7727w();
                            }
                            this.f27945d |= 8;
                        } else if (m4516K == 40) {
                            this.f27945d |= 16;
                            this.f27950y = c13573e.m4488s();
                        } else if (m4516K == 50) {
                            if (!(z2 & true)) {
                                this.f27951z = new ArrayList();
                                z2 |= true;
                            }
                            this.f27951z.add(c13573e.m4486u(f27940E, c13575f));
                        } else if (m4516K != 58) {
                            if (!mo4432p(c13573e, m4636J, c13575f, m4516K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f27941A = new ArrayList();
                                z2 |= true;
                            }
                            this.f27941A.add(c13573e.m4486u(f27940E, c13575f));
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
                    this.f27951z = Collections.unmodifiableList(this.f27951z);
                }
                if (z2 & true) {
                    this.f27941A = Collections.unmodifiableList(this.f27941A);
                }
                try {
                    m4636J.m4637I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27944c = m4542O.m4530I();
                    throw th2;
                }
                this.f27944c = m4542O.m4530I();
                mo4433m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f27951z = Collections.unmodifiableList(this.f27951z);
        }
        if (z2 & true) {
            this.f27941A = Collections.unmodifiableList(this.f27941A);
        }
        try {
            m4636J.m4637I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27944c = m4542O.m4530I();
            throw th3;
        }
        this.f27944c = m4542O.m4530I();
        mo4433m();
    }
}
