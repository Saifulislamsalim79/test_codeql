package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes2.dex */
public final class C4407w4<V> extends FutureTask<V> implements Comparable<C4407w4<V>> {

    /* renamed from: c */
    private final long f10754c;

    /* renamed from: d */
    final boolean f10755d;

    /* renamed from: e */
    private final String f10756e;

    /* renamed from: f */
    final /* synthetic */ C4429y4 f10757f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4407w4(C4429y4 c4429y4, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f10757f = c4429y4;
        com.google.android.gms.common.internal.s.j(str);
        atomicLong = C4429y4.f10823l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f10754c = andIncrement;
        this.f10756e = str;
        this.f10755d = z;
        if (andIncrement == Long.MAX_VALUE) {
            ((v5) c4429y4).a.b().r().m28014a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4407w4 c4407w4 = (C4407w4) obj;
        boolean z = this.f10755d;
        if (z != c4407w4.f10755d) {
            return !z ? 1 : -1;
        }
        long j = this.f10754c;
        long j2 = c4407w4.f10754c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        ((v5) this.f10757f).a.b().t().m28013b("Two tasks share the same index. index", Long.valueOf(this.f10754c));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        ((v5) this.f10757f).a.b().r().m28013b(this.f10756e, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4407w4(C4429y4 c4429y4, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f10757f = c4429y4;
        com.google.android.gms.common.internal.s.j("Task exception on worker thread");
        atomicLong = C4429y4.f10823l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f10754c = andIncrement;
        this.f10756e = "Task exception on worker thread";
        this.f10755d = z;
        if (andIncrement == Long.MAX_VALUE) {
            ((v5) c4429y4).a.b().r().m28014a("Tasks index overflow");
        }
    }
}
