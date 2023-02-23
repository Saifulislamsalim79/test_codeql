package lombok.org.asm;
/* renamed from: lombok.org.asm.q */
/* loaded from: classes.dex */
public final class C14299q implements InterfaceC14267e {

    /* renamed from: b */
    public final C14247a f31462b;

    public C14299q(C14247a c14247a) {
        this.f31462b = c14247a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: a */
    public C14247a mo2173a() {
        C14247a r1 = this.f31462b;
        return r1;
    }

    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: b */
    public boolean mo2172b() {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        boolean $z0 = Item.f31287a;
        if (!$z0) {
            String $r2 = super.toString();
            return $r2;
        }
        C14247a $r1 = this.f31462b;
        String $r22 = $r1.build("New");
        return $r22;
    }
}
