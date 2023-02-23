package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableOnErrorReturn.java */
/* renamed from: j.e.f0.e.e.b0 */
/* loaded from: classes3.dex */
public final class C11488b0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11291f<? super Throwable, ? extends T> f25859d;

    /* compiled from: ObservableOnErrorReturn.java */
    /* renamed from: j.e.f0.e.e.b0$a */
    /* loaded from: classes3.dex */
    static final class C11489a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25860c;

        /* renamed from: d */
        final InterfaceC11291f<? super Throwable, ? extends T> f25861d;

        /* renamed from: e */
        c f25862e;

        C11489a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11291f<? super Throwable, ? extends T> interfaceC11291f) {
            this.f25860c = interfaceC11695u;
            this.f25861d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25860c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            try {
                T mo10663a = this.f25861d.mo10663a(th);
                if (mo10663a == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f25860c.mo334b(nullPointerException);
                    return;
                }
                this.f25860c.mo331f(mo10663a);
                this.f25860c.mo335a();
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25860c.mo334b(new CompositeException(th, th2));
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f25862e, cVar)) {
                this.f25862e = cVar;
                this.f25860c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f25860c.mo331f(t);
        }

        /* renamed from: i */
        public void m10947i() {
            this.f25862e.i();
        }

        /* renamed from: j */
        public boolean m10946j() {
            return this.f25862e.j();
        }
    }

    public C11488b0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super Throwable, ? extends T> interfaceC11291f) {
        super(interfaceC11692s);
        this.f25859d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11489a(interfaceC11695u, this.f25859d));
    }
}
