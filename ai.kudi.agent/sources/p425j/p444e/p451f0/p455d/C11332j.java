package p425j.p444e.p451f0.p455d;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ResumeSingleObserver.java */
/* renamed from: j.e.f0.d.j */
/* loaded from: classes3.dex */
public final class C11332j<T> implements InterfaceC11698y<T> {

    /* renamed from: c */
    final AtomicReference<c> f25457c;

    /* renamed from: d */
    final InterfaceC11698y<? super T> f25458d;

    public C11332j(AtomicReference<c> atomicReference, InterfaceC11698y<? super T> interfaceC11698y) {
        this.f25457c = atomicReference;
        this.f25458d = interfaceC11698y;
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: b */
    public void mo3152b(Throwable th) {
        this.f25458d.mo3152b(th);
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: c */
    public void mo3151c(T t) {
        this.f25458d.mo3151c(t);
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: d */
    public void mo3150d(c cVar) {
        EnumC11296c.m11154e(this.f25457c, cVar);
    }
}
