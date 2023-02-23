package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeIsEmptySingle.java */
/* renamed from: j.e.f0.e.c.l */
/* loaded from: classes3.dex */
public final class C11451l<T> extends AbstractC11696w<Boolean> implements Object<T> {

    /* renamed from: c */
    final InterfaceC11687o<T> f25775c;

    /* compiled from: MaybeIsEmptySingle.java */
    /* renamed from: j.e.f0.e.c.l$a */
    /* loaded from: classes3.dex */
    static final class C11452a<T> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super Boolean> f25776c;

        /* renamed from: d */
        c f25777d;

        C11452a(InterfaceC11698y<? super Boolean> interfaceC11698y) {
            this.f25776c = interfaceC11698y;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25777d = EnumC11296c.DISPOSED;
            this.f25776c.mo3151c(Boolean.TRUE);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25777d = EnumC11296c.DISPOSED;
            this.f25776c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25777d = EnumC11296c.DISPOSED;
            this.f25776c.mo3151c(Boolean.FALSE);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25777d, cVar)) {
                this.f25777d = cVar;
                this.f25776c.mo3150d(this);
            }
        }

        /* renamed from: i */
        public void m10985i() {
            this.f25777d.i();
            this.f25777d = EnumC11296c.DISPOSED;
        }

        /* renamed from: j */
        public boolean m10984j() {
            return this.f25777d.j();
        }
    }

    public C11451l(InterfaceC11687o<T> interfaceC11687o) {
        this.f25775c = interfaceC11687o;
    }

    /* renamed from: c */
    public AbstractC11677k<Boolean> m10986c() {
        return a.l(new C11449k(this.f25775c));
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super Boolean> interfaceC11698y) {
        this.f25775c.mo10546a(new C11452a(interfaceC11698y));
    }
}
