package lombok.org.libs.org.objectweb.asm.asm.asm;

import a.a.b.a.b.d.d.g.b;
import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
/* loaded from: classes.dex */
public final class Item extends AbstractC14328d {

    /* renamed from: d */
    public static final ByteVector f31581d;
    public final List<b> index;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        ByteVector $r0 = new ByteVector(null);
        f31581d = $r0;
    }

    private Item(String str, List list, List list2, List list3, boolean z) {
        super(str, 1, list2, list3, z);
        this.index = list;
    }

    public /* synthetic */ Item(String str, List list, List list2, List list3, boolean z, DBUtils$1 dBUtils$1) {
        this(str, list, list2, list3, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List newClass() {
        List r1 = this.index;
        return r1;
    }
}
