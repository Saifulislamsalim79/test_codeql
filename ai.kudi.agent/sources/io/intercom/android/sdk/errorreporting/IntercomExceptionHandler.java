package io.intercom.android.sdk.errorreporting;

import java.io.PrintStream;
import java.lang.Thread;
/* loaded from: classes.dex */
class IntercomExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler originalHandler;
    private final ErrorReporter reporter;

    IntercomExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ErrorReporter errorReporter) {
        this.originalHandler = uncaughtExceptionHandler;
        this.reporter = errorReporter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static void disable() {
        Thread.UncaughtExceptionHandler $r0 = Thread.getDefaultUncaughtExceptionHandler();
        boolean $z0 = $r0 instanceof IntercomExceptionHandler;
        if ($z0) {
            IntercomExceptionHandler $r1 = (IntercomExceptionHandler) $r0;
            Thread.setDefaultUncaughtExceptionHandler($r1.originalHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static void enable(ErrorReporter errorReporter) {
        Thread.UncaughtExceptionHandler $r1 = Thread.getDefaultUncaughtExceptionHandler();
        boolean $z0 = $r1 instanceof IntercomExceptionHandler;
        if ($z0) {
            return;
        }
        IntercomExceptionHandler $r2 = new IntercomExceptionHandler($r1, errorReporter);
        Thread.setDefaultUncaughtExceptionHandler($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ErrorReporter $r4 = this.reporter;
        $r4.saveReport(th);
        Thread.UncaughtExceptionHandler $r5 = this.originalHandler;
        if ($r5 != null) {
            $r5.uncaughtException(thread, th);
            return;
        }
        PrintStream $r6 = System.err;
        String $r2 = thread.getName();
        Object[] $r7 = {$r2};
        $r6.printf("Exception in thread \"%s\" ", $r7);
        PrintStream $r62 = System.err;
        th.printStackTrace($r62);
    }
}
