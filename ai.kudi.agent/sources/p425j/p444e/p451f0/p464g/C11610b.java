package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.v;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p451f0.p452a.C11298e;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.v$b;
/* compiled from: ComputationScheduler.java */
/* renamed from: j.e.f0.g.b */
/* loaded from: classes3.dex */
public final class C11610b extends v {

    /* renamed from: c */
    static final C11612b f26213c;

    /* renamed from: d */
    static final ThreadFactoryC11628h f26214d;

    /* renamed from: e */
    static final int f26215e = m10751d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: f */
    static final C11613c f26216f;

    /* renamed from: a */
    final ThreadFactory f26217a;

    /* renamed from: b */
    final AtomicReference<C11612b> f26218b;

    /* compiled from: ComputationScheduler.java */
    /* renamed from: j.e.f0.g.b$a */
    /* loaded from: classes3.dex */
    static final class C11611a extends v$b {

        /* renamed from: c */
        private final C11298e f26219c = new C11298e();

        /* renamed from: d */
        private final C11280b f26220d = new C11280b();

        /* renamed from: e */
        private final C11298e f26221e;

        /* renamed from: f */
        private final C11613c f26222f;

        /* renamed from: w */
        volatile boolean f26223w;

        C11611a(C11613c c11613c) {
            this.f26222f = c11613c;
            C11298e c11298e = new C11298e();
            this.f26221e = c11298e;
            c11298e.mo11136b(this.f26219c);
            this.f26221e.mo11136b(this.f26220d);
        }

        @Override // p425j.p444e.v$b
        /* renamed from: b */
        public c mo10448b(Runnable runnable) {
            if (this.f26223w) {
                return EnumC11297d.INSTANCE;
            }
            return this.f26222f.m10721d(runnable, 0L, TimeUnit.MILLISECONDS, this.f26219c);
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f26223w) {
                return EnumC11297d.INSTANCE;
            }
            return this.f26222f.m10721d(runnable, j, timeUnit, this.f26220d);
        }

        /* renamed from: i */
        public void m10749i() {
            if (this.f26223w) {
                return;
            }
            this.f26223w = true;
            this.f26221e.m11133i();
        }

        /* renamed from: j */
        public boolean m10748j() {
            return this.f26223w;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: j.e.f0.g.b$b */
    /* loaded from: classes3.dex */
    public static final class C11612b {

        /* renamed from: a */
        final int f26224a;

        /* renamed from: b */
        final C11613c[] f26225b;

        /* renamed from: c */
        long f26226c;

        C11612b(int i, ThreadFactory threadFactory) {
            this.f26224a = i;
            this.f26225b = new C11613c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f26225b[i2] = new C11613c(threadFactory);
            }
        }

        /* renamed from: a */
        public C11613c m10747a() {
            int i = this.f26224a;
            if (i == 0) {
                return C11610b.f26216f;
            }
            C11613c[] c11613cArr = this.f26225b;
            long j = this.f26226c;
            this.f26226c = 1 + j;
            return c11613cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m10746b() {
            for (C11613c c11613c : this.f26225b) {
                c11613c.m10718i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: j.e.f0.g.b$c */
    /* loaded from: classes3.dex */
    public static final class C11613c extends C11627g {
        C11613c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C11613c c11613c = new C11613c(new ThreadFactoryC11628h("RxComputationShutdown"));
        f26216f = c11613c;
        c11613c.m10718i();
        ThreadFactoryC11628h threadFactoryC11628h = new ThreadFactoryC11628h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f26214d = threadFactoryC11628h;
        C11612b c11612b = new C11612b(0, threadFactoryC11628h);
        f26213c = c11612b;
        c11612b.m10746b();
    }

    public C11610b() {
        this(f26214d);
    }

    /* renamed from: d */
    static int m10751d(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public v$b m10753a() {
        return new C11611a(this.f26218b.get().m10747a());
    }

    /* renamed from: c */
    public c m10752c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f26218b.get().m10747a().m10720e(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public void m10750e() {
        C11612b c11612b = new C11612b(f26215e, this.f26217a);
        if (this.f26218b.compareAndSet(f26213c, c11612b)) {
            return;
        }
        c11612b.m10746b();
    }

    public C11610b(ThreadFactory threadFactory) {
        this.f26217a = threadFactory;
        this.f26218b = new AtomicReference<>(f26213c);
        m10750e();
    }
}
