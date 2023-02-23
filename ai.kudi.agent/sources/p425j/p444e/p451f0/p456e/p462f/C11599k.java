package p425j.p444e.p451f0.p456e.p462f;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: SingleSubscribeOn.java */
/* renamed from: j.e.f0.e.f.k */
/* loaded from: classes3.dex */
public final class C11599k<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26181c;

    /* renamed from: d */
    final v f26182d;

    /* compiled from: SingleSubscribeOn.java */
    /* renamed from: j.e.f0.e.f.k$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11600a<T> extends AtomicReference<c> implements InterfaceC11698y<T>, c, Runnable {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f26183c;

        /* renamed from: d */
        final C11300g f26184d = new C11300g();

        /* renamed from: e */
        final InterfaceC11270a0<? extends T> f26185e;

        RunnableC11600a(InterfaceC11698y<? super T> interfaceC11698y, InterfaceC11270a0<? extends T> interfaceC11270a0) {
            this.f26183c = interfaceC11698y;
            this.f26185e = interfaceC11270a0;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26183c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            this.f26183c.mo3151c(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        /* renamed from: i */
        public void m10793i() {
            EnumC11296c.m11156a(this);
            this.f26184d.m11128i();
        }

        /* renamed from: j */
        public boolean m10792j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f26185e.mo10446b(this);
        }
    }

    public C11599k(InterfaceC11270a0<? extends T> interfaceC11270a0, v vVar) {
        this.f26181c = interfaceC11270a0;
        this.f26182d = vVar;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        RunnableC11600a runnableC11600a = new RunnableC11600a(interfaceC11698y, this.f26181c);
        interfaceC11698y.mo3150d(runnableC11600a);
        runnableC11600a.f26184d.m11130a(this.f26182d.b(runnableC11600a));
    }
}
