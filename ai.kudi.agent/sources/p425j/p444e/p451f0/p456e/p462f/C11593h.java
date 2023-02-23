package p425j.p444e.p451f0.p456e.p462f;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: SingleObserveOn.java */
/* renamed from: j.e.f0.e.f.h */
/* loaded from: classes3.dex */
public final class C11593h<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<T> f26166c;

    /* renamed from: d */
    final v f26167d;

    /* compiled from: SingleObserveOn.java */
    /* renamed from: j.e.f0.e.f.h$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11594a<T> extends AtomicReference<c> implements InterfaceC11698y<T>, c, Runnable {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f26168c;

        /* renamed from: d */
        final v f26169d;

        /* renamed from: e */
        T f26170e;

        /* renamed from: f */
        Throwable f26171f;

        RunnableC11594a(InterfaceC11698y<? super T> interfaceC11698y, v vVar) {
            this.f26168c = interfaceC11698y;
            this.f26169d = vVar;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26171f = th;
            EnumC11296c.m11154e(this, this.f26169d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            this.f26170e = t;
            EnumC11296c.m11154e(this, this.f26169d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f26168c.mo3150d(this);
            }
        }

        /* renamed from: i */
        public void m10797i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10796j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f26171f;
            if (th != null) {
                this.f26168c.mo3152b(th);
            } else {
                this.f26168c.mo3151c((T) this.f26170e);
            }
        }
    }

    public C11593h(InterfaceC11270a0<T> interfaceC11270a0, v vVar) {
        this.f26166c = interfaceC11270a0;
        this.f26167d = vVar;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f26166c.mo10446b(new RunnableC11594a(interfaceC11698y, this.f26167d));
    }
}
