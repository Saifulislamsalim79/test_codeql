package kotlinx.coroutines.p559q2;

import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11812w;
import kotlinx.coroutines.flow.internal.C13841p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
/* renamed from: kotlinx.coroutines.q2.c */
/* loaded from: classes3.dex */
public final class C13960c<T> implements InterfaceC13964d<T> {

    /* renamed from: c */
    private final InterfaceC13964d<T> f30457c;

    /* renamed from: d */
    public final InterfaceC11767l<T, Object> f30458d;

    /* renamed from: e */
    public final InterfaceC11771p<Object, Object, Boolean> f30459e;

    /* compiled from: Collect.kt */
    /* renamed from: kotlinx.coroutines.q2.c$a */
    /* loaded from: classes3.dex */
    public static final class C13961a implements InterfaceC13969e<T> {

        /* renamed from: d */
        final /* synthetic */ C11812w f30461d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13969e f30462e;

        @f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1", f = "Distinct.kt", l = {139}, m = "emit")
        /* renamed from: kotlinx.coroutines.q2.c$a$a */
        /* loaded from: classes3.dex */
        public static final class C13962a extends AbstractC11738d {

            /* renamed from: c */
            /* synthetic */ Object f30463c;

            /* renamed from: d */
            int f30464d;

            public C13962a(InterfaceC11714d interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f30463c = obj;
                this.f30464d |= Integer.MIN_VALUE;
                return C13961a.this.emit(null, this);
            }
        }

        public C13961a(C11812w c11812w, InterfaceC13969e interfaceC13969e) {
            this.f30461d = c11812w;
            this.f30462e = interfaceC13969e;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.p559q2.C13960c.C13961a.C13962a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.q2.c$a$a r0 = (kotlinx.coroutines.p559q2.C13960c.C13961a.C13962a) r0
                int r1 = r0.f30464d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30464d = r1
                goto L18
            L13:
                kotlinx.coroutines.q2.c$a$a r0 = new kotlinx.coroutines.q2.c$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f30463c
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f30464d
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C13291q.m5357b(r7)
                goto L63
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C13291q.m5357b(r7)
                kotlinx.coroutines.q2.c r7 = kotlinx.coroutines.p559q2.C13960c.this
                kotlin.e0.c.l<T, java.lang.Object> r7 = r7.f30458d
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.e0.d.w r2 = r5.f30461d
                T r2 = r2.f26499c
                kotlinx.coroutines.internal.y r4 = kotlinx.coroutines.flow.internal.C13841p.f30311a
                if (r2 == r4) goto L54
                kotlinx.coroutines.q2.c r4 = kotlinx.coroutines.p559q2.C13960c.this
                kotlin.e0.c.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f30459e
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L63
            L54:
                kotlin.e0.d.w r2 = r5.f30461d
                r2.f26499c = r7
                kotlinx.coroutines.q2.e r7 = r5.f30462e
                r0.f30464d = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L63
                return r1
            L63:
                kotlin.w r6 = kotlin.C13666w.f30112a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p559q2.C13960c.C13961a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13960c(InterfaceC13964d<? extends T> interfaceC13964d, InterfaceC11767l<? super T, ? extends Object> interfaceC11767l, InterfaceC11771p<Object, Object, Boolean> interfaceC11771p) {
        this.f30457c = interfaceC13964d;
        this.f30458d = interfaceC11767l;
        this.f30459e = interfaceC11771p;
    }

    @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
    /* renamed from: a */
    public Object mo3175a(InterfaceC13969e<? super T> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        C11812w c11812w = new C11812w();
        c11812w.f26499c = (T) C13841p.f30311a;
        Object mo3175a = this.f30457c.mo3175a(new C13961a(c11812w, interfaceC13969e), interfaceC11714d);
        m10387d = C11734d.m10387d();
        return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
    }
}
