package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1556g0;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: FragmentViewModelLazy.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¨\u0006\u0004"}, m10421d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$special$$inlined$activityViewModels$default$2 */
/* loaded from: classes.dex */
public final class C0710x7b16f547 extends AbstractC11802m implements InterfaceC11756a<C1556g0.InterfaceC1559b> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0710x7b16f547(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final C1556g0.InterfaceC1559b invoke() {
        Fragment $r1 = this.$this_activityViewModels;
        FragmentActivity $r2 = $r1.requireActivity();
        C1556g0.InterfaceC1559b $r3 = $r2.getDefaultViewModelProviderFactory();
        Log_OC.loadImage($r3, "requireActivity().defaultViewModelProviderFactory");
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C1556g0.InterfaceC1559b invoke() {
        C1556g0.InterfaceC1559b $r1 = invoke();
        return $r1;
    }
}
