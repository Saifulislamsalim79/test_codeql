package lombok.org.asm;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p491i0.C11841h;
import kotlin.p549l0.C13275r;
/* loaded from: classes.dex */
public final class PagerSlidingTabStrip extends SpdyStream$SpdyDataSource {

    /* renamed from: a */
    public static final PagerSlidingTabStrip f31296a;

    /* renamed from: e */
    public static volatile Executor f31297e;

    /* renamed from: k */
    public static final int f31298k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        String $r2;
        int $i0;
        Integer $r3;
        PagerSlidingTabStrip $r1 = new PagerSlidingTabStrip();
        f31296a = $r1;
        try {
            $r2 = System.getProperty("com.smartlook.coroutines.default.parallelism");
        } catch (Throwable th) {
            $r2 = null;
        }
        if ($r2 != null) {
            $r3 = C13275r.m5455k($r2);
            if ($r3 != null) {
                int $i02 = $r3.intValue();
                $i0 = $i02 >= 1 ? $r3.intValue() : -1;
            }
            IllegalStateException $r5 = new IllegalStateException(("Expected positive number in com.smartlook.coroutines.default.parallelism, but has " + $r2).toString());
            throw $r5;
        }
        f31298k = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.concurrent.Executor m2358a() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.PagerSlidingTabStrip.m2358a():java.util.concurrent.Executor");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public void mo2139a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        Executor $r2 = f31297e;
        if ($r2 == null) {
            try {
                $r2 = m2358a();
            } catch (RejectedExecutionException e) {
                Handler $r5 = Handler.f31286d;
                $r5.m2348d(runnable);
                return;
            }
        }
        $r2.execute(runnable);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final int m2357b() {
        int $i0;
        int $i02 = f31298k;
        Integer $r1 = Integer.valueOf($i02);
        Integer $r2 = $r1;
        int $i03 = $r1.intValue();
        boolean $z0 = $i03 > 0;
        if (!$z0) {
            $r2 = null;
        }
        if ($r2 != null) {
            int $i04 = $r2.intValue();
            return $i04;
        }
        Runtime $r3 = Runtime.getRuntime();
        int $i05 = $r3.availableProcessors();
        $i0 = C11841h.m10271a($i05 - 1, 1);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        String $r2 = "Close cannot be invoked on CommonPool".toString();
        IllegalStateException $r1 = new IllegalStateException($r2);
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ExecutorService createExecutor() {
        final AtomicInteger $r2 = new AtomicInteger();
        int $i0 = m2357b();
        ExecutorService $r3 = Executors.newFixedThreadPool($i0, new ThreadFactory() { // from class: lombok.org.asm.a1$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder $r32 = new StringBuilder();
                $r32.append("CommonPool-worker-");
                AtomicInteger $r4 = $r2;
                int $i02 = $r4.incrementAndGet();
                $r32.append($i02);
                String $r5 = $r32.toString();
                Thread $r1 = new Thread(runnable, $r5);
                $r1.setDaemon(true);
                return $r1;
            }
        });
        return $r3;
    }

    @Override // lombok.org.asm.AbstractC14272i
    public String toString() {
        return "CommonPool";
    }
}
