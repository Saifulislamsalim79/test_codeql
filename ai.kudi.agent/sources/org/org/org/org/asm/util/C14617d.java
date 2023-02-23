package org.org.org.org.asm.util;

import android.graphics.Canvas;
import android.view.WindowManager;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.asm.C14590m;
/* renamed from: org.org.org.org.asm.util.d */
/* loaded from: classes.dex */
public final class C14617d {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: b */
    public static final void m1039b(C14590m c14590m, Canvas canvas) {
        Log_OC.getArray(c14590m, "$this$drawDim");
        Log_OC.getArray(canvas, "canvas");
        WindowManager.LayoutParams $r2 = c14590m.m1118f();
        Float $r3 = AnnotationVisitor.get($r2);
        if ($r3 != null) {
            float $f0 = $r3.floatValue();
            int $i0 = (int) $f0;
            canvas.drawARGB($i0, 0, 0, 0);
        }
    }
}
