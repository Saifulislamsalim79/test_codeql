package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p455d.C11329g;
import p425j.p444e.p451f0.p455d.InterfaceC11330h;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.EnumC11660g;
/* compiled from: ObservableConcatMapEager.java */
/* renamed from: j.e.f0.e.e.e */
/* loaded from: classes3.dex */
public final class C11502e<T, R> extends AbstractC11483a<T, R> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25913d;

    /* renamed from: e */
    final EnumC11660g f25914e;

    /* renamed from: f */
    final int f25915f;

    /* renamed from: w */
    final int f25916w;

    /* compiled from: ObservableConcatMapEager.java */
    /* renamed from: j.e.f0.e.e.e$a */
    /* loaded from: classes3.dex */
    static final class C11503a<T, R> extends AtomicInteger implements InterfaceC11695u<T>, c, InterfaceC11330h<R> {

        /* renamed from: A */
        c f25917A;

        /* renamed from: B */
        volatile boolean f25918B;

        /* renamed from: C */
        int f25919C;

        /* renamed from: D */
        volatile boolean f25920D;

        /* renamed from: E */
        C11329g<R> f25921E;

        /* renamed from: F */
        int f25922F;

        /* renamed from: c */
        final InterfaceC11695u<? super R> f25923c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25924d;

        /* renamed from: e */
        final int f25925e;

        /* renamed from: f */
        final int f25926f;

        /* renamed from: w */
        final EnumC11660g f25927w;

        /* renamed from: x */
        final C11656c f25928x = new C11656c();

        /* renamed from: y */
        final ArrayDeque<C11329g<R>> f25929y = new ArrayDeque<>();

        /* renamed from: z */
        InterfaceC11322j<T> f25930z;

        C11503a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, int i, int i2, EnumC11660g enumC11660g) {
            this.f25923c = interfaceC11695u;
            this.f25924d = interfaceC11291f;
            this.f25925e = i;
            this.f25926f = i2;
            this.f25927w = enumC11660g;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25918B = true;
            mo10917g();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25928x.m10659a(th)) {
                this.f25918B = true;
                mo10917g();
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p455d.InterfaceC11330h
        /* renamed from: c */
        public void mo10919c(C11329g<R> c11329g, Throwable th) {
            if (this.f25928x.m10659a(th)) {
                if (this.f25927w == EnumC11660g.IMMEDIATE) {
                    this.f25917A.i();
                }
                c11329g.m11094g();
                mo10917g();
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25917A, cVar)) {
                this.f25917A = cVar;
                if (cVar instanceof InterfaceC11317e) {
                    InterfaceC11317e interfaceC11317e = (InterfaceC11317e) cVar;
                    int mo10681m = interfaceC11317e.mo10681m(3);
                    if (mo10681m == 1) {
                        this.f25919C = mo10681m;
                        this.f25930z = interfaceC11317e;
                        this.f25918B = true;
                        this.f25923c.mo332d(this);
                        mo10917g();
                        return;
                    } else if (mo10681m == 2) {
                        this.f25919C = mo10681m;
                        this.f25930z = interfaceC11317e;
                        this.f25923c.mo332d(this);
                        return;
                    }
                }
                this.f25930z = new C11608c(this.f25926f);
                this.f25923c.mo332d(this);
            }
        }

        @Override // p425j.p444e.p451f0.p455d.InterfaceC11330h
        /* renamed from: e */
        public void mo10918e(C11329g<R> c11329g) {
            c11329g.m11094g();
            mo10917g();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25919C == 0) {
                this.f25930z.offer(t);
            }
            mo10917g();
        }

        @Override // p425j.p444e.p451f0.p455d.InterfaceC11330h
        /* renamed from: g */
        public void mo10917g() {
            R poll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC11322j<T> interfaceC11322j = this.f25930z;
            ArrayDeque<C11329g<R>> arrayDeque = this.f25929y;
            InterfaceC11695u<? super R> interfaceC11695u = this.f25923c;
            EnumC11660g enumC11660g = this.f25927w;
            int i = 1;
            while (true) {
                int i2 = this.f25922F;
                while (i2 != this.f25925e) {
                    if (this.f25920D) {
                        interfaceC11322j.clear();
                        m10913k();
                        return;
                    } else if (enumC11660g == EnumC11660g.IMMEDIATE && this.f25928x.get() != null) {
                        interfaceC11322j.clear();
                        m10913k();
                        interfaceC11695u.mo334b(this.f25928x.m10658b());
                        return;
                    } else {
                        try {
                            T poll2 = interfaceC11322j.poll();
                            if (poll2 == null) {
                                break;
                            }
                            InterfaceC11692s<? extends R> mo10663a = this.f25924d.mo10663a(poll2);
                            C11312b.m11113d(mo10663a, "The mapper returned a null ObservableSource");
                            InterfaceC11692s<? extends R> interfaceC11692s = mo10663a;
                            C11329g<R> c11329g = new C11329g<>(this, this.f25926f);
                            arrayDeque.offer(c11329g);
                            interfaceC11692s.mo10478e(c11329g);
                            i2++;
                        } catch (Throwable th) {
                            C11118a.m11646b(th);
                            this.f25917A.i();
                            interfaceC11322j.clear();
                            m10913k();
                            this.f25928x.m10659a(th);
                            interfaceC11695u.mo334b(this.f25928x.m10658b());
                            return;
                        }
                    }
                }
                this.f25922F = i2;
                if (this.f25920D) {
                    interfaceC11322j.clear();
                    m10913k();
                    return;
                } else if (enumC11660g == EnumC11660g.IMMEDIATE && this.f25928x.get() != null) {
                    interfaceC11322j.clear();
                    m10913k();
                    interfaceC11695u.mo334b(this.f25928x.m10658b());
                    return;
                } else {
                    C11329g<R> c11329g2 = this.f25921E;
                    if (c11329g2 == null) {
                        if (enumC11660g == EnumC11660g.BOUNDARY && this.f25928x.get() != null) {
                            interfaceC11322j.clear();
                            m10913k();
                            interfaceC11695u.mo334b(this.f25928x.m10658b());
                            return;
                        }
                        boolean z2 = this.f25918B;
                        C11329g<R> poll3 = arrayDeque.poll();
                        boolean z3 = poll3 == null;
                        if (z2 && z3) {
                            if (this.f25928x.get() != null) {
                                interfaceC11322j.clear();
                                m10913k();
                                interfaceC11695u.mo334b(this.f25928x.m10658b());
                                return;
                            }
                            interfaceC11695u.mo335a();
                            return;
                        }
                        if (!z3) {
                            this.f25921E = poll3;
                        }
                        c11329g2 = poll3;
                    }
                    if (c11329g2 != null) {
                        InterfaceC11322j<R> m11095e = c11329g2.m11095e();
                        while (!this.f25920D) {
                            boolean m11096c = c11329g2.m11096c();
                            if (enumC11660g == EnumC11660g.IMMEDIATE && this.f25928x.get() != null) {
                                interfaceC11322j.clear();
                                m10913k();
                                interfaceC11695u.mo334b(this.f25928x.m10658b());
                                return;
                            }
                            try {
                                poll = m11095e.poll();
                                z = poll == null;
                            } catch (Throwable th2) {
                                C11118a.m11646b(th2);
                                this.f25928x.m10659a(th2);
                                this.f25921E = null;
                                this.f25922F--;
                            }
                            if (m11096c && z) {
                                this.f25921E = null;
                                this.f25922F--;
                            } else if (!z) {
                                interfaceC11695u.mo331f(poll);
                            }
                        }
                        interfaceC11322j.clear();
                        m10913k();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p425j.p444e.p451f0.p455d.InterfaceC11330h
        /* renamed from: h */
        public void mo10916h(C11329g<R> c11329g, R r) {
            c11329g.m11095e().offer(r);
            mo10917g();
        }

        /* renamed from: i */
        public void m10915i() {
            if (this.f25920D) {
                return;
            }
            this.f25920D = true;
            this.f25917A.i();
            m10912l();
        }

        /* renamed from: j */
        public boolean m10914j() {
            return this.f25920D;
        }

        /* renamed from: k */
        void m10913k() {
            C11329g<R> c11329g = this.f25921E;
            if (c11329g != null) {
                c11329g.m11093i();
            }
            while (true) {
                C11329g<R> poll = this.f25929y.poll();
                if (poll == null) {
                    return;
                }
                poll.m11093i();
            }
        }

        /* renamed from: l */
        void m10912l() {
            if (getAndIncrement() == 0) {
                do {
                    this.f25930z.clear();
                    m10913k();
                } while (decrementAndGet() != 0);
            }
        }
    }

    public C11502e(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, EnumC11660g enumC11660g, int i, int i2) {
        super(interfaceC11692s);
        this.f25913d = interfaceC11291f;
        this.f25914e = enumC11660g;
        this.f25915f = i;
        this.f25916w = i2;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        this.f25839c.mo10478e(new C11503a(interfaceC11695u, this.f25913d, this.f25915f, this.f25916w, this.f25914e));
    }
}
