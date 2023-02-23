package lombok.org.libs.org.objectweb.asm;

import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class WrappingExecutorService extends ThreadPoolExecutor {
    public final ScheduledThreadPoolExecutor delegate;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WrappingExecutorService(int r14, int r15, long r16, java.util.concurrent.TimeUnit r18, java.lang.String r19) {
        /*
            r13 = this;
            java.lang.String r8 = "keepAliveUnit"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.lang.String r8 = "domain"
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r8)
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            org.org.org.org.asm.Activity.Executors$DefaultThreadFactory r10 = new org.org.org.org.asm.Activity.Executors$DefaultThreadFactory
            r0 = r19
            r10.<init>(r0)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            org.org.org.org.asm.Activity.Settings r11 = org.org.org.org.asm.Activity.Settings.this$0
            java.lang.String r8 = "timeout"
            java.util.concurrent.ScheduledThreadPoolExecutor r12 = r11.get(r14, r8)
            r13.delegate = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.WrappingExecutorService.<init>(int, int, long, java.util.concurrent.TimeUnit, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void execute(final ClassReader classReader, Runnable runnable, long j, TimeUnit timeUnit) {
        Log_OC.getArray(classReader, "callback");
        Log_OC.getArray(runnable, "runnable");
        Log_OC.getArray(timeUnit, "timeoutUnit");
        ScheduledThreadPoolExecutor $r6 = this.delegate;
        boolean $z0 = $r6.isShutdown();
        if ($z0) {
            return;
        }
        try {
            final Future $r7 = submit(runnable);
            ScheduledThreadPoolExecutor $r62 = this.delegate;
            $r62.schedule(new Runnable() { // from class: lombok.org.libs.org.objectweb.asm.FileUtils$23
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    Future $r1 = $r7;
                    Log_OC.loadImage($r1, "task");
                    boolean $z02 = $r1.isDone();
                    if ($z02) {
                        return;
                    }
                    ClassReader $r2 = classReader;
                    TimeoutException $r3 = new TimeoutException();
                    $r2.m2129a($r3);
                    $r7.cancel(true);
                }
            }, j, timeUnit);
        } catch (RejectedExecutionException e) {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        ScheduledThreadPoolExecutor $r1 = this.delegate;
        $r1.shutdown();
        super.shutdown();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List shutdownNow() {
        ScheduledThreadPoolExecutor $r2 = this.delegate;
        $r2.shutdownNow();
        List $r1 = super.shutdownNow();
        Log_OC.loadImage($r1, "super.shutdownNow()");
        return $r1;
    }
}
