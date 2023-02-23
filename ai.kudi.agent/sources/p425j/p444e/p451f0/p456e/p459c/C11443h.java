package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: MaybeFlatten.java */
/* renamed from: j.e.f0.e.c.h */
/* loaded from: classes3.dex */
public final class C11443h<T, R> extends AbstractC11432a<T, R> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f25764d;

    /* compiled from: MaybeFlatten.java */
    /* renamed from: j.e.f0.e.c.h$a */
    /* loaded from: classes3.dex */
    static final class C11444a<T, R> extends AtomicReference<c> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super R> f25765c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f25766d;

        /* renamed from: e */
        c f25767e;

        /* compiled from: MaybeFlatten.java */
        /* renamed from: j.e.f0.e.c.h$a$a */
        /* loaded from: classes3.dex */
        final class C11445a implements InterfaceC11685m<R> {
            C11445a() {
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: a */
            public void mo10551a() {
                C11444a.this.f25765c.mo10551a();
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: b */
            public void mo10550b(Throwable th) {
                C11444a.this.f25765c.mo10550b(th);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: c */
            public void mo10549c(R r) {
                C11444a.this.f25765c.mo10549c(r);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: d */
            public void mo10548d(c cVar) {
                EnumC11296c.m11149m(C11444a.this, cVar);
            }
        }

        C11444a(InterfaceC11685m<? super R> interfaceC11685m, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f) {
            this.f25765c = interfaceC11685m;
            this.f25766d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25765c.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25765c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            try {
                InterfaceC11687o<? extends R> mo10663a = this.f25766d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null MaybeSource");
                InterfaceC11687o<? extends R> interfaceC11687o = mo10663a;
                if (m10991j()) {
                    return;
                }
                interfaceC11687o.mo10546a(new C11445a());
            } catch (Exception e) {
                C11118a.m11646b(e);
                this.f25765c.mo10550b(e);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25767e, cVar)) {
                this.f25767e = cVar;
                this.f25765c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10992i() {
            EnumC11296c.m11156a(this);
            this.f25767e.i();
        }

        /* renamed from: j */
        public boolean m10991j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11443h(InterfaceC11687o<T> interfaceC11687o, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f) {
        super(interfaceC11687o);
        this.f25764d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super R> interfaceC11685m) {
        this.f25744c.mo10546a(new C11444a(interfaceC11685m, this.f25764d));
    }
}
