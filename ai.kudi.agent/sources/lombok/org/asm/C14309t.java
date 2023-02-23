package lombok.org.asm;
/* renamed from: lombok.org.asm.t */
/* loaded from: classes.dex */
public final class C14309t implements InterfaceC14267e {

    /* renamed from: b */
    public final boolean f31490b;

    public C14309t(boolean z) {
        this.f31490b = z;
    }

    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: a */
    public C14247a mo2173a() {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.InterfaceC14267e
    /* renamed from: b */
    public boolean mo2172b() {
        boolean z0 = this.f31490b;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Empty{");
        boolean $z0 = this.f31490b;
        String $r1 = $z0 ? "Active" : "New";
        $r2.append($r1);
        $r2.append('}');
        String $r12 = $r2.toString();
        return $r12;
    }
}
