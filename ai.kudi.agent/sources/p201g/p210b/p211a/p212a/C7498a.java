package p201g.p210b.p211a.p212a;

import java.util.concurrent.Executor;
/* compiled from: ArchTaskExecutor.java */
/* renamed from: g.b.a.a.a */
/* loaded from: classes2.dex */
public class C7498a extends AbstractC7502c {

    /* renamed from: c */
    private static volatile C7498a f17830c;

    /* renamed from: d */
    private static final Executor f17831d = new ExecutorC7499a();

    /* renamed from: a */
    private AbstractC7502c f17832a;

    /* renamed from: b */
    private AbstractC7502c f17833b;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: g.b.a.a.a$a */
    /* loaded from: classes2.dex */
    static class ExecutorC7499a implements Executor {
        ExecutorC7499a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C7498a.m18547f().mo18545a(runnable);
        }
    }

    private C7498a() {
        C7500b c7500b = new C7500b();
        this.f17833b = c7500b;
        this.f17832a = c7500b;
    }

    /* renamed from: e */
    public static Executor m18548e() {
        return f17831d;
    }

    /* renamed from: f */
    public static C7498a m18547f() {
        if (f17830c != null) {
            return f17830c;
        }
        synchronized (C7498a.class) {
            if (f17830c == null) {
                f17830c = new C7498a();
            }
        }
        return f17830c;
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: a */
    public void mo18545a(Runnable runnable) {
        this.f17832a.mo18545a(runnable);
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: c */
    public boolean mo18543c() {
        return this.f17832a.mo18543c();
    }

    @Override // p201g.p210b.p211a.p212a.AbstractC7502c
    /* renamed from: d */
    public void mo18542d(Runnable runnable) {
        this.f17832a.mo18542d(runnable);
    }
}
