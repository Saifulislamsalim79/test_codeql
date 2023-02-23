package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11719g;
/* compiled from: Unconfined.kt */
/* renamed from: kotlinx.coroutines.l2 */
/* loaded from: classes3.dex */
public final class C13929l2 extends AbstractC13857h0 {

    /* renamed from: d */
    public static final C13929l2 f30413d = new C13929l2();

    private C13929l2() {
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: H0 */
    public boolean mo3399H0(InterfaceC11719g interfaceC11719g) {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        C13943o2 c13943o2 = (C13943o2) interfaceC11719g.get(C13943o2.f30433d);
        if (c13943o2 != null) {
            c13943o2.f30434c = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
