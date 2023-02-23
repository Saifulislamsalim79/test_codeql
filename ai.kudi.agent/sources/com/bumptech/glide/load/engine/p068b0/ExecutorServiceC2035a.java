package com.bumptech.glide.load.engine.p068b0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
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
/* renamed from: com.bumptech.glide.load.engine.b0.a */
/* loaded from: classes2.dex */
public final class ExecutorServiceC2035a implements ExecutorService {

    /* renamed from: d */
    private static final long f6145d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    private static volatile int f6146e;

    /* renamed from: c */
    private final ExecutorService f6147c;

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$a */
    /* loaded from: classes2.dex */
    public static final class C2036a {

        /* renamed from: a */
        private final boolean f6148a;

        /* renamed from: b */
        private int f6149b;

        /* renamed from: c */
        private int f6150c;

        /* renamed from: d */
        private InterfaceC2039c f6151d = InterfaceC2039c.f6160b;

        /* renamed from: e */
        private String f6152e;

        /* renamed from: f */
        private long f6153f;

        C2036a(boolean z) {
            this.f6148a = z;
        }

        /* renamed from: a */
        public ExecutorServiceC2035a m33886a() {
            if (!TextUtils.isEmpty(this.f6152e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f6149b, this.f6150c, this.f6153f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC2037b(this.f6152e, this.f6151d, this.f6148a));
                if (this.f6153f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new ExecutorServiceC2035a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f6152e);
        }

        /* renamed from: b */
        public C2036a m33885b(String str) {
            this.f6152e = str;
            return this;
        }

        /* renamed from: c */
        public C2036a m33884c(int i) {
            this.f6149b = i;
            this.f6150c = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$b */
    /* loaded from: classes2.dex */
    public static final class ThreadFactoryC2037b implements ThreadFactory {

        /* renamed from: c */
        private final String f6154c;

        /* renamed from: d */
        final InterfaceC2039c f6155d;

        /* renamed from: e */
        final boolean f6156e;

        /* renamed from: f */
        private int f6157f;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$b$a */
        /* loaded from: classes2.dex */
        class C2038a extends Thread {
            C2038a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC2037b.this.f6156e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    ThreadFactoryC2037b.this.f6155d.mo33883a(th);
                }
            }
        }

        ThreadFactoryC2037b(String str, InterfaceC2039c interfaceC2039c, boolean z) {
            this.f6154c = str;
            this.f6155d = interfaceC2039c;
            this.f6156e = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C2038a c2038a;
            c2038a = new C2038a(runnable, "glide-" + this.f6154c + "-thread-" + this.f6157f);
            this.f6157f = this.f6157f + 1;
            return c2038a;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.engine.b0.a$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2039c {

        /* renamed from: a */
        public static final InterfaceC2039c f6159a = new C2040a();

        /* renamed from: b */
        public static final InterfaceC2039c f6160b = f6159a;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.engine.b0.a$c$a */
        /* loaded from: classes2.dex */
        class C2040a implements InterfaceC2039c {
            C2040a() {
            }

            @Override // com.bumptech.glide.load.engine.p068b0.ExecutorServiceC2035a.InterfaceC2039c
            /* renamed from: a */
            public void mo33883a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* renamed from: a */
        void mo33883a(Throwable th);
    }

    ExecutorServiceC2035a(ExecutorService executorService) {
        this.f6147c = executorService;
    }

    /* renamed from: a */
    public static int m33894a() {
        if (f6146e == 0) {
            f6146e = Math.min(4, C2041b.m33882a());
        }
        return f6146e;
    }

    /* renamed from: b */
    public static C2036a m33893b() {
        int i = m33894a() >= 4 ? 2 : 1;
        C2036a c2036a = new C2036a(true);
        c2036a.m33884c(i);
        c2036a.m33885b("animation");
        return c2036a;
    }

    /* renamed from: c */
    public static ExecutorServiceC2035a m33892c() {
        return m33893b().m33886a();
    }

    /* renamed from: d */
    public static C2036a m33891d() {
        C2036a c2036a = new C2036a(true);
        c2036a.m33884c(1);
        c2036a.m33885b("disk-cache");
        return c2036a;
    }

    /* renamed from: e */
    public static ExecutorServiceC2035a m33890e() {
        return m33891d().m33886a();
    }

    /* renamed from: f */
    public static C2036a m33889f() {
        C2036a c2036a = new C2036a(false);
        c2036a.m33884c(m33894a());
        c2036a.m33885b(TransactionField.TRANSACTION_CHANNEL);
        return c2036a;
    }

    /* renamed from: g */
    public static ExecutorServiceC2035a m33888g() {
        return m33889f().m33886a();
    }

    /* renamed from: h */
    public static ExecutorServiceC2035a m33887h() {
        return new ExecutorServiceC2035a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f6145d, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC2037b("source-unlimited", InterfaceC2039c.f6160b, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6147c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6147c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f6147c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f6147c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f6147c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f6147c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f6147c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f6147c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f6147c.submit(runnable);
    }

    public String toString() {
        return this.f6147c.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6147c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f6147c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f6147c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f6147c.submit(callable);
    }
}
