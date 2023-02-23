package lombok.org.libs.org.objectweb.asm.asm.asm;

import java.util.List;
import kotlin.p483e0.p485d.DBUtils$1;
/* loaded from: classes.dex */
public final class Type extends AbstractC14328d {

    /* renamed from: c */
    public static final C14327a f31582c;

    /* renamed from: a */
    public final String f31583a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14327a $r0 = new C14327a(null);
        f31582c = $r0;
    }

    private Type(String str, String str2, int i, List list, List list2, boolean z) {
        super(str, i, list, list2, z);
        this.f31583a = str2;
    }

    public /* synthetic */ Type(String str, String str2, int i, List list, List list2, boolean z, DBUtils$1 dBUtils$1) {
        this(str, str2, i, list, list2, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getValue() {
        String r1 = this.f31583a;
        return r1;
    }
}
