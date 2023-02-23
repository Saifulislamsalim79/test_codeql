package p425j.p444e.p451f0.p456e.p461e;

import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p454c.InterfaceCallableC11320h;
import p425j.p444e.p451f0.p456e.p461e.C11514g0;
/* compiled from: ObservableJust.java */
/* renamed from: j.e.f0.e.e.y */
/* loaded from: classes3.dex */
public final class C11577y<T> extends AbstractC11688p<T> implements InterfaceCallableC11320h<T> {

    /* renamed from: c */
    private final T f26141c;

    public C11577y(T t) {
        this.f26141c = t;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceCallableC11320h, java.util.concurrent.Callable
    public T call() {
        return this.f26141c;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11514g0.RunnableC11515a runnableC11515a = new C11514g0.RunnableC11515a(interfaceC11695u, this.f26141c);
        interfaceC11695u.mo332d(runnableC11515a);
        runnableC11515a.run();
    }
}
