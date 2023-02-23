package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11657d;
import p425j.p444e.p451f0.p467j.C11661h;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableFlatMap.java */
/* renamed from: j.e.f0.e.b.i */
/* loaded from: classes3.dex */
public final class C11387i<T, U> extends AbstractC11351a<T, U> {

    /* renamed from: e */
    final InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> f25582e;

    /* renamed from: f */
    final boolean f25583f;

    /* renamed from: w */
    final int f25584w;

    /* renamed from: x */
    final int f25585x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFlatMap.java */
    /* renamed from: j.e.f0.e.b.i$a */
    /* loaded from: classes3.dex */
    public static final class C11388a<T, U> extends AtomicReference<InterfaceC14457c> implements InterfaceC11676j<U>, c {

        /* renamed from: c */
        final long f25586c;

        /* renamed from: d */
        final C11389b<T, U> f25587d;

        /* renamed from: e */
        final int f25588e;

        /* renamed from: f */
        final int f25589f;

        /* renamed from: w */
        volatile boolean f25590w;

        /* renamed from: x */
        volatile InterfaceC11322j<U> f25591x;

        /* renamed from: y */
        long f25592y;

        /* renamed from: z */
        int f25593z;

        C11388a(C11389b<T, U> c11389b, long j) {
            this.f25586c = j;
            this.f25587d = c11389b;
            int i = c11389b.f25609w;
            this.f25589f = i;
            this.f25588e = i >> 2;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25590w = true;
            this.f25587d.m11050k();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            lazySet(EnumC11652g.CANCELLED);
            this.f25587d.m11046o(this, th);
        }

        /* renamed from: c */
        void m11057c(long j) {
            if (this.f25593z != 1) {
                long j2 = this.f25592y + j;
                if (j2 >= this.f25588e) {
                    this.f25592y = 0L;
                    get().mo1686e(j2);
                    return;
                }
                this.f25592y = j2;
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(U u) {
            if (this.f25593z != 2) {
                this.f25587d.m11044q(u, this);
            } else {
                this.f25587d.m11050k();
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10670j(this, interfaceC14457c)) {
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25593z = mo10681m;
                        this.f25591x = interfaceC11319g;
                        this.f25590w = true;
                        this.f25587d.m11050k();
                        return;
                    } else if (mo10681m == 2) {
                        this.f25593z = mo10681m;
                        this.f25591x = interfaceC11319g;
                    }
                }
                interfaceC14457c.mo1686e(this.f25589f);
            }
        }

        /* renamed from: i */
        public void m11056i() {
            EnumC11652g.m10675a(this);
        }

        /* renamed from: j */
        public boolean m11055j() {
            return get() == EnumC11652g.CANCELLED;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableFlatMap.java */
    /* renamed from: j.e.f0.e.b.i$b */
    /* loaded from: classes3.dex */
    public static final class C11389b<T, U> extends AtomicInteger implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: J */
        static final C11388a<?, ?>[] f25594J = new C11388a[0];

        /* renamed from: K */
        static final C11388a<?, ?>[] f25595K = new C11388a[0];

        /* renamed from: A */
        volatile boolean f25596A;

        /* renamed from: D */
        InterfaceC14457c f25599D;

        /* renamed from: E */
        long f25600E;

        /* renamed from: F */
        long f25601F;

        /* renamed from: G */
        int f25602G;

        /* renamed from: H */
        int f25603H;

        /* renamed from: I */
        final int f25604I;

        /* renamed from: c */
        final InterfaceC14456b<? super U> f25605c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> f25606d;

        /* renamed from: e */
        final boolean f25607e;

        /* renamed from: f */
        final int f25608f;

        /* renamed from: w */
        final int f25609w;

        /* renamed from: x */
        volatile InterfaceC11321i<U> f25610x;

        /* renamed from: y */
        volatile boolean f25611y;

        /* renamed from: z */
        final C11656c f25612z = new C11656c();

        /* renamed from: B */
        final AtomicReference<C11388a<?, ?>[]> f25597B = new AtomicReference<>();

        /* renamed from: C */
        final AtomicLong f25598C = new AtomicLong();

        C11389b(InterfaceC14456b<? super U> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> interfaceC11291f, boolean z, int i, int i2) {
            this.f25605c = interfaceC14456b;
            this.f25606d = interfaceC11291f;
            this.f25607e = z;
            this.f25608f = i;
            this.f25609w = i2;
            this.f25604I = Math.max(1, i >> 1);
            this.f25597B.lazySet(f25594J);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25611y) {
                return;
            }
            this.f25611y = true;
            m11050k();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25611y) {
                a.r(th);
            } else if (this.f25612z.m10659a(th)) {
                this.f25611y = true;
                m11050k();
            } else {
                a.r(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        boolean m11054c(C11388a<T, U> c11388a) {
            C11388a<?, ?>[] c11388aArr;
            C11388a[] c11388aArr2;
            do {
                c11388aArr = this.f25597B.get();
                if (c11388aArr == f25595K) {
                    c11388a.m11056i();
                    return false;
                }
                int length = c11388aArr.length;
                c11388aArr2 = new C11388a[length + 1];
                System.arraycopy(c11388aArr, 0, c11388aArr2, 0, length);
                c11388aArr2[length] = c11388a;
            } while (!this.f25597B.compareAndSet(c11388aArr, c11388aArr2));
            return true;
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            InterfaceC11321i<U> interfaceC11321i;
            if (this.f25596A) {
                return;
            }
            this.f25596A = true;
            this.f25599D.cancel();
            m11051j();
            if (getAndIncrement() != 0 || (interfaceC11321i = this.f25610x) == null) {
                return;
            }
            interfaceC11321i.clear();
        }

        /* renamed from: d */
        boolean m11053d() {
            if (this.f25596A) {
                m11052i();
                return true;
            } else if (this.f25607e || this.f25612z.get() == null) {
                return false;
            } else {
                m11052i();
                Throwable m10658b = this.f25612z.m10658b();
                if (m10658b != C11661h.f26352a) {
                    this.f25605c.mo1689b(m10658b);
                }
                return true;
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this.f25598C, j);
                m11050k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25611y) {
                return;
            }
            try {
                InterfaceC14455a<? extends U> mo10663a = this.f25606d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                InterfaceC14455a<? extends U> interfaceC14455a = mo10663a;
                if (interfaceC14455a instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC14455a).call();
                        if (call != null) {
                            m11043r(call);
                            return;
                        } else if (this.f25608f == Integer.MAX_VALUE || this.f25596A) {
                            return;
                        } else {
                            int i = this.f25603H + 1;
                            this.f25603H = i;
                            int i2 = this.f25604I;
                            if (i == i2) {
                                this.f25603H = 0;
                                this.f25599D.mo1686e(i2);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25612z.m10659a(th);
                        m11050k();
                        return;
                    }
                }
                long j = this.f25600E;
                this.f25600E = 1 + j;
                C11388a c11388a = new C11388a(this, j);
                if (m11054c(c11388a)) {
                    interfaceC14455a.mo1691a(c11388a);
                }
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25599D.cancel();
                mo1689b(th2);
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25599D, interfaceC14457c)) {
                this.f25599D = interfaceC14457c;
                this.f25605c.mo1687g(this);
                if (this.f25596A) {
                    return;
                }
                int i = this.f25608f;
                if (i == Integer.MAX_VALUE) {
                    interfaceC14457c.mo1686e(Long.MAX_VALUE);
                } else {
                    interfaceC14457c.mo1686e(i);
                }
            }
        }

        /* renamed from: i */
        void m11052i() {
            InterfaceC11321i<U> interfaceC11321i = this.f25610x;
            if (interfaceC11321i != null) {
                interfaceC11321i.clear();
            }
        }

        /* renamed from: j */
        void m11051j() {
            C11388a<?, ?>[] andSet;
            C11388a<?, ?>[] c11388aArr = this.f25597B.get();
            C11388a<?, ?>[] c11388aArr2 = f25595K;
            if (c11388aArr == c11388aArr2 || (andSet = this.f25597B.getAndSet(c11388aArr2)) == f25595K) {
                return;
            }
            for (C11388a<?, ?> c11388a : andSet) {
                c11388a.m11056i();
            }
            Throwable m10658b = this.f25612z.m10658b();
            if (m10658b == null || m10658b == C11661h.f26352a) {
                return;
            }
            a.r(m10658b);
        }

        /* renamed from: k */
        void m11050k() {
            if (getAndIncrement() == 0) {
                m11049l();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:121:0x018f, code lost:
            r24.f25602G = r3;
            r24.f25601F = r13[r3].f25586c;
            r3 = r16;
            r5 = 0;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m11049l() {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p458b.C11387i.C11389b.m11049l():void");
        }

        /* renamed from: m */
        InterfaceC11322j<U> m11048m(C11388a<T, U> c11388a) {
            InterfaceC11322j<U> interfaceC11322j = c11388a.f25591x;
            if (interfaceC11322j == null) {
                C11607b c11607b = new C11607b(this.f25609w);
                c11388a.f25591x = c11607b;
                return c11607b;
            }
            return interfaceC11322j;
        }

        /* renamed from: n */
        InterfaceC11322j<U> m11047n() {
            InterfaceC11321i<U> interfaceC11321i = this.f25610x;
            if (interfaceC11321i == null) {
                if (this.f25608f == Integer.MAX_VALUE) {
                    interfaceC11321i = new C11608c<>(this.f25609w);
                } else {
                    interfaceC11321i = new C11607b<>(this.f25608f);
                }
                this.f25610x = interfaceC11321i;
            }
            return interfaceC11321i;
        }

        /* renamed from: o */
        void m11046o(C11388a<T, U> c11388a, Throwable th) {
            if (this.f25612z.m10659a(th)) {
                c11388a.f25590w = true;
                if (!this.f25607e) {
                    this.f25599D.cancel();
                    for (C11388a<?, ?> c11388a2 : this.f25597B.getAndSet(f25595K)) {
                        c11388a2.m11056i();
                    }
                }
                m11050k();
                return;
            }
            a.r(th);
        }

        /* renamed from: p */
        void m11045p(C11388a<T, U> c11388a) {
            C11388a<?, ?>[] c11388aArr;
            C11388a<?, ?>[] c11388aArr2;
            do {
                c11388aArr = this.f25597B.get();
                int length = c11388aArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (c11388aArr[i2] == c11388a) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c11388aArr2 = f25594J;
                } else {
                    C11388a<?, ?>[] c11388aArr3 = new C11388a[length - 1];
                    System.arraycopy(c11388aArr, 0, c11388aArr3, 0, i);
                    System.arraycopy(c11388aArr, i + 1, c11388aArr3, i, (length - i) - 1);
                    c11388aArr2 = c11388aArr3;
                }
            } while (!this.f25597B.compareAndSet(c11388aArr, c11388aArr2));
        }

        /* renamed from: q */
        void m11044q(U u, C11388a<T, U> c11388a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f25598C.get();
                InterfaceC11322j<U> interfaceC11322j = c11388a.f25591x;
                if (j != 0 && (interfaceC11322j == null || interfaceC11322j.isEmpty())) {
                    this.f25605c.mo1688f(u);
                    if (j != Long.MAX_VALUE) {
                        this.f25598C.decrementAndGet();
                    }
                    c11388a.m11057c(1L);
                } else {
                    if (interfaceC11322j == null) {
                        interfaceC11322j = m11048m(c11388a);
                    }
                    if (!interfaceC11322j.offer(u)) {
                        mo1689b(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC11322j interfaceC11322j2 = c11388a.f25591x;
                if (interfaceC11322j2 == null) {
                    interfaceC11322j2 = new C11607b(this.f25609w);
                    c11388a.f25591x = interfaceC11322j2;
                }
                if (!interfaceC11322j2.offer(u)) {
                    mo1689b(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m11049l();
        }

        /* renamed from: r */
        void m11043r(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f25598C.get();
                InterfaceC11322j<U> interfaceC11322j = this.f25610x;
                if (j != 0 && (interfaceC11322j == null || interfaceC11322j.isEmpty())) {
                    this.f25605c.mo1688f(u);
                    if (j != Long.MAX_VALUE) {
                        this.f25598C.decrementAndGet();
                    }
                    if (this.f25608f != Integer.MAX_VALUE && !this.f25596A) {
                        int i = this.f25603H + 1;
                        this.f25603H = i;
                        int i2 = this.f25604I;
                        if (i == i2) {
                            this.f25603H = 0;
                            this.f25599D.mo1686e(i2);
                        }
                    }
                } else {
                    if (interfaceC11322j == null) {
                        interfaceC11322j = m11047n();
                    }
                    if (!interfaceC11322j.offer(u)) {
                        mo1689b(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m11047n().offer(u)) {
                mo1689b(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m11049l();
        }
    }

    public C11387i(AbstractC11293f<T> abstractC11293f, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> interfaceC11291f, boolean z, int i, int i2) {
        super(abstractC11293f);
        this.f25582e = interfaceC11291f;
        this.f25583f = z;
        this.f25584w = i;
        this.f25585x = i2;
    }

    /* renamed from: Q */
    public static <T, U> InterfaceC11676j<T> m11058Q(InterfaceC14456b<? super U> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends U>> interfaceC11291f, boolean z, int i, int i2) {
        return new C11389b(interfaceC14456b, interfaceC11291f, z, i, i2);
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super U> interfaceC14456b) {
        if (C11427y.m11005b(this.f25499d, interfaceC14456b, this.f25582e)) {
            return;
        }
        this.f25499d.m11188K(m11058Q(interfaceC14456b, this.f25582e, this.f25583f, this.f25584w, this.f25585x));
    }
}
