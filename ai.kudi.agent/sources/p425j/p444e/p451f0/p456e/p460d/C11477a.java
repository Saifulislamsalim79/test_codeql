package p425j.p444e.p451f0.p456e.p460d;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: CompletableAndThenObservable.java */
/* renamed from: j.e.f0.e.d.a */
/* loaded from: classes3.dex */
public final class C11477a<R> extends AbstractC11688p<R> {

    /* renamed from: c */
    final InterfaceC11284d f25827c;

    /* renamed from: d */
    final InterfaceC11692s<? extends R> f25828d;

    /* compiled from: CompletableAndThenObservable.java */
    /* renamed from: j.e.f0.e.d.a$a */
    /* loaded from: classes3.dex */
    static final class C11478a<R> extends AtomicReference<c> implements InterfaceC11695u<R>, InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11695u<? super R> f25829c;

        /* renamed from: d */
        InterfaceC11692s<? extends R> f25830d;

        C11478a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11692s<? extends R> interfaceC11692s) {
            this.f25830d = interfaceC11692s;
            this.f25829c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            InterfaceC11692s<? extends R> interfaceC11692s = this.f25830d;
            if (interfaceC11692s == null) {
                this.f25829c.mo335a();
                return;
            }
            this.f25830d = null;
            interfaceC11692s.mo10478e(this);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25829c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11154e(this, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(R r) {
            this.f25829c.mo331f(r);
        }

        /* renamed from: i */
        public void m10961i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10960j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11477a(InterfaceC11284d interfaceC11284d, InterfaceC11692s<? extends R> interfaceC11692s) {
        this.f25827c = interfaceC11284d;
        this.f25828d = interfaceC11692s;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        C11478a c11478a = new C11478a(interfaceC11695u, this.f25828d);
        interfaceC11695u.mo332d(c11478a);
        this.f25827c.mo11202b(c11478a);
    }
}
