package lombok.org.asm.tree;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.C11741h;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.C11782b0;
import lombok.org.asm.asm.C14258i;
/* renamed from: lombok.org.asm.tree.n */
/* loaded from: classes.dex */
public final class C14310n {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2169a(InterfaceC11771p interfaceC11771p, Object obj, InterfaceC11714d interfaceC11714d) {
        Object $r4;
        C11741h.m10376a(interfaceC11714d);
        try {
            InterfaceC11719g $r3 = interfaceC11714d.getContext();
            Object $r42 = C14258i.m2317b($r3, null);
            if (interfaceC11771p == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                throw $r5;
            }
            C11782b0.m10345f(interfaceC11771p, 2);
            InterfaceC11771p $r1 = interfaceC11771p;
            Object $r2 = $r1.invoke(obj, interfaceC11714d);
            C14258i.m2318a($r3, $r42);
            $r4 = C11734d.m10387d();
            if ($r2 != $r4) {
                C13288p.m5362a($r2);
                interfaceC11714d.resumeWith($r2);
            }
        } catch (Throwable $r7) {
            Object $r22 = C13291q.m5358a($r7);
            C13288p.m5362a($r22);
            interfaceC11714d.resumeWith($r22);
        }
    }
}
