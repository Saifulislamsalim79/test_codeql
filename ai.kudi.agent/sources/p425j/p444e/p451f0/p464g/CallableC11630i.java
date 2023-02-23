package p425j.p444e.p451f0.p464g;

import java.util.concurrent.Callable;
/* compiled from: ScheduledDirectTask.java */
/* renamed from: j.e.f0.g.i */
/* loaded from: classes3.dex */
public final class CallableC11630i extends AbstractC11609a implements Callable<Void> {
    public CallableC11630i(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Void call() throws Exception {
        this.f26212d = Thread.currentThread();
        try {
            this.f26211c.run();
            return null;
        } finally {
            lazySet(AbstractC11609a.f26209e);
            this.f26212d = null;
        }
    }
}
