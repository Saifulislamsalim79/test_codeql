package p000;
/* compiled from: dalvik_source_input.apk */
/* renamed from: Version$BuildAwareOrder */
/* loaded from: classes.dex */
public /* synthetic */ class Version$BuildAwareOrder {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ int compare(long j) {
        long $l2 = j >>> 32;
        long $l1 = j ^ $l2;
        int $i0 = (int) $l1;
        return $i0;
    }
}
