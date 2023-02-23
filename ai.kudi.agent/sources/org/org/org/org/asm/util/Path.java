package org.org.org.org.asm.util;

import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class Path {
    private Path() {
    }

    public /* synthetic */ Path(DBUtils$1 dBUtils$1) {
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
    public final Label toString(JSONArray jSONArray) {
        Log_OC.getArray(jSONArray, "jsonArray");
        double $d0 = jSONArray.getDouble(0);
        double $d1 = jSONArray.getDouble(1);
        double $d2 = jSONArray.getDouble(2);
        double $d3 = jSONArray.getDouble(3);
        double $d4 = $d0 + $d2;
        double $d5 = $d1 + $d3;
        Label $r2 = new Label($d0, $d1, $d2, $d3, $d0, $d1, $d4, $d5);
        return $r2;
    }
}
