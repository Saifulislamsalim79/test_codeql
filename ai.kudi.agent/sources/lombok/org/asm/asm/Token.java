package lombok.org.asm.asm;

import a.a.a.c2.t;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import lombok.org.asm.InterfaceC14296n;
/* loaded from: classes.dex */
public final class Token extends AbstractC11802m implements InterfaceC11771p<t, InterfaceC11719g.InterfaceC11722b, t> {
    public static final Token PERCENT;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        PERCENT = $r0;
    }

    public Token() {
        super(2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public t invoke(t tVar, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
        C14260l $r3 = (C14260l) tVar;
        InterfaceC11719g.InterfaceC11722b $r4 = interfaceC11722b;
        boolean $z0 = $r4 instanceof InterfaceC14296n;
        if ($z0) {
            InterfaceC14296n $r5 = (InterfaceC14296n) $r4;
            InterfaceC11719g $r6 = $r3.f31365f;
            Object $r1 = $r5.m2195a($r6);
            Object[] $r7 = $r3.f31364b;
            int $i0 = $r3.f31366i;
            int $i1 = $i0 + 1;
            $r3.f31366i = $i1;
            $r7[$i0] = $r1;
        }
        return $r3;
    }
}
