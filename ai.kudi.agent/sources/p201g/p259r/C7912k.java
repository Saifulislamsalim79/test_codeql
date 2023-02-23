package p201g.p259r;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import kotlin.C13287o;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlinx.coroutines.p559q2.C13978g0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p559q2.InterfaceC14022s;
/* compiled from: ConflatedEventBus.kt */
/* renamed from: g.r.k */
/* loaded from: classes2.dex */
public final class C7912k<T> {

    /* renamed from: a */
    private final InterfaceC14022s<C13287o<Integer, T>> f18980a;

    /* renamed from: b */
    private final InterfaceC13964d<T> f18981b;

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: g.r.k$a */
    /* loaded from: classes2.dex */
    public static final class C7913a implements InterfaceC13964d<T> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13964d f18982c;

        /* compiled from: Collect.kt */
        /* renamed from: g.r.k$a$a */
        /* loaded from: classes2.dex */
        public static final class C7914a implements InterfaceC13969e<C13287o<? extends Integer, ? extends T>> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC13969e f18983c;

            @f(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {138}, m = "emit")
            /* renamed from: g.r.k$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C7915a extends AbstractC11738d {

                /* renamed from: c */
                /* synthetic */ Object f18984c;

                /* renamed from: d */
                int f18985d;

                public C7915a(InterfaceC11714d interfaceC11714d) {
                    super(interfaceC11714d);
                }

                @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
                public final Object invokeSuspend(Object obj) {
                    this.f18984c = obj;
                    this.f18985d |= Integer.MIN_VALUE;
                    return C7914a.this.emit(null, this);
                }
            }

            public C7914a(InterfaceC13969e interfaceC13969e) {
                this.f18983c = interfaceC13969e;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(java.lang.Object r5, kotlin.p476c0.InterfaceC11714d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p201g.p259r.C7912k.C7913a.C7914a.C7915a
                    if (r0 == 0) goto L13
                    r0 = r6
                    g.r.k$a$a$a r0 = (p201g.p259r.C7912k.C7913a.C7914a.C7915a) r0
                    int r1 = r0.f18985d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18985d = r1
                    goto L18
                L13:
                    g.r.k$a$a$a r0 = new g.r.k$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f18984c
                    java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                    int r2 = r0.f18985d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C13291q.m5357b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C13291q.m5357b(r6)
                    kotlinx.coroutines.q2.e r6 = r4.f18983c
                    kotlin.o r5 = (kotlin.C13287o) r5
                    java.lang.Object r5 = r5.m5363d()
                    if (r5 != 0) goto L3f
                    goto L48
                L3f:
                    r0.f18985d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.w r5 = kotlin.C13666w.f30112a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7912k.C7913a.C7914a.emit(java.lang.Object, kotlin.c0.d):java.lang.Object");
            }
        }

        public C7913a(InterfaceC13964d interfaceC13964d) {
            this.f18982c = interfaceC13964d;
        }

        @Override // kotlinx.coroutines.p559q2.InterfaceC13964d
        /* renamed from: a */
        public Object mo3175a(InterfaceC13969e interfaceC13969e, InterfaceC11714d interfaceC11714d) {
            Object m10387d;
            Object mo3175a = this.f18982c.mo3175a(new C7914a(interfaceC13969e), interfaceC11714d);
            m10387d = C11734d.m10387d();
            return mo3175a == m10387d ? mo3175a : C13666w.f30112a;
        }
    }

    public C7912k(T t) {
        InterfaceC14022s<C13287o<Integer, T>> m3302a = C13978g0.m3302a(new C13287o(Integer.MIN_VALUE, t));
        this.f18980a = m3302a;
        this.f18981b = new C7913a(m3302a);
    }

    /* renamed from: a */
    public final InterfaceC13964d<T> m17056a() {
        return this.f18981b;
    }

    /* renamed from: b */
    public final void m17055b(T t) {
        l.f(t, TransactionBreakDownItemType.DATA);
        InterfaceC14022s<C13287o<Integer, T>> interfaceC14022s = this.f18980a;
        interfaceC14022s.setValue(new C13287o<>(Integer.valueOf(interfaceC14022s.getValue().m5364c().intValue() + 1), t));
    }

    public /* synthetic */ C7912k(Object obj, int i, g gVar) {
        this((i & 1) != 0 ? null : obj);
    }
}
