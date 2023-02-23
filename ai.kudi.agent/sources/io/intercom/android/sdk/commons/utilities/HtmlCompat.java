package io.intercom.android.sdk.commons.utilities;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
/* loaded from: classes.dex */
public class HtmlCompat {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Spanned fromHtml(String str) {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            Spanned $r1 = Html.fromHtml(str, 0);
            return $r1;
        }
        Spanned $r12 = Html.fromHtml(str);
        return $r12;
    }
}
