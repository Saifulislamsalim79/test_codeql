package lombok.org.asm.asm;

import kotlin.C11709c;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* loaded from: classes.dex */
public final class Handler {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public static final C14263p m2340a(InterfaceC11767l interfaceC11767l, Object obj, C14263p c14263p) {
        try {
            interfaceC11767l.invoke(obj);
            return c14263p;
        } catch (Throwable $r3) {
            if (c14263p != null) {
                Throwable $r4 = c14263p.getCause();
                if ($r4 != $r3) {
                    C11709c.m10411a(c14263p, $r3);
                    return c14263p;
                }
            }
            String $r6 = "Exception in undelivered element handler for " + obj;
            C14263p $r2 = new C14263p($r6, $r3);
            return $r2;
        }
    }
}
