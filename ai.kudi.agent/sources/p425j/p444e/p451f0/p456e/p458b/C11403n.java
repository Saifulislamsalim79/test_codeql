package p425j.p444e.p451f0.p456e.p458b;

import j.e.c0.c;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11695u;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableFromObservable.java */
/* renamed from: j.e.f0.e.b.n */
/* loaded from: classes3.dex */
public final class C11403n<T> extends AbstractC11293f<T> {

    /* renamed from: d */
    private final AbstractC11688p<T> f25655d;

    /* compiled from: FlowableFromObservable.java */
    /* renamed from: j.e.f0.e.b.n$a */
    /* loaded from: classes3.dex */
    static final class C11404a<T> implements InterfaceC11695u<T>, InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25656c;

        /* renamed from: d */
        c f25657d;

        C11404a(InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25656c = interfaceC14456b;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25656c.mo1690a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25656c.mo1689b(th);
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            this.f25657d.i();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            this.f25657d = cVar;
            this.f25656c.mo1687g(this);
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25656c.mo1688f(t);
        }
    }

    public C11403n(AbstractC11688p<T> abstractC11688p) {
        this.f25655d = abstractC11688p;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25655d.mo10478e(new C11404a(interfaceC14456b));
    }
}
