package p425j.p444e.p451f0.p455d;

import j.e.i0.a;
import p425j.p444e.InterfaceC11695u;
/* compiled from: DeferredScalarDisposable.java */
/* renamed from: j.e.f0.d.e */
/* loaded from: classes3.dex */
public class C11327e<T> extends AbstractC11324b<T> {

    /* renamed from: c */
    protected final InterfaceC11695u<? super T> f25446c;

    /* renamed from: d */
    protected T f25447d;

    public C11327e(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25446c = interfaceC11695u;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final void clear() {
        lazySet(32);
        this.f25447d = null;
    }

    /* renamed from: e */
    public final void m11102e() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f25446c.mo335a();
    }

    /* renamed from: g */
    public final void m11101g(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        InterfaceC11695u<? super T> interfaceC11695u = this.f25446c;
        if (i == 8) {
            this.f25447d = t;
            lazySet(16);
            interfaceC11695u.mo331f(null);
        } else {
            lazySet(2);
            interfaceC11695u.mo331f(t);
        }
        if (get() != 4) {
            interfaceC11695u.mo335a();
        }
    }

    /* renamed from: h */
    public final void m11100h(Throwable th) {
        if ((get() & 54) != 0) {
            a.r(th);
            return;
        }
        lazySet(2);
        this.f25446c.mo334b(th);
    }

    /* renamed from: i */
    public void mo10789i() {
        set(4);
        this.f25447d = null;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final boolean isEmpty() {
        return get() != 16;
    }

    /* renamed from: j */
    public final boolean m11099j() {
        return get() == 4;
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
    public final T poll() throws Exception {
        if (get() == 16) {
            T t = this.f25447d;
            this.f25447d = null;
            lazySet(32);
            return t;
        }
        return null;
    }
}
