package com.google.firebase.installations.p161q;

import com.google.firebase.installations.C6439n;
import java.util.concurrent.TimeUnit;
/* compiled from: RequestLimiter.java */
/* renamed from: com.google.firebase.installations.q.e */
/* loaded from: classes2.dex */
class C6459e {

    /* renamed from: d */
    private static final long f15599d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f15600e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C6439n f15601a = C6439n.m22033c();

    /* renamed from: b */
    private long f15602b;

    /* renamed from: c */
    private int f15603c;

    /* renamed from: a */
    private synchronized long m21955a(int i) {
        if (!m21953c(i)) {
            return f15599d;
        }
        double pow = Math.pow(2.0d, this.f15603c);
        double m22031e = this.f15601a.m22031e();
        Double.isNaN(m22031e);
        return (long) Math.min(pow + m22031e, f15600e);
    }

    /* renamed from: c */
    private static boolean m21953c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m21952d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m21951e() {
        this.f15603c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m21954b() {
        boolean z;
        if (this.f15603c != 0) {
            z = this.f15601a.m22035a() > this.f15602b;
        }
        return z;
    }

    /* renamed from: f */
    public synchronized void m21950f(int i) {
        if (m21952d(i)) {
            m21951e();
            return;
        }
        this.f15603c++;
        this.f15602b = this.f15601a.m22035a() + m21955a(i);
    }
}
