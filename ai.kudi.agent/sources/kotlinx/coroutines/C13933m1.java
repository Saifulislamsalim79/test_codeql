package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: kotlinx.coroutines.m1 */
/* loaded from: classes3.dex */
final class C13933m1 extends AbstractC13920k {

    /* renamed from: c */
    private final InterfaceC11767l<Throwable, C13666w> f30414c;

    /* JADX WARN: Multi-variable type inference failed */
    public C13933m1(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        this.f30414c = interfaceC11767l;
    }

    @Override // kotlinx.coroutines.AbstractC13925l
    /* renamed from: a */
    public void mo2936a(Throwable th) {
        this.f30414c.invoke(th);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2936a(th);
        return C13666w.f30112a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C14034r0.m3204a(this.f30414c) + '@' + C14034r0.m3203b(this) + ']';
    }
}
