package org.org.org.org.xml;

import e.a.a.a.e.c;
import e.a.a.a.f.z.b;
import kotlin.p483e0.p485d.DBUtils$1;
import org.json.JSONObject;
import org.org.org.org.asm.menu.C14609x;
/* loaded from: classes.dex */
public final class c$a$a implements b<c.a> {
    private c$a$a() {
    }

    public /* synthetic */ c$a$a(DBUtils$1 dBUtils$1) {
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
    public /* bridge */ /* synthetic */ Object m453a(JSONObject jSONObject) {
        Cache $r1 = add(jSONObject);
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
    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.org.org.org.xml.Cache add(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "json"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            org.org.org.org.xml.Cache r1 = new org.org.org.org.xml.Cache
            r1.<init>()
            java.util.Iterator r2 = r11.keys()
            java.lang.String r0 = "json.keys()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r0)
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r4 = r2.next()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            java.lang.Object r4 = r11.get(r5)
            if (r4 == 0) goto L2f
            r8 = r4
            java.lang.Integer r8 = (java.lang.Integer) r8
            r7 = r8
            r1.put(r5, r7)
            goto L13
        L2f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r9.<init>(r0)
            throw r9
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.xml.c$a$a.add(org.json.JSONObject):org.org.org.org.xml.Cache");
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
    public /* bridge */ /* synthetic */ Object m452b(String str) {
        Cache $r1 = m451c(str);
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
    public Cache m451c(String str) {
        Object $r1 = C14609x.m1082a(this, str);
        Cache $r3 = (Cache) $r1;
        return $r3;
    }
}
