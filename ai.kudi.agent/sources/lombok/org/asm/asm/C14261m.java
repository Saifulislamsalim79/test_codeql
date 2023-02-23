package lombok.org.asm.asm;

import a.a.a.c2.b0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lombok.org.asm.Item;
/* renamed from: lombok.org.asm.asm.m */
/* loaded from: classes.dex */
public final class C14261m<E> {

    /* renamed from: b */
    public static final Paint f31367b;

    /* renamed from: c */
    public static final AtomicLongFieldUpdater f31368c;

    /* renamed from: r */
    public static final AtomicReferenceFieldUpdater f31369r;

    /* renamed from: d */
    public AtomicReferenceArray f31371d;

    /* renamed from: e */
    public final boolean f31372e;

    /* renamed from: g */
    public final int f31373g;

    /* renamed from: i */
    public final int f31374i;

    /* renamed from: s */
    private volatile Object f31375s = null;

    /* renamed from: a */
    private volatile long f31370a = 0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Paint $r0 = new Paint("REMOVE_FROZEN");
        f31367b = $r0;
        AtomicReferenceFieldUpdater $r1 = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "b");
        f31369r = $r1;
        AtomicLongFieldUpdater $r2 = AtomicLongFieldUpdater.newUpdater(b0.class, "c");
        f31368c = $r2;
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
    public C14261m(int i, boolean z) {
        this.f31373g = i;
        this.f31372e = z;
        int $i1 = i - 1;
        this.f31374i = $i1;
        AtomicReferenceArray $r2 = new AtomicReferenceArray(i);
        this.f31371d = $r2;
        boolean $z1 = $i1 <= 1073741823;
        if (!$z1) {
            String $r1 = "Check failed.".toString();
            IllegalStateException $r3 = new IllegalStateException($r1);
            throw $r3;
        }
        int $i0 = i & $i1;
        boolean $z0 = $i0 == 0;
        if ($z0) {
            return;
        }
        String $r12 = "Check failed.".toString();
        IllegalStateException $r32 = new IllegalStateException($r12);
        throw $r32;
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
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2315a(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.asm.C14261m.m2315a(java.lang.Object):int");
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
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C14261m m2316a() {
        long $l0;
        while (true) {
            $l0 = this.f31370a;
            long $l1 = $l0 & 1152921504606846976L;
            if ($l1 == 0) {
                long $l12 = $l0 | 1152921504606846976L;
                AtomicLongFieldUpdater $r1 = f31368c;
                boolean $z0 = $r1.compareAndSet(this, $l0, $l12);
                if ($z0) {
                    $l0 = $l12;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            C14261m c14261m = (C14261m) this.f31375s;
            if (c14261m != null) {
                return c14261m;
            }
            AtomicReferenceFieldUpdater $r4 = f31369r;
            int $i3 = this.f31373g;
            boolean $z02 = this.f31372e;
            C14261m r7 = new C14261m($i3 * 2, $z02);
            long $l13 = 1073741823 & $l0;
            int $i32 = (int) ($l13 >> 0);
            int $i33 = $i32;
            long $l14 = 1152921503533105152L & $l0;
            int $i4 = (int) ($l14 >> 30);
            while (true) {
                int $i5 = this.f31374i;
                int $i6 = $i33 & $i5;
                if ($i6 != ($i5 & $i4)) {
                    Object $r2 = this.f31371d.get($i6);
                    Object $r6 = $r2;
                    if ($r2 == null) {
                        $r6 = r8;
                        Object r8 = new b0$a($i33);
                    }
                    AtomicReferenceArray $r5 = r7.f31371d;
                    $r5.set(r7.f31374i & $i33, $r6);
                    $i33++;
                }
            }
            long $l15 = (-1152921504606846977L) & $l0;
            r7.f31370a = $l15;
            $r4.compareAndSet(this, null, r7);
        }
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
    /* renamed from: b */
    public final Object m2314b() {
        while (true) {
            long $l0 = this.f31370a;
            long $l3 = $l0 & 1152921504606846976L;
            if ($l3 != 0) {
                Paint r5 = f31367b;
                return r5;
            }
            long $l32 = $l0 & 1073741823;
            int $i1 = (int) ($l32 >> 0);
            long $l33 = 1152921503533105152L & $l0;
            int $i5 = (int) ($l33 >> 30);
            int $i6 = this.f31374i;
            int $i52 = $i5 & $i6;
            int $i62 = $i6 & $i1;
            if ($i52 == $i62) {
                return null;
            }
            Object $r3 = this.f31371d.get($i62);
            if ($r3 == null) {
                boolean $z0 = this.f31372e;
                if ($z0) {
                    return null;
                }
            } else {
                boolean $z02 = $r3 instanceof b0$a;
                if ($z02) {
                    return null;
                }
                AtomicLongFieldUpdater $r1 = f31368c;
                long $l2 = $l0 & (-1073741824);
                long $l34 = ($i1 + 1) & 1073741823;
                long $l35 = $l34 << 0;
                boolean $z03 = $r1.compareAndSet(this, $l0, $l2 | $l35);
                if ($z03) {
                    AtomicReferenceArray $r2 = this.f31371d;
                    $r2.set(this.f31374i & $i1, null);
                    return $r3;
                }
                boolean $z04 = this.f31372e;
                if ($z04) {
                    while (true) {
                        long $l02 = this.f31370a;
                        long $l22 = $l02 & 1073741823;
                        int $i63 = (int) ($l22 >> 0);
                        boolean $z05 = Item.f31289c;
                        if ($z05) {
                            boolean $z06 = $i63 == $i1;
                            if (!$z06) {
                                AssertionError $r4 = new AssertionError();
                                throw $r4;
                            }
                        }
                        long $l23 = $l02 & 1152921504606846976L;
                        if ($l23 != 0) {
                            this = this.m2316a();
                        } else {
                            AtomicLongFieldUpdater $r12 = f31368c;
                            long $l24 = $l02 & (-1073741824);
                            boolean $z07 = $r12.compareAndSet(this, $l02, $l24 | $l35);
                            if ($z07) {
                                AtomicReferenceArray $r22 = this.f31371d;
                                int $i53 = this.f31374i;
                                $r22.set($i53 & $i63, null);
                                this = null;
                            } else {
                                continue;
                            }
                        }
                        if (this == null) {
                            return $r3;
                        }
                    }
                }
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
    /* renamed from: c */
    public final int m2313c() {
        long $l1 = this.f31370a;
        long $l2 = 1073741823 & $l1;
        int $i0 = (int) ($l2 >> 0);
        int $i3 = (int) (($l1 & 1152921503533105152L) >> 30);
        return 1073741823 & ($i3 - $i0);
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
    /* renamed from: d */
    public final boolean m2312d() {
        boolean $z0;
        do {
            long $l0 = this.f31370a;
            long $l1 = $l0 & 2305843009213693952L;
            if ($l1 != 0) {
                return true;
            }
            long $l12 = 1152921504606846976L & $l0;
            if ($l12 != 0) {
                return false;
            }
            long $l13 = $l0 | 2305843009213693952L;
            AtomicLongFieldUpdater $r1 = f31368c;
            $z0 = $r1.compareAndSet(this, $l0, $l13);
        } while (!$z0);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: k */
    public final boolean m2311k() {
        long $l2 = this.f31370a;
        long $l3 = 1073741823 & $l2;
        int $i1 = (int) ($l3 >> 0);
        int $i0 = (int) (($l2 & 1152921503533105152L) >> 30);
        return $i1 == $i0;
    }
}
