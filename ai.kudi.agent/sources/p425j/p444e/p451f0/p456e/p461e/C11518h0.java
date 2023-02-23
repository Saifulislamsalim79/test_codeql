package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableSingleMaybe.java */
/* renamed from: j.e.f0.e.e.h0 */
/* loaded from: classes3.dex */
public final class C11518h0<T> extends AbstractC11677k<T> {

    /* renamed from: c */
    final InterfaceC11692s<T> f25970c;

    /* compiled from: ObservableSingleMaybe.java */
    /* renamed from: j.e.f0.e.e.h0$a */
    /* loaded from: classes3.dex */
    static final class C11519a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25971c;

        /* renamed from: d */
        c f25972d;

        /* renamed from: e */
        T f25973e;

        /* renamed from: f */
        boolean f25974f;

        C11519a(InterfaceC11685m<? super T> interfaceC11685m) {
            this.f25971c = interfaceC11685m;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25974f) {
                return;
            }
            this.f25974f = true;
            T t = this.f25973e;
            this.f25973e = null;
            if (t == null) {
                this.f25971c.mo10551a();
            } else {
                this.f25971c.mo10549c(t);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25974f) {
                a.r(th);
                return;
            }
            this.f25974f = true;
            this.f25971c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25972d, cVar)) {
                this.f25972d = cVar;
                this.f25971c.mo10548d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25974f) {
                return;
            }
            if (this.f25973e != null) {
                this.f25974f = true;
                this.f25972d.i();
                this.f25971c.mo10550b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f25973e = t;
        }

        /* renamed from: i */
        public void m10889i() {
            this.f25972d.i();
        }

        /* renamed from: j */
        public boolean m10888j() {
            return this.f25972d.j();
        }
    }

    public C11518h0(InterfaceC11692s<T> interfaceC11692s) {
        this.f25970c = interfaceC11692s;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    public void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25970c.mo10478e(new C11519a(interfaceC11685m));
    }
}
