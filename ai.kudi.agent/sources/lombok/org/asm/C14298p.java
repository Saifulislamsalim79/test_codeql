package lombok.org.asm;

import a.a.a.h0;
import a.a.a.t0;
import kotlin.C13666w;
/* renamed from: lombok.org.asm.p */
/* loaded from: classes.dex */
public final class C14298p extends a.a.a.x<h0> implements t0 {

    /* renamed from: d */
    public final InterfaceC14273j f31461d;

    public C14298p(ByteVector byteVector, InterfaceC14273j interfaceC14273j) {
        super(byteVector);
        this.f31461d = interfaceC14273j;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public void m2188a(Throwable th) {
        InterfaceC14273j $r2 = this.f31461d;
        Label $r3 = this.f31409a;
        AbstractElement $r4 = (AbstractElement) $r3;
        $r2.add($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public boolean m2187d(Throwable th) {
        Label $r2 = this.f31409a;
        ByteVector $r3 = (ByteVector) $r2;
        boolean $z0 = $r3.write(th);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        Throwable $r2 = (Throwable) obj;
        m2188a($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }
}
