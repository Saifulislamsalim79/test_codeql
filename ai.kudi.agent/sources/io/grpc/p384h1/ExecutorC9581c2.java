package io.grpc.p384h1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: SerializeReentrantCallsDirectExecutor.java */
/* renamed from: io.grpc.h1.c2 */
/* loaded from: classes2.dex */
class ExecutorC9581c2 implements Executor {

    /* renamed from: e */
    private static final Logger f22448e = Logger.getLogger(ExecutorC9581c2.class.getName());

    /* renamed from: c */
    private boolean f22449c;

    /* renamed from: d */
    private ArrayDeque<Runnable> f22450d;

    /* renamed from: a */
    private void m14403a() {
        while (true) {
            Runnable poll = this.f22450d.poll();
            if (poll == null) {
                return;
            }
            try {
                poll.run();
            } catch (Throwable th) {
                Logger logger = f22448e;
                Level level = Level.SEVERE;
                logger.log(level, "Exception while executing runnable " + poll, th);
            }
        }
    }

    /* renamed from: b */
    private void m14402b(Runnable runnable) {
        if (this.f22450d == null) {
            this.f22450d = new ArrayDeque<>(4);
        }
        this.f22450d.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r6.f22450d == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.lang.String r0 = "'task' must not be null."
            com.google.common.base.C5051n.m25779o(r7, r0)
            boolean r0 = r6.f22449c
            if (r0 != 0) goto L43
            r0 = 1
            r6.f22449c = r0
            r0 = 0
            r7.run()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f22450d
            if (r7 == 0) goto L17
        L14:
            r6.m14403a()
        L17:
            r6.f22449c = r0
            goto L46
        L1a:
            r1 = move-exception
            java.util.logging.Logger r2 = io.grpc.p384h1.ExecutorC9581c2.f22448e     // Catch: java.lang.Throwable -> L38
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "Exception while executing runnable "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r2.log(r3, r7, r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque<java.lang.Runnable> r7 = r6.f22450d
            if (r7 == 0) goto L17
            goto L14
        L38:
            r7 = move-exception
            java.util.ArrayDeque<java.lang.Runnable> r1 = r6.f22450d
            if (r1 == 0) goto L40
            r6.m14403a()
        L40:
            r6.f22449c = r0
            throw r7
        L43:
            r6.m14402b(r7)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.p384h1.ExecutorC9581c2.execute(java.lang.Runnable):void");
    }
}
