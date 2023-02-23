package org.org.org.org.app.adapters;

import e.a.a.a.d.b.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: org.org.org.org.app.adapters.f */
/* loaded from: classes.dex */
public final class EnumC14573f {

    /* renamed from: b */
    public static final EnumC14573f f32284b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC14573f[] f32285c;

    /* renamed from: f */
    public static final EnumC14573f f32286f;

    /* renamed from: h */
    public static final EnumC14573f f32287h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EnumC14573f $r1 = new EnumC14573f("INTEGRATION_SUCCESSFUL", 0);
        f32287h = $r1;
        EnumC14573f $r12 = new EnumC14573f("INTEGRATION_FAILED", 1);
        f32286f = $r12;
        EnumC14573f $r13 = new EnumC14573f("NOT_IMPLEMENTED", 2);
        f32284b = $r13;
        EnumC14573f[] $r0 = {$r1, $r12, $r13};
        f32285c = $r0;
    }

    private EnumC14573f(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14573f valueOf(String str) {
        Enum $r0 = Enum.valueOf(a.class, str);
        EnumC14573f $r2 = (EnumC14573f) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14573f[] values() {
        EnumC14573f[] $r1 = f32285c;
        Object $r0 = $r1.clone();
        EnumC14573f[] $r12 = (EnumC14573f[]) $r0;
        return $r12;
    }
}
