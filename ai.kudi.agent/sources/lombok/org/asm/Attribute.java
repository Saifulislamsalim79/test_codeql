package lombok.org.asm;

import a.a.a.o1;
import kotlin.p476c0.AbstractC11710a;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
/* loaded from: classes.dex */
public final class Attribute extends AbstractC11710a implements o1<String> {

    /* renamed from: g */
    public static final Generator f31266g;

    /* renamed from: a */
    public final long f31267a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Generator $r0 = new Generator();
        f31266g = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Attribute(long r2) {
        /*
            r1 = this;
            lombok.org.asm.Generator r0 = lombok.org.asm.Attribute.f31266g
            r1.<init>(r0)
            r1.f31267a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.asm.Attribute.<init>(long):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public /* bridge */ /* synthetic */ java.lang.Object m2403a(InterfaceC11719g interfaceC11719g) {
        String $r1 = write(interfaceC11719g);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public InterfaceC11719g.InterfaceC11722b m2404a(InterfaceC11719g.InterfaceC11724c interfaceC11724c) {
        InterfaceC11719g.InterfaceC11722b $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10398b(this, interfaceC11724c);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public void m2402a(InterfaceC11719g interfaceC11719g, java.lang.Object obj) {
        String $r4 = (String) obj;
        Thread $r1 = Thread.currentThread();
        $r1.setName($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            boolean $z0 = obj instanceof Attribute;
            if ($z0) {
                Attribute $r2 = (Attribute) obj;
                long $l1 = this.f31267a;
                long $l0 = $r2.f31267a;
                return $l1 == $l0;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.AbstractC11710a, kotlin.p476c0.InterfaceC11719g
    public java.lang.Object fold(java.lang.Object obj, InterfaceC11771p interfaceC11771p) {
        java.lang.Object $r2 = InterfaceC11719g.InterfaceC11722b.C11723a.m10399a(this, obj, interfaceC11771p);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        long $l1 = this.f31267a;
        long $l2 = $l1 >>> 32;
        int $i0 = (int) ($l1 ^ $l2);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.AbstractC11710a, kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g minusKey(InterfaceC11719g.InterfaceC11724c interfaceC11724c) {
        InterfaceC11719g $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10397c(this, interfaceC11724c);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.AbstractC11710a, kotlin.p476c0.InterfaceC11719g
    public InterfaceC11719g plus(InterfaceC11719g interfaceC11719g) {
        InterfaceC11719g $r1 = InterfaceC11719g.InterfaceC11722b.C11723a.m10396d(this, interfaceC11719g);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("CoroutineId(");
        long $l0 = this.f31267a;
        $r2.append($l0);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String write(InterfaceC11719g interfaceC11719g) {
        int $i0;
        Target $r2 = MimeType.f31295a;
        InterfaceC11719g.InterfaceC11722b $r3 = interfaceC11719g.get($r2);
        MimeType mimeType = (MimeType) $r3;
        Thread $r5 = Thread.currentThread();
        String $r6 = $r5.getName();
        $i0 = C13277t.m5399b0($r6, " @", 0, false, 6, null);
        int $i1 = $i0;
        if ($i0 < 0) {
            $i1 = $r6.length();
        }
        StringBuilder $r7 = new StringBuilder($i1 + 9 + 10);
        if ($r6 == null) {
            NullPointerException $r9 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw $r9;
        }
        String $r8 = $r6.substring(0, $i1);
        Log_OC.loadImage($r8, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        $r7.append($r8);
        $r7.append(" @");
        $r7.append("coroutine");
        $r7.append('#');
        long $l2 = this.f31267a;
        $r7.append($l2);
        String $r82 = $r7.toString();
        Log_OC.loadImage($r82, "StringBuilder(capacity).…builderAction).toString()");
        $r5.setName($r82);
        return $r6;
    }
}
