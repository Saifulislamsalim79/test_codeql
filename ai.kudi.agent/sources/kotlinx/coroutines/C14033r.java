package kotlinx.coroutines;

import kotlin.C13666w;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.r */
/* loaded from: classes3.dex */
public final class C14033r extends AbstractC13953q1 {

    /* renamed from: w */
    public final C13935n<?> f30616w;

    public C14033r(C13935n<?> c13935n) {
        this.f30616w = c13935n;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        C13935n<?> c13935n = this.f30616w;
        c13935n.m3387I(c13935n.mo2994x(m3138C()));
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
