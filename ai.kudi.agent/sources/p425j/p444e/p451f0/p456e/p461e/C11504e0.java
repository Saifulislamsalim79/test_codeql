package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11663i;
import p425j.p444e.p471k0.AbstractC11683d;
import p425j.p444e.p471k0.C11680b;
/* compiled from: ObservableRepeatWhen.java */
/* renamed from: j.e.f0.e.e.e0 */
/* loaded from: classes3.dex */
public final class C11504e0<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11291f<? super AbstractC11688p<Object>, ? extends InterfaceC11692s<?>> f25931d;

    /* compiled from: ObservableRepeatWhen.java */
    /* renamed from: j.e.f0.e.e.e0$a */
    /* loaded from: classes3.dex */
    static final class C11505a<T> extends AtomicInteger implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25932c;

        /* renamed from: f */
        final AbstractC11683d<Object> f25935f;

        /* renamed from: y */
        final InterfaceC11692s<T> f25938y;

        /* renamed from: z */
        volatile boolean f25939z;

        /* renamed from: d */
        final AtomicInteger f25933d = new AtomicInteger();

        /* renamed from: e */
        final C11656c f25934e = new C11656c();

        /* renamed from: w */
        final C11505a<T>.C11506a f25936w = new C11506a();

        /* renamed from: x */
        final AtomicReference<c> f25937x = new AtomicReference<>();

        /* compiled from: ObservableRepeatWhen.java */
        /* renamed from: j.e.f0.e.e.e0$a$a */
        /* loaded from: classes3.dex */
        final class C11506a extends AtomicReference<c> implements InterfaceC11695u<Object> {
            C11506a() {
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: a */
            public void mo335a() {
                C11505a.this.m10911c();
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: b */
            public void mo334b(Throwable th) {
                C11505a.this.m10910e(th);
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: d */
            public void mo332d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            @Override // p425j.p444e.InterfaceC11695u
            /* renamed from: f */
            public void mo331f(Object obj) {
                C11505a.this.m10909g();
            }
        }

        C11505a(InterfaceC11695u<? super T> interfaceC11695u, AbstractC11683d<Object> abstractC11683d, InterfaceC11692s<T> interfaceC11692s) {
            this.f25932c = interfaceC11695u;
            this.f25935f = abstractC11683d;
            this.f25938y = interfaceC11692s;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            EnumC11296c.m11154e(this.f25937x, null);
            this.f25939z = false;
            this.f25935f.mo331f(0);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            EnumC11296c.m11156a(this.f25936w);
            C11663i.m10643c(this.f25932c, th, this, this.f25934e);
        }

        /* renamed from: c */
        void m10911c() {
            EnumC11296c.m11156a(this.f25937x);
            C11663i.m10645a(this.f25932c, this, this.f25934e);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11149m(this.f25937x, cVar);
        }

        /* renamed from: e */
        void m10910e(Throwable th) {
            EnumC11296c.m11156a(this.f25937x);
            C11663i.m10643c(this.f25932c, th, this, this.f25934e);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            C11663i.m10641e(this.f25932c, t, this, this.f25934e);
        }

        /* renamed from: g */
        void m10909g() {
            m10908h();
        }

        /* renamed from: h */
        void m10908h() {
            if (this.f25933d.getAndIncrement() == 0) {
                while (!m10906j()) {
                    if (!this.f25939z) {
                        this.f25939z = true;
                        this.f25938y.mo10478e(this);
                    }
                    if (this.f25933d.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: i */
        public void m10907i() {
            EnumC11296c.m11156a(this.f25937x);
            EnumC11296c.m11156a(this.f25936w);
        }

        /* renamed from: j */
        public boolean m10906j() {
            return EnumC11296c.m11155b(this.f25937x.get());
        }
    }

    public C11504e0(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super AbstractC11688p<Object>, ? extends InterfaceC11692s<?>> interfaceC11291f) {
        super(interfaceC11692s);
        this.f25931d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        AbstractC11683d<T> m10555t0 = C11680b.m10564v0().m10555t0();
        try {
            InterfaceC11692s<?> mo10663a = this.f25931d.mo10663a(m10555t0);
            C11312b.m11113d(mo10663a, "The handler returned a null ObservableSource");
            InterfaceC11692s<?> interfaceC11692s = mo10663a;
            C11505a c11505a = new C11505a(interfaceC11695u, m10555t0, this.f25839c);
            interfaceC11695u.mo332d(c11505a);
            interfaceC11692s.mo10478e(c11505a.f25936w);
            c11505a.m10908h();
        } catch (Throwable th) {
            C11118a.m11646b(th);
            EnumC11297d.m11139n(th, interfaceC11695u);
        }
    }
}
