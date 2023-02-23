package p425j.p444e.p451f0.p456e.p457a;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: CompletableSubscribeOn.java */
/* renamed from: j.e.f0.e.a.k */
/* loaded from: classes3.dex */
public final class C11349k extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25494c;

    /* renamed from: d */
    final v f25495d;

    /* compiled from: CompletableSubscribeOn.java */
    /* renamed from: j.e.f0.e.a.k$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11350a extends AtomicReference<c> implements InterfaceC11278c, c, Runnable {

        /* renamed from: c */
        final InterfaceC11278c f25496c;

        /* renamed from: d */
        final C11300g f25497d = new C11300g();

        /* renamed from: e */
        final InterfaceC11284d f25498e;

        RunnableC11350a(InterfaceC11278c interfaceC11278c, InterfaceC11284d interfaceC11284d) {
            this.f25496c = interfaceC11278c;
            this.f25498e = interfaceC11284d;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            this.f25496c.mo10845a();
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            this.f25496c.mo10844b(th);
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        /* renamed from: i */
        public void m11080i() {
            EnumC11296c.m11156a(this);
            this.f25497d.m11128i();
        }

        /* renamed from: j */
        public boolean m11079j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25498e.mo11202b(this);
        }
    }

    public C11349k(InterfaceC11284d interfaceC11284d, v vVar) {
        this.f25494c = interfaceC11284d;
        this.f25495d = vVar;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        RunnableC11350a runnableC11350a = new RunnableC11350a(interfaceC11278c, this.f25494c);
        interfaceC11278c.mo10616d(runnableC11350a);
        runnableC11350a.f25497d.m11130a(this.f25495d.b(runnableC11350a));
    }
}
