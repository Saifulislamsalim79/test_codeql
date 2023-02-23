package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p491i0.C11841h;
import kotlin.p549l0.C13275r;
/* compiled from: CommonPool.kt */
/* renamed from: kotlinx.coroutines.v */
/* loaded from: classes3.dex */
public final class C14086v extends AbstractC13860h1 {

    /* renamed from: d */
    public static final C14086v f30725d = new C14086v();

    /* renamed from: e */
    private static final int f30726e;

    /* renamed from: f */
    private static boolean f30727f;
    private static volatile Executor pool;

    static {
        String str;
        Integer m5455k;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            m5455k = C13275r.m5455k(str);
            if (m5455k != null && m5455k.intValue() >= 1) {
                intValue = m5455k.intValue();
            } else {
                throw new IllegalStateException(kotlin.e0.d.l.m("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
        }
        f30726e = intValue;
    }

    private C14086v() {
    }

    /* renamed from: J0 */
    private final ExecutorService m3076J0() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(m3072Q0(), new ThreadFactory() { // from class: kotlinx.coroutines.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m3075K0;
                m3075K0 = C14086v.m3075K0(atomicInteger, runnable);
                return m3075K0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final Thread m3075K0(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, kotlin.e0.d.l.m("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.concurrent.ExecutorService m3074L0() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = r6.m3076J0()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = r6.m3076J0()
            return r0
        L1b:
            boolean r2 = kotlinx.coroutines.C14086v.f30727f
            r3 = 0
            if (r2 != 0) goto L4b
            int r2 = kotlinx.coroutines.C14086v.f30726e
            if (r2 >= 0) goto L4b
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch: java.lang.Throwable -> L39
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L39
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 != 0) goto L3d
            goto L4b
        L3d:
            kotlinx.coroutines.v r4 = kotlinx.coroutines.C14086v.f30725d
            boolean r4 = r4.m3071U0(r1, r2)
            if (r4 == 0) goto L46
            goto L47
        L46:
            r2 = r0
        L47:
            if (r2 != 0) goto L4a
            goto L4b
        L4a:
            return r2
        L4b:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L70
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L70
            r4[r3] = r5     // Catch: java.lang.Throwable -> L70
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.v r4 = kotlinx.coroutines.C14086v.f30725d     // Catch: java.lang.Throwable -> L70
            int r4 = r4.m3072Q0()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L70
            r2[r3] = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L70
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L71
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L70
            r0 = r1
            goto L71
        L70:
        L71:
            if (r0 != 0) goto L77
            java.util.concurrent.ExecutorService r0 = r6.m3076J0()
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C14086v.m3074L0():java.util.concurrent.ExecutorService");
    }

    /* renamed from: P0 */
    private final synchronized Executor m3073P0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m3074L0();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: Q0 */
    private final int m3072Q0() {
        int m10271a;
        Integer valueOf = Integer.valueOf(f30726e);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            m10271a = C11841h.m10271a(Runtime.getRuntime().availableProcessors() - 1, 1);
            return m10271a;
        }
        return valueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m3070X0() {
    }

    /* renamed from: U0 */
    public final boolean m3071U0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(RunnableC13754b.f30196c);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m3073P0();
            }
            AbstractC13805d m3622a = C13809e.m3622a();
            executor.execute(m3622a == null ? runnable : m3622a.m3625h(runnable));
        } catch (RejectedExecutionException unused) {
            AbstractC13805d m3622a2 = C13809e.m3622a();
            if (m3622a2 != null) {
                m3622a2.m3628e();
            }
            RunnableC14039s0.f30618y.m3742i1(runnable);
        }
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        return "CommonPool";
    }
}
