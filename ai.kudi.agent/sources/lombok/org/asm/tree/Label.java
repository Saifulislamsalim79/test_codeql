package lombok.org.asm.tree;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import lombok.org.asm.MethodWriter;
import lombok.org.asm.asm.C14256g;
/* loaded from: classes.dex */
public final class Label {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2171a(InterfaceC11714d interfaceC11714d, InterfaceC11714d interfaceC11714d2) {
        InterfaceC11714d $r1;
        try {
            $r1 = C11729c.m10388c(interfaceC11714d);
            C13666w $r0 = C13666w.f30112a;
            C13288p.m5362a($r0);
            C14256g.m2321a($r1, $r0, null, 2, null);
        } catch (Throwable $r3) {
            Object $r4 = C13291q.m5358a($r3);
            C13288p.m5362a($r4);
            MethodWriter $r5 = (MethodWriter) interfaceC11714d2;
            $r5.resumeWith($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2170a(InterfaceC11771p interfaceC11771p, Object obj, InterfaceC11714d interfaceC11714d, InterfaceC11767l interfaceC11767l) {
        InterfaceC11714d $r4;
        InterfaceC11714d $r42;
        try {
            $r4 = C11729c.m10389b(interfaceC11771p, obj, interfaceC11714d);
            $r42 = C11729c.m10388c($r4);
            C13666w $r5 = C13666w.f30112a;
            C13288p.m5362a($r5);
            C14256g.m2322a($r42, $r5, interfaceC11767l);
        } catch (Throwable $r6) {
            Object $r3 = C13291q.m5358a($r6);
            C13288p.m5362a($r3);
            interfaceC11714d.resumeWith($r3);
        }
    }
}
