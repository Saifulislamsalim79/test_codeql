package lombok.org.asm.p575xy;

import a.a.a.q.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.p489h0.AbstractC11828c;
import lombok.org.asm.Item;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.xy.m */
/* loaded from: classes.dex */
public final class C14323m extends Thread {

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f31539h;

    /* renamed from: a */
    public final /* synthetic */ ExecutorC14320i f31540a;

    /* renamed from: b */
    public final C14317f f31541b;

    /* renamed from: c */
    public EnumC14316c f31542c;

    /* renamed from: e */
    public volatile int f31543e;

    /* renamed from: i */
    public boolean f31544i;

    /* renamed from: j */
    public volatile int f31545j;

    /* renamed from: q */
    public volatile Object f31546q;

    /* renamed from: r */
    public int f31547r;

    /* renamed from: s */
    public long f31548s;

    /* renamed from: x */
    public long f31549x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicIntegerFieldUpdater $r0 = AtomicIntegerFieldUpdater.newUpdater(a.a.class, "f");
        f31539h = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14323m(ExecutorC14320i executorC14320i) {
        this.f31540a = executorC14320i;
        setDaemon(true);
        C14317f $r2 = new C14317f();
        this.f31541b = $r2;
        EnumC14316c $r3 = EnumC14316c.f31505c;
        this.f31542c = $r3;
        this.f31543e = 0;
        Paint $r4 = ExecutorC14320i.f31527q;
        this.f31546q = $r4;
        AbstractC11828c.C11829a $r5 = AbstractC11828c.f26511d;
        int $i0 = $r5.mo10295b();
        this.f31547r = $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final int m2145a(int $i1) {
        int $i0 = this.f31547r;
        int $i2 = $i0 << 13;
        int $i02 = $i0 ^ $i2;
        int $i22 = $i02 >> 17;
        int $i03 = $i02 ^ $i22;
        int $i23 = $i03 << 5;
        int $i24 = $i03 ^ $i23;
        this.f31547r = $i24;
        int $i3 = $i1 - 1;
        return ($i3 & $i1) == 0 ? $i24 & $i3 : ($i24 & Integer.MAX_VALUE) % $i1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2146a() {
        int $i0 = m2145a(2);
        if ($i0 == 0) {
            ExecutorC14320i $r1 = this.f31540a;
            C14321k $r2 = $r1.f31529b;
            Object $r3 = $r2.m2341d();
            AbstractRunnableC14319h $r4 = (AbstractRunnableC14319h) $r3;
            if ($r4 != null) {
                return $r4;
            }
            ExecutorC14320i $r12 = this.f31540a;
            C14321k $r22 = $r12.f31530d;
            Object $r32 = $r22.m2341d();
            return (AbstractRunnableC14319h) $r32;
        }
        ExecutorC14320i $r13 = this.f31540a;
        C14321k $r23 = $r13.f31530d;
        Object $r33 = $r23.m2341d();
        AbstractRunnableC14319h $r42 = (AbstractRunnableC14319h) $r33;
        if ($r42 != null) {
            return $r42;
        }
        ExecutorC14320i $r14 = this.f31540a;
        C14321k $r24 = $r14.f31529b;
        Object $r34 = $r24.m2341d();
        return (AbstractRunnableC14319h) $r34;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2143a(boolean z) {
        long $l5;
        if (Item.f31289c) {
            if (!(this.f31541b.m2158f() == 0)) {
                AssertionError $r2 = new AssertionError();
                throw $r2;
            }
        }
        ExecutorC14320i $r3 = this.f31540a;
        long $l1 = $r3.f31528a;
        int $i0 = (int) ($l1 & 2097151);
        if ($i0 < 2) {
            return null;
        }
        int $i2 = m2145a($i0);
        long $l12 = Long.MAX_VALUE;
        for (int $i3 = 0; $i3 < $i0; $i3++) {
            $i2++;
            if ($i2 > $i0) {
                $i2 = 1;
            }
            ExecutorC14320i $r32 = this.f31540a;
            AtomicReferenceArray $r4 = $r32.f31533i;
            Object $r5 = $r4.get($i2);
            C14323m $r6 = (C14323m) $r5;
            if ($r6 != null && $r6 != this) {
                boolean $z1 = Item.f31289c;
                if ($z1) {
                    int $i4 = this.f31541b.m2158f();
                    if (!($i4 == 0)) {
                        AssertionError $r22 = new AssertionError();
                        throw $r22;
                    }
                }
                if (z) {
                    $l5 = this.f31541b.m2163a($r6.f31541b);
                } else {
                    C14317f $r1 = this.f31541b;
                    C14317f $r7 = $r6.f31541b;
                    $r1.getClass();
                    if ($z1) {
                        int $i42 = $r1.m2157i();
                        if (!($i42 == 0)) {
                            AssertionError $r23 = new AssertionError();
                            throw $r23;
                        }
                    }
                    AbstractRunnableC14319h $r8 = $r7.m2164a();
                    if ($r8 != null) {
                        AbstractRunnableC14319h $r82 = $r1.m2160a($r8, false);
                        if ($z1) {
                            if (!($r82 == null)) {
                                AssertionError $r24 = new AssertionError();
                                throw $r24;
                            }
                        }
                        $l5 = -1;
                    } else {
                        $l5 = $r1.m2162a($r7, false);
                    }
                }
                if ($l5 == -1) {
                    return this.f31541b.m2159c();
                }
                if ($l5 > 0) {
                    $l12 = Math.min($l12, $l5);
                }
            }
        }
        if ($l12 == Long.MAX_VALUE) {
            $l12 = 0;
        }
        this.f31548s = $l12;
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m2144a(EnumC14316c enumC14316c) {
        EnumC14316c $r2 = this.f31542c;
        EnumC14316c $r5 = EnumC14316c.f31503a;
        boolean $z0 = $r2 == $r5;
        if ($z0) {
            ExecutorC14320i $r3 = this.f31540a;
            AtomicLongFieldUpdater $r4 = ExecutorC14320i.f31525c;
            $r4.addAndGet($r3, 4398046511104L);
        }
        if ($r2 != enumC14316c) {
            this.f31542c = enumC14316c;
        }
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lombok.org.asm.p575xy.AbstractRunnableC14319h m2142b(boolean r28) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.C14323m.m2142b(boolean):lombok.org.asm.xy.h");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m2141d(int i) {
        StringBuilder $r1 = new StringBuilder();
        ExecutorC14320i $r2 = this.f31540a;
        String $r3 = $r2.f31537s;
        $r1.append($r3);
        $r1.append("-worker-");
        String $r32 = i == 0 ? "TERMINATED" : String.valueOf(i);
        $r1.append($r32);
        String $r33 = $r1.toString();
        setName($r33);
        this.f31545j = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0293, code lost:
        r7 = lombok.org.asm.p575xy.EnumC14316c.f31506d;
        m2144a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0001, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0001, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0000 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.p575xy.C14323m.run():void");
    }
}
