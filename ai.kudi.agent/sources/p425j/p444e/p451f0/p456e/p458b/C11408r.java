package p425j.p444e.p451f0.p456e.p458b;

import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p465h.AbstractC11642a;
import p425j.p444e.p451f0.p465h.AbstractC11643b;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableMap.java */
/* renamed from: j.e.f0.e.b.r */
/* loaded from: classes3.dex */
public final class C11408r<T, U> extends AbstractC11351a<T, U> {

    /* renamed from: e */
    final InterfaceC11291f<? super T, ? extends U> f25662e;

    /* compiled from: FlowableMap.java */
    /* renamed from: j.e.f0.e.b.r$a */
    /* loaded from: classes3.dex */
    static final class C11409a<T, U> extends AbstractC11642a<T, U> {

        /* renamed from: x */
        final InterfaceC11291f<? super T, ? extends U> f25663x;

        C11409a(InterfaceC11313a<? super U> interfaceC11313a, InterfaceC11291f<? super T, ? extends U> interfaceC11291f) {
            super(interfaceC11313a);
            this.f25663x = interfaceC11291f;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f26308f) {
                return;
            }
            if (this.f26309w != 0) {
                this.f26305c.mo1688f(null);
                return;
            }
            try {
                U mo10663a = this.f25663x.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                this.f26305c.mo1688f(mo10663a);
            } catch (Throwable th) {
                m10692i(th);
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11313a
        /* renamed from: h */
        public boolean mo11024h(T t) {
            if (this.f26308f) {
                return false;
            }
            try {
                U mo10663a = this.f25663x.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                return this.f26305c.mo11024h(mo10663a);
            } catch (Throwable th) {
                m10692i(th);
                return true;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m10691j(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public U poll() throws Exception {
            T poll = this.f26307e.poll();
            if (poll != null) {
                U mo10663a = this.f25663x.mo10663a(poll);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                return mo10663a;
            }
            return null;
        }
    }

    /* compiled from: FlowableMap.java */
    /* renamed from: j.e.f0.e.b.r$b */
    /* loaded from: classes3.dex */
    static final class C11410b<T, U> extends AbstractC11643b<T, U> {

        /* renamed from: x */
        final InterfaceC11291f<? super T, ? extends U> f25664x;

        C11410b(InterfaceC14456b<? super U> interfaceC14456b, InterfaceC11291f<? super T, ? extends U> interfaceC11291f) {
            super(interfaceC14456b);
            this.f25664x = interfaceC11291f;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f26313f) {
                return;
            }
            if (this.f26314w != 0) {
                this.f26310c.mo1688f(null);
                return;
            }
            try {
                U mo10663a = this.f25664x.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                this.f26310c.mo1688f(mo10663a);
            } catch (Throwable th) {
                m10688i(th);
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m10687j(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public U poll() throws Exception {
            T poll = this.f26312e.poll();
            if (poll != null) {
                U mo10663a = this.f25664x.mo10663a(poll);
                C11312b.m11113d(mo10663a, "The mapper function returned a null value.");
                return mo10663a;
            }
            return null;
        }
    }

    public C11408r(AbstractC11293f<T> abstractC11293f, InterfaceC11291f<? super T, ? extends U> interfaceC11291f) {
        super(abstractC11293f);
        this.f25662e = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super U> interfaceC14456b) {
        if (interfaceC14456b instanceof InterfaceC11313a) {
            this.f25499d.m11188K(new C11409a((InterfaceC11313a) interfaceC14456b, this.f25662e));
        } else {
            this.f25499d.m11188K(new C11410b(interfaceC14456b, this.f25662e));
        }
    }
}
