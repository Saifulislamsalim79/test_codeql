package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p454c.InterfaceC11316d;
/* compiled from: ObservableIgnoreElementsCompletable.java */
/* renamed from: j.e.f0.e.e.x */
/* loaded from: classes3.dex */
public final class C11575x<T> extends AbstractC11271b implements InterfaceC11316d<T> {

    /* renamed from: c */
    final InterfaceC11692s<T> f26138c;

    /* compiled from: ObservableIgnoreElementsCompletable.java */
    /* renamed from: j.e.f0.e.e.x$a */
    /* loaded from: classes3.dex */
    static final class C11576a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11278c f26139c;

        /* renamed from: d */
        c f26140d;

        C11576a(InterfaceC11278c interfaceC11278c) {
            this.f26139c = interfaceC11278c;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26139c.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26139c.mo10844b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            this.f26140d = cVar;
            this.f26139c.mo10616d(this);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
        }

        /* renamed from: i */
        public void m10804i() {
            this.f26140d.i();
        }

        /* renamed from: j */
        public boolean m10803j() {
            return this.f26140d.j();
        }
    }

    public C11575x(InterfaceC11692s<T> interfaceC11692s) {
        this.f26138c = interfaceC11692s;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11316d
    /* renamed from: a */
    public AbstractC11688p<T> mo10806a() {
        return a.m(new C11573w(this.f26138c));
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    public void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f26138c.mo10478e(new C11576a(interfaceC11278c));
    }
}
