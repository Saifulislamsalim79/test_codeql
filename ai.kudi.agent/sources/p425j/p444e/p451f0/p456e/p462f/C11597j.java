package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p455d.C11332j;
/* compiled from: SingleResumeNext.java */
/* renamed from: j.e.f0.e.f.j */
/* loaded from: classes3.dex */
public final class C11597j<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26177c;

    /* renamed from: d */
    final InterfaceC11291f<? super Throwable, ? extends InterfaceC11270a0<? extends T>> f26178d;

    /* compiled from: SingleResumeNext.java */
    /* renamed from: j.e.f0.e.f.j$a */
    /* loaded from: classes3.dex */
    static final class C11598a<T> extends AtomicReference<c> implements InterfaceC11698y<T>, c {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f26179c;

        /* renamed from: d */
        final InterfaceC11291f<? super Throwable, ? extends InterfaceC11270a0<? extends T>> f26180d;

        C11598a(InterfaceC11698y<? super T> interfaceC11698y, InterfaceC11291f<? super Throwable, ? extends InterfaceC11270a0<? extends T>> interfaceC11291f) {
            this.f26179c = interfaceC11698y;
            this.f26180d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            try {
                InterfaceC11270a0<? extends T> mo10663a = this.f26180d.mo10663a(th);
                C11312b.m11113d(mo10663a, "The nextFunction returned a null SingleSource.");
                mo10663a.mo10446b(new C11332j(this, this.f26179c));
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f26179c.mo3152b(new CompositeException(th, th2));
            }
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            this.f26179c.mo3151c(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f26179c.mo3150d(this);
            }
        }

        /* renamed from: i */
        public void m10795i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10794j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11597j(InterfaceC11270a0<? extends T> interfaceC11270a0, InterfaceC11291f<? super Throwable, ? extends InterfaceC11270a0<? extends T>> interfaceC11291f) {
        this.f26177c = interfaceC11270a0;
        this.f26178d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f26177c.mo10446b(new C11598a(interfaceC11698y, this.f26178d));
    }
}
