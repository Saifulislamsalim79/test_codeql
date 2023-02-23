package lombok.org.asm;

import kotlin.p476c0.InterfaceC11719g;
/* loaded from: classes.dex */
public final class FlurryAdSize extends AbstractC14272i {
    public static final FlurryAdSize BANNER_TOP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FlurryAdSize $r0 = new FlurryAdSize();
        BANNER_TOP = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public void mo2139a(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        y1$a $r4 = SizeLayoutType.f31309a;
        InterfaceC11719g.InterfaceC11722b $r1 = interfaceC11719g.get($r4);
        SizeLayoutType $r5 = (SizeLayoutType) $r1;
        if ($r5 != null) {
            return;
        }
        UnsupportedOperationException $r6 = new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        throw $r6;
    }

    @Override // lombok.org.asm.AbstractC14272i
    /* renamed from: a */
    public boolean mo2264a(InterfaceC11719g interfaceC11719g) {
        return false;
    }

    @Override // lombok.org.asm.AbstractC14272i
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
