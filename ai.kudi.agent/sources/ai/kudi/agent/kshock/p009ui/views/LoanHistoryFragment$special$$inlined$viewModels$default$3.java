package ai.kudi.agent.kshock.p009ui.views;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.Lock;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: FragmentViewModelLazy.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¨\u0006\u0004"}, m10421d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "androidx/fragment/app/FragmentViewModelLazyKt$viewModels$3"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$special$$inlined$viewModels$default$3 */
/* loaded from: classes.dex */
public final class LoanHistoryFragment$special$$inlined$viewModels$default$3 extends AbstractC11802m implements InterfaceC11756a<C1556g0.InterfaceC1559b> {
    final /* synthetic */ InterfaceC11756a $ownerProducer;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$special$$inlined$viewModels$default$3(InterfaceC11756a interfaceC11756a, Fragment fragment) {
        super(0);
        this.$ownerProducer = interfaceC11756a;
        this.$this_viewModels = fragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final C1556g0.InterfaceC1559b invoke() {
        InterfaceC11756a $r1 = this.$ownerProducer;
        Object $r2 = $r1.invoke();
        boolean $z0 = $r2 instanceof Lock;
        Lock $r4 = $z0 ? (Lock) $r2 : null;
        C1556g0.InterfaceC1559b $r3 = $r4 != null ? $r4.getDefaultViewModelProviderFactory() : null;
        if ($r3 == null) {
            Fragment $r5 = this.$this_viewModels;
            $r3 = $r5.getDefaultViewModelProviderFactory();
        }
        Log_OC.loadImage($r3, "(ownerProducer() as? Has…tViewModelProviderFactory");
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
