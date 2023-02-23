package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p178j.C6641k;
import com.google.firebase.perf.p178j.EnumC6631g;
import com.google.firebase.perf.p179k.C6645b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: MemoryGaugeCollector.java */
/* renamed from: com.google.firebase.perf.session.gauges.i */
/* loaded from: classes2.dex */
public class C6722i {

    /* renamed from: f */
    private static final C6609a f16173f = C6609a.m21475e();

    /* renamed from: g */
    private static final C6722i f16174g = new C6722i();

    /* renamed from: a */
    private final ScheduledExecutorService f16175a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C6645b> f16176b;

    /* renamed from: c */
    private final Runtime f16177c;

    /* renamed from: d */
    private ScheduledFuture f16178d;

    /* renamed from: e */
    private long f16179e;

    private C6722i() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    /* renamed from: b */
    private int m20955b() {
        return C6641k.m21391c(EnumC6631g.f16010x.m21403a(this.f16177c.totalMemory() - this.f16177c.freeMemory()));
    }

    /* renamed from: c */
    public static C6722i m20954c() {
        return f16174g;
    }

    /* renamed from: d */
    public static boolean m20953d(long j) {
        return j <= 0;
    }

    /* renamed from: g */
    private synchronized void m20950g(final C6637h c6637h) {
        try {
            this.f16175a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    C6722i.this.m20952e(c6637h);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6609a c6609a = f16173f;
            c6609a.m21471i("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    /* renamed from: h */
    private synchronized void m20949h(long j, final C6637h c6637h) {
        this.f16179e = j;
        try {
            this.f16178d = this.f16175a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.f
                @Override // java.lang.Runnable
                public final void run() {
                    C6722i.this.m20951f(c6637h);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C6609a c6609a = f16173f;
            c6609a.m21471i("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    /* renamed from: k */
    private C6645b m20946k(C6637h c6637h) {
        if (c6637h == null) {
            return null;
        }
        long m21402a = c6637h.m21402a();
        C6645b.C6647b m21371U = C6645b.m21371U();
        m21371U.m21368F(m21402a);
        m21371U.m21367G(m20955b());
        return m21371U.build();
    }

    /* renamed from: a */
    public void m20956a(C6637h c6637h) {
        m20950g(c6637h);
    }

    /* renamed from: e */
    public /* synthetic */ void m20952e(C6637h c6637h) {
        C6645b m20946k = m20946k(c6637h);
        if (m20946k != null) {
            this.f16176b.add(m20946k);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m20951f(C6637h c6637h) {
        C6645b m20946k = m20946k(c6637h);
        if (m20946k != null) {
            this.f16176b.add(m20946k);
        }
    }

    /* renamed from: i */
    public void m20948i(long j, C6637h c6637h) {
        if (m20953d(j)) {
            return;
        }
        if (this.f16178d != null) {
            if (this.f16179e != j) {
                m20947j();
                m20949h(j, c6637h);
                return;
            }
            return;
        }
        m20949h(j, c6637h);
    }

    /* renamed from: j */
    public void m20947j() {
        ScheduledFuture scheduledFuture = this.f16178d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f16178d = null;
        this.f16179e = -1L;
    }

    C6722i(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f16178d = null;
        this.f16179e = -1L;
        this.f16175a = scheduledExecutorService;
        this.f16176b = new ConcurrentLinkedQueue<>();
        this.f16177c = runtime;
    }
}
