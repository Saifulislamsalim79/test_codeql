package lombok.org.asm.asm;

import kotlin.p557z.C13712m;
/* renamed from: lombok.org.asm.asm.h */
/* loaded from: classes.dex */
public class C14257h<T> {

    /* renamed from: a */
    public int f31355a;

    /* renamed from: b */
    public Object[] f31356b;

    /* renamed from: p */
    public int f31357p;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public C14257h() {
        Object[] $r1 = new Object[16];
        this.f31356b = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    public final void m2320a() {
        Object[] $r1 = this.f31356b;
        int $i1 = $r1.length;
        int $i0 = $i1 << 1;
        Object[] $r2 = new Object[$i0];
        int $i02 = this.f31355a;
        C13712m.m4064g($r1, $r2, 0, $i02, 0, 10, null);
        Object[] $r12 = this.f31356b;
        int $i2 = $r12.length;
        int $i03 = this.f31355a;
        C13712m.m4064g($r12, $r2, $i2 - $i03, 0, $i03, 4, null);
        this.f31356b = $r2;
        this.f31355a = 0;
        this.f31357p = $i1;
    }
}
