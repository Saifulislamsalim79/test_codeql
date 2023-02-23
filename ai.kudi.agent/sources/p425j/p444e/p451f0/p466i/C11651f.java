package p425j.p444e.p451f0.p466i;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p467j.C11657d;
import p577n.p586b.InterfaceC14457c;
/* compiled from: SubscriptionArbiter.java */
/* renamed from: j.e.f0.i.f */
/* loaded from: classes3.dex */
public class C11651f extends AtomicInteger implements InterfaceC14457c {

    /* renamed from: c */
    InterfaceC14457c f26331c;

    /* renamed from: d */
    long f26332d;

    /* renamed from: e */
    final AtomicReference<InterfaceC14457c> f26333e = new AtomicReference<>();

    /* renamed from: f */
    final AtomicLong f26334f = new AtomicLong();

    /* renamed from: w */
    final AtomicLong f26335w = new AtomicLong();

    /* renamed from: x */
    final boolean f26336x;

    /* renamed from: y */
    volatile boolean f26337y;

    /* renamed from: z */
    protected boolean f26338z;

    public C11651f(boolean z) {
        this.f26336x = z;
    }

    /* renamed from: c */
    final void m10680c() {
        if (getAndIncrement() != 0) {
            return;
        }
        m10679d();
    }

    @Override // p577n.p586b.InterfaceC14457c
    public void cancel() {
        if (this.f26337y) {
            return;
        }
        this.f26337y = true;
        m10680c();
    }

    /* renamed from: d */
    final void m10679d() {
        int i = 1;
        InterfaceC14457c interfaceC14457c = null;
        long j = 0;
        do {
            InterfaceC14457c interfaceC14457c2 = this.f26333e.get();
            if (interfaceC14457c2 != null) {
                interfaceC14457c2 = this.f26333e.getAndSet(null);
            }
            long j2 = this.f26334f.get();
            if (j2 != 0) {
                j2 = this.f26334f.getAndSet(0L);
            }
            long j3 = this.f26335w.get();
            if (j3 != 0) {
                j3 = this.f26335w.getAndSet(0L);
            }
            InterfaceC14457c interfaceC14457c3 = this.f26331c;
            if (this.f26337y) {
                if (interfaceC14457c3 != null) {
                    interfaceC14457c3.cancel();
                    this.f26331c = null;
                }
                if (interfaceC14457c2 != null) {
                    interfaceC14457c2.cancel();
                }
            } else {
                long j4 = this.f26332d;
                if (j4 != Long.MAX_VALUE) {
                    j4 = C11657d.m10655c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            EnumC11652g.m10672h(j4);
                            j4 = 0;
                        }
                    }
                    this.f26332d = j4;
                }
                if (interfaceC14457c2 != null) {
                    if (interfaceC14457c3 != null && this.f26336x) {
                        interfaceC14457c3.cancel();
                    }
                    this.f26331c = interfaceC14457c2;
                    if (j4 != 0) {
                        j = C11657d.m10655c(j, j4);
                        interfaceC14457c = interfaceC14457c2;
                    }
                } else if (interfaceC14457c3 != null && j2 != 0) {
                    j = C11657d.m10655c(j, j2);
                    interfaceC14457c = interfaceC14457c3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            interfaceC14457c.mo1686e(j);
        }
    }

    @Override // p577n.p586b.InterfaceC14457c
    /* renamed from: e */
    public final void mo1686e(long j) {
        if (!EnumC11652g.m10669m(j) || this.f26338z) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.f26332d;
            if (j2 != Long.MAX_VALUE) {
                long m10655c = C11657d.m10655c(j2, j);
                this.f26332d = m10655c;
                if (m10655c == Long.MAX_VALUE) {
                    this.f26338z = true;
                }
            }
            InterfaceC14457c interfaceC14457c = this.f26331c;
            if (decrementAndGet() != 0) {
                m10679d();
            }
            if (interfaceC14457c != null) {
                interfaceC14457c.mo1686e(j);
                return;
            }
            return;
        }
        C11657d.m10657a(this.f26334f, j);
        m10680c();
    }

    /* renamed from: i */
    public final boolean m10678i() {
        return this.f26338z;
    }

    /* renamed from: j */
    public final void m10677j(long j) {
        if (this.f26338z) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.f26332d;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    EnumC11652g.m10672h(j3);
                    j3 = 0;
                }
                this.f26332d = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            m10679d();
            return;
        }
        C11657d.m10657a(this.f26335w, j);
        m10680c();
    }

    /* renamed from: k */
    public final void m10676k(InterfaceC14457c interfaceC14457c) {
        if (this.f26337y) {
            interfaceC14457c.cancel();
            return;
        }
        C11312b.m11113d(interfaceC14457c, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC14457c interfaceC14457c2 = this.f26331c;
            if (interfaceC14457c2 != null && this.f26336x) {
                interfaceC14457c2.cancel();
            }
            this.f26331c = interfaceC14457c;
            long j = this.f26332d;
            if (decrementAndGet() != 0) {
                m10679d();
            }
            if (j != 0) {
                interfaceC14457c.mo1686e(j);
                return;
            }
            return;
        }
        InterfaceC14457c andSet = this.f26333e.getAndSet(interfaceC14457c);
        if (andSet != null && this.f26336x) {
            andSet.cancel();
        }
        m10680c();
    }
}
