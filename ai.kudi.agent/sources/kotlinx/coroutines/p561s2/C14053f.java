package kotlinx.coroutines.p561s2;

import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlinx.coroutines.channels.C13783i;
import kotlinx.coroutines.channels.C13784j;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.channels.InterfaceC13779f;
import kotlinx.coroutines.channels.InterfaceC13801x;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: ReactiveFlow.kt */
/* renamed from: kotlinx.coroutines.s2.f */
/* loaded from: classes3.dex */
final class C14053f<T> implements InterfaceC14456b<T> {

    /* renamed from: c */
    private final long f30651c;

    /* renamed from: d */
    private InterfaceC14457c f30652d;

    /* renamed from: e */
    private final InterfaceC13779f<T> f30653e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactiveFlow.kt */
    @f(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", l = {129}, m = "takeNextOrNull")
    /* renamed from: kotlinx.coroutines.s2.f$a */
    /* loaded from: classes3.dex */
    public static final class C14054a extends AbstractC11738d {

        /* renamed from: c */
        /* synthetic */ Object f30654c;

        /* renamed from: d */
        final /* synthetic */ C14053f<T> f30655d;

        /* renamed from: e */
        int f30656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14054a(C14053f<T> c14053f, InterfaceC11714d<? super C14054a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f30655d = c14053f;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f30654c = obj;
            this.f30656e |= Integer.MIN_VALUE;
            return this.f30655d.m3163e(this);
        }
    }

    public C14053f(int i, EnumC13778e enumC13778e, long j) {
        this.f30651c = j;
        this.f30653e = C13783i.m3686b(i == 0 ? 1 : i, enumC13778e, null, 4, null);
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: a */
    public void mo1690a() {
        InterfaceC13801x.C13802a.m3638a(this.f30653e, null, 1, null);
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: b */
    public void mo1689b(Throwable th) {
        this.f30653e.mo3641f(th);
    }

    /* renamed from: c */
    public final void m3165c() {
        InterfaceC14457c interfaceC14457c = this.f30652d;
        if (interfaceC14457c != null) {
            interfaceC14457c.cancel();
        } else {
            l.u("subscription");
            throw null;
        }
    }

    /* renamed from: d */
    public final void m3164d() {
        InterfaceC14457c interfaceC14457c = this.f30652d;
        if (interfaceC14457c != null) {
            interfaceC14457c.mo1686e(this.f30651c);
        } else {
            l.u("subscription");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3163e(kotlin.p476c0.InterfaceC11714d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.p561s2.C14053f.C14054a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.s2.f$a r0 = (kotlinx.coroutines.p561s2.C14053f.C14054a) r0
            int r1 = r0.f30656e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30656e = r1
            goto L18
        L13:
            kotlinx.coroutines.s2.f$a r0 = new kotlinx.coroutines.s2.f$a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f30654c
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f30656e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.C13291q.m5357b(r5)
            kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.C13784j) r5
            java.lang.Object r5 = r5.m3675k()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.C13291q.m5357b(r5)
            kotlinx.coroutines.channels.f<T> r5 = r4.f30653e
            r0.f30656e = r3
            java.lang.Object r5 = r5.mo3649d(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Throwable r0 = kotlinx.coroutines.channels.C13784j.m3681e(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.C13784j.C13787c
            if (r0 == 0) goto L53
            kotlinx.coroutines.channels.C13784j.m3681e(r5)
            r5 = 0
        L53:
            return r5
        L54:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p561s2.C14053f.m3163e(kotlin.c0.d):java.lang.Object");
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: f */
    public void mo1688f(T t) {
        if (C13784j.m3677i(this.f30653e.mo3640k(t))) {
            return;
        }
        throw new IllegalArgumentException(("Element " + t + " was not added to channel because it was full, " + this.f30653e).toString());
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: g */
    public void mo1687g(InterfaceC14457c interfaceC14457c) {
        this.f30652d = interfaceC14457c;
        m3164d();
    }
}
