package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class Extension {
    private final Map<String, Object> mBagOfTags;
    private volatile boolean mCleared;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Extension() {
        HashMap $r1 = new HashMap();
        this.mBagOfTags = $r1;
        this.mCleared = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static void closeWithRuntimeException(Object obj) {
        boolean $z0 = obj instanceof Closeable;
        if ($z0) {
            Closeable $r1 = (Closeable) obj;
            try {
                $r1.close();
            } catch (IOException $r2) {
                RuntimeException $r3 = new RuntimeException($r2);
                throw $r3;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void clear() {
        /*
            r8 = this;
            r0 = 1
            r8.mCleared = r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.mBagOfTags
            if (r1 == 0) goto L25
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.mBagOfTags     // Catch: java.lang.Throwable -> L22
            java.util.Collection r3 = r2.values()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L22
        L12:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L20
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L22
            closeWithRuntimeException(r6)     // Catch: java.lang.Throwable -> L22
            goto L12
        L20:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r7
        L25:
            r8.onCleared()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Extension.clear():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    Object getTag(String str) {
        Object $r3;
        Map $r1 = this.mBagOfTags;
        if ($r1 == null) {
            return null;
        }
        synchronized ($r1) {
            Map $r2 = this.mBagOfTags;
            $r3 = $r2.get(str);
        }
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCleared() {
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
    Object setTagIfAbsent(String str, Object $r5) {
        Object $r3;
        Map $r1 = this.mBagOfTags;
        synchronized ($r1) {
            Map $r2 = this.mBagOfTags;
            $r3 = $r2.get(str);
            if ($r3 == null) {
                Map $r22 = this.mBagOfTags;
                $r22.put(str, $r5);
            }
        }
        if ($r3 != null) {
            $r5 = $r3;
        }
        boolean $z0 = this.mCleared;
        if ($z0) {
            closeWithRuntimeException($r5);
            return $r5;
        }
        return $r5;
    }
}
