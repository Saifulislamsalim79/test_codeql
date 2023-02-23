package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: MaybeMap.java */
/* renamed from: j.e.f0.e.c.n */
/* loaded from: classes3.dex */
public final class C11454n<T, R> extends AbstractC11432a<T, R> {

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends R> f25779d;

    /* compiled from: MaybeMap.java */
    /* renamed from: j.e.f0.e.c.n$a */
    /* loaded from: classes3.dex */
    static final class C11455a<T, R> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super R> f25780c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends R> f25781d;

        /* renamed from: e */
        c f25782e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C11455a(InterfaceC11685m<? super R> interfaceC11685m, InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
            this.f25780c = interfaceC11685m;
            this.f25781d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25780c.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25780c.mo10550b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            try {
                R mo10663a = this.f25781d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null item");
                this.f25780c.mo10549c(mo10663a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25780c.mo10550b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11147p(this.f25782e, cVar)) {
                this.f25782e = cVar;
                this.f25780c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10983i() {
            c cVar = this.f25782e;
            this.f25782e = EnumC11296c.DISPOSED;
            cVar.i();
        }

        /* renamed from: j */
        public boolean m10982j() {
            return this.f25782e.j();
        }
    }

    public C11454n(InterfaceC11687o<T> interfaceC11687o, InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        super(interfaceC11687o);
        this.f25779d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super R> interfaceC11685m) {
        this.f25744c.mo10546a(new C11455a(interfaceC11685m, this.f25779d));
    }
}
