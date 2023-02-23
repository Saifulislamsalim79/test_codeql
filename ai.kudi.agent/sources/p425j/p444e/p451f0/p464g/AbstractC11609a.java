package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p453b.C11301a;
/* compiled from: AbstractDirectTask.java */
/* renamed from: j.e.f0.g.a */
/* loaded from: classes3.dex */
abstract class AbstractC11609a extends AtomicReference<Future<?>> implements c {

    /* renamed from: e */
    protected static final FutureTask<Void> f26209e = new FutureTask<>(C11301a.f25430b, null);

    /* renamed from: f */
    protected static final FutureTask<Void> f26210f = new FutureTask<>(C11301a.f25430b, null);

    /* renamed from: c */
    protected final Runnable f26211c;

    /* renamed from: d */
    protected Thread f26212d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11609a(Runnable runnable) {
        this.f26211c = runnable;
    }

    /* renamed from: a */
    public final void m10756a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f26209e) {
                return;
            }
            if (future2 == f26210f) {
                future.cancel(this.f26212d != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    /* renamed from: i */
    public final void m10755i() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f26209e || future == (futureTask = f26210f) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f26212d != Thread.currentThread());
    }

    /* renamed from: j */
    public final boolean m10754j() {
        Future<?> future = get();
        return future == f26209e || future == f26210f;
    }
}
