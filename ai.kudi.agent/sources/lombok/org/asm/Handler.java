package lombok.org.asm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.p491i0.C11841h;
/* loaded from: classes.dex */
public final class Handler extends XYPlot implements Runnable {

    /* renamed from: a */
    public static volatile Thread f31284a;

    /* renamed from: c */
    public static final long f31285c;

    /* renamed from: d */
    public static final Handler f31286d;
    public static volatile int type;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Long $r3;
        Handler $r1 = new Handler();
        f31286d = $r1;
        AbstractC14271h.m2280a($r1, false, 1, null);
        TimeUnit $r2 = TimeUnit.MILLISECONDS;
        try {
            $r3 = Long.getLong("com.smartlook.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException e) {
            $r3 = 1000L;
        }
        long $l0 = $r3.longValue();
        f31285c = $r2.toNanos($l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractC14246L
    public Thread get() {
        Thread $r1;
        Thread $r12 = f31284a;
        if ($r12 != null) {
            return $r12;
        }
        synchronized (this) {
            $r1 = f31284a;
            if ($r1 == null) {
                $r1 = new Thread(this, "com.smartlook.coroutines.DefaultExecutor");
                f31284a = $r1;
                $r1.setDaemon(true);
                $r1.start();
            }
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getType() {
        int $i0 = type;
        return $i0 == 2 || $i0 == 3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final synchronized void init() {
        boolean $z0 = getType();
        if ($z0) {
            type = 3;
            setOrientation();
            notifyAll();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Runnable
    public void run() {
        boolean $z0;
        boolean $z1;
        long $l1;
        C14312w c14312w = C14312w.f31491a;
        ThreadLocal $r2 = C14312w.f31492c;
        $r2.set(this);
        try {
            synchronized (this) {
                boolean $z02 = getType();
                $z1 = true;
                if ($z02) {
                    $z1 = false;
                } else {
                    type = 1;
                    notifyAll();
                }
            }
            if (!$z1) {
                if ($z0) {
                    return;
                }
                return;
            }
            long $l0 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long $l12 = mo2281a();
                long $l2 = $l12;
                if ($l12 == Long.MAX_VALUE) {
                    long $l22 = System.nanoTime();
                    if ($l0 == Long.MAX_VALUE) {
                        long $l02 = f31285c;
                        $l0 = $l02 + $l22;
                    }
                    long $l23 = $l0 - $l22;
                    if ($l23 <= 0) {
                        f31284a = null;
                        init();
                        boolean $z03 = m2350b();
                        if ($z03) {
                            return;
                        }
                        get();
                        return;
                    }
                    $l1 = C11841h.m10267e($l12, $l23);
                    $l2 = $l1;
                } else {
                    $l0 = Long.MAX_VALUE;
                }
                if ($l2 > 0) {
                    boolean $z04 = getType();
                    if ($z04) {
                        f31284a = null;
                        init();
                        boolean $z05 = m2350b();
                        if ($z05) {
                            return;
                        }
                        get();
                        return;
                    }
                    LockSupport.parkNanos(this, $l2);
                }
            }
        } finally {
            f31284a = null;
            init();
            $z0 = m2350b();
            if (!$z0) {
                get();
            }
        }
    }
}
