package org.org.org.org.asm;

import io.intercom.android.sdk.views.holder.AttributeType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Frame {

    /* renamed from: h */
    public static final Frame f32306h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Frame $r0 = new Frame();
        f32306h = $r0;
    }

    private Frame() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String get(long j) {
        Locale $r2 = Locale.US;
        SimpleDateFormat $r1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss'Z'", $r2);
        TimeZone $r3 = TimeZone.getTimeZone("UTC");
        $r1.setTimeZone($r3);
        Date $r4 = new Date(j);
        String $r5 = $r1.format($r4);
        Log_OC.loadImage($r5, "SimpleDateFormat(\"yyyy-M…     }.format(Date(time))");
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String toString(Date date) {
        Log_OC.getArray(date, AttributeType.DATE);
        Locale $r3 = Locale.US;
        SimpleDateFormat $r2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", $r3);
        TimeZone $r4 = TimeZone.getTimeZone("UTC");
        $r2.setTimeZone($r4);
        String $r5 = $r2.format(date);
        Log_OC.loadImage($r5, "SimpleDateFormat(\"yyyy-M…\")\n        }.format(date)");
        return $r5;
    }
}
