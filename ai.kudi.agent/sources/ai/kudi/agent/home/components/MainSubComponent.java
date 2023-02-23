package ai.kudi.agent.home.components;

import ai.kudi.agent.bills.p002ui.HomeFragment;
import ai.kudi.agent.dashboard.mods.DashboardFragment;
import ai.kudi.agent.home.BvnHomeUpdateFragment;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment;
import kotlin.Metadata;
/* compiled from: MainSubComponent.kt */
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0018J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/home/components/MainSubComponent;", "", "inject", "", "fragment", "Lai/kudi/agent/bills/ui/HomeFragment;", "Lai/kudi/agent/dashboard/ui/DashboardFragment;", "Lai/kudi/agent/home/BvnHomeUpdateFragment;", "activity", "Lai/kudi/agent/home/HomeActivity;", "issueHistoryFragment", "Lai/kudi/agent/issues/ui/IssueHistoryFragment;", "issueResolutionHostFragment", "Lai/kudi/agent/issues/ui/IssueResolutionHostFragment;", "issueTypeFragmentNew", "Lai/kudi/agent/issues/ui/IssueTypeFragmentNew;", "Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment;", "incompleteTransactionsFragment", "Lai/kudi/agent/transactionhistory/ui/view/IncompleteTransactionsFragment;", "transactionsContainerFragment", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment;", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsFragment;", "withdrawCashFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/home/WithdrawCashFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface MainSubComponent {

    /* compiled from: MainSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/home/components/MainSubComponent$Factory;", "", "create", "Lai/kudi/agent/home/components/MainSubComponent;", "transactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "issueTypeHomeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "incompleteTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        MainSubComponent create(TransactionsNavigator transactionsNavigator, IssueTypeHomeNavigator issueTypeHomeNavigator, IncompleteTransactionsNavigator incompleteTransactionsNavigator);
    }

    void inject(HomeFragment homeFragment);

    void inject(DashboardFragment dashboardFragment);

    void inject(BvnHomeUpdateFragment bvnHomeUpdateFragment);

    void inject(HomeActivity homeActivity);

    void inject(IssueHistoryFragment issueHistoryFragment);

    void inject(IssueResolutionHostFragment issueResolutionHostFragment);

    void inject(IssueTypeFragmentNew issueTypeFragmentNew);

    void inject(FilterTransactionsFragment filterTransactionsFragment);

    void inject(IncompleteTransactionsFragment incompleteTransactionsFragment);

    void inject(TransactionsContainerFragment transactionsContainerFragment);

    void inject(TransactionsFragment transactionsFragment);

    void inject(WithdrawCashFragment withdrawCashFragment);
}
