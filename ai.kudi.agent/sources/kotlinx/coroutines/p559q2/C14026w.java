package kotlinx.coroutines.p559q2;

import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlinx.coroutines.C13935n;
import kotlinx.coroutines.C13945p;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.InterfaceC14110y0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.AbstractC13817a;
import kotlinx.coroutines.flow.internal.C13818b;
import kotlinx.coroutines.flow.internal.InterfaceC13837m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedFlow.kt */
/* renamed from: kotlinx.coroutines.q2.w */
/* loaded from: classes3.dex */
public final class C14026w<T> extends AbstractC13817a<C14031y> implements InterfaceC14021r<T>, Object<T>, InterfaceC13837m<T> {

    /* renamed from: A */
    private long f30589A;

    /* renamed from: B */
    private long f30590B;

    /* renamed from: C */
    private int f30591C;

    /* renamed from: D */
    private int f30592D;

    /* renamed from: w */
    private final int f30593w;

    /* renamed from: x */
    private final int f30594x;

    /* renamed from: y */
    private final EnumC13778e f30595y;

    /* renamed from: z */
    private Object[] f30596z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    /* renamed from: kotlinx.coroutines.q2.w$a */
    /* loaded from: classes3.dex */
    public static final class C14027a implements InterfaceC14110y0 {

        /* renamed from: c */
        public final C14026w<?> f30597c;

        /* renamed from: d */
        public long f30598d;

        /* renamed from: e */
        public final Object f30599e;

        /* renamed from: f */
        public final InterfaceC11714d<C13666w> f30600f;

        /* JADX WARN: Multi-variable type inference failed */
        public C14027a(C14026w<?> c14026w, long j, Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            this.f30597c = c14026w;
            this.f30598d = j;
            this.f30599e = obj;
            this.f30600f = interfaceC11714d;
        }

        @Override // kotlinx.coroutines.InterfaceC14110y0
        /* renamed from: i */
        public void mo2939i() {
            this.f30597c.m3217z(this);
        }
    }

    /* compiled from: SharedFlow.kt */
    /* renamed from: kotlinx.coroutines.q2.w$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C14028b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30601a;

        static {
            int[] iArr = new int[EnumC13778e.values().length];
            iArr[EnumC13778e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13778e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13778e.DROP_OLDEST.ordinal()] = 3;
            f30601a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedFlow.kt */
    @f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {341, 348, 351}, m = "collect")
    /* renamed from: kotlinx.coroutines.q2.w$c */
    /* loaded from: classes3.dex */
    public static final class C14029c extends AbstractC11738d {

        /* renamed from: c */
        Object f30602c;

        /* renamed from: d */
        Object f30603d;

        /* renamed from: e */
        Object f30604e;

        /* renamed from: f */
        Object f30605f;

        /* renamed from: w */
        /* synthetic */ Object f30606w;

        /* renamed from: x */
        final /* synthetic */ C14026w<T> f30607x;

        /* renamed from: y */
        int f30608y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14029c(C14026w<T> c14026w, InterfaceC11714d<? super C14029c> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30607x = c14026w;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30606w = obj;
            this.f30608y |= Integer.MIN_VALUE;
            return this.f30607x.mo3175a(null, this);
        }
    }

    public C14026w(int i, int i2, EnumC13778e enumC13778e) {
        this.f30593w = i;
        this.f30594x = i2;
        this.f30595y = enumC13778e;
    }

    /* renamed from: A */
    private final void m3255A() {
        Object m3211f;
        if (this.f30594x != 0 || this.f30592D > 1) {
            Object[] objArr = this.f30596z;
            l.d(objArr);
            while (this.f30592D > 0) {
                m3211f = C14030x.m3211f(objArr, (m3246J() + m3242N()) - 1);
                if (m3211f != C14030x.f30609a) {
                    return;
                }
                this.f30592D--;
                C14030x.m3210g(objArr, m3246J() + m3242N(), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0007, code lost:
        r0 = ((kotlinx.coroutines.flow.internal.AbstractC13817a) r9).f30267c;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3254B(long r10) {
        /*
            r9 = this;
            int r0 = kotlinx.coroutines.flow.internal.AbstractC13817a.m3612d(r9)
            if (r0 != 0) goto L7
            goto L29
        L7:
            kotlinx.coroutines.flow.internal.c[] r0 = kotlinx.coroutines.flow.internal.AbstractC13817a.m3610h(r9)
            if (r0 != 0) goto Le
            goto L29
        Le:
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L29
            r3 = r0[r2]
            if (r3 == 0) goto L26
            kotlinx.coroutines.q2.y r3 = (kotlinx.coroutines.p559q2.C14031y) r3
            long r4 = r3.f30610a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L26
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L26
            r3.f30610a = r10
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            r9.f30590B = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14026w.m3254B(long):void");
    }

    /* renamed from: E */
    private final void m3251E() {
        Object[] objArr = this.f30596z;
        l.d(objArr);
        C14030x.m3210g(objArr, m3246J(), null);
        this.f30591C--;
        long m3246J = m3246J() + 1;
        if (this.f30589A < m3246J) {
            this.f30589A = m3246J;
        }
        if (this.f30590B < m3246J) {
            m3254B(m3246J);
        }
        if (C13952q0.m3345a()) {
            if (!(m3246J() == m3246J)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: F */
    private final Object m3250F(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d m10388c;
        InterfaceC11714d<C13666w>[] interfaceC11714dArr;
        C14027a c14027a;
        Object m10387d;
        Object m10387d2;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n c13935n = new C13935n(m10388c, 1);
        c13935n.m3393B();
        InterfaceC11714d<C13666w>[] interfaceC11714dArr2 = C13818b.f30271a;
        synchronized (this) {
            if (m3240P(t)) {
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                c13935n.resumeWith(c13666w);
                interfaceC11714dArr = m3248H(interfaceC11714dArr2);
                c14027a = null;
            } else {
                C14027a c14027a2 = new C14027a(this, m3242N() + m3246J(), t, c13935n);
                m3249G(c14027a2);
                this.f30592D++;
                if (this.f30594x == 0) {
                    interfaceC11714dArr2 = m3248H(interfaceC11714dArr2);
                }
                interfaceC11714dArr = interfaceC11714dArr2;
                c14027a = c14027a2;
            }
        }
        if (c14027a != null) {
            C13945p.m3356a(c13935n, c14027a);
        }
        int i = 0;
        int length = interfaceC11714dArr.length;
        while (i < length) {
            InterfaceC11714d<C13666w> interfaceC11714d2 = interfaceC11714dArr[i];
            i++;
            if (interfaceC11714d2 != null) {
                C13666w c13666w2 = C13666w.f30112a;
                C13288p.C13289a c13289a2 = C13288p.f29444c;
                C13288p.m5362a(c13666w2);
                interfaceC11714d2.resumeWith(c13666w2);
            }
        }
        Object m3363y = c13935n.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        m10387d2 = C11734d.m10387d();
        return m3363y == m10387d2 ? m3363y : C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m3249G(Object obj) {
        int m3242N = m3242N();
        Object[] objArr = this.f30596z;
        if (objArr == null) {
            objArr = m3241O(null, 0, 2);
        } else if (m3242N >= objArr.length) {
            objArr = m3241O(objArr, m3242N, objArr.length * 2);
        }
        C14030x.m3210g(objArr, m3246J() + m3242N, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = ((kotlinx.coroutines.flow.internal.AbstractC13817a) r11).f30267c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.p476c0.InterfaceC11714d<kotlin.C13666w>[] m3248H(kotlin.p476c0.InterfaceC11714d<kotlin.C13666w>[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = kotlinx.coroutines.flow.internal.AbstractC13817a.m3612d(r11)
            if (r1 != 0) goto L8
            goto L4b
        L8:
            kotlinx.coroutines.flow.internal.c[] r1 = kotlinx.coroutines.flow.internal.AbstractC13817a.m3610h(r11)
            if (r1 != 0) goto Lf
            goto L4b
        Lf:
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            if (r4 == 0) goto L48
            kotlinx.coroutines.q2.y r4 = (kotlinx.coroutines.p559q2.C14031y) r4
            kotlin.c0.d<? super kotlin.w> r5 = r4.f30611b
            if (r5 != 0) goto L1e
            goto L48
        L1e:
            long r6 = r11.m3238R(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L29
            goto L48
        L29:
            int r6 = r12.length
            if (r0 < r6) goto L3d
            int r6 = r12.length
            r7 = 2
            int r6 = r6 * 2
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            java.lang.String r6 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.e0.d.l.e(r12, r6)
        L3d:
            r6 = r12
            kotlin.c0.d[] r6 = (kotlin.p476c0.InterfaceC11714d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f30611b = r0
            r0 = r7
        L48:
            int r3 = r3 + 1
            goto L11
        L4b:
            kotlin.c0.d[] r12 = (kotlin.p476c0.InterfaceC11714d[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14026w.m3248H(kotlin.c0.d[]):kotlin.c0.d[]");
    }

    /* renamed from: I */
    private final long m3247I() {
        return m3246J() + this.f30591C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final long m3246J() {
        return Math.min(this.f30590B, this.f30589A);
    }

    /* renamed from: K */
    private final Object m3245K(long j) {
        Object m3211f;
        Object[] objArr = this.f30596z;
        l.d(objArr);
        m3211f = C14030x.m3211f(objArr, j);
        return m3211f instanceof C14027a ? ((C14027a) m3211f).f30599e : m3211f;
    }

    /* renamed from: L */
    private final long m3244L() {
        return m3246J() + this.f30591C + this.f30592D;
    }

    /* renamed from: M */
    private final int m3243M() {
        return (int) ((m3246J() + this.f30591C) - this.f30589A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final int m3242N() {
        return this.f30591C + this.f30592D;
    }

    /* renamed from: O */
    private final Object[] m3241O(Object[] objArr, int i, int i2) {
        Object m3211f;
        int i3 = 0;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f30596z = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m3246J = m3246J();
            if (i > 0) {
                while (true) {
                    int i4 = i3 + 1;
                    long j = i3 + m3246J;
                    m3211f = C14030x.m3211f(objArr, j);
                    C14030x.m3210g(objArr2, j, m3211f);
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final boolean m3240P(T t) {
        if (m3607m() == 0) {
            return m3239Q(t);
        }
        if (this.f30591C >= this.f30594x && this.f30590B <= this.f30589A) {
            int i = C14028b.f30601a[this.f30595y.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m3249G(t);
        int i2 = this.f30591C + 1;
        this.f30591C = i2;
        if (i2 > this.f30594x) {
            m3251E();
        }
        if (m3243M() > this.f30593w) {
            m3236T(this.f30589A + 1, this.f30590B, m3247I(), m3244L());
        }
        return true;
    }

    /* renamed from: Q */
    private final boolean m3239Q(T t) {
        if (C13952q0.m3345a()) {
            if (!(m3607m() == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f30593w == 0) {
            return true;
        }
        m3249G(t);
        int i = this.f30591C + 1;
        this.f30591C = i;
        if (i > this.f30593w) {
            m3251E();
        }
        this.f30590B = m3246J() + this.f30591C;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final long m3238R(C14031y c14031y) {
        long j = c14031y.f30610a;
        if (j < m3247I()) {
            return j;
        }
        if (this.f30594x <= 0 && j <= m3246J() && this.f30592D != 0) {
            return j;
        }
        return -1L;
    }

    /* renamed from: S */
    private final Object m3237S(C14031y c14031y) {
        Object obj;
        InterfaceC11714d<C13666w>[] interfaceC11714dArr = C13818b.f30271a;
        synchronized (this) {
            long m3238R = m3238R(c14031y);
            if (m3238R < 0) {
                obj = C14030x.f30609a;
            } else {
                long j = c14031y.f30610a;
                Object m3245K = m3245K(m3238R);
                c14031y.f30610a = m3238R + 1;
                interfaceC11714dArr = m3235U(j);
                obj = m3245K;
            }
        }
        int i = 0;
        int length = interfaceC11714dArr.length;
        while (i < length) {
            InterfaceC11714d<C13666w> interfaceC11714d = interfaceC11714dArr[i];
            i++;
            if (interfaceC11714d != null) {
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                interfaceC11714d.resumeWith(c13666w);
            }
        }
        return obj;
    }

    /* renamed from: T */
    private final void m3236T(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        if (C13952q0.m3345a()) {
            if (!(min >= m3246J())) {
                throw new AssertionError();
            }
        }
        long m3246J = m3246J();
        if (m3246J < min) {
            while (true) {
                long j5 = 1 + m3246J;
                Object[] objArr = this.f30596z;
                l.d(objArr);
                C14030x.m3210g(objArr, m3246J, null);
                if (j5 >= min) {
                    break;
                }
                m3246J = j5;
            }
        }
        this.f30589A = j;
        this.f30590B = j2;
        this.f30591C = (int) (j3 - min);
        this.f30592D = (int) (j4 - j3);
        if (C13952q0.m3345a()) {
            if (!(this.f30591C >= 0)) {
                throw new AssertionError();
            }
        }
        if (C13952q0.m3345a()) {
            if (!(this.f30592D >= 0)) {
                throw new AssertionError();
            }
        }
        if (C13952q0.m3345a()) {
            if (!(this.f30589A <= m3246J() + ((long) this.f30591C))) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: y */
    private final Object m3218y(C14031y c14031y, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC11714d m10388c;
        Object m10387d;
        Object m10387d2;
        m10388c = C11729c.m10388c(interfaceC11714d);
        C13935n c13935n = new C13935n(m10388c, 1);
        c13935n.m3393B();
        synchronized (this) {
            if (m3238R(c14031y) < 0) {
                c14031y.f30611b = c13935n;
                c14031y.f30611b = c13935n;
            } else {
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                c13935n.resumeWith(c13666w);
            }
            C13666w c13666w2 = C13666w.f30112a;
        }
        Object m3363y = c13935n.m3363y();
        m10387d = C11734d.m10387d();
        if (m3363y == m10387d) {
            C11741h.m10374c(interfaceC11714d);
        }
        m10387d2 = C11734d.m10387d();
        return m3363y == m10387d2 ? m3363y : C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m3217z(C14027a c14027a) {
        Object m3211f;
        synchronized (this) {
            if (c14027a.f30598d < m3246J()) {
                return;
            }
            Object[] objArr = this.f30596z;
            l.d(objArr);
            m3211f = C14030x.m3211f(objArr, c14027a.f30598d);
            if (m3211f != c14027a) {
                return;
            }
            C14030x.m3210g(objArr, c14027a.f30598d, C14030x.f30609a);
            m3255A();
            C13666w c13666w = C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractC13817a
    /* renamed from: C */
    public C14031y mo3230j() {
        return new C14031y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractC13817a
    /* renamed from: D */
    public C14031y[] mo3229k(int i) {
        return new C14031y[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        r4 = ((kotlinx.coroutines.flow.internal.AbstractC13817a) r22).f30267c;
     */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.p476c0.InterfaceC11714d<kotlin.C13666w>[] m3235U(long r23) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14026w.m3235U(long):kotlin.c0.d[]");
    }

    /* renamed from: V */
    public final long m3234V() {
        long j = this.f30589A;
        if (j < this.f30590B) {
            this.f30590B = j;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:14:0x003b, B:35:0x00a0, B:40:0x00ae, B:39:0x00ab, B:43:0x00bf, B:19:0x0059, B:22:0x006b, B:33:0x0092), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.q2.y] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.flow.internal.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:15:0x003e). Please submit an issue!!! */
    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r9, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14026w.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC13837m
    /* renamed from: b */
    public InterfaceC13964d<T> mo3233b(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return C14030x.m3212e(this, interfaceC11719g, i, enumC13778e);
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r
    /* renamed from: e */
    public void mo3232e() {
        synchronized (this) {
            m3236T(m3247I(), this.f30590B, m3247I(), m3244L());
            C13666w c13666w = C13666w.f30112a;
        }
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r, kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (mo3231f(t)) {
            return C13666w.f30112a;
        }
        Object m3250F = m3250F(t, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m3250F == m10387d ? m3250F : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC14021r
    /* renamed from: f */
    public boolean mo3231f(T t) {
        int i;
        boolean z;
        InterfaceC11714d<C13666w>[] interfaceC11714dArr = C13818b.f30271a;
        synchronized (this) {
            i = 0;
            if (m3240P(t)) {
                interfaceC11714dArr = m3248H(interfaceC11714dArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = interfaceC11714dArr.length;
        while (i < length) {
            InterfaceC11714d<C13666w> interfaceC11714d = interfaceC11714dArr[i];
            i++;
            if (interfaceC11714d != null) {
                C13666w c13666w = C13666w.f30112a;
                C13288p.C13289a c13289a = C13288p.f29444c;
                C13288p.m5362a(c13666w);
                interfaceC11714d.resumeWith(c13666w);
            }
        }
        return z;
    }
}
