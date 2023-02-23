package lombok.org.asm;

import kotlin.p483e0.p484c.InterfaceC11767l;
/* renamed from: lombok.org.asm.x */
/* loaded from: classes.dex */
public final class C14314x {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ Object m2167a(Label label, boolean $z0, boolean $z1, InterfaceC11767l interfaceC11767l, int i, java.lang.Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z1 = true;
        }
        Object $r1 = label.mo2370a($z0, $z1, interfaceC11767l);
        return $r1;
    }
}
