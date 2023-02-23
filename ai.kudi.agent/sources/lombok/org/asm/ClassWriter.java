package lombok.org.asm;
/* loaded from: classes.dex */
public final class ClassWriter implements Object, MenuItem {

    /* renamed from: b */
    public static final ClassWriter f31272b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f31272b = $r0;
    }

    @Override // lombok.org.asm.Object
    /* renamed from: c */
    public void mo2359c() {
    }

    @Override // lombok.org.asm.MenuItem
    /* renamed from: d */
    public boolean mo2367d(Throwable th) {
        return false;
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
