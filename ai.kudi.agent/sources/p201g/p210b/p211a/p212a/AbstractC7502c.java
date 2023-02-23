package p201g.p210b.p211a.p212a;
/* compiled from: TaskExecutor.java */
/* renamed from: g.b.a.a.c */
/* loaded from: classes2.dex */
public abstract class AbstractC7502c {
    /* renamed from: a */
    public abstract void mo18545a(Runnable runnable);

    /* renamed from: b */
    public void m18544b(Runnable runnable) {
        if (mo18543c()) {
            runnable.run();
        } else {
            mo18542d(runnable);
        }
    }

    /* renamed from: c */
    public abstract boolean mo18543c();

    /* renamed from: d */
    public abstract void mo18542d(Runnable runnable);
}
