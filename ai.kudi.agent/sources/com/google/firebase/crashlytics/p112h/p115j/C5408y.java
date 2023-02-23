package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.C5335f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ExecutorUtils.java */
/* renamed from: com.google.firebase.crashlytics.h.j.y */
/* loaded from: classes2.dex */
public final class C5408y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.y$a */
    /* loaded from: classes2.dex */
    public class ThreadFactoryC5409a implements ThreadFactory {

        /* renamed from: c */
        final /* synthetic */ String f13360c;

        /* renamed from: d */
        final /* synthetic */ AtomicLong f13361d;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.h.j.y$a$a */
        /* loaded from: classes2.dex */
        class C5410a extends AbstractRunnableC5365j {

            /* renamed from: c */
            final /* synthetic */ Runnable f13362c;

            C5410a(ThreadFactoryC5409a threadFactoryC5409a, Runnable runnable) {
                this.f13362c = runnable;
            }

            @Override // com.google.firebase.crashlytics.p112h.p115j.AbstractRunnableC5365j
            /* renamed from: a */
            public void mo24831a() {
                this.f13362c.run();
            }
        }

        ThreadFactoryC5409a(String str, AtomicLong atomicLong) {
            this.f13360c = str;
            this.f13361d = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C5410a(this, runnable));
            newThread.setName(this.f13360c + this.f13361d.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.y$b */
    /* loaded from: classes2.dex */
    public class C5411b extends AbstractRunnableC5365j {

        /* renamed from: c */
        final /* synthetic */ String f13363c;

        /* renamed from: d */
        final /* synthetic */ ExecutorService f13364d;

        /* renamed from: e */
        final /* synthetic */ long f13365e;

        /* renamed from: f */
        final /* synthetic */ TimeUnit f13366f;

        C5411b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f13363c = str;
            this.f13364d = executorService;
            this.f13365e = j;
            this.f13366f = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.p112h.p115j.AbstractRunnableC5365j
        /* renamed from: a */
        public void mo24831a() {
            try {
                C5335f m25102f = C5335f.m25102f();
                m25102f.m25106b("Executing shutdown hook for " + this.f13363c);
                this.f13364d.shutdown();
                if (this.f13364d.awaitTermination(this.f13365e, this.f13366f)) {
                    return;
                }
                C5335f m25102f2 = C5335f.m25102f();
                m25102f2.m25106b(this.f13363c + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f13364d.shutdownNow();
            } catch (InterruptedException unused) {
                C5335f.m25102f().m25106b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f13363c));
                this.f13364d.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m24836a(String str, ExecutorService executorService) {
        m24835b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m24835b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C5411b c5411b = new C5411b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(c5411b, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m24834c(String str) {
        ExecutorService m24832e = m24832e(m24833d(str), new ThreadPoolExecutor.DiscardPolicy());
        m24836a(str, m24832e);
        return m24832e;
    }

    /* renamed from: d */
    public static ThreadFactory m24833d(String str) {
        return new ThreadFactoryC5409a(str, new AtomicLong(1L));
    }

    /* renamed from: e */
    private static ExecutorService m24832e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
