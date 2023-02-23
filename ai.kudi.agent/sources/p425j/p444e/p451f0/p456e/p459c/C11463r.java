package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeSubscribeOn.java */
/* renamed from: j.e.f0.e.c.r */
/* loaded from: classes3.dex */
public final class C11463r<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final v f25804d;

    /* compiled from: MaybeSubscribeOn.java */
    /* renamed from: j.e.f0.e.c.r$a */
    /* loaded from: classes3.dex */
    static final class C11464a<T> extends AtomicReference<c> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final C11300g f25805c = new C11300g();

        /* renamed from: d */
        final InterfaceC11685m<? super T> f25806d;

        C11464a(InterfaceC11685m<? super T> interfaceC11685m) {
            this.f25806d = interfaceC11685m;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25806d.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25806d.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25806d.mo10549c(t);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        /* renamed from: i */
        public void m10973i() {
            EnumC11296c.m11156a(this);
            this.f25805c.m11128i();
        }

        /* renamed from: j */
        public boolean m10972j() {
            return EnumC11296c.m11155b(get());
        }
    }

    /* compiled from: MaybeSubscribeOn.java */
    /* renamed from: j.e.f0.e.c.r$b */
    /* loaded from: classes3.dex */
    static final class RunnableC11465b<T> implements Runnable {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25807c;

        /* renamed from: d */
        final InterfaceC11687o<T> f25808d;

        RunnableC11465b(InterfaceC11685m<? super T> interfaceC11685m, InterfaceC11687o<T> interfaceC11687o) {
            this.f25807c = interfaceC11685m;
            this.f25808d = interfaceC11687o;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25808d.mo10546a(this.f25807c);
        }
    }

    public C11463r(InterfaceC11687o<T> interfaceC11687o, v vVar) {
        super(interfaceC11687o);
        this.f25804d = vVar;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        C11464a c11464a = new C11464a(interfaceC11685m);
        interfaceC11685m.mo10548d(c11464a);
        c11464a.f25805c.m11130a(this.f25804d.b(new RunnableC11465b(c11464a, this.f25744c)));
    }
}
