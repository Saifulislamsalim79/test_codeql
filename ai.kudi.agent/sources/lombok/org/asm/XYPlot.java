package lombok.org.asm;

import a.a.a.n1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.p476c0.InterfaceC11719g;
import lombok.org.asm.asm.C14261m;
import lombok.org.asm.asm.InterfaceC14250a;
import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public abstract class XYPlot extends AbstractC14246L {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f31317c;

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f31318g;

    /* renamed from: e */
    private volatile java.lang.Object f31321e = null;

    /* renamed from: b */
    private volatile java.lang.Object f31319b = null;

    /* renamed from: d */
    public volatile int f31320d = 0;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(n1.class, java.lang.Object.class, "w");
        f31317c = $r0;
        AtomicReferenceFieldUpdater $r02 = AtomicReferenceFieldUpdater.newUpdater(n1.class, java.lang.Object.class, "x");
        f31318g = $r02;
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
    @Override // lombok.org.asm.AbstractC14271h
    /* renamed from: a */
    public long mo2281a() {
        n1$a $r4;
        boolean $z0 = m2276c();
        if ($z0) {
            return 0L;
        }
        n1$b $r2 = (n1$b) this.f31319b;
        Runnable $r3 = null;
        if ($r2 != null) {
            int $i1 = $r2.f31341b;
            boolean $z02 = $i1 == 0;
            if (!$z02) {
                long $l2 = System.nanoTime();
                do {
                    synchronized ($r2) {
                        InterfaceC14250a $r42 = $r2.m2334a();
                        if ($r42 != null) {
                            n1$a $r5 = (n1$a) $r42;
                            long $l3 = $r5.f31457a;
                            boolean $z03 = $l2 - $l3 >= 0;
                            boolean $z04 = $z03 ? m2351a($r5) : false;
                            $r4 = $z04 ? $r2.m2333a(0) : null;
                        } else {
                            $r4 = null;
                        }
                    }
                } while ($r4 != null);
            }
        }
        while (true) {
            java.lang.Object $r1 = this.f31321e;
            if ($r1 == null) {
                break;
            }
            boolean $z05 = $r1 instanceof C14261m;
            if ($z05) {
                C14261m $r7 = (C14261m) $r1;
                java.lang.Object $r8 = $r7.m2314b();
                Paint $r9 = C14261m.f31367b;
                if ($r8 != $r9) {
                    $r3 = (Runnable) $r8;
                    break;
                }
                AtomicReferenceFieldUpdater $r10 = f31317c;
                $r10.compareAndSet(this, $r1, $r7.m2316a());
            } else {
                Paint $r92 = Frame.f31281f;
                if ($r1 == $r92) {
                    break;
                }
                AtomicReferenceFieldUpdater $r102 = f31317c;
                boolean $z06 = $r102.compareAndSet(this, $r1, null);
                if ($z06) {
                    $r3 = (Runnable) $r1;
                    break;
                }
            }
        }
        if ($r3 != null) {
            $r3.run();
            return 0L;
        }
        long $l22 = m2349d();
        return $l22;
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
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2352a(long r36, lombok.org.asm.n1$a r38) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.XYPlot.m2352a(long, lombok.org.asm.n1$a):void");
    }

    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public final void mo2139a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        m2348d(runnable);
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
    public final boolean m2351a(Runnable runnable) {
        while (true) {
            java.lang.Object $r2 = this.f31321e;
            boolean $z0 = getValue();
            if ($z0) {
                return false;
            }
            if ($r2 == null) {
                AtomicReferenceFieldUpdater $r3 = f31317c;
                boolean $z02 = $r3.compareAndSet(this, null, runnable);
                if ($z02) {
                    return true;
                }
            } else {
                boolean $z03 = $r2 instanceof C14261m;
                if ($z03) {
                    C14261m $r4 = (C14261m) $r2;
                    int $i0 = $r4.m2315a(runnable);
                    if ($i0 == 0) {
                        return true;
                    }
                    if ($i0 == 1) {
                        AtomicReferenceFieldUpdater $r32 = f31317c;
                        $r32.compareAndSet(this, $r2, $r4.m2316a());
                    } else if ($i0 == 2) {
                        return false;
                    }
                } else {
                    Paint $r5 = Frame.f31281f;
                    if ($r2 == $r5) {
                        return false;
                    }
                    C14261m $r42 = new C14261m(8, true);
                    Runnable $r6 = (Runnable) $r2;
                    $r42.m2315a($r6);
                    $r42.m2315a(runnable);
                    AtomicReferenceFieldUpdater $r33 = f31317c;
                    boolean $z04 = $r33.compareAndSet(this, $r2, $r42);
                    if ($z04) {
                        return true;
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
    /* renamed from: b */
    public boolean m2350b() {
        boolean $z0 = m2274k();
        if ($z0) {
            n1$b $r2 = (n1$b) this.f31319b;
            if ($r2 != null) {
                int $i0 = $r2.f31341b;
                boolean $z02 = $i0 == 0;
                if (!$z02) {
                    return false;
                }
            }
            java.lang.Object $r1 = this.f31321e;
            if ($r1 == null) {
                return true;
            }
            boolean $z03 = $r1 instanceof C14261m;
            if (!$z03) {
                Paint $r4 = Frame.f31281f;
                return $r1 == $r4;
            }
            C14261m $r3 = (C14261m) $r1;
            boolean $z04 = $r3.m2311k();
            return $z04;
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
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m2349d() {
        /*
            r23 = this;
            r0 = r23
            a.a.a.c2.b<a.a.a.u0<?>> r2 = r0.f31393a
            if (r2 == 0) goto L15
            int r3 = r2.f31355a
            int r4 = r2.f31357p
            if (r3 != r4) goto Le
            r5 = 1
            goto Lf
        Le:
            r5 = 0
        Lf:
            if (r5 == 0) goto L12
            goto L15
        L12:
            r6 = 0
            goto L1a
        L15:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L1a:
            r9 = 0
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 != 0) goto L23
            r9 = 0
            return r9
        L23:
            r0 = r23
            java.lang.Object r11 = r0.f31321e
            if (r11 != 0) goto L2a
            goto L3b
        L2a:
            boolean r5 = r11 instanceof lombok.org.asm.asm.C14261m
            if (r5 == 0) goto L68
            r13 = r11
            lombok.org.asm.asm.m r13 = (lombok.org.asm.asm.C14261m) r13
            r12 = r13
            boolean r5 = r12.m2311k()
            if (r5 != 0) goto L3b
            r9 = 0
            return r9
        L3b:
            r0 = r23
            java.lang.Object r11 = r0.f31319b
            r15 = r11
            lombok.org.asm.n1$b r15 = (lombok.org.asm.n1$b) r15
            r14 = r15
            if (r14 == 0) goto L77
            monitor-enter(r14)
            lombok.org.asm.asm.a r16 = r14.m2334a()     // Catch: java.lang.Throwable -> L65
            monitor-exit(r14)
            r18 = r16
            lombok.org.asm.n1$a r18 = (lombok.org.asm.n1$a) r18
            r17 = r18
            if (r17 == 0) goto L77
            r0 = r17
            long r6 = r0.f31457a
            long r19 = java.lang.System.nanoTime()
            r0 = r19
            long r6 = r6 - r0
            r9 = 0
            long r6 = kotlin.p491i0.C11839f.m10279b(r6, r9)
            return r6
        L65:
            r21 = move-exception
            monitor-exit(r14)
            throw r21
        L68:
            lombok.org.asm.asm.Paint r22 = lombok.org.asm.Frame.f31281f
            r0 = r22
            if (r11 != r0) goto L74
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r9
        L74:
            r9 = 0
            return r9
        L77:
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.XYPlot.m2349d():long");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: d */
    public final void m2348d(Runnable runnable) {
        boolean $z0 = m2351a(runnable);
        if (!$z0) {
            Handler $r4 = Handler.f31286d;
            $r4.m2348d(runnable);
            return;
        }
        Thread $r2 = get();
        Thread $r3 = Thread.currentThread();
        if ($r3 != $r2) {
            LockSupport.unpark($r2);
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
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean getValue() {
        return this.f31320d;
    }

    public final void setOrientation() {
        this.f31321e = null;
        this.f31319b = null;
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
    @Override // lombok.org.asm.AbstractC14271h
    public void shutdown() {
        long $l0;
        n1$a m2333a;
        C14312w c14312w = C14312w.f31491a;
        ThreadLocal $r2 = C14312w.f31492c;
        $r2.set(null);
        this.f31320d = 1;
        boolean $z0 = Item.f31289c;
        if ($z0) {
            boolean $z02 = getValue();
            if (!$z02) {
                AssertionError $r3 = new AssertionError();
                throw $r3;
            }
        }
        while (true) {
            java.lang.Object $r4 = this.f31321e;
            if ($r4 == null) {
                AtomicReferenceFieldUpdater $r5 = f31317c;
                Paint $r6 = Frame.f31281f;
                boolean $z03 = $r5.compareAndSet(this, null, $r6);
                if ($z03) {
                    break;
                }
            } else {
                boolean $z04 = $r4 instanceof C14261m;
                if ($z04) {
                    ((C14261m) $r4).m2312d();
                    break;
                }
                Paint $r62 = Frame.f31281f;
                if ($r4 == $r62) {
                    break;
                }
                C14261m $r7 = new C14261m(8, true);
                $r7.m2315a((Runnable) $r4);
                AtomicReferenceFieldUpdater $r52 = f31317c;
                boolean $z05 = $r52.compareAndSet(this, $r4, $r7);
                if ($z05) {
                    break;
                }
            }
        }
        do {
            $l0 = mo2281a();
        } while ($l0 <= 0);
        long $l02 = System.nanoTime();
        while (true) {
            n1$b $r9 = (n1$b) this.f31319b;
            if ($r9 == null) {
                return;
            }
            synchronized ($r9) {
                int $i2 = $r9.f31341b;
                m2333a = $i2 > 0 ? $r9.m2333a(0) : null;
            }
            n1$a $r11 = m2333a;
            if ($r11 == null) {
                return;
            }
            m2374d($l02, $r11);
        }
    }
}
