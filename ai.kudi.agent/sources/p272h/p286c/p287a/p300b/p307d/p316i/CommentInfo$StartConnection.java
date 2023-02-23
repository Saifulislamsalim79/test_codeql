package p272h.p286c.p287a.p300b.p307d.p316i;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.CommentInfo$StartConnection */
/* loaded from: classes.dex */
public final class CommentInfo$StartConnection {
    private static final /* synthetic */ CommentInfo$StartConnection[] $VALUES;
    public static final CommentInfo$StartConnection AFTER_PREVIOUS;
    public static final CommentInfo$StartConnection DIRECT_AFTER_PREVIOUS;
    public static final CommentInfo$StartConnection ON_NEXT_LINE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        CommentInfo$StartConnection $r1 = new CommentInfo$StartConnection("DEFAULT", 0);
        DIRECT_AFTER_PREVIOUS = $r1;
        CommentInfo$StartConnection $r12 = new CommentInfo$StartConnection("SIGNED", 1);
        AFTER_PREVIOUS = $r12;
        CommentInfo$StartConnection $r13 = new CommentInfo$StartConnection("FIXED", 2);
        ON_NEXT_LINE = $r13;
        CommentInfo$StartConnection $r0 = DIRECT_AFTER_PREVIOUS;
        CommentInfo$StartConnection $r02 = AFTER_PREVIOUS;
        CommentInfo$StartConnection[] $r2 = {$r0, $r02, $r13};
        $VALUES = $r2;
    }

    private CommentInfo$StartConnection(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static CommentInfo$StartConnection[] values() {
        CommentInfo$StartConnection[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        CommentInfo$StartConnection[] $r12 = (CommentInfo$StartConnection[]) $r0;
        return $r12;
    }
}
