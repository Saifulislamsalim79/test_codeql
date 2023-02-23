package p272h.p286c.p287a.p288a.p289i;

import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
/* compiled from: SafeLoggingExecutor.java */
/* renamed from: h.c.a.a.i.n */
/* loaded from: classes2.dex */
class ExecutorC8348n implements Executor {

    /* renamed from: c */
    private final Executor f19999c;

    /* compiled from: SafeLoggingExecutor.java */
    /* renamed from: h.c.a.a.i.n$a */
    /* loaded from: classes2.dex */
    static class RunnableC8349a implements Runnable {

        /* renamed from: c */
        private final Runnable f20000c;

        RunnableC8349a(Runnable runnable) {
            this.f20000c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20000c.run();
            } catch (Exception e) {
                C8379a.m16165c("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC8348n(Executor executor) {
        this.f19999c = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f19999c.execute(new RunnableC8349a(runnable));
    }
}
