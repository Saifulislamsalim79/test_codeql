package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: TransactionExecutor.java */
/* renamed from: androidx.room.x0 */
/* loaded from: classes2.dex */
class ExecutorC1846x0 implements Executor {

    /* renamed from: c */
    private final Executor f5598c;

    /* renamed from: d */
    private final ArrayDeque<Runnable> f5599d = new ArrayDeque<>();

    /* renamed from: e */
    private Runnable f5600e;

    /* compiled from: TransactionExecutor.java */
    /* renamed from: androidx.room.x0$a */
    /* loaded from: classes2.dex */
    class RunnableC1847a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Runnable f5601c;

        RunnableC1847a(Runnable runnable) {
            this.f5601c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5601c.run();
            } finally {
                ExecutorC1846x0.this.m34431a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC1846x0(Executor executor) {
        this.f5598c = executor;
    }

    /* renamed from: a */
    synchronized void m34431a() {
        Runnable poll = this.f5599d.poll();
        this.f5600e = poll;
        if (poll != null) {
            this.f5598c.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f5599d.offer(new RunnableC1847a(runnable));
        if (this.f5600e == null) {
            m34431a();
        }
    }
}
