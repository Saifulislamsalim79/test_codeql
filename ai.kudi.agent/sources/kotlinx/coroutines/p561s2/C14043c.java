package kotlinx.coroutines.p561s2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.C13668y;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11800j;
import kotlinx.coroutines.AbstractC13758c;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p560r2.C14036a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: ReactiveFlow.kt */
/* renamed from: kotlinx.coroutines.s2.c */
/* loaded from: classes3.dex */
public final class C14043c<T> extends AbstractC13758c<C13666w> implements InterfaceC14457c {

    /* renamed from: w */
    static final /* synthetic */ AtomicLongFieldUpdater f30622w = AtomicLongFieldUpdater.newUpdater(C14043c.class, "requested");

    /* renamed from: x */
    static final /* synthetic */ AtomicReferenceFieldUpdater f30623x = AtomicReferenceFieldUpdater.newUpdater(C14043c.class, Object.class, "producer");
    private volatile boolean cancellationRequested;

    /* renamed from: e */
    public final InterfaceC13964d<T> f30624e;

    /* renamed from: f */
    public final InterfaceC14456b<? super T> f30625f;
    volatile /* synthetic */ Object producer;
    volatile /* synthetic */ long requested;

    /* compiled from: Collect.kt */
    /* renamed from: kotlinx.coroutines.s2.c$a */
    /* loaded from: classes3.dex */
    public static final class C14044a implements InterfaceC13969e<T> {

        @f(c = "kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$$inlined$collect$1", f = "ReactiveFlow.kt", l = {139}, m = "emit")
        /* renamed from: kotlinx.coroutines.s2.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C14045a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30627c;

            /* renamed from: d */
            int f30628d;

            /* renamed from: f */
            Object f30630f;

            /* renamed from: w */
            Object f30631w;

            public C14045a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30627c = obj;
                this.f30628d |= Integer.MIN_VALUE;
                return C14044a.this.emit(null, this);
            }
        }

        public C14044a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r7, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.p561s2.C14043c.C14044a.C14045a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.s2.c$a$a r0 = (kotlinx.coroutines.p561s2.C14043c.C14044a.C14045a) r0
                int r1 = r0.f30628d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30628d = r1
                goto L18
            L13:
                kotlinx.coroutines.s2.c$a$a r0 = new kotlinx.coroutines.s2.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f30627c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30628d
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r7 = r0.f30631w
                kotlinx.coroutines.s2.c$a$a r7 = (kotlinx.coroutines.p561s2.C14043c.C14044a.C14045a) r7
                java.lang.Object r7 = r0.f30630f
                kotlinx.coroutines.s2.c$a r7 = (kotlinx.coroutines.p561s2.C14043c.C14044a) r7
                kotlin.C13291q.m5357b(r8)
                goto L80
            L31:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L39:
                kotlin.C13291q.m5357b(r8)
                kotlinx.coroutines.s2.c r8 = kotlinx.coroutines.p561s2.C14043c.this
                n.b.b<? super T> r8 = r8.f30625f
                r8.mo1688f(r7)
                kotlinx.coroutines.s2.c r7 = kotlinx.coroutines.p561s2.C14043c.this
                java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.p561s2.C14043c.f30622w
                long r7 = r8.decrementAndGet(r7)
                r4 = 0
                int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r2 > 0) goto L77
                r0.f30630f = r6
                r0.f30631w = r0
                r0.f30628d = r3
                kotlinx.coroutines.n r7 = new kotlinx.coroutines.n
                kotlin.c0.d r8 = kotlin.p476c0.p477j.C11728b.m10392c(r0)
                r7.<init>(r8, r3)
                r7.m3393B()
                kotlinx.coroutines.s2.c r8 = kotlinx.coroutines.p561s2.C14043c.this
                r8.producer = r7
                java.lang.Object r7 = r7.m3363y()
                java.lang.Object r8 = kotlin.p476c0.p477j.C11728b.m10391d()
                if (r7 != r8) goto L74
                kotlin.p476c0.p478k.p479a.C11741h.m10374c(r0)
            L74:
                if (r7 != r1) goto L80
                return r1
            L77:
                kotlinx.coroutines.s2.c r7 = kotlinx.coroutines.p561s2.C14043c.this
                kotlin.c0.g r7 = r7.mo3397o0()
                kotlinx.coroutines.C14040s1.m3183e(r7)
            L80:
                kotlin.w r7 = kotlin.C13666w.f30112a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p561s2.C14043c.C14044a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: Continuation.kt */
    /* renamed from: kotlinx.coroutines.s2.c$b */
    /* loaded from: classes3.dex */
    public static final class C14046b implements InterfaceC11714d<C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC11719g f30632c;

        /* renamed from: d */
        final /* synthetic */ C14043c f30633d;

        public C14046b(InterfaceC11719g interfaceC11719g, C14043c c14043c) {
            this.f30632c = interfaceC11719g;
            this.f30633d = c14043c;
        }

        @Override // kotlin.p476c0.InterfaceC11714d
        public InterfaceC11719g getContext() {
            return this.f30632c;
        }

        @Override // kotlin.p476c0.InterfaceC11714d
        public void resumeWith(Object obj) {
            C14036a.m3197d(new C14047c(this.f30633d), this.f30633d);
        }
    }

    /* compiled from: ReactiveFlow.kt */
    /* renamed from: kotlinx.coroutines.s2.c$c */
    /* loaded from: classes3.dex */
    /* synthetic */ class C14047c extends C11800j implements InterfaceC11767l<C13666w> {
        C14047c(Object obj) {
            super(1, obj, C14043c.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final Object invoke(InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C14043c) this.f26478d).m3177Z0(interfaceC11714d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactiveFlow.kt */
    @f(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", l = {209}, m = "flowProcessing")
    /* renamed from: kotlinx.coroutines.s2.c$d */
    /* loaded from: classes3.dex */
    public static final class C14048d extends AbstractC11738d {

        /* renamed from: c */
        Object f30634c;

        /* renamed from: d */
        /* synthetic */ Object f30635d;

        /* renamed from: e */
        final /* synthetic */ C14043c<T> f30636e;

        /* renamed from: f */
        int f30637f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14048d(C14043c<T> c14043c, InterfaceC11714d<? super C14048d> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30636e = c14043c;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30635d = obj;
            this.f30637f |= Integer.MIN_VALUE;
            return this.f30636e.m3177Z0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14043c(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC14456b<? super T> interfaceC14456b, InterfaceC11719g interfaceC11719g) {
        super(interfaceC11719g, false, true);
        this.f30624e = interfaceC13964d;
        this.f30625f = interfaceC14456b;
        this.requested = 0L;
        this.producer = m3178Y0();
    }

    /* renamed from: X0 */
    private final Object m3179X0(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object mo3175a = this.f30624e.mo3175a(new C14044a(), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }

    /* renamed from: Y0 */
    private final InterfaceC11714d<C13666w> m3178Y0() {
        return new C14046b(mo3397o0(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(3:9|10|11)(2:39|40))(4:41|42|43|(1:45)(1:46))|12|13|14|15))|50|6|(0)(0)|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        kotlinx.coroutines.C13917j0.m3410a(r0.mo3397o0(), r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3177Z0(kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.p561s2.C14043c.C14048d
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.s2.c$d r0 = (kotlinx.coroutines.p561s2.C14043c.C14048d) r0
            int r1 = r0.f30637f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30637f = r1
            goto L18
        L13:
            kotlinx.coroutines.s2.c$d r0 = new kotlinx.coroutines.s2.c$d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30635d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30637f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f30634c
            kotlinx.coroutines.s2.c r0 = (kotlinx.coroutines.p561s2.C14043c) r0
            kotlin.C13291q.m5357b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L46
        L2d:
            r5 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C13291q.m5357b(r5)
            r0.f30634c = r4     // Catch: java.lang.Throwable -> L57
            r0.f30637f = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r4.m3179X0(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            n.b.b<? super T> r5 = r0.f30625f     // Catch: java.lang.Throwable -> L4c
            r5.mo1690a()     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r5 = move-exception
            kotlin.c0.g r0 = r0.mo3397o0()
            kotlinx.coroutines.C13917j0.m3410a(r0, r5)
        L54:
            kotlin.w r5 = kotlin.C13666w.f30112a
            return r5
        L57:
            r5 = move-exception
            r0 = r4
        L59:
            boolean r1 = kotlinx.coroutines.C13952q0.m3342d()
            if (r1 != 0) goto L61
            r1 = r5
            goto L65
        L61:
            java.lang.Throwable r1 = kotlinx.coroutines.internal.C13913x.m3421n(r5)
        L65:
            boolean r2 = r0.cancellationRequested
            if (r2 == 0) goto L75
            boolean r2 = r0.isActive()
            if (r2 != 0) goto L75
            java.util.concurrent.CancellationException r2 = r0.mo3025X()
            if (r1 == r2) goto L86
        L75:
            n.b.b<? super T> r1 = r0.f30625f     // Catch: java.lang.Throwable -> L7b
            r1.mo1689b(r5)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r1 = move-exception
            kotlin.C11706b.m10414a(r5, r1)
            kotlin.c0.g r0 = r0.mo3397o0()
            kotlinx.coroutines.C13917j0.m3410a(r0, r5)
        L86:
            kotlin.w r5 = kotlin.C13666w.f30112a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p561s2.C14043c.m3177Z0(kotlin.c0.d):java.lang.Object");
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        this.cancellationRequested = true;
        mo3015m(null);
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        long j2;
        long j3;
        InterfaceC11714d interfaceC11714d;
        if (j <= 0) {
            return;
        }
        do {
            j2 = this.requested;
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!f30622w.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            boolean z = j2 == 0;
            if (C13668y.f30115a && !z) {
                throw new AssertionError("Assertion failed");
            }
            do {
                interfaceC11714d = (InterfaceC11714d) f30623x.getAndSet(this, null);
            } while (interfaceC11714d == null);
            C13666w c13666w = C13666w.f30112a;
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13288p.m5362a(c13666w);
            interfaceC11714d.resumeWith(c13666w);
        }
    }
}
