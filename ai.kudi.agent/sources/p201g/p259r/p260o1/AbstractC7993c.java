package p201g.p259r.p260o1;

import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import p201g.p259r.AbstractC8041v0;
import p425j.p444e.AbstractC11696w;
/* compiled from: RxPagingSource.kt */
/* renamed from: g.r.o1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7993c<Key, Value> extends AbstractC8041v0<Key, Value> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxPagingSource.kt */
    @f(c = "androidx.paging.rxjava2.RxPagingSource", f = "RxPagingSource.kt", l = {37}, m = "load")
    /* renamed from: g.r.o1.c$a */
    /* loaded from: classes2.dex */
    public static final class C7994a extends AbstractC11738d {

        /* renamed from: c */
        /* synthetic */ Object f19245c;

        /* renamed from: d */
        final /* synthetic */ AbstractC7993c<Key, Value> f19246d;

        /* renamed from: e */
        int f19247e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7994a(AbstractC7993c<Key, Value> abstractC7993c, InterfaceC11714d<? super C7994a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19246d = abstractC7993c;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19245c = obj;
            this.f19247e |= Integer.MIN_VALUE;
            return this.f19246d.load(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // p201g.p259r.AbstractC8041v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(p201g.p259r.AbstractC8041v0.AbstractC8042a<Key> r5, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC8041v0.AbstractC8048b<Key, Value>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p201g.p259r.p260o1.AbstractC7993c.C7994a
            if (r0 == 0) goto L13
            r0 = r6
            g.r.o1.c$a r0 = (p201g.p259r.p260o1.AbstractC7993c.C7994a) r0
            int r1 = r0.f19247e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19247e = r1
            goto L18
        L13:
            g.r.o1.c$a r0 = new g.r.o1.c$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f19245c
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19247e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C13291q.m5357b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C13291q.m5357b(r6)
            j.e.w r5 = r4.loadSingle(r5)
            r0.f19247e = r3
            java.lang.Object r6 = kotlinx.coroutines.p562t2.C14059b.m3154a(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "loadSingle(params).await()"
            kotlin.e0.d.l.e(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.p260o1.AbstractC7993c.load(g.r.v0$a, kotlin.c0.d):java.lang.Object");
    }

    public abstract AbstractC11696w<AbstractC8041v0.AbstractC8048b<Key, Value>> loadSingle(AbstractC8041v0.AbstractC8042a<Key> abstractC8042a);
}
