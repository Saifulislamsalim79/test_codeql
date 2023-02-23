package lombok.org.asm.menu;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.p483e0.p484c.InterfaceC11767l;
import lombok.org.asm.asm.Paint;
/* loaded from: classes.dex */
public class MethodWriter<E> extends a.a.a.a2.a<E> {

    /* renamed from: c */
    public java.lang.Object f31420c;

    /* renamed from: w */
    public final ReentrantLock f31421w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MethodWriter(InterfaceC11767l interfaceC11767l) {
        super(null);
        ReentrantLock $r2 = new ReentrantLock();
        this.f31421w = $r2;
        Paint $r3 = ClassWriter.f31411c;
        this.f31420c = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public java.lang.Object m2252a() {
        ReentrantLock $r1 = this.f31421w;
        $r1.lock();
        try {
            java.lang.Object $r4 = this.f31420c;
            Paint $r2 = ClassWriter.f31411c;
            if ($r4 != $r2) {
                this.f31420c = $r2;
                return $r4;
            }
            C14289m $r3 = m2226i();
            java.lang.Object $r42 = $r3;
            if ($r3 == null) {
                $r42 = ClassWriter.f31413k;
            }
            return $r42;
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public boolean m2251a(AbstractC14291o abstractC14291o) {
        ReentrantLock $r1 = this.f31421w;
        $r1.lock();
        try {
            boolean $z0 = super.m2212a(abstractC14291o);
            return $z0;
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final boolean m2250c() {
        java.lang.Object $r2 = this.f31420c;
        Paint $r1 = ClassWriter.f31411c;
        return $r2 == $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public String m2249e() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("(value=");
        java.lang.Object $r3 = this.f31420c;
        $r2.append($r3);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }

    public final boolean isEnabled() {
        return false;
    }
}
