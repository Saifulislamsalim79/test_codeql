package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11316d;
import p425j.p444e.p451f0.p467j.C11656c;
/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* renamed from: j.e.f0.e.e.p */
/* loaded from: classes3.dex */
public final class C11551p<T> extends AbstractC11271b implements InterfaceC11316d<T> {

    /* renamed from: c */
    final InterfaceC11692s<T> f26071c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f26072d;

    /* renamed from: e */
    final boolean f26073e;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* renamed from: j.e.f0.e.e.p$a */
    /* loaded from: classes3.dex */
    static final class C11552a<T> extends AtomicInteger implements c, InterfaceC11695u<T> {

        /* renamed from: c */
        final InterfaceC11278c f26074c;

        /* renamed from: e */
        final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f26076e;

        /* renamed from: f */
        final boolean f26077f;

        /* renamed from: x */
        c f26079x;

        /* renamed from: y */
        volatile boolean f26080y;

        /* renamed from: d */
        final C11656c f26075d = new C11656c();

        /* renamed from: w */
        final C11280b f26078w = new C11280b();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: j.e.f0.e.e.p$a$a */
        /* loaded from: classes3.dex */
        final class C11553a extends AtomicReference<c> implements InterfaceC11278c, c {
            C11553a() {
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: a */
            public void mo10845a() {
                C11552a.this.m10849c(this);
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: b */
            public void mo10844b(Throwable th) {
                C11552a.this.m10848e(this, th);
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: d */
            public void mo10616d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            /* renamed from: i */
            public void m10843i() {
                EnumC11296c.m11156a(this);
            }

            /* renamed from: j */
            public boolean m10842j() {
                return EnumC11296c.m11155b(get());
            }
        }

        C11552a(InterfaceC11278c interfaceC11278c, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f, boolean z) {
            this.f26074c = interfaceC11278c;
            this.f26076e = interfaceC11291f;
            this.f26077f = z;
            lazySet(1);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (decrementAndGet() == 0) {
                Throwable m10658b = this.f26075d.m10658b();
                if (m10658b != null) {
                    this.f26074c.mo10844b(m10658b);
                } else {
                    this.f26074c.mo10845a();
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26075d.m10659a(th)) {
                if (this.f26077f) {
                    if (decrementAndGet() == 0) {
                        this.f26074c.mo10844b(this.f26075d.m10658b());
                        return;
                    }
                    return;
                }
                m10847i();
                if (getAndSet(0) > 0) {
                    this.f26074c.mo10844b(this.f26075d.m10658b());
                    return;
                }
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        void m10849c(C11552a<T>.C11553a c11553a) {
            this.f26078w.mo11135c(c11553a);
            mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26079x, cVar)) {
                this.f26079x = cVar;
                this.f26074c.mo10616d(this);
            }
        }

        /* renamed from: e */
        void m10848e(C11552a<T>.C11553a c11553a, Throwable th) {
            this.f26078w.mo11135c(c11553a);
            mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            try {
                InterfaceC11284d mo10663a = this.f26076e.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null CompletableSource");
                InterfaceC11284d interfaceC11284d = mo10663a;
                getAndIncrement();
                C11553a c11553a = new C11553a();
                if (this.f26080y || !this.f26078w.mo11136b(c11553a)) {
                    return;
                }
                interfaceC11284d.mo11202b(c11553a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26079x.i();
                mo334b(th);
            }
        }

        /* renamed from: i */
        public void m10847i() {
            this.f26080y = true;
            this.f26079x.i();
            this.f26078w.m11212i();
        }

        /* renamed from: j */
        public boolean m10846j() {
            return this.f26079x.j();
        }
    }

    public C11551p(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f, boolean z) {
        this.f26071c = interfaceC11692s;
        this.f26072d = interfaceC11291f;
        this.f26073e = z;
    }

    @Override // p425j.p444e.p451f0.p454c.InterfaceC11316d
    /* renamed from: a */
    public AbstractC11688p<T> mo10806a() {
        return a.m(new C11546o(this.f26071c, this.f26072d, this.f26073e));
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f26071c.mo10478e(new C11552a(interfaceC11278c, this.f26072d, this.f26073e));
    }
}
