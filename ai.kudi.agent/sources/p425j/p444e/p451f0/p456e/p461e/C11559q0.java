package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.atomic.AtomicBoolean;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableUnsubscribeOn.java */
/* renamed from: j.e.f0.e.e.q0 */
/* loaded from: classes3.dex */
public final class C11559q0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final v f26098d;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* renamed from: j.e.f0.e.e.q0$a */
    /* loaded from: classes3.dex */
    static final class C11560a<T> extends AtomicBoolean implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26099c;

        /* renamed from: d */
        final v f26100d;

        /* renamed from: e */
        c f26101e;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: j.e.f0.e.e.q0$a$a */
        /* loaded from: classes3.dex */
        final class RunnableC11561a implements Runnable {
            RunnableC11561a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11560a.this.f26101e.i();
            }
        }

        C11560a(InterfaceC11695u<? super T> interfaceC11695u, v vVar) {
            this.f26099c = interfaceC11695u;
            this.f26100d = vVar;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (get()) {
                return;
            }
            this.f26099c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (get()) {
                a.r(th);
            } else {
                this.f26099c.mo334b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26101e, cVar)) {
                this.f26101e = cVar;
                this.f26099c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (get()) {
                return;
            }
            this.f26099c.mo331f(t);
        }

        /* renamed from: i */
        public void m10827i() {
            if (compareAndSet(false, true)) {
                this.f26100d.b(new RunnableC11561a());
            }
        }

        /* renamed from: j */
        public boolean m10826j() {
            return get();
        }
    }

    public C11559q0(InterfaceC11692s<T> interfaceC11692s, v vVar) {
        super(interfaceC11692s);
        this.f26098d = vVar;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11560a(interfaceC11695u, this.f26098d));
    }
}
