package p201g.p259r;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.C14057t1;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.InterfaceC14112z;
import kotlinx.coroutines.channels.C13783i;
import kotlinx.coroutines.channels.InterfaceC13779f;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p564v2.InterfaceC14094b;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC8041v0;
import p201g.p259r.AbstractC8061y;
import p201g.p259r.C7977n0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: PageFetcherSnapshot.kt */
/* renamed from: g.r.l0 */
/* loaded from: classes2.dex */
public final class C7942l0<Key, Value> {

    /* renamed from: a */
    private final Key f19069a;

    /* renamed from: b */
    private final AbstractC8041v0<Key, Value> f19070b;

    /* renamed from: c */
    private final C8003q0 f19071c;

    /* renamed from: d */
    private final InterfaceC13964d<C13666w> f19072d;

    /* renamed from: e */
    private final boolean f19073e;

    /* renamed from: f */
    private final InterfaceC7831b1<Key, Value> f19074f;

    /* renamed from: g */
    private final C8053w0<Key, Value> f19075g;

    /* renamed from: h */
    private final InterfaceC11756a<C13666w> f19076h;

    /* renamed from: i */
    private final C8022t f19077i;

    /* renamed from: j */
    private final AtomicBoolean f19078j;

    /* renamed from: k */
    private final InterfaceC13779f<AbstractC7905j0<Value>> f19079k;

    /* renamed from: l */
    private final C7977n0.C7978a<Key, Value> f19080l;

    /* renamed from: m */
    private final InterfaceC14112z f19081m;

    /* renamed from: n */
    private final InterfaceC13964d<AbstractC7905j0<Value>> f19082n;

    /* compiled from: PageFetcherSnapshot.kt */
    /* renamed from: g.r.l0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7943a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19083a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
            iArr[EnumC7830b0.APPEND.ordinal()] = 3;
            f19083a = iArr;
        }
    }

    /* compiled from: Collect.kt */
    /* renamed from: g.r.l0$b */
    /* loaded from: classes2.dex */
    public static final class C7944b implements InterfaceC13969e<C8015s> {

        /* renamed from: d */
        final /* synthetic */ EnumC7830b0 f19085d;

        public C7944b(EnumC7830b0 enumC7830b0) {
            this.f19085d = enumC7830b0;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        public Object emit(C8015s c8015s, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            Object m16990u = C7942l0.this.m16990u(this.f19085d, c8015s, interfaceC11714d);
            m10387d = C11734d.m10387d();
            return m16990u == m10387d ? m16990u : C13666w.f30112a;
        }
    }

    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", l = {229, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE}, m = "invokeSuspend")
    /* renamed from: g.r.l0$c */
    /* loaded from: classes2.dex */
    public static final class C7945c extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super C8015s>, Integer, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19086c;

        /* renamed from: d */
        private /* synthetic */ Object f19087d;

        /* renamed from: e */
        /* synthetic */ Object f19088e;

        /* renamed from: f */
        final /* synthetic */ C7942l0 f19089f;

        /* renamed from: w */
        final /* synthetic */ EnumC7830b0 f19090w;

        /* renamed from: x */
        Object f19091x;

        /* renamed from: y */
        int f19092y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7945c(InterfaceC11714d interfaceC11714d, C7942l0 c7942l0, EnumC7830b0 enumC7830b0) {
            super(3, interfaceC11714d);
            this.f19089f = c7942l0;
            this.f19090w = enumC7830b0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            InterfaceC13969e interfaceC13969e;
            int intValue;
            C7977n0.C7978a c7978a;
            InterfaceC14094b m16952a;
            InterfaceC13964d c7947e;
            m10387d = C11734d.m10387d();
            int i = this.f19086c;
            try {
                if (i == 0) {
                    C13291q.m5357b(obj);
                    interfaceC13969e = (InterfaceC13969e) this.f19087d;
                    intValue = ((Number) this.f19088e).intValue();
                    c7978a = this.f19089f.f19080l;
                    m16952a = C7977n0.C7978a.m16952a(c7978a);
                    this.f19087d = interfaceC13969e;
                    this.f19088e = c7978a;
                    this.f19091x = m16952a;
                    this.f19092y = intValue;
                    this.f19086c = 1;
                    if (m16952a.mo2980a(null, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        C13291q.m5357b(obj);
                        return C13666w.f30112a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    intValue = this.f19092y;
                    m16952a = (InterfaceC14094b) this.f19091x;
                    c7978a = (C7977n0.C7978a) this.f19088e;
                    interfaceC13969e = (InterfaceC13969e) this.f19087d;
                    C13291q.m5357b(obj);
                }
                C7977n0 m16951b = C7977n0.C7978a.m16951b(c7978a);
                if (l.b(m16951b.m16958p().m17127a(this.f19090w), AbstractC8061y.C8064c.f19411b.m16801a())) {
                    c7947e = C13971f.m3317q(new C8015s[0]);
                } else {
                    if (!(m16951b.m16958p().m17127a(this.f19090w) instanceof AbstractC8061y.C8062a)) {
                        m16951b.m16958p().m17125c(this.f19090w, AbstractC8061y.C8064c.f19411b.m16800b());
                    }
                    C13666w c13666w = C13666w.f30112a;
                    m16952a.mo2979b(null);
                    c7947e = new C7947e(C13971f.m3325i(this.f19089f.f19077i.m16886c(this.f19090w), intValue == 0 ? 0 : 1), intValue);
                }
                this.f19087d = null;
                this.f19088e = null;
                this.f19091x = null;
                this.f19086c = 2;
                if (C13971f.m3323k(interfaceC13969e, c7947e, this) == m10387d) {
                    return m10387d;
                }
                return C13666w.f30112a;
            } finally {
                m16952a.mo2979b(null);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super C8015s> interfaceC13969e, Integer num, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            C7945c c7945c = new C7945c(interfaceC11714d, this.f19089f, this.f19090w);
            c7945c.f19087d = interfaceC13969e;
            c7945c.f19088e = num;
            return c7945c.invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.r.l0$d */
    /* loaded from: classes2.dex */
    public static final class C7946d extends AbstractC11745k implements InterfaceC11772q<C8015s, C8015s, InterfaceC11714d<? super C8015s>, Object> {

        /* renamed from: c */
        int f19093c;

        /* renamed from: d */
        /* synthetic */ Object f19094d;

        /* renamed from: e */
        /* synthetic */ Object f19095e;

        /* renamed from: f */
        final /* synthetic */ EnumC7830b0 f19096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7946d(EnumC7830b0 enumC7830b0, InterfaceC11714d<? super C7946d> interfaceC11714d) {
            super(3, interfaceC11714d);
            this.f19096f = enumC7830b0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f19093c == 0) {
                C13291q.m5357b(obj);
                C8015s c8015s = (C8015s) this.f19094d;
                C8015s c8015s2 = (C8015s) this.f19095e;
                return C7973m0.m16976a(c8015s2, c8015s, this.f19096f) ? c8015s2 : c8015s;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(C8015s c8015s, C8015s c8015s2, InterfaceC11714d<? super C8015s> interfaceC11714d) {
            C7946d c7946d = new C7946d(this.f19096f, interfaceC11714d);
            c7946d.f19094d = c8015s;
            c7946d.f19095e = c8015s2;
            return c7946d.invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: g.r.l0$e */
    /* loaded from: classes2.dex */
    public static final class C7947e implements InterfaceC13964d<C8015s> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f19097c;

        /* renamed from: d */
        final /* synthetic */ int f19098d;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.l0$e$a */
        /* loaded from: classes2.dex */
        public static final class C7948a implements InterfaceC13969e<AbstractC7982n1> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f19099c;

            /* renamed from: d */
            final /* synthetic */ int f19100d;

            @f(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
            /* renamed from: g.r.l0$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C7949a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f19101c;

                /* renamed from: d */
                int f19102d;

                public C7949a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f19101c = obj;
                    this.f19102d |= Integer.MIN_VALUE;
                    return C7948a.this.emit(null, this);
                }
            }

            public C7948a(InterfaceC13969e interfaceC13969e, int i) {
                this.f19099c = interfaceC13969e;
                this.f19100d = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(p201g.p259r.AbstractC7982n1 r6, kotlin.p476c0.InterfaceC11714d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p201g.p259r.C7942l0.C7947e.C7948a.C7949a
                    if (r0 == 0) goto L13
                    r0 = r7
                    g.r.l0$e$a$a r0 = (p201g.p259r.C7942l0.C7947e.C7948a.C7949a) r0
                    int r1 = r0.f19102d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19102d = r1
                    goto L18
                L13:
                    g.r.l0$e$a$a r0 = new g.r.l0$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f19101c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f19102d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C13291q.m5357b(r7)
                    goto L48
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C13291q.m5357b(r7)
                    kotlinx.coroutines.q2.e r7 = r5.f19099c
                    g.r.n1 r6 = (p201g.p259r.AbstractC7982n1) r6
                    g.r.s r2 = new g.r.s
                    int r4 = r5.f19100d
                    r2.<init>(r4, r6)
                    r0.f19102d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L48
                    return r1
                L48:
                    kotlin.w r6 = kotlin.C13666w.f30112a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.C7947e.C7948a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C7947e(InterfaceC13964d interfaceC13964d, int i) {
            this.f19097c = interfaceC13964d;
            this.f19098d = i;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e<? super C8015s> interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f19097c.mo3175a(new C7948a(interfaceC13969e, this.f19098d), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608}, m = "currentPagingState")
    /* renamed from: g.r.l0$f */
    /* loaded from: classes2.dex */
    public static final class C7950f extends AbstractC11738d {

        /* renamed from: c */
        Object f19104c;

        /* renamed from: d */
        Object f19105d;

        /* renamed from: e */
        Object f19106e;

        /* renamed from: f */
        /* synthetic */ Object f19107f;

        /* renamed from: w */
        final /* synthetic */ C7942l0<Key, Value> f19108w;

        /* renamed from: x */
        int f19109x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7950f(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7950f> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19108w = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19107f = obj;
            this.f19109x |= Integer.MIN_VALUE;
            return this.f19108w.m16992s(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608, 280, 283, 619, 630, 317, 641, 652, 341}, m = "doInitialLoad")
    /* renamed from: g.r.l0$g */
    /* loaded from: classes2.dex */
    public static final class C7951g extends AbstractC11738d {

        /* renamed from: c */
        Object f19110c;

        /* renamed from: d */
        Object f19111d;

        /* renamed from: e */
        Object f19112e;

        /* renamed from: f */
        Object f19113f;

        /* renamed from: w */
        /* synthetic */ Object f19114w;

        /* renamed from: x */
        final /* synthetic */ C7942l0<Key, Value> f19115x;

        /* renamed from: y */
        int f19116y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7951g(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7951g> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19115x = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19114w = obj;
            this.f19116y |= Integer.MIN_VALUE;
            return this.f19115x.m16991t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {609, 620, 398, 406, 631, 642, 448, 653, 470, 496, 664}, m = "doLoad")
    /* renamed from: g.r.l0$h */
    /* loaded from: classes2.dex */
    public static final class C7952h extends AbstractC11738d {

        /* renamed from: A */
        Object f19117A;

        /* renamed from: B */
        Object f19118B;

        /* renamed from: C */
        Object f19119C;

        /* renamed from: D */
        int f19120D;

        /* renamed from: E */
        int f19121E;

        /* renamed from: F */
        /* synthetic */ Object f19122F;

        /* renamed from: G */
        final /* synthetic */ C7942l0<Key, Value> f19123G;

        /* renamed from: H */
        int f19124H;

        /* renamed from: c */
        Object f19125c;

        /* renamed from: d */
        Object f19126d;

        /* renamed from: e */
        Object f19127e;

        /* renamed from: f */
        Object f19128f;

        /* renamed from: w */
        Object f19129w;

        /* renamed from: x */
        Object f19130x;

        /* renamed from: y */
        Object f19131y;

        /* renamed from: z */
        Object f19132z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7952h(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7952h> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19123G = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19122F = obj;
            this.f19124H |= Integer.MIN_VALUE;
            return this.f19123G.m16990u(null, null, this);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {608, 163, 619}, m = "invokeSuspend")
    /* renamed from: g.r.l0$i */
    /* loaded from: classes2.dex */
    static final class C7953i extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<AbstractC7905j0<Value>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19133c;

        /* renamed from: d */
        Object f19134d;

        /* renamed from: e */
        Object f19135e;

        /* renamed from: f */
        int f19136f;

        /* renamed from: w */
        private /* synthetic */ Object f19137w;

        /* renamed from: x */
        final /* synthetic */ C7942l0<Key, Value> f19138x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
        /* renamed from: g.r.l0$i$a */
        /* loaded from: classes2.dex */
        public static final class C7954a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19139c;

            /* renamed from: d */
            final /* synthetic */ C7942l0<Key, Value> f19140d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC7881f1<AbstractC7905j0<Value>> f19141e;

            /* compiled from: Collect.kt */
            /* renamed from: g.r.l0$i$a$a */
            /* loaded from: classes2.dex */
            public static final class C7955a implements InterfaceC13969e<AbstractC7905j0<Value>> {

                /* renamed from: c */
                final /* synthetic */ InterfaceC7881f1 f19142c;

                @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {136}, m = "emit")
                /* renamed from: g.r.l0$i$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C7956a extends AbstractC11738d {

                    /* renamed from: c */
                    /* synthetic */ Object f19143c;

                    /* renamed from: d */
                    int f19144d;

                    public C7956a(InterfaceC11714d interfaceC11714d) {
                        super(interfaceC11714d);
                    }

                    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                    public final Object invokeSuspend(Object obj) {
                        this.f19143c = obj;
                        this.f19144d |= Integer.MIN_VALUE;
                        return C7955a.this.emit(null, this);
                    }
                }

                public C7955a(InterfaceC7881f1 interfaceC7881f1) {
                    this.f19142c = interfaceC7881f1;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(p201g.p259r.AbstractC7905j0<Value> r5, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p201g.p259r.C7942l0.C7953i.C7954a.C7955a.C7956a
                        if (r0 == 0) goto L13
                        r0 = r6
                        g.r.l0$i$a$a$a r0 = (p201g.p259r.C7942l0.C7953i.C7954a.C7955a.C7956a) r0
                        int r1 = r0.f19144d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f19144d = r1
                        goto L18
                    L13:
                        g.r.l0$i$a$a$a r0 = new g.r.l0$i$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f19143c
                        java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                        int r2 = r0.f19144d
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C13291q.m5357b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C13291q.m5357b(r6)
                        g.r.j0 r5 = (p201g.p259r.AbstractC7905j0) r5
                        g.r.f1 r6 = r4.f19142c     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
                        r0.f19144d = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
                        java.lang.Object r5 = r6.mo3639o(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L41
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        kotlin.w r5 = kotlin.C13666w.f30112a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.C7953i.C7954a.C7955a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7954a(C7942l0<Key, Value> c7942l0, InterfaceC7881f1<AbstractC7905j0<Value>> interfaceC7881f1, InterfaceC11714d<? super C7954a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19140d = c7942l0;
                this.f19141e = interfaceC7881f1;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C7954a(this.f19140d, this.f19141e, interfaceC11714d);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7954a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f19139c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    InterfaceC13964d m3327g = C13971f.m3327g(((C7942l0) this.f19140d).f19079k);
                    C7955a c7955a = new C7955a(this.f19141e);
                    this.f19139c = 1;
                    if (m3327g.mo3175a(c7955a, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
        /* renamed from: g.r.l0$i$b */
        /* loaded from: classes2.dex */
        public static final class C7957b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19146c;

            /* renamed from: d */
            final /* synthetic */ C7942l0<Key, Value> f19147d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13779f<C13666w> f19148e;

            /* compiled from: Collect.kt */
            /* renamed from: g.r.l0$i$b$a */
            /* loaded from: classes2.dex */
            public static final class C7958a implements InterfaceC13969e<C13666w> {

                /* renamed from: c */
                final /* synthetic */ InterfaceC13779f f19149c;

                public C7958a(InterfaceC13779f interfaceC13779f) {
                    this.f19149c = interfaceC13779f;
                }

                @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                public Object emit(C13666w c13666w, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                    Object m10387d;
                    Object mo3640k = this.f19149c.mo3640k(c13666w);
                    m10387d = C11734d.m10387d();
                    return mo3640k == m10387d ? mo3640k : C13666w.f30112a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7957b(C7942l0<Key, Value> c7942l0, InterfaceC13779f<C13666w> interfaceC13779f, InterfaceC11714d<? super C7957b> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19147d = c7942l0;
                this.f19148e = interfaceC13779f;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C7957b(this.f19147d, this.f19148e, interfaceC11714d);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7957b) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f19146c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    InterfaceC13964d interfaceC13964d = ((C7942l0) this.f19147d).f19072d;
                    C7958a c7958a = new C7958a(this.f19148e);
                    this.f19146c = 1;
                    if (interfaceC13964d.mo3175a(c7958a, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
        /* renamed from: g.r.l0$i$c */
        /* loaded from: classes2.dex */
        public static final class C7959c extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19150c;

            /* renamed from: d */
            private /* synthetic */ Object f19151d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13779f<C13666w> f19152e;

            /* renamed from: f */
            final /* synthetic */ C7942l0<Key, Value> f19153f;

            /* compiled from: PageFetcherSnapshot.kt */
            /* renamed from: g.r.l0$i$c$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C7960a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f19154a;

                static {
                    int[] iArr = new int[EnumC7830b0.values().length];
                    iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
                    f19154a = iArr;
                }
            }

            /* compiled from: Collect.kt */
            /* renamed from: g.r.l0$i$c$b */
            /* loaded from: classes2.dex */
            public static final class C7961b implements InterfaceC13969e<C13666w> {

                /* renamed from: c */
                final /* synthetic */ C7942l0 f19155c;

                /* renamed from: d */
                final /* synthetic */ InterfaceC13932m0 f19156d;

                @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {142, 164, 157, 181, 169, 195, 213, 157, 224, 169, 235, 247, 157, 258, 169, 269}, m = "emit")
                /* renamed from: g.r.l0$i$c$b$a */
                /* loaded from: classes2.dex */
                public static final class C7962a extends AbstractC11738d {

                    /* renamed from: A */
                    Object f19157A;

                    /* renamed from: B */
                    Object f19158B;

                    /* renamed from: c */
                    /* synthetic */ Object f19159c;

                    /* renamed from: d */
                    int f19160d;

                    /* renamed from: f */
                    Object f19162f;

                    /* renamed from: w */
                    Object f19163w;

                    /* renamed from: x */
                    Object f19164x;

                    /* renamed from: y */
                    Object f19165y;

                    /* renamed from: z */
                    Object f19166z;

                    public C7962a(InterfaceC11714d interfaceC11714d) {
                        super(interfaceC11714d);
                    }

                    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                    public final Object invokeSuspend(Object obj) {
                        this.f19159c = obj;
                        this.f19160d |= Integer.MIN_VALUE;
                        return C7961b.this.emit(null, this);
                    }
                }

                public C7961b(C7942l0 c7942l0, InterfaceC13932m0 interfaceC13932m0) {
                    this.f19155c = c7942l0;
                    this.f19156d = interfaceC13932m0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:100:0x032e  */
                /* JADX WARN: Removed duplicated region for block: B:101:0x0333  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0384 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x038b  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x03d8  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0411 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0412  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0425  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x042a  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0477 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0478  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x047d  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x04b0  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x01ae  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x01be  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0213  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0222  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0226  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x023c  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x028b A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x02c3  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x02dc  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x02df  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0319 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x031a  */
                /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.w] */
                /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v101 */
                /* JADX WARN: Type inference failed for: r11v102 */
                /* JADX WARN: Type inference failed for: r11v16, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v2, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v44, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v71, types: [kotlinx.coroutines.v2.b] */
                /* JADX WARN: Type inference failed for: r11v95 */
                /* JADX WARN: Type inference failed for: r11v96 */
                /* JADX WARN: Type inference failed for: r11v97 */
                /* JADX WARN: Type inference failed for: r11v98 */
                @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(kotlin.C13666w r11, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r12) {
                    /*
                        Method dump skipped, instructions count: 1282
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.C7953i.C7959c.C7961b.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7959c(InterfaceC13779f<C13666w> interfaceC13779f, C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7959c> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19152e = interfaceC13779f;
                this.f19153f = c7942l0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C7959c c7959c = new C7959c(this.f19152e, this.f19153f, interfaceC11714d);
                c7959c.f19151d = obj;
                return c7959c;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7959c) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f19150c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    InterfaceC13964d m3327g = C13971f.m3327g(this.f19152e);
                    C7961b c7961b = new C7961b(this.f19153f, (InterfaceC13932m0) this.f19151d);
                    this.f19150c = 1;
                    if (m3327g.mo3175a(c7961b, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7953i(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7953i> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19138x = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7953i c7953i = new C7953i(this.f19138x, interfaceC11714d);
            c7953i.f19137w = obj;
            return c7953i;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0101 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.C7953i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC7881f1<AbstractC7905j0<Value>> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7953i) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {608, 174}, m = "invokeSuspend")
    /* renamed from: g.r.l0$j */
    /* loaded from: classes2.dex */
    static final class C7963j extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super AbstractC7905j0<Value>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19167c;

        /* renamed from: d */
        Object f19168d;

        /* renamed from: e */
        int f19169e;

        /* renamed from: f */
        private /* synthetic */ Object f19170f;

        /* renamed from: w */
        final /* synthetic */ C7942l0<Key, Value> f19171w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7963j(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7963j> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19171w = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7963j c7963j = new C7963j(this.f19171w, interfaceC11714d);
            c7963j.f19170f = obj;
            return c7963j;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            InterfaceC13969e interfaceC13969e;
            C7977n0.C7978a c7978a;
            InterfaceC14094b interfaceC14094b;
            m10387d = C11734d.m10387d();
            int i = this.f19169e;
            try {
                if (i == 0) {
                    C13291q.m5357b(obj);
                    interfaceC13969e = (InterfaceC13969e) this.f19170f;
                    c7978a = ((C7942l0) this.f19171w).f19080l;
                    InterfaceC14094b m16952a = C7977n0.C7978a.m16952a(c7978a);
                    this.f19170f = c7978a;
                    this.f19167c = m16952a;
                    this.f19168d = interfaceC13969e;
                    this.f19169e = 1;
                    if (m16952a.mo2980a(null, this) == m10387d) {
                        return m10387d;
                    }
                    interfaceC14094b = m16952a;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13291q.m5357b(obj);
                    return C13666w.f30112a;
                } else {
                    interfaceC13969e = (InterfaceC13969e) this.f19168d;
                    interfaceC14094b = (InterfaceC14094b) this.f19167c;
                    c7978a = (C7977n0.C7978a) this.f19170f;
                    C13291q.m5357b(obj);
                }
                C7825a0 m17124d = C7977n0.C7978a.m16951b(c7978a).m16958p().m17124d();
                interfaceC14094b.mo2979b(null);
                AbstractC7905j0.C7910c c7910c = new AbstractC7905j0.C7910c(m17124d, null, 2, null);
                this.f19170f = null;
                this.f19167c = null;
                this.f19168d = null;
                this.f19169e = 2;
                if (interfaceC13969e.emit(c7910c, this) == m10387d) {
                    return m10387d;
                }
                return C13666w.f30112a;
            } catch (Throwable th) {
                interfaceC14094b.mo2979b(null);
                throw th;
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super AbstractC7905j0<Value>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7963j) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1", f = "PageFetcherSnapshot.kt", l = {222}, m = "invokeSuspend")
    /* renamed from: g.r.l0$k */
    /* loaded from: classes2.dex */
    public static final class C7964k extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19172c;

        /* renamed from: d */
        final /* synthetic */ C7942l0<Key, Value> f19173d;

        /* renamed from: e */
        final /* synthetic */ EnumC7830b0 f19174e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageFetcherSnapshot.kt */
        @f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$2", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
        /* renamed from: g.r.l0$k$a */
        /* loaded from: classes2.dex */
        public static final class C7965a extends AbstractC11745k implements InterfaceC11771p<AbstractC7982n1, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19175c;

            /* renamed from: d */
            final /* synthetic */ C7942l0<Key, Value> f19176d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7965a(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7965a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19176d = c7942l0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C7965a(this.f19176d, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                C11734d.m10387d();
                if (this.f19175c == 0) {
                    C13291q.m5357b(obj);
                    ((C7942l0) this.f19176d).f19076h.invoke();
                    return C13666w.f30112a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: m */
            public final Object invoke(AbstractC7982n1 abstractC7982n1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7965a) create(abstractC7982n1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* compiled from: SafeCollector.common.kt */
        /* renamed from: g.r.l0$k$b */
        /* loaded from: classes2.dex */
        public static final class C7966b implements InterfaceC13964d<AbstractC7982n1> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13964d f19177c;

            /* renamed from: d */
            final /* synthetic */ C7942l0 f19178d;

            /* compiled from: Collect.kt */
            /* renamed from: g.r.l0$k$b$a */
            /* loaded from: classes2.dex */
            public static final class C7967a implements InterfaceC13969e<AbstractC7982n1> {

                /* renamed from: c */
                final /* synthetic */ InterfaceC13969e f19179c;

                /* renamed from: d */
                final /* synthetic */ C7942l0 f19180d;

                @f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
                /* renamed from: g.r.l0$k$b$a$a */
                /* loaded from: classes2.dex */
                public static final class C7968a extends AbstractC11738d {

                    /* renamed from: c */
                    /* synthetic */ Object f19181c;

                    /* renamed from: d */
                    int f19182d;

                    public C7968a(InterfaceC11714d interfaceC11714d) {
                        super(interfaceC11714d);
                    }

                    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                    public final Object invokeSuspend(Object obj) {
                        this.f19181c = obj;
                        this.f19182d |= Integer.MIN_VALUE;
                        return C7967a.this.emit(null, this);
                    }
                }

                public C7967a(InterfaceC13969e interfaceC13969e, C7942l0 c7942l0) {
                    this.f19179c = interfaceC13969e;
                    this.f19180d = c7942l0;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(p201g.p259r.AbstractC7982n1 r7, kotlin.p476c0.InterfaceC11714d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p201g.p259r.C7942l0.C7964k.C7966b.C7967a.C7968a
                        if (r0 == 0) goto L13
                        r0 = r8
                        g.r.l0$k$b$a$a r0 = (p201g.p259r.C7942l0.C7964k.C7966b.C7967a.C7968a) r0
                        int r1 = r0.f19182d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f19182d = r1
                        goto L18
                    L13:
                        g.r.l0$k$b$a$a r0 = new g.r.l0$k$b$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f19181c
                        java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                        int r2 = r0.f19182d
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C13291q.m5357b(r8)
                        goto L68
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.C13291q.m5357b(r8)
                        kotlinx.coroutines.q2.e r8 = r6.f19179c
                        r2 = r7
                        g.r.n1 r2 = (p201g.p259r.AbstractC7982n1) r2
                        int r4 = r2.m16945d()
                        int r4 = r4 * (-1)
                        g.r.l0 r5 = r6.f19180d
                        g.r.q0 r5 = p201g.p259r.C7942l0.m17007d(r5)
                        int r5 = r5.f19276f
                        if (r4 > r5) goto L5c
                        int r2 = r2.m16946c()
                        int r2 = r2 * (-1)
                        g.r.l0 r4 = r6.f19180d
                        g.r.q0 r4 = p201g.p259r.C7942l0.m17007d(r4)
                        int r4 = r4.f19276f
                        if (r2 <= r4) goto L5a
                        goto L5c
                    L5a:
                        r2 = 0
                        goto L5d
                    L5c:
                        r2 = 1
                    L5d:
                        if (r2 == 0) goto L68
                        r0.f19182d = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L68
                        return r1
                    L68:
                        kotlin.w r7 = kotlin.C13666w.f30112a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.C7964k.C7966b.C7967a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
                }
            }

            public C7966b(InterfaceC13964d interfaceC13964d, C7942l0 c7942l0) {
                this.f19177c = interfaceC13964d;
                this.f19178d = c7942l0;
            }

            @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
            /* renamed from: a */
            public Object mo3175a(InterfaceC13969e<? super AbstractC7982n1> interfaceC13969e, InterfaceC11714d interfaceC11714d) {
                Object m10387d;
                Object mo3175a = this.f19177c.mo3175a(new C7967a(interfaceC13969e, this.f19178d), interfaceC11714d);
                m10387d = C11734d.m10387d();
                return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7964k(C7942l0<Key, Value> c7942l0, EnumC7830b0 enumC7830b0, InterfaceC11714d<? super C7964k> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19173d = c7942l0;
            this.f19174e = enumC7830b0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7964k(this.f19173d, this.f19174e, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7964k) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19172c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C7966b c7966b = new C7966b(((C7942l0) this.f19173d).f19077i.m16886c(this.f19174e), this.f19173d);
                C7965a c7965a = new C7965a(this.f19173d, null);
                this.f19172c = 1;
                if (C13971f.m3329e(c7966b, c7965a, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", l = {608, 229}, m = "invokeSuspend")
    /* renamed from: g.r.l0$l */
    /* loaded from: classes2.dex */
    public static final class C7969l extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19184c;

        /* renamed from: d */
        Object f19185d;

        /* renamed from: e */
        Object f19186e;

        /* renamed from: f */
        int f19187f;

        /* renamed from: w */
        final /* synthetic */ C7942l0<Key, Value> f19188w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7969l(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7969l> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19188w = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7969l(this.f19188w, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7969l) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            C7942l0<Key, Value> c7942l0;
            C7977n0.C7978a c7978a;
            InterfaceC14094b interfaceC14094b;
            m10387d = C11734d.m10387d();
            int i = this.f19187f;
            try {
                if (i == 0) {
                    C13291q.m5357b(obj);
                    c7942l0 = this.f19188w;
                    c7978a = ((C7942l0) c7942l0).f19080l;
                    InterfaceC14094b m16952a = C7977n0.C7978a.m16952a(c7978a);
                    this.f19184c = c7978a;
                    this.f19185d = m16952a;
                    this.f19186e = c7942l0;
                    this.f19187f = 1;
                    if (m16952a.mo2980a(null, this) == m10387d) {
                        return m10387d;
                    }
                    interfaceC14094b = m16952a;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13291q.m5357b(obj);
                    return C13666w.f30112a;
                } else {
                    c7942l0 = (C7942l0) this.f19186e;
                    interfaceC14094b = (InterfaceC14094b) this.f19185d;
                    c7978a = (C7977n0.C7978a) this.f19184c;
                    C13291q.m5357b(obj);
                }
                InterfaceC13964d<Integer> m16968f = C7977n0.C7978a.m16951b(c7978a).m16968f();
                interfaceC14094b.mo2979b(null);
                EnumC7830b0 enumC7830b0 = EnumC7830b0.PREPEND;
                this.f19184c = null;
                this.f19185d = null;
                this.f19186e = null;
                this.f19187f = 2;
                if (c7942l0.m16993r(m16968f, enumC7830b0, this) == m10387d) {
                    return m10387d;
                }
                return C13666w.f30112a;
            } catch (Throwable th) {
                interfaceC14094b.mo2979b(null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageFetcherSnapshot.kt */
    @f(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {608, 234}, m = "invokeSuspend")
    /* renamed from: g.r.l0$m */
    /* loaded from: classes2.dex */
    public static final class C7970m extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19189c;

        /* renamed from: d */
        Object f19190d;

        /* renamed from: e */
        Object f19191e;

        /* renamed from: f */
        int f19192f;

        /* renamed from: w */
        final /* synthetic */ C7942l0<Key, Value> f19193w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7970m(C7942l0<Key, Value> c7942l0, InterfaceC11714d<? super C7970m> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19193w = c7942l0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7970m(this.f19193w, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7970m) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            C7942l0<Key, Value> c7942l0;
            C7977n0.C7978a c7978a;
            InterfaceC14094b interfaceC14094b;
            m10387d = C11734d.m10387d();
            int i = this.f19192f;
            try {
                if (i == 0) {
                    C13291q.m5357b(obj);
                    c7942l0 = this.f19193w;
                    c7978a = ((C7942l0) c7942l0).f19080l;
                    InterfaceC14094b m16952a = C7977n0.C7978a.m16952a(c7978a);
                    this.f19189c = c7978a;
                    this.f19190d = m16952a;
                    this.f19191e = c7942l0;
                    this.f19192f = 1;
                    if (m16952a.mo2980a(null, this) == m10387d) {
                        return m10387d;
                    }
                    interfaceC14094b = m16952a;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13291q.m5357b(obj);
                    return C13666w.f30112a;
                } else {
                    c7942l0 = (C7942l0) this.f19191e;
                    interfaceC14094b = (InterfaceC14094b) this.f19190d;
                    c7978a = (C7977n0.C7978a) this.f19189c;
                    C13291q.m5357b(obj);
                }
                InterfaceC13964d<Integer> m16969e = C7977n0.C7978a.m16951b(c7978a).m16969e();
                interfaceC14094b.mo2979b(null);
                EnumC7830b0 enumC7830b0 = EnumC7830b0.APPEND;
                this.f19189c = null;
                this.f19190d = null;
                this.f19191e = null;
                this.f19192f = 2;
                if (c7942l0.m16993r(m16969e, enumC7830b0, this) == m10387d) {
                    return m10387d;
                }
                return C13666w.f30112a;
            } catch (Throwable th) {
                interfaceC14094b.mo2979b(null);
                throw th;
            }
        }
    }

    public C7942l0(Key key, AbstractC8041v0<Key, Value> abstractC8041v0, C8003q0 c8003q0, InterfaceC13964d<C13666w> interfaceC13964d, boolean z, InterfaceC7831b1<Key, Value> interfaceC7831b1, C8053w0<Key, Value> c8053w0, InterfaceC11756a<C13666w> interfaceC11756a) {
        InterfaceC14112z m3160b;
        l.f(abstractC8041v0, "pagingSource");
        l.f(c8003q0, "config");
        l.f(interfaceC13964d, "retryFlow");
        l.f(interfaceC11756a, "invalidate");
        this.f19069a = key;
        this.f19070b = abstractC8041v0;
        this.f19071c = c8003q0;
        this.f19072d = interfaceC13964d;
        this.f19073e = z;
        this.f19074f = interfaceC7831b1;
        this.f19075g = c8053w0;
        this.f19076h = interfaceC11756a;
        if (c8003q0.f19276f == Integer.MIN_VALUE || abstractC8041v0.getJumpingSupported()) {
            this.f19077i = new C8022t();
            this.f19078j = new AtomicBoolean(false);
            this.f19079k = C13783i.m3686b(-2, null, null, 6, null);
            this.f19080l = new C7977n0.C7978a<>(this.f19071c);
            m3160b = C14057t1.m3160b(null, 1, null);
            this.f19081m = m3160b;
            this.f19082n = C13971f.m3314t(C7882g.m17113a(m3160b, new C7953i(this, null)), new C7963j(this, null));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    /* renamed from: A */
    private final Key m17015A(C7977n0<Key, Value> c7977n0, EnumC7830b0 enumC7830b0, int i, int i2) {
        if (i == c7977n0.m16964j(enumC7830b0) && !(c7977n0.m16958p().m17127a(enumC7830b0) instanceof AbstractC8061y.C8062a) && i2 < this.f19071c.f19272b) {
            if (enumC7830b0 == EnumC7830b0.PREPEND) {
                return (Key) ((AbstractC8041v0.AbstractC8048b.C8050b) C13722p.m3954R(c7977n0.m16961m())).m16819g();
            }
            return (Key) ((AbstractC8041v0.AbstractC8048b.C8050b) C13722p.m3943c0(c7977n0.m16961m())).m16820f();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final Object m17014B(EnumC7830b0 enumC7830b0, AbstractC7982n1 abstractC7982n1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (C7943a.f19083a[enumC7830b0.ordinal()] == 1) {
            Object m16991t = m16991t(interfaceC11714d);
            m10387d = C11734d.m10387d();
            return m16991t == m10387d ? m16991t : C13666w.f30112a;
        }
        if (abstractC7982n1 != null) {
            this.f19077i.m16888a(enumC7830b0, abstractC7982n1);
            return C13666w.f30112a;
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
    }

    /* renamed from: C */
    private final Object m17013C(C7977n0<Key, Value> c7977n0, EnumC7830b0 enumC7830b0, AbstractC8061y.C8062a c8062a, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (!l.b(c7977n0.m16958p().m17127a(enumC7830b0), c8062a)) {
            c7977n0.m16958p().m17125c(enumC7830b0, c8062a);
            Object mo3639o = this.f19079k.mo3639o(new AbstractC7905j0.C7910c(c7977n0.m16958p().m17124d(), null), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
        }
        return C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final Object m17012D(C7977n0<Key, Value> c7977n0, EnumC7830b0 enumC7830b0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (!l.b(c7977n0.m16958p().m17127a(enumC7830b0), AbstractC8061y.C8063b.f19410b)) {
            c7977n0.m16958p().m17125c(enumC7830b0, AbstractC8061y.C8063b.f19410b);
            Object mo3639o = this.f19079k.mo3639o(new AbstractC7905j0.C7910c(c7977n0.m16958p().m17124d(), null), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3639o == m10387d ? mo3639o : C13666w.f30112a;
        }
        return C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m17011E(InterfaceC13932m0 interfaceC13932m0) {
        List<EnumC7830b0> m3888h;
        if (this.f19071c.f19276f != Integer.MIN_VALUE) {
            m3888h = C13726r.m3888h(EnumC7830b0.APPEND, EnumC7830b0.PREPEND);
            for (EnumC7830b0 enumC7830b0 : m3888h) {
                C13916j.m3412b(interfaceC13932m0, null, null, new C7964k(this, enumC7830b0, null), 3, null);
            }
        }
        C13916j.m3412b(interfaceC13932m0, null, null, new C7969l(this, null), 3, null);
        C13916j.m3412b(interfaceC13932m0, null, null, new C7970m(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final Object m16993r(InterfaceC13964d<Integer> interfaceC13964d, EnumC7830b0 enumC7830b0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3175a = C13971f.m3328f(C8004r.m16904b(C8004r.m16902d(interfaceC13964d, new C7945c(null, this, enumC7830b0)), new C7946d(enumC7830b0, null))).mo3175a(new C7944b(enumC7830b0), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[Catch: all -> 0x023d, TryCatch #5 {all -> 0x023d, blocks: (B:51:0x013d, B:53:0x0163, B:54:0x0172, B:56:0x017b), top: B:124:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b A[Catch: all -> 0x023d, TRY_LEAVE, TryCatch #5 {all -> 0x023d, blocks: (B:51:0x013d, B:53:0x0163, B:54:0x0172, B:56:0x017b), top: B:124:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0242  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.v2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.v2.b] */
    /* JADX WARN: Type inference failed for: r2v30, types: [kotlinx.coroutines.v2.b] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.v2.b] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16991t(kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r12) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.m16991t(kotlin.c0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x051d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x053b A[Catch: all -> 0x0680, TRY_LEAVE, TryCatch #0 {all -> 0x0680, blocks: (B:170:0x0529, B:173:0x053b, B:177:0x0559), top: B:253:0x0529 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x058a A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:182:0x0573, B:184:0x058a, B:186:0x0596, B:188:0x059e, B:190:0x05ab, B:189:0x05a5, B:191:0x05ae, B:195:0x05d0, B:199:0x05e3, B:181:0x056b, B:14:0x0086, B:17:0x00b7), top: B:257:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x059e A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:182:0x0573, B:184:0x058a, B:186:0x0596, B:188:0x059e, B:190:0x05ab, B:189:0x05a5, B:191:0x05ae, B:195:0x05d0, B:199:0x05e3, B:181:0x056b, B:14:0x0086, B:17:0x00b7), top: B:257:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05a5 A[Catch: all -> 0x00bc, TryCatch #7 {all -> 0x00bc, blocks: (B:182:0x0573, B:184:0x058a, B:186:0x0596, B:188:0x059e, B:190:0x05ab, B:189:0x05a5, B:191:0x05ae, B:195:0x05d0, B:199:0x05e3, B:181:0x056b, B:14:0x0086, B:17:0x00b7), top: B:257:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0693 A[Catch: all -> 0x0699, TRY_ENTER, TryCatch #3 {all -> 0x0699, blocks: (B:47:0x0222, B:72:0x02d4, B:54:0x0239, B:56:0x0249, B:57:0x0256, B:59:0x0260, B:63:0x027e, B:65:0x0297, B:68:0x02b6, B:245:0x0693, B:246:0x0698), top: B:259:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0326 A[Catch: all -> 0x068b, TRY_LEAVE, TryCatch #6 {all -> 0x068b, blocks: (B:77:0x030b, B:80:0x0326), top: B:264:0x030b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    /* JADX WARN: Type inference failed for: r12v45, types: [g.r.l0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.v2.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x063a -> B:269:0x0640). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x0673 -> B:86:0x0352). Please submit an issue!!! */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16990u(p201g.p259r.EnumC7830b0 r18, p201g.p259r.C8015s r19, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r20) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.m16990u(g.r.b0, g.r.s, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: z */
    private final AbstractC8041v0.AbstractC8042a<Key> m16985z(EnumC7830b0 enumC7830b0, Key key) {
        return AbstractC8041v0.AbstractC8042a.f19375c.m16828a(enumC7830b0, key, enumC7830b0 == EnumC7830b0.REFRESH ? this.f19071c.f19274d : this.f19071c.f19271a, this.f19071c.f19273c);
    }

    /* renamed from: p */
    public final void m16995p(AbstractC7982n1 abstractC7982n1) {
        l.f(abstractC7982n1, "viewportHint");
        this.f19077i.m16885d(abstractC7982n1);
    }

    /* renamed from: q */
    public final void m16994q() {
        InterfaceC13947p1.C13948a.m3353a(this.f19081m, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16992s(kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.C8053w0<Key, Value>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p201g.p259r.C7942l0.C7950f
            if (r0 == 0) goto L13
            r0 = r6
            g.r.l0$f r0 = (p201g.p259r.C7942l0.C7950f) r0
            int r1 = r0.f19109x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19109x = r1
            goto L18
        L13:
            g.r.l0$f r0 = new g.r.l0$f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f19107f
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19109x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r1 = r0.f19106e
            kotlinx.coroutines.v2.b r1 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r1
            java.lang.Object r2 = r0.f19105d
            g.r.n0$a r2 = (p201g.p259r.C7977n0.C7978a) r2
            java.lang.Object r0 = r0.f19104c
            g.r.l0 r0 = (p201g.p259r.C7942l0) r0
            kotlin.C13291q.m5357b(r6)
            goto L58
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            kotlin.C13291q.m5357b(r6)
            g.r.n0$a<Key, Value> r2 = r5.f19080l
            kotlinx.coroutines.v2.b r6 = p201g.p259r.C7977n0.C7978a.m16952a(r2)
            r0.f19104c = r5
            r0.f19105d = r2
            r0.f19106e = r6
            r0.f19109x = r4
            java.lang.Object r0 = r6.mo2980a(r3, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r5
            r1 = r6
        L58:
            g.r.n0 r6 = p201g.p259r.C7977n0.C7978a.m16951b(r2)     // Catch: java.lang.Throwable -> L6a
            g.r.t r0 = r0.f19077i     // Catch: java.lang.Throwable -> L6a
            g.r.n1$a r0 = r0.m16887b()     // Catch: java.lang.Throwable -> L6a
            g.r.w0 r6 = r6.m16967g(r0)     // Catch: java.lang.Throwable -> L6a
            r1.mo2979b(r3)
            return r6
        L6a:
            r6 = move-exception
            r1.mo2979b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7942l0.m16992s(kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: v */
    public final Key m16989v() {
        return this.f19069a;
    }

    /* renamed from: w */
    public final InterfaceC13964d<AbstractC7905j0<Value>> m16988w() {
        return this.f19082n;
    }

    /* renamed from: x */
    public final AbstractC8041v0<Key, Value> m16987x() {
        return this.f19070b;
    }

    /* renamed from: y */
    public final InterfaceC7831b1<Key, Value> m16986y() {
        return this.f19074f;
    }
}
