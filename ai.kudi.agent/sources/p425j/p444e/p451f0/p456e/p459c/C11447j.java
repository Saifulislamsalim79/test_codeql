package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeFromCompletable.java */
/* renamed from: j.e.f0.e.c.j */
/* loaded from: classes3.dex */
public final class C11447j<T> extends AbstractC11677k<T> {

    /* renamed from: c */
    final InterfaceC11284d f25770c;

    /* compiled from: MaybeFromCompletable.java */
    /* renamed from: j.e.f0.e.c.j$a */
    /* loaded from: classes3.dex */
    static final class C11448a<T> implements InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25771c;

        /* renamed from: d */
        c f25772d;

        C11448a(InterfaceC11685m<? super T> interfaceC11685m) {
            this.f25771c = interfaceC11685m;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25772d = EnumC11296c.DISPOSED;
            this.f25771c.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            this.f25772d = EnumC11296c.DISPOSED;
            this.f25771c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            if (EnumC11296c.m11147p(this.f25772d, cVar)) {
                this.f25772d = cVar;
                this.f25771c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10990i() {
            this.f25772d.i();
            this.f25772d = EnumC11296c.DISPOSED;
        }

        /* renamed from: j */
        public boolean m10989j() {
            return this.f25772d.j();
        }
    }

    public C11447j(InterfaceC11284d interfaceC11284d) {
        this.f25770c = interfaceC11284d;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25770c.mo11202b(new C11448a(interfaceC11685m));
    }
}
