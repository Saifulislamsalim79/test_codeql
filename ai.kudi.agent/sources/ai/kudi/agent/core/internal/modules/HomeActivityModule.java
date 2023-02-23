package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.bills.p002ui.HomeFragment;
import ai.kudi.agent.dashboard.mods.DashboardFragment;
import ai.kudi.agent.home.BvnHomeUpdateFragment;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment;
import ai.kudi.agent.transactionhistory.navigator.DefaultTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.FilterTransactionsFragment;
import ai.kudi.agent.transactionhistory.p031ui.view.TransactionsContainerFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.home.WithdrawCashFragment;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: HomeActivityModule.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0018H'¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/HomeActivityModule;", "", "()V", "bindsIncompleteTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "homeActivity", "Lai/kudi/agent/home/HomeActivity;", "bindsIssueTypeHomeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "injectBvnVerificationFragment", "Lai/kudi/agent/home/BvnHomeUpdateFragment;", "injectDashboardFragment", "Lai/kudi/agent/dashboard/ui/DashboardFragment;", "injectFilterTransactionsFragment", "Lai/kudi/agent/transactionhistory/ui/view/FilterTransactionsFragment;", "injectHomeFragment", "Lai/kudi/agent/bills/ui/HomeFragment;", "injectIssueHistoryFragment", "Lai/kudi/agent/issues/ui/IssueHistoryFragment;", "injectIssueResolutionHostFragment", "Lai/kudi/agent/issues/ui/IssueResolutionHostFragment;", "injectTransactionsContainerFragment", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment;", "injectWithdrawCashFragment", "Lai/kudi/agent/withdraw_cash/ui/fragments/home/WithdrawCashFragment;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class HomeActivityModule {
    public static final Companion Companion;

    /* compiled from: HomeActivityModule.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/HomeActivityModule$Companion;", "", "()V", "providesTransactionsNavigator", "Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "homeActivity", "Lai/kudi/agent/home/HomeActivity;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionsNavigator providesTransactionsNavigator(HomeActivity homeActivity) {
            Log_OC.getArray(homeActivity, "homeActivity");
            Activity r4 = (Activity) homeActivity;
            DefaultTransactionsNavigator r3 = new DefaultTransactionsNavigator(r4);
            return r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public abstract IncompleteTransactionsNavigator bindsIncompleteTransactionsNavigator(HomeActivity homeActivity);

    public abstract IssueTypeHomeNavigator bindsIssueTypeHomeNavigator(HomeActivity homeActivity);

    public abstract BvnHomeUpdateFragment injectBvnVerificationFragment();

    public abstract DashboardFragment injectDashboardFragment();

    public abstract FilterTransactionsFragment injectFilterTransactionsFragment();

    public abstract HomeFragment injectHomeFragment();

    public abstract IssueHistoryFragment injectIssueHistoryFragment();

    public abstract IssueResolutionHostFragment injectIssueResolutionHostFragment();

    public abstract TransactionsContainerFragment injectTransactionsContainerFragment();

    public abstract WithdrawCashFragment injectWithdrawCashFragment();
}
