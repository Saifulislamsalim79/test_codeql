package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeObserveOn.java */
/* renamed from: j.e.f0.e.c.o */
/* loaded from: classes3.dex */
public final class C11456o<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final v f25783d;

    /* compiled from: MaybeObserveOn.java */
    /* renamed from: j.e.f0.e.c.o$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11457a<T> extends AtomicReference<c> implements InterfaceC11685m<T>, c, Runnable {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25784c;

        /* renamed from: d */
        final v f25785d;

        /* renamed from: e */
        T f25786e;

        /* renamed from: f */
        Throwable f25787f;

        RunnableC11457a(InterfaceC11685m<? super T> interfaceC11685m, v vVar) {
            this.f25784c = interfaceC11685m;
            this.f25785d = vVar;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            EnumC11296c.m11154e(this, this.f25785d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25787f = th;
            EnumC11296c.m11154e(this, this.f25785d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25786e = t;
            EnumC11296c.m11154e(this, this.f25785d.b(this));
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f25784c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10981i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10980j() {
            return EnumC11296c.m11155b(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f25787f;
            if (th != null) {
                this.f25787f = null;
                this.f25784c.mo10550b(th);
                return;
            }
            T t = this.f25786e;
            if (t != null) {
                this.f25786e = null;
                this.f25784c.mo10549c(t);
                return;
            }
            this.f25784c.mo10551a();
        }
    }

    public C11456o(InterfaceC11687o<T> interfaceC11687o, v vVar) {
        super(interfaceC11687o);
        this.f25783d = vVar;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25744c.mo10546a(new RunnableC11457a(interfaceC11685m, this.f25783d));
    }
}
