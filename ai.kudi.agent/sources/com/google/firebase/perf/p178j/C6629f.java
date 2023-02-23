package com.google.firebase.perf.p178j;

import java.util.concurrent.TimeUnit;
/* compiled from: Rate.java */
/* renamed from: com.google.firebase.perf.j.f */
/* loaded from: classes2.dex */
public class C6629f {

    /* renamed from: a */
    private long f16002a;

    /* renamed from: b */
    private long f16003b;

    /* renamed from: c */
    private TimeUnit f16004c;

    /* compiled from: Rate.java */
    /* renamed from: com.google.firebase.perf.j.f$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6630a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16005a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f16005a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16005a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16005a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6629f(long j, long j2, TimeUnit timeUnit) {
        this.f16002a = j;
        this.f16003b = j2;
        this.f16004c = timeUnit;
    }

    /* renamed from: a */
    public double m21404a() {
        int i = C6630a.f16005a[this.f16004c.ordinal()];
        if (i == 1) {
            double d = this.f16002a;
            double d2 = this.f16003b;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            Double.isNaN(nanos);
            return d3 * nanos;
        } else if (i == 2) {
            double d4 = this.f16002a;
            double d5 = this.f16003b;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            double micros = TimeUnit.SECONDS.toMicros(1L);
            Double.isNaN(micros);
            return d6 * micros;
        } else if (i != 3) {
            double d7 = this.f16002a;
            double seconds = this.f16004c.toSeconds(this.f16003b);
            Double.isNaN(d7);
            Double.isNaN(seconds);
            return d7 / seconds;
        } else {
            double d8 = this.f16002a;
            double d9 = this.f16003b;
            Double.isNaN(d8);
            Double.isNaN(d9);
            double d10 = d8 / d9;
            double millis = TimeUnit.SECONDS.toMillis(1L);
            Double.isNaN(millis);
            return d10 * millis;
        }
    }
}
