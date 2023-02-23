package p425j.p444e.p448c0;
/* compiled from: RunnableDisposable.java */
/* renamed from: j.e.c0.f */
/* loaded from: classes3.dex */
final class C11283f extends AbstractC11282e<Runnable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C11283f(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p425j.p444e.p448c0.AbstractC11282e
    /* renamed from: b */
    public void mo11204a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + m11205j() + ", " + get() + ")";
    }
}
