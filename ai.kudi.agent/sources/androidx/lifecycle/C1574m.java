package androidx.lifecycle;

import kotlinx.coroutines.C13867i2;
import kotlinx.coroutines.C14107x0;
/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes2.dex */
public final class C1574m {
    /* renamed from: a */
    public static final AbstractC1567j m35508a(AbstractC1565i abstractC1565i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        kotlin.e0.d.l.f(abstractC1565i, "$this$coroutineScope");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC1565i.f4773a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC1565i, C13867i2.m3563b(null, 1, null).plus(C14107x0.m2944c().mo2938J0()));
        } while (!abstractC1565i.f4773a.compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m35580d();
        return lifecycleCoroutineScopeImpl;
    }
}
