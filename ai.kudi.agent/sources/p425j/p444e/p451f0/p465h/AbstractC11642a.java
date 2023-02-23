package p425j.p444e.p451f0.p465h;

import io.reactivex.exceptions.C11118a;
import j.e.i0.a;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14457c;
/* compiled from: BasicFuseableConditionalSubscriber.java */
/* renamed from: j.e.f0.h.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11642a<T, R> implements InterfaceC11313a<T>, InterfaceC11319g<R> {

    /* renamed from: c */
    protected final InterfaceC11313a<? super R> f26305c;

    /* renamed from: d */
    protected InterfaceC14457c f26306d;

    /* renamed from: e */
    protected InterfaceC11319g<T> f26307e;

    /* renamed from: f */
    protected boolean f26308f;

    /* renamed from: w */
    protected int f26309w;

    public AbstractC11642a(InterfaceC11313a<? super R> interfaceC11313a) {
        this.f26305c = interfaceC11313a;
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: a */
    public void mo1690a() {
        if (this.f26308f) {
            return;
        }
        this.f26308f = true;
        this.f26305c.mo1690a();
    }

    @Override // p577n.p586b.InterfaceC14456b
    /* renamed from: b */
    public void mo1689b(Throwable th) {
        if (this.f26308f) {
            a.r(th);
            return;
        }
        this.f26308f = true;
        this.f26305c.mo1689b(th);
    }

    /* renamed from: c */
    protected void m10694c() {
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        this.f26306d.cancel();
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public void clear() {
        this.f26307e.clear();
    }

    /* renamed from: d */
    protected boolean m10693d() {
        return true;
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public void mo1686e(long j) {
        this.f26306d.mo1686e(j);
    }

    @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
    /* renamed from: g */
    public final void mo1687g(InterfaceC14457c interfaceC14457c) {
        if (EnumC11652g.m10668n(this.f26306d, interfaceC14457c)) {
            this.f26306d = interfaceC14457c;
            if (interfaceC14457c instanceof InterfaceC11319g) {
                this.f26307e = (InterfaceC11319g) interfaceC14457c;
            }
            if (m10693d()) {
                this.f26305c.mo1687g(this);
                m10694c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m10692i(Throwable th) {
        C11118a.m11646b(th);
        this.f26306d.cancel();
        mo1689b(th);
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public boolean isEmpty() {
        return this.f26307e.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int m10691j(int i) {
        InterfaceC11319g<T> interfaceC11319g = this.f26307e;
        if (interfaceC11319g == null || (i & 4) != 0) {
            return 0;
        }
        int mo10681m = interfaceC11319g.mo10681m(i);
        if (mo10681m != 0) {
            this.f26309w = mo10681m;
        }
        return mo10681m;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
