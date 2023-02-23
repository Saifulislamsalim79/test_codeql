package ai.kudi.agent.withdrawal.view;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: OthersWithdrawView.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/withdrawal/view/OthersWithdrawView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "openPerformWithdrawal", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "showFeeLoadingFailed", MetricTracker.Object.MESSAGE, "", "showInvalidAmount", "showInvalidPhoneNumber", "showServiceFee", "fee", "toggleServiceFeeLoading", "visible", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface OthersWithdrawView extends LoginListener {
    void openPerformWithdrawal(WithdrawalRequest withdrawalRequest);

    void showFeeLoadingFailed(String str);

    void showInvalidAmount(String str);

    void showInvalidPhoneNumber(String str);

    void showServiceFee(String str);

    void toggleServiceFeeLoading(boolean z);
}
