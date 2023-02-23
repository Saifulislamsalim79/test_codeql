package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: SingleFlatMap.java */
/* renamed from: j.e.f0.e.f.d */
/* loaded from: classes3.dex */
public final class C11586d<T, R> extends AbstractC11696w<R> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26154c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11270a0<? extends R>> f26155d;

    /* compiled from: SingleFlatMap.java */
    /* renamed from: j.e.f0.e.f.d$a */
    /* loaded from: classes3.dex */
    static final class C11587a<T, R> extends AtomicReference<c> implements InterfaceC11698y<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super R> f26156c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11270a0<? extends R>> f26157d;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: j.e.f0.e.f.d$a$a */
        /* loaded from: classes3.dex */
        static final class C11588a<R> implements InterfaceC11698y<R> {

            /* renamed from: c */
            final AtomicReference<c> f26158c;

            /* renamed from: d */
            final InterfaceC11698y<? super R> f26159d;

            C11588a(AtomicReference<c> atomicReference, InterfaceC11698y<? super R> interfaceC11698y) {
                this.f26158c = atomicReference;
                this.f26159d = interfaceC11698y;
            }

            @Override // p425j.p444e.InterfaceC11698y
            /* renamed from: b */
            public void mo3152b(Throwable th) {
                this.f26159d.mo3152b(th);
            }

            @Override // p425j.p444e.InterfaceC11698y
            /* renamed from: c */
            public void mo3151c(R r) {
                this.f26159d.mo3151c(r);
            }

            @Override // p425j.p444e.InterfaceC11698y
            /* renamed from: d */
            public void mo3150d(c cVar) {
                EnumC11296c.m11154e(this.f26158c, cVar);
            }
        }

        C11587a(InterfaceC11698y<? super R> interfaceC11698y, InterfaceC11291f<? super T, ? extends InterfaceC11270a0<? extends R>> interfaceC11291f) {
            this.f26156c = interfaceC11698y;
            this.f26157d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26156c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            try {
                InterfaceC11270a0<? extends R> mo10663a = this.f26157d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The single returned by the mapper is null");
                InterfaceC11270a0<? extends R> interfaceC11270a0 = mo10663a;
                if (m10798j()) {
                    return;
                }
                interfaceC11270a0.mo10446b(new C11588a(this, this.f26156c));
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26156c.mo3152b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f26156c.mo3150d(this);
            }
        }

        /* renamed from: i */
        public void m10799i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10798j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11586d(InterfaceC11270a0<? extends T> interfaceC11270a0, InterfaceC11291f<? super T, ? extends InterfaceC11270a0<? extends R>> interfaceC11291f) {
        this.f26155d = interfaceC11291f;
        this.f26154c = interfaceC11270a0;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super R> interfaceC11698y) {
        this.f26154c.mo10446b(new C11587a(interfaceC11698y, this.f26155d));
    }
}
