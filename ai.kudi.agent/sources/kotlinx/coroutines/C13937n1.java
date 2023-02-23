package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.n1 */
/* loaded from: classes3.dex */
final class C13937n1 extends AbstractC13953q1 {

    /* renamed from: x */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f30422x = AtomicIntegerFieldUpdater.newUpdater(C13937n1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: w */
    private final InterfaceC11767l<Throwable, C13666w> f30423w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13937n1(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l) {
        this.f30423w = interfaceC11767l;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        if (f30422x.compareAndSet(this, 0, 1)) {
            this.f30423w.invoke(th);
        }
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
