package p201g.p227h.p234i;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201g.p227h.p237k.InterfaceC7668a;
/* compiled from: RequestExecutor.java */
/* renamed from: g.h.i.g */
/* loaded from: classes2.dex */
class C7646g {

    /* compiled from: RequestExecutor.java */
    /* renamed from: g.h.i.g$a */
    /* loaded from: classes2.dex */
    private static class ThreadFactoryC7647a implements ThreadFactory {

        /* renamed from: c */
        private String f18343c;

        /* renamed from: d */
        private int f18344d;

        /* compiled from: RequestExecutor.java */
        /* renamed from: g.h.i.g$a$a */
        /* loaded from: classes2.dex */
        private static class C7648a extends Thread {

            /* renamed from: c */
            private final int f18345c;

            C7648a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f18345c = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f18345c);
                super.run();
            }
        }

        ThreadFactoryC7647a(String str, int i) {
            this.f18343c = str;
            this.f18344d = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7648a(runnable, this.f18343c, this.f18344d);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* renamed from: g.h.i.g$b */
    /* loaded from: classes2.dex */
    private static class RunnableC7649b<T> implements Runnable {

        /* renamed from: c */
        private Callable<T> f18346c;

        /* renamed from: d */
        private InterfaceC7668a<T> f18347d;

        /* renamed from: e */
        private Handler f18348e;

        /* compiled from: RequestExecutor.java */
        /* renamed from: g.h.i.g$b$a */
        /* loaded from: classes2.dex */
        class RunnableC7650a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ InterfaceC7668a f18349c;

            /* renamed from: d */
            final /* synthetic */ Object f18350d;

            RunnableC7650a(RunnableC7649b runnableC7649b, InterfaceC7668a interfaceC7668a, Object obj) {
                this.f18349c = interfaceC7668a;
                this.f18350d = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f18349c.accept(this.f18350d);
            }
        }

        RunnableC7649b(Handler handler, Callable<T> callable, InterfaceC7668a<T> interfaceC7668a) {
            this.f18346c = callable;
            this.f18347d = interfaceC7668a;
            this.f18348e = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f18346c.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f18348e.post(new RunnableC7650a(this, this.f18347d, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m17930a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7647a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m17929b(Executor executor, Callable<T> callable, InterfaceC7668a<T> interfaceC7668a) {
        executor.execute(new RunnableC7649b(C7632b.m17967a(), callable, interfaceC7668a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m17928c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
