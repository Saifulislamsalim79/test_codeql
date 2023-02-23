package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.InterfaceC11299f;
import p425j.p444e.p468g0.AbstractC11671a;
/* compiled from: ObservableRefCount.java */
/* renamed from: j.e.f0.e.e.d0 */
/* loaded from: classes3.dex */
public final class C11499d0<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final AbstractC11671a<T> f25898c;

    /* renamed from: d */
    final int f25899d;

    /* renamed from: e */
    final long f25900e;

    /* renamed from: f */
    final TimeUnit f25901f;

    /* renamed from: w */
    final v f25902w;

    /* renamed from: x */
    RunnableC11500a f25903x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableRefCount.java */
    /* renamed from: j.e.f0.e.e.d0$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC11500a extends AtomicReference<c> implements Runnable, e<c> {

        /* renamed from: c */
        final C11499d0<?> f25904c;

        /* renamed from: d */
        c f25905d;

        /* renamed from: e */
        long f25906e;

        /* renamed from: f */
        boolean f25907f;

        /* renamed from: w */
        boolean f25908w;

        RunnableC11500a(C11499d0<?> c11499d0) {
            this.f25904c = c11499d0;
        }

        /* renamed from: a */
        public void accept(c cVar) throws Exception {
            EnumC11296c.m11154e(this, cVar);
            synchronized (this.f25904c) {
                if (this.f25908w) {
                    ((InterfaceC11299f) this.f25904c.f25898c).m11131a(cVar);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25904c.m10923v0(this);
        }
    }

    /* compiled from: ObservableRefCount.java */
    /* renamed from: j.e.f0.e.e.d0$b */
    /* loaded from: classes3.dex */
    static final class C11501b<T> extends AtomicBoolean implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25909c;

        /* renamed from: d */
        final C11499d0<T> f25910d;

        /* renamed from: e */
        final RunnableC11500a f25911e;

        /* renamed from: f */
        c f25912f;

        C11501b(InterfaceC11695u<? super T> interfaceC11695u, C11499d0<T> c11499d0, RunnableC11500a runnableC11500a) {
            this.f25909c = interfaceC11695u;
            this.f25910d = c11499d0;
            this.f25911e = runnableC11500a;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (compareAndSet(false, true)) {
                this.f25910d.m10924u0(this.f25911e);
                this.f25909c.mo335a();
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f25910d.m10924u0(this.f25911e);
                this.f25909c.mo334b(th);
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25912f, cVar)) {
                this.f25912f = cVar;
                this.f25909c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25909c.mo331f(t);
        }

        /* renamed from: i */
        public void m10921i() {
            this.f25912f.i();
            if (compareAndSet(false, true)) {
                this.f25910d.m10925t0(this.f25911e);
            }
        }

        /* renamed from: j */
        public boolean m10920j() {
            return this.f25912f.j();
        }
    }

    public C11499d0(AbstractC11671a<T> abstractC11671a) {
        this(abstractC11671a, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        RunnableC11500a runnableC11500a;
        boolean z;
        synchronized (this) {
            runnableC11500a = this.f25903x;
            if (runnableC11500a == null) {
                runnableC11500a = new RunnableC11500a(this);
                this.f25903x = runnableC11500a;
            }
            long j = runnableC11500a.f25906e;
            if (j == 0 && runnableC11500a.f25905d != null) {
                runnableC11500a.f25905d.i();
            }
            long j2 = j + 1;
            runnableC11500a.f25906e = j2;
            z = true;
            if (runnableC11500a.f25907f || j2 != this.f25899d) {
                z = false;
            } else {
                runnableC11500a.f25907f = true;
            }
        }
        this.f25898c.mo10478e(new C11501b(interfaceC11695u, this, runnableC11500a));
        if (z) {
            this.f25898c.mo10620t0(runnableC11500a);
        }
    }

    /* renamed from: t0 */
    void m10925t0(RunnableC11500a runnableC11500a) {
        synchronized (this) {
            if (this.f25903x != null && this.f25903x == runnableC11500a) {
                long j = runnableC11500a.f25906e - 1;
                runnableC11500a.f25906e = j;
                if (j == 0 && runnableC11500a.f25907f) {
                    if (this.f25900e == 0) {
                        m10923v0(runnableC11500a);
                        return;
                    }
                    C11300g c11300g = new C11300g();
                    runnableC11500a.f25905d = c11300g;
                    c11300g.m11130a(this.f25902w.c(runnableC11500a, this.f25900e, this.f25901f));
                }
            }
        }
    }

    /* renamed from: u0 */
    void m10924u0(RunnableC11500a runnableC11500a) {
        synchronized (this) {
            if (this.f25903x != null && this.f25903x == runnableC11500a) {
                this.f25903x = null;
                if (runnableC11500a.f25905d != null) {
                    runnableC11500a.f25905d.i();
                }
            }
            long j = runnableC11500a.f25906e - 1;
            runnableC11500a.f25906e = j;
            if (j == 0) {
                if (this.f25898c instanceof c) {
                    this.f25898c.i();
                } else if (this.f25898c instanceof InterfaceC11299f) {
                    ((InterfaceC11299f) this.f25898c).m11131a(runnableC11500a.get());
                }
            }
        }
    }

    /* renamed from: v0 */
    void m10923v0(RunnableC11500a runnableC11500a) {
        synchronized (this) {
            if (runnableC11500a.f25906e == 0 && runnableC11500a == this.f25903x) {
                this.f25903x = null;
                c cVar = runnableC11500a.get();
                EnumC11296c.m11156a(runnableC11500a);
                if (this.f25898c instanceof c) {
                    this.f25898c.i();
                } else if (this.f25898c instanceof InterfaceC11299f) {
                    if (cVar == null) {
                        runnableC11500a.f25908w = true;
                    } else {
                        ((InterfaceC11299f) this.f25898c).m11131a(cVar);
                    }
                }
            }
        }
    }

    public C11499d0(AbstractC11671a<T> abstractC11671a, int i, long j, TimeUnit timeUnit, v vVar) {
        this.f25898c = abstractC11671a;
        this.f25899d = i;
        this.f25900e = j;
        this.f25901f = timeUnit;
        this.f25902w = vVar;
    }
}
