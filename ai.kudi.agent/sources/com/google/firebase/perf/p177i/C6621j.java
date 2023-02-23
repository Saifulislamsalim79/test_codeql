package com.google.firebase.perf.p177i;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6629f;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p178j.C6641k;
import com.google.firebase.perf.p178j.EnumC6626c;
import com.google.firebase.perf.p179k.C6671i;
import com.google.firebase.perf.p179k.C6675k;
import com.google.firebase.perf.p179k.EnumC6679l;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RateLimiter.java */
/* renamed from: com.google.firebase.perf.i.j */
/* loaded from: classes2.dex */
public final class C6621j {

    /* renamed from: a */
    private final C6569d f15947a;

    /* renamed from: b */
    private final float f15948b;

    /* renamed from: c */
    private C6622a f15949c;

    /* renamed from: d */
    private C6622a f15950d;

    /* renamed from: e */
    private boolean f15951e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RateLimiter.java */
    /* renamed from: com.google.firebase.perf.i.j$a */
    /* loaded from: classes2.dex */
    public static class C6622a {

        /* renamed from: k */
        private static final C6609a f15952k = C6609a.m21475e();

        /* renamed from: l */
        private static final long f15953l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        private final C6624a f15954a;

        /* renamed from: b */
        private final boolean f15955b;

        /* renamed from: c */
        private C6637h f15956c;

        /* renamed from: d */
        private C6629f f15957d;

        /* renamed from: e */
        private long f15958e;

        /* renamed from: f */
        private long f15959f;

        /* renamed from: g */
        private C6629f f15960g;

        /* renamed from: h */
        private C6629f f15961h;

        /* renamed from: i */
        private long f15962i;

        /* renamed from: j */
        private long f15963j;

        C6622a(C6629f c6629f, long j, C6624a c6624a, C6569d c6569d, String str, boolean z) {
            this.f15954a = c6624a;
            this.f15958e = j;
            this.f15957d = c6629f;
            this.f15959f = j;
            this.f15956c = c6624a.m21415a();
            m21445g(c6569d, str, z);
            this.f15955b = z;
        }

        /* renamed from: c */
        private static long m21449c(C6569d c6569d, String str) {
            if (str == "Trace") {
                return c6569d.m21623C();
            }
            return c6569d.m21596o();
        }

        /* renamed from: d */
        private static long m21448d(C6569d c6569d, String str) {
            if (str == "Trace") {
                return c6569d.m21593r();
            }
            return c6569d.m21593r();
        }

        /* renamed from: e */
        private static long m21447e(C6569d c6569d, String str) {
            if (str == "Trace") {
                return c6569d.m21622D();
            }
            return c6569d.m21595p();
        }

        /* renamed from: f */
        private static long m21446f(C6569d c6569d, String str) {
            if (str == "Trace") {
                return c6569d.m21593r();
            }
            return c6569d.m21593r();
        }

        /* renamed from: g */
        private void m21445g(C6569d c6569d, String str, boolean z) {
            long m21446f = m21446f(c6569d, str);
            long m21447e = m21447e(c6569d, str);
            C6629f c6629f = new C6629f(m21447e, m21446f, TimeUnit.SECONDS);
            this.f15960g = c6629f;
            this.f15962i = m21447e;
            if (z) {
                f15952k.m21478b("Foreground %s logging rate:%f, burst capacity:%d", str, c6629f, Long.valueOf(m21447e));
            }
            long m21448d = m21448d(c6569d, str);
            long m21449c = m21449c(c6569d, str);
            C6629f c6629f2 = new C6629f(m21449c, m21448d, TimeUnit.SECONDS);
            this.f15961h = c6629f2;
            this.f15963j = m21449c;
            if (z) {
                f15952k.m21478b("Background %s logging rate:%f, capacity:%d", str, c6629f2, Long.valueOf(m21449c));
            }
        }

        /* renamed from: a */
        synchronized void m21451a(boolean z) {
            this.f15957d = z ? this.f15960g : this.f15961h;
            this.f15958e = z ? this.f15962i : this.f15963j;
        }

        /* renamed from: b */
        synchronized boolean m21450b(C6671i c6671i) {
            double m21400c = this.f15956c.m21400c(this.f15954a.m21415a());
            double m21404a = this.f15957d.m21404a();
            Double.isNaN(m21400c);
            double d = m21400c * m21404a;
            double d2 = f15953l;
            Double.isNaN(d2);
            long max = Math.max(0L, (long) (d / d2));
            this.f15959f = Math.min(this.f15959f + max, this.f15958e);
            if (max > 0) {
                long m21399d = this.f15956c.m21399d();
                double d3 = max * f15953l;
                double m21404a2 = this.f15957d.m21404a();
                Double.isNaN(d3);
                this.f15956c = new C6637h(m21399d + ((long) (d3 / m21404a2)));
            }
            if (this.f15959f > 0) {
                this.f15959f--;
                return true;
            }
            if (this.f15955b) {
                f15952k.m21471i("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public C6621j(Context context, C6629f c6629f, long j) {
        this(c6629f, j, new C6624a(), m21456c(), C6569d.m21605f());
        this.f15951e = C6641k.m21392b(context);
    }

    /* renamed from: c */
    static float m21456c() {
        return new Random().nextFloat();
    }

    /* renamed from: d */
    private boolean m21455d(List<C6675k> list) {
        return list.size() > 0 && list.get(0).m21192X() > 0 && list.get(0).m21193W(0) == EnumC6679l.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: e */
    private boolean m21454e() {
        return this.f15948b < this.f15947a.m21594q();
    }

    /* renamed from: f */
    private boolean m21453f() {
        return this.f15948b < this.f15947a.m21621E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m21458a(boolean z) {
        this.f15949c.m21451a(z);
        this.f15950d.m21451a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m21457b(C6671i c6671i) {
        if (!c6671i.mo21203k() || m21453f() || m21455d(c6671i.mo21202l().m21159p0())) {
            if (!c6671i.mo21201o() || m21454e() || m21455d(c6671i.mo21200p().m21254m0())) {
                if (m21452g(c6671i)) {
                    if (c6671i.mo21201o()) {
                        return this.f15950d.m21450b(c6671i);
                    }
                    if (c6671i.mo21203k()) {
                        return this.f15949c.m21450b(c6671i);
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    boolean m21452g(C6671i c6671i) {
        return (!c6671i.mo21203k() || (!(c6671i.mo21202l().m21160o0().equals(EnumC6626c.FOREGROUND_TRACE_NAME.toString()) || c6671i.mo21202l().m21160o0().equals(EnumC6626c.BACKGROUND_TRACE_NAME.toString())) || c6671i.mo21202l().m21167h0() <= 0)) && !c6671i.mo21204i();
    }

    C6621j(C6629f c6629f, long j, C6624a c6624a, float f, C6569d c6569d) {
        this.f15949c = null;
        this.f15950d = null;
        boolean z = false;
        this.f15951e = false;
        if (0.0f <= f && f < 1.0f) {
            z = true;
        }
        C6641k.m21393a(z, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f15948b = f;
        this.f15947a = c6569d;
        this.f15949c = new C6622a(c6629f, j, c6624a, c6569d, "Trace", this.f15951e);
        this.f15950d = new C6622a(c6629f, j, c6624a, c6569d, TransactionField.NETWORK, this.f15951e);
    }
}
