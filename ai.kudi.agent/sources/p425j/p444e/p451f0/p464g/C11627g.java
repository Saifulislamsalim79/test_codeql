package p425j.p444e.p451f0.p464g;

import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p425j.p444e.p451f0.p452a.EnumC11297d;
import p425j.p444e.p451f0.p452a.InterfaceC11295b;
import p425j.p444e.v$b;
/* compiled from: NewThreadWorker.java */
/* renamed from: j.e.f0.g.g */
/* loaded from: classes3.dex */
public class C11627g extends v$b implements c {

    /* renamed from: c */
    private final ScheduledExecutorService f26269c;

    /* renamed from: d */
    volatile boolean f26270d;

    public C11627g(ThreadFactory threadFactory) {
        this.f26269c = C11632k.m10712a(threadFactory);
    }

    @Override // p425j.p444e.v$b
    /* renamed from: b */
    public c mo10448b(Runnable runnable) {
        return mo10447c(runnable, 0L, null);
    }

    @Override // p425j.p444e.v$b
    /* renamed from: c */
    public c mo10447c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f26270d) {
            return EnumC11297d.INSTANCE;
        }
        return m10721d(runnable, j, timeUnit, null);
    }

    /* renamed from: d */
    public RunnableC11631j m10721d(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC11295b interfaceC11295b) {
        Future<?> schedule;
        RunnableC11631j runnableC11631j = new RunnableC11631j(a.u(runnable), interfaceC11295b);
        if (interfaceC11295b == null || interfaceC11295b.mo11136b(runnableC11631j)) {
            try {
                if (j <= 0) {
                    schedule = this.f26269c.submit((Callable) runnableC11631j);
                } else {
                    schedule = this.f26269c.schedule((Callable) runnableC11631j, j, timeUnit);
                }
                runnableC11631j.m10715a(schedule);
            } catch (RejectedExecutionException e) {
                if (interfaceC11295b != null) {
                    interfaceC11295b.mo11137a(runnableC11631j);
                }
                a.r(e);
            }
            return runnableC11631j;
        }
        return runnableC11631j;
    }

    /* renamed from: e */
    public c m10720e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        CallableC11630i callableC11630i = new CallableC11630i(a.u(runnable));
        try {
            if (j <= 0) {
                schedule = this.f26269c.submit(callableC11630i);
            } else {
                schedule = this.f26269c.schedule(callableC11630i, j, timeUnit);
            }
            callableC11630i.m10756a(schedule);
            return callableC11630i;
        } catch (RejectedExecutionException e) {
            a.r(e);
            return EnumC11297d.INSTANCE;
        }
    }

    /* renamed from: f */
    public void m10719f() {
        if (this.f26270d) {
            return;
        }
        this.f26270d = true;
        this.f26269c.shutdown();
    }

    /* renamed from: i */
    public void m10718i() {
        if (this.f26270d) {
            return;
        }
        this.f26270d = true;
        this.f26269c.shutdownNow();
    }

    /* renamed from: j */
    public boolean m10717j() {
        return this.f26270d;
    }
}
