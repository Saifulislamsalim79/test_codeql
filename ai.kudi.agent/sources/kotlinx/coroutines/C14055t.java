package kotlinx.coroutines;

import kotlin.C13666w;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.t */
/* loaded from: classes3.dex */
public final class C14055t extends AbstractC13953q1 implements InterfaceC14038s {

    /* renamed from: w */
    public final InterfaceC14067u f30657w;

    public C14055t(InterfaceC14067u interfaceC14067u) {
        this.f30657w = interfaceC14067u;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        this.f30657w.mo3022b0(m3138C());
    }

    @Override // kotlinx.coroutines.InterfaceC14038s
    /* renamed from: b */
    public boolean mo3162b(Throwable th) {
        return m3138C().mo3054D(th);
    }

    @Override // kotlinx.coroutines.InterfaceC14038s
    public InterfaceC13947p1 getParent() {
        return m3138C();
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
