package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: SingleOnErrorReturn.java */
/* renamed from: j.e.f0.e.f.i */
/* loaded from: classes3.dex */
public final class C11595i<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26172c;

    /* renamed from: d */
    final InterfaceC11291f<? super Throwable, ? extends T> f26173d;

    /* renamed from: e */
    final T f26174e;

    /* compiled from: SingleOnErrorReturn.java */
    /* renamed from: j.e.f0.e.f.i$a */
    /* loaded from: classes3.dex */
    final class C11596a implements InterfaceC11698y<T> {

        /* renamed from: c */
        private final InterfaceC11698y<? super T> f26175c;

        C11596a(InterfaceC11698y<? super T> interfaceC11698y) {
            this.f26175c = interfaceC11698y;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            T mo10663a;
            C11595i c11595i = C11595i.this;
            InterfaceC11291f<? super Throwable, ? extends T> interfaceC11291f = c11595i.f26173d;
            if (interfaceC11291f != null) {
                try {
                    mo10663a = interfaceC11291f.mo10663a(th);
                } catch (Throwable th2) {
                    C11118a.m11646b(th2);
                    this.f26175c.mo3152b(new CompositeException(th, th2));
                    return;
                }
            } else {
                mo10663a = c11595i.f26174e;
            }
            if (mo10663a == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f26175c.mo3152b(nullPointerException);
                return;
            }
            this.f26175c.mo3151c(mo10663a);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            this.f26175c.mo3151c(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            this.f26175c.mo3150d(cVar);
        }
    }

    public C11595i(InterfaceC11270a0<? extends T> interfaceC11270a0, InterfaceC11291f<? super Throwable, ? extends T> interfaceC11291f, T t) {
        this.f26172c = interfaceC11270a0;
        this.f26173d = interfaceC11291f;
        this.f26174e = t;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f26172c.mo10446b(new C11596a(interfaceC11698y));
    }
}
