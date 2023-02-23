package lombok.org.asm.asm;

import java.lang.reflect.Constructor;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* loaded from: classes.dex */
public final class ArraysKt___ArraysKt$withIndex$5 extends AbstractC11802m implements InterfaceC11767l<Throwable, Throwable> {
    public final /* synthetic */ Constructor constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$5(Constructor constructor) {
        super(1);
        this.constructor = constructor;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public Throwable invoke(Throwable th) {
        Object $r1;
        Object $r12;
        Throwable $r2 = th;
        try {
            Constructor $r3 = this.constructor;
            Object[] $r4 = {$r2};
            $r12 = $r3.newInstance($r4);
        } catch (Throwable $r22) {
            Object $r6 = C13291q.m5358a($r22);
            $r1 = $r6;
            C13288p.m5362a($r6);
        }
        if ($r12 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            throw $r5;
        }
        $r1 = (Throwable) $r12;
        C13288p.m5362a($r1);
        boolean $z0 = C13288p.m5360c($r1);
        if ($z0) {
            $r1 = null;
        }
        Throwable $r23 = (Throwable) $r1;
        return $r23;
    }
}
