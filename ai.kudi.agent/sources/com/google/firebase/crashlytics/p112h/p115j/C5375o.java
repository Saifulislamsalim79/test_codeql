package com.google.firebase.crashlytics.p112h.p115j;

import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: com.google.firebase.crashlytics.h.j.o */
/* loaded from: classes2.dex */
public class C5375o {

    /* renamed from: a */
    private final Executor f13260a;

    /* renamed from: b */
    private j<Void> f13261b = C4469m.m27765f(null);

    /* renamed from: c */
    private final Object f13262c = new Object();

    /* renamed from: d */
    private final ThreadLocal<Boolean> f13263d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.o$a */
    /* loaded from: classes2.dex */
    class RunnableC5376a implements Runnable {
        RunnableC5376a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5375o.this.f13263d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.o$b */
    /* loaded from: classes2.dex */
    class CallableC5377b implements Callable<Void> {

        /* renamed from: c */
        final /* synthetic */ Runnable f13265c;

        CallableC5377b(C5375o c5375o, Runnable runnable) {
            this.f13265c = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            this.f13265c.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.o$c */
    /* loaded from: classes2.dex */
    public class C5378c implements InterfaceC4450c<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f13266a;

        C5378c(C5375o c5375o, Callable callable) {
            this.f13266a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // com.google.android.gms.tasks.InterfaceC4450c
        /* renamed from: a */
        public T mo20893a(j<Void> jVar) throws Exception {
            return this.f13266a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    /* renamed from: com.google.firebase.crashlytics.h.j.o$d */
    /* loaded from: classes2.dex */
    public class C5379d implements InterfaceC4450c<T, Void> {
        C5379d(C5375o c5375o) {
        }

        @Override // com.google.android.gms.tasks.InterfaceC4450c
        /* renamed from: b */
        public Void mo20893a(j<T> jVar) throws Exception {
            return null;
        }
    }

    public C5375o(Executor executor) {
        this.f13260a = executor;
        executor.execute(new RunnableC5376a());
    }

    /* renamed from: d */
    private <T> j<Void> m24971d(j<T> jVar) {
        return jVar.i(this.f13260a, new C5379d(this));
    }

    /* renamed from: e */
    private boolean m24970e() {
        return Boolean.TRUE.equals(this.f13263d.get());
    }

    /* renamed from: f */
    private <T> InterfaceC4450c<Void, T> m24969f(Callable<T> callable) {
        return new C5378c(this, callable);
    }

    /* renamed from: b */
    public void m24973b() {
        if (!m24970e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m24972c() {
        return this.f13260a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public j<Void> m24968g(Runnable runnable) {
        return m24967h(new CallableC5377b(this, runnable));
    }

    /* renamed from: h */
    public <T> j<T> m24967h(Callable<T> callable) {
        j<T> i;
        synchronized (this.f13262c) {
            i = this.f13261b.i(this.f13260a, m24969f(callable));
            this.f13261b = m24971d(i);
        }
        return i;
    }

    /* renamed from: i */
    public <T> j<T> m24966i(Callable<j<T>> callable) {
        j<T> j;
        synchronized (this.f13262c) {
            j = this.f13261b.j(this.f13260a, m24969f(callable));
            this.f13261b = m24971d(j);
        }
        return j;
    }
}
