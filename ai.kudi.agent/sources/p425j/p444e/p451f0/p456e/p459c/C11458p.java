package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: MaybeOnErrorNext.java */
/* renamed from: j.e.f0.e.c.p */
/* loaded from: classes3.dex */
public final class C11458p<T> extends AbstractC11432a<T, T> {

    /* renamed from: d */
    final InterfaceC11291f<? super Throwable, ? extends InterfaceC11687o<? extends T>> f25788d;

    /* renamed from: e */
    final boolean f25789e;

    /* compiled from: MaybeOnErrorNext.java */
    /* renamed from: j.e.f0.e.c.p$a */
    /* loaded from: classes3.dex */
    static final class C11459a<T> extends AtomicReference<c> implements InterfaceC11685m<T>, c {

        /* renamed from: c */
        final InterfaceC11685m<? super T> f25790c;

        /* renamed from: d */
        final InterfaceC11291f<? super Throwable, ? extends InterfaceC11687o<? extends T>> f25791d;

        /* renamed from: e */
        final boolean f25792e;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: j.e.f0.e.c.p$a$a */
        /* loaded from: classes3.dex */
        static final class C11460a<T> implements InterfaceC11685m<T> {

            /* renamed from: c */
            final InterfaceC11685m<? super T> f25793c;

            /* renamed from: d */
            final AtomicReference<c> f25794d;

            C11460a(InterfaceC11685m<? super T> interfaceC11685m, AtomicReference<c> atomicReference) {
                this.f25793c = interfaceC11685m;
                this.f25794d = atomicReference;
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: a */
            public void mo10551a() {
                this.f25793c.mo10551a();
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: b */
            public void mo10550b(Throwable th) {
                this.f25793c.mo10550b(th);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: c */
            public void mo10549c(T t) {
                this.f25793c.mo10549c(t);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: d */
            public void mo10548d(c cVar) {
                EnumC11296c.m11149m(this.f25794d, cVar);
            }
        }

        C11459a(InterfaceC11685m<? super T> interfaceC11685m, InterfaceC11291f<? super Throwable, ? extends InterfaceC11687o<? extends T>> interfaceC11291f, boolean z) {
            this.f25790c = interfaceC11685m;
            this.f25791d = interfaceC11291f;
            this.f25792e = z;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25790c.mo10551a();
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            if (!this.f25792e && !(th instanceof Exception)) {
                this.f25790c.mo10550b(th);
                return;
            }
            try {
                InterfaceC11687o<? extends T> mo10663a = this.f25791d.mo10663a(th);
                C11312b.m11113d(mo10663a, "The resumeFunction returned a null MaybeSource");
                InterfaceC11687o<? extends T> interfaceC11687o = mo10663a;
                EnumC11296c.m11154e(this, null);
                interfaceC11687o.mo10546a(new C11460a(this.f25790c, this));
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f25790c.mo10550b(new CompositeException(th, th2));
            }
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25790c.mo10549c(t);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            if (EnumC11296c.m11149m(this, cVar)) {
                this.f25790c.mo10548d(this);
            }
        }

        /* renamed from: i */
        public void m10979i() {
            EnumC11296c.m11156a(this);
        }

        /* renamed from: j */
        public boolean m10978j() {
            return EnumC11296c.m11155b(get());
        }
    }

    public C11458p(InterfaceC11687o<T> interfaceC11687o, InterfaceC11291f<? super Throwable, ? extends InterfaceC11687o<? extends T>> interfaceC11291f, boolean z) {
        super(interfaceC11687o);
        this.f25788d = interfaceC11291f;
        this.f25789e = z;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super T> interfaceC11685m) {
        this.f25744c.mo10546a(new C11459a(interfaceC11685m, this.f25788d, this.f25789e));
    }
}
