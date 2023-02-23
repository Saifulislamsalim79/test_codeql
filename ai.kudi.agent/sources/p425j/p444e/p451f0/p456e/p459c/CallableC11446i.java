package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.p448c0.C11281d;
/* compiled from: MaybeFromCallable.java */
/* renamed from: j.e.f0.e.c.i */
/* loaded from: classes3.dex */
public final class CallableC11446i<T> extends AbstractC11677k<T> implements Callable<T> {

    /* renamed from: c */
    final Callable<? extends T> f25769c;

    public CallableC11446i(Callable<? extends T> callable) {
        this.f25769c = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f25769c.call();
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        c m11209b = C11281d.m11209b();
        interfaceC11685m.mo10548d(m11209b);
        if (m11209b.j()) {
            return;
        }
        try {
            Object obj = (T) this.f25769c.call();
            if (m11209b.j()) {
                return;
            }
            if (obj == null) {
                interfaceC11685m.mo10551a();
            } else {
                interfaceC11685m.mo10549c(obj);
            }
        } catch (Throwable th) {
            C11118a.m11646b(th);
            if (!m11209b.j()) {
                interfaceC11685m.mo10550b(th);
            } else {
                a.r(th);
            }
        }
    }
}
