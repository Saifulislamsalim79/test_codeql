package p425j.p444e.p451f0.p456e.p461e;

import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p455d.AbstractC11323a;
/* compiled from: ObservableFilter.java */
/* renamed from: j.e.f0.e.e.m */
/* loaded from: classes3.dex */
public final class C11536m<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11292g<? super T> f26016d;

    /* compiled from: ObservableFilter.java */
    /* renamed from: j.e.f0.e.e.m$a */
    /* loaded from: classes3.dex */
    static final class C11537a<T> extends AbstractC11323a<T, T> {

        /* renamed from: x */
        final InterfaceC11292g<? super T> f26017x;

        C11537a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11292g<? super T> interfaceC11292g) {
            super(interfaceC11695u);
            this.f26017x = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25443w == 0) {
                try {
                    if (this.f26017x.mo10557c(t)) {
                        this.f25439c.mo331f(t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    m11108g(th);
                    return;
                }
            }
            this.f25439c.mo331f(null);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m11107h(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f25441e.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f26017x.mo10557c(poll));
            return poll;
        }
    }

    public C11536m(InterfaceC11692s<T> interfaceC11692s, InterfaceC11292g<? super T> interfaceC11292g) {
        super(interfaceC11692s);
        this.f26016d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11537a(interfaceC11695u, this.f26016d));
    }
}
