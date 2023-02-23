package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableTakeUntilPredicate.java */
/* renamed from: j.e.f0.e.e.o0 */
/* loaded from: classes3.dex */
public final class C11549o0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11292g<? super T> f26066d;

    /* compiled from: ObservableTakeUntilPredicate.java */
    /* renamed from: j.e.f0.e.e.o0$a */
    /* loaded from: classes3.dex */
    static final class C11550a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26067c;

        /* renamed from: d */
        final InterfaceC11292g<? super T> f26068d;

        /* renamed from: e */
        c f26069e;

        /* renamed from: f */
        boolean f26070f;

        C11550a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11292g<? super T> interfaceC11292g) {
            this.f26067c = interfaceC11695u;
            this.f26068d = interfaceC11292g;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f26070f) {
                return;
            }
            this.f26070f = true;
            this.f26067c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (!this.f26070f) {
                this.f26070f = true;
                this.f26067c.mo334b(th);
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26069e, cVar)) {
                this.f26069e = cVar;
                this.f26067c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f26070f) {
                return;
            }
            this.f26067c.mo331f(t);
            try {
                if (this.f26068d.mo10557c(t)) {
                    this.f26070f = true;
                    this.f26069e.i();
                    this.f26067c.mo335a();
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26069e.i();
                mo334b(th);
            }
        }

        /* renamed from: i */
        public void m10851i() {
            this.f26069e.i();
        }

        /* renamed from: j */
        public boolean m10850j() {
            return this.f26069e.j();
        }
    }

    public C11549o0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11292g<? super T> interfaceC11292g) {
        super(interfaceC11692s);
        this.f26066d = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11550a(interfaceC11695u, this.f26066d));
    }
}
