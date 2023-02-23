package p425j.p444e.p451f0.p456e.p462f;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11270a0;
import p425j.p444e.InterfaceC11698y;
/* compiled from: SingleDoOnSuccess.java */
/* renamed from: j.e.f0.e.f.c */
/* loaded from: classes3.dex */
public final class C11584c<T> extends AbstractC11696w<T> {

    /* renamed from: c */
    final InterfaceC11270a0<T> f26150c;

    /* renamed from: d */
    final e<? super T> f26151d;

    /* compiled from: SingleDoOnSuccess.java */
    /* renamed from: j.e.f0.e.f.c$a */
    /* loaded from: classes3.dex */
    final class C11585a implements InterfaceC11698y<T> {

        /* renamed from: c */
        final InterfaceC11698y<? super T> f26152c;

        C11585a(InterfaceC11698y<? super T> interfaceC11698y) {
            this.f26152c = interfaceC11698y;
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: b */
        public void mo3152b(Throwable th) {
            this.f26152c.mo3152b(th);
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: c */
        public void mo3151c(T t) {
            try {
                C11584c.this.f26151d.accept(t);
                this.f26152c.mo3151c(t);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f26152c.mo3152b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11698y
        /* renamed from: d */
        public void mo3150d(c cVar) {
            this.f26152c.mo3150d(cVar);
        }
    }

    public C11584c(InterfaceC11270a0<T> interfaceC11270a0, e<? super T> eVar) {
        this.f26150c = interfaceC11270a0;
        this.f26151d = eVar;
    }

    @Override // p425j.p444e.AbstractC11696w
    /* renamed from: t */
    protected void mo10430t(InterfaceC11698y<? super T> interfaceC11698y) {
        this.f26150c.mo10446b(new C11585a(interfaceC11698y));
    }
}
