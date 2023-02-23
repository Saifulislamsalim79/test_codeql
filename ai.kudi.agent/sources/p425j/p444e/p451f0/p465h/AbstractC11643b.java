package p425j.p444e.p451f0.p465h;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: BasicFuseableSubscriber.java */
/* renamed from: j.e.f0.h.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11643b<T, R> implements InterfaceC11676j<T>, InterfaceC11319g<R> {

    /* renamed from: c */
    protected final InterfaceC14456b<? super R> f26310c;

    /* renamed from: d */
    protected InterfaceC14457c f26311d;

    /* renamed from: e */
    protected InterfaceC11319g<T> f26312e;

    /* renamed from: f */
    protected boolean f26313f;

    /* renamed from: w */
    protected int f26314w;

    public AbstractC11643b(InterfaceC14456b<? super R> interfaceC14456b) {
        this.f26310c = interfaceC14456b;
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: a */
    public void mo1690a() {
        if (this.f26313f) {
            return;
        }
        this.f26313f = true;
        this.f26310c.mo1690a();
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: b */
    public void mo1689b(Throwable th) {
        if (this.f26313f) {
            a.r(th);
            return;
        }
        this.f26313f = true;
        this.f26310c.mo1689b(th);
    }

    /* renamed from: c */
    protected void m10690c() {
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        this.f26311d.cancel();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        this.f26312e.clear();
    }

    /* renamed from: d */
    protected boolean m10689d() {
        return true;
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        this.f26311d.mo1686e(j);
    }

    @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
    /* renamed from: g */
    public final void mo1687g(InterfaceC14457c interfaceC14457c) {
        if (EnumC11652g.m10668n(this.f26311d, interfaceC14457c)) {
            this.f26311d = interfaceC14457c;
            if (interfaceC14457c instanceof InterfaceC11319g) {
                this.f26312e = (InterfaceC11319g) interfaceC14457c;
            }
            if (m10689d()) {
                this.f26310c.mo1687g(this);
                m10690c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m10688i(Throwable th) {
        C11118a.m11646b(th);
        this.f26311d.cancel();
        mo1689b(th);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return this.f26312e.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int m10687j(int i) {
        InterfaceC11319g<T> interfaceC11319g = this.f26312e;
        if (interfaceC11319g == null || (i & 4) != 0) {
            return 0;
        }
        int mo10681m = interfaceC11319g.mo10681m(i);
        if (mo10681m != 0) {
            this.f26314w = mo10681m;
        }
        return mo10681m;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
