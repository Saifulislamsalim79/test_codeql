package p425j.p444e.p451f0.p456e.p457a;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.p448c0.C11281d;
/* compiled from: CompletableFromCallable.java */
/* renamed from: j.e.f0.e.a.f */
/* loaded from: classes3.dex */
public final class C11340f extends AbstractC11271b {

    /* renamed from: c */
    final Callable<?> f25469c;

    public C11340f(Callable<?> callable) {
        this.f25469c = callable;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        c m11209b = C11281d.m11209b();
        interfaceC11278c.mo10616d(m11209b);
        try {
            this.f25469c.call();
            if (m11209b.j()) {
                return;
            }
            interfaceC11278c.mo10845a();
        } catch (Throwable th) {
            C11118a.m11646b(th);
            if (!m11209b.j()) {
                interfaceC11278c.mo10844b(th);
            } else {
                a.r(th);
            }
        }
    }
}
