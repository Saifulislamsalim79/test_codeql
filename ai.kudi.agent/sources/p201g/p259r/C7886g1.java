package p201g.p259r;

import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.InterfaceC13930m;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.InterfaceC13801x;
/* compiled from: SimpleChannelFlow.kt */
/* renamed from: g.r.g1 */
/* loaded from: classes2.dex */
public final class C7886g1<T> implements InterfaceC7881f1<T>, InterfaceC13932m0, InterfaceC13801x<T> {

    /* renamed from: c */
    private final InterfaceC13801x<T> f18884c;

    /* renamed from: d */
    private final /* synthetic */ InterfaceC13932m0 f18885d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleChannelFlow.kt */
    @f(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {97}, m = "awaitClose")
    /* renamed from: g.r.g1$a */
    /* loaded from: classes2.dex */
    public static final class C7887a extends AbstractC11738d {

        /* renamed from: c */
        Object f18886c;

        /* renamed from: d */
        Object f18887d;

        /* renamed from: e */
        /* synthetic */ Object f18888e;

        /* renamed from: f */
        final /* synthetic */ C7886g1<T> f18889f;

        /* renamed from: w */
        int f18890w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7887a(C7886g1<T> c7886g1, InterfaceC11714d<? super C7887a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f18889f = c7886g1;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f18888e = obj;
            this.f18890w |= Integer.MIN_VALUE;
            return this.f18889f.mo17111I(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleChannelFlow.kt */
    /* renamed from: g.r.g1$b */
    /* loaded from: classes2.dex */
    public static final class C7888b extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13930m<C13666w> f18891c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7888b(InterfaceC13930m<? super C13666w> interfaceC13930m) {
            super(1);
            this.f18891c = interfaceC13930m;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            invoke2(th);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC13930m<C13666w> interfaceC13930m = this.f18891c;
            C13666w c13666w = C13666w.f30112a;
            C13288p.C13289a c13289a = C13288p.f29444c;
            C13288p.m5362a(c13666w);
            interfaceC13930m.resumeWith(c13666w);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7886g1(InterfaceC13932m0 interfaceC13932m0, InterfaceC13801x<? super T> interfaceC13801x) {
        l.f(interfaceC13932m0, "scope");
        l.f(interfaceC13801x, "channel");
        this.f18884c = interfaceC13801x;
        this.f18885d = interfaceC13932m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // p201g.p259r.InterfaceC7881f1
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo17111I(kotlin.p483e0.p484c.InterfaceC11756a<kotlin.C13666w> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p201g.p259r.C7886g1.C7887a
            if (r0 == 0) goto L13
            r0 = r7
            g.r.g1$a r0 = (p201g.p259r.C7886g1.C7887a) r0
            int r1 = r0.f18890w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18890w = r1
            goto L18
        L13:
            g.r.g1$a r0 = new g.r.g1$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18888e
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f18890w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f18887d
            kotlinx.coroutines.p1 r6 = (kotlinx.coroutines.InterfaceC13947p1) r6
            java.lang.Object r6 = r0.f18886c
            kotlin.e0.c.a r6 = (kotlin.p483e0.p484c.InterfaceC11756a) r6
            kotlin.C13291q.m5357b(r7)     // Catch: java.lang.Throwable -> L86
            goto L74
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C13291q.m5357b(r7)
            kotlin.c0.g r7 = r5.mo3397o0()     // Catch: java.lang.Throwable -> L86
            kotlinx.coroutines.p1$b r2 = kotlinx.coroutines.InterfaceC13947p1.f30435u     // Catch: java.lang.Throwable -> L86
            kotlin.c0.g$b r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto L7a
            kotlinx.coroutines.p1 r7 = (kotlinx.coroutines.InterfaceC13947p1) r7     // Catch: java.lang.Throwable -> L86
            r0.f18886c = r6     // Catch: java.lang.Throwable -> L86
            r0.f18887d = r7     // Catch: java.lang.Throwable -> L86
            r0.f18890w = r3     // Catch: java.lang.Throwable -> L86
            kotlinx.coroutines.n r2 = new kotlinx.coroutines.n     // Catch: java.lang.Throwable -> L86
            kotlin.c0.d r4 = kotlin.p476c0.p477j.C11728b.m10392c(r0)     // Catch: java.lang.Throwable -> L86
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L86
            r2.m3393B()     // Catch: java.lang.Throwable -> L86
            g.r.g1$b r3 = new g.r.g1$b     // Catch: java.lang.Throwable -> L86
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r7.mo3002u0(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r7 = r2.m3363y()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = kotlin.p476c0.p477j.C11728b.m10391d()     // Catch: java.lang.Throwable -> L86
            if (r7 != r2) goto L71
            kotlin.p476c0.p478k.p479a.C11741h.m10374c(r0)     // Catch: java.lang.Throwable -> L86
        L71:
            if (r7 != r1) goto L74
            return r1
        L74:
            r6.invoke()
            kotlin.w r6 = kotlin.C13666w.f30112a
            return r6
        L7a:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L86
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7886g1.mo17111I(kotlin.e0.c.a, kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: f */
    public boolean mo3641f(Throwable th) {
        return this.f18884c.mo3641f(th);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: k */
    public Object mo3640k(T t) {
        return this.f18884c.mo3640k(t);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13801x
    /* renamed from: o */
    public Object mo3639o(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return this.f18884c.mo3639o(t, interfaceC11714d);
    }

    @Override // kotlinx.coroutines.InterfaceC13932m0
    /* renamed from: o0 */
    public InterfaceC11719g mo3397o0() {
        return this.f18885d.mo3397o0();
    }
}
