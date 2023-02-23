package androidx.lifecycle;

import kotlinx.coroutines.C13867i2;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: ViewModel.kt */
/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes2.dex */
public final class C1552e0 {
    /* renamed from: a */
    public static final InterfaceC13932m0 m35538a(d0 d0Var) {
        kotlin.e0.d.l.f(d0Var, "<this>");
        InterfaceC13932m0 interfaceC13932m0 = (InterfaceC13932m0) d0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC13932m0 != null) {
            return interfaceC13932m0;
        }
        Object tagIfAbsent = d0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C1547c(C13867i2.m3563b(null, 1, null).plus(C14107x0.m2944c().mo2938J0())));
        kotlin.e0.d.l.e(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (InterfaceC13932m0) tagIfAbsent;
    }
}
