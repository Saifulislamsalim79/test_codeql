package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1556g0;
/* compiled from: ViewModelProviders.java */
@Deprecated
/* renamed from: androidx.lifecycle.h0 */
/* loaded from: classes2.dex */
public class C1564h0 {
    @Deprecated
    /* renamed from: a */
    public static C1556g0 m35520a(Fragment fragment, C1556g0.InterfaceC1559b interfaceC1559b) {
        if (interfaceC1559b == null) {
            interfaceC1559b = fragment.getDefaultViewModelProviderFactory();
        }
        return new C1556g0(fragment.getViewModelStore(), interfaceC1559b);
    }

    @Deprecated
    /* renamed from: b */
    public static C1556g0 m35519b(androidx.fragment.app.i iVar) {
        return new C1556g0(iVar);
    }

    @Deprecated
    /* renamed from: c */
    public static C1556g0 m35518c(androidx.fragment.app.i iVar, C1556g0.InterfaceC1559b interfaceC1559b) {
        if (interfaceC1559b == null) {
            interfaceC1559b = iVar.getDefaultViewModelProviderFactory();
        }
        return new C1556g0(iVar.getViewModelStore(), interfaceC1559b);
    }
}
