package lombok.org.libs.org.objectweb.asm;
/* loaded from: classes.dex */
public final class Item implements Runnable {

    /* renamed from: i */
    public final /* synthetic */ lombok.org.libs.org.objectweb.asm.asm.asm.Item f31562i;

    /* renamed from: j */
    public final /* synthetic */ Attribute f31563j;

    /* renamed from: k */
    public final /* synthetic */ Label f31564k;

    public Item(Attribute attribute, lombok.org.libs.org.objectweb.asm.asm.asm.Item item, Label label) {
        this.f31563j = attribute;
        this.f31562i = item;
        this.f31564k = label;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // java.lang.Runnable
    public final void run() {
        Attribute $r1 = this.f31563j;
        lombok.org.libs.org.objectweb.asm.asm.asm.Item $r2 = this.f31562i;
        Label $r3 = this.f31564k;
        $r1.m2132a($r2, $r3);
    }
}
