package ai.kudi.agent.savings.viewmodel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.savings.data.viewdata.GetStartedViewData;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: GetStartedViewModel.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/savings/viewmodel/GetStartedViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/savings/data/viewdata/GetStartedViewData;", "navigator", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/savings/navigator/SavingsNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getNavigator", "()Lai/kudi/agent/savings/navigator/SavingsNavigator;", "initialData", "navigateToTermsAdCondition", "", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetStartedViewModel extends BaseViewModel<GetStartedViewData> {
    private final Analytics analytics;
    private final SavingsNavigator navigator;

    public GetStartedViewModel(SavingsNavigator savingsNavigator, Analytics analytics) {
        Log_OC.getArray(savingsNavigator, "navigator");
        Log_OC.getArray(analytics, "analytics");
        this.navigator = savingsNavigator;
        this.analytics = analytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
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
        GetStartedViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public GetStartedViewData initialData() {
        GetStartedViewData $r1 = new GetStartedViewData(false, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToTermsAdCondition() {
        Analytics $r1 = this.analytics;
        $r1.onTermsAndConditionAccepted();
        SavingsNavigator $r2 = this.navigator;
        $r2.navigateToTermsAndCondition();
    }
}
