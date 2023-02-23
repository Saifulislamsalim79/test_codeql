package lombok.org.asm.menu;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.PositionMetric$a;
import lombok.org.asm.asm.C14263p;
import lombok.org.asm.asm.Handler;
import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public final class Item<E> extends a.a.a.a2.m<E> implements a.a.a.a2.o<E> {

    /* renamed from: d */
    public final a.a.a.a2.l<E> f31418d;

    public Item(C14285g c14285g) {
        super(null);
        this.f31418d = c14285g;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public java.lang.Object m2256a(java.lang.Object $r2) {
        InterfaceC11767l $r10;
        MenuItem $r7;
        Paint $r5;
        ReentrantLock $r1 = this.f31421w;
        $r1.lock();
        try {
            C14289m $r3 = m2226i();
            if ($r3 != null) {
                return $r3;
            }
            java.lang.Object $r4 = this.f31420c;
            Paint $r52 = ClassWriter.f31411c;
            C14263p $r6 = null;
            if ($r4 == $r52) {
                do {
                    $r7 = add();
                    if ($r7 != null) {
                        boolean $z0 = $r7 instanceof C14289m;
                        if ($z0) {
                            Log_OC.append($r7);
                            return $r7;
                        }
                        Log_OC.append($r7);
                        $r5 = $r7.m2253a($r2, null);
                    }
                } while ($r5 == null);
                boolean $z02 = lombok.org.asm.Item.f31289c;
                if ($z02) {
                    Paint $r8 = PositionMetric$a.f31306a;
                    boolean $z03 = $r5 == $r8;
                    if (!$z03) {
                        AssertionError $r9 = new AssertionError();
                        throw $r9;
                    }
                }
                $r1.unlock();
                Log_OC.append($r7);
                $r7.toString($r2);
                Log_OC.append($r7);
                return $r7.m2254a();
            }
            java.lang.Object $r42 = this.f31420c;
            Paint $r53 = ClassWriter.f31411c;
            if ($r42 != $r53 && ($r10 = this.f31441s) != null) {
                $r6 = Handler.m2340a($r10, $r42, null);
            }
            this.f31420c = $r2;
            if ($r6 == null) {
                Paint $r54 = ClassWriter.f31410b;
                return $r54;
            }
            throw $r6;
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public void m2255a(boolean z) {
        if (z) {
            C14285g.m2224a((C14285g) this.f31418d, (Item) this);
        }
    }
}
