package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13936n0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.InterfaceC13779f;
import kotlinx.coroutines.channels.InterfaceC13801x;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.C13985j;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: SimpleChannelFlow.kt */
/* renamed from: g.r.e1 */
/* loaded from: classes2.dex */
public final class C7867e1 {

    /* compiled from: SimpleChannelFlow.kt */
    @f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: g.r.e1$a */
    /* loaded from: classes2.dex */
    static final class C7868a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18846c;

        /* renamed from: d */
        private /* synthetic */ Object f18847d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> f18848e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SimpleChannelFlow.kt */
        @f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {64, 65}, m = "invokeSuspend")
        /* renamed from: g.r.e1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7869a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            Object f18849c;

            /* renamed from: d */
            int f18850d;

            /* renamed from: e */
            private /* synthetic */ Object f18851e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC13969e<T> f18852f;

            /* renamed from: w */
            final /* synthetic */ InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> f18853w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SimpleChannelFlow.kt */
            @f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {52}, m = "invokeSuspend")
            /* renamed from: g.r.e1$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7870a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

                /* renamed from: c */
                int f18854c;

                /* renamed from: d */
                final /* synthetic */ InterfaceC13779f<T> f18855d;

                /* renamed from: e */
                final /* synthetic */ InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> f18856e;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: SimpleChannelFlow.kt */
                @f(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {57}, m = "invokeSuspend")
                /* renamed from: g.r.e1$a$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C7871a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

                    /* renamed from: c */
                    int f18857c;

                    /* renamed from: d */
                    private /* synthetic */ Object f18858d;

                    /* renamed from: e */
                    final /* synthetic */ InterfaceC13779f<T> f18859e;

                    /* renamed from: f */
                    final /* synthetic */ InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> f18860f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C7871a(InterfaceC13779f<T> interfaceC13779f, InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C7871a> interfaceC11714d) {
                        super(2, interfaceC11714d);
                        this.f18859e = interfaceC13779f;
                        this.f18860f = interfaceC11771p;
                    }

                    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                    public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                        C7871a c7871a = new C7871a(this.f18859e, this.f18860f, interfaceC11714d);
                        c7871a.f18858d = obj;
                        return c7871a;
                    }

                    @Override // kotlin.p483e0.p484c.InterfaceC11771p
                    public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                        return ((C7871a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
                    }

                    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                    public final Object invokeSuspend(Object obj) {
                        Object m10387d;
                        m10387d = C11734d.m10387d();
                        int i = this.f18857c;
                        if (i == 0) {
                            C13291q.m5357b(obj);
                            C7886g1 c7886g1 = new C7886g1((InterfaceC13932m0) this.f18858d, this.f18859e);
                            InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> interfaceC11771p = this.f18860f;
                            this.f18857c = 1;
                            if (interfaceC11771p.invoke(c7886g1, this) == m10387d) {
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
                /* JADX WARN: Multi-variable type inference failed */
                C7870a(InterfaceC13779f<T> interfaceC13779f, InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C7870a> interfaceC11714d) {
                    super(2, interfaceC11714d);
                    this.f18855d = interfaceC13779f;
                    this.f18856e = interfaceC11771p;
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                    return new C7870a(this.f18855d, this.f18856e, interfaceC11714d);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11771p
                public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                    return ((C7870a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    Object m10387d;
                    m10387d = C11734d.m10387d();
                    int i = this.f18854c;
                    try {
                        if (i == 0) {
                            C13291q.m5357b(obj);
                            C7871a c7871a = new C7871a(this.f18855d, this.f18856e, null);
                            this.f18854c = 1;
                            if (C13936n0.m3361a(c7871a, this) == m10387d) {
                                return m10387d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13291q.m5357b(obj);
                        }
                        InterfaceC13801x.C13802a.m3638a(this.f18855d, null, 1, null);
                    } catch (Throwable th) {
                        this.f18855d.mo3641f(th);
                    }
                    return C13666w.f30112a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C7869a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C7869a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f18852f = interfaceC13969e;
                this.f18853w = interfaceC11771p;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                C7869a c7869a = new C7869a(this.f18852f, this.f18853w, interfaceC11714d);
                c7869a.f18851e = obj;
                return c7869a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C7869a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0081 -> B:12:0x0054). Please submit an issue!!! */
            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r1 = r12.f18850d
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L32
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.f18849c
                    kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC13782h) r1
                    java.lang.Object r5 = r12.f18851e
                    kotlinx.coroutines.p1 r5 = (kotlinx.coroutines.InterfaceC13947p1) r5
                    kotlin.C13291q.m5357b(r13)
                    r13 = r1
                    r1 = r5
                    goto L53
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.f18849c
                    kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC13782h) r1
                    java.lang.Object r5 = r12.f18851e
                    kotlinx.coroutines.p1 r5 = (kotlinx.coroutines.InterfaceC13947p1) r5
                    kotlin.C13291q.m5357b(r13)
                    r6 = r12
                    goto L66
                L32:
                    kotlin.C13291q.m5357b(r13)
                    java.lang.Object r13 = r12.f18851e
                    r5 = r13
                    kotlinx.coroutines.m0 r5 = (kotlinx.coroutines.InterfaceC13932m0) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.f r13 = kotlinx.coroutines.channels.C13783i.m3686b(r13, r4, r4, r1, r4)
                    r6 = 0
                    r7 = 0
                    g.r.e1$a$a$a r8 = new g.r.e1$a$a$a
                    kotlin.e0.c.p<g.r.f1<T>, kotlin.c0.d<? super kotlin.w>, java.lang.Object> r1 = r12.f18853w
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    kotlinx.coroutines.p1 r1 = kotlinx.coroutines.C13864i.m3567b(r5, r6, r7, r8, r9, r10)
                    kotlinx.coroutines.channels.h r13 = r13.iterator()
                L53:
                    r5 = r12
                L54:
                    r5.f18851e = r1
                    r5.f18849c = r13
                    r5.f18850d = r3
                    java.lang.Object r6 = r13.mo3688a(r5)
                    if (r6 != r0) goto L61
                    return r0
                L61:
                    r11 = r1
                    r1 = r13
                    r13 = r6
                    r6 = r5
                    r5 = r11
                L66:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L85
                    java.lang.Object r13 = r1.next()
                    kotlinx.coroutines.q2.e<T> r7 = r6.f18852f
                    r6.f18851e = r5
                    r6.f18849c = r1
                    r6.f18850d = r2
                    java.lang.Object r13 = r7.emit(r13, r6)
                    if (r13 != r0) goto L81
                    return r0
                L81:
                    r13 = r1
                    r1 = r5
                    r5 = r6
                    goto L54
                L85:
                    kotlinx.coroutines.InterfaceC13947p1.C13948a.m3353a(r5, r4, r3, r4)
                    kotlin.w r13 = kotlin.C13666w.f30112a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7867e1.C7868a.C7869a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7868a(InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C7868a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18848e = interfaceC11771p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7868a c7868a = new C7868a(this.f18848e, interfaceC11714d);
            c7868a.f18847d = obj;
            return c7868a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18846c;
            if (i == 0) {
                C13291q.m5357b(obj);
                C7869a c7869a = new C7869a((InterfaceC13969e) this.f18847d, this.f18848e, null);
                this.f18846c = 1;
                if (C13936n0.m3361a(c7869a, this) == m10387d) {
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
            return ((C7868a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m17123a(InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        InterfaceC13964d<T> m3283b;
        l.f(interfaceC11771p, "block");
        m3283b = C13985j.m3283b(C13971f.m3319o(new C7868a(interfaceC11771p, null)), -2, null, 2, null);
        return m3283b;
    }
}
