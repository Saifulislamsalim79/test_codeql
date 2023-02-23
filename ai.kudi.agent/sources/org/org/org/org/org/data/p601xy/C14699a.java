package org.org.org.org.org.data.p601xy;

import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
/* renamed from: org.org.org.org.org.data.xy.a */
/* loaded from: classes.dex */
public final class C14699a {

    /* renamed from: d */
    public final String f32745d;

    public C14699a(String str) {
        Log_OC.getArray(str, "pattern");
        this.f32745d = str;
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
    public final String m707a(String str, String str2) {
        String $r1;
        String $r3;
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "visitorId");
        String $r2 = this.f32745d;
        $r1 = C13276s.m5451A($r2, ":visitorId", str2, false, 4, null);
        $r3 = C13276s.m5451A($r1, ":sessionId", str, false, 4, null);
        return $r3;
    }
}
