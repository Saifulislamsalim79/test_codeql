package p198f.p199a.p200b;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e0.d.l;
/* compiled from: ScopedExecutor.kt */
/* renamed from: f.a.b.i */
/* loaded from: classes2.dex */
public final class ExecutorC7444i implements Executor {

    /* renamed from: c */
    private final Executor f17653c;

    /* renamed from: d */
    private final AtomicBoolean f17654d;

    public ExecutorC7444i(Executor executor) {
        l.f(executor, "executor");
        this.f17653c = executor;
        this.f17654d = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m18709a(ExecutorC7444i executorC7444i, Runnable runnable) {
        l.f(executorC7444i, "this$0");
        l.f(runnable, "$command");
        if (executorC7444i.f17654d.get()) {
            return;
        }
        runnable.run();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        l.f(runnable, "command");
        if (this.f17654d.get()) {
            return;
        }
        this.f17653c.execute(new Runnable() { // from class: f.a.b.d
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC7444i.m18709a(ExecutorC7444i.this, runnable);
            }
        });
    }

    public final void shutdown() {
        this.f17654d.set(true);
    }
}
