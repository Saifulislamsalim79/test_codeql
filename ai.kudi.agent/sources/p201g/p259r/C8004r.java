package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.C11812w;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: R
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: FlowExt.kt */
/* renamed from: g.r.r */
/* loaded from: classes2.dex */
public final class C8004r {

    /* renamed from: a */
    private static final Object f19277a = new Object();

    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
    /* renamed from: g.r.r$a */
    /* loaded from: classes2.dex */
    static final class C8005a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19278c;

        /* renamed from: d */
        private /* synthetic */ Object f19279d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13964d<T> f19280e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11772q<T, T, InterfaceC11714d<? super T>, Object> f19281f;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.r$a$a */
        /* loaded from: classes2.dex */
        public static final class C8006a implements InterfaceC13969e<T> {

            /* renamed from: c */
            final /* synthetic */ C11812w f19282c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC11772q f19283d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13969e f19284e;

            @f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {139, 142}, m = "emit")
            /* renamed from: g.r.r$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C8007a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f19285c;

                /* renamed from: d */
                int f19286d;

                /* renamed from: f */
                Object f19288f;

                /* renamed from: w */
                Object f19289w;

                public C8007a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f19285c = obj;
                    this.f19286d |= Integer.MIN_VALUE;
                    return C8006a.this.emit(null, this);
                }
            }

            public C8006a(C11812w c11812w, InterfaceC11772q interfaceC11772q, InterfaceC13969e interfaceC13969e) {
                this.f19282c = c11812w;
                this.f19283d = interfaceC11772q;
                this.f19284e = interfaceC13969e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[RETURN] */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r8, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p201g.p259r.C8004r.C8005a.C8006a.C8007a
                    if (r0 == 0) goto L13
                    r0 = r9
                    g.r.r$a$a$a r0 = (p201g.p259r.C8004r.C8005a.C8006a.C8007a) r0
                    int r1 = r0.f19286d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19286d = r1
                    goto L18
                L13:
                    g.r.r$a$a$a r0 = new g.r.r$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f19285c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f19286d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L43
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C13291q.m5357b(r9)
                    goto L83
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f19289w
                    kotlin.e0.d.w r8 = (kotlin.p483e0.p485d.C11812w) r8
                    java.lang.Object r2 = r0.f19288f
                    g.r.r$a$a r2 = (p201g.p259r.C8004r.C8005a.C8006a) r2
                    kotlin.C13291q.m5357b(r9)
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L6d
                L43:
                    kotlin.C13291q.m5357b(r9)
                    kotlin.e0.d.w r9 = r7.f19282c
                    T r2 = r9.f26499c
                    java.lang.Object r5 = p201g.p259r.C8004r.m16905a()
                    if (r2 != r5) goto L52
                L50:
                    r2 = r7
                    goto L6d
                L52:
                    kotlin.e0.c.q r2 = r7.f19283d
                    kotlin.e0.d.w r5 = r7.f19282c
                    T r5 = r5.f26499c
                    r0.f19288f = r7
                    r0.f19289w = r9
                    r0.f19286d = r4
                    r4 = 6
                    kotlin.p483e0.p485d.C11801k.m10321a(r4)
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    r2 = 7
                    kotlin.p483e0.p485d.C11801k.m10321a(r2)
                    if (r8 != r1) goto L50
                    return r1
                L6d:
                    r9.f26499c = r8
                    kotlinx.coroutines.q2.e r8 = r2.f19284e
                    kotlin.e0.d.w r9 = r2.f19282c
                    T r9 = r9.f26499c
                    r2 = 0
                    r0.f19288f = r2
                    r0.f19289w = r2
                    r0.f19286d = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L83
                    return r1
                L83:
                    kotlin.w r8 = kotlin.C13666w.f30112a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8004r.C8005a.C8006a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8005a(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super T, ? super T, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11772q, InterfaceC11714d<? super C8005a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19280e = interfaceC13964d;
            this.f19281f = interfaceC11772q;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C8005a c8005a = new C8005a(this.f19280e, this.f19281f, interfaceC11714d);
            c8005a.f19279d = obj;
            return c8005a;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19278c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C11812w c11812w = new C11812w();
                c11812w.f26499c = C8004r.f19277a;
                InterfaceC13964d<T> interfaceC13964d = this.f19280e;
                C8006a c8006a = new C8006a(c11812w, this.f19281f, (InterfaceC13969e) this.f19279d);
                this.f19278c = 1;
                if (interfaceC13964d.mo3175a(c8006a, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8005a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {52, 222}, m = "invokeSuspend")
    /* renamed from: g.r.r$b */
    /* loaded from: classes2.dex */
    static final class C8008b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super R>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f19290c;

        /* renamed from: d */
        int f19291d;

        /* renamed from: e */
        private /* synthetic */ Object f19292e;

        /* renamed from: f */
        final /* synthetic */ R f19293f;

        /* renamed from: w */
        final /* synthetic */ InterfaceC13964d<T> f19294w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11772q<R, T, InterfaceC11714d<? super R>, Object> f19295x;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.r$b$a */
        /* loaded from: classes2.dex */
        public static final class C8009a implements InterfaceC13969e<T> {

            /* renamed from: c */
            final /* synthetic */ C11812w f19296c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC11772q f19297d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13969e f19298e;

            @f(c = "androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {135, 136}, m = "emit")
            /* renamed from: g.r.r$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C8010a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f19299c;

                /* renamed from: d */
                int f19300d;

                /* renamed from: f */
                Object f19302f;

                /* renamed from: w */
                Object f19303w;

                public C8010a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f19299c = obj;
                    this.f19300d |= Integer.MIN_VALUE;
                    return C8009a.this.emit(null, this);
                }
            }

            public C8009a(C11812w c11812w, InterfaceC11772q interfaceC11772q, InterfaceC13969e interfaceC13969e) {
                this.f19296c = c11812w;
                this.f19297d = interfaceC11772q;
                this.f19298e = interfaceC13969e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r8, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p201g.p259r.C8004r.C8008b.C8009a.C8010a
                    if (r0 == 0) goto L13
                    r0 = r9
                    g.r.r$b$a$a r0 = (p201g.p259r.C8004r.C8008b.C8009a.C8010a) r0
                    int r1 = r0.f19300d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19300d = r1
                    goto L18
                L13:
                    g.r.r$b$a$a r0 = new g.r.r$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f19299c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f19300d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C13291q.m5357b(r9)
                    goto L78
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f19303w
                    kotlin.e0.d.w r8 = (kotlin.p483e0.p485d.C11812w) r8
                    java.lang.Object r2 = r0.f19302f
                    g.r.r$b$a r2 = (p201g.p259r.C8004r.C8008b.C8009a) r2
                    kotlin.C13291q.m5357b(r9)
                    goto L62
                L40:
                    kotlin.C13291q.m5357b(r9)
                    kotlin.e0.d.w r9 = r7.f19296c
                    kotlin.e0.c.q r2 = r7.f19297d
                    T r5 = r9.f26499c
                    r0.f19302f = r7
                    r0.f19303w = r9
                    r0.f19300d = r4
                    r4 = 6
                    kotlin.p483e0.p485d.C11801k.m10321a(r4)
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    r2 = 7
                    kotlin.p483e0.p485d.C11801k.m10321a(r2)
                    if (r8 != r1) goto L5e
                    return r1
                L5e:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L62:
                    r8.f26499c = r9
                    kotlinx.coroutines.q2.e r8 = r2.f19298e
                    kotlin.e0.d.w r9 = r2.f19296c
                    T r9 = r9.f26499c
                    r2 = 0
                    r0.f19302f = r2
                    r0.f19303w = r2
                    r0.f19300d = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L78
                    return r1
                L78:
                    kotlin.w r8 = kotlin.C13666w.f30112a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C8004r.C8008b.C8009a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8008b(R r, InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super R, ? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11772q, InterfaceC11714d<? super C8008b> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19293f = r;
            this.f19294w = interfaceC13964d;
            this.f19295x = interfaceC11772q;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C8008b c8008b = new C8008b(this.f19293f, this.f19294w, this.f19295x, interfaceC11714d);
            c8008b.f19292e = obj;
            return c8008b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return m16900m((InterfaceC13969e) obj, interfaceC11714d);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [R, T, java.lang.Object] */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            C11812w c11812w;
            InterfaceC13969e interfaceC13969e;
            m10387d = C11734d.m10387d();
            int i = this.f19291d;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13969e interfaceC13969e2 = (InterfaceC13969e) this.f19292e;
                c11812w = new C11812w();
                ?? r4 = this.f19293f;
                c11812w.f26499c = r4;
                this.f19292e = interfaceC13969e2;
                this.f19290c = c11812w;
                this.f19291d = 1;
                if (interfaceC13969e2.emit(r4, this) == m10387d) {
                    return m10387d;
                }
                interfaceC13969e = interfaceC13969e2;
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13291q.m5357b(obj);
                return C13666w.f30112a;
            } else {
                c11812w = (C11812w) this.f19290c;
                interfaceC13969e = (InterfaceC13969e) this.f19292e;
                C13291q.m5357b(obj);
            }
            InterfaceC13964d<T> interfaceC13964d = this.f19294w;
            C8009a c8009a = new C8009a(c11812w, this.f19295x, interfaceC13969e);
            this.f19292e = null;
            this.f19290c = null;
            this.f19291d = 2;
            if (interfaceC13964d.mo3175a(c8009a, this) == m10387d) {
                return m10387d;
            }
            return C13666w.f30112a;
        }

        /* renamed from: m */
        public final Object m16900m(InterfaceC13969e<? super R> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8008b) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: g.r.r$c */
    /* loaded from: classes2.dex */
    static final class C8011c extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<R>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19304c;

        /* renamed from: d */
        private /* synthetic */ Object f19305d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13964d<T> f19306e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11772q<InterfaceC13969e<? super R>, T, InterfaceC11714d<? super C13666w>, Object> f19307f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowExt.kt */
        @f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: g.r.r$c$a */
        /* loaded from: classes2.dex */
        public static final class C8012a extends AbstractC11745k implements InterfaceC11771p<T, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f19308c;

            /* renamed from: d */
            /* synthetic */ Object f19309d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC11772q<InterfaceC13969e<? super R>, T, InterfaceC11714d<? super C13666w>, Object> f19310e;

            /* renamed from: f */
            final /* synthetic */ C7889h<R> f19311f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8012a(InterfaceC11772q<? super InterfaceC13969e<? super R>, ? super T, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q, C7889h<R> c7889h, InterfaceC11714d<? super C8012a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19310e = interfaceC11772q;
                this.f19311f = c7889h;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C8012a c8012a = new C8012a(this.f19310e, this.f19311f, interfaceC11714d);
                c8012a.f19309d = obj;
                return c8012a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return m16898m(obj, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f19308c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    Object obj2 = this.f19309d;
                    InterfaceC11772q<InterfaceC13969e<? super R>, T, InterfaceC11714d<? super C13666w>, Object> interfaceC11772q = this.f19310e;
                    InterfaceC13969e interfaceC13969e = this.f19311f;
                    this.f19308c = 1;
                    if (interfaceC11772q.invoke(interfaceC13969e, obj2, this) == m10387d) {
                        return m10387d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }

            /* renamed from: m */
            public final Object m16898m(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C8012a) create(t, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8011c(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super InterfaceC13969e<? super R>, ? super T, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q, InterfaceC11714d<? super C8011c> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19306e = interfaceC13964d;
            this.f19307f = interfaceC11772q;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C8011c c8011c = new C8011c(this.f19306e, this.f19307f, interfaceC11714d);
            c8011c.f19305d = obj;
            return c8011c;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return m16899m((InterfaceC7881f1) obj, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19304c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13964d<T> interfaceC13964d = this.f19306e;
                C8012a c8012a = new C8012a(this.f19307f, new C7889h((InterfaceC7881f1) this.f19305d), null);
                this.f19304c = 1;
                if (C13971f.m3329e(interfaceC13964d, c8012a, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        /* renamed from: m */
        public final Object m16899m(InterfaceC7881f1<R> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8011c) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    static {
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<T> m16904b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super T, ? super T, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11772q) {
        l.f(interfaceC13964d, "<this>");
        l.f(interfaceC11772q, "operation");
        return C13971f.m3319o(new C8005a(interfaceC13964d, interfaceC11772q, null));
    }

    /* renamed from: c */
    public static final <T, R> InterfaceC13964d<R> m16903c(InterfaceC13964d<? extends T> interfaceC13964d, R r, InterfaceC11772q<? super R, ? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11772q) {
        l.f(interfaceC13964d, "<this>");
        l.f(interfaceC11772q, "operation");
        return C13971f.m3319o(new C8008b(r, interfaceC13964d, interfaceC11772q, null));
    }

    /* renamed from: d */
    public static final <T, R> InterfaceC13964d<R> m16902d(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11772q<? super InterfaceC13969e<? super R>, ? super T, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q) {
        l.f(interfaceC13964d, "<this>");
        l.f(interfaceC11772q, "transform");
        return C7867e1.m17123a(new C8011c(interfaceC13964d, interfaceC11772q, null));
    }
}
