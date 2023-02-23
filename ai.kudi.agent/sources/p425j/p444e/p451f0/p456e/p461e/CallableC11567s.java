package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.C11327e;
/* compiled from: ObservableFromCallable.java */
/* renamed from: j.e.f0.e.e.s */
/* loaded from: classes3.dex */
public final class CallableC11567s<T> extends AbstractC11688p<T> implements Callable<T> {

    /* renamed from: c */
    final Callable<? extends T> f26125c;

    public CallableC11567s(Callable<? extends T> callable) {
        this.f26125c = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        T call = this.f26125c.call();
        C11312b.m11113d(call, "The callable returned a null value");
        return call;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11327e c11327e = new C11327e(interfaceC11695u);
        interfaceC11695u.mo332d(c11327e);
        if (c11327e.m11099j()) {
            return;
        }
        try {
            T call = this.f26125c.call();
            C11312b.m11113d(call, "Callable returned null");
            c11327e.m11101g(call);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            if (!c11327e.m11099j()) {
                interfaceC11695u.mo334b(th);
            } else {
                a.r(th);
            }
        }
    }
}
