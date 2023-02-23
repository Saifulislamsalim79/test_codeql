package lombok.org.asm.p575xy;

import a.a.a.q.h;
import a.a.a.q.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lombok.org.asm.Item;
/* renamed from: lombok.org.asm.xy.f */
/* loaded from: classes.dex */
public final class C14317f {

    /* renamed from: a */
    public static final AtomicIntegerFieldUpdater f31509a;

    /* renamed from: d */
    public static final AtomicReferenceFieldUpdater f31510d;

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f31511h;

    /* renamed from: r */
    public static final AtomicIntegerFieldUpdater f31512r;

    /* renamed from: b */
    private volatile Object f31513b;

    /* renamed from: c */
    public final AtomicReferenceArray<h> f31514c;

    /* renamed from: e */
    private volatile int f31515e;

    /* renamed from: f */
    private volatile int f31516f;

    /* renamed from: i */
    private volatile int f31517i;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AtomicReferenceFieldUpdater $r0 = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "b");
        f31510d = $r0;
        AtomicIntegerFieldUpdater $r1 = AtomicIntegerFieldUpdater.newUpdater(m.class, "c");
        f31509a = $r1;
        AtomicIntegerFieldUpdater $r12 = AtomicIntegerFieldUpdater.newUpdater(m.class, "d");
        f31511h = $r12;
        AtomicIntegerFieldUpdater $r13 = AtomicIntegerFieldUpdater.newUpdater(m.class, "e");
        f31512r = $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14317f() {
        AtomicReferenceArray $r1 = new AtomicReferenceArray(128);
        this.f31514c = $r1;
        this.f31513b = null;
        this.f31517i = 0;
        this.f31516f = 0;
        this.f31515e = 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final long m2163a(C14317f c14317f) {
        boolean $z0 = Item.f31289c;
        if ($z0) {
            int $i0 = m2157i();
            boolean $z02 = $i0 == 0;
            if (!$z02) {
                AssertionError $r3 = new AssertionError();
                throw $r3;
            }
        }
        int $i02 = c14317f.f31517i;
        AtomicReferenceArray $r1 = c14317f.f31514c;
        for (int $i1 = c14317f.f31516f; $i1 != $i02; $i1++) {
            int $i2 = $i1 & 127;
            int $i3 = c14317f.f31515e;
            if ($i3 == 0) {
                break;
            }
            Object $r4 = $r1.get($i2);
            AbstractRunnableC14319h $r5 = (AbstractRunnableC14319h) $r4;
            if ($r5 != null) {
                Label $r6 = $r5.f31524c;
                int $i32 = $r6.mo2147b();
                boolean $z03 = $i32 == 1;
                if ($z03) {
                    boolean $z04 = $r1.compareAndSet($i2, $r5, null);
                    if ($z04) {
                        AtomicIntegerFieldUpdater $r7 = f31512r;
                        $r7.decrementAndGet(c14317f);
                        m2160a($r5, false);
                        return -1L;
                    }
                } else {
                    continue;
                }
            }
        }
        long $l4 = m2162a(c14317f, true);
        return $l4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final long m2162a(C14317f c14317f, boolean z) {
        AbstractRunnableC14319h $r3;
        boolean $z1;
        do {
            Object $r2 = c14317f.f31513b;
            $r3 = (AbstractRunnableC14319h) $r2;
            if ($r3 == null) {
                return -2L;
            }
            if (z) {
                Label $r4 = $r3.f31524c;
                int $i1 = $r4.mo2147b();
                boolean $z12 = $i1 == 1;
                if (!$z12) {
                    return -2L;
                }
            }
            SizeMetrics $r5 = C14318g.f31522g;
            long $l2 = $r5.mo2165a() - $r3.f31523b;
            long $l3 = C14318g.f31518a;
            if ($l2 < $l3) {
                return $l3 - $l2;
            }
            AtomicReferenceFieldUpdater $r6 = f31510d;
            $z1 = $r6.compareAndSet(c14317f, $r3, null);
        } while (!$z1);
        m2160a($r3, false);
        return -1L;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2164a() {
        while (true) {
            int $i0 = this.f31516f;
            int $i1 = this.f31517i;
            if ($i0 - $i1 == 0) {
                return null;
            }
            int $i12 = $i0 & 127;
            AtomicIntegerFieldUpdater $r1 = f31511h;
            int $i2 = $i0 + 1;
            boolean $z0 = $r1.compareAndSet(this, $i0, $i2);
            if ($z0) {
                AtomicReferenceArray $r2 = this.f31514c;
                Object $r3 = $r2.getAndSet($i12, null);
                AbstractRunnableC14319h $r4 = (AbstractRunnableC14319h) $r3;
                if ($r4 != null) {
                    Label $r5 = $r4.f31524c;
                    boolean $z1 = $r5.mo2147b() == 1;
                    if ($z1) {
                        AtomicIntegerFieldUpdater $r12 = f31512r;
                        int $i02 = $r12.decrementAndGet(this);
                        boolean $z12 = Item.f31289c;
                        if ($z12) {
                            boolean $z02 = $i02 >= 0;
                            if ($z02) {
                                return $r4;
                            }
                            AssertionError $r6 = new AssertionError();
                            throw $r6;
                        }
                    }
                    return $r4;
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2161a(AbstractRunnableC14319h abstractRunnableC14319h) {
        Label $r2 = abstractRunnableC14319h.f31524c;
        int $i0 = $r2.mo2147b();
        boolean $z0 = $i0 == 1;
        if ($z0) {
            AtomicIntegerFieldUpdater $r3 = f31512r;
            $r3.incrementAndGet(this);
        }
        int $i02 = m2157i();
        if ($i02 == 127) {
            return abstractRunnableC14319h;
        }
        int $i03 = this.f31517i;
        int $i04 = $i03 & 127;
        while (true) {
            AtomicReferenceArray $r4 = this.f31514c;
            Object $r5 = $r4.get($i04);
            if ($r5 == null) {
                AtomicReferenceArray $r42 = this.f31514c;
                $r42.lazySet($i04, abstractRunnableC14319h);
                AtomicIntegerFieldUpdater $r32 = f31509a;
                $r32.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractRunnableC14319h m2160a(AbstractRunnableC14319h $r1, boolean z) {
        if (z) {
            return m2161a($r1);
        }
        AtomicReferenceFieldUpdater $r2 = f31510d;
        Object $r3 = $r2.getAndSet(this, $r1);
        AbstractRunnableC14319h $r12 = (AbstractRunnableC14319h) $r3;
        if ($r12 != null) {
            return m2161a($r12);
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final AbstractRunnableC14319h m2159c() {
        AtomicReferenceFieldUpdater $r1 = f31510d;
        Object $r2 = $r1.getAndSet(this, null);
        AbstractRunnableC14319h $r3 = (AbstractRunnableC14319h) $r2;
        return $r3 != null ? $r3 : m2164a();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final int m2158f() {
        Object $r1 = this.f31513b;
        if ($r1 != null) {
            int $i0 = m2157i();
            return $i0 + 1;
        }
        int $i02 = m2157i();
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final int m2157i() {
        int $i1 = this.f31517i;
        int $i0 = this.f31516f;
        return $i1 - $i0;
    }
}
