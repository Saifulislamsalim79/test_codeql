package p425j.p444e.p451f0.p466i;

import java.util.concurrent.atomic.AtomicInteger;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p577n.p586b.InterfaceC14456b;
/* compiled from: ScalarSubscription.java */
/* renamed from: j.e.f0.i.e */
/* loaded from: classes3.dex */
public final class C11650e<T> extends AtomicInteger implements InterfaceC11319g<T> {

    /* renamed from: c */
    final T f26329c;

    /* renamed from: d */
    final InterfaceC14456b<? super T> f26330d;

    public C11650e(InterfaceC14456b<? super T> interfaceC14456b, T t) {
        this.f26330d = interfaceC14456b;
        this.f26329c = t;
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        lazySet(2);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        lazySet(1);
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        if (EnumC11652g.m10669m(j) && compareAndSet(0, 1)) {
            InterfaceC14456b<? super T> interfaceC14456b = this.f26330d;
            interfaceC14456b.mo1688f((T) this.f26329c);
            if (get() != 2) {
                interfaceC14456b.mo1690a();
            }
        }
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
    /* renamed from: m */
    public int mo10681m(int i) {
        return i & 1;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.f26329c;
        }
        return null;
    }
}
