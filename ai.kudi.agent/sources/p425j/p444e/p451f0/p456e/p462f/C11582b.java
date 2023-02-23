package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import j.e.e0.e;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
/* compiled from: SingleDoOnError.java */
/* renamed from: j.e.f0.e.f.b */
/* loaded from: classes3.dex */
public final class C11582b<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<T> f26146c;

    /* renamed from: d */
    final e<? super Throwable> f26147d;

    /* compiled from: SingleDoOnError.java */
    /* renamed from: j.e.f0.e.f.b$a */
    /* loaded from: classes3.dex */
    final class C11583a implements InterfaceC11698y<T> {

        /* renamed from: c */
        private final InterfaceC11698y<? super T> f26148c;

        C11583a(InterfaceC11698y<? super T> interfaceC11698y) {
            this.f26148c = interfaceC11698y;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            try {
                C11582b.this.f26147d.accept(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                th = new CompositeException(th, th2);
            }
            this.f26148c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            this.f26148c.mo3151c(t);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            this.f26148c.mo3150d(cVar);
        }
    }

    public C11582b(InterfaceC11270a0<T> interfaceC11270a0, e<? super Throwable> eVar) {
        this.f26146c = interfaceC11270a0;
        this.f26147d = eVar;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f26146c.mo10446b(new C11583a(interfaceC11698y));
    }
}
