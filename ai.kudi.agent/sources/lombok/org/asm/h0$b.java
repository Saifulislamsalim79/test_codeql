package lombok.org.asm;

import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public final class h0$b implements InterfaceC14267e {

    /* renamed from: a */
    public volatile java.lang.Object f31401a;

    /* renamed from: c */
    public final C14247a f31402c;

    /* renamed from: d */
    public volatile int f31403d;

    /* renamed from: k */
    public volatile java.lang.Object f31404k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public h0$b(C14247a c14247a, boolean z, Throwable th) {
        this.f31402c = c14247a;
        int i0 = z ? 1 : 0;
        this.f31403d = i0;
        this.f31401a = th;
        this.f31404k = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: a */
    public C14247a mo2173a() {
        C14247a r1 = this.f31402c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2271a(Throwable th) {
        Throwable $r3 = (Throwable) this.f31401a;
        if ($r3 == null) {
            this.f31401a = th;
        } else if (th == $r3) {
        } else {
            java.lang.Object $r2 = this.f31404k;
            if ($r2 == null) {
                this.f31404k = th;
                return;
            }
            boolean $z0 = $r2 instanceof Throwable;
            if ($z0) {
                if (th == $r2) {
                    return;
                }
                ArrayList $r4 = getText();
                $r4.add($r2);
                $r4.add(th);
                this.f31404k = $r4;
                return;
            }
            boolean $z02 = $r2 instanceof ArrayList;
            if ($z02) {
                ((ArrayList) $r2).add(th);
                return;
            }
            String $r6 = "State is " + $r2;
            IllegalStateException $r7 = new IllegalStateException($r6.toString());
            throw $r7;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: b */
    public boolean mo2172b() {
        java.lang.Object $r1 = this.f31401a;
        Throwable $r2 = (Throwable) $r1;
        return $r2 == null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final boolean m2270c() {
        java.lang.Object $r2 = this.f31404k;
        Paint $r1 = Plot.f31305k;
        return $r2 == $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: d */
    public final boolean m2269d() {
        return this.f31403d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final boolean m2268e() {
        java.lang.Object $r1 = this.f31401a;
        Throwable $r2 = (Throwable) $r1;
        return $r2 != null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List get(Throwable th) {
        ArrayList $r3;
        java.lang.Object $r2 = this.f31404k;
        if ($r2 == null) {
            $r3 = getText();
        } else {
            boolean $z0 = $r2 instanceof Throwable;
            if ($z0) {
                $r3 = getText();
                $r3.add($r2);
            } else {
                boolean $z02 = $r2 instanceof ArrayList;
                if (!$z02) {
                    String $r7 = "State is " + $r2;
                    IllegalStateException $r8 = new IllegalStateException($r7.toString());
                    throw $r8;
                }
                $r3 = (ArrayList) $r2;
            }
        }
        Throwable $r4 = (Throwable) this.f31401a;
        if ($r4 != null) {
            $r3.add(0, $r4);
        }
        if (th != null) {
            boolean $z03 = Log_OC.append(th, $r4);
            if (!$z03) {
                $r3.add(th);
            }
        }
        Paint $r5 = Plot.f31305k;
        this.f31404k = $r5;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList getText() {
        ArrayList $r1 = new ArrayList(4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("Finishing[cancelling=");
        boolean $z0 = m2268e();
        $r1.append($z0);
        $r1.append(", completing=");
        boolean $z02 = m2269d();
        $r1.append($z02);
        $r1.append(", rootCause=");
        java.lang.Object $r2 = this.f31401a;
        Throwable $r3 = (Throwable) $r2;
        $r1.append($r3);
        $r1.append(", exceptions=");
        java.lang.Object $r22 = this.f31404k;
        $r1.append($r22);
        $r1.append(", list=");
        C14247a $r4 = this.f31402c;
        $r1.append($r4);
        $r1.append(']');
        String $r5 = $r1.toString();
        return $r5;
    }
}
