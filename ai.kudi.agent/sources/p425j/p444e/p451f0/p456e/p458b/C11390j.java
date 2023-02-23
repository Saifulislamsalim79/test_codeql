package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11656c;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableFlatMapMaybe.java */
/* renamed from: j.e.f0.e.b.j */
/* loaded from: classes3.dex */
public final class C11390j<T, R> extends AbstractC11351a<T, R> {

    /* renamed from: e */
    final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f25613e;

    /* renamed from: f */
    final boolean f25614f;

    /* renamed from: w */
    final int f25615w;

    /* compiled from: FlowableFlatMapMaybe.java */
    /* renamed from: j.e.f0.e.b.j$a */
    /* loaded from: classes3.dex */
    static final class C11391a<T, R> extends AtomicInteger implements InterfaceC11676j<T>, InterfaceC14457c {

        /* renamed from: B */
        InterfaceC14457c f25617B;

        /* renamed from: C */
        volatile boolean f25618C;

        /* renamed from: c */
        final InterfaceC14456b<? super R> f25619c;

        /* renamed from: d */
        final boolean f25620d;

        /* renamed from: e */
        final int f25621e;

        /* renamed from: z */
        final InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> f25626z;

        /* renamed from: f */
        final AtomicLong f25622f = new AtomicLong();

        /* renamed from: w */
        final C11280b f25623w = new C11280b();

        /* renamed from: y */
        final C11656c f25625y = new C11656c();

        /* renamed from: x */
        final AtomicInteger f25624x = new AtomicInteger(1);

        /* renamed from: A */
        final AtomicReference<C11608c<R>> f25616A = new AtomicReference<>();

        /* compiled from: FlowableFlatMapMaybe.java */
        /* renamed from: j.e.f0.e.b.j$a$a */
        /* loaded from: classes3.dex */
        final class C11392a extends AtomicReference<c> implements InterfaceC11685m<R>, c {
            C11392a() {
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: a */
            public void mo10551a() {
                C11391a.this.m11038k(this);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: b */
            public void mo10550b(Throwable th) {
                C11391a.this.m11037l(this, th);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: c */
            public void mo10549c(R r) {
                C11391a.this.m11036m(this, r);
            }

            @Override // p425j.p444e.InterfaceC11685m
            /* renamed from: d */
            public void mo10548d(c cVar) {
                EnumC11296c.m11149m(this, cVar);
            }

            /* renamed from: i */
            public void m11035i() {
                EnumC11296c.m11156a(this);
            }

            /* renamed from: j */
            public boolean m11034j() {
                return EnumC11296c.m11155b(get());
            }
        }

        C11391a(InterfaceC14456b<? super R> interfaceC14456b, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z, int i) {
            this.f25619c = interfaceC14456b;
            this.f25626z = interfaceC11291f;
            this.f25620d = z;
            this.f25621e = i;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25624x.decrementAndGet();
            m11041d();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f25624x.decrementAndGet();
            if (this.f25625y.m10659a(th)) {
                if (!this.f25620d) {
                    this.f25623w.m11212i();
                }
                m11041d();
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        void m11042c() {
            C11608c<R> c11608c = this.f25616A.get();
            if (c11608c != null) {
                c11608c.clear();
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            this.f25618C = true;
            this.f25617B.cancel();
            this.f25623w.m11212i();
        }

        /* renamed from: d */
        void m11041d() {
            if (getAndIncrement() == 0) {
                m11040i();
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10657a(this.f25622f, j);
                m11041d();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            try {
                InterfaceC11687o<? extends R> mo10663a = this.f25626z.mo10663a(t);
                C11312b.m11113d(mo10663a, "The mapper returned a null MaybeSource");
                InterfaceC11687o<? extends R> interfaceC11687o = mo10663a;
                this.f25624x.getAndIncrement();
                C11392a c11392a = new C11392a();
                if (this.f25618C || !this.f25623w.mo11136b(c11392a)) {
                    return;
                }
                interfaceC11687o.mo10546a(c11392a);
            } catch (Throwable th) {
                C11118a.m11646b(th);
                this.f25617B.cancel();
                mo1689b(th);
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25617B, interfaceC14457c)) {
                this.f25617B = interfaceC14457c;
                this.f25619c.mo1687g(this);
                int i = this.f25621e;
                if (i == Integer.MAX_VALUE) {
                    interfaceC14457c.mo1686e(Long.MAX_VALUE);
                } else {
                    interfaceC14457c.mo1686e(i);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
            if (r9 != r5) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
            if (r15.f25618C == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
            m11042c();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
            if (r15.f25620d != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
            if (r15.f25625y.get() == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
            r1 = r15.f25625y.m10658b();
            m11042c();
            r0.mo1689b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
            if (r1.get() != 0) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
            r6 = r2.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
            if (r6 == null) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00af, code lost:
            if (r6.isEmpty() == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
            if (r5 == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
            if (r11 == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00b6, code lost:
            r1 = r15.f25625y.m10658b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
            if (r1 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00be, code lost:
            r0.mo1689b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c2, code lost:
            r0.mo1690a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00c8, code lost:
            if (r9 == 0) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
            p425j.p444e.p451f0.p467j.C11657d.m10654d(r15.f25622f, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
            if (r15.f25621e == Integer.MAX_VALUE) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
            r15.f25617B.mo1686e(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00db, code lost:
            r4 = addAndGet(-r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
            return;
         */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m11040i() {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p458b.C11390j.C11391a.m11040i():void");
        }

        /* renamed from: j */
        C11608c<R> m11039j() {
            C11608c<R> c11608c;
            do {
                C11608c<R> c11608c2 = this.f25616A.get();
                if (c11608c2 != null) {
                    return c11608c2;
                }
                c11608c = new C11608c<>(AbstractC11293f.m11182c());
            } while (!this.f25616A.compareAndSet(null, c11608c));
            return c11608c;
        }

        /* renamed from: k */
        void m11038k(C11391a<T, R>.C11392a c11392a) {
            this.f25623w.mo11135c(c11392a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f25624x.decrementAndGet() == 0;
                    C11608c<R> c11608c = this.f25616A.get();
                    if (z && (c11608c == null || c11608c.isEmpty())) {
                        Throwable m10658b = this.f25625y.m10658b();
                        if (m10658b != null) {
                            this.f25619c.mo1689b(m10658b);
                            return;
                        } else {
                            this.f25619c.mo1690a();
                            return;
                        }
                    }
                    if (this.f25621e != Integer.MAX_VALUE) {
                        this.f25617B.mo1686e(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m11040i();
                    return;
                }
            }
            this.f25624x.decrementAndGet();
            if (this.f25621e != Integer.MAX_VALUE) {
                this.f25617B.mo1686e(1L);
            }
            m11041d();
        }

        /* renamed from: l */
        void m11037l(C11391a<T, R>.C11392a c11392a, Throwable th) {
            this.f25623w.mo11135c(c11392a);
            if (this.f25625y.m10659a(th)) {
                if (!this.f25620d) {
                    this.f25617B.cancel();
                    this.f25623w.m11212i();
                } else if (this.f25621e != Integer.MAX_VALUE) {
                    this.f25617B.mo1686e(1L);
                }
                this.f25624x.decrementAndGet();
                m11041d();
                return;
            }
            a.r(th);
        }

        /* renamed from: m */
        void m11036m(C11391a<T, R>.C11392a c11392a, R r) {
            this.f25623w.mo11135c(c11392a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f25624x.decrementAndGet() == 0;
                    if (this.f25622f.get() != 0) {
                        this.f25619c.mo1688f(r);
                        C11608c<R> c11608c = this.f25616A.get();
                        if (z && (c11608c == null || c11608c.isEmpty())) {
                            Throwable m10658b = this.f25625y.m10658b();
                            if (m10658b != null) {
                                this.f25619c.mo1689b(m10658b);
                                return;
                            } else {
                                this.f25619c.mo1690a();
                                return;
                            }
                        }
                        C11657d.m10654d(this.f25622f, 1L);
                        if (this.f25621e != Integer.MAX_VALUE) {
                            this.f25617B.mo1686e(1L);
                        }
                    } else {
                        C11608c<R> m11039j = m11039j();
                        synchronized (m11039j) {
                            m11039j.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m11040i();
                }
            }
            C11608c<R> m11039j2 = m11039j();
            synchronized (m11039j2) {
                m11039j2.offer(r);
            }
            this.f25624x.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m11040i();
        }
    }

    public C11390j(AbstractC11293f<T> abstractC11293f, InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z, int i) {
        super(abstractC11293f);
        this.f25613e = interfaceC11291f;
        this.f25614f = z;
        this.f25615w = i;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super R> interfaceC14456b) {
        this.f25499d.m11188K(new C11391a(interfaceC14456b, this.f25613e, this.f25614f, this.f25615w));
    }
}
