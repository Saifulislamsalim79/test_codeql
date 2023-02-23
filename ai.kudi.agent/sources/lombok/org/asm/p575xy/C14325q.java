package lombok.org.asm.p575xy;
/* renamed from: lombok.org.asm.xy.q */
/* loaded from: classes.dex */
public final class C14325q extends AbstractRunnableC14319h {

    /* renamed from: a */
    public final Runnable f31555a;

    public C14325q(Runnable runnable, long j, Label label) {
        super(j, label);
        this.f31555a = runnable;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // java.lang.Runnable
    public void run() {
        try {
            Runnable $r2 = this.f31555a;
            $r2.run();
        } finally {
            Label $r1 = this.f31524c;
            $r1.mo2148a();
        }
    }

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
        $r1.append("Task[");
        Runnable $r2 = this.f31555a;
        Class $r3 = $r2.getClass();
        String $r4 = $r3.getSimpleName();
        $r1.append($r4);
        $r1.append('@');
        Runnable $r22 = this.f31555a;
        int $i1 = System.identityHashCode($r22);
        String $r42 = Integer.toHexString($i1);
        $r1.append($r42);
        $r1.append(", ");
        long $l0 = this.f31523b;
        $r1.append($l0);
        $r1.append(", ");
        Label $r5 = this.f31524c;
        $r1.append($r5);
        $r1.append(']');
        String $r43 = $r1.toString();
        return $r43;
    }
}
