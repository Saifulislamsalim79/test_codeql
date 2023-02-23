package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p451f0.p454c.InterfaceC11321i;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p463f.C11608c;
import p425j.p444e.p451f0.p466i.AbstractC11646a;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableOnBackpressureBuffer.java */
/* renamed from: j.e.f0.e.b.t */
/* loaded from: classes3.dex */
public final class C11415t<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final int f25684e;

    /* renamed from: f */
    final boolean f25685f;

    /* renamed from: w */
    final boolean f25686w;

    /* renamed from: x */
    final InterfaceC11287a f25687x;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* renamed from: j.e.f0.e.b.t$a */
    /* loaded from: classes3.dex */
    static final class C11416a<T> extends AbstractC11646a<T> implements InterfaceC11676j<T> {

        /* renamed from: A */
        final AtomicLong f25688A = new AtomicLong();

        /* renamed from: B */
        boolean f25689B;

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25690c;

        /* renamed from: d */
        final InterfaceC11321i<T> f25691d;

        /* renamed from: e */
        final boolean f25692e;

        /* renamed from: f */
        final InterfaceC11287a f25693f;

        /* renamed from: w */
        InterfaceC14457c f25694w;

        /* renamed from: x */
        volatile boolean f25695x;

        /* renamed from: y */
        volatile boolean f25696y;

        /* renamed from: z */
        Throwable f25697z;

        C11416a(InterfaceC14456b<? super T> interfaceC14456b, int i, boolean z, boolean z2, InterfaceC11287a interfaceC11287a) {
            InterfaceC11321i<T> c11607b;
            this.f25690c = interfaceC14456b;
            this.f25693f = interfaceC11287a;
            this.f25692e = z2;
            if (z) {
                c11607b = new C11608c<>(i);
            } else {
                c11607b = new C11607b<>(i);
            }
            this.f25691d = c11607b;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25696y = true;
            if (this.f25689B) {
                this.f25690c.mo1690a();
            } else {
                m11017j();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f25697z = th;
            this.f25696y = true;
            if (this.f25689B) {
                this.f25690c.mo1689b(th);
            } else {
                m11017j();
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            if (this.f25695x) {
                return;
            }
            this.f25695x = true;
            this.f25694w.cancel();
            if (getAndIncrement() == 0) {
                this.f25691d.clear();
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public void clear() {
            this.f25691d.clear();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (this.f25689B || !EnumC11652g.m10669m(j)) {
                return;
            }
            C11657d.m10657a(this.f25688A, j);
            m11017j();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (!this.f25691d.offer(t)) {
                this.f25694w.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f25693f.run();
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    missingBackpressureException.initCause(th);
                }
                mo1689b(missingBackpressureException);
            } else if (this.f25689B) {
                this.f25690c.mo1688f(null);
            } else {
                m11017j();
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10668n(this.f25694w, interfaceC14457c)) {
                this.f25694w = interfaceC14457c;
                this.f25690c.mo1687g(this);
                interfaceC14457c.mo1686e(Long.MAX_VALUE);
            }
        }

        /* renamed from: i */
        boolean m11018i(boolean z, boolean z2, InterfaceC14456b<? super T> interfaceC14456b) {
            if (this.f25695x) {
                this.f25691d.clear();
                return true;
            } else if (z) {
                if (this.f25692e) {
                    if (z2) {
                        Throwable th = this.f25697z;
                        if (th != null) {
                            interfaceC14456b.mo1689b(th);
                        } else {
                            interfaceC14456b.mo1690a();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f25697z;
                if (th2 != null) {
                    this.f25691d.clear();
                    interfaceC14456b.mo1689b(th2);
                    return true;
                } else if (z2) {
                    interfaceC14456b.mo1690a();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public boolean isEmpty() {
            return this.f25691d.isEmpty();
        }

        /* renamed from: j */
        void m11017j() {
            if (getAndIncrement() == 0) {
                InterfaceC11321i<T> interfaceC11321i = this.f25691d;
                InterfaceC14456b<? super T> interfaceC14456b = this.f25690c;
                int i = 1;
                while (!m11018i(this.f25696y, interfaceC11321i.isEmpty(), interfaceC14456b)) {
                    long j = this.f25688A.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f25696y;
                        Object obj = (T) interfaceC11321i.poll();
                        boolean z2 = obj == null;
                        if (m11018i(z, z2, interfaceC14456b)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        interfaceC14456b.mo1688f(obj);
                        j2++;
                    }
                    if (j2 == j && m11018i(this.f25696y, interfaceC11321i.isEmpty(), interfaceC14456b)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.f25688A.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11318f
        /* renamed from: m */
        public int mo10681m(int i) {
            if ((i & 2) != 0) {
                this.f25689B = true;
                return 2;
            }
            return 0;
        }

        @Override // p425j.p444e.p451f0.p454c.InterfaceC11322j
        public T poll() throws Exception {
            return this.f25691d.poll();
        }
    }

    public C11415t(AbstractC11293f<T> abstractC11293f, int i, boolean z, boolean z2, InterfaceC11287a interfaceC11287a) {
        super(abstractC11293f);
        this.f25684e = i;
        this.f25685f = z;
        this.f25686w = z2;
        this.f25687x = interfaceC11287a;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25499d.m11188K(new C11416a(interfaceC14456b, this.f25684e, this.f25685f, this.f25686w, this.f25687x));
    }
}
