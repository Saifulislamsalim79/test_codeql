package p425j.p444e.p451f0.p455d;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p467j.C11669m;
/* compiled from: InnerQueuedObserver.java */
/* renamed from: j.e.f0.d.g */
/* loaded from: classes3.dex */
public final class C11329g<T> extends AtomicReference<c> implements InterfaceC11695u<T>, c {

    /* renamed from: c */
    final InterfaceC11330h<T> f25448c;

    /* renamed from: d */
    final int f25449d;

    /* renamed from: e */
    InterfaceC11322j<T> f25450e;

    /* renamed from: f */
    volatile boolean f25451f;

    /* renamed from: w */
    int f25452w;

    public C11329g(InterfaceC11330h<T> interfaceC11330h, int i) {
        this.f25448c = interfaceC11330h;
        this.f25449d = i;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        this.f25448c.mo10918e(this);
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        this.f25448c.mo10919c(this, th);
    }

    /* renamed from: c */
    public boolean m11096c() {
        return this.f25451f;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public void mo332d(c cVar) {
        if (EnumC11296c.m11149m(this, cVar)) {
            if (cVar instanceof InterfaceC11317e) {
                InterfaceC11317e interfaceC11317e = (InterfaceC11317e) cVar;
                int mo10681m = interfaceC11317e.mo10681m(3);
                if (mo10681m == 1) {
                    this.f25452w = mo10681m;
                    this.f25450e = interfaceC11317e;
                    this.f25451f = true;
                    this.f25448c.mo10918e(this);
                    return;
                } else if (mo10681m == 2) {
                    this.f25452w = mo10681m;
                    this.f25450e = interfaceC11317e;
                    return;
                }
            }
            this.f25450e = C11669m.m10622a(-this.f25449d);
        }
    }

    /* renamed from: e */
    public InterfaceC11322j<T> m11095e() {
        return this.f25450e;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: f */
    public void mo331f(T t) {
        if (this.f25452w == 0) {
            this.f25448c.mo10916h(this, t);
        } else {
            this.f25448c.mo10917g();
        }
    }

    /* renamed from: g */
    public void m11094g() {
        this.f25451f = true;
    }

    /* renamed from: i */
    public void m11093i() {
        EnumC11296c.m11156a(this);
    }

    /* renamed from: j */
    public boolean m11092j() {
        return EnumC11296c.m11155b(get());
    }
}
