package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeIsEmpty.java */
/* renamed from: j.e.f0.e.c.k */
/* loaded from: classes3.dex */
public final class C11449k<T> extends AbstractC11432a<T, Boolean> {

    /* compiled from: MaybeIsEmpty.java */
    /* renamed from: j.e.f0.e.c.k$a */
    /* loaded from: classes3.dex */
    static final class C11450a<T> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super Boolean> f25773c;

        /* renamed from: d */
        c f25774d;

        C11450a(InterfaceC11685m<? super Boolean> interfaceC11685m) {
            this.f25773c = interfaceC11685m;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25773c.mo10549c(Boolean.TRUE);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25773c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25773c.mo10549c(Boolean.FALSE);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25774d, cVar)) {
                this.f25774d = cVar;
                this.f25773c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10988i() {
            this.f25774d.i();
        }

        /* renamed from: j */
        public boolean m10987j() {
            return this.f25774d.j();
        }
    }

    public C11449k(InterfaceC11687o<T> interfaceC11687o) {
        super(interfaceC11687o);
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super Boolean> interfaceC11685m) {
        this.f25744c.mo10546a(new C11450a(interfaceC11685m));
    }
}
