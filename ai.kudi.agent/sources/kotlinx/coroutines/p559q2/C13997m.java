package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11811v;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
/* renamed from: kotlinx.coroutines.q2.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13997m {

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.m$a */
    /* loaded from: classes3.dex */
    public static final class C13998a implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f30532c;

        /* renamed from: d */
        final /* synthetic */ int f30533d;

        public C13998a(InterfaceC13964d interfaceC13964d, int i) {
            this.f30532c = interfaceC13964d;
            this.f30533d = i;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f30532c.mo3175a(new C13999b(new C11811v(), this.f30533d, interfaceC13969e), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    /* compiled from: Collect.kt */
    /* renamed from: kotlinx.coroutines.q2.m$b */
    /* loaded from: classes3.dex */
    public static final class C13999b implements InterfaceC13969e<T> {

        /* renamed from: c */
        final /* synthetic */ C11811v f30534c;

        /* renamed from: d */
        final /* synthetic */ int f30535d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13969e f30536e;

        public C13999b(C11811v c11811v, int i, InterfaceC13969e interfaceC13969e) {
            this.f30534c = c11811v;
            this.f30535d = i;
            this.f30536e = interfaceC13969e;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            Object m10387d;
            C11811v c11811v = this.f30534c;
            int i = c11811v.f26498c;
            if (i >= this.f30535d) {
                Object emit = this.f30536e.emit(t, interfaceC11714d);
                m10387d = C11734d.m10387d();
                if (emit == m10387d) {
                    return emit;
                }
            } else {
                c11811v.f26498c = i + 1;
            }
            return C13666w.f30112a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.q2.m$c */
    /* loaded from: classes3.dex */
    public static final class C14000c implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f30537c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11771p f30538d;

        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {124}, m = "collect")
        /* renamed from: kotlinx.coroutines.q2.m$c$a */
        /* loaded from: classes3.dex */
        public static final class C14001a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30539c;

            /* renamed from: d */
            int f30540d;

            /* renamed from: f */
            Object f30542f;

            public C14001a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30539c = obj;
                this.f30540d |= Integer.MIN_VALUE;
                return C14000c.this.mo3175a(null, this);
            }
        }

        public C14000c(InterfaceC13964d interfaceC13964d, InterfaceC11771p interfaceC11771p) {
            this.f30537c = interfaceC13964d;
            this.f30538d = interfaceC11771p;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.p559q2.C13997m.C14000c.C14001a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.q2.m$c$a r0 = (kotlinx.coroutines.p559q2.C13997m.C14000c.C14001a) r0
                int r1 = r0.f30540d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30540d = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.m$c$a r0 = new kotlinx.coroutines.q2.m$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f30539c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30540d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f30542f
                kotlinx.coroutines.q2.m$d r6 = (kotlinx.coroutines.p559q2.C13997m.C14002d) r6
                kotlin.C13291q.m5357b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                kotlin.C13291q.m5357b(r7)
                kotlinx.coroutines.q2.d r7 = r5.f30537c
                kotlinx.coroutines.q2.m$d r2 = new kotlinx.coroutines.q2.m$d
                kotlin.e0.c.p r4 = r5.f30538d
                r2.<init>(r4, r6)
                r0.f30542f = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                r0.f30540d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                java.lang.Object r6 = r7.mo3175a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlinx.coroutines.flow.internal.C13836l.m3590a(r7, r6)
            L53:
                kotlin.w r6 = kotlin.C13666w.f30112a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13997m.C14000c.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.q2.m$d */
    /* loaded from: classes3.dex */
    public static final class C14002d implements InterfaceC13969e<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11771p f30543c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13969e f30544d;

        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-9$$inlined$collectWhile$1", f = "Limit.kt", l = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 145}, m = "emit")
        /* renamed from: kotlinx.coroutines.q2.m$d$a */
        /* loaded from: classes3.dex */
        public static final class C14003a extends AbstractC11738d {

            /* renamed from: c */
            Object f30545c;

            /* renamed from: d */
            /* synthetic */ Object f30546d;

            /* renamed from: e */
            int f30547e;

            /* renamed from: w */
            Object f30549w;

            public C14003a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30546d = obj;
                this.f30547e |= Integer.MIN_VALUE;
                return C14002d.this.emit(null, this);
            }
        }

        public C14002d(InterfaceC11771p interfaceC11771p, InterfaceC13969e interfaceC13969e) {
            this.f30543c = interfaceC11771p;
            this.f30544d = interfaceC13969e;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.p559q2.C13997m.C14002d.C14003a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.q2.m$d$a r0 = (kotlinx.coroutines.p559q2.C13997m.C14002d.C14003a) r0
                int r1 = r0.f30547e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30547e = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.m$d$a r0 = new kotlinx.coroutines.q2.m$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f30546d
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30547e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f30545c
                kotlinx.coroutines.q2.m$d r8 = (kotlinx.coroutines.p559q2.C13997m.C14002d) r8
                kotlin.C13291q.m5357b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f30549w
                java.lang.Object r2 = r0.f30545c
                kotlinx.coroutines.q2.m$d r2 = (kotlinx.coroutines.p559q2.C13997m.C14002d) r2
                kotlin.C13291q.m5357b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.C13291q.m5357b(r9)
                kotlin.e0.c.p r9 = r7.f30543c
                r0.f30545c = r7
                r0.f30549w = r8
                r0.f30547e = r4
                r2 = 6
                kotlin.p483e0.p485d.C11801k.m10321a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.p483e0.p485d.C11801k.m10321a(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                kotlinx.coroutines.q2.e r2 = r8.f30544d
                r0.f30545c = r8
                r5 = 0
                r0.f30549w = r5
                r0.f30547e = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.w r8 = kotlin.C13666w.f30112a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13997m.C14002d.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3273a(InterfaceC13964d<? extends T> interfaceC13964d, int i) {
        if (i >= 0) {
            return new C13998a(interfaceC13964d, i);
        }
        throw new IllegalArgumentException(l.m("Drop count should be non-negative, but had ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static final <T> InterfaceC13964d<T> m3272b(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11771p<? super T, ? super InterfaceC11714d<? super Boolean>, ? extends Object> interfaceC11771p) {
        return new C14000c(interfaceC13964d, interfaceC11771p);
    }
}
