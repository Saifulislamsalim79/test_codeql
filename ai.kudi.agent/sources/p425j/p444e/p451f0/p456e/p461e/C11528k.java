package p425j.p444e.p451f0.p456e.p461e;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
/* compiled from: ObservableDoOnEach.java */
/* renamed from: j.e.f0.e.e.k */
/* loaded from: classes3.dex */
public final class C11528k<T> extends AbstractC11483a<T, T> {

    /* renamed from: d */
    final e<? super T> f25994d;

    /* renamed from: e */
    final e<? super Throwable> f25995e;

    /* renamed from: f */
    final InterfaceC11287a f25996f;

    /* renamed from: w */
    final InterfaceC11287a f25997w;

    /* compiled from: ObservableDoOnEach.java */
    /* renamed from: j.e.f0.e.e.k$a */
    /* loaded from: classes3.dex */
    static final class C11529a<T> implements InterfaceC11695u<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super T> f25998c;

        /* renamed from: d */
        final e<? super T> f25999d;

        /* renamed from: e */
        final e<? super Throwable> f26000e;

        /* renamed from: f */
        final InterfaceC11287a f26001f;

        /* renamed from: w */
        final InterfaceC11287a f26002w;

        /* renamed from: x */
        c f26003x;

        /* renamed from: y */
        boolean f26004y;

        C11529a(InterfaceC11695u<? super T> interfaceC11695u, e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
            this.f25998c = interfaceC11695u;
            this.f25999d = eVar;
            this.f26000e = eVar2;
            this.f26001f = interfaceC11287a;
            this.f26002w = interfaceC11287a2;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            if (this.f26004y) {
                return;
            }
            try {
                this.f26001f.run();
                this.f26004y = true;
                this.f25998c.mo335a();
                try {
                    this.f26002w.run();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    a.r(th);
                }
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                mo334b(th2);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            if (this.f26004y) {
                a.r(th);
                return;
            }
            this.f26004y = true;
            try {
                this.f26000e.accept(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                th = new CompositeException(th, th2);
            }
            this.f25998c.mo334b(th);
            try {
                this.f26002w.run();
            } catch (Throwable th3) {
                C11118a.m11646b(th3);
                a.r(th3);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            if (EnumC11296c.m11147p(this.f26003x, cVar)) {
                this.f26003x = cVar;
                this.f25998c.mo332d(this);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(T t) {
            if (this.f26004y) {
                return;
            }
            try {
                this.f25999d.accept(t);
                this.f25998c.mo331f(t);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26003x.i();
                mo334b(th);
            }
        }

        /* renamed from: i */
        public void m10880i() {
            this.f26003x.i();
        }

        /* renamed from: j */
        public boolean m10879j() {
            return this.f26003x.j();
        }
    }

    public C11528k(InterfaceC11692s<T> interfaceC11692s, e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
        super(interfaceC11692s);
        this.f25994d = eVar;
        this.f25995e = eVar2;
        this.f25996f = interfaceC11287a;
        this.f25997w = interfaceC11287a2;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    public void mo336g0(InterfaceC11695u<? super T> interfaceC11695u) {
        this.f25839c.mo10478e(new C11529a(interfaceC11695u, this.f25994d, this.f25995e, this.f25996f, this.f25997w));
    }
}
