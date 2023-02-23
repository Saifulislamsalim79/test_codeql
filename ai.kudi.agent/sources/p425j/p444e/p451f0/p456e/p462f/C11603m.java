package p425j.p444e.p451f0.p456e.p462f;

import j.e.c0.c;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p455d.C11327e;
/* compiled from: SingleToObservable.java */
/* renamed from: j.e.f0.e.f.m */
/* loaded from: classes3.dex */
public final class C11603m<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26188c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleToObservable.java */
    /* renamed from: j.e.f0.e.f.m$a */
    /* loaded from: classes3.dex */
    public static final class C11604a<T> extends C11327e<T> implements InterfaceC11698y<T> {

        /* renamed from: e */
        c f26189e;

        C11604a(InterfaceC11695u<? super T> interfaceC11695u) {
            super(interfaceC11695u);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            m11100h(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            m11101g(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11147p(this.f26189e, cVar)) {
                this.f26189e = cVar;
                this.f25446c.mo332d(this);
            }
        }

        @Override // p425j.p444e.p451f0.p455d.C11327e
        /* renamed from: i */
        public void mo10789i() {
            super.mo10789i();
            this.f26189e.i();
        }
    }

    public C11603m(InterfaceC11270a0<? extends T> interfaceC11270a0) {
        this.f26188c = interfaceC11270a0;
    }

    /* renamed from: t0 */
    public static <T> InterfaceC11698y<T> m10790t0(InterfaceC11695u<? super T> interfaceC11695u) {
        return new C11604a(interfaceC11695u);
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f26188c.mo10446b(m10790t0(interfaceC11695u));
    }
}
