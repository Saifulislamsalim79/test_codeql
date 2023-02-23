package androidx.fragment.app;

import androidx.lifecycle.C1554f0;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.InterfaceC11863b;
/* compiled from: FragmentViewModelLazy.kt */
/* renamed from: androidx.fragment.app.g0 */
/* loaded from: classes2.dex */
public final class C1483g0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: androidx.fragment.app.g0$a */
    /* loaded from: classes2.dex */
    public static final class C1484a extends AbstractC11802m implements InterfaceC11756a<C1556g0.InterfaceC1559b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f4569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1484a(Fragment fragment) {
            super(0);
            this.f4569c = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public final C1556g0.InterfaceC1559b invoke() {
            C1556g0.InterfaceC1559b defaultViewModelProviderFactory = this.f4569c.getDefaultViewModelProviderFactory();
            kotlin.e0.d.l.e(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: a */
    public static final <VM extends androidx.lifecycle.d0> InterfaceC11824h<VM> m35752a(Fragment fragment, InterfaceC11863b<VM> interfaceC11863b, InterfaceC11756a<? extends C1566i0> interfaceC11756a, InterfaceC11756a<? extends C1556g0.InterfaceC1559b> interfaceC11756a2) {
        kotlin.e0.d.l.f(fragment, "<this>");
        kotlin.e0.d.l.f(interfaceC11863b, "viewModelClass");
        kotlin.e0.d.l.f(interfaceC11756a, "storeProducer");
        if (interfaceC11756a2 == null) {
            interfaceC11756a2 = new C1484a(fragment);
        }
        return new C1554f0(interfaceC11863b, interfaceC11756a, interfaceC11756a2);
    }
}
