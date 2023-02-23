package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: AutoDisposeBackpressureHelper.java */
/* renamed from: com.uber.autodispose.e */
/* loaded from: classes2.dex */
final class C7403e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m18798a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m18797b(j2, j)));
        return j2;
    }

    /* renamed from: b */
    private static long m18797b(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }
}
