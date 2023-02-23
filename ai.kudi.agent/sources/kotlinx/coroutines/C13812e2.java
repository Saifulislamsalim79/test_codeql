package kotlinx.coroutines;

import kotlin.C13288p;
import kotlin.C13291q;
import kotlin.C13666w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* renamed from: kotlinx.coroutines.e2 */
/* loaded from: classes3.dex */
public final class C13812e2<T> extends AbstractC14069u1 {

    /* renamed from: w */
    private final C13935n<T> f30261w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13812e2(C13935n<? super T> c13935n) {
        this.f30261w = c13935n;
    }

    @Override // kotlinx.coroutines.AbstractC13806d0
    /* renamed from: B */
    public void mo2993B(Throwable th) {
        Object m3028U = m3138C().m3028U();
        if (C13952q0.m3345a() && !(!(m3028U instanceof InterfaceC13923k1))) {
            throw new AssertionError();
        }
        if (m3028U instanceof C13755b0) {
            C13935n<T> c13935n = this.f30261w;
            Throwable th2 = ((C13755b0) m3028U).f30198a;
            C13288p.C13289a c13289a = C13288p.f29444c;
            Object m5358a = C13291q.m5358a(th2);
            C13288p.m5362a(m5358a);
            c13935n.resumeWith(m5358a);
            return;
        }
        C13935n<T> c13935n2 = this.f30261w;
        Object m2950h = C14105w1.m2950h(m3028U);
        C13288p.C13289a c13289a2 = C13288p.f29444c;
        C13288p.m5362a(m2950h);
        c13935n2.resumeWith(m2950h);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        mo2993B(th);
        return C13666w.f30112a;
    }
}
