package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
/* compiled from: ObservableIgnoreElements.java */
/* renamed from: j.e.f0.e.e.w */
/* loaded from: classes3.dex */
public final class C11573w<T> extends AbstractC11483a<T, T> {

    /* compiled from: ObservableIgnoreElements.java */
    /* renamed from: j.e.f0.e.e.w$a */
    /* loaded from: classes3.dex */
    static final class C11574a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26136c;

        /* renamed from: d */
        c f26137d;

        C11574a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f26136c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26136c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26136c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            this.f26137d = cVar;
            this.f26136c.mo332d(this);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
        }

        /* renamed from: i */
        public void m10808i() {
            this.f26137d.i();
        }

        /* renamed from: j */
        public boolean m10807j() {
            return this.f26137d.j();
        }
    }

    public C11573w(InterfaceC11692s<T> interfaceC11692s) {
        super(interfaceC11692s);
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11574a(interfaceC11695u));
    }
}
