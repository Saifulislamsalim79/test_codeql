package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.AbstractC11324b;
import p425j.p444e.p451f0.p467j.C11656c;
/* compiled from: ObservableFlatMapCompletable.java */
/* renamed from: j.e.f0.e.e.o */
/* loaded from: classes3.dex */
public final class C11546o<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f26056d;

    /* renamed from: e */
    final boolean f26057e;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* renamed from: j.e.f0.e.e.o$a */
    /* loaded from: classes3.dex */
    static final class C11547a<T> extends AbstractC11324b<T> implements InterfaceC11695u<T> {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f26058c;

        /* renamed from: e */
        final InterfaceC11291f<? super T, ? extends InterfaceC11284d> f26060e;

        /* renamed from: f */
        final boolean f26061f;

        /* renamed from: x */
        c f26063x;

        /* renamed from: y */
        volatile boolean f26064y;

        /* renamed from: d */
        final C11656c f26059d = new C11656c();

        /* renamed from: w */
        final C11280b f26062w = new C11280b();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: j.e.f0.e.e.o$a$a */
        /* loaded from: classes3.dex */
        final class C11548a extends AtomicReference<c> implements InterfaceC11278c, c {
            C11548a() {
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: a */
            public void mo10845a() {
                C11547a.this.m10857e(this);
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: b */
            public void mo10844b(Throwable th) {
                C11547a.this.m10856g(this, th);
            }

            @Override // p425j.p444e.InterfaceC11278c
            /* renamed from: d */
            public void mo10616d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            /* renamed from: i */
            public void m10853i() {
                EnumC11296c.m11156a(this);
            }

            /* renamed from: j */
            public boolean m10852j() {
                return EnumC11296c.m11155b(get());
            }
        }

        C11547a(InterfaceC11695u<? super T> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f, boolean z) {
            this.f26058c = interfaceC11695u;
            this.f26060e = interfaceC11291f;
            this.f26061f = z;
            lazySet(1);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (decrementAndGet() == 0) {
                Throwable m10658b = this.f26059d.m10658b();
                if (m10658b != null) {
                    this.f26058c.mo334b(m10658b);
                } else {
                    this.f26058c.mo335a();
                }
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26059d.m10659a(th)) {
                if (this.f26061f) {
                    if (decrementAndGet() == 0) {
                        this.f26058c.mo334b(this.f26059d.m10658b());
                        return;
                    }
                    return;
                }
                m10855i();
                if (getAndSet(0) > 0) {
                    this.f26058c.mo334b(this.f26059d.m10658b());
                    return;
                }
                return;
            }
            a.r(th);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26063x, cVar)) {
                this.f26063x = cVar;
                this.f26058c.mo332d(this);
            }
        }

        /* renamed from: e */
        void m10857e(C11547a<T>.C11548a c11548a) {
            this.f26062w.mo11135c(c11548a);
            mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            try {
                InterfaceC11284d mo10663a = this.f26060e.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null CompletableSource");
                InterfaceC11284d interfaceC11284d = mo10663a;
                getAndIncrement();
                C11548a c11548a = new C11548a();
                if (this.f26064y || !this.f26062w.mo11136b(c11548a)) {
                    return;
                }
                interfaceC11284d.mo11202b(c11548a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26063x.i();
                mo334b(th);
            }
        }

        /* renamed from: g */
        void m10856g(C11547a<T>.C11548a c11548a, Throwable th) {
            this.f26062w.mo11135c(c11548a);
            mo334b(th);
        }

        /* renamed from: i */
        public void m10855i() {
            this.f26064y = true;
            this.f26063x.i();
            this.f26062w.m11212i();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return true;
        }

        /* renamed from: j */
        public boolean m10854j() {
            return this.f26063x.j();
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return i & 2;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            return null;
        }
    }

    public C11546o(InterfaceC11692s<T> interfaceC11692s, InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f, boolean z) {
        super(interfaceC11692s);
        this.f26056d = interfaceC11291f;
        this.f26057e = z;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11547a(interfaceC11695u, this.f26056d, this.f26057e));
    }
}
