package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.p491i0.C11841h;
/* compiled from: DefaultExecutor.kt */
/* renamed from: kotlinx.coroutines.s0 */
/* loaded from: classes3.dex */
public final class RunnableC14039s0 extends AbstractC13760c1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: y */
    public static final RunnableC14039s0 f30618y;

    /* renamed from: z */
    private static final long f30619z;

    static {
        Long l;
        RunnableC14039s0 runnableC14039s0 = new RunnableC14039s0();
        f30618y = runnableC14039s0;
        AbstractC13756b1.m3752U0(runnableC14039s0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f30619z = timeUnit.toNanos(l.longValue());
    }

    private RunnableC14039s0() {
    }

    /* renamed from: s1 */
    private final synchronized void m3191s1() {
        if (m3189u1()) {
            debugStatus = 3;
            m3737n1();
            notifyAll();
        }
    }

    /* renamed from: t1 */
    private final synchronized Thread m3190t1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: u1 */
    private final boolean m3189u1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: v1 */
    private final synchronized boolean m3188v1() {
        if (m3189u1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC13807d1
    /* renamed from: c1 */
    protected Thread mo3192c1() {
        Thread thread = _thread;
        return thread == null ? m3190t1() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m3740k1;
        C13924k2.f30408a.m3401c(this);
        AbstractC13805d m3622a = C13809e.m3622a();
        if (m3622a != null) {
            m3622a.m3630c();
        }
        try {
            if (!m3188v1()) {
                if (m3740k1) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m3739l1 = m3739l1();
                if (m3739l1 == Long.MAX_VALUE) {
                    AbstractC13805d m3622a2 = C13809e.m3622a();
                    long nanoTime = m3622a2 == null ? System.nanoTime() : m3622a2.m3632a();
                    if (j == Long.MAX_VALUE) {
                        j = f30619z + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m3191s1();
                        AbstractC13805d m3622a3 = C13809e.m3622a();
                        if (m3622a3 != null) {
                            m3622a3.m3626g();
                        }
                        if (m3740k1()) {
                            return;
                        }
                        mo3192c1();
                        return;
                    }
                    m3739l1 = C11841h.m10267e(m3739l1, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (m3739l1 > 0) {
                    if (m3189u1()) {
                        _thread = null;
                        m3191s1();
                        AbstractC13805d m3622a4 = C13809e.m3622a();
                        if (m3622a4 != null) {
                            m3622a4.m3626g();
                        }
                        if (m3740k1()) {
                            return;
                        }
                        mo3192c1();
                        return;
                    }
                    AbstractC13805d m3622a5 = C13809e.m3622a();
                    if (m3622a5 == null) {
                        LockSupport.parkNanos(this, m3739l1);
                    } else {
                        m3622a5.m3631b(this, m3739l1);
                    }
                }
            }
        } finally {
            _thread = null;
            m3191s1();
            AbstractC13805d m3622a6 = C13809e.m3622a();
            if (m3622a6 != null) {
                m3622a6.m3626g();
            }
            if (!m3740k1()) {
                mo3192c1();
            }
        }
    }
}
