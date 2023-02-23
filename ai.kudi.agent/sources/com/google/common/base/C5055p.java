package com.google.common.base;

import java.util.concurrent.TimeUnit;
/* compiled from: Stopwatch.java */
/* renamed from: com.google.common.base.p */
/* loaded from: classes2.dex */
public final class C5055p {

    /* renamed from: a */
    private final AbstractC5060t f12701a = AbstractC5060t.m25749b();

    /* renamed from: b */
    private boolean f12702b;

    /* renamed from: c */
    private long f12703c;

    /* renamed from: d */
    private long f12704d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Stopwatch.java */
    /* renamed from: com.google.common.base.p$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5056a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12705a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f12705a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12705a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12705a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12705a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12705a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12705a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12705a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C5055p() {
    }

    /* renamed from: a */
    private static String m25766a(TimeUnit timeUnit) {
        switch (C5056a.f12705a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static TimeUnit m25765b(long j) {
        if (TimeUnit.DAYS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    /* renamed from: c */
    public static C5055p m25764c() {
        return new C5055p();
    }

    /* renamed from: e */
    private long m25762e() {
        return this.f12702b ? (this.f12701a.mo25748a() - this.f12704d) + this.f12703c : this.f12703c;
    }

    /* renamed from: d */
    public long m25763d(TimeUnit timeUnit) {
        return timeUnit.convert(m25762e(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: f */
    public C5055p m25761f() {
        this.f12703c = 0L;
        this.f12702b = false;
        return this;
    }

    /* renamed from: g */
    public C5055p m25760g() {
        C5051n.m25773u(!this.f12702b, "This stopwatch is already running.");
        this.f12702b = true;
        this.f12704d = this.f12701a.mo25748a();
        return this;
    }

    public String toString() {
        long m25762e = m25762e();
        TimeUnit m25765b = m25765b(m25762e);
        double d = m25762e;
        double convert = TimeUnit.NANOSECONDS.convert(1L, m25765b);
        Double.isNaN(d);
        Double.isNaN(convert);
        String m25797b = C5048m.m25797b(d / convert);
        String m25766a = m25766a(m25765b);
        StringBuilder sb = new StringBuilder(String.valueOf(m25797b).length() + 1 + String.valueOf(m25766a).length());
        sb.append(m25797b);
        sb.append(" ");
        sb.append(m25766a);
        return sb.toString();
    }
}
