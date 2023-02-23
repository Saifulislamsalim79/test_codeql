package p425j.p444e.p451f0.p456e.p462f;

import j.e.c0.c;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p466i.C11648c;
import p577n.p586b.InterfaceC14456b;
/* compiled from: SingleToFlowable.java */
/* renamed from: j.e.f0.e.f.l */
/* loaded from: classes3.dex */
public final class C11601l<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    final InterfaceC11270a0<? extends T> f26186d;

    /* compiled from: SingleToFlowable.java */
    /* renamed from: j.e.f0.e.f.l$a */
    /* loaded from: classes3.dex */
    static final class C11602a<T> extends C11648c<T> implements InterfaceC11698y<T> {

        /* renamed from: e */
        c f26187e;

        C11602a(InterfaceC14456b<? super T> interfaceC14456b) {
            super(interfaceC14456b);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26325c.mo1689b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            m10684i(t);
        }

        @Override // p425j.p444e.p451f0.p466i.C11648c, p577n.p586b.InterfaceC14457c
        public void cancel() {
            super.cancel();
            this.f26187e.i();
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11147p(this.f26187e, cVar)) {
                this.f26187e = cVar;
                this.f26325c.mo1687g(this);
            }
        }
    }

    public C11601l(InterfaceC11270a0<? extends T> interfaceC11270a0) {
        this.f26186d = interfaceC11270a0;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f26186d.mo10446b(new C11602a(interfaceC14456b));
    }
}
