package lombok.org.asm.p575xy;

import a.a.a.q.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lombok.org.asm.xy.c */
/* loaded from: classes.dex */
public final class EnumC14316c {

    /* renamed from: a */
    public static final EnumC14316c f31503a;

    /* renamed from: b */
    public static final EnumC14316c f31504b;

    /* renamed from: c */
    public static final EnumC14316c f31505c;

    /* renamed from: d */
    public static final EnumC14316c f31506d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC14316c[] f31507e;

    /* renamed from: h */
    public static final EnumC14316c f31508h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EnumC14316c $r1 = new EnumC14316c("CPU_ACQUIRED", 0);
        f31503a = $r1;
        EnumC14316c $r12 = new EnumC14316c("BLOCKING", 1);
        f31508h = $r12;
        EnumC14316c $r13 = new EnumC14316c("PARKING", 2);
        f31504b = $r13;
        EnumC14316c $r14 = new EnumC14316c("DORMANT", 3);
        f31505c = $r14;
        EnumC14316c $r15 = new EnumC14316c("TERMINATED", 4);
        f31506d = $r15;
        EnumC14316c[] $r0 = {$r1, $r12, $r13, $r14, $r15};
        f31507e = $r0;
    }

    public EnumC14316c(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EnumC14316c valueOf(String str) {
        Enum $r0 = Enum.valueOf(a.b.class, str);
        EnumC14316c $r2 = (EnumC14316c) $r0;
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
    public static EnumC14316c[] values() {
        EnumC14316c[] $r1 = f31507e;
        Object $r0 = $r1.clone();
        EnumC14316c[] $r12 = (EnumC14316c[]) $r0;
        return $r12;
    }
}
