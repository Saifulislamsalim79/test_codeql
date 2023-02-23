package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeFilter.java */
/* renamed from: j.e.f0.e.c.e */
/* loaded from: classes3.dex */
public final class C11437e<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final InterfaceC11292g<? super T> f25751d;

    /* compiled from: MaybeFilter.java */
    /* renamed from: j.e.f0.e.c.e$a */
    /* loaded from: classes3.dex */
    static final class C11438a<T> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25752c;

        /* renamed from: d */
        final InterfaceC11292g<? super T> f25753d;

        /* renamed from: e */
        c f25754e;

        C11438a(InterfaceC11685m<? super T> interfaceC11685m, InterfaceC11292g<? super T> interfaceC11292g) {
            this.f25752c = interfaceC11685m;
            this.f25753d = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25752c.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25752c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            try {
                if (this.f25753d.mo10557c(t)) {
                    this.f25752c.mo10549c(t);
                } else {
                    this.f25752c.mo10551a();
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25752c.mo10550b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25754e, cVar)) {
                this.f25754e = cVar;
                this.f25752c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10998i() {
            c cVar = this.f25754e;
            this.f25754e = EnumC11296c.DISPOSED;
            cVar.i();
        }

        /* renamed from: j */
        public boolean m10997j() {
            return this.f25754e.j();
        }
    }

    public C11437e(InterfaceC11687o<T> interfaceC11687o, InterfaceC11292g<? super T> interfaceC11292g) {
        super(interfaceC11687o);
        this.f25751d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25744c.mo10546a(new C11438a(interfaceC11685m, this.f25751d));
    }
}
