package org.org.org.org.xml.core.util;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
/* renamed from: org.org.org.org.xml.core.util.e */
/* loaded from: classes.dex */
public final class C14739e {
    private C14739e() {
    }

    public /* synthetic */ C14739e(DBUtils$1 dBUtils$1) {
        this();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Label copy(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        String $r3 = jSONObject.getString("SESSION_ID");
        Log_OC.loadImage($r3, "json.getString(SESSION_ID)");
        int $i0 = jSONObject.getInt("RECORD_INDEX");
        boolean $z0 = jSONObject.getBoolean("MOBILE_DATA");
        String $r4 = jSONObject.getString("VISITOR_ID");
        Log_OC.loadImage($r4, "json.getString(VISITOR_ID)");
        String $r5 = jSONObject.getString("WRITER_HOST");
        Log_OC.loadImage($r5, "json.getString(WRITER_HOST)");
        String $r6 = jSONObject.getString("GROUP");
        Log_OC.loadImage($r6, "json.getString(GROUP)");
        Label $r2 = new Label($r3, $i0, $z0, $r4, $r5, $r6);
        return $r2;
    }
}
