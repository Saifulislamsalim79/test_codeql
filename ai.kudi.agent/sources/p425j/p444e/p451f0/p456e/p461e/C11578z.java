package p425j.p444e.p451f0.p456e.p461e;

import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.AbstractC11323a;
/* compiled from: ObservableMap.java */
/* renamed from: j.e.f0.e.e.z */
/* loaded from: classes3.dex */
public final class C11578z<T, U> extends AbstractC11483a<T, U> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends U> f26142d;

    /* compiled from: ObservableMap.java */
    /* renamed from: j.e.f0.e.e.z$a */
    /* loaded from: classes3.dex */
    static final class C11579a<T, U> extends AbstractC11323a<T, U> {

        /* renamed from: x */
        final InterfaceC11291f<? super T, ? extends U> f26143x;

        C11579a(InterfaceC11695u<? super U> interfaceC11695u, InterfaceC11291f<? super T, ? extends U> interfaceC11291f) {
            super(interfaceC11695u);
            this.f26143x = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25442f) {
                return;
            }
            if (this.f25443w != 0) {
                this.f25439c.mo331f(null);
                return;
            }
            try {
                U mo10663a = this.f26143x.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                this.f25439c.mo331f(mo10663a);
            } catch (Throwable th) {
                m11108g(th);
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m11107h(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public U poll() throws Exception {
            T poll = this.f25441e.poll();
            if (poll != null) {
                U mo10663a = this.f26143x.mo10663a(poll);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                return mo10663a;
            }
            return null;
        }
    }

    public C11578z(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends U> interfaceC11291f) {
        super(interfaceC11692s);
        this.f26142d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super U> interfaceC11695u) {
        this.f25839c.mo10478e(new C11579a(interfaceC11695u, this.f26142d));
    }
}
