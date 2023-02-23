package p425j.p444e.p451f0.p456e.p460d;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: SingleFlatMapObservable.java */
/* renamed from: j.e.f0.e.d.c */
/* loaded from: classes3.dex */
public final class C11481c<T, R> extends AbstractC11688p<R> {

    /* renamed from: c */
    final InterfaceC11270a0<T> f25835c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25836d;

    /* compiled from: SingleFlatMapObservable.java */
    /* renamed from: j.e.f0.e.d.c$a */
    /* loaded from: classes3.dex */
    static final class C11482a<T, R> extends AtomicReference<c> implements InterfaceC11695u<R>, InterfaceC11698y<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super R> f25837c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25838d;

        C11482a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
            this.f25837c = interfaceC11695u;
            this.f25838d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25837c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25837c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            try {
                InterfaceC11692s<? extends R> mo10663a = this.f25838d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                mo10663a.mo10478e(this);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25837c.mo334b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: d */
        public void mo332d(c cVar) {
            EnumC11296c.m11154e(this, cVar);
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: f */
        public void mo331f(R r) {
            this.f25837c.mo331f(r);
        }

        /* renamed from: i */
        public void m10957i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10956j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11481c(InterfaceC11270a0<T> interfaceC11270a0, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        this.f25835c = interfaceC11270a0;
        this.f25836d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        C11482a c11482a = new C11482a(interfaceC11695u, this.f25836d);
        interfaceC11695u.mo332d(c11482a);
        this.f25835c.mo10446b(c11482a);
    }
}
