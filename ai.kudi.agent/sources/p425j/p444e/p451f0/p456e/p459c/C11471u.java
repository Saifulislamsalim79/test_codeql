package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p455d.C11327e;
/* compiled from: MaybeToObservable.java */
/* renamed from: j.e.f0.e.c.u */
/* loaded from: classes3.dex */
public final class C11471u<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final InterfaceC11687o<T> f25816c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaybeToObservable.java */
    /* renamed from: j.e.f0.e.c.u$a */
    /* loaded from: classes3.dex */
    public static final class C11472a<T> extends C11327e<T> implements InterfaceC11685m<T> {

        /* renamed from: e */
        c f25817e;

        C11472a(InterfaceC11695u<? super T> interfaceC11695u) {
            super(interfaceC11695u);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            m11102e();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            m11100h(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            m11101g(t);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25817e, cVar)) {
                this.f25817e = cVar;
                this.f25446c.mo332d(this);
            }
        }

        @Override // p425j.p444e.p451f0.p455d.C11327e
        /* renamed from: i */
        public void mo10789i() {
            super.mo10789i();
            this.f25817e.i();
        }
    }

    public C11471u(InterfaceC11687o<T> interfaceC11687o) {
        this.f25816c = interfaceC11687o;
    }

    /* renamed from: t0 */
    public static <T> InterfaceC11685m<T> m10969t0(InterfaceC11695u<? super T> interfaceC11695u) {
        return new C11472a(interfaceC11695u);
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25816c.mo10546a(m10969t0(interfaceC11695u));
    }
}
