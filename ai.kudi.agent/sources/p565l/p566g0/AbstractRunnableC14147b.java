package p565l.p566g0;
/* compiled from: NamedRunnable.java */
/* renamed from: l.g0.b */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC14147b implements Runnable {

    /* renamed from: c */
    protected final String f30904c;

    public AbstractRunnableC14147b(String str, Object... objArr) {
        this.f30904c = C14148c.m2790r(str, objArr);
    }

    /* renamed from: e */
    protected abstract void mo1487e();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f30904c);
        try {
            mo1487e();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
