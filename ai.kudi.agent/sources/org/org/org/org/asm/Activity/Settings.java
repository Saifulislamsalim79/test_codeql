package org.org.org.org.asm.Activity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.WrappingExecutorService;
/* loaded from: classes.dex */
public final class Settings {
    public static final Settings this$0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Settings $r0 = new Settings();
        this$0 = $r0;
    }

    private Settings() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ScheduledThreadPoolExecutor get(int i, String str) {
        Log_OC.getArray(str, "domain");
        Executors$DefaultThreadFactory $r2 = new Executors$DefaultThreadFactory(str);
        ScheduledThreadPoolExecutor $r3 = new ScheduledThreadPoolExecutor(i, $r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WrappingExecutorService get(int i, int i2, long j, TimeUnit timeUnit, String str) {
        Log_OC.getArray(timeUnit, "keepAliveUnit");
        Log_OC.getArray(str, "domain");
        WrappingExecutorService $r3 = new WrappingExecutorService(i, i2, j, timeUnit, str);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ExecutorService getString(int i, String str) {
        Log_OC.getArray(str, "domain");
        Executors$DefaultThreadFactory $r3 = new Executors$DefaultThreadFactory(str);
        ExecutorService $r2 = Executors.newFixedThreadPool(i, $r3);
        return $r2;
    }
}
