package org.org.org.org.internal.app.api;

import e.a.a.a.b.d.b.b;
import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class b$c$a implements b<b.c> {
    private b$c$a() {
    }

    public /* synthetic */ b$c$a(DBUtils$1 dBUtils$1) {
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
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object m1011a(JSONObject jSONObject) {
        C14624h $r1 = get(jSONObject);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object m1010b(String str) {
        C14624h $r1 = m1009c(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: c */
    public C14624h m1009c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        C14624h $r3 = (C14624h) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public C14624h get(JSONObject jSONObject) {
        Log_OC.getArray(jSONObject, "json");
        boolean $z0 = jSONObject.getBoolean("sensitive");
        boolean $z1 = jSONObject.getBoolean("analytics");
        String $r3 = jSONObject.getString("writerHost");
        Log_OC.loadImage($r3, "json.getString(\"writerHost\")");
        String $r4 = jSONObject.getString("storeGroup");
        Log_OC.loadImage($r4, "json.getString(\"storeGroup\")");
        int $i0 = jSONObject.getInt("mobileBitrate");
        int $i1 = jSONObject.getInt("mobileFramerate");
        long $l2 = jSONObject.getLong("mobileFramerate");
        boolean $z2 = jSONObject.getBoolean("mobileData");
        long $l3 = jSONObject.getLong("maxRecordDuration");
        long $l4 = jSONObject.getLong("maxSessionDuration");
        String $r5 = jSONObject.getString("mobileRenderingMode");
        Log_OC.loadImage($r5, "json.getString(\"mobileRenderingMode\")");
        boolean $z3 = jSONObject.getBoolean("canSwitchRenderingMode");
        long $l5 = jSONObject.getLong("sessionTimeout");
        boolean $z4 = jSONObject.getBoolean("recordNetwork");
        C14624h $r2 = new C14624h($z0, $z1, $r3, $r4, $i0, $i1, $l2, $z2, $l3, $l4, $r5, $z3, $l5, $z4);
        return $r2;
    }
}
