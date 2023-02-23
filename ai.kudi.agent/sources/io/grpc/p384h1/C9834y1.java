package io.grpc.p384h1;

import com.google.common.base.C5055p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Rescheduler.java */
/* renamed from: io.grpc.h1.y1 */
/* loaded from: classes2.dex */
public final class C9834y1 {

    /* renamed from: a */
    private final ScheduledExecutorService f23096a;

    /* renamed from: b */
    private final Executor f23097b;

    /* renamed from: c */
    private final Runnable f23098c;

    /* renamed from: d */
    private final C5055p f23099d;

    /* renamed from: e */
    private long f23100e;

    /* renamed from: f */
    private boolean f23101f;

    /* renamed from: g */
    private ScheduledFuture<?> f23102g;

    /* compiled from: Rescheduler.java */
    /* renamed from: io.grpc.h1.y1$b */
    /* loaded from: classes2.dex */
    private final class RunnableC9836b implements Runnable {
        private RunnableC9836b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C9834y1.this.f23101f) {
                C9834y1.this.f23102g = null;
                return;
            }
            long m13857j = C9834y1.this.m13857j();
            if (C9834y1.this.f23100e - m13857j <= 0) {
                C9834y1.this.f23101f = false;
                C9834y1.this.f23102g = null;
                C9834y1.this.f23098c.run();
                return;
            }
            C9834y1 c9834y1 = C9834y1.this;
            c9834y1.f23102g = c9834y1.f23096a.schedule(new RunnableC9837c(), C9834y1.this.f23100e - m13857j, TimeUnit.NANOSECONDS);
        }
    }

    /* compiled from: Rescheduler.java */
    /* renamed from: io.grpc.h1.y1$c */
    /* loaded from: classes2.dex */
    private final class RunnableC9837c implements Runnable {
        private RunnableC9837c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9834y1.this.f23097b.execute(new RunnableC9836b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9834y1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C5055p c5055p) {
        this.f23098c = runnable;
        this.f23097b = executor;
        this.f23096a = scheduledExecutorService;
        this.f23099d = c5055p;
        c5055p.m25760g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public long m13857j() {
        return this.f23099d.m25763d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m13858i(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.f23101f = false;
        if (!z || (scheduledFuture = this.f23102g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f23102g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m13856k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long m13857j = m13857j() + nanos;
        this.f23101f = true;
        if (m13857j - this.f23100e < 0 || this.f23102g == null) {
            ScheduledFuture<?> scheduledFuture = this.f23102g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f23102g = this.f23096a.schedule(new RunnableC9837c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f23100e = m13857j;
    }
}
