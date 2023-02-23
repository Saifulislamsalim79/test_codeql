package p425j.p444e;

import j.e.c0.c;
import java.util.concurrent.TimeUnit;
/* compiled from: Scheduler.java */
/* renamed from: j.e.v$b */
/* loaded from: classes3.dex */
public abstract class v$b implements c {
    /* renamed from: a */
    public long m10449a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    public c mo10448b(Runnable runnable) {
        return mo10447c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public abstract c mo10447c(Runnable runnable, long j, TimeUnit timeUnit);
}
