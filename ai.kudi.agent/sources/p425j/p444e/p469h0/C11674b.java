package p425j.p444e.p469h0;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p467j.C11653a;
import p425j.p444e.p451f0.p467j.EnumC11664j;
/* compiled from: SerializedObserver.java */
/* renamed from: j.e.h0.b */
/* loaded from: classes3.dex */
public final class C11674b<T> implements InterfaceC11695u<T>, c {

    /* renamed from: c */
    final InterfaceC11695u<? super T> f26363c;

    /* renamed from: d */
    final boolean f26364d;

    /* renamed from: e */
    c f26365e;

    /* renamed from: f */
    boolean f26366f;

    /* renamed from: w */
    C11653a<Object> f26367w;

    /* renamed from: x */
    volatile boolean f26368x;

    public C11674b(InterfaceC11695u<? super T> interfaceC11695u) {
        this(interfaceC11695u, false);
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        if (this.f26368x) {
            return;
        }
        synchronized (this) {
            if (this.f26368x) {
                return;
            }
            if (this.f26366f) {
                C11653a<Object> c11653a = this.f26367w;
                if (c11653a == null) {
                    c11653a = new C11653a<>(4);
                    this.f26367w = c11653a;
                }
                c11653a.m10666b(EnumC11664j.m10637e());
                return;
            }
            this.f26368x = true;
            this.f26366f = true;
            this.f26363c.mo335a();
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        if (this.f26368x) {
            a.r(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.f26368x) {
                if (this.f26366f) {
                    this.f26368x = true;
                    C11653a<Object> c11653a = this.f26367w;
                    if (c11653a == null) {
                        c11653a = new C11653a<>(4);
                        this.f26367w = c11653a;
                    }
                    Object m10635h = EnumC11664j.m10635h(th);
                    if (this.f26364d) {
                        c11653a.m10666b(m10635h);
                    } else {
                        c11653a.m10664d(m10635h);
                    }
                    return;
                }
                this.f26368x = true;
                this.f26366f = true;
                z = false;
            }
            if (z) {
                a.r(th);
            } else {
                this.f26363c.mo334b(th);
            }
        }
    }

    /* renamed from: c */
    void m10613c() {
        C11653a<Object> c11653a;
        do {
            synchronized (this) {
                c11653a = this.f26367w;
                if (c11653a == null) {
                    this.f26366f = false;
                    return;
                }
                this.f26367w = null;
            }
        } while (!c11653a.m10667a((InterfaceC11695u<? super T>) this.f26363c));
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        if (EnumC11296c.m11147p(this.f26365e, cVar)) {
            this.f26365e = cVar;
            this.f26363c.mo332d(this);
        }
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        if (this.f26368x) {
            return;
        }
        if (t == null) {
            this.f26365e.i();
            mo334b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f26368x) {
                return;
            }
            if (this.f26366f) {
                C11653a<Object> c11653a = this.f26367w;
                if (c11653a == null) {
                    c11653a = new C11653a<>(4);
                    this.f26367w = c11653a;
                }
                EnumC11664j.m10630p(t);
                c11653a.m10666b(t);
                return;
            }
            this.f26366f = true;
            this.f26363c.mo331f(t);
            m10613c();
        }
    }

    /* renamed from: i */
    public void m10612i() {
        this.f26365e.i();
    }

    /* renamed from: j */
    public boolean m10611j() {
        return this.f26365e.j();
    }

    public C11674b(InterfaceC11695u<? super T> interfaceC11695u, boolean z) {
        this.f26363c = interfaceC11695u;
        this.f26364d = z;
    }
}
