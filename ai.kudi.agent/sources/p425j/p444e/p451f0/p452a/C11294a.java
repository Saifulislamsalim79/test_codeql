package p425j.p444e.p451f0.p452a;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p450e0.InterfaceC11290d;
/* compiled from: CancellableDisposable.java */
/* renamed from: j.e.f0.a.a */
/* loaded from: classes3.dex */
public final class C11294a extends AtomicReference<InterfaceC11290d> implements c {
    public C11294a(InterfaceC11290d interfaceC11290d) {
        super(interfaceC11290d);
    }

    /* renamed from: i */
    public void m11158i() {
        InterfaceC11290d andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            C11118a.m11646b(e);
            a.r(e);
        }
    }

    /* renamed from: j */
    public boolean m11157j() {
        return get() == null;
    }
}
