package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11810u;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.C14030x;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p559q2.InterfaceC14021r;
import p201g.p259r.C7987o0;
/* compiled from: PagingDataDiffer.kt */
/* renamed from: g.r.t0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8028t0<T> {

    /* renamed from: a */
    private final InterfaceC7972m f19336a;

    /* renamed from: b */
    private final AbstractC13857h0 f19337b;

    /* renamed from: c */
    private C7987o0<T> f19338c;

    /* renamed from: d */
    private InterfaceC7971l1 f19339d;

    /* renamed from: e */
    private final C7848d0 f19340e;

    /* renamed from: f */
    private final CopyOnWriteArrayList<InterfaceC11756a<C13666w>> f19341f;

    /* renamed from: g */
    private final C7892h1 f19342g;

    /* renamed from: h */
    private volatile boolean f19343h;

    /* renamed from: i */
    private volatile int f19344i;

    /* renamed from: j */
    private final C8034c f19345j;

    /* renamed from: k */
    private final InterfaceC13964d<C7904j> f19346k;

    /* renamed from: l */
    private final InterfaceC14021r<C13666w> f19347l;

    /* compiled from: PagingDataDiffer.kt */
    /* renamed from: g.r.t0$a */
    /* loaded from: classes2.dex */
    static final class C8029a extends AbstractC11802m implements InterfaceC11756a<C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC8028t0<T> f19348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8029a(AbstractC8028t0<T> abstractC8028t0) {
            super(0);
            this.f19348c = abstractC8028t0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            invoke2();
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AbstractC8028t0) this.f19348c).f19347l.mo3231f(C13666w.f30112a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagingDataDiffer.kt */
    @f(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {467}, m = "invokeSuspend")
    /* renamed from: g.r.t0$b */
    /* loaded from: classes2.dex */
    public static final class C8030b extends AbstractC11745k implements InterfaceC11767l<InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19349c;

        /* renamed from: d */
        final /* synthetic */ AbstractC8028t0<T> f19350d;

        /* renamed from: e */
        final /* synthetic */ C8013r0<T> f19351e;

        /* compiled from: PagingDataDiffer.kt */
        @f(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", l = {151, 193}, m = "invokeSuspend")
        /* renamed from: g.r.t0$b$a */
        /* loaded from: classes2.dex */
        static final class C8031a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

            /* renamed from: c */
            Object f19352c;

            /* renamed from: d */
            Object f19353d;

            /* renamed from: e */
            int f19354e;

            /* renamed from: f */
            final /* synthetic */ AbstractC7905j0<T> f19355f;

            /* renamed from: w */
            final /* synthetic */ AbstractC8028t0<T> f19356w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PagingDataDiffer.kt */
            /* renamed from: g.r.t0$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C8032a extends AbstractC11802m implements InterfaceC11756a<C13666w> {

                /* renamed from: c */
                final /* synthetic */ AbstractC8028t0<T> f19357c;

                /* renamed from: d */
                final /* synthetic */ C7987o0<T> f19358d;

                /* renamed from: e */
                final /* synthetic */ C11810u f19359e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C8032a(AbstractC8028t0<T> abstractC8028t0, C7987o0<T> c7987o0, C11810u c11810u) {
                    super(0);
                    this.f19357c = abstractC8028t0;
                    this.f19358d = c7987o0;
                    this.f19359e = c11810u;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                public /* bridge */ /* synthetic */ C13666w invoke() {
                    invoke2();
                    return C13666w.f30112a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((AbstractC8028t0) this.f19357c).f19338c = this.f19358d;
                    this.f19359e.f26497c = true;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8031a(AbstractC7905j0<T> abstractC7905j0, AbstractC8028t0<T> abstractC8028t0, InterfaceC11714d<? super C8031a> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f19355f = abstractC7905j0;
                this.f19356w = abstractC8028t0;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C8031a(this.f19355f, this.f19356w, interfaceC11714d);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                return ((C8031a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 516
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.AbstractC8028t0.C8030b.C8031a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: Collect.kt */
        /* renamed from: g.r.t0$b$b */
        /* loaded from: classes2.dex */
        public static final class C8033b implements InterfaceC13969e<AbstractC7905j0<T>> {

            /* renamed from: c */
            final /* synthetic */ AbstractC8028t0 f19360c;

            public C8033b(AbstractC8028t0 abstractC8028t0) {
                this.f19360c = abstractC8028t0;
            }

            @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
            public Object emit(AbstractC7905j0<T> abstractC7905j0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
                Object m10387d;
                Object m3566c = C13864i.m3566c(this.f19360c.f19337b, new C8031a(abstractC7905j0, this.f19360c, null), interfaceC11714d);
                m10387d = C11734d.m10387d();
                return m3566c == m10387d ? m3566c : C13666w.f30112a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8030b(AbstractC8028t0<T> abstractC8028t0, C8013r0<T> c8013r0, InterfaceC11714d<? super C8030b> interfaceC11714d) {
            super(1, interfaceC11714d);
            this.f19350d = abstractC8028t0;
            this.f19351e = c8013r0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(InterfaceC11714d<?> interfaceC11714d) {
            return new C8030b(this.f19350d, this.f19351e, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19349c;
            if (i == 0) {
                C13291q.m5357b(obj);
                ((AbstractC8028t0) this.f19350d).f19339d = this.f19351e.m16896b();
                InterfaceC13964d<AbstractC7905j0<T>> m16897a = this.f19351e.m16897a();
                C8033b c8033b = new C8033b(this.f19350d);
                this.f19349c = 1;
                if (m16897a.mo3175a(c8033b, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: m */
        public final Object invoke(InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C8030b) create(interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: PagingDataDiffer.kt */
    /* renamed from: g.r.t0$c */
    /* loaded from: classes2.dex */
    public static final class C8034c implements C7987o0.InterfaceC7989b {

        /* renamed from: a */
        final /* synthetic */ AbstractC8028t0<T> f19361a;

        C8034c(AbstractC8028t0<T> abstractC8028t0) {
            this.f19361a = abstractC8028t0;
        }

        @Override // p201g.p259r.C7987o0.InterfaceC7989b
        /* renamed from: a */
        public void mo16844a(int i, int i2) {
            ((AbstractC8028t0) this.f19361a).f19336a.mo16979a(i, i2);
        }

        @Override // p201g.p259r.C7987o0.InterfaceC7989b
        /* renamed from: b */
        public void mo16843b(int i, int i2) {
            ((AbstractC8028t0) this.f19361a).f19336a.mo16978b(i, i2);
        }

        @Override // p201g.p259r.C7987o0.InterfaceC7989b
        /* renamed from: c */
        public void mo16842c(int i, int i2) {
            ((AbstractC8028t0) this.f19361a).f19336a.mo16977c(i, i2);
        }

        @Override // p201g.p259r.C7987o0.InterfaceC7989b
        /* renamed from: d */
        public void mo16841d(EnumC7830b0 enumC7830b0, boolean z, AbstractC8061y abstractC8061y) {
            l.f(enumC7830b0, "loadType");
            l.f(abstractC8061y, "loadState");
            if (l.b(((AbstractC8028t0) this.f19361a).f19340e.m17151c(enumC7830b0, z), abstractC8061y)) {
                return;
            }
            ((AbstractC8028t0) this.f19361a).f19340e.m17145i(enumC7830b0, z, abstractC8061y);
        }

        @Override // p201g.p259r.C7987o0.InterfaceC7989b
        /* renamed from: e */
        public void mo16840e(C7825a0 c7825a0, C7825a0 c7825a02) {
            l.f(c7825a0, TransactionField.TRANSACTION_CHANNEL);
            this.f19361a.m16854r(c7825a0, c7825a02);
        }
    }

    public AbstractC8028t0(InterfaceC7972m interfaceC7972m, AbstractC13857h0 abstractC13857h0) {
        l.f(interfaceC7972m, "differCallback");
        l.f(abstractC13857h0, "mainDispatcher");
        this.f19336a = interfaceC7972m;
        this.f19337b = abstractC13857h0;
        this.f19338c = C7987o0.f19238e.m16922a();
        this.f19340e = new C7848d0();
        this.f19341f = new CopyOnWriteArrayList<>();
        this.f19342g = new C7892h1(false, 1, null);
        this.f19345j = new C8034c(this);
        this.f19346k = this.f19340e.m17150d();
        this.f19347l = C14030x.m3216a(0, 64, EnumC13778e.DROP_OLDEST);
        m16856p(new C8029a(this));
    }

    /* renamed from: A */
    public final void m16875A(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f19340e.m17147g(interfaceC11767l);
    }

    /* renamed from: B */
    public final void m16874B(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.f19341f.remove(interfaceC11756a);
    }

    /* renamed from: C */
    public final void m16873C() {
        InterfaceC7971l1 interfaceC7971l1 = this.f19339d;
        if (interfaceC7971l1 == null) {
            return;
        }
        interfaceC7971l1.mo16895a();
    }

    /* renamed from: D */
    public final C8052w<T> m16872D() {
        return this.f19338c.m16923q();
    }

    /* renamed from: o */
    public final void m16857o(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f19340e.m17153a(interfaceC11767l);
    }

    /* renamed from: p */
    public final void m16856p(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.f19341f.add(interfaceC11756a);
    }

    /* renamed from: q */
    public final Object m16855q(C8013r0<T> c8013r0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        Object m17104c = C7892h1.m17104c(this.f19342g, 0, new C8030b(this, c8013r0, null), interfaceC11714d, 1, null);
        m10387d = C11734d.m10387d();
        return m17104c == m10387d ? m17104c : C13666w.f30112a;
    }

    /* renamed from: r */
    public final void m16854r(C7825a0 c7825a0, C7825a0 c7825a02) {
        l.f(c7825a0, TransactionField.TRANSACTION_CHANNEL);
        if (l.b(this.f19340e.m17148f(), c7825a0) && l.b(this.f19340e.m17149e(), c7825a02)) {
            return;
        }
        this.f19340e.m17146h(c7825a0, c7825a02);
    }

    /* renamed from: s */
    public final T m16853s(int i) {
        this.f19343h = true;
        this.f19344i = i;
        InterfaceC7971l1 interfaceC7971l1 = this.f19339d;
        if (interfaceC7971l1 != null) {
            interfaceC7971l1.mo16893c(this.f19338c.m16934f(i));
        }
        return this.f19338c.m16929k(i);
    }

    /* renamed from: t */
    public final InterfaceC13964d<C7904j> m16852t() {
        return this.f19346k;
    }

    /* renamed from: u */
    public final InterfaceC13964d<C13666w> m16851u() {
        return C13971f.m3333a(this.f19347l);
    }

    /* renamed from: v */
    public final int m16850v() {
        return this.f19338c.getSize();
    }

    /* renamed from: w */
    public final T m16849w(int i) {
        return this.f19338c.m16929k(i);
    }

    /* renamed from: x */
    public abstract boolean mo16848x();

    /* renamed from: y */
    public abstract Object mo16847y(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, int i, InterfaceC11756a<C13666w> interfaceC11756a, InterfaceC11714d<? super Integer> interfaceC11714d);

    /* renamed from: z */
    public final void m16846z() {
        InterfaceC7971l1 interfaceC7971l1 = this.f19339d;
        if (interfaceC7971l1 == null) {
            return;
        }
        interfaceC7971l1.mo16894b();
    }
}
