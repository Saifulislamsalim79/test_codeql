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
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13958b0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import p201g.p259r.InterfaceC7832c;
/* compiled from: CachedPagingData.kt */
/* renamed from: g.r.f */
/* loaded from: classes2.dex */
public final class C7872f {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: g.r.f$a */
    /* loaded from: classes2.dex */
    public static final class C7873a implements InterfaceC13964d<C8013r0<T>> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f18861c;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C7874a implements InterfaceC13969e<C7834c0<T>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f18862c;

            @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {137}, m = "emit")
            /* renamed from: g.r.f$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7875a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f18863c;

                /* renamed from: d */
                int f18864d;

                public C7875a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f18863c = obj;
                    this.f18864d |= Integer.MIN_VALUE;
                    return C7874a.this.emit(null, this);
                }
            }

            public C7874a(InterfaceC13969e interfaceC13969e) {
                this.f18862c = interfaceC13969e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r5, kotlin.p476c0.InterfaceC11714d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p201g.p259r.C7872f.C7873a.C7874a.C7875a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g.r.f$a$a$a r0 = (p201g.p259r.C7872f.C7873a.C7874a.C7875a) r0
                    int r1 = r0.f18864d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18864d = r1
                    goto L18
                L13:
                    g.r.f$a$a$a r0 = new g.r.f$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f18863c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f18864d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C13291q.m5357b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C13291q.m5357b(r6)
                    kotlinx.coroutines.q2.e r6 = r4.f18862c
                    g.r.c0 r5 = (p201g.p259r.C7834c0) r5
                    g.r.r0 r5 = r5.m17206a()
                    r0.f18864d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.w r5 = kotlin.C13666w.f30112a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7872f.C7873a.C7874a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C7873a(InterfaceC13964d interfaceC13964d) {
            this.f18861c = interfaceC13964d;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f18861c.mo3175a(new C7874a(interfaceC13969e), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* compiled from: FlowExt.kt */
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {222}, m = "invokeSuspend")
    /* renamed from: g.r.f$b */
    /* loaded from: classes2.dex */
    public static final class C7876b extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super C7834c0<T>>, C8013r0<T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18866c;

        /* renamed from: d */
        private /* synthetic */ Object f18867d;

        /* renamed from: e */
        /* synthetic */ Object f18868e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC13932m0 f18869f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7876b(InterfaceC11714d interfaceC11714d, InterfaceC13932m0 interfaceC13932m0) {
            super(3, interfaceC11714d);
            this.f18869f = interfaceC13932m0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18866c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C7834c0 c7834c0 = new C7834c0(this.f18869f, (C8013r0) this.f18868e, null, 4, null);
                this.f18866c = 1;
                if (((InterfaceC13969e) this.f18867d).emit(c7834c0, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super C7834c0<T>> interfaceC13969e, C8013r0<T> c8013r0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            C7876b c7876b = new C7876b(interfaceC11714d, this.f18869f);
            c7876b.f18867d = interfaceC13969e;
            c7876b.f18868e = c8013r0;
            return c7876b.invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: g.r.f$c */
    /* loaded from: classes2.dex */
    public static final class C7877c extends AbstractC11745k implements InterfaceC11772q<C7834c0<T>, C7834c0<T>, InterfaceC11714d<? super C7834c0<T>>, Object> {

        /* renamed from: c */
        int f18870c;

        /* renamed from: d */
        /* synthetic */ Object f18871d;

        /* renamed from: e */
        /* synthetic */ Object f18872e;

        C7877c(InterfaceC11714d<? super C7877c> interfaceC11714d) {
            super(3, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18870c;
            if (i != 0) {
                if (i == 1) {
                    C7834c0 c7834c0 = (C7834c0) this.f18871d;
                    C13291q.m5357b(obj);
                    return c7834c0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13291q.m5357b(obj);
            C7834c0 c7834c02 = (C7834c0) this.f18872e;
            this.f18871d = c7834c02;
            this.f18870c = 1;
            return ((C7834c0) this.f18871d).m17205b(this) == m10387d ? m10387d : c7834c02;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(C7834c0<T> c7834c0, C7834c0<T> c7834c02, InterfaceC11714d<? super C7834c0<T>> interfaceC11714d) {
            C7877c c7877c = new C7877c(interfaceC11714d);
            c7877c.f18871d = c7834c0;
            c7877c.f18872e = c7834c02;
            return c7877c.invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: g.r.f$d */
    /* loaded from: classes2.dex */
    public static final class C7878d extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super C8013r0<T>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18873c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC7832c f18874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7878d(InterfaceC7832c interfaceC7832c, InterfaceC11714d<? super C7878d> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18874d = interfaceC7832c;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7878d(this.f18874d, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18873c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7832c interfaceC7832c = this.f18874d;
                if (interfaceC7832c != null) {
                    InterfaceC7832c.EnumC7833a enumC7833a = InterfaceC7832c.EnumC7833a.PAGED_DATA_FLOW;
                    this.f18873c = 1;
                    if (interfaceC7832c.m17208b(enumC7833a, this) == m10387d) {
                        return m10387d;
                    }
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
        public final Object invoke(InterfaceC13969e<? super C8013r0<T>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7878d) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: g.r.f$e */
    /* loaded from: classes2.dex */
    public static final class C7879e extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super C8013r0<T>>, Throwable, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18875c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC7832c f18876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7879e(InterfaceC7832c interfaceC7832c, InterfaceC11714d<? super C7879e> interfaceC11714d) {
            super(3, interfaceC11714d);
            this.f18876d = interfaceC7832c;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18875c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7832c interfaceC7832c = this.f18876d;
                if (interfaceC7832c != null) {
                    InterfaceC7832c.EnumC7833a enumC7833a = InterfaceC7832c.EnumC7833a.PAGED_DATA_FLOW;
                    this.f18875c = 1;
                    if (interfaceC7832c.m17209a(enumC7833a, this) == m10387d) {
                        return m10387d;
                    }
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super C8013r0<T>> interfaceC13969e, Throwable th, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return new C7879e(this.f18876d, interfaceC11714d).invokeSuspend(C13666w.f30112a);
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<C8013r0<T>> m17121a(InterfaceC13964d<C8013r0<T>> interfaceC13964d, InterfaceC13932m0 interfaceC13932m0) {
        l.f(interfaceC13964d, "<this>");
        l.f(interfaceC13932m0, "scope");
        return m17120b(interfaceC13964d, interfaceC13932m0, null);
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<C8013r0<T>> m17120b(InterfaceC13964d<C8013r0<T>> interfaceC13964d, InterfaceC13932m0 interfaceC13932m0, InterfaceC7832c interfaceC7832c) {
        l.f(interfaceC13964d, "<this>");
        l.f(interfaceC13932m0, "scope");
        return C13971f.m3312v(C13971f.m3315s(C13971f.m3314t(new C7873a(C8004r.m16904b(C8004r.m16902d(interfaceC13964d, new C7876b(null, interfaceC13932m0)), new C7877c(null))), new C7878d(interfaceC7832c, null)), new C7879e(interfaceC7832c, null)), interfaceC13932m0, InterfaceC13958b0.f30453a.m3336b(), 1);
    }
}
