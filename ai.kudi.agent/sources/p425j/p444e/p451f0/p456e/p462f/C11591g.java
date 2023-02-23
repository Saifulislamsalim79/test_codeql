package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: SingleMap.java */
/* renamed from: j.e.f0.e.f.g */
/* loaded from: classes3.dex */
public final class C11591g<T, R> extends AbstractC11696w<R> {

    /* renamed from: c */
    final InterfaceC11270a0<? extends T> f26162c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends R> f26163d;

    /* compiled from: SingleMap.java */
    /* renamed from: j.e.f0.e.f.g$a */
    /* loaded from: classes3.dex */
    static final class C11592a<T, R> implements InterfaceC11698y<T> {

        /* renamed from: c */
        final InterfaceC11698y<? super R> f26164c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends R> f26165d;

        C11592a(InterfaceC11698y<? super R> interfaceC11698y, InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
            this.f26164c = interfaceC11698y;
            this.f26165d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26164c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            try {
                R mo10663a = this.f26165d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                this.f26164c.mo3151c(mo10663a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                mo3152b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            this.f26164c.mo3150d(cVar);
        }
    }

    public C11591g(InterfaceC11270a0<? extends T> interfaceC11270a0, InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        this.f26162c = interfaceC11270a0;
        this.f26163d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super R> interfaceC11698y) {
        this.f26162c.mo10446b(new C11592a(interfaceC11698y, this.f26163d));
    }
}
