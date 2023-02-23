package lombok.org.asm.menu;
/* renamed from: lombok.org.asm.menu.x */
/* loaded from: classes.dex */
public final class C14295x {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static final InterfaceC14282e m2196a(int i) {
        if (i == -2) {
            Vector3 $r3 = InterfaceC14288l.f31451a;
            $r3.getClass();
            int $i0 = Vector3.f31424y;
            C14281d $r0 = new C14281d($i0);
            return $r0;
        } else if (i == -1) {
            C14285g $r2 = new C14285g();
            return $r2;
        } else if (i == 0) {
            IllegalArgumentException $r1 = new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
            throw $r1;
        } else if (i != Integer.MAX_VALUE) {
            C14281d $r02 = new C14281d(i);
            return $r02;
        } else {
            IllegalArgumentException $r12 = new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
            throw $r12;
        }
    }
}
