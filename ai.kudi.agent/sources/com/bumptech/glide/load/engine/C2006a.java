package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.C2080p;
import com.bumptech.glide.p086q.C2380j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: ActiveResources.java */
/* renamed from: com.bumptech.glide.load.engine.a */
/* loaded from: classes2.dex */
final class C2006a {

    /* renamed from: a */
    private final boolean f6101a;

    /* renamed from: b */
    final Map<InterfaceC2118f, C2011d> f6102b;

    /* renamed from: c */
    private final ReferenceQueue<C2080p<?>> f6103c;

    /* renamed from: d */
    private C2080p.InterfaceC2081a f6104d;

    /* renamed from: e */
    private volatile boolean f6105e;

    /* renamed from: f */
    private volatile InterfaceC2010c f6106f;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* loaded from: classes2.dex */
    class ThreadFactoryC2007a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* loaded from: classes2.dex */
        class RunnableC2008a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Runnable f6107c;

            RunnableC2008a(ThreadFactoryC2007a threadFactoryC2007a, Runnable runnable) {
                this.f6107c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f6107c.run();
            }
        }

        ThreadFactoryC2007a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC2008a(this, runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* loaded from: classes2.dex */
    class RunnableC2009b implements Runnable {
        RunnableC2009b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2006a.this.m33929b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2010c {
        /* renamed from: a */
        void m33924a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$d */
    /* loaded from: classes2.dex */
    public static final class C2011d extends WeakReference<C2080p<?>> {

        /* renamed from: a */
        final InterfaceC2118f f6109a;

        /* renamed from: b */
        final boolean f6110b;

        /* renamed from: c */
        InterfaceC2087u<?> f6111c;

        C2011d(InterfaceC2118f interfaceC2118f, C2080p<?> c2080p, ReferenceQueue<? super C2080p<?>> referenceQueue, boolean z) {
            super(c2080p, referenceQueue);
            InterfaceC2087u<?> interfaceC2087u;
            C2380j.m33129d(interfaceC2118f);
            this.f6109a = interfaceC2118f;
            if (c2080p.m33768e() && z) {
                InterfaceC2087u<?> m33769d = c2080p.m33769d();
                C2380j.m33129d(m33769d);
                interfaceC2087u = m33769d;
            } else {
                interfaceC2087u = null;
            }
            this.f6111c = interfaceC2087u;
            this.f6110b = c2080p.m33768e();
        }

        /* renamed from: a */
        void m33923a() {
            this.f6111c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2006a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC2007a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m33930a(InterfaceC2118f interfaceC2118f, C2080p<?> c2080p) {
        C2011d put = this.f6102b.put(interfaceC2118f, new C2011d(interfaceC2118f, c2080p, this.f6103c, this.f6101a));
        if (put != null) {
            put.m33923a();
        }
    }

    /* renamed from: b */
    void m33929b() {
        while (!this.f6105e) {
            try {
                m33928c((C2011d) this.f6103c.remove());
                InterfaceC2010c interfaceC2010c = this.f6106f;
                if (interfaceC2010c != null) {
                    interfaceC2010c.m33924a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    void m33928c(C2011d c2011d) {
        synchronized (this) {
            this.f6102b.remove(c2011d.f6109a);
            if (c2011d.f6110b && c2011d.f6111c != null) {
                this.f6104d.mo33766d(c2011d.f6109a, new C2080p<>(c2011d.f6111c, true, false, c2011d.f6109a, this.f6104d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m33927d(InterfaceC2118f interfaceC2118f) {
        C2011d remove = this.f6102b.remove(interfaceC2118f);
        if (remove != null) {
            remove.m33923a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C2080p<?> m33926e(InterfaceC2118f interfaceC2118f) {
        C2011d c2011d = this.f6102b.get(interfaceC2118f);
        if (c2011d == null) {
            return null;
        }
        C2080p<?> c2080p = c2011d.get();
        if (c2080p == null) {
            m33928c(c2011d);
        }
        return c2080p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m33925f(C2080p.InterfaceC2081a interfaceC2081a) {
        synchronized (interfaceC2081a) {
            synchronized (this) {
                this.f6104d = interfaceC2081a;
            }
        }
    }

    C2006a(boolean z, Executor executor) {
        this.f6102b = new HashMap();
        this.f6103c = new ReferenceQueue<>();
        this.f6101a = z;
        executor.execute(new RunnableC2009b());
    }
}
