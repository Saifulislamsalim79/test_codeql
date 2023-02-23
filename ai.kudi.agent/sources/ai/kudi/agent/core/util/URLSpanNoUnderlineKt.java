package ai.kudi.agent.core.util;

import android.text.Spannable;
import android.text.style.URLSpan;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: URLSpanNoUnderline.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m10421d2 = {"removeUnderlines", "", "Landroid/text/Spannable;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class URLSpanNoUnderlineKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final void removeUnderlines(Spannable spannable) {
        Log_OC.getArray(spannable, "<this>");
        int $i0 = spannable.length();
        Object[] $r2 = spannable.getSpans(0, $i0, URLSpan.class);
        URLSpan[] $r3 = (URLSpan[]) $r2;
        Log_OC.loadImage($r3, "spans");
        int $i02 = $r3.length;
        int $i1 = 0;
        while ($i1 < $i02) {
            URLSpan $r4 = $r3[$i1];
            $i1++;
            int $i2 = spannable.getSpanStart($r4);
            int $i3 = spannable.getSpanEnd($r4);
            spannable.removeSpan($r4);
            String $r5 = $r4.getURL();
            Log_OC.loadImage($r5, "span.url");
            URLSpanNoUnderline $r1 = new URLSpanNoUnderline($r5);
            spannable.setSpan($r1, $i2, $i3, 0);
        }
    }
}
