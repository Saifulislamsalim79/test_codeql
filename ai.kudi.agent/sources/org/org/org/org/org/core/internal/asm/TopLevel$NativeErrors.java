package org.org.org.org.org.core.internal.asm;

import e.a.a.a.c.o.c.c.f;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TopLevel$NativeErrors {
    public static final /* synthetic */ TopLevel$NativeErrors[] $VALUES;
    public static final TopLevel$NativeErrors Error;
    public static final TopLevel$NativeErrors EvalError;
    public static final TopLevel$NativeErrors RangeError;
    public static final TopLevel$NativeErrors ReferenceError;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        TopLevel$NativeErrors $r1 = new TopLevel$NativeErrors("NATIVE", 0);
        EvalError = $r1;
        TopLevel$NativeErrors $r12 = new TopLevel$NativeErrors("NON_NATIVE", 1);
        RangeError = $r12;
        TopLevel$NativeErrors $r13 = new TopLevel$NativeErrors("NO_RENDERING", 2);
        ReferenceError = $r13;
        TopLevel$NativeErrors $r14 = new TopLevel$NativeErrors("BRIDGE_WIREFRAME", 3);
        Error = $r14;
        TopLevel$NativeErrors[] $r0 = {$r1, $r12, $r13, $r14};
        $VALUES = $r0;
    }

    private TopLevel$NativeErrors(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TopLevel$NativeErrors valueOf(String str) {
        Enum $r0 = Enum.valueOf(f.a.class, str);
        TopLevel$NativeErrors $r2 = (TopLevel$NativeErrors) $r0;
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
    public static TopLevel$NativeErrors[] values() {
        TopLevel$NativeErrors[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TopLevel$NativeErrors[] $r12 = (TopLevel$NativeErrors[]) $r0;
        return $r12;
    }
}
