package kotlinx.coroutines;

import kotlin.C13666w;
import kotlinx.coroutines.internal.C13897n;
/* compiled from: CancellableContinuation.kt */
/* renamed from: kotlinx.coroutines.d2 */
/* loaded from: classes3.dex */
final class C13808d2 extends AbstractC13852g {

    /* renamed from: c */
    private final C13897n f30259c;

    public C13808d2(C13897n c13897n) {
        this.f30259c = c13897n;
    }

    @Override // kotlinx.coroutines.AbstractC13925l
    /* renamed from: a */
    public void mo2936a(Throwable th) {
        this.f30259c.mo3474w();
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2936a(th);
        return C13666w.f30112a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f30259c + ']';
    }
}
