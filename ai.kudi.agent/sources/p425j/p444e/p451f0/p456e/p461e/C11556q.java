package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p467j.C11656c;
/* compiled from: ObservableFlatMapMaybe.java */
/* renamed from: j.e.f0.e.e.q */
/* loaded from: classes3.dex */
public final class C11556q<T, R> extends AbstractC11483a<T, R> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f26086d;

    /* renamed from: e */
    final boolean f26087e;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* renamed from: j.e.f0.e.e.q$a */
    /* loaded from: classes3.dex */
    static final class C11557a<T, R> extends AtomicInteger implements InterfaceC11695u<T>, c {

        /* renamed from: A */
        volatile boolean f26088A;

        /* renamed from: c */
        final InterfaceC11695u<? super R> f26089c;

        /* renamed from: d */
        final boolean f26090d;

        /* renamed from: x */
        final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f26094x;

        /* renamed from: z */
        c f26096z;

        /* renamed from: e */
        final C11280b f26091e = new C11280b();

        /* renamed from: w */
        final C11656c f26093w = new C11656c();

        /* renamed from: f */
        final AtomicInteger f26092f = new AtomicInteger(1);

        /* renamed from: y */
        final AtomicReference<C11608c<R>> f26095y = new AtomicReference<>();

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: j.e.f0.e.e.q$a$a */
        /* loaded from: classes3.dex */
        final class C11558a extends AtomicReference<c> implements InterfaceC11685m<R>, c {
            C11558a() {
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: a */
            public void mo10551a() {
                C11557a.this.m10832k(this);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: b */
            public void mo10550b(Throwable th) {
                C11557a.this.m10831l(this, th);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: c */
            public void mo10549c(R r) {
                C11557a.this.m10830m(this, r);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: d */
            public void mo10548d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            /* renamed from: i */
            public void m10829i() {
                EnumC11296c.m11156a(this);
            }

            /* renamed from: j */
            public boolean m10828j() {
                return EnumC11296c.m11155b(get());
            }
        }

        C11557a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z) {
            this.f26089c = interfaceC11695u;
            this.f26094x = interfaceC11291f;
            this.f26090d = z;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26092f.decrementAndGet();
            m10837e();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26092f.decrementAndGet();
            if (this.f26093w.m10659a(th)) {
                if (!this.f26090d) {
                    this.f26091e.m11212i();
                }
                m10837e();
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        void m10838c() {
            C11608c<R> c11608c = this.f26095y.get();
            if (c11608c != null) {
                c11608c.clear();
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26096z, cVar)) {
                this.f26096z = cVar;
                this.f26089c.mo332d(this);
            }
        }

        /* renamed from: e */
        void m10837e() {
            if (getAndIncrement() == 0) {
                m10836g();
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            try {
                InterfaceC11687o<? extends R> mo10663a = this.f26094x.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null MaybeSource");
                InterfaceC11687o<? extends R> interfaceC11687o = mo10663a;
                this.f26092f.getAndIncrement();
                C11558a c11558a = new C11558a();
                if (this.f26088A || !this.f26091e.mo11136b(c11558a)) {
                    return;
                }
                interfaceC11687o.mo10546a(c11558a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26096z.i();
                mo334b(th);
            }
        }

        /* renamed from: g */
        void m10836g() {
            InterfaceC11695u<? super R> interfaceC11695u = this.f26089c;
            AtomicInteger atomicInteger = this.f26092f;
            AtomicReference<C11608c<R>> atomicReference = this.f26095y;
            int i = 1;
            while (!this.f26088A) {
                if (!this.f26090d && this.f26093w.get() != null) {
                    Throwable m10658b = this.f26093w.m10658b();
                    m10838c();
                    interfaceC11695u.mo334b(m10658b);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                C11608c<R> c11608c = atomicReference.get();
                R poll = c11608c != null ? c11608c.poll() : (Object) null;
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable m10658b2 = this.f26093w.m10658b();
                    if (m10658b2 != null) {
                        interfaceC11695u.mo334b(m10658b2);
                        return;
                    } else {
                        interfaceC11695u.mo335a();
                        return;
                    }
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    interfaceC11695u.mo331f(poll);
                }
            }
            m10838c();
        }

        /* renamed from: h */
        C11608c<R> m10835h() {
            C11608c<R> c11608c;
            do {
                C11608c<R> c11608c2 = this.f26095y.get();
                if (c11608c2 != null) {
                    return c11608c2;
                }
                c11608c = new C11608c<>(AbstractC11688p.m10512h());
            } while (!this.f26095y.compareAndSet(null, c11608c));
            return c11608c;
        }

        /* renamed from: i */
        public void m10834i() {
            this.f26088A = true;
            this.f26096z.i();
            this.f26091e.m11212i();
        }

        /* renamed from: j */
        public boolean m10833j() {
            return this.f26088A;
        }

        /* renamed from: k */
        void m10832k(C11557a<T, R>.C11558a c11558a) {
            this.f26091e.mo11135c(c11558a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f26092f.decrementAndGet() == 0;
                    C11608c<R> c11608c = this.f26095y.get();
                    if (z && (c11608c == null || c11608c.isEmpty())) {
                        Throwable m10658b = this.f26093w.m10658b();
                        if (m10658b != null) {
                            this.f26089c.mo334b(m10658b);
                            return;
                        } else {
                            this.f26089c.mo335a();
                            return;
                        }
                    } else if (decrementAndGet() == 0) {
                        return;
                    } else {
                        m10836g();
                        return;
                    }
                }
            }
            this.f26092f.decrementAndGet();
            m10837e();
        }

        /* renamed from: l */
        void m10831l(C11557a<T, R>.C11558a c11558a, Throwable th) {
            this.f26091e.mo11135c(c11558a);
            if (this.f26093w.m10659a(th)) {
                if (!this.f26090d) {
                    this.f26096z.i();
                    this.f26091e.m11212i();
                }
                this.f26092f.decrementAndGet();
                m10837e();
                return;
            }
            a.r(th);
        }

        /* renamed from: m */
        void m10830m(C11557a<T, R>.C11558a c11558a, R r) {
            this.f26091e.mo11135c(c11558a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f26089c.mo331f(r);
                    boolean z = this.f26092f.decrementAndGet() == 0;
                    C11608c<R> c11608c = this.f26095y.get();
                    if (z && (c11608c == null || c11608c.isEmpty())) {
                        Throwable m10658b = this.f26093w.m10658b();
                        if (m10658b != null) {
                            this.f26089c.mo334b(m10658b);
                            return;
                        } else {
                            this.f26089c.mo335a();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m10836g();
                }
            }
            C11608c<R> m10835h = m10835h();
            synchronized (m10835h) {
                m10835h.offer(r);
            }
            this.f26092f.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m10836g();
        }
    }

    public C11556q(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z) {
        super(interfaceC11692s);
        this.f26086d = interfaceC11291f;
        this.f26087e = z;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        this.f25839c.mo10478e(new C11557a(interfaceC11695u, this.f26086d, this.f26087e));
    }
}
