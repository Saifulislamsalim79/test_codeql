package androidx.lifecycle;

import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C14107x0;
/* compiled from: PausingDispatcher.kt */
/* renamed from: androidx.lifecycle.x */
/* loaded from: classes2.dex */
public final class C1585x extends AbstractC13857h0 {

    /* renamed from: d */
    public final C1549d f4792d = new C1549d();

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: H0 */
    public boolean mo3399H0(InterfaceC11719g interfaceC11719g) {
        kotlin.e0.d.l.f(interfaceC11719g, "context");
        if (C14107x0.m2944c().mo2938J0().mo3399H0(interfaceC11719g)) {
            return true;
        }
        return !this.f4792d.m35545b();
    }

    @Override // kotlinx.coroutines.AbstractC13857h0
    /* renamed from: o0 */
    public void mo3067o0(InterfaceC11719g interfaceC11719g, Runnable runnable) {
        kotlin.e0.d.l.f(interfaceC11719g, "context");
        kotlin.e0.d.l.f(runnable, "block");
        this.f4792d.m35544c(interfaceC11719g, runnable);
    }
}
