package lombok.org.asm.asm;
/* loaded from: classes.dex */
public abstract class Namespace {
    public abstract Object get(Object obj);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        Class $r2 = getClass();
        String $r3 = $r2.getSimpleName();
        $r1.append($r3);
        $r1.append('@');
        int $i0 = System.identityHashCode(this);
        String $r32 = java.lang.Integer.toHexString($i0);
        $r1.append($r32);
        String $r33 = $r1.toString();
        return $r33;
    }
}
