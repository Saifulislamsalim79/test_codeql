package lombok.org.asm;

import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11771p;
import lombok.org.asm.InterfaceC14267e;
/* loaded from: classes.dex */
public final class SignatureReader {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [lombok.org.asm.MethodWriter, java.lang.Object, lombok.org.asm.Label] */
    /* renamed from: a */
    public static Label m2355a(Number number, InterfaceC11719g $r2, EnumC14265c enumC14265c, InterfaceC11771p interfaceC11771p, int i, java.lang.Object obj) {
        InterfaceC14267e.C14268a $r7;
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r2 = C11725h.f26446c;
        }
        int $i0 = i & 2;
        EnumC14265c $r5 = $i0 != 0 ? EnumC14265c.f31381a : null;
        InterfaceC11719g $r22 = C14275l.m2261a(number, $r2);
        $r5.getClass();
        EnumC14265c $r6 = EnumC14265c.f31382c;
        boolean $z0 = $r5 == $r6;
        if ($z0) {
            $r7 = r8;
            InterfaceC14267e.C14268a r8 = new InterfaceC14267e.C14268a($r22, interfaceC11771p);
        } else {
            $r7 = r9;
            FieldVisitor r9 = new FieldVisitor($r22, true);
        }
        $r7.m2366a($r5, $r7, interfaceC11771p);
        return $r7;
    }
}
