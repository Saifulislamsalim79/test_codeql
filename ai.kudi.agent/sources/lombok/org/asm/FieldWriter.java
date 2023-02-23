package lombok.org.asm;

import a.a.a.i0;
import java.util.concurrent.CancellationException;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import lombok.org.asm.asm.C14255f;
/* loaded from: classes.dex */
public final class FieldWriter extends a.a.a.x<a.a.a.t> {

    /* renamed from: a */
    public final i0<?> f31279a;

    public FieldWriter(Label label, C14269f c14269f) {
        super(label);
        this.f31279a = c14269f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m2376a(Throwable th) {
        i0<?> i0Var = this.f31279a;
        Label $r3 = this.f31409a;
        i0Var.getClass();
        CancellationException $r4 = $r3.getValue();
        int $i0 = i0Var.f31384c;
        boolean $z0 = false;
        boolean $z1 = $i0 == 2;
        if ($z1) {
            InterfaceC11714d interfaceC11714d = i0Var.f31389b;
            boolean $z12 = interfaceC11714d instanceof C14255f;
            InterfaceC11714d $r5 = interfaceC11714d;
            if (!$z12) {
                $r5 = null;
            }
            C14255f $r6 = (C14255f) $r5;
            if ($r6 != null) {
                $z0 = $r6.m2326b($r4);
            }
        }
        if ($z0) {
            return;
        }
        i0Var.m2297a($r4);
        i0Var.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        Throwable $r2 = (Throwable) obj;
        m2376a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
