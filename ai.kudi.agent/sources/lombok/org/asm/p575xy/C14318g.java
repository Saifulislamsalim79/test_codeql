package lombok.org.asm.p575xy;

import java.util.concurrent.TimeUnit;
import kotlin.p491i0.C11841h;
import lombok.org.asm.asm.AnnotationWriter;
import lombok.org.asm.asm.ByteVector;
import lombok.org.asm.asm.MergeStrategy;
/* renamed from: lombok.org.asm.xy.g */
/* loaded from: classes.dex */
public final class C14318g {

    /* renamed from: a */
    public static final long f31518a;

    /* renamed from: b */
    public static final int f31519b;

    /* renamed from: c */
    public static final int f31520c;

    /* renamed from: d */
    public static final long f31521d;

    /* renamed from: g */
    public static SizeMetrics f31522g;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        int $i2;
        int $i1;
        long $l0 = AnnotationWriter.add("com.smartlook.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        f31518a = $l0;
        ByteVector.m2347a("com.smartlook.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int $i12 = MergeStrategy.f31334s;
        $i2 = C11841h.m10271a($i12, 2);
        int $i22 = ByteVector.m2347a("com.smartlook.coroutines.scheduler.core.pool.size", $i2, 1, 0, 8, null);
        f31520c = $i22;
        $i1 = C11841h.m10266f($i12 * 128, $i22, 2097150);
        f31519b = ByteVector.m2347a("com.smartlook.coroutines.scheduler.max.pool.size", $i1, 0, 2097150, 4, null);
        TimeUnit $r0 = TimeUnit.SECONDS;
        long $l02 = AnnotationWriter.add("com.smartlook.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        f31521d = $r0.toNanos($l02);
        WindDirection $r1 = WindDirection.f31500E;
        f31522g = $r1;
    }
}
