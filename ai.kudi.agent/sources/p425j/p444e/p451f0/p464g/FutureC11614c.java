package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: DisposeOnCancel.java */
/* renamed from: j.e.f0.g.c */
/* loaded from: classes3.dex */
final class FutureC11614c implements Future<Object> {

    /* renamed from: c */
    final c f26227c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FutureC11614c(c cVar) {
        this.f26227c = cVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f26227c.i();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}
