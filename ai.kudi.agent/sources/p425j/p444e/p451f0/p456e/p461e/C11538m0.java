package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
/* compiled from: ObservableTake.java */
/* renamed from: j.e.f0.e.e.m0 */
/* loaded from: classes3.dex */
public final class C11538m0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final long f26018d;

    /* compiled from: ObservableTake.java */
    /* renamed from: j.e.f0.e.e.m0$a */
    /* loaded from: classes3.dex */
    static final class C11539a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26019c;

        /* renamed from: d */
        boolean f26020d;

        /* renamed from: e */
        c f26021e;

        /* renamed from: f */
        long f26022f;

        C11539a(InterfaceC11695u<? super T> interfaceC11695u, long j) {
            this.f26019c = interfaceC11695u;
            this.f26022f = j;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f26020d) {
                return;
            }
            this.f26020d = true;
            this.f26021e.i();
            this.f26019c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26020d) {
                a.r(th);
                return;
            }
            this.f26020d = true;
            this.f26021e.i();
            this.f26019c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26021e, cVar)) {
                this.f26021e = cVar;
                if (this.f26022f == 0) {
                    this.f26020d = true;
                    cVar.i();
                    EnumC11297d.m11144e(this.f26019c);
                    return;
                }
                this.f26019c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f26020d) {
                return;
            }
            long j = this.f26022f;
            long j2 = j - 1;
            this.f26022f = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.f26019c.mo331f(t);
                if (z) {
                    mo335a();
                }
            }
        }

        /* renamed from: i */
        public void m10875i() {
            this.f26021e.i();
        }

        /* renamed from: j */
        public boolean m10874j() {
            return this.f26021e.j();
        }
    }

    public C11538m0(InterfaceC11692s<T> interfaceC11692s, long j) {
        super(interfaceC11692s);
        this.f26018d = j;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11539a(interfaceC11695u, this.f26018d));
    }
}
