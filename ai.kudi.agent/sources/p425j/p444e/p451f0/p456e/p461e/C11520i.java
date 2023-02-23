package p425j.p444e.p451f0.p456e.p461e;

import j.e.e0.e;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p455d.AbstractC11323a;
/* compiled from: ObservableDoAfterNext.java */
/* renamed from: j.e.f0.e.e.i */
/* loaded from: classes3.dex */
public final class C11520i<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final e<? super T> f25975d;

    /* compiled from: ObservableDoAfterNext.java */
    /* renamed from: j.e.f0.e.e.i$a */
    /* loaded from: classes3.dex */
    static final class C11521a<T> extends AbstractC11323a<T, T> {

        /* renamed from: x */
        final e<? super T> f25976x;

        C11521a(InterfaceC11695u<? super T> interfaceC11695u, e<? super T> eVar) {
            super(interfaceC11695u);
            this.f25976x = eVar;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25439c.mo331f(t);
            if (this.f25443w == 0) {
                try {
                    this.f25976x.accept(t);
                } catch (Throwable th) {
                    m11108g(th);
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m11107h(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            T poll = this.f25441e.poll();
            if (poll != null) {
                this.f25976x.accept(poll);
            }
            return poll;
        }
    }

    public C11520i(InterfaceC11692s<T> interfaceC11692s, e<? super T> eVar) {
        super(interfaceC11692s);
        this.f25975d = eVar;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11521a(interfaceC11695u, this.f25975d));
    }
}
