package lombok.org.asm;

import a.a.a.d0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lombok.org.asm.c */
/* loaded from: classes.dex */
public final class EnumC14265c {

    /* renamed from: a */
    public static final EnumC14265c f31381a;

    /* renamed from: c */
    public static final EnumC14265c f31382c;

    /* renamed from: e */
    public static final /* synthetic */ EnumC14265c[] f31383e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EnumC14265c $r1 = new EnumC14265c("DEFAULT", 0);
        f31381a = $r1;
        EnumC14265c $r12 = new EnumC14265c("LAZY", 1);
        f31382c = $r12;
        EnumC14265c[] $r0 = {$r1, $r12, new EnumC14265c("ATOMIC", 2), new EnumC14265c("UNDISPATCHED", 3)};
        f31383e = $r0;
    }

    public EnumC14265c(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14265c valueOf(String str) {
        Enum $r0 = Enum.valueOf(d0.class, str);
        EnumC14265c $r2 = (EnumC14265c) $r0;
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
    public static EnumC14265c[] values() {
        EnumC14265c[] $r1 = f31383e;
        java.lang.Object $r0 = $r1.clone();
        EnumC14265c[] $r12 = (EnumC14265c[]) $r0;
        return $r12;
    }
}
