package lombok.org.asm;

import a.a.a.g1;
import java.util.concurrent.CancellationException;
import kotlin.p483e0.p485d.Log_OC;
/* loaded from: classes.dex */
public final class Segment extends CancellationException implements a.a.a.a<g1> {

    /* renamed from: b */
    public final Label f31308b;

    public Segment(String str, Throwable th, Label label) {
        super(str);
        this.f31308b = label;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(java.lang.Object obj) {
        if (obj != this) {
            boolean $z0 = obj instanceof Segment;
            if ($z0) {
                Segment $r2 = (Segment) obj;
                String $r3 = $r2.getMessage();
                String $r4 = getMessage();
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    Label $r5 = $r2.f31308b;
                    Label $r6 = this.f31308b;
                    boolean $z03 = Log_OC.append($r5, $r6);
                    if ($z03) {
                        Throwable $r7 = $r2.getCause();
                        Throwable $r8 = getCause();
                        boolean $z04 = Log_OC.append($r7, $r8);
                        return $z04;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        boolean $z0 = Item.f31287a;
        if ($z0) {
            Throwable $r1 = super.fillInStackTrace();
            return $r1;
        }
        StackTraceElement[] $r2 = new StackTraceElement[0];
        setStackTrace($r2);
        return this;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Throwable getValue() {
        boolean $z0 = Item.f31287a;
        if ($z0) {
            String $r2 = getMessage();
            Log_OC.append($r2);
            Label $r1 = this.f31308b;
            Segment $r3 = new Segment($r2, this, $r1);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = getMessage();
        Log_OC.append($r1);
        int $i0 = $r1.hashCode();
        Label $r2 = this.f31308b;
        int $i1 = $r2.hashCode();
        int $i02 = (($i0 * 31) + $i1) * 31;
        Throwable $r3 = getCause();
        int $i12 = $r3 != null ? $r3.hashCode() : 0;
        return $i02 + $i12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder $r1 = new StringBuilder();
        String $r2 = super.toString();
        $r1.append($r2);
        $r1.append("; job=");
        Label $r3 = this.f31308b;
        $r1.append($r3);
        String $r22 = $r1.toString();
        return $r22;
    }
}
