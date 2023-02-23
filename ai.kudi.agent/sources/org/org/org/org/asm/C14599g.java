package org.org.org.org.asm;

import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* renamed from: org.org.org.org.asm.g */
/* loaded from: classes.dex */
public final class C14599g {

    /* renamed from: a */
    public static final C14599g f32352a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        C14599g $r0 = new C14599g();
        f32352a = $r0;
    }

    private C14599g() {
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
    public final Object m1107a(InterfaceC11756a interfaceC11756a) {
        List $r3;
        Log_OC.getArray(interfaceC11756a, "toRun");
        String[] $r2 = {"nativeapp", "nativeappTest"};
        $r3 = C13726r.m3888h($r2);
        Object $r4 = m1106a(interfaceC11756a, $r3);
        return $r4;
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
    public final Object m1106a(InterfaceC11756a interfaceC11756a, List list) {
        Log_OC.getArray(interfaceC11756a, "toRun");
        Log_OC.getArray(list, "flavors");
        boolean $z0 = list.contains("nativeapp");
        if ($z0) {
            Object $r3 = interfaceC11756a.invoke();
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "flavors"
            kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
            java.util.Iterator r1 = r8.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            java.lang.String r0 = "nativeapp"
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r0, r4)
            if (r2 == 0) goto L9
            r6 = 1
            return r6
        L21:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.C14599g.remove(java.util.List):boolean");
    }
}
