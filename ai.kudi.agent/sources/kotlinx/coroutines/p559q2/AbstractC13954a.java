package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
/* compiled from: Flow.kt */
/* renamed from: kotlinx.coroutines.q2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13954a<T> implements InterfaceC13964d<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: kotlinx.coroutines.q2.a$a */
    /* loaded from: classes3.dex */
    public static final class C13955a extends AbstractC11738d {

        /* renamed from: c */
        Object f30442c;

        /* renamed from: d */
        /* synthetic */ Object f30443d;

        /* renamed from: e */
        final /* synthetic */ AbstractC13954a<T> f30444e;

        /* renamed from: f */
        int f30445f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13955a(AbstractC13954a<T> abstractC13954a, InterfaceC11714d<? super C13955a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30444e = abstractC13954a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30443d = obj;
            this.f30445f |= Integer.MIN_VALUE;
            return this.f30444e.mo3175a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3175a(kotlinx.coroutines.p559q2.InterfaceC13969e<? super T> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.p559q2.AbstractC13954a.C13955a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.q2.a$a r0 = (kotlinx.coroutines.p559q2.AbstractC13954a.C13955a) r0
            int r1 = r0.f30445f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30445f = r1
            goto L18
        L13:
            kotlinx.coroutines.q2.a$a r0 = new kotlinx.coroutines.q2.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30443d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30445f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f30442c
            kotlinx.coroutines.flow.internal.q r6 = (kotlinx.coroutines.flow.internal.C13842q) r6
            kotlin.C13291q.m5357b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C13291q.m5357b(r7)
            kotlinx.coroutines.flow.internal.q r7 = new kotlinx.coroutines.flow.internal.q
            kotlin.c0.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f30442c = r7     // Catch: java.lang.Throwable -> L55
            r0.f30445f = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo3256d(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.w r6 = kotlin.C13666w.f30112a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.AbstractC13954a.mo3175a(kotlinx.coroutines.q2.e, kotlin.c0.d):java.lang.Object");
    }

    /* renamed from: d */
    public abstract Object mo3256d(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d);
}
