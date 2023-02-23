package lombok.org.asm.menu;

import a.a.a.a2.d;
import java.util.concurrent.locks.ReentrantLock;
import lombok.org.asm.asm.Paint;
import lombok.org.asm.asm.PingManager;
/* renamed from: lombok.org.asm.menu.d */
/* loaded from: classes.dex */
public final class C14281d<E> extends a.a.a.a2.c<E> implements a.a.a.a2.e<E> {

    /* renamed from: a */
    public volatile long f31430a;

    /* renamed from: c */
    public volatile long f31431c;

    /* renamed from: d */
    public final int f31432d;

    /* renamed from: i */
    public volatile int f31433i;

    /* renamed from: n */
    public final java.lang.Object[] f31434n;

    /* renamed from: q */
    public final java.util.List<d.a<E>> f31435q;

    /* renamed from: r */
    public final ReentrantLock f31436r;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14281d(int i) {
        super(null);
        this.f31432d = i;
        boolean $z0 = i >= 1;
        if (!$z0) {
            String $r5 = "ArrayBroadcastChannel capacity must be at least 1, but " + i + " was specified";
            IllegalArgumentException $r6 = new IllegalArgumentException($r5.toString());
            throw $r6;
        }
        ReentrantLock $r1 = new ReentrantLock();
        this.f31436r = $r1;
        java.lang.Object[] $r2 = new java.lang.Object[i];
        this.f31434n = $r2;
        this.f31431c = 0L;
        this.f31430a = 0L;
        this.f31433i = 0;
        java.util.List $r3 = PingManager.getInstance();
        this.f31435q = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m2239a(C14281d c14281d, C14286h $r1, C14286h $r2, int i, java.lang.Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = null;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r2 = null;
        }
        c14281d.m2238a($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public java.lang.Object m2240a(java.lang.Object obj) {
        ReentrantLock $r1 = this.f31436r;
        $r1.lock();
        try {
            C14289m $r2 = m2226i();
            if ($r2 != null) {
                return $r2;
            }
            int $i1 = this.f31433i;
            int $i0 = this.f31432d;
            if ($i1 >= $i0) {
                Paint r6 = ClassWriter.f31412g;
                return r6;
            }
            long $l2 = this.f31430a;
            java.lang.Object[] $r4 = this.f31434n;
            int $i02 = this.f31432d;
            long $l3 = $i02;
            int $i03 = (int) ($l2 % $l3);
            $r4[$i03] = obj;
            this.f31433i = $i1 + 1;
            this.f31430a = $l2 + 1;
            $r1.unlock();
            m2236c();
            Paint r62 = ClassWriter.f31410b;
            return r62;
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public InterfaceC14277a m2241a() {
        C14286h $r1 = new C14286h(this);
        m2239a(this, $r1, null, 2, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r26 = new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
        throw r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0065, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0065, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2238a(lombok.org.asm.menu.C14286h r28, lombok.org.asm.menu.C14286h r29) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.C14281d.m2238a(lombok.org.asm.menu.h, lombok.org.asm.menu.h):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m2237b() {
        /*
            r10 = this;
            java.util.List<a.a.a.a2.d$a<E>> r0 = r10.f31435q
            java.util.Iterator r1 = r0.iterator()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lb:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L20
            java.lang.Object r5 = r1.next()
            r7 = r5
            lombok.org.asm.menu.h r7 = (lombok.org.asm.menu.C14286h) r7
            r6 = r7
            long r8 = r6.f31448a
            long r2 = kotlin.p491i0.C11839f.m10276e(r2, r8)
            goto Lb
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.C14281d.m2237b():long");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2236c() {
        /*
            r12 = this;
            java.util.List<a.a.a.a2.d$a<E>> r0 = r12.f31435q
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
            r3 = 0
        L8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1f
            java.lang.Object r5 = r1.next()
            r7 = r5
            lombok.org.asm.menu.h r7 = (lombok.org.asm.menu.C14286h) r7
            r6 = r7
            boolean r3 = r6.m2219b()
            if (r3 == 0) goto L1d
            r2 = 1
        L1d:
            r3 = 1
            goto L8
        L1f:
            if (r2 != 0) goto L23
            if (r3 != 0) goto L2a
        L23:
            r8 = 0
            r9 = 0
            r10 = 3
            r11 = 0
            m2239a(r12, r8, r9, r10, r11)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.C14281d.m2236c():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public String m2235e() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("(buffer:capacity=");
        java.lang.Object[] $r3 = this.f31434n;
        int $i0 = $r3.length;
        $r2.append($i0);
        $r2.append(",size=");
        int $i02 = this.f31433i;
        $r2.append($i02);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
