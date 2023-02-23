package p425j.p444e.p451f0.p455d;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p454c.InterfaceC11317e;
/* compiled from: BasicFuseableObserver.java */
/* renamed from: j.e.f0.d.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11323a<T, R> implements InterfaceC11695u<T>, InterfaceC11317e<R> {

    /* renamed from: c */
    protected final InterfaceC11695u<? super R> f25439c;

    /* renamed from: d */
    protected c f25440d;

    /* renamed from: e */
    protected InterfaceC11317e<T> f25441e;

    /* renamed from: f */
    protected boolean f25442f;

    /* renamed from: w */
    protected int f25443w;

    public AbstractC11323a(InterfaceC11695u<? super R> interfaceC11695u) {
        this.f25439c = interfaceC11695u;
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: a */
    public void mo335a() {
        if (this.f25442f) {
            return;
        }
        this.f25442f = true;
        this.f25439c.mo335a();
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: b */
    public void mo334b(Throwable th) {
        if (this.f25442f) {
            a.r(th);
            return;
        }
        this.f25442f = true;
        this.f25439c.mo334b(th);
    }

    /* renamed from: c */
    protected void m11110c() {
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        this.f25441e.clear();
    }

    @Override // p425j.p444e.InterfaceC11695u
    /* renamed from: d */
    public final void mo332d(c cVar) {
        if (EnumC11296c.m11147p(this.f25440d, cVar)) {
            this.f25440d = cVar;
            if (cVar instanceof InterfaceC11317e) {
                this.f25441e = (InterfaceC11317e) cVar;
            }
            if (m11109e()) {
                this.f25439c.mo332d(this);
                m11110c();
            }
        }
    }

    /* renamed from: e */
    protected boolean m11109e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m11108g(Throwable th) {
        C11118a.m11646b(th);
        this.f25440d.i();
        mo334b(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int m11107h(int i) {
        InterfaceC11317e<T> interfaceC11317e = this.f25441e;
        if (interfaceC11317e == null || (i & 4) != 0) {
            return 0;
        }
        int mo10681m = interfaceC11317e.mo10681m(i);
        if (mo10681m != 0) {
            this.f25443w = mo10681m;
        }
        return mo10681m;
    }

    /* renamed from: i */
    public void m11106i() {
        this.f25440d.i();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return this.f25441e.isEmpty();
    }

    /* renamed from: j */
    public boolean m11105j() {
        return this.f25440d.j();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
