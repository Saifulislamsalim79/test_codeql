package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeFilterSingle.java */
/* renamed from: j.e.f0.e.c.f */
/* loaded from: classes3.dex */
public final class C11439f<T> extends AbstractC11677k<T> {

    /* renamed from: c */
    final InterfaceC11270a0<T> f25755c;

    /* renamed from: d */
    final InterfaceC11292g<? super T> f25756d;

    /* compiled from: MaybeFilterSingle.java */
    /* renamed from: j.e.f0.e.c.f$a */
    /* loaded from: classes3.dex */
    static final class C11440a<T> implements InterfaceC11698y<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25757c;

        /* renamed from: d */
        final InterfaceC11292g<? super T> f25758d;

        /* renamed from: e */
        c f25759e;

        C11440a(InterfaceC11685m<? super T> interfaceC11685m, InterfaceC11292g<? super T> interfaceC11292g) {
            this.f25757c = interfaceC11685m;
            this.f25758d = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f25757c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            try {
                if (this.f25758d.mo10557c(t)) {
                    this.f25757c.mo10549c(t);
                } else {
                    this.f25757c.mo10551a();
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25757c.mo10550b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11147p(this.f25759e, cVar)) {
                this.f25759e = cVar;
                this.f25757c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10996i() {
            c cVar = this.f25759e;
            this.f25759e = EnumC11296c.DISPOSED;
            cVar.i();
        }

        /* renamed from: j */
        public boolean m10995j() {
            return this.f25759e.j();
        }
    }

    public C11439f(InterfaceC11270a0<T> interfaceC11270a0, InterfaceC11292g<? super T> interfaceC11292g) {
        this.f25755c = interfaceC11270a0;
        this.f25756d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25755c.mo10446b(new C11440a(interfaceC11685m, this.f25756d));
    }
}
