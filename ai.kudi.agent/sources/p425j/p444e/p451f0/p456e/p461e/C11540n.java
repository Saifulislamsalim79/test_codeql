package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11661h;
/* compiled from: ObservableFlatMap.java */
/* renamed from: j.e.f0.e.e.n */
/* loaded from: classes3.dex */
public final class C11540n<T, U> extends AbstractC11483a<T, U> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends U>> f26023d;

    /* renamed from: e */
    final boolean f26024e;

    /* renamed from: f */
    final int f26025f;

    /* renamed from: w */
    final int f26026w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableFlatMap.java */
    /* renamed from: j.e.f0.e.e.n$a */
    /* loaded from: classes3.dex */
    public static final class C11541a<T, U> extends AtomicReference<c> implements InterfaceC11695u<U> {

        /* renamed from: c */
        final long f26027c;

        /* renamed from: d */
        final C11542b<T, U> f26028d;

        /* renamed from: e */
        volatile boolean f26029e;

        /* renamed from: f */
        volatile InterfaceC11322j<U> f26030f;

        /* renamed from: w */
        int f26031w;

        C11541a(C11542b<T, U> c11542b, long j) {
            this.f26027c = j;
            this.f26028d = c11542b;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26029e = true;
            this.f26028d.m10869h();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26028d.f26049z.m10659a(th)) {
                C11542b<T, U> c11542b = this.f26028d;
                if (!c11542b.f26044e) {
                    c11542b.m10870g();
                }
                this.f26029e = true;
                this.f26028d.m10869h();
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        public void m10873c() {
            EnumC11296c.m11156a(this);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar) && (cVar instanceof InterfaceC11317e)) {
                InterfaceC11317e interfaceC11317e = (InterfaceC11317e) cVar;
                int mo10681m = interfaceC11317e.mo10681m(7);
                if (mo10681m == 1) {
                    this.f26031w = mo10681m;
                    this.f26030f = interfaceC11317e;
                    this.f26029e = true;
                    this.f26028d.m10869h();
                } else if (mo10681m == 2) {
                    this.f26031w = mo10681m;
                    this.f26030f = interfaceC11317e;
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(U u) {
            if (this.f26031w == 0) {
                this.f26028d.m10863n(u, this);
            } else {
                this.f26028d.m10869h();
            }
        }
    }

    /* compiled from: ObservableFlatMap.java */
    /* renamed from: j.e.f0.e.e.n$b */
    /* loaded from: classes3.dex */
    static final class C11542b<T, U> extends AtomicInteger implements c, InterfaceC11695u<T> {

        /* renamed from: I */
        static final C11541a<?, ?>[] f26032I = new C11541a[0];

        /* renamed from: J */
        static final C11541a<?, ?>[] f26033J = new C11541a[0];

        /* renamed from: A */
        volatile boolean f26034A;

        /* renamed from: B */
        final AtomicReference<C11541a<?, ?>[]> f26035B;

        /* renamed from: C */
        c f26036C;

        /* renamed from: D */
        long f26037D;

        /* renamed from: E */
        long f26038E;

        /* renamed from: F */
        int f26039F;

        /* renamed from: G */
        Queue<InterfaceC11692s<? extends U>> f26040G;

        /* renamed from: H */
        int f26041H;

        /* renamed from: c */
        final InterfaceC11695u<? super U> f26042c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends U>> f26043d;

        /* renamed from: e */
        final boolean f26044e;

        /* renamed from: f */
        final int f26045f;

        /* renamed from: w */
        final int f26046w;

        /* renamed from: x */
        volatile InterfaceC11321i<U> f26047x;

        /* renamed from: y */
        volatile boolean f26048y;

        /* renamed from: z */
        final C11656c f26049z = new C11656c();

        C11542b(InterfaceC11695u<? super U> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends U>> interfaceC11291f, boolean z, int i, int i2) {
            this.f26042c = interfaceC11695u;
            this.f26043d = interfaceC11291f;
            this.f26044e = z;
            this.f26045f = i;
            this.f26046w = i2;
            if (i != Integer.MAX_VALUE) {
                this.f26040G = new ArrayDeque(i);
            }
            this.f26035B = new AtomicReference<>(f26032I);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f26048y) {
                return;
            }
            this.f26048y = true;
            m10869h();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26048y) {
                a.r(th);
            } else if (this.f26049z.m10659a(th)) {
                this.f26048y = true;
                m10869h();
            } else {
                a.r(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        boolean m10872c(C11541a<T, U> c11541a) {
            C11541a<?, ?>[] c11541aArr;
            C11541a[] c11541aArr2;
            do {
                c11541aArr = this.f26035B.get();
                if (c11541aArr == f26033J) {
                    c11541a.m10873c();
                    return false;
                }
                int length = c11541aArr.length;
                c11541aArr2 = new C11541a[length + 1];
                System.arraycopy(c11541aArr, 0, c11541aArr2, 0, length);
                c11541aArr2[length] = c11541a;
            } while (!this.f26035B.compareAndSet(c11541aArr, c11541aArr2));
            return true;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26036C, cVar)) {
                this.f26036C = cVar;
                this.f26042c.mo332d(this);
            }
        }

        /* renamed from: e */
        boolean m10871e() {
            if (this.f26034A) {
                return true;
            }
            Throwable th = this.f26049z.get();
            if (this.f26044e || th == null) {
                return false;
            }
            m10870g();
            Throwable m10658b = this.f26049z.m10658b();
            if (m10658b != C11661h.f26352a) {
                this.f26042c.mo334b(m10658b);
            }
            return true;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f26048y) {
                return;
            }
            try {
                InterfaceC11692s<? extends U> mo10663a = this.f26043d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null ObservableSource");
                InterfaceC11692s<? extends U> interfaceC11692s = mo10663a;
                if (this.f26045f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        if (this.f26041H == this.f26045f) {
                            this.f26040G.offer(interfaceC11692s);
                            return;
                        }
                        this.f26041H++;
                    }
                }
                m10864m(interfaceC11692s);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26036C.i();
                mo334b(th);
            }
        }

        /* renamed from: g */
        boolean m10870g() {
            C11541a<?, ?>[] andSet;
            this.f26036C.i();
            C11541a<?, ?>[] c11541aArr = this.f26035B.get();
            C11541a<?, ?>[] c11541aArr2 = f26033J;
            if (c11541aArr == c11541aArr2 || (andSet = this.f26035B.getAndSet(c11541aArr2)) == f26033J) {
                return false;
            }
            for (C11541a<?, ?> c11541a : andSet) {
                c11541a.m10873c();
            }
            return true;
        }

        /* renamed from: h */
        void m10869h() {
            if (getAndIncrement() == 0) {
                m10866k();
            }
        }

        /* renamed from: i */
        public void m10868i() {
            Throwable m10658b;
            if (this.f26034A) {
                return;
            }
            this.f26034A = true;
            if (!m10870g() || (m10658b = this.f26049z.m10658b()) == null || m10658b == C11661h.f26352a) {
                return;
            }
            a.r(m10658b);
        }

        /* renamed from: j */
        public boolean m10867j() {
            return this.f26034A;
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
            continue;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m10866k() {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p461e.C11540n.C11542b.m10866k():void");
        }

        /* renamed from: l */
        void m10865l(C11541a<T, U> c11541a) {
            C11541a<?, ?>[] c11541aArr;
            C11541a<?, ?>[] c11541aArr2;
            do {
                c11541aArr = this.f26035B.get();
                int length = c11541aArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (c11541aArr[i2] == c11541a) {
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
                    c11541aArr2 = f26032I;
                } else {
                    C11541a<?, ?>[] c11541aArr3 = new C11541a[length - 1];
                    System.arraycopy(c11541aArr, 0, c11541aArr3, 0, i);
                    System.arraycopy(c11541aArr, i + 1, c11541aArr3, i, (length - i) - 1);
                    c11541aArr2 = c11541aArr3;
                }
            } while (!this.f26035B.compareAndSet(c11541aArr, c11541aArr2));
        }

        /* renamed from: m */
        void m10864m(InterfaceC11692s<? extends U> interfaceC11692s) {
            InterfaceC11692s<? extends U> poll;
            while (interfaceC11692s instanceof Callable) {
                if (!m10862o((Callable) interfaceC11692s) || this.f26045f == Integer.MAX_VALUE) {
                    return;
                }
                boolean z = false;
                synchronized (this) {
                    poll = this.f26040G.poll();
                    if (poll == null) {
                        this.f26041H--;
                        z = true;
                    }
                }
                if (z) {
                    m10869h();
                    return;
                }
                interfaceC11692s = poll;
            }
            long j = this.f26037D;
            this.f26037D = 1 + j;
            C11541a<T, U> c11541a = new C11541a<>(this, j);
            if (m10872c(c11541a)) {
                interfaceC11692s.mo10478e(c11541a);
            }
        }

        /* renamed from: n */
        void m10863n(U u, C11541a<T, U> c11541a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f26042c.mo331f(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC11322j interfaceC11322j = c11541a.f26030f;
                if (interfaceC11322j == null) {
                    interfaceC11322j = new C11608c(this.f26046w);
                    c11541a.f26030f = interfaceC11322j;
                }
                interfaceC11322j.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m10866k();
        }

        /* renamed from: o */
        boolean m10862o(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f26042c.mo331f(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    InterfaceC11321i<U> interfaceC11321i = this.f26047x;
                    if (interfaceC11321i == null) {
                        if (this.f26045f == Integer.MAX_VALUE) {
                            interfaceC11321i = new C11608c<>(this.f26046w);
                        } else {
                            interfaceC11321i = new C11607b<>(this.f26045f);
                        }
                        this.f26047x = interfaceC11321i;
                    }
                    if (!interfaceC11321i.offer(call)) {
                        mo334b(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m10866k();
                return true;
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26049z.m10659a(th);
                m10869h();
                return true;
            }
        }
    }

    public C11540n(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends U>> interfaceC11291f, boolean z, int i, int i2) {
        super(interfaceC11692s);
        this.f26023d = interfaceC11291f;
        this.f26024e = z;
        this.f26025f = i;
        this.f26026w = i2;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super U> interfaceC11695u) {
        if (C11514g0.m10892b(this.f25839c, interfaceC11695u, this.f26023d)) {
            return;
        }
        this.f25839c.mo10478e(new C11542b(interfaceC11695u, this.f26023d, this.f26024e, this.f26025f, this.f26026w));
    }
}
