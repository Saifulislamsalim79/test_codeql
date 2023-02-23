package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lifecycle.java */
/* loaded from: classes.dex */
public final class Priority {
    private static final /* synthetic */ Priority[] $VALUES;

    /* renamed from: C */
    public static final Priority f4717C;

    /* renamed from: F */
    public static final Priority f4718F;

    /* renamed from: G */
    public static final Priority f4719G;

    /* renamed from: H */
    public static final Priority f4720H;

    /* renamed from: I */
    public static final Priority f4721I;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Priority $r1 = new Priority("DESTROYED", 0);
        f4717C = $r1;
        Priority $r12 = new Priority("INITIALIZED", 1);
        f4720H = $r12;
        Priority $r13 = new Priority("CREATED", 2);
        f4721I = $r13;
        Priority $r14 = new Priority("STARTED", 3);
        f4718F = $r14;
        Priority $r15 = new Priority("RESUMED", 4);
        f4719G = $r15;
        Priority $r0 = f4717C;
        Priority $r02 = f4720H;
        Priority $r03 = f4721I;
        Priority $r04 = f4718F;
        Priority[] $r2 = {$r0, $r02, $r03, $r04, $r15};
        $VALUES = $r2;
    }

    private Priority(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Priority valueOf(String str) {
        Enum $r0 = Enum.valueOf(AbstractC1565i.c.class, str);
        Priority $r2 = (Priority) $r0;
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
    public static Priority[] values() {
        Priority[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        Priority[] $r12 = (Priority[]) $r0;
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
    /* renamed from: c */
    public boolean m35575c(Priority priority) {
        int $i0 = compareTo(priority);
        return $i0 >= 0;
    }
}
