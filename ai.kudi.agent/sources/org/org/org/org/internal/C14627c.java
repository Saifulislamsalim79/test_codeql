package org.org.org.org.internal;

import java.util.Arrays;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.internal.c */
/* loaded from: classes.dex */
public final class C14627c {

    /* renamed from: d */
    public final int f32459d;

    public C14627c(int i) {
        this.f32459d = i;
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
    public final String m995a() {
        int $i0 = this.f32459d;
        return $i0 != 0 ? $i0 != 1 ? "manager.smartlook.com" : "manager.beta.smartlook.com" : "manager.alfa.smartlook.cloud";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String format() {
        Object[] $r1 = {m995a()};
        String $r2 = String.format("https://%s/", Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r2, "java.lang.String.format(format, *args)");
        return $r2;
    }
}
