package p201g.p259r;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1574m;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.InterfaceC1738r;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C13916j;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
/* compiled from: AsyncPagingDataDiffer.kt */
/* renamed from: g.r.d */
/* loaded from: classes2.dex */
public final class C7842d<T> {

    /* renamed from: a */
    private final C1713j.AbstractC1719f<T> f18752a;

    /* renamed from: b */
    private final InterfaceC1738r f18753b;

    /* renamed from: c */
    private final AbstractC13857h0 f18754c;

    /* renamed from: d */
    private final AbstractC13857h0 f18755d;

    /* renamed from: e */
    private final InterfaceC7972m f18756e;

    /* renamed from: f */
    private boolean f18757f;

    /* renamed from: g */
    private final C7843a f18758g;

    /* renamed from: h */
    private final AtomicInteger f18759h;

    /* renamed from: i */
    private final InterfaceC13964d<C7904j> f18760i;

    /* renamed from: j */
    private final InterfaceC13964d<C13666w> f18761j;

    /* compiled from: AsyncPagingDataDiffer.kt */
    /* renamed from: g.r.d$a */
    /* loaded from: classes2.dex */
    public static final class C7843a extends AbstractC8028t0<T> {

        /* renamed from: m */
        final /* synthetic */ C7842d<T> f18762m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncPagingDataDiffer.kt */
        @f(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", l = {98}, m = "presentNewList")
        /* renamed from: g.r.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C7844a extends AbstractC11738d {

            /* renamed from: c */
            Object f18763c;

            /* renamed from: d */
            Object f18764d;

            /* renamed from: e */
            Object f18765e;

            /* renamed from: f */
            Object f18766f;

            /* renamed from: w */
            int f18767w;

            /* renamed from: x */
            /* synthetic */ Object f18768x;

            /* renamed from: z */
            int f18770z;

            C7844a(InterfaceC11714d<? super C7844a> interfaceC11714d) {
                super(interfaceC11714d);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f18768x = obj;
                this.f18770z |= Integer.MIN_VALUE;
                return C7843a.this.mo16847y(null, null, 0, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncPagingDataDiffer.kt */
        @f(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: g.r.d$a$b */
        /* loaded from: classes2.dex */
        public static final class C7845b extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C7880f0>, Object> {

            /* renamed from: c */
            int f18771c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC7885g0<T> f18772d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC7885g0<T> f18773e;

            /* renamed from: f */
            final /* synthetic */ C7842d<T> f18774f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7845b(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, C7842d<T> c7842d, InterfaceC11714d<? super C7845b> interfaceC11714d) {
                super(2, interfaceC11714d);
                this.f18772d = interfaceC7885g0;
                this.f18773e = interfaceC7885g02;
                this.f18774f = c7842d;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
                return new C7845b(this.f18772d, this.f18773e, this.f18774f, interfaceC11714d);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11771p
            public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C7880f0> interfaceC11714d) {
                return ((C7845b) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                C11734d.m10387d();
                if (this.f18771c == 0) {
                    C13291q.m5357b(obj);
                    return C7890h0.m17109a(this.f18772d, this.f18773e, ((C7842d) this.f18774f).f18752a);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7843a(C7842d<T> c7842d, InterfaceC7972m interfaceC7972m, AbstractC13857h0 abstractC13857h0) {
            super(interfaceC7972m, abstractC13857h0);
            this.f18762m = c7842d;
        }

        @Override // p201g.p259r.AbstractC8028t0
        /* renamed from: x */
        public boolean mo16848x() {
            return this.f18762m.m17166i();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        @Override // p201g.p259r.AbstractC8028t0
        /* renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo16847y(p201g.p259r.InterfaceC7885g0<T> r7, p201g.p259r.InterfaceC7885g0<T> r8, int r9, kotlin.p483e0.p484c.InterfaceC11756a<kotlin.C13666w> r10, kotlin.p476c0.InterfaceC11714d<? super java.lang.Integer> r11) {
            /*
                r6 = this;
                boolean r0 = r11 instanceof p201g.p259r.C7842d.C7843a.C7844a
                if (r0 == 0) goto L13
                r0 = r11
                g.r.d$a$a r0 = (p201g.p259r.C7842d.C7843a.C7844a) r0
                int r1 = r0.f18770z
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18770z = r1
                goto L18
            L13:
                g.r.d$a$a r0 = new g.r.d$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f18768x
                java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
                int r2 = r0.f18770z
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L46
                if (r2 != r3) goto L3e
                int r9 = r0.f18767w
                java.lang.Object r7 = r0.f18766f
                r10 = r7
                kotlin.e0.c.a r10 = (kotlin.p483e0.p484c.InterfaceC11756a) r10
                java.lang.Object r7 = r0.f18765e
                r8 = r7
                g.r.g0 r8 = (p201g.p259r.InterfaceC7885g0) r8
                java.lang.Object r7 = r0.f18764d
                g.r.g0 r7 = (p201g.p259r.InterfaceC7885g0) r7
                java.lang.Object r0 = r0.f18763c
                g.r.d$a r0 = (p201g.p259r.C7842d.C7843a) r0
                kotlin.C13291q.m5357b(r11)
                goto L99
            L3e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L46:
                kotlin.C13291q.m5357b(r11)
                int r11 = r7.getSize()
                r2 = 0
                if (r11 != 0) goto L61
                r10.invoke()
                g.r.d<T> r7 = r6.f18762m
                g.r.m r7 = r7.m17167h()
                int r8 = r8.getSize()
                r7.mo16979a(r2, r8)
                goto Laf
            L61:
                int r11 = r8.getSize()
                if (r11 != 0) goto L78
                r10.invoke()
                g.r.d<T> r8 = r6.f18762m
                g.r.m r8 = r8.m17167h()
                int r7 = r7.getSize()
                r8.mo16978b(r2, r7)
                goto Laf
            L78:
                g.r.d<T> r11 = r6.f18762m
                kotlinx.coroutines.h0 r11 = p201g.p259r.C7842d.m17170e(r11)
                g.r.d$a$b r2 = new g.r.d$a$b
                g.r.d<T> r5 = r6.f18762m
                r2.<init>(r7, r8, r5, r4)
                r0.f18763c = r6
                r0.f18764d = r7
                r0.f18765e = r8
                r0.f18766f = r10
                r0.f18767w = r9
                r0.f18770z = r3
                java.lang.Object r11 = kotlinx.coroutines.C13864i.m3566c(r11, r2, r0)
                if (r11 != r1) goto L98
                return r1
            L98:
                r0 = r6
            L99:
                g.r.f0 r11 = (p201g.p259r.C7880f0) r11
                r10.invoke()
                g.r.d<T> r10 = r0.f18762m
                androidx.recyclerview.widget.r r10 = p201g.p259r.C7842d.m17171d(r10)
                p201g.p259r.C7890h0.m17108b(r7, r10, r8, r11)
                int r7 = p201g.p259r.C7890h0.m17107c(r7, r11, r8, r9)
                java.lang.Integer r4 = kotlin.p476c0.p478k.p479a.C11736b.m10381b(r7)
            Laf:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7842d.C7843a.mo16847y(g.r.g0, g.r.g0, int, kotlin.e0.c.a, kotlin.c0.d):java.lang.Object");
        }
    }

    /* compiled from: AsyncPagingDataDiffer.kt */
    /* renamed from: g.r.d$b */
    /* loaded from: classes2.dex */
    public static final class C7846b implements InterfaceC7972m {

        /* renamed from: a */
        final /* synthetic */ C7842d<T> f18775a;

        C7846b(C7842d<T> c7842d) {
            this.f18775a = c7842d;
        }

        @Override // p201g.p259r.InterfaceC7972m
        /* renamed from: a */
        public void mo16979a(int i, int i2) {
            if (i2 > 0) {
                ((C7842d) this.f18775a).f18753b.mo17098a(i, i2);
            }
        }

        @Override // p201g.p259r.InterfaceC7972m
        /* renamed from: b */
        public void mo16978b(int i, int i2) {
            if (i2 > 0) {
                ((C7842d) this.f18775a).f18753b.mo17097b(i, i2);
            }
        }

        @Override // p201g.p259r.InterfaceC7972m
        /* renamed from: c */
        public void mo16977c(int i, int i2) {
            if (i2 > 0) {
                ((C7842d) this.f18775a).f18753b.mo17095d(i, i2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncPagingDataDiffer.kt */
    @f(c = "androidx.paging.AsyncPagingDataDiffer$submitData$2", f = "AsyncPagingDataDiffer.kt", l = {163}, m = "invokeSuspend")
    /* renamed from: g.r.d$c */
    /* loaded from: classes2.dex */
    public static final class C7847c extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18776c;

        /* renamed from: d */
        final /* synthetic */ C7842d<T> f18777d;

        /* renamed from: e */
        final /* synthetic */ int f18778e;

        /* renamed from: f */
        final /* synthetic */ C8013r0<T> f18779f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7847c(C7842d<T> c7842d, int i, C8013r0<T> c8013r0, InterfaceC11714d<? super C7847c> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18777d = c7842d;
            this.f18778e = i;
            this.f18779f = c8013r0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7847c(this.f18777d, this.f18778e, this.f18779f, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7847c) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18776c;
            if (i == 0) {
                C13291q.m5357b(obj);
                if (((C7842d) this.f18777d).f18759h.get() == this.f18778e) {
                    C7843a c7843a = ((C7842d) this.f18777d).f18758g;
                    C8013r0<T> c8013r0 = this.f18779f;
                    this.f18776c = 1;
                    if (c7843a.m16855q(c8013r0, this) == m10387d) {
                        return m10387d;
                    }
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }
    }

    public C7842d(C1713j.AbstractC1719f<T> abstractC1719f, InterfaceC1738r interfaceC1738r, AbstractC13857h0 abstractC13857h0, AbstractC13857h0 abstractC13857h02) {
        l.f(abstractC1719f, "diffCallback");
        l.f(interfaceC1738r, "updateCallback");
        l.f(abstractC13857h0, "mainDispatcher");
        l.f(abstractC13857h02, "workerDispatcher");
        this.f18752a = abstractC1719f;
        this.f18753b = interfaceC1738r;
        this.f18754c = abstractC13857h0;
        this.f18755d = abstractC13857h02;
        C7846b c7846b = new C7846b(this);
        this.f18756e = c7846b;
        this.f18758g = new C7843a(this, c7846b, this.f18754c);
        this.f18759h = new AtomicInteger(0);
        this.f18760i = this.f18758g.m16852t();
        this.f18761j = this.f18758g.m16851u();
    }

    /* renamed from: f */
    public final void m17169f(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f18758g.m16857o(interfaceC11767l);
    }

    /* renamed from: g */
    public final void m17168g(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.f18758g.m16856p(interfaceC11756a);
    }

    /* renamed from: h */
    public final InterfaceC7972m m17167h() {
        return this.f18756e;
    }

    /* renamed from: i */
    public final boolean m17166i() {
        return this.f18757f;
    }

    /* renamed from: j */
    public final T m17165j(int i) {
        try {
            this.f18757f = true;
            return this.f18758g.m16853s(i);
        } finally {
            this.f18757f = false;
        }
    }

    /* renamed from: k */
    public final int m17164k() {
        return this.f18758g.m16850v();
    }

    /* renamed from: l */
    public final InterfaceC13964d<C7904j> m17163l() {
        return this.f18760i;
    }

    /* renamed from: m */
    public final InterfaceC13964d<C13666w> m17162m() {
        return this.f18761j;
    }

    /* renamed from: n */
    public final T m17161n(int i) {
        return this.f18758g.m16849w(i);
    }

    /* renamed from: o */
    public final void m17160o() {
        this.f18758g.m16846z();
    }

    /* renamed from: p */
    public final void m17159p(InterfaceC11767l<? super C7904j, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "listener");
        this.f18758g.m16875A(interfaceC11767l);
    }

    /* renamed from: q */
    public final void m17158q(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "listener");
        this.f18758g.m16874B(interfaceC11756a);
    }

    /* renamed from: r */
    public final void m17157r() {
        this.f18758g.m16873C();
    }

    /* renamed from: s */
    public final C8052w<T> m17156s() {
        return this.f18758g.m16872D();
    }

    /* renamed from: t */
    public final Object m17155t(C8013r0<T> c8013r0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        this.f18759h.incrementAndGet();
        Object m16855q = this.f18758g.m16855q(c8013r0, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m16855q == m10387d ? m16855q : C13666w.f30112a;
    }

    /* renamed from: u */
    public final void m17154u(AbstractC1565i abstractC1565i, C8013r0<T> c8013r0) {
        l.f(abstractC1565i, "lifecycle");
        l.f(c8013r0, "pagingData");
        C13916j.m3412b(C1574m.m35508a(abstractC1565i), null, null, new C7847c(this, this.f18759h.incrementAndGet(), c8013r0, null), 3, null);
    }
}
