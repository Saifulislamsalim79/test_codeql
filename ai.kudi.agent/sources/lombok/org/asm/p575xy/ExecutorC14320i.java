package lombok.org.asm.p575xy;

import a.a.a.q.a;
import android.support.p050v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11841h;
import lombok.org.asm.Item;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.xy.i */
/* loaded from: classes.dex */
public final class ExecutorC14320i implements Executor, Closeable {

    /* renamed from: c */
    public static final AtomicLongFieldUpdater f31525c;

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f31526g;

    /* renamed from: q */
    public static final Paint f31527q;
    public static final AtomicIntegerFieldUpdater table;

    /* renamed from: a */
    public volatile long f31528a;

    /* renamed from: b */
    public final C14321k f31529b;

    /* renamed from: d */
    public final C14321k f31530d;

    /* renamed from: e */
    private volatile int f31531e;

    /* renamed from: f */
    private volatile long f31532f;

    /* renamed from: i */
    public final AtomicReferenceArray<a.a> f31533i;

    /* renamed from: l */
    public final long f31534l;

    /* renamed from: m */
    public final int f31535m;

    /* renamed from: p */
    public final int f31536p;

    /* renamed from: s */
    public final String f31537s;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Paint $r0 = new Paint("NOT_IN_STACK");
        f31527q = $r0;
        AtomicLongFieldUpdater $r1 = AtomicLongFieldUpdater.newUpdater(a.class, "e");
        f31526g = $r1;
        AtomicLongFieldUpdater $r12 = AtomicLongFieldUpdater.newUpdater(a.class, "w");
        f31525c = $r12;
        AtomicIntegerFieldUpdater $r2 = AtomicIntegerFieldUpdater.newUpdater(a.class, "x");
        table = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ExecutorC14320i(int i, int $i1, long $l2, String str) {
        this.f31536p = i;
        this.f31535m = $i1;
        this.f31534l = $l2;
        this.f31537s = str;
        boolean $z0 = i >= 1;
        if (!$z0) {
            String $r1 = "Core pool size " + i + " should be at least 1";
            IllegalArgumentException $r5 = new IllegalArgumentException($r1.toString());
            throw $r5;
        }
        boolean $z02 = $i1 >= i;
        if (!$z02) {
            String $r12 = "Max pool size " + $i1 + " should be greater than or equals to core pool size " + i;
            IllegalArgumentException $r52 = new IllegalArgumentException($r12.toString());
            throw $r52;
        }
        boolean $z03 = $i1 <= 2097150;
        if (!$z03) {
            String $r13 = "Max pool size " + $i1 + " should not exceed maximal supported number of threads 2097150";
            IllegalArgumentException $r53 = new IllegalArgumentException($r13.toString());
            throw $r53;
        }
        boolean $z04 = $l2 > 0;
        if (!$z04) {
            String $r14 = "Idle worker keep alive time " + $l2 + " must be positive";
            IllegalArgumentException $r54 = new IllegalArgumentException($r14.toString());
            throw $r54;
        }
        C14321k $r2 = new C14321k();
        this.f31529b = $r2;
        C14321k $r22 = new C14321k();
        this.f31530d = $r22;
        this.f31532f = 0L;
        AtomicReferenceArray $r3 = new AtomicReferenceArray($i1 + 1);
        this.f31533i = $r3;
        this.f31528a = i << 42;
        this.f31531e = 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2154a(Runnable runnable, Label label) {
        SizeMetrics $r3 = C14318g.f31522g;
        long $l0 = $r3.mo2165a();
        boolean $z0 = runnable instanceof AbstractRunnableC14319h;
        if (!$z0) {
            C14325q $r5 = new C14325q(runnable, $l0, label);
            return $r5;
        }
        AbstractRunnableC14319h $r4 = (AbstractRunnableC14319h) runnable;
        $r4.f31523b = $l0;
        $r4.f31524c = label;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 == r9) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2153a(java.lang.Runnable r26, lombok.org.asm.p575xy.Label r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.ExecutorC14320i.m2153a(java.lang.Runnable, lombok.org.asm.xy.Label, boolean):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2151a(C14323m c14323m, int i, int i2) {
        while (true) {
            long $l2 = this.f31532f;
            long $l3 = 2097151 & $l2;
            int $i4 = (int) $l3;
            long $l32 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + $l2;
            long $l33 = $l32 & (-2097152);
            if ($i4 == i) {
                $i4 = i2 == 0 ? m2149b(c14323m) : i2;
            }
            if ($i4 >= 0) {
                AtomicLongFieldUpdater $r2 = f31526g;
                long $l5 = $i4;
                boolean $z0 = $r2.compareAndSet(this, $l2, $l33 | $l5);
                if ($z0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2156a() {
        while (true) {
            long $l0 = this.f31532f;
            long $l1 = 2097151 & $l0;
            AtomicReferenceArray $r2 = this.f31533i;
            Object $r3 = $r2.get((int) $l1);
            C14323m $r4 = (C14323m) $r3;
            if ($r4 != null) {
                long $l12 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + $l0;
                long $l13 = $l12 & (-2097152);
                int $i2 = m2149b($r4);
                if ($i2 < 0) {
                    continue;
                } else {
                    AtomicLongFieldUpdater $r1 = f31526g;
                    long $l3 = $i2;
                    boolean $z0 = $r1.compareAndSet(this, $l0, $l3 | $l13);
                    if ($z0) {
                        Paint $r5 = f31527q;
                        $r4.f31546q = $r5;
                    } else {
                        continue;
                    }
                }
            } else {
                $r4 = null;
            }
            if ($r4 == null) {
                return false;
            }
            AtomicIntegerFieldUpdater $r6 = C14323m.f31539h;
            boolean $z02 = $r6.compareAndSet($r4, -1, 0);
            if ($z02) {
                LockSupport.unpark($r4);
                return true;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2155a(long j) {
        int $i2;
        long $l1 = 2097151 & j;
        int $i22 = (int) $l1;
        long $l0 = j & 4398044413952L;
        int $i3 = (int) ($l0 >> 21);
        $i2 = C11841h.m10271a($i22 - $i3, 0);
        int $i32 = this.f31536p;
        if ($i2 < $i32) {
            int $i23 = add();
            if ($i23 == 1) {
                int $i33 = this.f31536p;
                if ($i33 > 1) {
                    add();
                }
            }
            return $i23 > 0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2152a(C14323m c14323m) {
        boolean $z0;
        Object $r2 = c14323m.f31546q;
        Paint $r3 = f31527q;
        if ($r2 != $r3) {
            return false;
        }
        do {
            long $l0 = this.f31532f;
            long $l1 = 2097151 & $l0;
            int $i2 = (int) $l1;
            long $l12 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + $l0;
            long $l13 = $l12 & (-2097152);
            int $i3 = c14323m.f31545j;
            boolean $z02 = Item.f31289c;
            if ($z02) {
                boolean $z03 = $i3 != 0;
                if (!$z03) {
                    AssertionError $r4 = new AssertionError();
                    throw $r4;
                }
            }
            AtomicReferenceArray $r5 = this.f31533i;
            Object $r22 = $r5.get($i2);
            c14323m.f31546q = $r22;
            AtomicLongFieldUpdater $r6 = f31526g;
            long $l4 = $i3;
            $z0 = $r6.compareAndSet(this, $l0, $l4 | $l13);
        } while (!$z0);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: Throwable -> 0x00b5, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0010, B:14:0x0035, B:19:0x003e, B:21:0x004b, B:26:0x005c, B:30:0x0088, B:35:0x0093, B:36:0x00a2, B:38:0x00a5, B:39:0x00b4), top: B:43:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int add() {
        /*
            r22 = this;
            r0 = r22
            java.util.concurrent.atomic.AtomicReferenceArray<a.a.a.q.a$a> r2 = r0.f31533i
            monitor-enter(r2)
            r0 = r22
            boolean r3 = r0.isTerminated()     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L10
            monitor-exit(r2)
            r4 = -1
            return r4
        L10:
            r0 = r22
            long r5 = r0.f31528a     // Catch: java.lang.Throwable -> Lb5
            r9 = 2097151(0x1fffff, double:1.0361303E-317)
            long r7 = r5 & r9
            int r11 = (int) r7     // Catch: java.lang.Throwable -> Lb5
            r9 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r9
            r4 = 21
            long r5 = r5 >> r4
            int r12 = (int) r5     // Catch: java.lang.Throwable -> Lb5
            int r12 = r11 - r12
            r3 = 0
            r4 = 0
            int r12 = kotlin.p491i0.C11839f.m10280a(r12, r4)     // Catch: java.lang.Throwable -> Lb5
            r0 = r22
            int r13 = r0.f31536p     // Catch: java.lang.Throwable -> Lb5
            if (r12 < r13) goto L35
            monitor-exit(r2)
            r4 = 0
            return r4
        L35:
            r0 = r22
            int r13 = r0.f31535m     // Catch: java.lang.Throwable -> Lb5
            if (r11 < r13) goto L3e
            monitor-exit(r2)
            r4 = 0
            return r4
        L3e:
            r0 = r22
            long r5 = r0.f31528a     // Catch: java.lang.Throwable -> Lb5
            r9 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r9
            int r11 = (int) r5     // Catch: java.lang.Throwable -> Lb5
            int r13 = r11 + 1
            if (r13 <= 0) goto L58
            r0 = r22
            java.util.concurrent.atomic.AtomicReferenceArray<a.a.a.q.a$a> r14 = r0.f31533i     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r15 = r14.get(r13)     // Catch: java.lang.Throwable -> Lb5
            if (r15 != 0) goto L58
            r16 = 1
            goto L5a
        L58:
            r16 = 0
        L5a:
            if (r16 == 0) goto La3
            lombok.org.asm.xy.m r17 = new lombok.org.asm.xy.m     // Catch: java.lang.Throwable -> Lb5
            r0 = r17
            r1 = r22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            r0 = r17
            r0.m2141d(r13)     // Catch: java.lang.Throwable -> Lb5
            r0 = r22
            java.util.concurrent.atomic.AtomicReferenceArray<a.a.a.q.a$a> r14 = r0.f31533i     // Catch: java.lang.Throwable -> Lb5
            r0 = r17
            r14.set(r13, r0)     // Catch: java.lang.Throwable -> Lb5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r18 = lombok.org.asm.p575xy.ExecutorC14320i.f31525c     // Catch: java.lang.Throwable -> Lb5
            r0 = r18
            r1 = r22
            long r5 = r0.incrementAndGet(r1)     // Catch: java.lang.Throwable -> Lb5
            r9 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r9 & r5
            int r11 = (int) r5     // Catch: java.lang.Throwable -> Lb5
            if (r13 != r11) goto L86
            r3 = 1
        L86:
            if (r3 == 0) goto L91
            r0 = r17
            r0.start()     // Catch: java.lang.Throwable -> Lb5
            int r12 = r12 + 1
            monitor-exit(r2)
            return r12
        L91:
            java.lang.String r19 = "Failed requirement."
            java.lang.IllegalArgumentException r20 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb5
            r0 = r19
            java.lang.String r19 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            r0 = r20
            r1 = r19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            throw r20     // Catch: java.lang.Throwable -> Lb5
        La3:
            java.lang.String r19 = "Failed requirement."
            java.lang.IllegalArgumentException r20 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb5
            r0 = r19
            java.lang.String r19 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            r0 = r20
            r1 = r19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            throw r20     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r21 = move-exception
            monitor-exit(r2)
            throw r21
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.ExecutorC14320i.add():int");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2149b(lombok.org.asm.p575xy.C14323m r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.f31546q
        L2:
            lombok.org.asm.asm.Paint r1 = lombok.org.asm.p575xy.ExecutorC14320i.f31527q
            if (r0 != r1) goto L8
            r2 = -1
            return r2
        L8:
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            r3 = r0
            lombok.org.asm.xy.m r3 = (lombok.org.asm.p575xy.C14323m) r3
            r6 = r3
            int r4 = r6.f31545j
            if (r4 == 0) goto L15
            return r4
        L15:
            java.lang.Object r0 = r6.f31546q
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.ExecutorC14320i.m2149b(lombok.org.asm.xy.m):int");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final C14323m m2150b() {
        Thread $r1 = Thread.currentThread();
        Thread $r2 = $r1;
        boolean $z0 = $r1 instanceof C14323m;
        if (!$z0) {
            $r2 = null;
        }
        C14323m $r3 = (C14323m) $r2;
        if ($r3 != null) {
            ExecutorC14320i $r4 = $r3.f31540a;
            boolean $z02 = Log_OC.append($r4, this);
            if ($z02) {
                return $r3;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r26 != null) goto L49;
     */
    /* JADX WARN: Incorrect condition in loop: B:16:0x0044 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[LOOP:0: B:13:0x0027->B:38:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bd A[EDGE_INSN: B:80:0x00bd->B:39:0x00bd ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.ExecutorC14320i.close():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C14322l $r2 = C14322l.f31538h;
        m2153a(runnable, (Label) $r2, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this.f31531e;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        ArrayList $r1 = new ArrayList();
        AtomicReferenceArray $r2 = this.f31533i;
        int $i0 = $r2.length();
        int $i1 = 0;
        int $i2 = 0;
        int $i3 = 0;
        int $i4 = 0;
        int $i5 = 0;
        for (int $i6 = 1; $i6 < $i0; $i6++) {
            AtomicReferenceArray $r22 = this.f31533i;
            Object $r3 = $r22.get($i6);
            C14323m $r4 = (C14323m) $r3;
            if ($r4 != null) {
                C14317f $r5 = $r4.f31541b;
                int $i7 = $r5.m2158f();
                EnumC14316c $r6 = $r4.f31542c;
                int $i8 = $r6.ordinal();
                if ($i8 == 0) {
                    $i1++;
                    StringBuilder $r7 = new StringBuilder();
                    String $r8 = String.valueOf($i7);
                    $r7.append($r8);
                    $r7.append("c");
                    String $r82 = $r7.toString();
                    $r1.add($r82);
                } else if ($i8 == 1) {
                    $i2++;
                    StringBuilder $r72 = new StringBuilder();
                    String $r83 = String.valueOf($i7);
                    $r72.append($r83);
                    $r72.append("b");
                    String $r84 = $r72.toString();
                    $r1.add($r84);
                } else if ($i8 == 2) {
                    $i3++;
                } else if ($i8 == 3) {
                    $i4++;
                    if ($i7 > 0) {
                        StringBuilder $r73 = new StringBuilder();
                        String $r85 = String.valueOf($i7);
                        $r73.append($r85);
                        $r73.append("d");
                        String $r86 = $r73.toString();
                        $r1.add($r86);
                    }
                } else if ($i8 == 4) {
                    $i5++;
                }
            }
        }
        long $l9 = this.f31528a;
        StringBuilder $r74 = new StringBuilder();
        String $r87 = this.f31537s;
        $r74.append($r87);
        $r74.append('@');
        int $i02 = System.identityHashCode(this);
        String $r88 = Integer.toHexString($i02);
        $r74.append($r88);
        $r74.append('[');
        $r74.append("Pool Size {");
        $r74.append("core = ");
        int $i03 = this.f31536p;
        $r74.append($i03);
        $r74.append(", ");
        $r74.append("max = ");
        int $i04 = this.f31535m;
        $r74.append($i04);
        $r74.append("}, ");
        $r74.append("Worker States {");
        $r74.append("CPU = ");
        $r74.append($i1);
        $r74.append(", ");
        $r74.append("blocking = ");
        $r74.append($i2);
        $r74.append(", ");
        $r74.append("parked = ");
        $r74.append($i3);
        $r74.append(", ");
        $r74.append("dormant = ");
        $r74.append($i4);
        $r74.append(", ");
        $r74.append("terminated = ");
        $r74.append($i5);
        $r74.append("}, ");
        $r74.append("running workers queues = ");
        $r74.append($r1);
        $r74.append(", ");
        $r74.append("global CPU queue size = ");
        C14321k $r9 = this.f31529b;
        int $i12 = $r9.m2344a();
        $r74.append($i12);
        $r74.append(", ");
        $r74.append("global blocking queue size = ");
        C14321k $r92 = this.f31530d;
        int $i13 = $r92.m2344a();
        $r74.append($i13);
        $r74.append(", ");
        $r74.append("Control State {");
        $r74.append("created workers= ");
        long $l10 = 2097151 & $l9;
        int $i14 = (int) $l10;
        $r74.append($i14);
        $r74.append(", ");
        $r74.append("blocking tasks = ");
        long $l102 = 4398044413952L & $l9;
        int $i15 = (int) ($l102 >> 21);
        $r74.append($i15);
        $r74.append(", ");
        $r74.append("CPUs acquired = ");
        int $i16 = this.f31536p;
        int $i22 = (int) ((9223367638808264704L & $l9) >> 42);
        $r74.append($i16 - $i22);
        $r74.append("}]");
        String $r89 = $r74.toString();
        return $r89;
    }
}
