package lombok.org.asm;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import lombok.org.asm.asm.C14255f;
import lombok.org.asm.asm.C14258i;
/* loaded from: classes.dex */
public final class Card {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final void m2382a(AbstractC14266d abstractC14266d, InterfaceC11714d $r1, boolean z) {
        java.lang.Object $r2 = abstractC14266d.m2306c();
        Throwable $r3 = abstractC14266d.m2307b($r2);
        java.lang.Object $r22 = $r3 != null ? C13291q.m5358a($r3) : abstractC14266d.m2310a($r2);
        C13288p.m5362a($r22);
        if (!z) {
            $r1.resumeWith($r22);
        } else if ($r1 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.internal.DispatchedContinuation<T>");
            throw $r7;
        } else {
            C14255f $r4 = (C14255f) $r1;
            InterfaceC11719g $r5 = $r4.f31347a.getContext();
            java.lang.Object $r6 = C14258i.m2317b($r5, $r4.f31350e);
            try {
                $r4.f31347a.resumeWith($r22);
            } finally {
                C14258i.m2318a($r5, $r6);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m2383a(int i) {
        return i == 1 || i == 2;
    }
}
