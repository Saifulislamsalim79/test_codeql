package p425j.p444e.p451f0.p466i;

import p577n.p586b.InterfaceC14456b;
/* compiled from: DeferredScalarSubscription.java */
/* renamed from: j.e.f0.i.c */
/* loaded from: classes3.dex */
public class C11648c<T> extends AbstractC11646a<T> {

    /* renamed from: c */
    protected final InterfaceC14456b<? super T> f26325c;

    /* renamed from: d */
    protected T f26326d;

    public C11648c(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f26325c = interfaceC14456b;
    }

    public void cancel() {
        set(4);
        this.f26326d = null;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final void clear() {
        lazySet(32);
        this.f26326d = null;
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public final void mo1686e(long j) {
        T t;
        if (EnumC11652g.m10669m(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f26326d) == null) {
                        return;
                    }
                    this.f26326d = null;
                    InterfaceC14456b<? super T> interfaceC14456b = this.f26325c;
                    interfaceC14456b.mo1688f(t);
                    if (get() != 4) {
                        interfaceC14456b.mo1690a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    /* renamed from: i */
    public final void m10684i(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                InterfaceC14456b<? super T> interfaceC14456b = this.f26325c;
                interfaceC14456b.mo1688f(t);
                if (get() != 4) {
                    interfaceC14456b.mo1690a();
                    return;
                }
                return;
            }
            this.f26326d = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.f26326d = null;
                return;
            }
        }
        this.f26326d = t;
        lazySet(16);
        InterfaceC14456b<? super T> interfaceC14456b2 = this.f26325c;
        interfaceC14456b2.mo1688f(t);
        if (get() != 4) {
            interfaceC14456b2.mo1690a();
        }
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
    /* renamed from: m */
    public final int mo10681m(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final T poll() {
        if (get() == 16) {
            lazySet(32);
            T t = this.f26326d;
            this.f26326d = null;
            return t;
        }
        return null;
    }
}
