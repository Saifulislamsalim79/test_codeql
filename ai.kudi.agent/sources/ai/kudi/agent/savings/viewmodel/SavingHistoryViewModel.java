package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.viewdata.SavingHistoryViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingHistoryViewModel.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/SavingHistoryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingHistoryViewData;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "(Lai/kudi/agent/savings/navigator/SavingsNavigator;)V", "getNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "initialData", "navigateToSavingsDetails", "", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SavingHistoryViewModel extends BaseViewModel<SavingHistoryViewData> {
    private final SavingsNavigator navigator;

    public SavingHistoryViewModel(SavingsNavigator savingsNavigator) {
        Log_OC.getArray(savingsNavigator, "navigator");
        this.navigator = savingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsNavigator getNavigator() {
        SavingsNavigator r1 = this.navigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SavingHistoryViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SavingHistoryViewData initialData() {
        SavingHistoryViewData $r1 = new SavingHistoryViewData(false, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToSavingsDetails(SavingResponse savingResponse) {
        Log_OC.getArray(savingResponse, "savingResponse");
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToSavingsDetail(savingResponse);
    }
}
