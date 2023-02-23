package lombok.org.asm.asm;

import a.a.a.c2.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: lombok.org.asm.asm.o */
/* loaded from: classes.dex */
public abstract class AbstractC14262o extends a.a.a.c2.e<z> {

    /* renamed from: a */
    public final Integer f31376a;

    /* renamed from: c */
    public Integer f31377c;

    public AbstractC14262o(Integer integer) {
        this.f31376a = integer;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void add(Object obj, Object obj2) {
        Integer $r4 = (Integer) obj;
        boolean $z1 = obj2 == null;
        Integer $r5 = $z1 ? this.f31376a : this.f31377c;
        if ($r5 != null) {
            AtomicReferenceFieldUpdater $r1 = Integer.buffer;
            boolean $z0 = $r1.compareAndSet($r4, this, $r5);
            if ($z0 && $z1) {
                Integer $r42 = this.f31376a;
                Integer $r52 = this.f31377c;
                Log_OC.append($r52);
                $r42.add($r52);
            }
        }
    }
}
