package p425j.p444e.p451f0.p456e.p458b;

import j.e.v;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p425j.p444e.v$b;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowableSubscribeOn.java */
/* renamed from: j.e.f0.e.b.z */
/* loaded from: classes3.dex */
public final class C11429z<T> extends AbstractC11351a<T, T> {

    /* renamed from: e */
    final v f25734e;

    /* renamed from: f */
    final boolean f25735f;

    /* compiled from: FlowableSubscribeOn.java */
    /* renamed from: j.e.f0.e.b.z$a */
    /* loaded from: classes3.dex */
    static final class RunnableC11430a<T> extends AtomicReference<Thread> implements InterfaceC11676j<T>, InterfaceC14457c, Runnable {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25736c;

        /* renamed from: d */
        final v$b f25737d;

        /* renamed from: e */
        final AtomicReference<InterfaceC14457c> f25738e = new AtomicReference<>();

        /* renamed from: f */
        final AtomicLong f25739f = new AtomicLong();

        /* renamed from: w */
        final boolean f25740w;

        /* renamed from: x */
        InterfaceC14455a<T> f25741x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: j.e.f0.e.b.z$a$a */
        /* loaded from: classes3.dex */
        public static final class RunnableC11431a implements Runnable {

            /* renamed from: c */
            final InterfaceC14457c f25742c;

            /* renamed from: d */
            final long f25743d;

            RunnableC11431a(InterfaceC14457c interfaceC14457c, long j) {
                this.f25742c = interfaceC14457c;
                this.f25743d = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25742c.mo1686e(this.f25743d);
            }
        }

        RunnableC11430a(InterfaceC14456b<? super T> interfaceC14456b, v$b v_b, InterfaceC14455a<T> interfaceC14455a, boolean z) {
            this.f25736c = interfaceC14456b;
            this.f25737d = v_b;
            this.f25741x = interfaceC14455a;
            this.f25740w = !z;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            this.f25736c.mo1690a();
            this.f25737d.i();
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            this.f25736c.mo1689b(th);
            this.f25737d.i();
        }

        /* renamed from: c */
        void m11004c(long j, InterfaceC14457c interfaceC14457c) {
            if (!this.f25740w && Thread.currentThread() != get()) {
                this.f25737d.mo10448b(new RunnableC11431a(interfaceC14457c, j));
            } else {
                interfaceC14457c.mo1686e(j);
            }
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            EnumC11652g.m10675a(this.f25738e);
            this.f25737d.i();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                InterfaceC14457c interfaceC14457c = this.f25738e.get();
                if (interfaceC14457c != null) {
                    m11004c(j, interfaceC14457c);
                    return;
                }
                C11657d.m10657a(this.f25739f, j);
                InterfaceC14457c interfaceC14457c2 = this.f25738e.get();
                if (interfaceC14457c2 != null) {
                    long andSet = this.f25739f.getAndSet(0L);
                    if (andSet != 0) {
                        m11004c(andSet, interfaceC14457c2);
                    }
                }
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            this.f25736c.mo1688f(t);
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10670j(this.f25738e, interfaceC14457c)) {
                long andSet = this.f25739f.getAndSet(0L);
                if (andSet != 0) {
                    m11004c(andSet, interfaceC14457c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            InterfaceC14455a<T> interfaceC14455a = this.f25741x;
            this.f25741x = null;
            interfaceC14455a.mo1691a(this);
        }
    }

    public C11429z(AbstractC11293f<T> abstractC11293f, v vVar, boolean z) {
        super(abstractC11293f);
        this.f25734e = vVar;
        this.f25735f = z;
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    public void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        v$b a = this.f25734e.a();
        RunnableC11430a runnableC11430a = new RunnableC11430a(interfaceC14456b, a, this.f25499d, this.f25735f);
        interfaceC14456b.mo1687g(runnableC11430a);
        a.mo10448b(runnableC11430a);
    }
}
