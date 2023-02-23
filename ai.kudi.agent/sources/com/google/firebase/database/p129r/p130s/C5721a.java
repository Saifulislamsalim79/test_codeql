package com.google.firebase.database.p129r.p130s;

import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: RetryHelper.java */
/* renamed from: com.google.firebase.database.r.s.a */
/* loaded from: classes2.dex */
public class C5721a {

    /* renamed from: a */
    private final ScheduledExecutorService f14073a;

    /* renamed from: b */
    private final C5899c f14074b;

    /* renamed from: c */
    private final long f14075c;

    /* renamed from: d */
    private final long f14076d;

    /* renamed from: e */
    private final double f14077e;

    /* renamed from: f */
    private final double f14078f;

    /* renamed from: g */
    private final Random f14079g;

    /* renamed from: h */
    private ScheduledFuture<?> f14080h;

    /* renamed from: i */
    private long f14081i;

    /* renamed from: j */
    private boolean f14082j;

    /* compiled from: RetryHelper.java */
    /* renamed from: com.google.firebase.database.r.s.a$a */
    /* loaded from: classes2.dex */
    class RunnableC5722a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Runnable f14083c;

        RunnableC5722a(Runnable runnable) {
            this.f14083c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5721a.this.f14080h = null;
            this.f14083c.run();
        }
    }

    /* compiled from: RetryHelper.java */
    /* renamed from: com.google.firebase.database.r.s.a$b */
    /* loaded from: classes2.dex */
    public static class C5723b {

        /* renamed from: a */
        private final ScheduledExecutorService f14085a;

        /* renamed from: b */
        private long f14086b = 1000;

        /* renamed from: c */
        private double f14087c = 0.5d;

        /* renamed from: d */
        private long f14088d = 30000;

        /* renamed from: e */
        private double f14089e = 1.3d;

        /* renamed from: f */
        private final C5899c f14090f;

        public C5723b(ScheduledExecutorService scheduledExecutorService, InterfaceC5900d interfaceC5900d, String str) {
            this.f14085a = scheduledExecutorService;
            this.f14090f = new C5899c(interfaceC5900d, str);
        }

        /* renamed from: a */
        public C5721a m24015a() {
            return new C5721a(this.f14085a, this.f14090f, this.f14086b, this.f14088d, this.f14089e, this.f14087c, null);
        }

        /* renamed from: b */
        public C5723b m24014b(double d) {
            if (d >= 0.0d && d <= 1.0d) {
                this.f14087c = d;
                return this;
            }
            throw new IllegalArgumentException("Argument out of range: " + d);
        }

        /* renamed from: c */
        public C5723b m24013c(long j) {
            this.f14088d = j;
            return this;
        }

        /* renamed from: d */
        public C5723b m24012d(long j) {
            this.f14086b = j;
            return this;
        }

        /* renamed from: e */
        public C5723b m24011e(double d) {
            this.f14089e = d;
            return this;
        }
    }

    /* synthetic */ C5721a(ScheduledExecutorService scheduledExecutorService, C5899c c5899c, long j, long j2, double d, double d2, RunnableC5722a runnableC5722a) {
        this(scheduledExecutorService, c5899c, j, j2, d, d2);
    }

    /* renamed from: b */
    public void m24019b() {
        if (this.f14080h != null) {
            this.f14074b.m23366b("Cancelling existing retry attempt", new Object[0]);
            this.f14080h.cancel(false);
            this.f14080h = null;
        } else {
            this.f14074b.m23366b("No existing retry attempt to cancel", new Object[0]);
        }
        this.f14081i = 0L;
    }

    /* renamed from: c */
    public void m24018c(Runnable runnable) {
        RunnableC5722a runnableC5722a = new RunnableC5722a(runnable);
        if (this.f14080h != null) {
            this.f14074b.m23366b("Cancelling previous scheduled retry", new Object[0]);
            this.f14080h.cancel(false);
            this.f14080h = null;
        }
        long j = 0;
        if (!this.f14082j) {
            long j2 = this.f14081i;
            if (j2 == 0) {
                this.f14081i = this.f14075c;
            } else {
                double d = j2;
                double d2 = this.f14078f;
                Double.isNaN(d);
                this.f14081i = Math.min((long) (d * d2), this.f14076d);
            }
            double d3 = this.f14077e;
            long j3 = this.f14081i;
            double d4 = j3;
            Double.isNaN(d4);
            double d5 = j3;
            Double.isNaN(d5);
            j = (long) (((1.0d - d3) * d4) + (d3 * d5 * this.f14079g.nextDouble()));
        }
        this.f14082j = false;
        this.f14074b.m23366b("Scheduling retry in %dms", Long.valueOf(j));
        this.f14080h = this.f14073a.schedule(runnableC5722a, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public void m24017d() {
        this.f14081i = this.f14076d;
    }

    /* renamed from: e */
    public void m24016e() {
        this.f14082j = true;
        this.f14081i = 0L;
    }

    private C5721a(ScheduledExecutorService scheduledExecutorService, C5899c c5899c, long j, long j2, double d, double d2) {
        this.f14079g = new Random();
        this.f14082j = true;
        this.f14073a = scheduledExecutorService;
        this.f14074b = c5899c;
        this.f14075c = j;
        this.f14076d = j2;
        this.f14078f = d;
        this.f14077e = d2;
    }
}
