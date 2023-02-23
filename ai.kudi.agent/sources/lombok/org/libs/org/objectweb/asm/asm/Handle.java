package lombok.org.libs.org.objectweb.asm.asm;

import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Handle extends Sequence {

    /* renamed from: b */
    public final org.org.org.org.internal.app.Label f31572b;

    /* renamed from: c */
    public final int f31573c;

    /* renamed from: d */
    public final Exception f31574d;

    public Handle(int i, org.org.org.org.internal.app.Label label, Exception exc) {
        super(null);
        this.f31573c = i;
        this.f31572b = label;
        this.f31574d = exc;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Handle(int r2, org.org.org.org.internal.app.Label r3, java.lang.Exception r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r4 = 0
        La:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.asm.Handle.<init>(int, org.org.org.org.internal.app.Label, java.lang.Exception, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final org.org.org.org.internal.app.Label m2122a() {
        org.org.org.org.internal.app.Label r1 = this.f31572b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Handle;
            if ($z0) {
                Handle $r2 = (Handle) obj;
                int $i0 = this.f31573c;
                int $i1 = $r2.f31573c;
                if ($i0 == $i1) {
                    org.org.org.org.internal.app.Label $r3 = this.f31572b;
                    org.org.org.org.internal.app.Label $r4 = $r2.f31572b;
                    boolean $z02 = Log_OC.append($r3, $r4);
                    if ($z02) {
                        Exception $r5 = this.f31574d;
                        Exception $r6 = $r2.f31574d;
                        boolean $z03 = Log_OC.append($r5, $r6);
                        return $z03;
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
    public final int getName() {
        int i0 = this.f31573c;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        int $i0 = this.f31573c;
        int $i1 = $i0 * 31;
        org.org.org.org.internal.app.Label $r1 = this.f31572b;
        int $i2 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = ($i1 + $i2) * 31;
        Exception $r2 = this.f31574d;
        int $i02 = $r2 != null ? $r2.hashCode() : 0;
        return $i12 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Failure(responseCode=");
        int $i0 = this.f31573c;
        $r2.append($i0);
        $r2.append(", error=");
        org.org.org.org.internal.app.Label $r3 = this.f31572b;
        $r2.append($r3);
        $r2.append(", exception=");
        Exception $r4 = this.f31574d;
        $r2.append($r4);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
