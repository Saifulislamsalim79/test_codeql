package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.v;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.v$b;
/* compiled from: IoScheduler.java */
/* renamed from: j.e.f0.g.e */
/* loaded from: classes3.dex */
public final class C11622e extends v {

    /* renamed from: c */
    static final ThreadFactoryC11628h f26248c;

    /* renamed from: d */
    static final ThreadFactoryC11628h f26249d;

    /* renamed from: g */
    static final C11625c f26252g;

    /* renamed from: h */
    static final RunnableC11623a f26253h;

    /* renamed from: a */
    final ThreadFactory f26254a;

    /* renamed from: b */
    final AtomicReference<RunnableC11623a> f26255b;

    /* renamed from: f */
    private static final TimeUnit f26251f = TimeUnit.SECONDS;

    /* renamed from: e */
    private static final long f26250e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: j.e.f0.g.e$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC11623a implements Runnable {

        /* renamed from: c */
        private final long f26256c;

        /* renamed from: d */
        private final ConcurrentLinkedQueue<C11625c> f26257d;

        /* renamed from: e */
        final C11280b f26258e;

        /* renamed from: f */
        private final ScheduledExecutorService f26259f;

        /* renamed from: w */
        private final Future<?> f26260w;

        /* renamed from: x */
        private final ThreadFactory f26261x;

        RunnableC11623a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f26256c = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f26257d = new ConcurrentLinkedQueue<>();
            this.f26258e = new C11280b();
            this.f26261x = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C11622e.f26249d);
                long j2 = this.f26256c;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f26259f = scheduledExecutorService;
            this.f26260w = scheduledFuture;
        }

        /* renamed from: a */
        void m10731a() {
            if (this.f26257d.isEmpty()) {
                return;
            }
            long m10729c = m10729c();
            Iterator<C11625c> it = this.f26257d.iterator();
            while (it.hasNext()) {
                C11625c next = it.next();
                if (next.m10724g() > m10729c) {
                    return;
                }
                if (this.f26257d.remove(next)) {
                    this.f26258e.mo11137a(next);
                }
            }
        }

        /* renamed from: b */
        C11625c m10730b() {
            if (this.f26258e.m11211j()) {
                return C11622e.f26252g;
            }
            while (!this.f26257d.isEmpty()) {
                C11625c poll = this.f26257d.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C11625c c11625c = new C11625c(this.f26261x);
            this.f26258e.mo11136b(c11625c);
            return c11625c;
        }

        /* renamed from: c */
        long m10729c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m10728d(C11625c c11625c) {
            c11625c.m10723h(m10729c() + this.f26256c);
            this.f26257d.offer(c11625c);
        }

        /* renamed from: e */
        void m10727e() {
            this.f26258e.m11212i();
            Future<?> future = this.f26260w;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f26259f;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m10731a();
        }
    }

    /* compiled from: IoScheduler.java */
    /* renamed from: j.e.f0.g.e$b */
    /* loaded from: classes3.dex */
    static final class C11624b extends v$b {

        /* renamed from: d */
        private final RunnableC11623a f26263d;

        /* renamed from: e */
        private final C11625c f26264e;

        /* renamed from: f */
        final AtomicBoolean f26265f = new AtomicBoolean();

        /* renamed from: c */
        private final C11280b f26262c = new C11280b();

        C11624b(RunnableC11623a runnableC11623a) {
            this.f26263d = runnableC11623a;
            this.f26264e = runnableC11623a.m10730b();
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f26262c.m11211j()) {
                return EnumC11297d.INSTANCE;
            }
            return this.f26264e.m10721d(runnable, j, timeUnit, this.f26262c);
        }

        /* renamed from: i */
        public void m10726i() {
            if (this.f26265f.compareAndSet(false, true)) {
                this.f26262c.m11212i();
                this.f26263d.m10728d(this.f26264e);
            }
        }

        /* renamed from: j */
        public boolean m10725j() {
            return this.f26265f.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IoScheduler.java */
    /* renamed from: j.e.f0.g.e$c */
    /* loaded from: classes3.dex */
    public static final class C11625c extends C11627g {

        /* renamed from: e */
        private long f26266e;

        C11625c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f26266e = 0L;
        }

        /* renamed from: g */
        public long m10724g() {
            return this.f26266e;
        }

        /* renamed from: h */
        public void m10723h(long j) {
            this.f26266e = j;
        }
    }

    static {
        C11625c c11625c = new C11625c(new ThreadFactoryC11628h("RxCachedThreadSchedulerShutdown"));
        f26252g = c11625c;
        c11625c.m10718i();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f26248c = new ThreadFactoryC11628h("RxCachedThreadScheduler", max);
        f26249d = new ThreadFactoryC11628h("RxCachedWorkerPoolEvictor", max);
        RunnableC11623a runnableC11623a = new RunnableC11623a(0L, null, f26248c);
        f26253h = runnableC11623a;
        runnableC11623a.m10727e();
    }

    public C11622e() {
        this(f26248c);
    }

    /* renamed from: a */
    public v$b m10733a() {
        return new C11624b(this.f26255b.get());
    }

    /* renamed from: d */
    public void m10732d() {
        RunnableC11623a runnableC11623a = new RunnableC11623a(f26250e, f26251f, this.f26254a);
        if (this.f26255b.compareAndSet(f26253h, runnableC11623a)) {
            return;
        }
        runnableC11623a.m10727e();
    }

    public C11622e(ThreadFactory threadFactory) {
        this.f26254a = threadFactory;
        this.f26255b = new AtomicReference<>(f26253h);
        m10732d();
    }
}
