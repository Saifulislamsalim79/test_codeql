package lombok.org.asm.asm;

import java.util.ArrayList;
import java.util.List;
import lombok.org.asm.Item;
/* loaded from: classes.dex */
public final class ClassReader<E> {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final Object get(Object obj, Object obj2) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            boolean $z02 = obj2 instanceof List;
            if (!(!$z02)) {
                AssertionError $r2 = new AssertionError();
                throw $r2;
            }
        }
        if (obj == null) {
            return obj2;
        }
        boolean $z03 = obj instanceof ArrayList;
        if ($z03) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList $r3 = new ArrayList(4);
        $r3.add(obj);
        $r3.add(obj2);
        return $r3;
    }
}
