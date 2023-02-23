package p425j.p444e.p471k0;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p467j.C11653a;
import p425j.p444e.p451f0.p467j.EnumC11664j;
/* compiled from: SerializedSubject.java */
/* renamed from: j.e.k0.c */
/* loaded from: classes3.dex */
final class C11682c<T> extends AbstractC11683d<T> implements C11653a.InterfaceC11654a<Object> {

    /* renamed from: c */
    final AbstractC11683d<T> f26402c;

    /* renamed from: d */
    boolean f26403d;

    /* renamed from: e */
    C11653a<Object> f26404e;

    /* renamed from: f */
    volatile boolean f26405f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11682c(AbstractC11683d<T> abstractC11683d) {
        this.f26402c = abstractC11683d;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        if (this.f26405f) {
            return;
        }
        synchronized (this) {
            if (this.f26405f) {
                return;
            }
            this.f26405f = true;
            if (this.f26403d) {
                C11653a<Object> c11653a = this.f26404e;
                if (c11653a == null) {
                    c11653a = new C11653a<>(4);
                    this.f26404e = c11653a;
                }
                c11653a.m10666b(EnumC11664j.m10637e());
                return;
            }
            this.f26403d = true;
            this.f26402c.mo335a();
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        if (this.f26405f) {
            a.r(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f26405f) {
                this.f26405f = true;
                if (this.f26403d) {
                    C11653a<Object> c11653a = this.f26404e;
                    if (c11653a == null) {
                        c11653a = new C11653a<>(4);
                        this.f26404e = c11653a;
                    }
                    c11653a.m10664d(EnumC11664j.m10635h(th));
                    return;
                }
                this.f26403d = true;
                z = false;
            }
            if (z) {
                a.r(th);
            } else {
                this.f26402c.mo334b(th);
            }
        }
    }

    @Override // p425j.p444e.p451f0.p467j.C11653a.InterfaceC11654a, p425j.p444e.p450e0.InterfaceC11292g
    /* renamed from: c */
    public boolean mo10557c(Object obj) {
        return EnumC11664j.m10638b(obj, this.f26402c);
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        boolean z = true;
        if (!this.f26405f) {
            synchronized (this) {
                if (!this.f26405f) {
                    if (this.f26403d) {
                        C11653a<Object> c11653a = this.f26404e;
                        if (c11653a == null) {
                            c11653a = new C11653a<>(4);
                            this.f26404e = c11653a;
                        }
                        c11653a.m10666b(EnumC11664j.m10636g(cVar));
                        return;
                    }
                    this.f26403d = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.i();
            return;
        }
        this.f26402c.mo332d(cVar);
        m10556u0();
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        if (this.f26405f) {
            return;
        }
        synchronized (this) {
            if (this.f26405f) {
                return;
            }
            if (this.f26403d) {
                C11653a<Object> c11653a = this.f26404e;
                if (c11653a == null) {
                    c11653a = new C11653a<>(4);
                    this.f26404e = c11653a;
                }
                EnumC11664j.m10630p(t);
                c11653a.m10666b(t);
                return;
            }
            this.f26403d = true;
            this.f26402c.mo331f(t);
            m10556u0();
        }
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f26402c.mo10478e(interfaceC11695u);
    }

    /* renamed from: u0 */
    void m10556u0() {
        C11653a<Object> c11653a;
        while (true) {
            synchronized (this) {
                c11653a = this.f26404e;
                if (c11653a == null) {
                    this.f26403d = false;
                    return;
                }
                this.f26404e = null;
            }
            c11653a.m10665c(this);
        }
    }
}
