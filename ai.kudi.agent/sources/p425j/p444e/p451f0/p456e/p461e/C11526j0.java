package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableSkip.java */
/* renamed from: j.e.f0.e.e.j0 */
/* loaded from: classes3.dex */
public final class C11526j0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final long f25990d;

    /* compiled from: ObservableSkip.java */
    /* renamed from: j.e.f0.e.e.j0$a */
    /* loaded from: classes3.dex */
    static final class C11527a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25991c;

        /* renamed from: d */
        long f25992d;

        /* renamed from: e */
        c f25993e;

        C11527a(InterfaceC11695u<? super T> interfaceC11695u, long j) {
            this.f25991c = interfaceC11695u;
            this.f25992d = j;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25991c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25991c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25993e, cVar)) {
                this.f25993e = cVar;
                this.f25991c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            long j = this.f25992d;
            if (j != 0) {
                this.f25992d = j - 1;
            } else {
                this.f25991c.mo331f(t);
            }
        }

        /* renamed from: i */
        public void m10882i() {
            this.f25993e.i();
        }

        /* renamed from: j */
        public boolean m10881j() {
            return this.f25993e.j();
        }
    }

    public C11526j0(InterfaceC11692s<T> interfaceC11692s, long j) {
        super(interfaceC11692s);
        this.f25990d = j;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11527a(interfaceC11695u, this.f25990d));
    }
}
