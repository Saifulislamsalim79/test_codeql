package kotlinx.coroutines.p563u2;

import java.util.concurrent.TimeUnit;
import kotlin.p491i0.C11841h;
import kotlinx.coroutines.internal.C13871b0;
import kotlinx.coroutines.internal.C13915z;
/* compiled from: Tasks.kt */
/* renamed from: kotlinx.coroutines.u2.l */
/* loaded from: classes3.dex */
public final class C14084l {

    /* renamed from: a */
    public static final long f30715a;

    /* renamed from: b */
    public static final int f30716b;

    /* renamed from: c */
    public static final int f30717c;

    /* renamed from: d */
    public static final long f30718d;

    /* renamed from: e */
    public static AbstractC14080h f30719e;

    static {
        long m3552e;
        int m10271a;
        int m3553d;
        int m10266f;
        int m3553d2;
        long m3552e2;
        m3552e = C13871b0.m3552e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f30715a = m3552e;
        C13871b0.m3553d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        m10271a = C11841h.m10271a(C13915z.m3420a(), 2);
        m3553d = C13871b0.m3553d("kotlinx.coroutines.scheduler.core.pool.size", m10271a, 1, 0, 8, null);
        f30716b = m3553d;
        m10266f = C11841h.m10266f(C13915z.m3420a() * 128, f30716b, 2097150);
        m3553d2 = C13871b0.m3553d("kotlinx.coroutines.scheduler.max.pool.size", m10266f, 0, 2097150, 4, null);
        f30717c = m3553d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m3552e2 = C13871b0.m3552e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f30718d = timeUnit.toNanos(m3552e2);
        f30719e = C14078f.f30709a;
    }
}
