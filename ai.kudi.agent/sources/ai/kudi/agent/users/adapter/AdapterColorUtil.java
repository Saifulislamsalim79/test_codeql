package ai.kudi.agent.users.adapter;

import ai.kudi.agent.C0001R;
import android.content.Context;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AdapterColorUtil.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/users/adapter/AdapterColorUtil;", "", "()V", "getViewHolderBackgroundColor", "", "context", "Landroid/content/Context;", "instanceNo", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AdapterColorUtil {
    public static final AdapterColorUtil INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AdapterColorUtil $r0 = new AdapterColorUtil();
        INSTANCE = $r0;
    }

    private AdapterColorUtil() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getViewHolderBackgroundColor(Context context, int i) {
        Log_OC.getArray(context, "context");
        if (i == 0) {
            int $i0 = C1335a.m36324d(context, C0001R.color.colorSolitude);
            return $i0;
        } else if (i != 1) {
            int $i02 = C1335a.m36324d(context, C0001R.color.page_background);
            return $i02;
        } else {
            int $i03 = C1335a.m36324d(context, C0001R.color.page_background);
            return $i03;
        }
    }
}
