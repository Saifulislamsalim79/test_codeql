package io.intercom.com.bumptech.glide.p416r;

import android.os.Build;
import android.os.SystemClock;
/* compiled from: LogTime.java */
/* renamed from: io.intercom.com.bumptech.glide.r.d */
/* loaded from: classes3.dex */
public final class C10888d {

    /* renamed from: a */
    private static final double f24854a;

    static {
        f24854a = 17 <= Build.VERSION.SDK_INT ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    /* renamed from: a */
    public static double m12032a(long j) {
        double m12031b = m12031b() - j;
        double d = f24854a;
        Double.isNaN(m12031b);
        return m12031b * d;
    }

    /* renamed from: b */
    public static long m12031b() {
        if (17 <= Build.VERSION.SDK_INT) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
