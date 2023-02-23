package ai.kudi.agent.users.views;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
/* compiled from: CashoutView.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH&¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/users/views/CashoutView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "disableTransferButton", "", "enableTransferButton", "navigateToPerformWithdrawal", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "showAccountName", BanksWithMethods.ACCOUNT_NAME, "", "showAccountNameLoading", "showBankOptions", "showInvalidAccountNoError", "msg", "showInvalidAmountError", "showInvalidBankError", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface CashoutView extends LoginListener {
    void disableTransferButton();

    void enableTransferButton();

    void navigateToPerformWithdrawal(WithdrawToBankRequest withdrawToBankRequest);

    void showAccountName(String str);

    void showAccountNameLoading();

    void showBankOptions();

    void showInvalidAccountNoError(String str);

    void showInvalidAmountError(String str);

    void showInvalidBankError(String str);
}
