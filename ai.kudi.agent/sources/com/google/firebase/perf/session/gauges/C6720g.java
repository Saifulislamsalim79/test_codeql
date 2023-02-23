package com.google.firebase.perf.session.gauges;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p179k.C6654e;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: CpuGaugeCollector.java */
/* renamed from: com.google.firebase.perf.session.gauges.g */
/* loaded from: classes2.dex */
public class C6720g {

    /* renamed from: g */
    private static final C6609a f16158g = C6609a.m21475e();

    /* renamed from: h */
    private static final long f16159h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: i */
    private static C6720g f16160i = null;

    /* renamed from: c */
    private final String f16163c;

    /* renamed from: d */
    private final long f16164d;

    /* renamed from: e */
    private ScheduledFuture f16165e = null;

    /* renamed from: f */
    private long f16166f = -1;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C6654e> f16161a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private final ScheduledExecutorService f16162b = Executors.newSingleThreadScheduledExecutor();

    private C6720g() {
        int myPid = Process.myPid();
        this.f16163c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f16164d = m20972c();
    }

    /* renamed from: b */
    private long m20973b(long j) {
        double d = j;
        double d2 = this.f16164d;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = f16159h;
        Double.isNaN(d4);
        return Math.round(d3 * d4);
    }

    /* renamed from: c */
    private long m20972c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Os.sysconf(OsConstants._SC_CLK_TCK);
        }
        return -1L;
    }

    /* renamed from: d */
    public static C6720g m20971d() {
        if (f16160i == null) {
            f16160i = new C6720g();
        }
        return f16160i;
    }

    /* renamed from: e */
    public static boolean m20970e(long j) {
        return j <= 0;
    }

    /* renamed from: h */
    private synchronized void m20967h(final C6637h c6637h) {
        try {
            this.f16162b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6720g.this.m20969f(c6637h);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6609a c6609a = f16158g;
            c6609a.m21471i("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    /* renamed from: i */
    private synchronized void m20966i(long j, final C6637h c6637h) {
        this.f16166f = j;
        try {
            this.f16165e = this.f16162b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6720g.this.m20968g(c6637h);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6609a c6609a = f16158g;
            c6609a.m21471i("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    /* renamed from: l */
    private C6654e m20963l(C6637h c6637h) {
        if (c6637h == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f16163c));
            try {
                long m21402a = c6637h.m21402a();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                long parseLong3 = Long.parseLong(split[14]);
                long parseLong4 = Long.parseLong(split[16]);
                C6654e.C6656b m21335V = C6654e.m21335V();
                m21335V.m21331F(m21402a);
                m21335V.m21330G(m20973b(parseLong3 + parseLong4));
                m21335V.m21329H(m20973b(parseLong + parseLong2));
                C6654e build = m21335V.build();
                bufferedReader.close();
                return build;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C6609a c6609a = f16158g;
            c6609a.m21471i("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            C6609a c6609a2 = f16158g;
            c6609a2.m21471i("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            C6609a c6609a22 = f16158g;
            c6609a22.m21471i("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            C6609a c6609a222 = f16158g;
            c6609a222.m21471i("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public void m20974a(C6637h c6637h) {
        m20967h(c6637h);
    }

    /* renamed from: f */
    public /* synthetic */ void m20969f(C6637h c6637h) {
        C6654e m20963l = m20963l(c6637h);
        if (m20963l != null) {
            this.f16161a.add(m20963l);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m20968g(C6637h c6637h) {
        C6654e m20963l = m20963l(c6637h);
        if (m20963l != null) {
            this.f16161a.add(m20963l);
        }
    }

    /* renamed from: j */
    public void m20965j(long j, C6637h c6637h) {
        long j2 = this.f16164d;
        if (j2 == -1 || j2 == 0 || m20970e(j)) {
            return;
        }
        if (this.f16165e != null) {
            if (this.f16166f != j) {
                m20964k();
                m20966i(j, c6637h);
                return;
            }
            return;
        }
        m20966i(j, c6637h);
    }

    /* renamed from: k */
    public void m20964k() {
        ScheduledFuture scheduledFuture = this.f16165e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f16165e = null;
        this.f16166f = -1L;
    }
}
