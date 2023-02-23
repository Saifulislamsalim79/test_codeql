package p425j.p444e.p451f0.p456e.p457a;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
/* compiled from: CompletablePeek.java */
/* renamed from: j.e.f0.e.a.i */
/* loaded from: classes3.dex */
public final class C11345i extends AbstractC11271b {

    /* renamed from: c */
    final InterfaceC11284d f25479c;

    /* renamed from: d */
    final e<? super c> f25480d;

    /* renamed from: e */
    final e<? super Throwable> f25481e;

    /* renamed from: f */
    final InterfaceC11287a f25482f;

    /* renamed from: w */
    final InterfaceC11287a f25483w;

    /* renamed from: x */
    final InterfaceC11287a f25484x;

    /* renamed from: y */
    final InterfaceC11287a f25485y;

    /* compiled from: CompletablePeek.java */
    /* renamed from: j.e.f0.e.a.i$a */
    /* loaded from: classes3.dex */
    final class C11346a implements InterfaceC11278c, c {

        /* renamed from: c */
        final InterfaceC11278c f25486c;

        /* renamed from: d */
        c f25487d;

        C11346a(InterfaceC11278c interfaceC11278c) {
            this.f25486c = interfaceC11278c;
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: a */
        public void mo10845a() {
            if (this.f25487d == EnumC11296c.DISPOSED) {
                return;
            }
            try {
                C11345i.this.f25482f.run();
                C11345i.this.f25483w.run();
                this.f25486c.mo10845a();
                m11085c();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25486c.mo10844b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: b */
        public void mo10844b(Throwable th) {
            if (this.f25487d == EnumC11296c.DISPOSED) {
                a.r(th);
                return;
            }
            try {
                C11345i.this.f25481e.accept(th);
                C11345i.this.f25483w.run();
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                th = new CompositeException(th, th2);
            }
            this.f25486c.mo10844b(th);
            m11085c();
        }

        /* renamed from: c */
        void m11085c() {
            try {
                C11345i.this.f25484x.run();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                a.r(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11278c
        /* renamed from: d */
        public void mo10616d(c cVar) {
            try {
                C11345i.this.f25480d.accept(cVar);
                if (EnumC11296c.m11147p(this.f25487d, cVar)) {
                    this.f25487d = cVar;
                    this.f25486c.mo10616d(this);
                }
            } catch (Throwable th) {
                C11118a.m11646b(th);
                cVar.i();
                this.f25487d = EnumC11296c.DISPOSED;
                EnumC11297d.m11143g(th, this.f25486c);
            }
        }

        /* renamed from: i */
        public void m11084i() {
            try {
                C11345i.this.f25485y.run();
            } catch (Throwable th) {
                C11118a.m11646b(th);
                a.r(th);
            }
            this.f25487d.i();
        }

        /* renamed from: j */
        public boolean m11083j() {
            return this.f25487d.j();
        }
    }

    public C11345i(InterfaceC11284d interfaceC11284d, e<? super c> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2, InterfaceC11287a interfaceC11287a3, InterfaceC11287a interfaceC11287a4) {
        this.f25479c = interfaceC11284d;
        this.f25480d = eVar;
        this.f25481e = eVar2;
        this.f25482f = interfaceC11287a;
        this.f25483w = interfaceC11287a2;
        this.f25484x = interfaceC11287a3;
        this.f25485y = interfaceC11287a4;
    }

    @Override // p425j.p444e.AbstractC11271b
    /* renamed from: r */
    protected void mo10805r(InterfaceC11278c interfaceC11278c) {
        this.f25479c.mo11202b(new C11346a(interfaceC11278c));
    }
}
