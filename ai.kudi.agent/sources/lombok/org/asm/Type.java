package lombok.org.asm;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Type {

    /* renamed from: a */
    public final AbstractC14297o f31312a;

    /* renamed from: b */
    public final java.lang.Object f31313b;

    /* renamed from: c */
    public final InterfaceC11767l<Throwable, C13666w> f31314c;

    /* renamed from: d */
    public final java.lang.Object f31315d;

    /* renamed from: g */
    public final Throwable f31316g;

    public Type(java.lang.Object obj, AbstractC14297o abstractC14297o, InterfaceC11767l interfaceC11767l, java.lang.Object obj2, Throwable th) {
        this.f31315d = obj;
        this.f31312a = abstractC14297o;
        this.f31314c = interfaceC11767l;
        this.f31313b = obj2;
        this.f31316g = th;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Type(java.lang.Object r2, lombok.org.asm.AbstractC14297o r3, kotlin.p483e0.p484c.InterfaceC11767l r4, java.lang.Object r5, java.lang.Throwable r6, int r7, kotlin.p483e0.p485d.DBUtils$1 r8) {
        /*
            r1 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L6
            r3 = 0
            goto L6
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lc
            r4 = 0
            goto Lc
        Lc:
            r0 = r7 & 8
            if (r0 == 0) goto L12
            r5 = 0
            goto L12
        L12:
            r7 = r7 & 16
            if (r7 == 0) goto L18
            r6 = 0
            goto L18
        L18:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.Type.<init>(java.lang.Object, lombok.org.asm.o, kotlin.e0.c.l, java.lang.Object, java.lang.Throwable, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static Type m2353a(Type type, java.lang.Object obj, AbstractC14297o $r2, InterfaceC11767l interfaceC11767l, java.lang.Object obj2, Throwable $r6, int i, java.lang.Object obj3) {
        int $i1 = i & 1;
        java.lang.Object $r0 = $i1 != 0 ? type.f31315d : null;
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = type.f31312a;
        }
        int $i13 = i & 4;
        InterfaceC11767l<Throwable, C13666w> interfaceC11767l2 = $i13 != 0 ? type.f31314c : null;
        int $i14 = i & 8;
        java.lang.Object $r3 = $i14 != 0 ? type.f31313b : null;
        int $i0 = i & 16;
        if ($i0 != 0) {
            $r6 = type.f31316g;
        }
        type.getClass();
        Type $r4 = new Type($r0, $r2, interfaceC11767l2, $r3, $r6);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Type;
            if ($z0) {
                Type $r2 = (Type) obj;
                java.lang.Object $r1 = this.f31315d;
                java.lang.Object $r3 = $r2.f31315d;
                boolean $z02 = Log_OC.append($r1, $r3);
                if ($z02) {
                    AbstractC14297o $r4 = this.f31312a;
                    AbstractC14297o $r5 = $r2.f31312a;
                    boolean $z03 = Log_OC.append($r4, $r5);
                    if ($z03) {
                        InterfaceC11767l $r6 = this.f31314c;
                        InterfaceC11767l $r7 = $r2.f31314c;
                        boolean $z04 = Log_OC.append($r6, $r7);
                        if ($z04) {
                            java.lang.Object $r12 = this.f31313b;
                            java.lang.Object $r32 = $r2.f31313b;
                            boolean $z05 = Log_OC.append($r12, $r32);
                            if ($z05) {
                                Throwable $r8 = this.f31316g;
                                Throwable $r9 = $r2.f31316g;
                                boolean $z06 = Log_OC.append($r8, $r9);
                                return $z06;
                            }
                            return false;
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
        java.lang.Object $r1 = this.f31315d;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        AbstractC14297o $r2 = this.f31312a;
        int $i2 = $r2 != null ? $r2.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        InterfaceC11767l $r3 = this.f31314c;
        int $i22 = $r3 != null ? $r3.hashCode() : 0;
        int $i14 = ($i13 + $i22) * 31;
        java.lang.Object $r12 = this.f31313b;
        int $i23 = $r12 != null ? $r12.hashCode() : 0;
        int $i15 = ($i14 + $i23) * 31;
        Throwable $r4 = this.f31316g;
        int $i0 = $r4 != null ? $r4.hashCode() : 0;
        return $i15 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CompletedContinuation(result=");
        java.lang.Object $r3 = this.f31315d;
        $r2.append($r3);
        $r2.append(", cancelHandler=");
        AbstractC14297o $r4 = this.f31312a;
        $r2.append($r4);
        $r2.append(", onCancellation=");
        InterfaceC11767l $r5 = this.f31314c;
        $r2.append($r5);
        $r2.append(", idempotentResume=");
        java.lang.Object $r32 = this.f31313b;
        $r2.append($r32);
        $r2.append(", cancelCause=");
        Throwable $r6 = this.f31316g;
        $r2.append($r6);
        $r2.append(")");
        String $r1 = $r2.toString();
        return $r1;
    }
}
