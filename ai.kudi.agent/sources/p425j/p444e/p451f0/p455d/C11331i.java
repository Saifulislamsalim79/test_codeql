package p425j.p444e.p451f0.p455d;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: LambdaObserver.java */
/* renamed from: j.e.f0.d.i */
/* loaded from: classes3.dex */
public final class C11331i<T> extends AtomicReference<c> implements InterfaceC11695u<T>, c {

    /* renamed from: c */
    final e<? super T> f25453c;

    /* renamed from: d */
    final e<? super Throwable> f25454d;

    /* renamed from: e */
    final InterfaceC11287a f25455e;

    /* renamed from: f */
    final e<? super c> f25456f;

    public C11331i(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, e<? super c> eVar3) {
        this.f25453c = eVar;
        this.f25454d = eVar2;
        this.f25455e = interfaceC11287a;
        this.f25456f = eVar3;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        if (m11090j()) {
            return;
        }
        lazySet(EnumC11296c.DISPOSED);
        try {
            this.f25455e.run();
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        if (!m11090j()) {
            lazySet(EnumC11296c.DISPOSED);
            try {
                this.f25454d.accept(th);
                return;
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                a.r(new CompositeException(th, th2));
                return;
            }
        }
        a.r(th);
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        if (EnumC11296c.m11149m(this, cVar)) {
            try {
                this.f25456f.accept(this);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                cVar.i();
                mo334b(th);
            }
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        if (m11090j()) {
            return;
        }
        try {
            this.f25453c.accept(t);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            get().i();
            mo334b(th);
        }
    }

    /* renamed from: i */
    public void m11091i() {
        EnumC11296c.m11156a(this);
    }

    /* renamed from: j */
    public boolean m11090j() {
        return get() == EnumC11296c.DISPOSED;
    }
}
