package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11690q;
import p425j.p444e.InterfaceC11691r;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11290d;
import p425j.p444e.p451f0.p452a.C11294a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableCreate.java */
/* renamed from: j.e.f0.e.e.f */
/* loaded from: classes3.dex */
public final class C11507f<T> extends AbstractC11688p<T> {

    /* renamed from: c */
    final InterfaceC11691r<T> f25941c;

    /* compiled from: ObservableCreate.java */
    /* renamed from: j.e.f0.e.e.f$a */
    /* loaded from: classes3.dex */
    static final class C11508a<T> extends AtomicReference<c> implements InterfaceC11690q<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25942c;

        C11508a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f25942c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: a */
        public void mo10905a() {
            if (m10901j()) {
                return;
            }
            try {
                this.f25942c.mo335a();
            } finally {
                m10902i();
            }
        }

        @Override // p425j.p444e.InterfaceC11690q
        /* renamed from: b */
        public boolean mo10481b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (m10901j()) {
                return false;
            }
            try {
                this.f25942c.mo334b(th);
                m10902i();
                return true;
            } catch (Throwable th2) {
                m10902i();
                throw th2;
            }
        }

        @Override // p425j.p444e.InterfaceC11690q
        /* renamed from: c */
        public void mo10480c(c cVar) {
            EnumC11296c.m11152h(this, cVar);
        }

        @Override // p425j.p444e.InterfaceC11690q
        /* renamed from: d */
        public void mo10479d(InterfaceC11290d interfaceC11290d) {
            mo10480c(new C11294a(interfaceC11290d));
        }

        /* renamed from: e */
        public void m10904e(Throwable th) {
            if (mo10481b(th)) {
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.InterfaceC11286e
        /* renamed from: f */
        public void mo10903f(T t) {
            if (t == null) {
                m10904e(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (m10901j()) {
            } else {
                this.f25942c.mo331f(t);
            }
        }

        /* renamed from: i */
        public void m10902i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10901j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C11508a.class.getSimpleName(), super.toString());
        }
    }

    public C11507f(InterfaceC11691r<T> interfaceC11691r) {
        this.f25941c = interfaceC11691r;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11508a c11508a = new C11508a(interfaceC11695u);
        interfaceC11695u.mo332d(c11508a);
        try {
            this.f25941c.mo3155a(c11508a);
        } catch (Throwable th) {
            C11118a.m11646b(th);
            c11508a.m10904e(th);
        }
    }
}
