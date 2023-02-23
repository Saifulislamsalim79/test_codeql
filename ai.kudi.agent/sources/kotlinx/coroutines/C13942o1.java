package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.o1 */
/* loaded from: classes3.dex */
public final class C13942o1 extends AbstractC14069u1 {

    /* renamed from: w */
    private final InterfaceC11767l<Throwable, C13666w> f30432w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13942o1(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        this.f30432w = interfaceC11767l;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        this.f30432w.invoke(th);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
