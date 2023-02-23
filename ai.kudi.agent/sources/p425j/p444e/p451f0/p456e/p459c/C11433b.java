package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeCallbackObserver.java */
/* renamed from: j.e.f0.e.c.b */
/* loaded from: classes3.dex */
public final class C11433b<T> extends AtomicReference<c> implements InterfaceC11685m<T>, c {

    /* renamed from: c */
    final e<? super T> f25745c;

    /* renamed from: d */
    final e<? super Throwable> f25746d;

    /* renamed from: e */
    final InterfaceC11287a f25747e;

    public C11433b(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a) {
        this.f25745c = eVar;
        this.f25746d = eVar2;
        this.f25747e = interfaceC11287a;
    }

    @Override // p425j.p444e.InterfaceC11685m
    /* renamed from: a */
    public void mo10551a() {
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25747e.run();
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11685m
    /* renamed from: b */
    public void mo10550b(Throwable th) {
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25746d.accept(th);
        } catch (Throwable th2) {
            C11118a.m11646b(th2);
            a.r(new CompositeException(th, th2));
        }
    }

    @Override // p425j.p444e.InterfaceC11685m
    /* renamed from: c */
    public void mo10549c(T t) {
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25745c.accept(t);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11685m
    /* renamed from: d */
    public void mo10548d(c cVar) {
        EnumC11296c.m11149m(this, cVar);
    }

    /* renamed from: i */
    public void m11003i() {
        EnumC11296c.m11156a(this);
    }

    /* renamed from: j */
    public boolean m11002j() {
        return EnumC11296c.m11155b(get());
    }
}
