package kotlinx.coroutines.p559q2;

import ai.kudi.agent.settings.p029ui.AccountAndSettingsOptionsFragment;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p476c0.p478k.p479a.C11736b;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* renamed from: kotlinx.coroutines.q2.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14010p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {206, 210, 211, 217}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.q2.p$a */
    /* loaded from: classes3.dex */
    public static final class C14011a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f30566c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13958b0 f30567d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13964d<T> f30568e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC14021r<T> f30569f;

        /* renamed from: w */
        final /* synthetic */ T f30570w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.q2.p$a$a */
        /* loaded from: classes3.dex */
        public static final class C14012a extends AbstractC11745k implements InterfaceC11771p<Integer, InterfaceC11714d<? super Boolean>, Object> {

            /* renamed from: c */
            int f30571c;

            /* renamed from: d */
            /* synthetic */ int f30572d;

            C14012a(InterfaceC11714d<? super C14012a> interfaceC11714d) {
                super(2, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C14012a c14012a = new C14012a(interfaceC11714d);
                c14012a.f30572d = ((Number) obj).intValue();
                return c14012a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC11714d<? super Boolean> interfaceC11714d) {
                return m3262m(num.intValue(), interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                C11734d.m10387d();
                if (this.f30571c == 0) {
                    C13291q.m5357b(obj);
                    return C11736b.m10382a(this.f30572d > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: m */
            public final Object m3262m(int i, InterfaceC11714d<? super Boolean> interfaceC11714d) {
                return ((C14012a) create(Integer.valueOf(i), interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {AccountAndSettingsOptionsFragment.UPDATE_APP_REQUEST_CODE}, m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.q2.p$a$b */
        /* loaded from: classes3.dex */
        public static final class C14013b extends AbstractC11745k implements InterfaceC11771p<EnumC14032z, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            int f30573c;

            /* renamed from: d */
            /* synthetic */ Object f30574d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC13964d<T> f30575e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC14021r<T> f30576f;

            /* renamed from: w */
            final /* synthetic */ T f30577w;

            /* compiled from: Share.kt */
            /* renamed from: kotlinx.coroutines.q2.p$a$b$a */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C14014a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f30578a;

                static {
                    int[] iArr = new int[EnumC14032z.values().length];
                    iArr[EnumC14032z.START.ordinal()] = 1;
                    iArr[EnumC14032z.STOP.ordinal()] = 2;
                    iArr[EnumC14032z.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f30578a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C14013b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC14021r<T> interfaceC14021r, T t, InterfaceC11714d<? super C14013b> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f30575e = interfaceC13964d;
                this.f30576f = interfaceC14021r;
                this.f30577w = t;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C14013b c14013b = new C14013b(this.f30575e, this.f30576f, this.f30577w, interfaceC11714d);
                c14013b.f30574d = obj;
                return c14013b;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public /* bridge */ /* synthetic */ Object invoke(EnumC14032z enumC14032z, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return m3261m(enumC14032z, interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                Object m10387d;
                m10387d = C11734d.m10387d();
                int i = this.f30573c;
                if (i == 0) {
                    C13291q.m5357b(obj);
                    int i2 = C14014a.f30578a[((EnumC14032z) this.f30574d).ordinal()];
                    if (i2 == 1) {
                        InterfaceC13964d<T> interfaceC13964d = this.f30575e;
                        InterfaceC13969e interfaceC13969e = this.f30576f;
                        this.f30573c = 1;
                        if (interfaceC13964d.mo3175a(interfaceC13969e, this) == m10387d) {
                            return m10387d;
                        }
                    } else if (i2 == 3) {
                        T t = this.f30577w;
                        if (t == C14030x.f30609a) {
                            this.f30576f.mo3232e();
                        } else {
                            this.f30576f.mo3231f(t);
                        }
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13291q.m5357b(obj);
                }
                return C13666w.f30112a;
            }

            /* renamed from: m */
            public final Object m3261m(EnumC14032z enumC14032z, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C14013b) create(enumC14032z, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14011a(InterfaceC13958b0 interfaceC13958b0, InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC14021r<T> interfaceC14021r, T t, InterfaceC11714d<? super C14011a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f30567d = interfaceC13958b0;
            this.f30568e = interfaceC13964d;
            this.f30569f = interfaceC14021r;
            this.f30570w = t;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C14011a(this.f30567d, this.f30568e, this.f30569f, this.f30570w, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return invoke2(interfaceC13932m0, interfaceC11714d);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C14011a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[RETURN] */
        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r1 = r7.f30566c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.C13291q.m5357b(r8)
                goto L5e
            L21:
                kotlin.C13291q.m5357b(r8)
                goto L8f
            L25:
                kotlin.C13291q.m5357b(r8)
                kotlinx.coroutines.q2.b0 r8 = r7.f30567d
                kotlinx.coroutines.q2.b0$a r1 = kotlinx.coroutines.p559q2.InterfaceC13958b0.f30453a
                kotlinx.coroutines.q2.b0 r1 = r1.m3337a()
                if (r8 != r1) goto L3f
                kotlinx.coroutines.q2.d<T> r8 = r7.f30568e
                kotlinx.coroutines.q2.r<T> r1 = r7.f30569f
                r7.f30566c = r5
                java.lang.Object r8 = r8.mo3175a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L3f:
                kotlinx.coroutines.q2.b0 r8 = r7.f30567d
                kotlinx.coroutines.q2.b0$a r1 = kotlinx.coroutines.p559q2.InterfaceC13958b0.f30453a
                kotlinx.coroutines.q2.b0 r1 = r1.m3336b()
                r5 = 0
                if (r8 != r1) goto L6b
                kotlinx.coroutines.q2.r<T> r8 = r7.f30569f
                kotlinx.coroutines.q2.e0 r8 = r8.m3258g()
                kotlinx.coroutines.q2.p$a$a r1 = new kotlinx.coroutines.q2.p$a$a
                r1.<init>(r5)
                r7.f30566c = r4
                java.lang.Object r8 = kotlinx.coroutines.p559q2.C13971f.m3320n(r8, r1, r7)
                if (r8 != r0) goto L5e
                return r0
            L5e:
                kotlinx.coroutines.q2.d<T> r8 = r7.f30568e
                kotlinx.coroutines.q2.r<T> r1 = r7.f30569f
                r7.f30566c = r3
                java.lang.Object r8 = r8.mo3175a(r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L6b:
                kotlinx.coroutines.q2.b0 r8 = r7.f30567d
                kotlinx.coroutines.q2.r<T> r1 = r7.f30569f
                kotlinx.coroutines.q2.e0 r1 = r1.m3258g()
                kotlinx.coroutines.q2.d r8 = r8.mo3335a(r1)
                kotlinx.coroutines.q2.d r8 = kotlinx.coroutines.p559q2.C13971f.m3326h(r8)
                kotlinx.coroutines.q2.p$a$b r1 = new kotlinx.coroutines.q2.p$a$b
                kotlinx.coroutines.q2.d<T> r3 = r7.f30568e
                kotlinx.coroutines.q2.r<T> r4 = r7.f30569f
                T r6 = r7.f30570w
                r1.<init>(r3, r4, r6, r5)
                r7.f30566c = r2
                java.lang.Object r8 = kotlinx.coroutines.p559q2.C13971f.m3329e(r8, r1, r7)
                if (r8 != r0) goto L8f
                return r0
            L8f:
                kotlin.w r8 = kotlin.C13666w.f30112a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14010p.C14011a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC14025v<T> m3267a(InterfaceC14021r<T> interfaceC14021r) {
        return new C14023t(interfaceC14021r, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (r8 == 0) goto L20;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.p559q2.C13956a0<T> m3266b(kotlinx.coroutines.p559q2.InterfaceC13964d<? extends T> r7, int r8) {
        /*
            boolean r0 = kotlinx.coroutines.C13952q0.m3345a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r8 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L16:
            kotlinx.coroutines.channels.f$a r0 = kotlinx.coroutines.channels.InterfaceC13779f.f30245v
            int r0 = r0.m3691a()
            int r0 = kotlin.p491i0.C11839f.m10280a(r8, r0)
            int r0 = r0 - r8
            boolean r3 = r7 instanceof kotlinx.coroutines.flow.internal.AbstractC13820d
            if (r3 == 0) goto L55
            r3 = r7
            kotlinx.coroutines.flow.internal.d r3 = (kotlinx.coroutines.flow.internal.AbstractC13820d) r3
            kotlinx.coroutines.q2.d r4 = r3.mo3340k()
            if (r4 == 0) goto L55
            kotlinx.coroutines.q2.a0 r7 = new kotlinx.coroutines.q2.a0
            int r5 = r3.f30273d
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4d
        L3c:
            kotlinx.coroutines.channels.e r5 = r3.f30274e
            kotlinx.coroutines.channels.e r6 = kotlinx.coroutines.channels.EnumC13778e.SUSPEND
            if (r5 != r6) goto L49
            int r8 = r3.f30273d
            if (r8 != 0) goto L47
            goto L4c
        L47:
            r1 = r0
            goto L4d
        L49:
            if (r8 != 0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            kotlinx.coroutines.channels.e r8 = r3.f30274e
            kotlin.c0.g r0 = r3.f30272c
            r7.<init>(r4, r1, r8, r0)
            return r7
        L55:
            kotlinx.coroutines.q2.a0 r8 = new kotlinx.coroutines.q2.a0
            kotlinx.coroutines.channels.e r1 = kotlinx.coroutines.channels.EnumC13778e.SUSPEND
            kotlin.c0.h r2 = kotlin.p476c0.C11725h.f26446c
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C14010p.m3266b(kotlinx.coroutines.q2.d, int):kotlinx.coroutines.q2.a0");
    }

    /* renamed from: c */
    private static final <T> InterfaceC13947p1 m3265c(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g, InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC14021r<T> interfaceC14021r, InterfaceC13958b0 interfaceC13958b0, T t) {
        InterfaceC13947p1 m3412b;
        m3412b = C13916j.m3412b(interfaceC13932m0, interfaceC11719g, null, new C14011a(interfaceC13958b0, interfaceC13964d, interfaceC14021r, t, null), 2, null);
        return m3412b;
    }

    /* renamed from: d */
    public static final <T> InterfaceC14025v<T> m3264d(InterfaceC14025v<? extends T> interfaceC14025v, InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        return new C13986j0(interfaceC14025v, interfaceC11771p);
    }

    /* renamed from: e */
    public static final <T> InterfaceC14025v<T> m3263e(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC13932m0 interfaceC13932m0, InterfaceC13958b0 interfaceC13958b0, int i) {
        C13956a0 m3266b = m3266b(interfaceC13964d, i);
        InterfaceC14021r m3216a = C14030x.m3216a(i, m3266b.f30447b, m3266b.f30448c);
        return new C14023t(m3216a, m3265c(interfaceC13932m0, m3266b.f30449d, m3266b.f30446a, m3216a, interfaceC13958b0, C14030x.f30609a));
    }
}
