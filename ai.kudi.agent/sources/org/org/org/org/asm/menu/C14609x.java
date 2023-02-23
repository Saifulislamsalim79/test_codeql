package org.org.org.org.asm.menu;

import org.json.JSONObject;
/* renamed from: org.org.org.org.asm.menu.x */
/* loaded from: classes.dex */
public final class C14609x {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public static java.lang.Object m1082a(MenuItem menuItem, String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject $r1 = new JSONObject(str);
            java.lang.Object $r2 = menuItem.m1088a($r1);
            return $r2;
        } catch (Exception e) {
            return null;
        }
    }
}
