package p425j.p444e.p451f0.p455d;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ConsumerSingleObserver.java */
/* renamed from: j.e.f0.d.d */
/* loaded from: classes3.dex */
public final class C11326d<T> extends AtomicReference<c> implements InterfaceC11698y<T>, c {

    /* renamed from: c */
    final e<? super T> f25444c;

    /* renamed from: d */
    final e<? super Throwable> f25445d;

    public C11326d(e<? super T> eVar, e<? super Throwable> eVar2) {
        this.f25444c = eVar;
        this.f25445d = eVar2;
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: b */
    public void mo3152b(Throwable th) {
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25445d.accept(th);
        } catch (Throwable th2) {
            C11118a.m11646b(th2);
            a.r(new CompositeException(th, th2));
        }
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: c */
    public void mo3151c(T t) {
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25444c.accept(t);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11698y
    /* renamed from: d */
    public void mo3150d(c cVar) {
        EnumC11296c.m11149m(this, cVar);
    }

    /* renamed from: i */
    public void m11104i() {
        EnumC11296c.m11156a(this);
    }

    /* renamed from: j */
    public boolean m11103j() {
        return get() == EnumC11296c.DISPOSED;
    }
}
