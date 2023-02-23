package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.CompositeException;
import j.e.e0.e;
import j.e.i0.a;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p454c.InterfaceC11313a;
import p425j.p444e.p451f0.p465h.AbstractC11642a;
import p425j.p444e.p451f0.p465h.AbstractC11643b;
import p425j.p444e.p451f0.p467j.C11661h;
import p577n.p586b.InterfaceC14456b;
/* compiled from: FlowableDoOnEach.java */
/* renamed from: j.e.f0.e.b.d */
/* loaded from: classes3.dex */
public final class C11376d<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final e<? super T> f25550e;

    /* renamed from: f */
    final e<? super Throwable> f25551f;

    /* renamed from: w */
    final InterfaceC11287a f25552w;

    /* renamed from: x */
    final InterfaceC11287a f25553x;

    /* compiled from: FlowableDoOnEach.java */
    /* renamed from: j.e.f0.e.b.d$a */
    /* loaded from: classes3.dex */
    static final class C11377a<T> extends AbstractC11642a<T, T> {

        /* renamed from: A */
        final InterfaceC11287a f25554A;

        /* renamed from: x */
        final e<? super T> f25555x;

        /* renamed from: y */
        final e<? super Throwable> f25556y;

        /* renamed from: z */
        final InterfaceC11287a f25557z;

        C11377a(InterfaceC11313a<? super T> interfaceC11313a, e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
            super(interfaceC11313a);
            this.f25555x = eVar;
            this.f25556y = eVar2;
            this.f25557z = interfaceC11287a;
            this.f25554A = interfaceC11287a2;
        }

        @Override // p425j.p444e.p451f0.p465h.AbstractC11642a, p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f26308f) {
                return;
            }
            try {
                this.f25557z.run();
                this.f26308f = true;
                this.f26305c.mo1690a();
                try {
                    this.f25554A.run();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    a.r(th);
                }
            } catch (Throwable th2) {
                m10692i(th2);
            }
        }

        @Override // p425j.p444e.p451f0.p465h.AbstractC11642a, p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f26308f) {
                a.r(th);
                return;
            }
            boolean z = true;
            this.f26308f = true;
            try {
                this.f25556y.accept(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f26305c.mo1689b(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f26305c.mo1689b(th);
            }
            try {
                this.f25554A.run();
            } catch (Throwable th3) {
                C11118a.m11646b(th3);
                a.r(th3);
            }
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
                this.f25555x.accept(t);
                this.f26305c.mo1688f(t);
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
                this.f25555x.accept(t);
                return this.f26305c.mo11024h(t);
            } catch (Throwable th) {
                m10692i(th);
                return false;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            return m10691j(i);
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            try {
                T poll = this.f26307e.poll();
                if (poll != null) {
                    try {
                        this.f25555x.accept(poll);
                    } catch (Throwable th) {
                        try {
                            C11118a.m11646b(th);
                            this.f25556y.accept(th);
                            throw C11661h.m10647c(th);
                        } finally {
                            this.f25554A.run();
                        }
                    }
                } else if (this.f26309w == 1) {
                    this.f25557z.run();
                }
                return poll;
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                try {
                    this.f25556y.accept(th2);
                    throw C11661h.m10647c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }
    }

    /* compiled from: FlowableDoOnEach.java */
    /* renamed from: j.e.f0.e.b.d$b */
    /* loaded from: classes3.dex */
    static final class C11378b<T> extends AbstractC11643b<T, T> {

        /* renamed from: A */
        final InterfaceC11287a f25558A;

        /* renamed from: x */
        final e<? super T> f25559x;

        /* renamed from: y */
        final e<? super Throwable> f25560y;

        /* renamed from: z */
        final InterfaceC11287a f25561z;

        C11378b(InterfaceC14456b<? super T> interfaceC14456b, e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
            super(interfaceC14456b);
            this.f25559x = eVar;
            this.f25560y = eVar2;
            this.f25561z = interfaceC11287a;
            this.f25558A = interfaceC11287a2;
        }

        @Override // p425j.p444e.p451f0.p465h.AbstractC11643b, p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f26313f) {
                return;
            }
            try {
                this.f25561z.run();
                this.f26313f = true;
                this.f26310c.mo1690a();
                try {
                    this.f25558A.run();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    a.r(th);
                }
            } catch (Throwable th2) {
                m10688i(th2);
            }
        }

        @Override // p425j.p444e.p451f0.p465h.AbstractC11643b, p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f26313f) {
                a.r(th);
                return;
            }
            boolean z = true;
            this.f26313f = true;
            try {
                this.f25560y.accept(th);
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                this.f26310c.mo1689b(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f26310c.mo1689b(th);
            }
            try {
                this.f25558A.run();
            } catch (Throwable th3) {
                C11118a.m11646b(th3);
                a.r(th3);
            }
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
                this.f25559x.accept(t);
                this.f26310c.mo1688f(t);
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
        public T poll() throws Exception {
            try {
                T poll = this.f26312e.poll();
                if (poll != null) {
                    try {
                        this.f25559x.accept(poll);
                    } catch (Throwable th) {
                        try {
                            C11118a.m11646b(th);
                            this.f25560y.accept(th);
                            throw C11661h.m10647c(th);
                        } finally {
                            this.f25558A.run();
                        }
                    }
                } else if (this.f26314w == 1) {
                    this.f25561z.run();
                }
                return poll;
            } catch (Throwable th2) {
                C11118a.m11646b(th2);
                try {
                    this.f25560y.accept(th2);
                    throw C11661h.m10647c(th2);
                } catch (Throwable th3) {
                    throw new CompositeException(th2, th3);
                }
            }
        }
    }

    public C11376d(AbstractC11293f<T> abstractC11293f, e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
        super(abstractC11293f);
        this.f25550e = eVar;
        this.f25551f = eVar2;
        this.f25552w = interfaceC11287a;
        this.f25553x = interfaceC11287a2;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        if (interfaceC14456b instanceof InterfaceC11313a) {
            this.f25499d.m11188K(new C11377a((InterfaceC11313a) interfaceC14456b, this.f25550e, this.f25551f, this.f25552w, this.f25553x));
        } else {
            this.f25499d.m11188K(new C11378b(interfaceC14456b, this.f25550e, this.f25551f, this.f25552w, this.f25553x));
        }
    }
}
