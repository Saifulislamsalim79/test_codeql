package p425j.p444e.p451f0.p464g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SchedulerPoolFactory.java */
/* renamed from: j.e.f0.g.k */
/* loaded from: classes3.dex */
public final class C11632k {

    /* renamed from: a */
    public static final boolean f26279a;

    /* renamed from: b */
    public static final int f26280b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f26281c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f26282d = new ConcurrentHashMap();

    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: j.e.f0.g.k$a */
    /* loaded from: classes3.dex */
    static final class C11633a {

        /* renamed from: a */
        boolean f26283a;

        /* renamed from: b */
        int f26284b;

        C11633a() {
        }

        /* renamed from: a */
        void m10708a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f26283a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f26283a = true;
            }
            if (this.f26283a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f26284b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                    this.f26284b = 1;
                    return;
                }
            }
            this.f26284b = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SchedulerPoolFactory.java */
    /* renamed from: j.e.f0.g.k$b */
    /* loaded from: classes3.dex */
    public static final class RunnableC11634b implements Runnable {
        RunnableC11634b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C11632k.f26282d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C11632k.f26282d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C11633a c11633a = new C11633a();
        c11633a.m10708a(properties);
        f26279a = c11633a.f26283a;
        f26280b = c11633a.f26284b;
        m10711b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m10712a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m10710c(f26279a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m10711b() {
        m10709d(f26279a);
    }

    /* renamed from: c */
    static void m10710c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f26282d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    static void m10709d(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            ScheduledExecutorService scheduledExecutorService = f26281c.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC11628h("RxSchedulerPurge"));
            if (f26281c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                RunnableC11634b runnableC11634b = new RunnableC11634b();
                int i = f26280b;
                newScheduledThreadPool.scheduleAtFixedRate(runnableC11634b, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
