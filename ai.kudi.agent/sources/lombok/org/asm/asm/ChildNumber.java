package lombok.org.asm.asm;

import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import lombok.org.asm.InterfaceC14296n;
/* loaded from: classes.dex */
public final class ChildNumber extends AbstractC11802m implements InterfaceC11771p<Object, InterfaceC11719g.InterfaceC11722b, Object> {
    public static final ChildNumber ZERO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ChildNumber $r0 = new ChildNumber();
        ZERO = $r0;
    }

    public ChildNumber() {
        super(2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public Object invoke(Object $r1, InterfaceC11719g.InterfaceC11722b interfaceC11722b) {
        InterfaceC11719g.InterfaceC11722b $r3 = interfaceC11722b;
        boolean $z0 = $r3 instanceof InterfaceC14296n;
        if ($z0) {
            boolean $z02 = $r1 instanceof java.lang.Integer;
            if (!$z02) {
                $r1 = null;
            }
            java.lang.Integer $r4 = (java.lang.Integer) $r1;
            int $i0 = $r4 != null ? $r4.intValue() : 1;
            return $i0 == 0 ? $r3 : java.lang.Integer.valueOf($i0 + 1);
        }
        return $r1;
    }
}
