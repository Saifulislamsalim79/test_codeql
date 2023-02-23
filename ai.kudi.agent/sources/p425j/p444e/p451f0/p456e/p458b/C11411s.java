package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.atomic.AtomicLong;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p466i.AbstractC11646a;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p425j.p444e.v$b;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableObserveOn.java */
/* renamed from: j.e.f0.e.b.s */
/* loaded from: classes3.dex */
public final class C11411s<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final v f25665e;

    /* renamed from: f */
    final boolean f25666f;

    /* renamed from: w */
    final int f25667w;

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: j.e.f0.e.b.s$a */
    /* loaded from: classes3.dex */
    static abstract class AbstractRunnableC11412a<T> extends AbstractC11646a<T> implements InterfaceC11676j<T>, Runnable {

        /* renamed from: A */
        volatile boolean f25668A;

        /* renamed from: B */
        Throwable f25669B;

        /* renamed from: C */
        int f25670C;

        /* renamed from: D */
        long f25671D;

        /* renamed from: E */
        boolean f25672E;

        /* renamed from: c */
        final v$b f25673c;

        /* renamed from: d */
        final boolean f25674d;

        /* renamed from: e */
        final int f25675e;

        /* renamed from: f */
        final int f25676f;

        /* renamed from: w */
        final AtomicLong f25677w = new AtomicLong();

        /* renamed from: x */
        InterfaceC14457c f25678x;

        /* renamed from: y */
        InterfaceC11322j<T> f25679y;

        /* renamed from: z */
        volatile boolean f25680z;

        AbstractRunnableC11412a(v$b v_b, boolean z, int i) {
            this.f25673c = v_b;
            this.f25674d = z;
            this.f25675e = i;
            this.f25676f = i - (i >> 2);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public final void mo1690a() {
            if (this.f25668A) {
                return;
            }
            this.f25668A = true;
            m11022n();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public final void mo1689b(Throwable th) {
            if (this.f25668A) {
                a.r(th);
                return;
            }
            this.f25669B = th;
            this.f25668A = true;
            m11022n();
        }

        @Override // p577n.p586b.InterfaceC14457c
        public final void cancel() {
            if (this.f25680z) {
                return;
            }
            this.f25680z = true;
            this.f25678x.cancel();
            this.f25673c.i();
            if (getAndIncrement() == 0) {
                this.f25679y.clear();
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final void clear() {
            this.f25679y.clear();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public final void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this.f25677w, j);
                m11022n();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public final void mo1688f(T t) {
            if (this.f25668A) {
                return;
            }
            if (this.f25670C == 2) {
                m11022n();
                return;
            }
            if (!this.f25679y.offer(t)) {
                this.f25678x.cancel();
                this.f25669B = new MissingBackpressureException("Queue is full?!");
                this.f25668A = true;
            }
            m11022n();
        }

        /* renamed from: i */
        final boolean m11023i(boolean z, boolean z2, InterfaceC14456b<?> interfaceC14456b) {
            if (this.f25680z) {
                clear();
                return true;
            } else if (z) {
                if (this.f25674d) {
                    if (z2) {
                        this.f25680z = true;
                        Throwable th = this.f25669B;
                        if (th != null) {
                            interfaceC14456b.mo1689b(th);
                        } else {
                            interfaceC14456b.mo1690a();
                        }
                        this.f25673c.i();
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f25669B;
                if (th2 != null) {
                    this.f25680z = true;
                    clear();
                    interfaceC14456b.mo1689b(th2);
                    this.f25673c.i();
                    return true;
                } else if (z2) {
                    this.f25680z = true;
                    interfaceC14456b.mo1690a();
                    this.f25673c.i();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public final boolean isEmpty() {
            return this.f25679y.isEmpty();
        }

        /* renamed from: j */
        abstract void mo11021j();

        /* renamed from: k */
        abstract void mo11020k();

        /* renamed from: l */
        abstract void mo11019l();

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public final int mo10681m(int i) {
            if ((i & 2) != 0) {
                this.f25672E = true;
                return 2;
            }
            return 0;
        }

        /* renamed from: n */
        final void m11022n() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f25673c.mo10448b(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f25672E) {
                mo11020k();
            } else if (this.f25670C == 1) {
                mo11019l();
            } else {
                mo11021j();
            }
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: j.e.f0.e.b.s$b */
    /* loaded from: classes3.dex */
    static final class C11413b<T> extends AbstractRunnableC11412a<T> {

        /* renamed from: F */
        final InterfaceC11313a<? super T> f25681F;

        /* renamed from: G */
        long f25682G;

        C11413b(InterfaceC11313a<? super T> interfaceC11313a, v$b v_b, boolean z, int i) {
            super(v_b, z, i);
            this.f25681F = interfaceC11313a;
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25678x, interfaceC14457c)) {
                this.f25678x = interfaceC14457c;
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25670C = 1;
                        this.f25679y = interfaceC11319g;
                        this.f25668A = true;
                        this.f25681F.mo1687g(this);
                        return;
                    } else if (mo10681m == 2) {
                        this.f25670C = 2;
                        this.f25679y = interfaceC11319g;
                        this.f25681F.mo1687g(this);
                        interfaceC14457c.mo1686e(this.f25675e);
                        return;
                    }
                }
                this.f25679y = new C11607b(this.f25675e);
                this.f25681F.mo1687g(this);
                interfaceC14457c.mo1686e(this.f25675e);
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: j */
        void mo11021j() {
            InterfaceC11313a<? super T> interfaceC11313a = this.f25681F;
            InterfaceC11322j<T> interfaceC11322j = this.f25679y;
            long j = this.f25671D;
            long j2 = this.f25682G;
            int i = 1;
            while (true) {
                long j3 = this.f25677w.get();
                while (j != j3) {
                    boolean z = this.f25668A;
                    try {
                        Object obj = (T) interfaceC11322j.poll();
                        boolean z2 = obj == null;
                        if (m11023i(z, z2, interfaceC11313a)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (interfaceC11313a.mo11024h(obj)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f25676f) {
                            this.f25678x.mo1686e(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25680z = true;
                        this.f25678x.cancel();
                        interfaceC11322j.clear();
                        interfaceC11313a.mo1689b(th);
                        this.f25673c.i();
                        return;
                    }
                }
                if (j == j3 && m11023i(this.f25668A, interfaceC11322j.isEmpty(), interfaceC11313a)) {
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f25671D = j;
                    this.f25682G = j2;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: k */
        void mo11020k() {
            int i = 1;
            while (!this.f25680z) {
                boolean z = this.f25668A;
                this.f25681F.mo1688f(null);
                if (z) {
                    this.f25680z = true;
                    Throwable th = this.f25669B;
                    if (th != null) {
                        this.f25681F.mo1689b(th);
                    } else {
                        this.f25681F.mo1690a();
                    }
                    this.f25673c.i();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: l */
        void mo11019l() {
            InterfaceC11313a<? super T> interfaceC11313a = this.f25681F;
            InterfaceC11322j<T> interfaceC11322j = this.f25679y;
            long j = this.f25671D;
            int i = 1;
            while (true) {
                long j2 = this.f25677w.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC11322j.poll();
                        if (this.f25680z) {
                            return;
                        }
                        if (obj == null) {
                            this.f25680z = true;
                            interfaceC11313a.mo1690a();
                            this.f25673c.i();
                            return;
                        } else if (interfaceC11313a.mo11024h(obj)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25680z = true;
                        this.f25678x.cancel();
                        interfaceC11313a.mo1689b(th);
                        this.f25673c.i();
                        return;
                    }
                }
                if (this.f25680z) {
                    return;
                }
                if (interfaceC11322j.isEmpty()) {
                    this.f25680z = true;
                    interfaceC11313a.mo1690a();
                    this.f25673c.i();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f25671D = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            T poll = this.f25679y.poll();
            if (poll != null && this.f25670C != 1) {
                long j = this.f25682G + 1;
                if (j == this.f25676f) {
                    this.f25682G = 0L;
                    this.f25678x.mo1686e(j);
                } else {
                    this.f25682G = j;
                }
            }
            return poll;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* renamed from: j.e.f0.e.b.s$c */
    /* loaded from: classes3.dex */
    static final class C11414c<T> extends AbstractRunnableC11412a<T> implements InterfaceC11676j<T> {

        /* renamed from: F */
        final InterfaceC14456b<? super T> f25683F;

        C11414c(InterfaceC14456b<? super T> interfaceC14456b, v$b v_b, boolean z, int i) {
            super(v_b, z, i);
            this.f25683F = interfaceC14456b;
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25678x, interfaceC14457c)) {
                this.f25678x = interfaceC14457c;
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25670C = 1;
                        this.f25679y = interfaceC11319g;
                        this.f25668A = true;
                        this.f25683F.mo1687g(this);
                        return;
                    } else if (mo10681m == 2) {
                        this.f25670C = 2;
                        this.f25679y = interfaceC11319g;
                        this.f25683F.mo1687g(this);
                        interfaceC14457c.mo1686e(this.f25675e);
                        return;
                    }
                }
                this.f25679y = new C11607b(this.f25675e);
                this.f25683F.mo1687g(this);
                interfaceC14457c.mo1686e(this.f25675e);
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: j */
        void mo11021j() {
            InterfaceC14456b<? super T> interfaceC14456b = this.f25683F;
            InterfaceC11322j<T> interfaceC11322j = this.f25679y;
            long j = this.f25671D;
            int i = 1;
            while (true) {
                long j2 = this.f25677w.get();
                while (j != j2) {
                    boolean z = this.f25668A;
                    try {
                        Object obj = (T) interfaceC11322j.poll();
                        boolean z2 = obj == null;
                        if (m11023i(z, z2, interfaceC14456b)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC14456b.mo1688f(obj);
                        j++;
                        if (j == this.f25676f) {
                            if (j2 != Long.MAX_VALUE) {
                                j2 = this.f25677w.addAndGet(-j);
                            }
                            this.f25678x.mo1686e(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25680z = true;
                        this.f25678x.cancel();
                        interfaceC11322j.clear();
                        interfaceC14456b.mo1689b(th);
                        this.f25673c.i();
                        return;
                    }
                }
                if (j == j2 && m11023i(this.f25668A, interfaceC11322j.isEmpty(), interfaceC14456b)) {
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f25671D = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: k */
        void mo11020k() {
            int i = 1;
            while (!this.f25680z) {
                boolean z = this.f25668A;
                this.f25683F.mo1688f(null);
                if (z) {
                    this.f25680z = true;
                    Throwable th = this.f25669B;
                    if (th != null) {
                        this.f25683F.mo1689b(th);
                    } else {
                        this.f25683F.mo1690a();
                    }
                    this.f25673c.i();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p456e.p458b.C11411s.AbstractRunnableC11412a
        /* renamed from: l */
        void mo11019l() {
            InterfaceC14456b<? super T> interfaceC14456b = this.f25683F;
            InterfaceC11322j<T> interfaceC11322j = this.f25679y;
            long j = this.f25671D;
            int i = 1;
            while (true) {
                long j2 = this.f25677w.get();
                while (j != j2) {
                    try {
                        Object obj = (T) interfaceC11322j.poll();
                        if (this.f25680z) {
                            return;
                        }
                        if (obj == null) {
                            this.f25680z = true;
                            interfaceC14456b.mo1690a();
                            this.f25673c.i();
                            return;
                        }
                        interfaceC14456b.mo1688f(obj);
                        j++;
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25680z = true;
                        this.f25678x.cancel();
                        interfaceC14456b.mo1689b(th);
                        this.f25673c.i();
                        return;
                    }
                }
                if (this.f25680z) {
                    return;
                }
                if (interfaceC11322j.isEmpty()) {
                    this.f25680z = true;
                    interfaceC14456b.mo1690a();
                    this.f25673c.i();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.f25671D = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            T poll = this.f25679y.poll();
            if (poll != null && this.f25670C != 1) {
                long j = this.f25671D + 1;
                if (j == this.f25676f) {
                    this.f25671D = 0L;
                    this.f25678x.mo1686e(j);
                } else {
                    this.f25671D = j;
                }
            }
            return poll;
        }
    }

    public C11411s(AbstractC11293f<T> abstractC11293f, v vVar, boolean z, int i) {
        super(abstractC11293f);
        this.f25665e = vVar;
        this.f25666f = z;
        this.f25667w = i;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        v$b a = this.f25665e.a();
        if (interfaceC14456b instanceof InterfaceC11313a) {
            this.f25499d.m11188K(new C11413b((InterfaceC11313a) interfaceC14456b, a, this.f25666f, this.f25667w));
        } else {
            this.f25499d.m11188K(new C11414c(interfaceC14456b, a, this.f25666f, this.f25667w));
        }
    }
}
