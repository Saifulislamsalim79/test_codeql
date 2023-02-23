package p425j.p444e.p451f0.p456e.p460d;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: MaybeFlatMapObservable.java */
/* renamed from: j.e.f0.e.d.b */
/* loaded from: classes3.dex */
public final class C11479b<T, R> extends AbstractC11688p<R> {

    /* renamed from: c */
    final InterfaceC11687o<T> f25831c;

    /* renamed from: d */
    final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25832d;

    /* compiled from: MaybeFlatMapObservable.java */
    /* renamed from: j.e.f0.e.d.b$a */
    /* loaded from: classes3.dex */
    static final class C11480a<T, R> extends AtomicReference<c> implements InterfaceC11695u<R>, InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11695u<? super R> f25833c;

        /* renamed from: d */
        final InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> f25834d;

        C11480a(InterfaceC11695u<? super R> interfaceC11695u, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
            this.f25833c = interfaceC11695u;
            this.f25834d = interfaceC11291f;
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: a */
        public void mo335a() {
            this.f25833c.mo335a();
        }

        @Override // p425j.p444e.InterfaceC11695u
        /* renamed from: b */
        public void mo334b(Throwable th) {
            this.f25833c.mo334b(th);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            try {
                InterfaceC11692s<? extends R> mo10663a = this.f25834d.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null Publisher");
                mo10663a.mo10478e(this);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25833c.mo334b(th);
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
            this.f25833c.mo331f(r);
        }

        /* renamed from: i */
        public void m10959i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10958j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11479b(InterfaceC11687o<T> interfaceC11687o, InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        this.f25831c = interfaceC11687o;
        this.f25832d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11688p
    /* renamed from: g0 */
    protected void mo336g0(InterfaceC11695u<? super R> interfaceC11695u) {
        C11480a c11480a = new C11480a(interfaceC11695u, this.f25832d);
        interfaceC11695u.mo332d(c11480a);
        this.f25831c.mo10546a(c11480a);
    }
}
