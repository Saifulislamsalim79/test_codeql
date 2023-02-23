package lombok.org.asm.menu;

import a.a.a.f0;
import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.p483e0.p484c.InterfaceC11767l;
import lombok.org.asm.InterfaceC14270g;
import lombok.org.asm.PositionMetric$a;
import lombok.org.asm.asm.MethodVisitor;
import lombok.org.asm.asm.Paint;
/* renamed from: lombok.org.asm.menu.q */
/* loaded from: classes.dex */
public class C14293q<E> extends a.a.a.a2.n<E> {

    /* renamed from: a */
    public final f0<java.lang.Object> f31454a;

    /* renamed from: c */
    public final int f31455c;

    public C14293q(InterfaceC14270g interfaceC14270g, int i) {
        this.f31454a = interfaceC14270g;
        this.f31455c = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Paint m2199a(java.lang.Object obj, MethodVisitor methodVisitor) {
        java.lang.Object $r4;
        f0<java.lang.Object> f0Var = this.f31454a;
        int $i0 = this.f31455c;
        if ($i0 != 2) {
            $r4 = obj;
        } else {
            $r4 = r8;
            java.lang.Object r8 = new Label(obj);
        }
        InterfaceC11767l $r5 = m2201a(obj);
        java.lang.Object $r1 = f0Var.m2283a($r4, null, $r5);
        if ($r1 != null) {
            boolean $z0 = lombok.org.asm.Item.f31289c;
            if ($z0) {
                Paint $r6 = PositionMetric$a.f31306a;
                boolean $z02 = $r1 == $r6;
                if (!$z02) {
                    AssertionError r9 = new AssertionError();
                    throw r9;
                }
            }
            Paint $r62 = PositionMetric$a.f31306a;
            return $r62;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public void m2198a(C14289m c14289m) {
        int $i0 = this.f31455c;
        if ($i0 == 1) {
            Throwable $r3 = c14289m.f31452e;
            if ($r3 == null) {
                f0<java.lang.Object> f0Var = this.f31454a;
                C13288p.m5362a(null);
                f0Var.resumeWith(null);
                return;
            }
        }
        if ($i0 == 2) {
            f0<java.lang.Object> f0Var2 = this.f31454a;
            Throwable $r32 = c14289m.f31452e;
            Handle r7 = new Handle($r32);
            Label r8 = new Label(r7);
            C13288p.m5362a(r8);
            f0Var2.resumeWith(r8);
            return;
        }
        f0<java.lang.Object> f0Var3 = this.f31454a;
        java.lang.Object $r1 = c14289m.f31452e;
        if ($r1 == null) {
            $r1 = r9;
            C14290n r9 = new C14290n("Channel was closed");
        }
        Throwable $r33 = (Throwable) $r1;
        java.lang.Object $r12 = C13291q.m5358a($r33);
        C13288p.m5362a($r12);
        f0Var3.resumeWith($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("ReceiveElement@");
        int $i0 = System.identityHashCode(this);
        String $r2 = Integer.toHexString($i0);
        $r1.append($r2);
        $r1.append("[receiveMode=");
        int $i02 = this.f31455c;
        $r1.append($i02);
        $r1.append(']');
        String $r22 = $r1.toString();
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void toString(java.lang.Object obj) {
        f0<java.lang.Object> f0Var = this.f31454a;
        Paint $r1 = PositionMetric$a.f31306a;
        f0Var.m2282d($r1);
    }
}
