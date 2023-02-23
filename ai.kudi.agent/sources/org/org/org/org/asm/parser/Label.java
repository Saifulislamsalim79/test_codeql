package org.org.org.org.asm.parser;

import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* loaded from: classes.dex */
public final class Label {

    /* renamed from: a */
    public static final List<Integer> f32369a;

    /* renamed from: h */
    public static final String f32370h;

    /* renamed from: b */
    public final long f32371b;

    /* renamed from: c */
    public final long f32372c;

    /* renamed from: d */
    public final double f32373d;

    /* renamed from: f */
    public List<Long> f32374f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r2;
        Integer[] $r0 = {1000, 500, 200, 100, 50, 25, 10, 0};
        $r2 = C13726r.m3888h($r0);
        f32369a = $r2;
        f32370h = "<1000ms,∞ms)   %s\n<500ms,1000ms) %s\n<200ms,500ms)  %s\n<100ms,200ms)  %s\n<50ms,100ms)   %s\n<25ms,50ms>    %s\n<10ms,25ms)    %s\n<0ms,10ms)     %s\n\nmin: %sms, max: %sms, average: %sms";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0075 */
    /* JADX WARN: Incorrect condition in loop: B:18:0x00d4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Label(final java.util.List r43) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Label.<init>(java.util.List):void");
    }

    public Label(List list, long j, double d, long j2) {
        Log_OC.getArray(list, "entries");
        this.f32374f = list;
        this.f32371b = j;
        this.f32373d = d;
        this.f32372c = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1067a(long r15) {
        /*
            r14 = this;
            java.util.List<java.lang.Integer> r0 = org.org.org.org.asm.parser.Label.f32369a
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        L7:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r4 = r1.next()
            if (r2 < 0) goto L24
            r6 = r4
            java.lang.Number r6 = (java.lang.Number) r6
            r5 = r6
            int r7 = r5.intValue()
            long r8 = (long) r7
            int r10 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r10 < 0) goto L21
            return r2
        L21:
            int r2 = r2 + 1
            goto L7
        L24:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "Null throw statement replaced by Soot"
            r11.<init>(r12)
            throw r11
        L2f:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Label.m1067a(long):int");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001f */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1068a() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Label.m1068a():java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Label;
            if ($z0) {
                Label $r3 = (Label) obj;
                List $r4 = this.f32374f;
                List $r1 = $r3.f32374f;
                boolean $z02 = Log_OC.append($r4, $r1);
                if ($z02) {
                    long $l1 = this.f32371b;
                    long $l2 = $r3.f32371b;
                    if ($l1 == $l2) {
                        double $d0 = this.f32373d;
                        double $d1 = $r3.f32373d;
                        int $i3 = Double.compare($d0, $d1);
                        if ($i3 == 0) {
                            long $l12 = this.f32372c;
                            long $l22 = $r3.f32372c;
                            return $l12 == $l22;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        List $r1 = this.f32374f;
        int $i0 = $r1 != null ? $r1.hashCode() : 0;
        long $l1 = this.f32371b;
        int $i2 = Version$BuildAwareOrder.compare($l1);
        double $d0 = this.f32373d;
        int $i22 = Tags.append($d0);
        long $l12 = this.f32372c;
        int $i23 = Version$BuildAwareOrder.compare($l12);
        return ((((($i0 * 31) + $i2) * 31) + $i22) * 31) + $i23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Histogram(entries=");
        List $r3 = this.f32374f;
        $r2.append($r3);
        $r2.append(", min=");
        long $l0 = this.f32371b;
        $r2.append($l0);
        $r2.append(", average=");
        double $d0 = this.f32373d;
        $r2.append($d0);
        $r2.append(", max=");
        long $l02 = this.f32372c;
        $r2.append($l02);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
