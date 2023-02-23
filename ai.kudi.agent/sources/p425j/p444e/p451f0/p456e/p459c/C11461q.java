package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
/* compiled from: MaybePeek.java */
/* renamed from: j.e.f0.e.c.q */
/* loaded from: classes3.dex */
public final class C11461q<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final e<? super c> f25795d;

    /* renamed from: e */
    final e<? super T> f25796e;

    /* renamed from: f */
    final e<? super Throwable> f25797f;

    /* renamed from: w */
    final InterfaceC11287a f25798w;

    /* renamed from: x */
    final InterfaceC11287a f25799x;

    /* renamed from: y */
    final InterfaceC11287a f25800y;

    /* compiled from: MaybePeek.java */
    /* renamed from: j.e.f0.e.c.q$a */
    /* loaded from: classes3.dex */
    static final class C11462a<T> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25801c;

        /* renamed from: d */
        final C11461q<T> f25802d;

        /* renamed from: e */
        c f25803e;

        C11462a(InterfaceC11685m<? super T> interfaceC11685m, C11461q<T> c11461q) {
            this.f25801c = interfaceC11685m;
            this.f25802d = c11461q;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            if (this.f25803e == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                this.f25802d.f25798w.run();
                this.f25803e = EnumC11296c.DISPOSED;
                this.f25801c.mo10551a();
                m10977e();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                m10976f(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            if (this.f25803e == EnumC11296c.DISPOSED) {
                a.r(th);
            } else {
                m10976f(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            if (this.f25803e == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                this.f25802d.f25796e.accept(t);
                this.f25803e = EnumC11296c.DISPOSED;
                this.f25801c.mo10549c(t);
                m10977e();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                m10976f(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25803e, cVar)) {
                try {
                    this.f25802d.f25795d.accept(cVar);
                    this.f25803e = cVar;
                    this.f25801c.mo10548d(this);
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    cVar.i();
                    this.f25803e = EnumC11296c.DISPOSED;
                    EnumC11297d.m11142h(th, this.f25801c);
                }
            }
        }

        /* renamed from: e */
        void m10977e() {
            try {
                this.f25802d.f25799x.run();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                a.r(th);
            }
        }

        /* renamed from: f */
        void m10976f(Throwable th) {
            try {
                this.f25802d.f25797f.accept(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                th = new CompositeException(th, th2);
            }
            this.f25803e = EnumC11296c.DISPOSED;
            this.f25801c.mo10550b(th);
            m10977e();
        }

        /* renamed from: i */
        public void m10975i() {
            try {
                this.f25802d.f25800y.run();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                a.r(th);
            }
            this.f25803e.i();
            this.f25803e = EnumC11296c.DISPOSED;
        }

        /* renamed from: j */
        public boolean m10974j() {
            return this.f25803e.j();
        }
    }

    public C11461q(InterfaceC11687o<T> interfaceC11687o, e<? super c> eVar, e<? super T> eVar2, e<? super Throwable> eVar3, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2, InterfaceC11287a interfaceC11287a3) {
        super(interfaceC11687o);
        this.f25795d = eVar;
        this.f25796e = eVar2;
        this.f25797f = eVar3;
        this.f25798w = interfaceC11287a;
        this.f25799x = interfaceC11287a2;
        this.f25800y = interfaceC11287a3;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25744c.mo10546a(new C11462a(interfaceC11685m, this));
    }
}
