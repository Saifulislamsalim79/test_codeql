package ai.kudi.agent.savings.navigator;

import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SavingsNavigator.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&¨\u0006$"}, m10421d2 = {"Lai/kudi/agent/savings/navigator/SavingsNavigator;", "", "displayProgressBar", "", "visibility", "", "navigateToConfirmOtpFragment", "mobile", "", "pin", "model", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "navigateToCreateSaving", "navigateToCreateSavingsPinFragment", "deactivatePlanRequest", "withdrawRequest", "navigateToSavings", "navigateToSavingsDetail", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "navigateToSavingsHistory", "", "navigateToSavingsPlan", "navigateToSavingsReview", "savingsModel", "navigateToSavingsSuccess", "navigateToTermsAndCondition", "navigateToWithdraw", "balance", "", "id", "showSavingsDeactivatedDialog", "showWithdrawSuccessDialog", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SavingsNavigator {
    void displayProgressBar(boolean z);

    void navigateToConfirmOtpFragment(String str, String str2, CreateSavingsModel createSavingsModel);

    void navigateToConfirmOtpFragment(String str, String str2, UpdateSavingPlanRequest updateSavingPlanRequest);

    void navigateToConfirmOtpFragment(String str, String str2, WithdrawRequest withdrawRequest);

    void navigateToCreateSaving();

    void navigateToCreateSavingsPinFragment(CreateSavingsModel createSavingsModel);

    void navigateToCreateSavingsPinFragment(UpdateSavingPlanRequest updateSavingPlanRequest);

    void navigateToCreateSavingsPinFragment(WithdrawRequest withdrawRequest);

    void navigateToSavings();

    void navigateToSavingsDetail(SavingResponse savingResponse);

    void navigateToSavingsHistory(List list);

    void navigateToSavingsPlan();

    void navigateToSavingsReview(CreateSavingsModel createSavingsModel);

    void navigateToSavingsSuccess();

    void navigateToTermsAndCondition();

    void navigateToWithdraw(int i, String str, SavingResponse savingResponse);

    void showSavingsDeactivatedDialog();

    void showWithdrawSuccessDialog();
}
