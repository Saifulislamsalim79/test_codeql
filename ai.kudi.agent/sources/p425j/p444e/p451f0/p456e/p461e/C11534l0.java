package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.C11300g;
/* compiled from: ObservableSwitchIfEmpty.java */
/* renamed from: j.e.f0.e.e.l0 */
/* loaded from: classes3.dex */
public final class C11534l0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11692s<? extends T> f26011d;

    /* compiled from: ObservableSwitchIfEmpty.java */
    /* renamed from: j.e.f0.e.e.l0$a */
    /* loaded from: classes3.dex */
    static final class C11535a<T> implements InterfaceC11695u<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26012c;

        /* renamed from: d */
        final InterfaceC11692s<? extends T> f26013d;

        /* renamed from: f */
        boolean f26015f = true;

        /* renamed from: e */
        final C11300g f26014e = new C11300g();

        C11535a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11692s<? extends T> interfaceC11692s) {
            this.f26012c = interfaceC11695u;
            this.f26013d = interfaceC11692s;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f26015f) {
                this.f26015f = false;
                this.f26013d.mo10478e(this);
                return;
            }
            this.f26012c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26012c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            this.f26014e.m11129b(cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f26015f) {
                this.f26015f = false;
            }
            this.f26012c.mo331f(t);
        }
    }

    public C11534l0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11692s<? extends T> interfaceC11692s2) {
        super(interfaceC11692s);
        this.f26011d = interfaceC11692s2;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11535a c11535a = new C11535a(interfaceC11695u, this.f26011d);
        interfaceC11695u.mo332d(c11535a.f26014e);
        this.f25839c.mo10478e(c11535a);
    }
}
