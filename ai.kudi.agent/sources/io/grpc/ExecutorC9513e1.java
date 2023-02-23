package io.grpc;

import com.google.common.base.C5051n;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SynchronizationContext.java */
/* renamed from: io.grpc.e1 */
/* loaded from: classes2.dex */
public final class ExecutorC9513e1 implements Executor {

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f22257c;

    /* renamed from: d */
    private final Queue<Runnable> f22258d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    private final AtomicReference<Thread> f22259e = new AtomicReference<>();

    /* compiled from: SynchronizationContext.java */
    /* renamed from: io.grpc.e1$a */
    /* loaded from: classes2.dex */
    class RunnableC9514a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ RunnableC9515b f22260c;

        /* renamed from: d */
        final /* synthetic */ Runnable f22261d;

        RunnableC9514a(RunnableC9515b runnableC9515b, Runnable runnable) {
            this.f22260c = runnableC9515b;
            this.f22261d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC9513e1.this.execute(this.f22260c);
        }

        public String toString() {
            return this.f22261d.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SynchronizationContext.java */
    /* renamed from: io.grpc.e1$b */
    /* loaded from: classes2.dex */
    public static class RunnableC9515b implements Runnable {

        /* renamed from: c */
        final Runnable f22263c;

        /* renamed from: d */
        boolean f22264d;

        /* renamed from: e */
        boolean f22265e;

        RunnableC9515b(Runnable runnable) {
            C5051n.m25779o(runnable, "task");
            this.f22263c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22264d) {
                return;
            }
            this.f22265e = true;
            this.f22263c.run();
        }
    }

    /* compiled from: SynchronizationContext.java */
    /* renamed from: io.grpc.e1$c */
    /* loaded from: classes2.dex */
    public static final class C9516c {

        /* renamed from: a */
        private final RunnableC9515b f22266a;

        /* renamed from: b */
        private final ScheduledFuture<?> f22267b;

        /* synthetic */ C9516c(RunnableC9515b runnableC9515b, ScheduledFuture scheduledFuture, RunnableC9514a runnableC9514a) {
            this(runnableC9515b, scheduledFuture);
        }

        /* renamed from: a */
        public void m14530a() {
            this.f22266a.f22264d = true;
            this.f22267b.cancel(false);
        }

        /* renamed from: b */
        public boolean m14529b() {
            RunnableC9515b runnableC9515b = this.f22266a;
            return (runnableC9515b.f22265e || runnableC9515b.f22264d) ? false : true;
        }

        private C9516c(RunnableC9515b runnableC9515b, ScheduledFuture<?> scheduledFuture) {
            C5051n.m25779o(runnableC9515b, "runnable");
            this.f22266a = runnableC9515b;
            C5051n.m25779o(scheduledFuture, "future");
            this.f22267b = scheduledFuture;
        }
    }

    public ExecutorC9513e1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C5051n.m25779o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.f22257c = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public final void m14534a() {
        while (this.f22259e.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f22258d.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f22259e.set(null);
                        if (this.f22258d.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f22259e.set(null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m14533b(Runnable runnable) {
        Queue<Runnable> queue = this.f22258d;
        C5051n.m25779o(runnable, "runnable is null");
        queue.add(runnable);
    }

    /* renamed from: c */
    public final C9516c m14532c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC9515b runnableC9515b = new RunnableC9515b(runnable);
        return new C9516c(runnableC9515b, scheduledExecutorService.schedule(new RunnableC9514a(runnableC9515b, runnable), j, timeUnit), null);
    }

    /* renamed from: d */
    public void m14531d() {
        C5051n.m25773u(Thread.currentThread() == this.f22259e.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m14533b(runnable);
        m14534a();
    }
}
