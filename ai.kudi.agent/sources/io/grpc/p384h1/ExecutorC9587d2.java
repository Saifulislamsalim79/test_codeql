package io.grpc.p384h1;

import com.google.common.base.C5051n;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: SerializingExecutor.java */
/* renamed from: io.grpc.h1.d2 */
/* loaded from: classes2.dex */
public final class ExecutorC9587d2 implements Executor, Runnable {

    /* renamed from: f */
    private static final Logger f22463f = Logger.getLogger(ExecutorC9587d2.class.getName());

    /* renamed from: w */
    private static final AbstractC9589b f22464w = m14377c();

    /* renamed from: c */
    private Executor f22465c;

    /* renamed from: d */
    private final Queue<Runnable> f22466d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    private volatile int f22467e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SerializingExecutor.java */
    /* renamed from: io.grpc.h1.d2$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9589b {
        private AbstractC9589b() {
        }

        /* renamed from: a */
        public abstract boolean mo14375a(ExecutorC9587d2 executorC9587d2, int i, int i2);

        /* renamed from: b */
        public abstract void mo14374b(ExecutorC9587d2 executorC9587d2, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SerializingExecutor.java */
    /* renamed from: io.grpc.h1.d2$c */
    /* loaded from: classes2.dex */
    public static final class C9590c extends AbstractC9589b {

        /* renamed from: a */
        private final AtomicIntegerFieldUpdater<ExecutorC9587d2> f22468a;

        @Override // io.grpc.p384h1.ExecutorC9587d2.AbstractC9589b
        /* renamed from: a */
        public boolean mo14375a(ExecutorC9587d2 executorC9587d2, int i, int i2) {
            return this.f22468a.compareAndSet(executorC9587d2, i, i2);
        }

        @Override // io.grpc.p384h1.ExecutorC9587d2.AbstractC9589b
        /* renamed from: b */
        public void mo14374b(ExecutorC9587d2 executorC9587d2, int i) {
            this.f22468a.set(executorC9587d2, i);
        }

        private C9590c(AtomicIntegerFieldUpdater<ExecutorC9587d2> atomicIntegerFieldUpdater) {
            super();
            this.f22468a = atomicIntegerFieldUpdater;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SerializingExecutor.java */
    /* renamed from: io.grpc.h1.d2$d */
    /* loaded from: classes2.dex */
    public static final class C9591d extends AbstractC9589b {
        private C9591d() {
            super();
        }

        @Override // io.grpc.p384h1.ExecutorC9587d2.AbstractC9589b
        /* renamed from: a */
        public boolean mo14375a(ExecutorC9587d2 executorC9587d2, int i, int i2) {
            synchronized (executorC9587d2) {
                if (executorC9587d2.f22467e == i) {
                    executorC9587d2.f22467e = i2;
                    return true;
                }
                return false;
            }
        }

        @Override // io.grpc.p384h1.ExecutorC9587d2.AbstractC9589b
        /* renamed from: b */
        public void mo14374b(ExecutorC9587d2 executorC9587d2, int i) {
            synchronized (executorC9587d2) {
                executorC9587d2.f22467e = i;
            }
        }
    }

    public ExecutorC9587d2(Executor executor) {
        C5051n.m25779o(executor, "'executor' must not be null.");
        this.f22465c = executor;
    }

    /* renamed from: c */
    private static AbstractC9589b m14377c() {
        try {
            return new C9590c(AtomicIntegerFieldUpdater.newUpdater(ExecutorC9587d2.class, "e"));
        } catch (Throwable th) {
            f22463f.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new C9591d();
        }
    }

    /* renamed from: d */
    private void m14376d(Runnable runnable) {
        if (f22464w.mo14375a(this, 0, -1)) {
            try {
                this.f22465c.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f22466d.remove(runnable);
                }
                f22464w.mo14374b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Queue<Runnable> queue = this.f22466d;
        C5051n.m25779o(runnable, "'r' must not be null.");
        queue.add(runnable);
        m14376d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f22465c;
            while (executor == this.f22465c && (poll = this.f22466d.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e) {
                    Logger logger = f22463f;
                    Level level = Level.SEVERE;
                    logger.log(level, "Exception while executing runnable " + poll, (Throwable) e);
                }
            }
            f22464w.mo14374b(this, 0);
            if (this.f22466d.isEmpty()) {
                return;
            }
            m14376d(null);
        } catch (Throwable th) {
            f22464w.mo14374b(this, 0);
            throw th;
        }
    }
}
