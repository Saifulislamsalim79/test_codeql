package ai.kudi.agent.dashboard.view;

import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: DashboardView.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0019H&J\b\u0010\u001c\u001a\u00020\u0003H&¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/dashboard/view/DashboardView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "displayFundWalletInfo", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "displayTotalAmountProcessed", TransactionField.AMOUNT, "", "displayTotalCountProcessed", "totalCount", "", "hideProgress", "navigateToFundWalletPage", "navigateToHelpPage", "navigateToTransactionBreakDownPage", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showFilterDialog", "showProgress", "toggleFundWalletView", "isWalletLow", "", "toggleUpdateAppView", "shouldUpdate", "updateApp", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface DashboardView extends LoginListener {
    void displayFundWalletInfo(User user);

    void displayTotalAmountProcessed(double d);

    void displayTotalCountProcessed(int i);

    void hideProgress();

    void navigateToFundWalletPage();

    void navigateToHelpPage();

    void navigateToTransactionBreakDownPage(FilteredDate filteredDate);

    void showError(String str);

    void showFilterDialog();

    void showProgress();

    void toggleFundWalletView(boolean z);

    void toggleUpdateAppView(boolean z);

    void updateApp();
}
