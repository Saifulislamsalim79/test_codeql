package lombok.org.asm;

import a.a.a.d1;
import a.a.a.t;
import a.a.a.v1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: lombok.org.asm.m */
/* loaded from: classes.dex */
public abstract class AbstractC14276m<J extends a.a.a.t> extends v1 implements d1, a.a.a.e {

    /* renamed from: a */
    public final J f31409a;

    public AbstractC14276m(Label label) {
        this.f31409a = label;
    }

    /* renamed from: a */
    public C14247a m2260a() {
        return null;
    }

    /* renamed from: b */
    public boolean m2259b() {
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public void m2258c() {
        boolean $z0;
        Label $r2 = this.f31409a;
        if ($r2 == null) {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type com.smartlook.coroutines.JobSupport");
            throw $r8;
        }
        ByteVector $r3 = (ByteVector) $r2;
        do {
            java.lang.Object $r4 = $r3.length();
            boolean $z02 = $r4 instanceof AbstractC14276m;
            if (!$z02) {
                boolean $z03 = $r4 instanceof InterfaceC14267e;
                if ($z03) {
                    InterfaceC14267e $r6 = (InterfaceC14267e) $r4;
                    C14247a $r7 = $r6.mo2173a();
                    if ($r7 != null) {
                        exists();
                        return;
                    }
                    return;
                }
                return;
            } else if ($r4 != this) {
                return;
            } else {
                AtomicReferenceFieldUpdater $r5 = ByteVector.f31268c;
                C14309t $r1 = Plot.f31303f;
                $z0 = $r5.compareAndSet($r3, $r4, $r1);
            }
        } while (!$z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        Class $r2 = getClass();
        String $r3 = $r2.getSimpleName();
        $r1.append($r3);
        $r1.append('@');
        int $i0 = System.identityHashCode(this);
        String $r32 = Integer.toHexString($i0);
        $r1.append($r32);
        $r1.append("[job@");
        int $i02 = System.identityHashCode(this.f31409a);
        String $r33 = Integer.toHexString($i02);
        $r1.append($r33);
        $r1.append(']');
        String $r34 = $r1.toString();
        return $r34;
    }
}
