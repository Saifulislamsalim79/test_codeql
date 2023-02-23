package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: Deadline.java */
/* renamed from: io.grpc.u */
/* loaded from: classes2.dex */
public final class C10065u implements Comparable<C10065u> {

    /* renamed from: f */
    private static final C10067b f23823f = new C10067b();

    /* renamed from: w */
    private static final long f23824w;

    /* renamed from: x */
    private static final long f23825x;

    /* renamed from: y */
    private static final long f23826y;

    /* renamed from: c */
    private final AbstractC10068c f23827c;

    /* renamed from: d */
    private final long f23828d;

    /* renamed from: e */
    private volatile boolean f23829e;

    /* compiled from: Deadline.java */
    /* renamed from: io.grpc.u$b */
    /* loaded from: classes2.dex */
    private static class C10067b extends AbstractC10068c {
        private C10067b() {
        }

        @Override // io.grpc.C10065u.AbstractC10068c
        /* renamed from: a */
        public long mo13142a() {
            return System.nanoTime();
        }
    }

    /* compiled from: Deadline.java */
    /* renamed from: io.grpc.u$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10068c {
        /* renamed from: a */
        public abstract long mo13142a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f23824w = nanos;
        f23825x = -nanos;
        f23826y = TimeUnit.SECONDS.toNanos(1L);
    }

    private C10065u(AbstractC10068c abstractC10068c, long j, boolean z) {
        this(abstractC10068c, abstractC10068c.mo13142a(), j, z);
    }

    /* renamed from: a */
    public static C10065u m13151a(long j, TimeUnit timeUnit) {
        return m13150b(j, timeUnit, f23823f);
    }

    /* renamed from: b */
    public static C10065u m13150b(long j, TimeUnit timeUnit, AbstractC10068c abstractC10068c) {
        m13149e(timeUnit, "units");
        return new C10065u(abstractC10068c, timeUnit.toNanos(j), true);
    }

    /* renamed from: e */
    private static <T> T m13149e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: g */
    private void m13148g(C10065u c10065u) {
        if (this.f23827c == c10065u.f23827c) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f23827c + " and " + c10065u.f23827c + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10065u) {
            C10065u c10065u = (C10065u) obj;
            AbstractC10068c abstractC10068c = this.f23827c;
            if (abstractC10068c != null ? abstractC10068c == c10065u.f23827c : c10065u.f23827c == null) {
                return this.f23828d == c10065u.f23828d;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(C10065u c10065u) {
        m13148g(c10065u);
        long j = this.f23828d - c10065u.f23828d;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public int hashCode() {
        return Arrays.asList(this.f23827c, Long.valueOf(this.f23828d)).hashCode();
    }

    /* renamed from: i */
    public boolean m13146i(C10065u c10065u) {
        m13148g(c10065u);
        return this.f23828d - c10065u.f23828d < 0;
    }

    /* renamed from: j */
    public boolean m13145j() {
        if (!this.f23829e) {
            if (this.f23828d - this.f23827c.mo13142a() > 0) {
                return false;
            }
            this.f23829e = true;
        }
        return true;
    }

    /* renamed from: m */
    public C10065u m13144m(C10065u c10065u) {
        m13148g(c10065u);
        return m13146i(c10065u) ? this : c10065u;
    }

    /* renamed from: n */
    public long m13143n(TimeUnit timeUnit) {
        long mo13142a = this.f23827c.mo13142a();
        if (!this.f23829e && this.f23828d - mo13142a <= 0) {
            this.f23829e = true;
        }
        return timeUnit.convert(this.f23828d - mo13142a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long m13143n = m13143n(TimeUnit.NANOSECONDS);
        long abs = Math.abs(m13143n) / f23826y;
        long abs2 = Math.abs(m13143n) % f23826y;
        StringBuilder sb = new StringBuilder();
        if (m13143n < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f23827c != f23823f) {
            sb.append(" (ticker=" + this.f23827c + ")");
        }
        return sb.toString();
    }

    private C10065u(AbstractC10068c abstractC10068c, long j, long j2, boolean z) {
        this.f23827c = abstractC10068c;
        long min = Math.min(f23824w, Math.max(f23825x, j2));
        this.f23828d = j + min;
        this.f23829e = z && min <= 0;
    }
}
