package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p455d.AbstractC11324b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p464g.C11637m;
import p425j.p444e.v$b;
/* compiled from: ObservableObserveOn.java */
/* renamed from: j.e.f0.e.e.a0 */
/* loaded from: classes3.dex */
public final class C11484a0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final v f25840d;

    /* renamed from: e */
    final boolean f25841e;

    /* renamed from: f */
    final int f25842f;

    /* compiled from: ObservableObserveOn.java */
    /* renamed from: j.e.f0.e.e.a0$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11485a<T> extends AbstractC11324b<T> implements InterfaceC11695u<T>, Runnable {

        /* renamed from: A */
        volatile boolean f25843A;

        /* renamed from: B */
        int f25844B;

        /* renamed from: C */
        boolean f25845C;

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25846c;

        /* renamed from: d */
        final v$b f25847d;

        /* renamed from: e */
        final boolean f25848e;

        /* renamed from: f */
        final int f25849f;

        /* renamed from: w */
        InterfaceC11322j<T> f25850w;

        /* renamed from: x */
        c f25851x;

        /* renamed from: y */
        Throwable f25852y;

        /* renamed from: z */
        volatile boolean f25853z;

        RunnableC11485a(InterfaceC11695u<? super T> interfaceC11695u, v$b v_b, boolean z, int i) {
            this.f25846c = interfaceC11695u;
            this.f25847d = v_b;
            this.f25848e = z;
            this.f25849f = i;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25853z) {
                return;
            }
            this.f25853z = true;
            m10950k();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25853z) {
                a.r(th);
                return;
            }
            this.f25852y = th;
            this.f25853z = true;
            m10950k();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f25850w.clear();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25851x, cVar)) {
                this.f25851x = cVar;
                if (cVar instanceof InterfaceC11317e) {
                    InterfaceC11317e interfaceC11317e = (InterfaceC11317e) cVar;
                    int mo10681m = interfaceC11317e.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25844B = mo10681m;
                        this.f25850w = interfaceC11317e;
                        this.f25853z = true;
                        this.f25846c.mo332d(this);
                        m10950k();
                        return;
                    } else if (mo10681m == 2) {
                        this.f25844B = mo10681m;
                        this.f25850w = interfaceC11317e;
                        this.f25846c.mo332d(this);
                        return;
                    }
                }
                this.f25850w = new C11608c(this.f25849f);
                this.f25846c.mo332d(this);
            }
        }

        /* renamed from: e */
        boolean m10955e(boolean z, boolean z2, InterfaceC11695u<? super T> interfaceC11695u) {
            if (this.f25843A) {
                this.f25850w.clear();
                return true;
            } else if (z) {
                Throwable th = this.f25852y;
                if (this.f25848e) {
                    if (z2) {
                        this.f25843A = true;
                        if (th != null) {
                            interfaceC11695u.mo334b(th);
                        } else {
                            interfaceC11695u.mo335a();
                        }
                        this.f25847d.i();
                        return true;
                    }
                    return false;
                } else if (th != null) {
                    this.f25843A = true;
                    this.f25850w.clear();
                    interfaceC11695u.mo334b(th);
                    this.f25847d.i();
                    return true;
                } else if (z2) {
                    this.f25843A = true;
                    interfaceC11695u.mo335a();
                    this.f25847d.i();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25853z) {
                return;
            }
            if (this.f25844B != 2) {
                this.f25850w.offer(t);
            }
            m10950k();
        }

        /* renamed from: g */
        void m10954g() {
            int i = 1;
            while (!this.f25843A) {
                boolean z = this.f25853z;
                Throwable th = this.f25852y;
                if (!this.f25848e && z && th != null) {
                    this.f25843A = true;
                    this.f25846c.mo334b(this.f25852y);
                    this.f25847d.i();
                    return;
                }
                this.f25846c.mo331f(null);
                if (z) {
                    this.f25843A = true;
                    Throwable th2 = this.f25852y;
                    if (th2 != null) {
                        this.f25846c.mo334b(th2);
                    } else {
                        this.f25846c.mo335a();
                    }
                    this.f25847d.i();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* renamed from: h */
        void m10953h() {
            InterfaceC11322j<T> interfaceC11322j = this.f25850w;
            InterfaceC11695u<? super T> interfaceC11695u = this.f25846c;
            int i = 1;
            while (!m10955e(this.f25853z, interfaceC11322j.isEmpty(), interfaceC11695u)) {
                while (true) {
                    boolean z = this.f25853z;
                    try {
                        Object obj = (T) interfaceC11322j.poll();
                        boolean z2 = obj == null;
                        if (m10955e(z, z2, interfaceC11695u)) {
                            return;
                        }
                        if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            interfaceC11695u.mo331f(obj);
                        }
                    } catch (Throwable th) {
                        C11118a.m11646b(th);
                        this.f25843A = true;
                        this.f25851x.i();
                        interfaceC11322j.clear();
                        interfaceC11695u.mo334b(th);
                        this.f25847d.i();
                        return;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m10952i() {
            if (this.f25843A) {
                return;
            }
            this.f25843A = true;
            this.f25851x.i();
            this.f25847d.i();
            if (getAndIncrement() == 0) {
                this.f25850w.clear();
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f25850w.isEmpty();
        }

        /* renamed from: j */
        public boolean m10951j() {
            return this.f25843A;
        }

        /* renamed from: k */
        void m10950k() {
            if (getAndIncrement() == 0) {
                this.f25847d.mo10448b(this);
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            if ((i & 2) != 0) {
                this.f25845C = true;
                return 2;
            }
            return 0;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            return this.f25850w.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25845C) {
                m10954g();
            } else {
                m10953h();
            }
        }
    }

    public C11484a0(InterfaceC11692s<T> interfaceC11692s, v vVar, boolean z, int i) {
        super(interfaceC11692s);
        this.f25840d = vVar;
        this.f25841e = z;
        this.f25842f = i;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        v vVar = this.f25840d;
        if (vVar instanceof C11637m) {
            this.f25839c.mo10478e(interfaceC11695u);
            return;
        }
        this.f25839c.mo10478e(new RunnableC11485a(interfaceC11695u, vVar.a(), this.f25841e, this.f25842f));
    }
}
