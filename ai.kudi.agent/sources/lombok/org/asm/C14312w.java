package lombok.org.asm;

import a.a.a.k1;
/* renamed from: lombok.org.asm.w */
/* loaded from: classes.dex */
public final class C14312w {

    /* renamed from: a */
    public static final C14312w f31491a;

    /* renamed from: c */
    public static final ThreadLocal<k1> f31492c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14312w $r0 = new C14312w();
        f31491a = $r0;
        ThreadLocal $r1 = new ThreadLocal();
        f31492c = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final AbstractC14271h m2168a() {
        ThreadLocal $r1 = f31492c;
        java.lang.Object $r2 = $r1.get();
        AbstractC14271h $r3 = (AbstractC14271h) $r2;
        if ($r3 != null) {
            return $r3;
        }
        Thread $r5 = Thread.currentThread();
        ScalarSynchronousObservable $r4 = new ScalarSynchronousObservable($r5);
        $r1.set($r4);
        return $r4;
    }
}
