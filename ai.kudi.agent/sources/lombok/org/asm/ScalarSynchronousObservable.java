package lombok.org.asm;
/* loaded from: classes.dex */
public final class ScalarSynchronousObservable extends XYPlot {

    /* renamed from: t */
    public final Thread f31307t;

    public ScalarSynchronousObservable(Thread thread) {
        this.f31307t = thread;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // lombok.org.asm.AbstractC14246L
    public Thread get() {
        Thread r1 = this.f31307t;
        return r1;
    }
}
