package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableAny.java */
/* renamed from: j.e.f0.e.e.b */
/* loaded from: classes3.dex */
public final class C11486b<T> extends AbstractC11483a<T, Boolean> {

    /* renamed from: d */
    final InterfaceC11292g<? super T> f25854d;

    /* compiled from: ObservableAny.java */
    /* renamed from: j.e.f0.e.e.b$a */
    /* loaded from: classes3.dex */
    static final class C11487a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super Boolean> f25855c;

        /* renamed from: d */
        final InterfaceC11292g<? super T> f25856d;

        /* renamed from: e */
        c f25857e;

        /* renamed from: f */
        boolean f25858f;

        C11487a(InterfaceC11695u<? super Boolean> interfaceC11695u, InterfaceC11292g<? super T> interfaceC11292g) {
            this.f25855c = interfaceC11695u;
            this.f25856d = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f25858f) {
                return;
            }
            this.f25858f = true;
            this.f25855c.mo331f(Boolean.FALSE);
            this.f25855c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f25858f) {
                a.r(th);
                return;
            }
            this.f25858f = true;
            this.f25855c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25857e, cVar)) {
                this.f25857e = cVar;
                this.f25855c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f25858f) {
                return;
            }
            try {
                if (this.f25856d.mo10557c(t)) {
                    this.f25858f = true;
                    this.f25857e.i();
                    this.f25855c.mo331f(Boolean.TRUE);
                    this.f25855c.mo335a();
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25857e.i();
                mo334b(th);
            }
        }

        /* renamed from: i */
        public void m10949i() {
            this.f25857e.i();
        }

        /* renamed from: j */
        public boolean m10948j() {
            return this.f25857e.j();
        }
    }

    public C11486b(InterfaceC11692s<T> interfaceC11692s, InterfaceC11292g<? super T> interfaceC11292g) {
        super(interfaceC11692s);
        this.f25854d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super Boolean> interfaceC11695u) {
        this.f25839c.mo10478e(new C11487a(interfaceC11695u, this.f25854d));
    }
}
