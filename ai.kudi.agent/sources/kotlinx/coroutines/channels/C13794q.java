package kotlinx.coroutines.channels;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.C13917j0;
import kotlinx.coroutines.channels.InterfaceC13801x;
/* compiled from: Produce.kt */
/* renamed from: kotlinx.coroutines.channels.q */
/* loaded from: classes3.dex */
public class C13794q<E> extends C13781g<E> implements InterfaceC13795r<E> {
    public C13794q(InterfaceC11719g interfaceC11719g, InterfaceC13779f<E> interfaceC13779f) {
        super(interfaceC11719g, interfaceC13779f, true, true);
    }

    @Override // kotlinx.coroutines.AbstractC13758c
    /* renamed from: T0 */
    protected void mo3656T0(Throwable th, boolean z) {
        if (m3689X0().mo3641f(th) || z) {
            return;
        }
        C13917j0.m3410a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC13758c
    /* renamed from: Y0 */
    public void mo3655U0(C13666w c13666w) {
        InterfaceC13801x.C13802a.m3638a(m3689X0(), null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC13795r
    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ InterfaceC13801x mo3653f0() {
        m3690W0();
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC13758c, kotlinx.coroutines.C14088v1, kotlinx.coroutines.InterfaceC13947p1
    public boolean isActive() {
        return super.isActive();
    }
}
