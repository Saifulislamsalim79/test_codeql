package kotlinx.coroutines;

import kotlin.C13666w;
/* compiled from: CancellableContinuation.kt */
/* renamed from: kotlinx.coroutines.z0 */
/* loaded from: classes3.dex */
final class C14113z0 extends AbstractC13920k {

    /* renamed from: c */
    private final InterfaceC14110y0 f30766c;

    public C14113z0(InterfaceC14110y0 interfaceC14110y0) {
        this.f30766c = interfaceC14110y0;
    }

    @Override // kotlinx.coroutines.AbstractC13925l
    /* renamed from: a */
    public void mo2936a(Throwable th) {
        this.f30766c.mo2939i();
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2936a(th);
        return C13666w.f30112a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f30766c + ']';
    }
}
