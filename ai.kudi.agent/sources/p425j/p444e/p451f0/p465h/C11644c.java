package p425j.p444e.p451f0.p465h;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14457c;
/* compiled from: LambdaSubscriber.java */
/* renamed from: j.e.f0.h.c */
/* loaded from: classes3.dex */
public final class C11644c<T> extends AtomicReference<InterfaceC14457c> implements InterfaceC11676j<T>, InterfaceC14457c, c {

    /* renamed from: c */
    final e<? super T> f26315c;

    /* renamed from: d */
    final e<? super Throwable> f26316d;

    /* renamed from: e */
    final InterfaceC11287a f26317e;

    /* renamed from: f */
    final e<? super InterfaceC14457c> f26318f;

    public C11644c(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, e<? super InterfaceC14457c> eVar3) {
        this.f26315c = eVar;
        this.f26316d = eVar2;
        this.f26317e = interfaceC11287a;
        this.f26318f = eVar3;
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: a */
    public void mo1690a() {
        InterfaceC14457c interfaceC14457c = get();
        EnumC11652g enumC11652g = EnumC11652g.CANCELLED;
        if (interfaceC14457c != enumC11652g) {
            lazySet(enumC11652g);
            try {
                this.f26317e.run();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                a.r(th);
            }
        }
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: b */
    public void mo1689b(Throwable th) {
        InterfaceC14457c interfaceC14457c = get();
        EnumC11652g enumC11652g = EnumC11652g.CANCELLED;
        if (interfaceC14457c != enumC11652g) {
            lazySet(enumC11652g);
            try {
                this.f26316d.accept(th);
                return;
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                a.r(new CompositeException(th, th2));
                return;
            }
        }
        a.r(th);
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        EnumC11652g.m10675a(this);
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        get().mo1686e(j);
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: f */
    public void mo1688f(T t) {
        if (m10685j()) {
            return;
        }
        try {
            this.f26315c.accept(t);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            get().cancel();
            mo1689b(th);
        }
    }

    @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
    /* renamed from: g */
    public void mo1687g(InterfaceC14457c interfaceC14457c) {
        if (EnumC11652g.m10670j(this, interfaceC14457c)) {
            try {
                this.f26318f.accept(this);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                interfaceC14457c.cancel();
                mo1689b(th);
            }
        }
    }

    /* renamed from: i */
    public void m10686i() {
        cancel();
    }

    /* renamed from: j */
    public boolean m10685j() {
        return get() == EnumC11652g.CANCELLED;
    }
}
