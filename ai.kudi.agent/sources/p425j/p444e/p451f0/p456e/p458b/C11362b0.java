package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.Collection;
import java.util.concurrent.Callable;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11314b;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.EnumC11655b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableToListSingle.java */
/* renamed from: j.e.f0.e.b.b0 */
/* loaded from: classes3.dex */
public final class C11362b0<T, U extends Collection<? super T>> extends AbstractC11696w<U> implements InterfaceC11314b<U> {

    /* renamed from: c */
    final AbstractC11293f<T> f25527c;

    /* renamed from: d */
    final Callable<U> f25528d;

    /* compiled from: FlowableToListSingle.java */
    /* renamed from: j.e.f0.e.b.b0$a */
    /* loaded from: classes3.dex */
    static final class C11363a<T, U extends Collection<? super T>> implements InterfaceC11676j<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super U> f25529c;

        /* renamed from: d */
        InterfaceC14457c f25530d;

        /* renamed from: e */
        U f25531e;

        C11363a(InterfaceC11698y<? super U> interfaceC11698y, U u) {
            this.f25529c = interfaceC11698y;
            this.f25531e = u;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25530d = EnumC11652g.CANCELLED;
            this.f25529c.mo3151c(this.f25531e);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f25531e = null;
            this.f25530d = EnumC11652g.CANCELLED;
            this.f25529c.mo3152b(th);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            this.f25531e.add(t);
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25530d, interfaceC14457c)) {
                this.f25530d = interfaceC14457c;
                this.f25529c.mo3150d(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }

        /* renamed from: i */
        public void m11072i() {
            this.f25530d.cancel();
            this.f25530d = EnumC11652g.CANCELLED;
        }

        /* renamed from: j */
        public boolean m11071j() {
            return this.f25530d == EnumC11652g.CANCELLED;
        }
    }

    public C11362b0(AbstractC11293f<T> abstractC11293f) {
        this(abstractC11293f, EnumC11655b.m10661e());
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11314b
    /* renamed from: d */
    public AbstractC11293f<U> mo11061d() {
        return a.k(new C11352a0(this.f25527c, this.f25528d));
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super U> interfaceC11698y) {
        try {
            U call = this.f25528d.call();
            C11312b.m11113d(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f25527c.m11188K(new C11363a(interfaceC11698y, call));
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11297d.m11138p(th, interfaceC11698y);
        }
    }

    public C11362b0(AbstractC11293f<T> abstractC11293f, Callable<U> callable) {
        this.f25527c = abstractC11293f;
        this.f25528d = callable;
    }
}
