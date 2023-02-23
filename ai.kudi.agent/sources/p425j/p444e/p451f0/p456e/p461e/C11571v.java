package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableHide.java */
/* renamed from: j.e.f0.e.e.v */
/* loaded from: classes3.dex */
public final class C11571v<T> extends AbstractC11483a<T, T> {

    /* compiled from: ObservableHide.java */
    /* renamed from: j.e.f0.e.e.v$a */
    /* loaded from: classes3.dex */
    static final class C11572a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26134c;

        /* renamed from: d */
        c f26135d;

        C11572a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f26134c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26134c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26134c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26135d, cVar)) {
                this.f26135d = cVar;
                this.f26134c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f26134c.mo331f(t);
        }

        /* renamed from: i */
        public void m10810i() {
            this.f26135d.i();
        }

        /* renamed from: j */
        public boolean m10809j() {
            return this.f26135d.j();
        }
    }

    public C11571v(InterfaceC11692s<T> interfaceC11692s) {
        super(interfaceC11692s);
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11572a(interfaceC11695u));
    }
}
