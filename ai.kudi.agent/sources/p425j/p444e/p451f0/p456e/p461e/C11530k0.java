package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableSubscribeOn.java */
/* renamed from: j.e.f0.e.e.k0 */
/* loaded from: classes3.dex */
public final class C11530k0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final v f26005d;

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: j.e.f0.e.e.k0$a */
    /* loaded from: classes3.dex */
    static final class C11531a<T> extends AtomicReference<c> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26006c;

        /* renamed from: d */
        final AtomicReference<c> f26007d = new AtomicReference<>();

        C11531a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f26006c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f26006c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f26006c.mo334b(th);
        }

        /* renamed from: c */
        void m10878c(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this.f26007d, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            this.f26006c.mo331f(t);
        }

        /* renamed from: i */
        public void m10877i() {
            EnumC11296c.m11156a(this.f26007d);
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10876j() {
            return EnumC11296c.m11155b(get());
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* renamed from: j.e.f0.e.e.k0$b */
    /* loaded from: classes3.dex */
    final class RunnableC11532b implements Runnable {

        /* renamed from: c */
        private final C11531a<T> f26008c;

        RunnableC11532b(C11531a<T> c11531a) {
            this.f26008c = c11531a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11530k0.this.f25839c.mo10478e(this.f26008c);
        }
    }

    public C11530k0(InterfaceC11692s<T> interfaceC11692s, v vVar) {
        super(interfaceC11692s);
        this.f26005d = vVar;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11531a c11531a = new C11531a(interfaceC11695u);
        interfaceC11695u.mo332d(c11531a);
        c11531a.m10878c(this.f26005d.b(new RunnableC11532b(c11531a)));
    }
}
