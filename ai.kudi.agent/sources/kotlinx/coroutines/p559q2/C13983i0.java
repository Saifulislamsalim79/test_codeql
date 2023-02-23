package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: Share.kt */
/* renamed from: kotlinx.coroutines.q2.i0 */
/* loaded from: classes3.dex */
public final class C13983i0<T> implements InterfaceC13969e<T> {

    /* renamed from: c */
    private final InterfaceC13969e<T> f30500c;

    /* renamed from: d */
    private final InterfaceC11771p<InterfaceC13969e<? super T>, InterfaceC11714d<? super C13666w>, Object> f30501d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {410, 414}, m = "onSubscription")
    /* renamed from: kotlinx.coroutines.q2.i0$a */
    /* loaded from: classes3.dex */
    public static final class C13984a extends AbstractC11738d {

        /* renamed from: c */
        Object f30502c;

        /* renamed from: d */
        Object f30503d;

        /* renamed from: e */
        /* synthetic */ Object f30504e;

        /* renamed from: f */
        final /* synthetic */ C13983i0<T> f30505f;

        /* renamed from: w */
        int f30506w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13984a(C13983i0<T> c13983i0, InterfaceC11714d<? super C13984a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30505f = c13983i0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30504e = obj;
            this.f30506w |= Integer.MIN_VALUE;
            return this.f30505f.m3285a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13983i0(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11771p<? super InterfaceC13969e<? super T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        this.f30500c = interfaceC13969e;
        this.f30501d = interfaceC11771p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3285a(kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.p559q2.C13983i0.C13984a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.q2.i0$a r0 = (kotlinx.coroutines.p559q2.C13983i0.C13984a) r0
            int r1 = r0.f30506w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30506w = r1
            goto L18
        L13:
            kotlinx.coroutines.q2.i0$a r0 = new kotlinx.coroutines.q2.i0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f30504e
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30506w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C13291q.m5357b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f30503d
            kotlinx.coroutines.flow.internal.q r2 = (kotlinx.coroutines.flow.internal.C13842q) r2
            java.lang.Object r4 = r0.f30502c
            kotlinx.coroutines.q2.i0 r4 = (kotlinx.coroutines.p559q2.C13983i0) r4
            kotlin.C13291q.m5357b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            kotlin.C13291q.m5357b(r7)
            kotlinx.coroutines.flow.internal.q r2 = new kotlinx.coroutines.flow.internal.q
            kotlinx.coroutines.q2.e<T> r7 = r6.f30500c
            kotlin.c0.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.e0.c.p<kotlinx.coroutines.q2.e<? super T>, kotlin.c0.d<? super kotlin.w>, java.lang.Object> r7 = r6.f30501d     // Catch: java.lang.Throwable -> L7d
            r0.f30502c = r6     // Catch: java.lang.Throwable -> L7d
            r0.f30503d = r2     // Catch: java.lang.Throwable -> L7d
            r0.f30506w = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.q2.e<T> r7 = r4.f30500c
            boolean r2 = r7 instanceof kotlinx.coroutines.p559q2.C13983i0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.q2.i0 r7 = (kotlinx.coroutines.p559q2.C13983i0) r7
            r2 = 0
            r0.f30502c = r2
            r0.f30503d = r2
            r0.f30506w = r3
            java.lang.Object r7 = r7.m3285a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.w r7 = kotlin.C13666w.f30112a
            return r7
        L7a:
            kotlin.w r7 = kotlin.C13666w.f30112a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13983i0.m3285a(kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
    public Object emit(T t, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        return this.f30500c.emit(t, interfaceC11714d);
    }
}
