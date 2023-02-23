package p425j.p444e.p451f0.p456e.p458b;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.p451f0.p454c.InterfaceC11314b;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableElementAtMaybe.java */
/* renamed from: j.e.f0.e.b.f */
/* loaded from: classes3.dex */
public final class C11381f<T> extends AbstractC11677k<T> implements InterfaceC11314b<T> {

    /* renamed from: c */
    final AbstractC11293f<T> f25571c;

    /* renamed from: d */
    final long f25572d;

    /* compiled from: FlowableElementAtMaybe.java */
    /* renamed from: j.e.f0.e.b.f$a */
    /* loaded from: classes3.dex */
    static final class C11382a<T> implements InterfaceC11676j<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25573c;

        /* renamed from: d */
        final long f25574d;

        /* renamed from: e */
        InterfaceC14457c f25575e;

        /* renamed from: f */
        long f25576f;

        /* renamed from: w */
        boolean f25577w;

        C11382a(InterfaceC11685m<? super T> interfaceC11685m, long j) {
            this.f25573c = interfaceC11685m;
            this.f25574d = j;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25575e = EnumC11652g.CANCELLED;
            if (this.f25577w) {
                return;
            }
            this.f25577w = true;
            this.f25573c.mo10551a();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25577w) {
                a.r(th);
                return;
            }
            this.f25577w = true;
            this.f25575e = EnumC11652g.CANCELLED;
            this.f25573c.mo10550b(th);
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25577w) {
                return;
            }
            long j = this.f25576f;
            if (j == this.f25574d) {
                this.f25577w = true;
                this.f25575e.cancel();
                this.f25575e = EnumC11652g.CANCELLED;
                this.f25573c.mo10549c(t);
                return;
            }
            this.f25576f = j + 1;
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25575e, interfaceC14457c)) {
                this.f25575e = interfaceC14457c;
                this.f25573c.mo10548d(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }

        /* renamed from: i */
        public void m11060i() {
            this.f25575e.cancel();
            this.f25575e = EnumC11652g.CANCELLED;
        }

        /* renamed from: j */
        public boolean m11059j() {
            return this.f25575e == EnumC11652g.CANCELLED;
        }
    }

    public C11381f(AbstractC11293f<T> abstractC11293f, long j) {
        this.f25571c = abstractC11293f;
        this.f25572d = j;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11314b
    /* renamed from: d */
    public AbstractC11293f<T> mo11061d() {
        return a.k(new C11379e(this.f25571c, this.f25572d, null, false));
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25571c.m11188K(new C11382a(interfaceC11685m, this.f25572d));
    }
}
