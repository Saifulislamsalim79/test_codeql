package com.bumptech.glide.p086q;

import android.os.Build;
import android.os.SystemClock;
/* compiled from: LogTime.java */
/* renamed from: com.bumptech.glide.q.f */
/* loaded from: classes2.dex */
public final class C2376f {

    /* renamed from: a */
    private static final double f6867a;

    static {
        f6867a = Build.VERSION.SDK_INT >= 17 ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    /* renamed from: a */
    public static double m33146a(long j) {
        double m33145b = m33145b() - j;
        double d = f6867a;
        Double.isNaN(m33145b);
        return m33145b * d;
    }

    /* renamed from: b */
    public static long m33145b() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }
}
