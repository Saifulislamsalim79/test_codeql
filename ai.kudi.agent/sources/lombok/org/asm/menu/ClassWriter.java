package lombok.org.asm.menu;

import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public final class ClassWriter {

    /* renamed from: b */
    public static final Paint f31410b;

    /* renamed from: c */
    public static final Paint f31411c;

    /* renamed from: g */
    public static final Paint f31412g;

    /* renamed from: k */
    public static final Paint f31413k;

    /* renamed from: s */
    public static final Paint f31414s;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Paint $r0 = new Paint("EMPTY");
        f31411c = $r0;
        Paint $r02 = new Paint("OFFER_SUCCESS");
        f31410b = $r02;
        Paint $r03 = new Paint("OFFER_FAILED");
        f31412g = $r03;
        Paint $r04 = new Paint("POLL_FAILED");
        f31413k = $r04;
        Paint $r05 = new Paint("ON_CLOSE_HANDLER_INVOKED");
        f31414s = $r05;
    }
}
