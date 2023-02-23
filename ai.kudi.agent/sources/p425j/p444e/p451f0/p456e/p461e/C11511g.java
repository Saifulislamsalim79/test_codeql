package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p469h0.C11674b;
import p425j.p444e.v$b;
/* compiled from: ObservableDebounceTimed.java */
/* renamed from: j.e.f0.e.e.g */
/* loaded from: classes3.dex */
public final class C11511g<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final long f25950d;

    /* renamed from: e */
    final TimeUnit f25951e;

    /* renamed from: f */
    final v f25952f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableDebounceTimed.java */
    /* renamed from: j.e.f0.e.e.g$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC11512a<T> extends AtomicReference<c> implements Runnable, c {

        /* renamed from: c */
        final T f25953c;

        /* renamed from: d */
        final long f25954d;

        /* renamed from: e */
        final C11513b<T> f25955e;

        /* renamed from: f */
        final AtomicBoolean f25956f = new AtomicBoolean();

        RunnableC11512a(T t, long j, C11513b<T> c11513b) {
            this.f25953c = t;
            this.f25954d = j;
            this.f25955e = c11513b;
        }

        /* renamed from: a */
        public void m10899a(c cVar) {
            EnumC11296c.m11154e(this, cVar);
        }

        /* renamed from: i */
        public void m10898i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10897j() {
            return get() == EnumC11296c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f25956f.compareAndSet(false, true)) {
                this.f25955e.m10896c(this.f25954d, this.f25953c, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObservableDebounceTimed.java */
    /* renamed from: j.e.f0.e.e.g$b */
    /* loaded from: classes3.dex */
    public static final class C11513b<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25957c;

        /* renamed from: d */
        final long f25958d;

        /* renamed from: e */
        final TimeUnit f25959e;

        /* renamed from: f */
        final v$b f25960f;

        /* renamed from: w */
        c f25961w;

        /* renamed from: x */
        c f25962x;

        /* renamed from: y */
        volatile long f25963y;

        /* renamed from: z */
        boolean f25964z;

        C11513b(InterfaceC11695u<? super T> interfaceC11695u, long j, TimeUnit timeUnit, v$b v_b) {
            this.f25957c = interfaceC11695u;
            this.f25958d = j;
            this.f25959e = timeUnit;
            this.f25960f = v_b;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25964z) {
                return;
            }
            this.f25964z = true;
            c cVar = this.f25962x;
            if (cVar != null) {
                cVar.i();
            }
            RunnableC11512a runnableC11512a = (RunnableC11512a) cVar;
            if (runnableC11512a != null) {
                runnableC11512a.run();
            }
            this.f25957c.mo335a();
            this.f25960f.i();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25964z) {
                a.r(th);
                return;
            }
            c cVar = this.f25962x;
            if (cVar != null) {
                cVar.i();
            }
            this.f25964z = true;
            this.f25957c.mo334b(th);
            this.f25960f.i();
        }

        /* renamed from: c */
        void m10896c(long j, T t, RunnableC11512a<T> runnableC11512a) {
            if (j == this.f25963y) {
                this.f25957c.mo331f(t);
                runnableC11512a.m10898i();
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25961w, cVar)) {
                this.f25961w = cVar;
                this.f25957c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25964z) {
                return;
            }
            long j = this.f25963y + 1;
            this.f25963y = j;
            c cVar = this.f25962x;
            if (cVar != null) {
                cVar.i();
            }
            RunnableC11512a runnableC11512a = new RunnableC11512a(t, j, this);
            this.f25962x = runnableC11512a;
            runnableC11512a.m10899a(this.f25960f.mo10447c(runnableC11512a, this.f25958d, this.f25959e));
        }

        /* renamed from: i */
        public void m10895i() {
            this.f25961w.i();
            this.f25960f.i();
        }

        /* renamed from: j */
        public boolean m10894j() {
            return this.f25960f.j();
        }
    }

    public C11511g(InterfaceC11692s<T> interfaceC11692s, long j, TimeUnit timeUnit, v vVar) {
        super(interfaceC11692s);
        this.f25950d = j;
        this.f25951e = timeUnit;
        this.f25952f = vVar;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11513b(new C11674b(interfaceC11695u), this.f25950d, this.f25951e, this.f25952f.a()));
    }
}
