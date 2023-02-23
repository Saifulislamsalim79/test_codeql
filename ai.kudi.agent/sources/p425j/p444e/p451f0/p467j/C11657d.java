package p425j.p444e.p451f0.p467j;

import j.e.i0.a;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: BackpressureHelper.java */
/* renamed from: j.e.f0.j.d */
/* loaded from: classes3.dex */
public final class C11657d {
    /* renamed from: a */
    public static long m10657a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m10655c(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m10656b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m10655c(j2, j)));
        return j2;
    }

    /* renamed from: c */
    public static long m10655c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: d */
    public static long m10654d(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                a.r(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
