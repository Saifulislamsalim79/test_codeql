package org.org.org.org.android.bearer;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import e.a.a.a.a.a.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeFinder$OS {
    public static final /* synthetic */ IdeFinder$OS[] $VALUES;
    public static final IdeFinder$OS MAC_OS_X;
    public static final IdeFinder$OS SUN_OS;
    public static final IdeFinder$OS UNIX;
    public static final IdeFinder$OS WINDOWS;
    public final byte lineEnding;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        IdeFinder$OS $r1 = new IdeFinder$OS("FULL_TRACKING", 0, Byte.MAX_VALUE);
        SUN_OS = $r1;
        IdeFinder$OS $r12 = new IdeFinder$OS("NAVIGATION_AUTO_TRACKING", 3, (byte) 4);
        MAC_OS_X = $r12;
        IdeFinder$OS $r13 = new IdeFinder$OS("VISUAL_TRACKING", 4, (byte) 8);
        WINDOWS = $r13;
        IdeFinder$OS $r14 = new IdeFinder$OS("RAGE_CLICK_TRACKING", 5, PrinterCommands.DLE);
        UNIX = $r14;
        IdeFinder$OS[] $r0 = {$r1, new IdeFinder$OS("INTERNAL_TRACKING", 1, (byte) 1), new IdeFinder$OS("CUSTOM_TRACKING", 2, (byte) 2), $r12, $r13, $r14};
        $VALUES = $r0;
    }

    private IdeFinder$OS(String str, int i, byte b) {
        this.lineEnding = b;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static IdeFinder$OS valueOf(String str) {
        Enum $r0 = Enum.valueOf(a.class, str);
        IdeFinder$OS $r2 = (IdeFinder$OS) $r0;
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
    public static IdeFinder$OS[] values() {
        IdeFinder$OS[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        IdeFinder$OS[] $r12 = (IdeFinder$OS[]) $r0;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final byte getLineEnding() {
        byte b0 = this.lineEnding;
        return b0;
    }
}
