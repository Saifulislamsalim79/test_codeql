package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.data.viewdata.SavingTermsAndConditionViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingsTermsAndConditionViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingsTermsAndConditionViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingTermsAndConditionViewData;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "(Lai/kudi/agent/savings/navigator/SavingsNavigator;)V", "initialData", "launchCreateSavingsFragment", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingsTermsAndConditionViewModel extends BaseViewModel<SavingTermsAndConditionViewData> {
    private final SavingsNavigator navigator;

    public SavingsTermsAndConditionViewModel(SavingsNavigator savingsNavigator) {
        Log_OC.getArray(savingsNavigator, "navigator");
        this.navigator = savingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingTermsAndConditionViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingTermsAndConditionViewData initialData() {
        SavingTermsAndConditionViewData $r1 = new SavingTermsAndConditionViewData(false, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void launchCreateSavingsFragment() {
        SavingsNavigator $r1 = this.navigator;
        $r1.navigateToCreateSaving();
    }
}
