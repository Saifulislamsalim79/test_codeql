package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.j0.a;
import j.e.v;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p451f0.p452a.C11300g;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p452a.InterfaceC11295b;
import p425j.p444e.p451f0.p463f.C11605a;
import p425j.p444e.v$b;
/* compiled from: ExecutorScheduler.java */
/* renamed from: j.e.f0.g.d */
/* loaded from: classes3.dex */
public final class C11615d extends v {

    /* renamed from: c */
    static final v f26228c = a.e();

    /* renamed from: a */
    final boolean f26229a;

    /* renamed from: b */
    final Executor f26230b;

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: j.e.f0.g.d$a */
    /* loaded from: classes3.dex */
    final class RunnableC11616a implements Runnable {

        /* renamed from: c */
        private final RunnableC11617b f26231c;

        RunnableC11616a(RunnableC11617b runnableC11617b) {
            this.f26231c = runnableC11617b;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC11617b runnableC11617b = this.f26231c;
            runnableC11617b.f26234d.m11130a(C11615d.this.m10744b(runnableC11617b));
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: j.e.f0.g.d$b */
    /* loaded from: classes3.dex */
    static final class RunnableC11617b extends AtomicReference<Runnable> implements Runnable, c {

        /* renamed from: c */
        final C11300g f26233c;

        /* renamed from: d */
        final C11300g f26234d;

        RunnableC11617b(Runnable runnable) {
            super(runnable);
            this.f26233c = new C11300g();
            this.f26234d = new C11300g();
        }

        /* renamed from: i */
        public void m10742i() {
            if (getAndSet(null) != null) {
                this.f26233c.m11128i();
                this.f26234d.m11128i();
            }
        }

        /* renamed from: j */
        public boolean m10741j() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f26233c.lazySet(EnumC11296c.DISPOSED);
                    this.f26234d.lazySet(EnumC11296c.DISPOSED);
                }
            }
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: j.e.f0.g.d$c */
    /* loaded from: classes3.dex */
    public static final class RunnableC11618c extends v$b implements Runnable {

        /* renamed from: c */
        final boolean f26235c;

        /* renamed from: d */
        final Executor f26236d;

        /* renamed from: f */
        volatile boolean f26238f;

        /* renamed from: w */
        final AtomicInteger f26239w = new AtomicInteger();

        /* renamed from: x */
        final C11280b f26240x = new C11280b();

        /* renamed from: e */
        final C11605a<Runnable> f26237e = new C11605a<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExecutorScheduler.java */
        /* renamed from: j.e.f0.g.d$c$a */
        /* loaded from: classes3.dex */
        public static final class RunnableC11619a extends AtomicBoolean implements Runnable, c {

            /* renamed from: c */
            final Runnable f26241c;

            RunnableC11619a(Runnable runnable) {
                this.f26241c = runnable;
            }

            /* renamed from: i */
            public void m10738i() {
                lazySet(true);
            }

            /* renamed from: j */
            public boolean m10737j() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f26241c.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExecutorScheduler.java */
        /* renamed from: j.e.f0.g.d$c$b */
        /* loaded from: classes3.dex */
        public static final class RunnableC11620b extends AtomicInteger implements Runnable, c {

            /* renamed from: c */
            final Runnable f26242c;

            /* renamed from: d */
            final InterfaceC11295b f26243d;

            /* renamed from: e */
            volatile Thread f26244e;

            RunnableC11620b(Runnable runnable, InterfaceC11295b interfaceC11295b) {
                this.f26242c = runnable;
                this.f26243d = interfaceC11295b;
            }

            /* renamed from: a */
            void m10736a() {
                InterfaceC11295b interfaceC11295b = this.f26243d;
                if (interfaceC11295b != null) {
                    interfaceC11295b.mo11135c(this);
                }
            }

            /* renamed from: i */
            public void m10735i() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m10736a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f26244e;
                        if (thread != null) {
                            thread.interrupt();
                            this.f26244e = null;
                        }
                        set(4);
                        m10736a();
                        return;
                    }
                }
            }

            /* renamed from: j */
            public boolean m10734j() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f26244e = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f26242c.run();
                            this.f26244e = null;
                            if (compareAndSet(1, 2)) {
                                m10736a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th) {
                            this.f26244e = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                m10736a();
                            }
                            throw th;
                        }
                    }
                    this.f26244e = null;
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: j.e.f0.g.d$c$c */
        /* loaded from: classes3.dex */
        final class RunnableC11621c implements Runnable {

            /* renamed from: c */
            private final C11300g f26245c;

            /* renamed from: d */
            private final Runnable f26246d;

            RunnableC11621c(C11300g c11300g, Runnable runnable) {
                this.f26245c = c11300g;
                this.f26246d = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f26245c.m11130a(RunnableC11618c.this.mo10448b(this.f26246d));
            }
        }

        public RunnableC11618c(Executor executor, boolean z) {
            this.f26236d = executor;
            this.f26235c = z;
        }

        @Override // p425j.p444e.v$b
        /* renamed from: b */
        public c mo10448b(Runnable runnable) {
            c runnableC11619a;
            if (this.f26238f) {
                return EnumC11297d.INSTANCE;
            }
            Runnable u = j.e.i0.a.u(runnable);
            if (this.f26235c) {
                runnableC11619a = new RunnableC11620b(u, this.f26240x);
                this.f26240x.mo11136b(runnableC11619a);
            } else {
                runnableC11619a = new RunnableC11619a(u);
            }
            this.f26237e.offer(runnableC11619a);
            if (this.f26239w.getAndIncrement() == 0) {
                try {
                    this.f26236d.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f26238f = true;
                    this.f26237e.clear();
                    j.e.i0.a.r(e);
                    return EnumC11297d.INSTANCE;
                }
            }
            return runnableC11619a;
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo10448b(runnable);
            }
            if (this.f26238f) {
                return EnumC11297d.INSTANCE;
            }
            C11300g c11300g = new C11300g();
            C11300g c11300g2 = new C11300g(c11300g);
            RunnableC11631j runnableC11631j = new RunnableC11631j(new RunnableC11621c(c11300g2, j.e.i0.a.u(runnable)), this.f26240x);
            this.f26240x.mo11136b(runnableC11631j);
            Executor executor = this.f26236d;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    runnableC11631j.m10715a(((ScheduledExecutorService) executor).schedule((Callable) runnableC11631j, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f26238f = true;
                    j.e.i0.a.r(e);
                    return EnumC11297d.INSTANCE;
                }
            } else {
                runnableC11631j.m10715a(new FutureC11614c(C11615d.f26228c.c(runnableC11631j, j, timeUnit)));
            }
            c11300g.m11130a(runnableC11631j);
            return c11300g2;
        }

        /* renamed from: i */
        public void m10740i() {
            if (this.f26238f) {
                return;
            }
            this.f26238f = true;
            this.f26240x.m11212i();
            if (this.f26239w.getAndIncrement() == 0) {
                this.f26237e.clear();
            }
        }

        /* renamed from: j */
        public boolean m10739j() {
            return this.f26238f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r3.f26238f == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            r0.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
            r1 = r3.f26239w.addAndGet(-r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r1 != 0) goto L2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
                j.e.f0.f.a<java.lang.Runnable> r0 = r3.f26237e
                r1 = 1
            L3:
                boolean r2 = r3.f26238f
                if (r2 == 0) goto Lb
                r0.clear()
                return
            Lb:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L25
                boolean r2 = r3.f26238f
                if (r2 == 0) goto L1b
                r0.clear()
                return
            L1b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f26239w
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L3
                return
            L25:
                r2.run()
                boolean r2 = r3.f26238f
                if (r2 == 0) goto Lb
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p464g.C11615d.RunnableC11618c.run():void");
        }
    }

    public C11615d(Executor executor, boolean z) {
        this.f26230b = executor;
        this.f26229a = z;
    }

    /* renamed from: a */
    public v$b m10745a() {
        return new RunnableC11618c(this.f26230b, this.f26229a);
    }

    /* renamed from: b */
    public c m10744b(Runnable runnable) {
        Runnable u = j.e.i0.a.u(runnable);
        try {
            if (this.f26230b instanceof ExecutorService) {
                CallableC11630i callableC11630i = new CallableC11630i(u);
                callableC11630i.m10756a(((ExecutorService) this.f26230b).submit(callableC11630i));
                return callableC11630i;
            } else if (this.f26229a) {
                RunnableC11618c.RunnableC11620b runnableC11620b = new RunnableC11618c.RunnableC11620b(u, null);
                this.f26230b.execute(runnableC11620b);
                return runnableC11620b;
            } else {
                RunnableC11618c.RunnableC11619a runnableC11619a = new RunnableC11618c.RunnableC11619a(u);
                this.f26230b.execute(runnableC11619a);
                return runnableC11619a;
            }
        } catch (RejectedExecutionException e) {
            j.e.i0.a.r(e);
            return EnumC11297d.INSTANCE;
        }
    }

    /* renamed from: c */
    public c m10743c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable u = j.e.i0.a.u(runnable);
        if (this.f26230b instanceof ScheduledExecutorService) {
            try {
                CallableC11630i callableC11630i = new CallableC11630i(u);
                callableC11630i.m10756a(((ScheduledExecutorService) this.f26230b).schedule(callableC11630i, j, timeUnit));
                return callableC11630i;
            } catch (RejectedExecutionException e) {
                j.e.i0.a.r(e);
                return EnumC11297d.INSTANCE;
            }
        }
        RunnableC11617b runnableC11617b = new RunnableC11617b(u);
        runnableC11617b.f26233c.m11130a(f26228c.c(new RunnableC11616a(runnableC11617b), j, timeUnit));
        return runnableC11617b;
    }
}
