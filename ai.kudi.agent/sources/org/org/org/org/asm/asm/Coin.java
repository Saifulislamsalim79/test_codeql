package org.org.org.org.asm.asm;

import e.a.a.a.f.u.j;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Coin implements Comparable<j> {
    public static final Complex ZERO;

    /* renamed from: b */
    public final int f32318b;

    /* renamed from: d */
    public final int f32319d;

    /* renamed from: f */
    public final String f32320f;

    /* renamed from: g */
    public final String f32321g;

    /* renamed from: x */
    public final int f32322x;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Complex $r0 = new Complex(null);
        ZERO = $r0;
    }

    public Coin() {
        this(0, 0, 0, null, null, 31, null);
    }

    public Coin(int i, int i2, int i3, String str, String str2) {
        this.f32322x = i;
        this.f32318b = i2;
        this.f32319d = i3;
        this.f32320f = str;
        this.f32321g = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Coin(int r9, int r10, int r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.p483e0.p485d.DBUtils$1 r15) {
        /*
            r8 = this;
            r6 = r14 & 1
            r7 = 0
            if (r6 == 0) goto L7
            r9 = 0
            goto L7
        L7:
            r6 = r14 & 2
            if (r6 == 0) goto Ld
            r10 = 0
            goto Ld
        Ld:
            r6 = r14 & 4
            if (r6 == 0) goto L12
            goto L13
        L12:
            r7 = r11
        L13:
            r11 = r14 & 8
            if (r11 == 0) goto L19
            r12 = 0
            goto L19
        L19:
            r11 = r14 & 16
            if (r11 == 0) goto L1f
            r13 = 0
            goto L1f
        L1f:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r7
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.asm.Coin.<init>(int, int, int, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(j jVar) {
        Coin $r2 = (Coin) jVar;
        int $i0 = compareTo($r2);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int compareTo(Coin coin) {
        Log_OC.getArray(coin, "other");
        int $i0 = this.f32322x;
        int $i1 = coin.f32322x;
        if ($i0 > $i1) {
            return 1;
        }
        if ($i0 < $i1) {
            return -1;
        }
        int $i02 = this.f32318b;
        int $i12 = coin.f32318b;
        if ($i02 > $i12) {
            return 1;
        }
        if ($i02 < $i12) {
            return -1;
        }
        int $i03 = this.f32319d;
        int $i13 = coin.f32319d;
        if ($i03 > $i13) {
            return 1;
        }
        return $i03 < $i13 ? -1 : 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (obj != null) {
            boolean $z0 = obj instanceof Coin;
            if ($z0) {
                Coin $r2 = (Coin) obj;
                int $i0 = $r2.compareTo(this);
                return $i0 == 0;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        int $i0 = this.f32322x;
        int $i1 = this.f32318b;
        int $i12 = this.f32319d;
        int $i13 = (((($i0 * 31) + $i1) * 31) + $i12) * 31;
        String $r1 = this.f32320f;
        int $i2 = $r1 != null ? $r1.hashCode() : 0;
        int $i14 = ($i13 + $i2) * 31;
        String $r12 = this.f32321g;
        int $i02 = $r12 != null ? $r12.hashCode() : 0;
        return $i14 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        StringBuilder $r2 = new StringBuilder();
        int $i0 = this.f32322x;
        $r2.append($i0);
        $r2.append('.');
        int $i02 = this.f32318b;
        $r2.append($i02);
        $r2.append('.');
        int $i03 = this.f32319d;
        $r2.append($i03);
        String $r3 = $r2.toString();
        $r1.append($r3);
        String $r32 = this.f32320f;
        if ($r32 != null) {
            $r1.append('-');
            String $r33 = this.f32320f;
            $r1.append($r33);
        }
        String $r34 = this.f32321g;
        if ($r34 != null) {
            $r1.append('+');
            String $r35 = this.f32321g;
            $r1.append($r35);
        }
        String $r36 = $r1.toString();
        Log_OC.loadImage($r36, "StringBuilder().apply(builderAction).toString()");
        return $r36;
    }
}
