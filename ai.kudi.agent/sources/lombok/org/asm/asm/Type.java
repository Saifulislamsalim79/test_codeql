package lombok.org.asm.asm;

import a.a.a.c2.e0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lombok.org.asm.Item;
/* loaded from: classes.dex */
public abstract class Type<T> extends e0 {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f31336c;

    /* renamed from: a */
    private volatile Object f31337a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(a.a.a.c2.e.class, Object.class, "a");
        f31336c = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Type() {
        Object $r1 = C14252c.f31340a;
        this.f31337a = $r1;
    }

    /* renamed from: a */
    public abstract Object m2339a(Object obj);

    public abstract void add(Object obj, Object obj2);

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object get(Object obj) {
        Object $r6;
        Object $r2 = this.f31337a;
        Object $r3 = C14252c.f31340a;
        if ($r2 == $r3) {
            Object $r4 = m2339a(obj);
            $r2 = $r4;
            boolean $z0 = Item.f31289c;
            if ($z0) {
                boolean $z02 = $r4 != $r3;
                if (!$z02) {
                    AssertionError $r5 = new AssertionError();
                    throw $r5;
                }
            }
            $r6 = this.f31337a;
            if ($r6 == $r3) {
                AtomicReferenceFieldUpdater $r7 = f31336c;
                boolean $z03 = $r7.compareAndSet(this, $r3, $r4);
                if (!$z03) {
                    $r6 = this.f31337a;
                }
            }
            add(obj, $r6);
            return $r6;
        }
        $r6 = $r2;
        add(obj, $r6);
        return $r6;
    }
}
