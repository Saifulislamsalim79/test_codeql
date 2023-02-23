package p201g.p210b.p211a.p212a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: DefaultTaskExecutor.java */
/* renamed from: g.b.a.a.b */
/* loaded from: classes2.dex */
public class C7500b extends AbstractC7502c {

    /* renamed from: a */
    private final Object f17834a = new Object();

    /* renamed from: b */
    private final ExecutorService f17835b = Executors.newFixedThreadPool(4, new ThreadFactoryC7501a(this));

    /* renamed from: c */
    private volatile Handler f17836c;

    /* compiled from: DefaultTaskExecutor.java */
    /* renamed from: g.b.a.a.b$a */
    /* loaded from: classes2.dex */
    class ThreadFactoryC7501a implements ThreadFactory {

        /* renamed from: c */
        private final AtomicInteger f17837c = new AtomicInteger(0);

        ThreadFactoryC7501a(C7500b c7500b) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f17837c.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: e */
    private static Handler m18546e(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: a */
    public void mo18545a(Runnable runnable) {
        this.f17835b.execute(runnable);
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: c */
    public boolean mo18543c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: d */
    public void mo18542d(Runnable runnable) {
        if (this.f17836c == null) {
            synchronized (this.f17834a) {
                if (this.f17836c == null) {
                    this.f17836c = m18546e(Looper.getMainLooper());
                }
            }
        }
        this.f17836c.post(runnable);
    }
}
