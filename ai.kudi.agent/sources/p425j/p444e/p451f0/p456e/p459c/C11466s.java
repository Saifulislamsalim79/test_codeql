package p425j.p444e.p451f0.p456e.p459c;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: MaybeSwitchIfEmpty.java */
/* renamed from: j.e.f0.e.c.s */
/* loaded from: classes3.dex */
public final class C11466s<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final InterfaceC11687o<? extends T> f25809d;

    /* compiled from: MaybeSwitchIfEmpty.java */
    /* renamed from: j.e.f0.e.c.s$a */
    /* loaded from: classes3.dex */
    static final class C11467a<T> extends AtomicReference<c> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25810c;

        /* renamed from: d */
        final InterfaceC11687o<? extends T> f25811d;

        /* compiled from: MaybeSwitchIfEmpty.java */
        /* renamed from: j.e.f0.e.c.s$a$a */
        /* loaded from: classes3.dex */
        static final class C11468a<T> implements InterfaceC11685m<T> {

            /* renamed from: c */
            final InterfaceC11685m<? super T> f25812c;

            /* renamed from: d */
            final AtomicReference<c> f25813d;

            C11468a(InterfaceC11685m<? super T> interfaceC11685m, AtomicReference<c> atomicReference) {
                this.f25812c = interfaceC11685m;
                this.f25813d = atomicReference;
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: a */
            public void mo10551a() {
                this.f25812c.mo10551a();
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: b */
            public void mo10550b(Throwable th) {
                this.f25812c.mo10550b(th);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: c */
            public void mo10549c(T t) {
                this.f25812c.mo10549c(t);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: d */
            public void mo10548d(c cVar) {
                EnumC11296c.m11149m(this.f25813d, cVar);
            }
        }

        C11467a(InterfaceC11685m<? super T> interfaceC11685m, InterfaceC11687o<? extends T> interfaceC11687o) {
            this.f25810c = interfaceC11685m;
            this.f25811d = interfaceC11687o;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            c cVar = get();
            if (cVar == EnumC11296c.DISPOSED || !compareAndSet(cVar, null)) {
                return;
            }
            this.f25811d.mo10546a(new C11468a(this.f25810c, this));
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25810c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25810c.mo10549c(t);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f25810c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10971i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10970j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11466s(InterfaceC11687o<T> interfaceC11687o, InterfaceC11687o<? extends T> interfaceC11687o2) {
        super(interfaceC11687o);
        this.f25809d = interfaceC11687o2;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25744c.mo10546a(new C11467a(interfaceC11685m, this.f25809d));
    }
}
