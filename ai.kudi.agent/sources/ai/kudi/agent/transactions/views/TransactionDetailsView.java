package ai.kudi.agent.transactions.views;

import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import ai.kudi.agent.users.domain.package_1.User;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: TransactionDetailsView.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J(\u0010\u001b\u001a\u00020\u00032\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/transactions/views/TransactionDetailsView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "currentUserFetched", "", "user", "Lai/kudi/agent/users/domain/dto/User;", "hideAddCustomerButton", "hideLoading", "onChargeBackCategoryFetched", "categoryData", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "onTerminalConnectionComplete", "response", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "transaction", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "showAddCustomerButton", "showError", MetricTracker.Object.MESSAGE, "showLoading", "showLogin", "showTerminalConnectionError", "showTerminalConnectionLoading", "isLoading", "", "showTransaction", "toggleRaiseChargeBackLoading", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionDetailsView extends LoginListener {
    void currentUserFetched(User user);

    void hideAddCustomerButton();

    void hideLoading();

    void onChargeBackCategoryFetched(CategoryData categoryData);

    void onTerminalConnectionComplete(TerminalConnectionResponse terminalConnectionResponse, HashMap hashMap);

    void showAddCustomerButton();

    void showError(String str);

    void showLoading();

    void showLogin();

    void showTerminalConnectionError();

    void showTerminalConnectionLoading(boolean z);

    void showTransaction(HashMap hashMap, User user);

    void toggleRaiseChargeBackLoading(boolean z);
}
