package lombok.org.asm;

import a.a.a.o0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class Handle extends C14264b {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f31282c;

    /* renamed from: d */
    private volatile int f31283d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicIntegerFieldUpdater $r0 = AtomicIntegerFieldUpdater.newUpdater(o0.class, "d");
        f31282c = $r0;
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
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Handle(kotlin.p476c0.InterfaceC11714d r9, java.lang.Throwable r10, boolean r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L3
            goto L20
        L3:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r10 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r1.<init>()
            java.lang.String r3 = "Continuation "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " was cancelled normally"
            r2.append(r3)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
        L20:
            r6 = r10
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r5 = r6
            r8.<init>(r5, r11)
            r7 = 0
            r8.f31283d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.Handle.<init>(kotlin.c0.d, java.lang.Throwable, boolean):void");
    }
}
