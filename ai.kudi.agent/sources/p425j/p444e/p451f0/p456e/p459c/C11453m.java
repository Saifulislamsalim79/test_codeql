package p425j.p444e.p451f0.p456e.p459c;

import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.p448c0.C11281d;
import p425j.p444e.p451f0.p454c.InterfaceCallableC11320h;
/* compiled from: MaybeJust.java */
/* renamed from: j.e.f0.e.c.m */
/* loaded from: classes3.dex */
public final class C11453m<T> extends AbstractC11677k<T> implements InterfaceCallableC11320h<T> {

    /* renamed from: c */
    final T f25778c;

    public C11453m(T t) {
        this.f25778c = t;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceCallableC11320h, java.util.concurrent.Callable
    public T call() {
        return this.f25778c;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        interfaceC11685m.mo10548d(C11281d.m11210a());
        interfaceC11685m.mo10549c((T) this.f25778c);
    }
}
