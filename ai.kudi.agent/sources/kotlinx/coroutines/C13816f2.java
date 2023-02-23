package kotlinx.coroutines;

import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.f2 */
/* loaded from: classes3.dex */
public final class C13816f2 extends AbstractC14069u1 {

    /* renamed from: w */
    private final InterfaceC11714d<C13666w> f30265w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13816f2(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        this.f30265w = interfaceC11714d;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        InterfaceC11714d<C13666w> interfaceC11714d = this.f30265w;
        C13666w c13666w = C13666w.f30112a;
        C13288p.C13289a c13289a = C13288p.f29444c;
        C13288p.m5362a(c13666w);
        interfaceC11714d.resumeWith(c13666w);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
