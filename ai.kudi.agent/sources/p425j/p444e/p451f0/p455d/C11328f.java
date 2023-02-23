package p425j.p444e.p451f0.p455d;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: EmptyCompletableObserver.java */
/* renamed from: j.e.f0.d.f */
/* loaded from: classes3.dex */
public final class C11328f extends AtomicReference<c> implements InterfaceC11278c, c {
    @Override // p425j.p444e.InterfaceC11278c
    /* renamed from: a */
    public void mo10845a() {
        lazySet(EnumC11296c.DISPOSED);
    }

    @Override // p425j.p444e.InterfaceC11278c
    /* renamed from: b */
    public void mo10844b(Throwable th) {
        lazySet(EnumC11296c.DISPOSED);
        a.r(new OnErrorNotImplementedException(th));
    }

    @Override // p425j.p444e.InterfaceC11278c
    /* renamed from: d */
    public void mo10616d(c cVar) {
        EnumC11296c.m11149m(this, cVar);
    }

    /* renamed from: i */
    public void m11098i() {
        EnumC11296c.m11156a(this);
    }

    /* renamed from: j */
    public boolean m11097j() {
        return get() == EnumC11296c.DISPOSED;
    }
}
