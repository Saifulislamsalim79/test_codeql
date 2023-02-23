package p425j.p444e.p451f0.p456e.p458b;

import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p465h.AbstractC11642a;
import p425j.p444e.p451f0.p465h.AbstractC11643b;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableFilter.java */
/* renamed from: j.e.f0.e.b.h */
/* loaded from: classes3.dex */
public final class C11384h<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final InterfaceC11292g<? super T> f25579e;

    /* compiled from: FlowableFilter.java */
    /* renamed from: j.e.f0.e.b.h$a */
    /* loaded from: classes3.dex */
    static final class C11385a<T> extends AbstractC11642a<T, T> {

        /* renamed from: x */
        final InterfaceC11292g<? super T> f25580x;

        C11385a(InterfaceC11313a<? super T> interfaceC11313a, InterfaceC11292g<? super T> interfaceC11292g) {
            super(interfaceC11313a);
            this.f25580x = interfaceC11292g;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (mo11024h(t)) {
                return;
            }
            this.f26306d.mo1686e(1L);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11313a
        /* renamed from: h */
        public boolean mo11024h(T t) {
            if (this.f26308f) {
                return false;
            }
            if (this.f26309w != 0) {
                return this.f26305c.mo11024h(null);
            }
            try {
                return this.f25580x.mo10557c(t) && this.f26305c.mo11024h(t);
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
        public T poll() throws Exception {
            InterfaceC11319g<T> interfaceC11319g = this.f26307e;
            InterfaceC11292g<? super T> interfaceC11292g = this.f25580x;
            while (true) {
                T poll = interfaceC11319g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC11292g.mo10557c(poll)) {
                    return poll;
                }
                if (this.f26309w == 2) {
                    interfaceC11319g.mo1686e(1L);
                }
            }
        }
    }

    /* compiled from: FlowableFilter.java */
    /* renamed from: j.e.f0.e.b.h$b */
    /* loaded from: classes3.dex */
    static final class C11386b<T> extends AbstractC11643b<T, T> implements InterfaceC11313a<T> {

        /* renamed from: x */
        final InterfaceC11292g<? super T> f25581x;

        C11386b(InterfaceC14456b<? super T> interfaceC14456b, InterfaceC11292g<? super T> interfaceC11292g) {
            super(interfaceC14456b);
            this.f25581x = interfaceC11292g;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (mo11024h(t)) {
                return;
            }
            this.f26311d.mo1686e(1L);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11313a
        /* renamed from: h */
        public boolean mo11024h(T t) {
            if (this.f26313f) {
                return false;
            }
            if (this.f26314w != 0) {
                this.f26310c.mo1688f(null);
                return true;
            }
            try {
                boolean mo10557c = this.f25581x.mo10557c(t);
                if (mo10557c) {
                    this.f26310c.mo1688f(t);
                }
                return mo10557c;
            } catch (Throwable th) {
                m10688i(th);
                return true;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m10687j(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            InterfaceC11319g<T> interfaceC11319g = this.f26312e;
            InterfaceC11292g<? super T> interfaceC11292g = this.f25581x;
            while (true) {
                T poll = interfaceC11319g.poll();
                if (poll == null) {
                    return null;
                }
                if (interfaceC11292g.mo10557c(poll)) {
                    return poll;
                }
                if (this.f26314w == 2) {
                    interfaceC11319g.mo1686e(1L);
                }
            }
        }
    }

    public C11384h(AbstractC11293f<T> abstractC11293f, InterfaceC11292g<? super T> interfaceC11292g) {
        super(abstractC11293f);
        this.f25579e = interfaceC11292g;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        if (interfaceC14456b instanceof InterfaceC11313a) {
            this.f25499d.m11188K(new C11385a((InterfaceC11313a) interfaceC14456b, this.f25579e));
        } else {
            this.f25499d.m11188K(new C11386b(interfaceC14456b, this.f25579e));
        }
    }
}
