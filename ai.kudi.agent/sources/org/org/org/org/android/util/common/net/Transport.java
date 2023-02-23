package org.org.org.org.android.util.common.net;

import android.util.Log;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Transport implements Shell {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // org.org.org.org.android.util.common.net.Shell
    public void sendMessage(InterruptedException interruptedException) {
        Log_OC.getArray(interruptedException, "exception");
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Interrupted: ");
        String $r3 = interruptedException.getMessage();
        $r2.append($r3);
        String $r32 = $r2.toString();
        Log.w("ANRWatchdog", $r32);
    }
}
