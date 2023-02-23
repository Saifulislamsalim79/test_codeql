package lombok.org.asm;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p476c0.InterfaceC11714d;
import lombok.org.asm.asm.C14255f;
/* renamed from: lombok.org.asm.r */
/* loaded from: classes.dex */
public final class C14300r {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final String m2186a(InterfaceC11714d interfaceC11714d) {
        java.lang.Object $r3;
        boolean $z0 = interfaceC11714d instanceof C14255f;
        if ($z0) {
            String $r1 = interfaceC11714d.toString();
            return $r1;
        }
        try {
            StringBuilder $r2 = new StringBuilder();
            $r2.append(interfaceC11714d);
            $r2.append('@');
            int $i0 = System.identityHashCode(interfaceC11714d);
            String $r12 = Integer.toHexString($i0);
            $r2.append($r12);
            java.lang.Object $r13 = $r2.toString();
            $r3 = $r13;
            C13288p.m5362a($r13);
        } catch (Throwable $r4) {
            java.lang.Object $r5 = C13291q.m5358a($r4);
            $r3 = $r5;
            C13288p.m5362a($r5);
        }
        Throwable $r42 = C13288p.m5361b($r3);
        if ($r42 != null) {
            StringBuilder $r22 = new StringBuilder();
            Class $r6 = interfaceC11714d.getClass();
            String $r14 = $r6.getName();
            $r22.append($r14);
            $r22.append('@');
            int $i02 = System.identityHashCode(interfaceC11714d);
            String $r15 = Integer.toHexString($i02);
            $r22.append($r15);
            $r3 = $r22.toString();
        }
        String $r16 = (String) $r3;
        return $r16;
    }
}
