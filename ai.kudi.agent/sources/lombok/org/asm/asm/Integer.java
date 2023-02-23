package lombok.org.asm.asm;

import a.a.a.c2.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class Integer {
    public static final AtomicReferenceFieldUpdater buffer;
    public static final AtomicReferenceFieldUpdater index;
    public static final AtomicReferenceFieldUpdater pool;
    public volatile Object state = this;
    public volatile Object next = this;
    private volatile Object key = null;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "c");
        buffer = $r0;
        AtomicReferenceFieldUpdater $r02 = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "d");
        pool = $r02;
        AtomicReferenceFieldUpdater $r03 = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "e");
        index = $r03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Integer add() {
        Integer $r3;
        boolean $z0;
        do {
            Object $r1 = next();
            boolean $z02 = $r1 instanceof Range;
            if ($z02) {
                return ((Range) $r1).state;
            }
            if ($r1 == this) {
                return (Integer) $r1;
            }
            if ($r1 == null) {
                NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */");
                throw $r6;
            }
            $r3 = (Integer) $r1;
            Object $r4 = $r3.key;
            Range $r2 = (Range) $r4;
            if ($r2 == null) {
                $r2 = new Range($r3);
                AtomicReferenceFieldUpdater $r5 = index;
                $r5.lazySet($r3, $r2);
            }
            AtomicReferenceFieldUpdater $r52 = buffer;
            $z0 = $r52.compareAndSet(this, $r1, $r2);
        } while (!$z0);
        $r3.get(null);
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
    public final void add(Integer integer) {
        boolean $z0;
        do {
            Object $r2 = integer.next;
            Integer $r3 = (Integer) $r2;
            Object $r22 = next();
            if ($r22 != integer) {
                return;
            }
            AtomicReferenceFieldUpdater $r4 = pool;
            $z0 = $r4.compareAndSet(integer, $r3, this);
        } while (!$z0);
        boolean $z02 = isEmpty();
        if ($z02) {
            integer.get(null);
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
    public boolean exists() {
        Integer $r0 = add();
        return $r0 == null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int get(Integer integer, Integer integer2, AbstractC14262o abstractC14262o) {
        pool.lazySet(integer, this);
        AtomicReferenceFieldUpdater $r4 = buffer;
        $r4.lazySet(integer, integer2);
        abstractC14262o.f31377c = integer2;
        boolean $z0 = $r4.compareAndSet(this, integer2, abstractC14262o);
        if ($z0) {
            Object $r5 = abstractC14262o.get(this);
            return $r5 == null ? 1 : 2;
        }
        return 0;
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
    /* JADX WARN: Incorrect condition in loop: B:7:0x0012 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.asm.Integer get() {
        /*
            r6 = this;
            r1 = 0
            lombok.org.asm.asm.Integer r0 = r6.get(r1)
            if (r0 == 0) goto L8
            return r0
        L8:
            java.lang.Object r2 = r6.next
            r3 = r2
            lombok.org.asm.asm.Integer r3 = (lombok.org.asm.asm.Integer) r3
            r6 = r3
        Le:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L15
            return r6
        L15:
            java.lang.Object r2 = r6.next
            r5 = r2
            lombok.org.asm.asm.Integer r5 = (lombok.org.asm.asm.Integer) r5
            r6 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.Integer.get():lombok.org.asm.asm.Integer");
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
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r6 = lombok.org.asm.asm.Integer.buffer;
        r11 = (lombok.org.asm.asm.Range) r1;
        r12 = r11.state;
        r7 = r6.compareAndSet(r5, r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r7 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.asm.Integer get(lombok.org.asm.asm.Namespace r18) {
        /*
            r17 = this;
        L0:
            r0 = r17
            java.lang.Object r1 = r0.next
            r17 = r0
            r3 = r1
            lombok.org.asm.asm.Integer r3 = (lombok.org.asm.asm.Integer) r3
            r2 = r3
            r4 = r2
        Lb:
            r5 = 0
        Lc:
            java.lang.Object r1 = r4.state
            r0 = r17
            if (r1 != r0) goto L21
            if (r2 != r4) goto L15
            return r4
        L15:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = lombok.org.asm.asm.Integer.pool
            r0 = r17
            boolean r7 = r6.compareAndSet(r0, r2, r4)
            if (r7 != 0) goto L20
            goto L0
        L20:
            return r4
        L21:
            r0 = r17
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L2b
            r8 = 0
            return r8
        L2b:
            if (r1 != 0) goto L2e
            return r4
        L2e:
            boolean r7 = r1 instanceof lombok.org.asm.asm.Namespace
            if (r7 == 0) goto L3d
            r9 = r1
            lombok.org.asm.asm.Namespace r9 = (lombok.org.asm.asm.Namespace) r9
            r18 = r9
            r0 = r18
            r0.get(r4)
            goto L0
        L3d:
            boolean r7 = r1 instanceof lombok.org.asm.asm.Range
            if (r7 == 0) goto L5b
            if (r5 == 0) goto L54
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = lombok.org.asm.asm.Integer.buffer
            r11 = r1
            lombok.org.asm.asm.Range r11 = (lombok.org.asm.asm.Range) r11
            r10 = r11
            lombok.org.asm.asm.Integer r12 = r10.state
            boolean r7 = r6.compareAndSet(r5, r4, r12)
            if (r7 != 0) goto L52
            goto L0
        L52:
            r4 = r5
            goto Lb
        L54:
            java.lang.Object r1 = r4.next
            r13 = r1
            lombok.org.asm.asm.Integer r13 = (lombok.org.asm.asm.Integer) r13
            r4 = r13
            goto Lc
        L5b:
            if (r1 == 0) goto L63
            r5 = r4
            r14 = r1
            lombok.org.asm.asm.Integer r14 = (lombok.org.asm.asm.Integer) r14
            r4 = r14
            goto Lc
        L63:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
        */
        //  java.lang.String r16 = "null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r0 = r16
            r15.<init>(r0)
            goto L6d
        L6d:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.Integer.get(lombok.org.asm.asm.Namespace):lombok.org.asm.asm.Integer");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean get(Integer integer, Integer integer2) {
        pool.lazySet(integer, this);
        AtomicReferenceFieldUpdater $r3 = buffer;
        $r3.lazySet(integer, integer2);
        boolean $z0 = $r3.compareAndSet(this, integer2, integer);
        if ($z0) {
            integer.add(integer2);
            return true;
        }
        return false;
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
    public final Integer getValue() {
        Integer $r0;
        Object $r1 = next();
        boolean $z0 = $r1 instanceof Range;
        Object $r2 = !$z0 ? null : $r1;
        Range $r3 = (Range) $r2;
        if ($r3 == null || ($r0 = $r3.state) == null) {
            if ($r1 != null) {
                return (Integer) $r1;
            }
            NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.Node /* = com.smartlook.coroutines.internal.LockFreeLinkedListNode */");
            throw $r4;
        }
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isEmpty() {
        Object $r1 = next();
        boolean $z0 = $r1 instanceof Range;
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object next() {
        while (true) {
            Object $r1 = this.state;
            boolean $z0 = $r1 instanceof Namespace;
            if (!$z0) {
                return $r1;
            }
            Namespace $r2 = (Namespace) $r1;
            $r2.get(this);
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
    public final void remove() {
        Object $r1 = next();
        if ($r1 == null) {
            NullPointerException $r3 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.Removed");
            throw $r3;
        }
        Range $r2 = (Range) $r1;
        Integer $r0 = $r2.state;
        $r0.get(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        Class $r2 = getClass();
        String $r3 = $r2.getSimpleName();
        $r1.append($r3);
        $r1.append('@');
        int $i0 = System.identityHashCode(this);
        String $r32 = java.lang.Integer.toHexString($i0);
        $r1.append($r32);
        String $r33 = $r1.toString();
        return $r33;
    }
}
