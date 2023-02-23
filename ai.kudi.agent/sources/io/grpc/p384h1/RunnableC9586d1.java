package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.C5059s;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: LogExceptionRunnable.java */
/* renamed from: io.grpc.h1.d1 */
/* loaded from: classes2.dex */
public final class RunnableC9586d1 implements Runnable {

    /* renamed from: d */
    private static final Logger f22461d = Logger.getLogger(RunnableC9586d1.class.getName());

    /* renamed from: c */
    private final Runnable f22462c;

    public RunnableC9586d1(Runnable runnable) {
        C5051n.m25779o(runnable, "task");
        this.f22462c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22462c.run();
        } catch (Throwable th) {
            Logger logger = f22461d;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f22462c, th);
            C5059s.m25750f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f22462c + ")";
    }
}
