package p425j.p444e.p451f0.p456e.p461e;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11663i;
/* compiled from: ObservableTakeUntil.java */
/* renamed from: j.e.f0.e.e.n0 */
/* loaded from: classes3.dex */
public final class C11543n0<T, U> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11692s<? extends U> f26050d;

    /* compiled from: ObservableTakeUntil.java */
    /* renamed from: j.e.f0.e.e.n0$a */
    /* loaded from: classes3.dex */
    static final class C11544a<T, U> extends AtomicInteger implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26051c;

        /* renamed from: d */
        final AtomicReference<c> f26052d = new AtomicReference<>();

        /* renamed from: e */
        final C11544a<T, U>.C11545a f26053e = new C11545a();

        /* renamed from: f */
        final C11656c f26054f = new C11656c();

        /* compiled from: ObservableTakeUntil.java */
        /* renamed from: j.e.f0.e.e.n0$a$a */
        /* loaded from: classes3.dex */
        final class C11545a extends AtomicReference<c> implements InterfaceC11695u<U> {
            C11545a() {
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: a */
            public void mo335a() {
                C11544a.this.m10861c();
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: b */
            public void mo334b(Throwable th) {
                C11544a.this.m10860e(th);
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: d */
            public void mo332d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: f */
            public void mo331f(U u) {
                EnumC11296c.m11156a(this);
                C11544a.this.m10861c();
            }
        }

        C11544a(InterfaceC11695u<? super T> interfaceC11695u) {
            this.f26051c = interfaceC11695u;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            EnumC11296c.m11156a(this.f26053e);
            C11663i.m10645a(this.f26051c, this, this.f26054f);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            EnumC11296c.m11156a(this.f26053e);
            C11663i.m10643c(this.f26051c, th, this, this.f26054f);
        }

        /* renamed from: c */
        void m10861c() {
            EnumC11296c.m11156a(this.f26052d);
            C11663i.m10645a(this.f26051c, this, this.f26054f);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this.f26052d, cVar);
        }

        /* renamed from: e */
        void m10860e(Throwable th) {
            EnumC11296c.m11156a(this.f26052d);
            C11663i.m10643c(this.f26051c, th, this, this.f26054f);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            C11663i.m10641e(this.f26051c, t, this, this.f26054f);
        }

        /* renamed from: i */
        public void m10859i() {
            EnumC11296c.m11156a(this.f26052d);
            EnumC11296c.m11156a(this.f26053e);
        }

        /* renamed from: j */
        public boolean m10858j() {
            return EnumC11296c.m11155b(this.f26052d.get());
        }
    }

    public C11543n0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11692s<? extends U> interfaceC11692s2) {
        super(interfaceC11692s);
        this.f26050d = interfaceC11692s2;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        C11544a c11544a = new C11544a(interfaceC11695u);
        interfaceC11695u.mo332d(c11544a);
        this.f26050d.mo10478e(c11544a.f26053e);
        this.f25839c.mo10478e(c11544a);
    }
}
