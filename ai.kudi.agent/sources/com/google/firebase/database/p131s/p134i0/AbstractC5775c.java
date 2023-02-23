package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.C5615f;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.InterfaceC5861q;
import com.google.firebase.database.p131s.InterfaceC5890x;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultRunLoop.java */
/* renamed from: com.google.firebase.database.s.i0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5775c implements InterfaceC5861q {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f14203a;

    /* compiled from: DefaultRunLoop.java */
    /* renamed from: com.google.firebase.database.s.i0.c$a */
    /* loaded from: classes2.dex */
    class C5776a extends ScheduledThreadPoolExecutor {
        C5776a(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
            if (th != null) {
                AbstractC5775c.this.mo23797f(th);
            }
        }
    }

    /* compiled from: DefaultRunLoop.java */
    /* renamed from: com.google.firebase.database.s.i0.c$b */
    /* loaded from: classes2.dex */
    private class ThreadFactoryC5777b implements ThreadFactory {

        /* compiled from: DefaultRunLoop.java */
        /* renamed from: com.google.firebase.database.s.i0.c$b$a */
        /* loaded from: classes2.dex */
        class C5778a implements Thread.UncaughtExceptionHandler {
            C5778a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractC5775c.this.mo23797f(th);
            }
        }

        private ThreadFactoryC5777b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = AbstractC5775c.this.m23799d().newThread(runnable);
            InterfaceC5890x m23798e = AbstractC5775c.this.m23798e();
            m23798e.mo23386a(newThread, "FirebaseDatabaseWorker");
            m23798e.mo23385b(newThread, true);
            m23798e.mo23384c(newThread, new C5778a());
            return newThread;
        }

        /* synthetic */ ThreadFactoryC5777b(AbstractC5775c abstractC5775c, C5776a c5776a) {
            this();
        }
    }

    public AbstractC5775c() {
        C5776a c5776a = new C5776a(1, new ThreadFactoryC5777b(this, null));
        this.f14203a = c5776a;
        c5776a.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    /* renamed from: g */
    public static String m23796g(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th instanceof DatabaseException) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + C5615f.m24315g() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5861q
    /* renamed from: a */
    public void mo23492a() {
        this.f14203a.setCorePoolSize(1);
    }

    @Override // com.google.firebase.database.p131s.InterfaceC5861q
    /* renamed from: b */
    public void mo23491b(Runnable runnable) {
        this.f14203a.execute(runnable);
    }

    /* renamed from: c */
    public ScheduledExecutorService m23800c() {
        return this.f14203a;
    }

    /* renamed from: d */
    protected ThreadFactory m23799d() {
        return Executors.defaultThreadFactory();
    }

    /* renamed from: e */
    protected InterfaceC5890x m23798e() {
        return InterfaceC5890x.f14478a;
    }

    /* renamed from: f */
    public abstract void mo23797f(Throwable th);
}
