package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.i0.a;
import j.e.v;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.v$b;
/* compiled from: SingleScheduler.java */
/* renamed from: j.e.f0.g.l */
/* loaded from: classes3.dex */
public final class C11635l extends v {

    /* renamed from: b */
    static final ThreadFactoryC11628h f26285b;

    /* renamed from: c */
    static final ScheduledExecutorService f26286c;

    /* renamed from: a */
    final AtomicReference<ScheduledExecutorService> f26287a;

    /* compiled from: SingleScheduler.java */
    /* renamed from: j.e.f0.g.l$a */
    /* loaded from: classes3.dex */
    static final class C11636a extends v$b {

        /* renamed from: c */
        final ScheduledExecutorService f26288c;

        /* renamed from: d */
        final C11280b f26289d = new C11280b();

        /* renamed from: e */
        volatile boolean f26290e;

        C11636a(ScheduledExecutorService scheduledExecutorService) {
            this.f26288c = scheduledExecutorService;
        }

        @Override // p425j.p444e.v$b
        /* renamed from: c */
        public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f26290e) {
                return EnumC11297d.INSTANCE;
            }
            RunnableC11631j runnableC11631j = new RunnableC11631j(a.u(runnable), this.f26289d);
            this.f26289d.mo11136b(runnableC11631j);
            try {
                if (j <= 0) {
                    schedule = this.f26288c.submit((Callable) runnableC11631j);
                } else {
                    schedule = this.f26288c.schedule((Callable) runnableC11631j, j, timeUnit);
                }
                runnableC11631j.m10715a(schedule);
                return runnableC11631j;
            } catch (RejectedExecutionException e) {
                m10704i();
                a.r(e);
                return EnumC11297d.INSTANCE;
            }
        }

        /* renamed from: i */
        public void m10704i() {
            if (this.f26290e) {
                return;
            }
            this.f26290e = true;
            this.f26289d.m11212i();
        }

        /* renamed from: j */
        public boolean m10703j() {
            return this.f26290e;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f26286c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f26285b = new ThreadFactoryC11628h("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C11635l() {
        this(f26285b);
    }

    /* renamed from: d */
    static ScheduledExecutorService m10705d(ThreadFactory threadFactory) {
        return C11632k.m10712a(threadFactory);
    }

    /* renamed from: a */
    public v$b m10707a() {
        return new C11636a(this.f26287a.get());
    }

    /* renamed from: c */
    public c m10706c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        CallableC11630i callableC11630i = new CallableC11630i(a.u(runnable));
        try {
            if (j <= 0) {
                schedule = this.f26287a.get().submit(callableC11630i);
            } else {
                schedule = this.f26287a.get().schedule(callableC11630i, j, timeUnit);
            }
            callableC11630i.m10756a(schedule);
            return callableC11630i;
        } catch (RejectedExecutionException e) {
            a.r(e);
            return EnumC11297d.INSTANCE;
        }
    }

    public C11635l(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f26287a = atomicReference;
        atomicReference.lazySet(m10705d(threadFactory));
    }
}
