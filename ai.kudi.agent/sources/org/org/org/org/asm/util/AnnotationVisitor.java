package org.org.org.org.asm.util;

import android.view.WindowManager;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class AnnotationVisitor {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Float get(WindowManager.LayoutParams layoutParams) {
        Log_OC.getArray(layoutParams, "$this$dimAmount");
        int $i0 = layoutParams.flags;
        if (($i0 & 2) == 2) {
            float $f1 = layoutParams.dimAmount;
            float $f0 = 255.0f * $f1;
            Float $r0 = Float.valueOf($f0);
            return $r0;
        }
        return null;
    }
}
