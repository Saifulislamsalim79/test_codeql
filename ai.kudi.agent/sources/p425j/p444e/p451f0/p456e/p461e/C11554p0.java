package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
/* compiled from: ObservableTimer.java */
/* renamed from: j.e.f0.e.e.p0 */
/* loaded from: classes3.dex */
public final class C11554p0 extends AbstractC11688p<Long> {

    /* renamed from: c */
    final v f26082c;

    /* renamed from: d */
    final long f26083d;

    /* renamed from: e */
    final TimeUnit f26084e;

    /* compiled from: ObservableTimer.java */
    /* renamed from: j.e.f0.e.e.p0$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11555a extends AtomicReference<c> implements c, Runnable {

        /* renamed from: c */
        final InterfaceC11695u<? super Long> f26085c;

        RunnableC11555a(InterfaceC11695u<? super Long> interfaceC11695u) {
            this.f26085c = interfaceC11695u;
        }

        /* renamed from: a */
        public void m10841a(c cVar) {
            EnumC11296c.m11148n(this, cVar);
        }

        /* renamed from: i */
        public void m10840i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10839j() {
            return get() == EnumC11296c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m10839j()) {
                return;
            }
            this.f26085c.mo331f(0L);
            lazySet(EnumC11297d.INSTANCE);
            this.f26085c.mo335a();
        }
    }

    public C11554p0(long j, TimeUnit timeUnit, v vVar) {
        this.f26083d = j;
        this.f26084e = timeUnit;
        this.f26082c = vVar;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super Long> interfaceC11695u) {
        RunnableC11555a runnableC11555a = new RunnableC11555a(interfaceC11695u);
        interfaceC11695u.mo332d(runnableC11555a);
        runnableC11555a.m10841a(this.f26082c.c(runnableC11555a, this.f26083d, this.f26084e));
    }
}
