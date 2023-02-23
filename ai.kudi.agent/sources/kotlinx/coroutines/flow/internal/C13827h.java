package kotlinx.coroutines.flow.internal;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.C11812w;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
/* renamed from: kotlinx.coroutines.flow.internal.h */
/* loaded from: classes3.dex */
public final class C13827h<T, R> extends AbstractC13824f<T, R> {

    /* renamed from: w */
    private final InterfaceC11772q<InterfaceC13969e<? super R>, T, InterfaceC11714d<? super C13666w>, Object> f30286w;

    /* compiled from: Merge.kt */
    @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {101}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.h$a */
    /* loaded from: classes3.dex */
    static final class C13828a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30287c;

        /* renamed from: d */
        private /* synthetic */ Object f30288d;

        /* renamed from: e */
        final /* synthetic */ C13827h<T, R> f30289e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC13969e<R> f30290f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.h$a$a */
        /* loaded from: classes3.dex */
        public static final class C13829a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f30291c;

            /* renamed from: d */
            final /* synthetic */ C13827h<T, R> f30292d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13969e<R> f30293e;

            /* renamed from: f */
            final /* synthetic */ T f30294f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13829a(C13827h<T, R> c13827h, InterfaceC13969e<? super R> interfaceC13969e, T t, InterfaceC11714d<? super C13829a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f30292d = c13827h;
                this.f30293e = interfaceC13969e;
                this.f30294f = t;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C13829a(this.f30292d, this.f30293e, this.f30294f, interfaceC11714d);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return invoke2(interfaceC13932m0, interfaceC11714d);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C13829a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f30291c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    InterfaceC11772q interfaceC11772q = ((C13827h) this.f30292d).f30286w;
                    InterfaceC13969e<R> interfaceC13969e = this.f30293e;
                    T t = this.f30294f;
                    this.f30291c = 1;
                    if (interfaceC11772q.invoke(interfaceC13969e, t, this) == m10387d) {
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

        /* compiled from: Collect.kt */
        /* renamed from: kotlinx.coroutines.flow.internal.h$a$b */
        /* loaded from: classes3.dex */
        public static final class C13830b implements InterfaceC13969e<T> {

            /* renamed from: c */
            final /* synthetic */ C11812w f30295c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC13932m0 f30296d;

            /* renamed from: e */
            final /* synthetic */ C13827h f30297e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC13969e f30298f;

            @kotlin.c0.k.a.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1", f = "Merge.kt", l = {137}, m = "emit")
            /* renamed from: kotlinx.coroutines.flow.internal.h$a$b$a */
            /* loaded from: classes3.dex */
            public static final class C13831a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f30299c;

                /* renamed from: d */
                int f30300d;

                /* renamed from: e */
                final /* synthetic */ C13830b f30301e;

                /* renamed from: f */
                Object f30302f;

                /* renamed from: w */
                Object f30303w;

                /* renamed from: x */
                Object f30304x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C13831a(C13830b c13830b, InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                    this.f30301e = c13830b;
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f30299c = obj;
                    this.f30300d |= Integer.MIN_VALUE;
                    return this.f30301e.emit(null, this);
                }
            }

            public C13830b(C11812w c11812w, InterfaceC13932m0 interfaceC13932m0, C13827h c13827h, InterfaceC13969e interfaceC13969e) {
                this.f30295c = c11812w;
                this.f30296d = interfaceC13932m0;
                this.f30297e = c13827h;
                this.f30298f = interfaceC13969e;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r8, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.C13827h.C13828a.C13830b.C13831a
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.h$a$b$a r0 = (kotlinx.coroutines.flow.internal.C13827h.C13828a.C13830b.C13831a) r0
                    int r1 = r0.f30300d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30300d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.h$a$b$a r0 = new kotlinx.coroutines.flow.internal.h$a$b$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f30299c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f30300d
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f30304x
                    kotlinx.coroutines.p1 r8 = (kotlinx.coroutines.InterfaceC13947p1) r8
                    java.lang.Object r8 = r0.f30303w
                    java.lang.Object r0 = r0.f30302f
                    kotlinx.coroutines.flow.internal.h$a$b r0 = (kotlinx.coroutines.flow.internal.C13827h.C13828a.C13830b) r0
                    kotlin.C13291q.m5357b(r9)
                    goto L5f
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.C13291q.m5357b(r9)
                    kotlin.e0.d.w r9 = r7.f30295c
                    T r9 = r9.f26499c
                    kotlinx.coroutines.p1 r9 = (kotlinx.coroutines.InterfaceC13947p1) r9
                    if (r9 != 0) goto L48
                L46:
                    r0 = r7
                    goto L5f
                L48:
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.mo3015m(r2)
                    r0.f30302f = r7
                    r0.f30303w = r8
                    r0.f30304x = r9
                    r0.f30300d = r3
                    java.lang.Object r9 = r9.mo3035P(r0)
                    if (r9 != r1) goto L46
                    return r1
                L5f:
                    kotlin.e0.d.w r9 = r0.f30295c
                    kotlinx.coroutines.m0 r1 = r0.f30296d
                    r2 = 0
                    kotlinx.coroutines.o0 r3 = kotlinx.coroutines.EnumC13940o0.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.h$a$a r4 = new kotlinx.coroutines.flow.internal.h$a$a
                    kotlinx.coroutines.flow.internal.h r5 = r0.f30297e
                    kotlinx.coroutines.q2.e r0 = r0.f30298f
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.p1 r8 = kotlinx.coroutines.C13864i.m3567b(r1, r2, r3, r4, r5, r6)
                    r9.f26499c = r8
                    kotlin.w r8 = kotlin.C13666w.f30112a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C13827h.C13828a.C13830b.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13828a(C13827h<T, R> c13827h, InterfaceC13969e<? super R> interfaceC13969e, InterfaceC11714d<? super C13828a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30289e = c13827h;
            this.f30290f = interfaceC13969e;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C13828a c13828a = new C13828a(this.f30289e, this.f30290f, interfaceC11714d);
            c13828a.f30288d = obj;
            return c13828a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return invoke2(interfaceC13932m0, interfaceC11714d);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C13828a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f30287c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C11812w c11812w = new C11812w();
                C13827h<T, R> c13827h = this.f30289e;
                InterfaceC13964d<S> interfaceC13964d = c13827h.f30282f;
                C13830b c13830b = new C13830b(c11812w, (InterfaceC13932m0) this.f30288d, c13827h, this.f30290f);
                this.f30287c = 1;
                if (interfaceC13964d.mo3175a(c13830b, this) == m10387d) {
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

    public /* synthetic */ C13827h(InterfaceC11772q interfaceC11772q, InterfaceC13964d interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, int i2, kotlin.e0.d.g gVar) {
        this(interfaceC11772q, interfaceC13964d, (i2 & 4) != 0 ? C11725h.f26446c : interfaceC11719g, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC13778e.SUSPEND : enumC13778e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13820d
    /* renamed from: j */
    protected AbstractC13820d<R> mo3173j(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return new C13827h(this.f30286w, this.f30282f, interfaceC11719g, i, enumC13778e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC13824f
    /* renamed from: r */
    protected Object mo3593r(InterfaceC13969e<? super R> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (!C13952q0.m3345a() || (interfaceC13969e instanceof C13848t)) {
            Object m3591a = C13835k.m3591a(new C13828a(this, interfaceC13969e, null), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return m3591a == m10387d ? m3591a : C13666w.f30112a;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13827h(InterfaceC11772q<? super InterfaceC13969e<? super R>, ? super T, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11772q, InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        super(interfaceC13964d, interfaceC11719g, i, enumC13778e);
        this.f30286w = interfaceC11772q;
    }
}
