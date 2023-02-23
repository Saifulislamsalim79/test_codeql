package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p448c0.C11281d;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: SingleFromCallable.java */
/* renamed from: j.e.f0.e.f.e */
/* loaded from: classes3.dex */
public final class C11589e<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final Callable<? extends T> f26160c;

    public C11589e(Callable<? extends T> callable) {
        this.f26160c = callable;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        c m11209b = C11281d.m11209b();
        interfaceC11698y.mo3150d(m11209b);
        if (m11209b.j()) {
            return;
        }
        try {
            Object obj = (T) this.f26160c.call();
            C11312b.m11113d(obj, "The callable returned a null value");
            if (m11209b.j()) {
                return;
            }
            interfaceC11698y.mo3151c(obj);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            if (!m11209b.j()) {
                interfaceC11698y.mo3152b(th);
            } else {
                a.r(th);
            }
        }
    }
}
