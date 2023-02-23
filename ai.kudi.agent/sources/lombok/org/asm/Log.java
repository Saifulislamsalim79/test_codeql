package lombok.org.asm;

import com.smartlook.coroutines.CoroutineExceptionHandler;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.p548k0.C13234l;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
/* loaded from: classes.dex */
public final class Log {
    public static final List<CoroutineExceptionHandler> callbacks;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        InterfaceC13230h $r4;
        List $r5;
        ClassLoader $r1 = CoroutineExceptionHandler.class.getClassLoader();
        ServiceLoader $r2 = ServiceLoader.load(CoroutineExceptionHandler.class, $r1);
        Iterator $r3 = $r2.iterator();
        $r4 = C13234l.m5588a($r3);
        $r5 = C13242n.m5563x($r4);
        callbacks = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write(kotlin.p476c0.InterfaceC11719g r9, java.lang.Throwable r10) {
        /*
            java.util.List<com.smartlook.coroutines.CoroutineExceptionHandler> r0 = lombok.org.asm.Log.callbacks
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.smartlook.coroutines.CoroutineExceptionHandler r5 = (com.smartlook.coroutines.CoroutineExceptionHandler) r5
            r4 = r5
            r4.m19313a(r9, r10)     // Catch: java.lang.Throwable -> L18
            goto L6
        L18:
            r6 = move-exception
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r8 = r7.getUncaughtExceptionHandler()
            java.lang.Throwable r6 = lombok.org.asm.ClassReader.m2381a(r10, r6)
            r8.uncaughtException(r7, r6)
            goto L6
        L29:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r8 = r7.getUncaughtExceptionHandler()
            r8.uncaughtException(r7, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.Log.write(kotlin.c0.g, java.lang.Throwable):void");
    }
}
