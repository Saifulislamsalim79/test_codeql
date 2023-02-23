package lombok.org.asm;

import kotlin.C13288p;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* loaded from: classes.dex */
public final class AnnotationVisitor {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final java.lang.Object m2405a(java.lang.Object obj, InterfaceC11767l interfaceC11767l) {
        Throwable $r0 = C13288p.m5361b(obj);
        if ($r0 != null) {
            C14264b $r4 = new C14264b($r0, false);
            return $r4;
        } else if (interfaceC11767l != null) {
            Edit $r3 = new Edit(obj, interfaceC11767l);
            return $r3;
        } else {
            return obj;
        }
    }
}
