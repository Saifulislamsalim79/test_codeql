package io.intercom.com.bumptech.glide.load.engine.p394a0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: GlideExecutor.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC10519a implements ExecutorService {

    /* renamed from: d */
    private static final long f24137d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    private static volatile int f24138e;

    /* renamed from: c */
    private final ExecutorService f24139c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideExecutor.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.a$a */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC10520a implements ThreadFactory {

        /* renamed from: c */
        private final String f24140c;

        /* renamed from: d */
        final InterfaceC10522b f24141d;

        /* renamed from: e */
        final boolean f24142e;

        /* renamed from: f */
        private int f24143f;

        /* compiled from: GlideExecutor.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.a$a$a */
        /* loaded from: classes3.dex */
        class C10521a extends Thread {
            C10521a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC10520a.this.f24142e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC10520a.this.f24141d.mo12840a(th);
                }
            }
        }

        ThreadFactoryC10520a(String str, InterfaceC10522b interfaceC10522b, boolean z) {
            this.f24140c = str;
            this.f24141d = interfaceC10522b;
            this.f24142e = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C10521a c10521a;
            c10521a = new C10521a(runnable, "glide-" + this.f24140c + "-thread-" + this.f24143f);
            this.f24143f = this.f24143f + 1;
            return c10521a;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.a$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10522b {

        /* renamed from: a */
        public static final InterfaceC10522b f24145a = new C10523a();

        /* renamed from: b */
        public static final InterfaceC10522b f24146b = f24145a;

        /* compiled from: GlideExecutor.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.engine.a0.a$b$a */
        /* loaded from: classes3.dex */
        static class C10523a implements InterfaceC10522b {
            C10523a() {
            }

            @Override // io.intercom.com.bumptech.glide.load.engine.p394a0.ExecutorServiceC10519a.InterfaceC10522b
            /* renamed from: a */
            public void mo12840a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: a */
        void mo12840a(Throwable th);
    }

    ExecutorServiceC10519a(ExecutorService executorService) {
        this.f24139c = executorService;
    }

    /* renamed from: a */
    public static int m12848a() {
        if (f24138e == 0) {
            f24138e = Math.min(4, C10524b.m12839a());
        }
        return f24138e;
    }

    /* renamed from: b */
    public static ExecutorServiceC10519a m12847b() {
        return m12846c(m12848a() >= 4 ? 2 : 1, InterfaceC10522b.f24146b);
    }

    /* renamed from: c */
    public static ExecutorServiceC10519a m12846c(int i, InterfaceC10522b interfaceC10522b) {
        return new ExecutorServiceC10519a(new ThreadPoolExecutor(0, i, f24137d, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC10520a("animation", interfaceC10522b, true)));
    }

    /* renamed from: d */
    public static ExecutorServiceC10519a m12845d() {
        return m12844e(1, "disk-cache", InterfaceC10522b.f24146b);
    }

    /* renamed from: e */
    public static ExecutorServiceC10519a m12844e(int i, String str, InterfaceC10522b interfaceC10522b) {
        return new ExecutorServiceC10519a(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC10520a(str, interfaceC10522b, true)));
    }

    /* renamed from: f */
    public static ExecutorServiceC10519a m12843f() {
        return m12842g(m12848a(), TransactionField.TRANSACTION_CHANNEL, InterfaceC10522b.f24146b);
    }

    /* renamed from: g */
    public static ExecutorServiceC10519a m12842g(int i, String str, InterfaceC10522b interfaceC10522b) {
        return new ExecutorServiceC10519a(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC10520a(str, interfaceC10522b, false)));
    }

    /* renamed from: h */
    public static ExecutorServiceC10519a m12841h() {
        return new ExecutorServiceC10519a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f24137d, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC10520a("source-unlimited", InterfaceC10522b.f24146b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f24139c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f24139c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f24139c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f24139c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f24139c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f24139c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f24139c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f24139c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f24139c.submit(runnable);
    }

    public String toString() {
        return this.f24139c.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f24139c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f24139c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f24139c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f24139c.submit(callable);
    }
}
