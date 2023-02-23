package p425j.p444e.p451f0.p456e.p457a;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: CompletableObserveOn.java */
/* renamed from: j.e.f0.e.a.g */
/* loaded from: classes3.dex */
public final class C11341g extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25470c;

    /* renamed from: d */
    final v f25471d;

    /* compiled from: CompletableObserveOn.java */
    /* renamed from: j.e.f0.e.a.g$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11342a extends AtomicReference<c> implements InterfaceC11278c, c, Runnable {

        /* renamed from: c */
        final InterfaceC11278c f25472c;

        /* renamed from: d */
        final v f25473d;

        /* renamed from: e */
        Throwable f25474e;

        RunnableC11342a(InterfaceC11278c interfaceC11278c, v vVar) {
            this.f25472c = interfaceC11278c;
            this.f25473d = vVar;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            EnumC11296c.m11154e(this, this.f25473d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            this.f25474e = th;
            EnumC11296c.m11154e(this, this.f25473d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f25472c.mo10616d(this);
            }
        }

        /* renamed from: i */
        public void m11087i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m11086j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f25474e;
            if (th != null) {
                this.f25474e = null;
                this.f25472c.mo10844b(th);
                return;
            }
            this.f25472c.mo10845a();
        }
    }

    public C11341g(InterfaceC11284d interfaceC11284d, v vVar) {
        this.f25470c = interfaceC11284d;
        this.f25471d = vVar;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f25470c.mo11202b(new RunnableC11342a(interfaceC11278c, this.f25471d));
    }
}
