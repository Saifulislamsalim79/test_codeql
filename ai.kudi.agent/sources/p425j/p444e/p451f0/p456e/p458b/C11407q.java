package p425j.p444e.p451f0.p456e.p458b;

import p425j.p444e.AbstractC11293f;
import p425j.p444e.p451f0.p454c.InterfaceCallableC11320h;
import p425j.p444e.p451f0.p466i.C11650e;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableJust.java */
/* renamed from: j.e.f0.e.b.q */
/* loaded from: classes3.dex */
public final class C11407q<T> extends AbstractC11293f<T> implements InterfaceCallableC11320h<T> {

    /* renamed from: d */
    private final T f25661d;

    public C11407q(T t) {
        this.f25661d = t;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        interfaceC14456b.mo1687g(new C11650e(interfaceC14456b, this.f25661d));
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceCallableC11320h, java.util.concurrent.Callable
    public T call() {
        return this.f25661d;
    }
}
