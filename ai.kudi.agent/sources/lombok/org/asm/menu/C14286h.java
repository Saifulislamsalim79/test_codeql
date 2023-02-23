package lombok.org.asm.menu;

import java.util.concurrent.locks.ReentrantLock;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.menu.h */
/* loaded from: classes.dex */
public final class C14286h<E> extends a.a.a.a2.a<E> implements a.a.a.a2.o<E> {

    /* renamed from: a */
    public volatile long f31448a;

    /* renamed from: b */
    public final a.a.a.a2.d<E> f31449b;

    /* renamed from: w */
    public final ReentrantLock f31450w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14286h(C14281d c14281d) {
        super(null);
        this.f31449b = c14281d;
        ReentrantLock $r2 = new ReentrantLock();
        this.f31450w = $r2;
        this.f31448a = 0L;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2221a() {
        /*
            r24 = this;
            r0 = r24
            java.util.concurrent.locks.ReentrantLock r5 = r0.f31450w
            r5.lock()
            r0 = r24
            java.lang.Object r6 = r0.m2217d()     // Catch: java.lang.Throwable -> L6c
            boolean r7 = r6 instanceof lombok.org.asm.menu.C14289m     // Catch: java.lang.Throwable -> L6c
            r8 = 1
            if (r7 == 0) goto L13
            goto L17
        L13:
            lombok.org.asm.asm.Paint r9 = lombok.org.asm.menu.ClassWriter.f31413k     // Catch: java.lang.Throwable -> L6c
            if (r6 != r9) goto L19
        L17:
            r7 = 0
            goto L25
        L19:
            r0 = r24
            long r10 = r0.f31448a     // Catch: java.lang.Throwable -> L6c
            r12 = 1
            long r10 = r10 + r12
            r0 = r24
            r0.f31448a = r10     // Catch: java.lang.Throwable -> L6c
            r7 = 1
        L25:
            r5.unlock()
            boolean r14 = r6 instanceof lombok.org.asm.menu.C14289m
            if (r14 != 0) goto L2e
            r15 = 0
            goto L2f
        L2e:
            r15 = r6
        L2f:
            r17 = r15
            lombok.org.asm.menu.m r17 = (lombok.org.asm.menu.C14289m) r17
            r16 = r17
            if (r16 == 0) goto L44
            r0 = r16
            java.lang.Throwable r0 = r0.f31452e
            r18 = r0
            r0 = r24
            r1 = r18
            r0.m2220a(r1)
        L44:
            r0 = r24
            boolean r14 = r0.m2219b()
            if (r14 == 0) goto L4d
            goto L4e
        L4d:
            r8 = r7
        L4e:
            if (r8 == 0) goto L71
            r0 = r24
            a.a.a.a2.d<E> r0 = r0.f31449b
            r19 = r0
            r20 = 0
            r21 = 0
            r22 = 3
            r23 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            lombok.org.asm.menu.C14281d.m2239a(r0, r1, r2, r3, r4)
            return r6
        L6c:
            r18 = move-exception
            r5.unlock()
            throw r18
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.C14286h.m2221a():java.lang.Object");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public boolean m2220a(Throwable th) {
        boolean $z0 = super.m2230a(th);
        if ($z0) {
            C14281d.m2239a(this.f31449b, null, this, 1, null);
            ReentrantLock $r3 = this.f31450w;
            $r3.lock();
            try {
                long $l0 = this.f31449b.f31430a;
                this.f31448a = $l0;
                return $z0;
            } finally {
                $r3.unlock();
            }
        }
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9 A[EDGE_INSN: B:57:0x00a9->B:50:0x00a9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2219b() {
        /*
            r19 = this;
            r2 = 0
        L1:
            r0 = r19
            lombok.org.asm.menu.m r3 = r0.m2227f()
            if (r3 == 0) goto La
            goto L1c
        La:
            r0 = r19
            boolean r4 = r0.m2218c()
            if (r4 == 0) goto L1e
            r0 = r19
            a.a.a.a2.d<E> r5 = r0.f31449b
            lombok.org.asm.menu.m r3 = r5.m2227f()
            if (r3 != 0) goto L1e
        L1c:
            r4 = 0
            goto L1f
        L1e:
            r4 = 1
        L1f:
            r3 = 0
            if (r4 == 0) goto La9
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            boolean r4 = r6.tryLock()
            if (r4 != 0) goto L2d
            goto La9
        L2d:
            r0 = r19
            java.lang.Object r7 = r0.m2217d()     // Catch: java.lang.Throwable -> La0
            lombok.org.asm.asm.Paint r8 = lombok.org.asm.menu.ClassWriter.f31413k     // Catch: java.lang.Throwable -> La0
            if (r7 != r8) goto L38
            goto L8e
        L38:
            boolean r4 = r7 instanceof lombok.org.asm.menu.C14289m     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L48
            r9 = r7
            lombok.org.asm.menu.m r9 = (lombok.org.asm.menu.C14289m) r9     // Catch: java.lang.Throwable -> La0
            r3 = r9
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            r6.unlock()
            goto La9
        L48:
            r0 = r19
            lombok.org.asm.menu.MenuItem r10 = r0.add()     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L98
            boolean r4 = r10 instanceof lombok.org.asm.menu.C14289m     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L55
            goto L98
        L55:
            r11 = 0
            lombok.org.asm.asm.Paint r8 = r10.m2253a(r7, r11)     // Catch: java.lang.Throwable -> La0
            if (r8 == 0) goto L8e
            boolean r2 = lombok.org.asm.Item.f31289c     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L70
            lombok.org.asm.asm.Paint r12 = lombok.org.asm.PositionMetric$a.f31306a     // Catch: java.lang.Throwable -> La0
            if (r8 != r12) goto L66
            r2 = 1
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L6a
            goto L70
        L6a:
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> La0
            r13.<init>()     // Catch: java.lang.Throwable -> La0
            throw r13     // Catch: java.lang.Throwable -> La0
        L70:
            r0 = r19
            long r14 = r0.f31448a     // Catch: java.lang.Throwable -> La0
            r16 = 1
            r0 = r16
            long r14 = r14 + r0
            r0 = r19
            r0.f31448a = r14     // Catch: java.lang.Throwable -> La0
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            r6.unlock()
            kotlin.p483e0.p485d.Log_OC.append(r10)
            r10.toString(r7)
            r2 = 1
            goto L1
        L8e:
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            r6.unlock()
            goto L1
        L98:
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            r6.unlock()
            goto La9
        La0:
            r18 = move-exception
            r0 = r19
            java.util.concurrent.locks.ReentrantLock r6 = r0.f31450w
            r6.unlock()
            throw r18
        La9:
            if (r3 == 0) goto Lb6
            java.lang.Throwable r0 = r3.f31452e
            r18 = r0
            r0 = r19
            r1 = r18
            r0.m2220a(r1)
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.menu.C14286h.m2219b():boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public boolean m2218c() {
        long $l1 = this.f31448a;
        long $l2 = this.f31449b.f31430a;
        return $l1 >= $l2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final java.lang.Object m2217d() {
        long $l2 = this.f31448a;
        C14289m $r2 = this.f31449b.m2227f();
        C14289m $r3 = $r2;
        long $l0 = this.f31449b.f31430a;
        if ($l2 >= $l0) {
            if ($r2 == null) {
                $r3 = m2227f();
            }
            if ($r3 != null) {
                return $r3;
            }
            Paint r6 = ClassWriter.f31413k;
            return r6;
        }
        a.a.a.a2.d<E> dVar = this.f31449b;
        java.lang.Object[] $r4 = dVar.f31434n;
        int $i3 = dVar.f31432d;
        long $l02 = $i3;
        int $i32 = (int) ($l2 % $l02);
        java.lang.Object $r5 = $r4[$i32];
        C14289m $r22 = m2227f();
        return $r22 != null ? $r22 : $r5;
    }

    public boolean isEnabled() {
        return false;
    }
}
