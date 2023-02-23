package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p476c0.p478k.p479a.C11736b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11811v;
import kotlin.p557z.C13705i0;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.EnumC13940o0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.C14030x;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p559q2.InterfaceC14021r;
import kotlinx.coroutines.p559q2.InterfaceC14025v;
/* compiled from: CachedPageEventFlow.kt */
/* renamed from: g.r.e */
/* loaded from: classes2.dex */
public final class C7855e<T> {

    /* renamed from: a */
    private final C7995p<T> f18811a;

    /* renamed from: b */
    private final InterfaceC14021r<C13705i0<AbstractC7905j0<T>>> f18812b;

    /* renamed from: c */
    private final InterfaceC14025v<C13705i0<AbstractC7905j0<T>>> f18813c;

    /* renamed from: d */
    private final InterfaceC13947p1 f18814d;

    /* renamed from: e */
    private final InterfaceC13964d<AbstractC7905j0<T>> f18815e;

    /* compiled from: CachedPageEventFlow.kt */
    @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: g.r.e$a */
    /* loaded from: classes2.dex */
    static final class C7856a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super AbstractC7905j0<T>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18816c;

        /* renamed from: d */
        private /* synthetic */ Object f18817d;

        /* renamed from: e */
        final /* synthetic */ C7855e<T> f18818e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CachedPageEventFlow.kt */
        @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: g.r.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C7857a extends AbstractC11745k implements InterfaceC11771p<C13705i0<? extends AbstractC7905j0<T>>, InterfaceC11714d<? super Boolean>, Object> {

            /* renamed from: c */
            int f18819c;

            /* renamed from: d */
            /* synthetic */ Object f18820d;

            C7857a(InterfaceC11714d<? super C7857a> interfaceC11714d) {
                super(2, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C7857a c7857a = new C7857a(interfaceC11714d);
                c7857a.f18820d = obj;
                return c7857a;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                C11734d.m10387d();
                if (this.f18819c == 0) {
                    C13291q.m5357b(obj);
                    return C11736b.m10382a(((C13705i0) this.f18820d) != null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            /* renamed from: m */
            public final Object invoke(C13705i0<? extends AbstractC7905j0<T>> c13705i0, InterfaceC11714d<? super Boolean> interfaceC11714d) {
                return ((C7857a) create(c13705i0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* compiled from: Collect.kt */
        /* renamed from: g.r.e$a$b */
        /* loaded from: classes2.dex */
        public static final class C7858b implements InterfaceC13969e<C13705i0<? extends AbstractC7905j0<T>>> {

            /* renamed from: c */
            final /* synthetic */ C11811v f18821c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC13969e f18822d;

            @f(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {136}, m = "emit")
            /* renamed from: g.r.e$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C7859a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f18823c;

                /* renamed from: d */
                int f18824d;

                /* renamed from: f */
                Object f18826f;

                /* renamed from: w */
                Object f18827w;

                public C7859a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f18823c = obj;
                    this.f18824d |= Integer.MIN_VALUE;
                    return C7858b.this.emit(null, this);
                }
            }

            public C7858b(C11811v c11811v, InterfaceC13969e interfaceC13969e) {
                this.f18821c = c11811v;
                this.f18822d = interfaceC13969e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(kotlin.p557z.C13705i0<? extends p201g.p259r.AbstractC7905j0<T>> r5, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p201g.p259r.C7855e.C7856a.C7858b.C7859a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g.r.e$a$b$a r0 = (p201g.p259r.C7855e.C7856a.C7858b.C7859a) r0
                    int r1 = r0.f18824d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18824d = r1
                    goto L18
                L13:
                    g.r.e$a$b$a r0 = new g.r.e$a$b$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f18823c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f18824d
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f18827w
                    kotlin.z.i0 r5 = (kotlin.p557z.C13705i0) r5
                    java.lang.Object r0 = r0.f18826f
                    g.r.e$a$b r0 = (p201g.p259r.C7855e.C7856a.C7858b) r0
                    kotlin.C13291q.m5357b(r6)
                    goto L5f
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.C13291q.m5357b(r6)
                    kotlin.z.i0 r5 = (kotlin.p557z.C13705i0) r5
                    kotlin.e0.d.l.d(r5)
                    int r6 = r5.m4117c()
                    kotlin.e0.d.v r2 = r4.f18821c
                    int r2 = r2.f26498c
                    if (r6 <= r2) goto L67
                    kotlinx.coroutines.q2.e r6 = r4.f18822d
                    java.lang.Object r2 = r5.m4116d()
                    r0.f18826f = r4
                    r0.f18827w = r5
                    r0.f18824d = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L5e
                    return r1
                L5e:
                    r0 = r4
                L5f:
                    kotlin.e0.d.v r6 = r0.f18821c
                    int r5 = r5.m4117c()
                    r6.f26498c = r5
                L67:
                    kotlin.w r5 = kotlin.C13666w.f30112a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7855e.C7856a.C7858b.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7856a(C7855e<T> c7855e, InterfaceC11714d<? super C7856a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18818e = c7855e;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7856a c7856a = new C7856a(this.f18818e, interfaceC11714d);
            c7856a.f18817d = obj;
            return c7856a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18816c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C11811v c11811v = new C11811v();
                c11811v.f26498c = Integer.MIN_VALUE;
                InterfaceC13964d m3311w = C13971f.m3311w(((C7855e) this.f18818e).f18813c, new C7857a(null));
                C7858b c7858b = new C7858b(c11811v, (InterfaceC13969e) this.f18817d);
                this.f18816c = 1;
                if (m3311w.mo3175a(c7858b, this) == m10387d) {
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
        public final Object invoke(InterfaceC13969e<? super AbstractC7905j0<T>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7856a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @f(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: g.r.e$b */
    /* loaded from: classes2.dex */
    static final class C7860b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18828c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13964d<AbstractC7905j0<T>> f18829d;

        /* renamed from: e */
        final /* synthetic */ C7855e<T> f18830e;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.e$b$a */
        /* loaded from: classes2.dex */
        public static final class C7861a implements InterfaceC13969e<C13705i0<? extends AbstractC7905j0<T>>> {

            /* renamed from: c */
            final /* synthetic */ C7855e f18831c;

            @f(c = "androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {135, 136}, m = "emit")
            /* renamed from: g.r.e$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C7862a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f18832c;

                /* renamed from: d */
                int f18833d;

                /* renamed from: f */
                Object f18835f;

                /* renamed from: w */
                Object f18836w;

                public C7862a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f18832c = obj;
                    this.f18833d |= Integer.MIN_VALUE;
                    return C7861a.this.emit(null, this);
                }
            }

            public C7861a(C7855e c7855e) {
                this.f18831c = c7855e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(kotlin.p557z.C13705i0<? extends p201g.p259r.AbstractC7905j0<T>> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p201g.p259r.C7855e.C7860b.C7861a.C7862a
                    if (r0 == 0) goto L13
                    r0 = r7
                    g.r.e$b$a$a r0 = (p201g.p259r.C7855e.C7860b.C7861a.C7862a) r0
                    int r1 = r0.f18833d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18833d = r1
                    goto L18
                L13:
                    g.r.e$b$a$a r0 = new g.r.e$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f18832c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f18833d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C13291q.m5357b(r7)
                    goto L6d
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f18836w
                    kotlin.z.i0 r6 = (kotlin.p557z.C13705i0) r6
                    java.lang.Object r2 = r0.f18835f
                    g.r.e$b$a r2 = (p201g.p259r.C7855e.C7860b.C7861a) r2
                    kotlin.C13291q.m5357b(r7)
                    goto L59
                L40:
                    kotlin.C13291q.m5357b(r7)
                    kotlin.z.i0 r6 = (kotlin.p557z.C13705i0) r6
                    g.r.e r7 = r5.f18831c
                    kotlinx.coroutines.q2.r r7 = p201g.p259r.C7855e.m17135b(r7)
                    r0.f18835f = r5
                    r0.f18836w = r6
                    r0.f18833d = r4
                    java.lang.Object r7 = r7.emit(r6, r0)
                    if (r7 != r1) goto L58
                    return r1
                L58:
                    r2 = r5
                L59:
                    g.r.e r7 = r2.f18831c
                    g.r.p r7 = p201g.p259r.C7855e.m17134c(r7)
                    r2 = 0
                    r0.f18835f = r2
                    r0.f18836w = r2
                    r0.f18833d = r3
                    java.lang.Object r6 = r7.m16914b(r6, r0)
                    if (r6 != r1) goto L6d
                    return r1
                L6d:
                    kotlin.w r6 = kotlin.C13666w.f30112a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7855e.C7860b.C7861a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7860b(InterfaceC13964d<? extends AbstractC7905j0<T>> interfaceC13964d, C7855e<T> c7855e, InterfaceC11714d<? super C7860b> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18829d = interfaceC13964d;
            this.f18830e = c7855e;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7860b(this.f18829d, this.f18830e, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7860b) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18828c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13964d m3309y = C13971f.m3309y(this.f18829d);
                C7861a c7861a = new C7861a(this.f18830e);
                this.f18828c = 1;
                if (m3309y.mo3175a(c7861a, this) == m10387d) {
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

    /* compiled from: CachedPageEventFlow.kt */
    /* renamed from: g.r.e$c */
    /* loaded from: classes2.dex */
    static final class C7863c extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

        /* renamed from: c */
        final /* synthetic */ C7855e<T> f18837c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7863c(C7855e<T> c7855e) {
            super(1);
            this.f18837c = c7855e;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            invoke2(th);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ((C7855e) this.f18837c).f18812b.mo3231f(null);
        }
    }

    /* compiled from: CachedPageEventFlow.kt */
    @f(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {63, 68}, m = "invokeSuspend")
    /* renamed from: g.r.e$d */
    /* loaded from: classes2.dex */
    static final class C7864d extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super C13705i0<? extends AbstractC7905j0<T>>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        Object f18838c;

        /* renamed from: d */
        int f18839d;

        /* renamed from: e */
        private /* synthetic */ Object f18840e;

        /* renamed from: f */
        final /* synthetic */ C7855e<T> f18841f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7864d(C7855e<T> c7855e, InterfaceC11714d<? super C7864d> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18841f = c7855e;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7864d c7864d = new C7864d(this.f18841f, interfaceC11714d);
            c7864d.f18840e = obj;
            return c7864d;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r1 = r5.f18839d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r5.f18838c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r5.f18840e
                kotlinx.coroutines.q2.e r3 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r3
                kotlin.C13291q.m5357b(r6)
                goto L54
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                java.lang.Object r1 = r5.f18840e
                kotlinx.coroutines.q2.e r1 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r1
                kotlin.C13291q.m5357b(r6)
                goto L43
            L2a:
                kotlin.C13291q.m5357b(r6)
                java.lang.Object r6 = r5.f18840e
                r1 = r6
                kotlinx.coroutines.q2.e r1 = (kotlinx.coroutines.p559q2.InterfaceC13969e) r1
                g.r.e<T> r6 = r5.f18841f
                g.r.p r6 = p201g.p259r.C7855e.m17134c(r6)
                r5.f18840e = r1
                r5.f18839d = r3
                java.lang.Object r6 = r6.m16915a(r5)
                if (r6 != r0) goto L43
                return r0
            L43:
                java.util.List r6 = (java.util.List) r6
                g.r.e<T> r3 = r5.f18841f
                kotlinx.coroutines.p1 r3 = p201g.p259r.C7855e.m17136a(r3)
                r3.start()
                java.util.Iterator r6 = r6.iterator()
                r3 = r1
                r1 = r6
            L54:
                r6 = r5
            L55:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r1.next()
                kotlin.z.i0 r4 = (kotlin.p557z.C13705i0) r4
                r6.f18840e = r3
                r6.f18838c = r1
                r6.f18839d = r2
                java.lang.Object r4 = r3.emit(r4, r6)
                if (r4 != r0) goto L55
                return r0
            L6e:
                kotlin.w r6 = kotlin.C13666w.f30112a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7855e.C7864d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super C13705i0<? extends AbstractC7905j0<T>>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7864d) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    public C7855e(InterfaceC13964d<? extends AbstractC7905j0<T>> interfaceC13964d, InterfaceC13932m0 interfaceC13932m0) {
        InterfaceC13947p1 m3412b;
        l.f(interfaceC13964d, "src");
        l.f(interfaceC13932m0, "scope");
        this.f18811a = new C7995p<>();
        InterfaceC14021r<C13705i0<AbstractC7905j0<T>>> m3216a = C14030x.m3216a(1, Integer.MAX_VALUE, EnumC13778e.SUSPEND);
        this.f18812b = m3216a;
        this.f18813c = C13971f.m3313u(m3216a, new C7864d(this, null));
        m3412b = C13916j.m3412b(interfaceC13932m0, null, EnumC13940o0.LAZY, new C7860b(interfaceC13964d, this, null), 1, null);
        m3412b.mo3002u0(new C7863c(this));
        C13666w c13666w = C13666w.f30112a;
        this.f18814d = m3412b;
        this.f18815e = C13971f.m3319o(new C7856a(this, null));
    }

    /* renamed from: e */
    public final void m17132e() {
        InterfaceC13947p1.C13948a.m3353a(this.f18814d, null, 1, null);
    }

    /* renamed from: f */
    public final InterfaceC13964d<AbstractC7905j0<T>> m17131f() {
        return this.f18815e;
    }
}
