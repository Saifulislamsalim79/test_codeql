package ai.kudi.agent.savings.data.worker;

import ai.kudi.agent.savings.data.model.CreateSavingsPinRequest;
import ai.kudi.agent.savings.data.model.RenewSavingRequest;
import ai.kudi.agent.savings.data.model.ResendPinRequest;
import ai.kudi.agent.savings.data.model.ResetSavingPinRequest;
import ai.kudi.agent.savings.data.model.SavingsRequest;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: SavingsApi.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\rH'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u000fH'J$\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J8\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u0007H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007H'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u001aH'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u001eH'J(\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020!H'J$\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J2\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040%2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010'\u001a\u00020#2\b\b\u0001\u0010(\u001a\u00020#H'J<\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040%2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020\u00072\b\b\u0001\u0010'\u001a\u00020#2\b\b\u0001\u0010(\u001a\u00020#H'J(\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020.H'¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/savings/data/api/SavingsApi;", "", "createSavings", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/savings/data/model/SavingResponse;", "sessionId", "", "savingsRequest", "Lai/kudi/agent/savings/data/model/SavingsRequest;", "createSavingsPin", "Lai/kudi/agent/savings/data/model/CreateSavingsPinResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/CreateSavingsPinRequest;", "deactivateSaving", "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "getSavingPlan", "", "getSavingPlanByDate", "from", "to", "getSavingsBalance", "Lai/kudi/agent/savings/data/model/SavingsBalance;", "getSavingsPlanById", "savingPlanId", "renewSavings", "Lai/kudi/agent/savings/data/model/RenewSavingRequest;", "requestSavingPinOtp", "Lai/kudi/agent/savings/data/model/RequestPinResetOtpResponse;", "resendOtp", "Lai/kudi/agent/savings/data/model/ResendPinRequest;", "resetSavingsPin", "Lai/kudi/agent/savings/data/model/ResetSavingPinResponse;", "Lai/kudi/agent/savings/data/model/ResetSavingPinRequest;", "retrieveSavingDuration", "", "retrieveSavingTransactions", "Lio/reactivex/Single;", "Lai/kudi/agent/savings/data/model/SavingTransaction;", "page", "pageSize", "retrieveTransactionByPlanId", "planId", "withdrawSaving", "Lai/kudi/agent/savings/data/model/WithdrawResponse;", "withdrawRequest", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface SavingsApi {
    AbstractC11688p createSavings(String str, SavingsRequest savingsRequest);

    AbstractC11688p createSavingsPin(String str, CreateSavingsPinRequest createSavingsPinRequest);

    AbstractC11688p deactivateSaving(String str, UpdateSavingPlanRequest updateSavingPlanRequest);

    AbstractC11688p getSavingPlan(String str);

    AbstractC11688p getSavingPlanByDate(String str, String str2, String str3);

    AbstractC11688p getSavingsBalance(String str);

    AbstractC11688p getSavingsPlanById(String str, String str2);

    AbstractC11688p renewSavings(String str, RenewSavingRequest renewSavingRequest);

    AbstractC11688p requestSavingPinOtp(String str);

    AbstractC11688p resendOtp(String str, ResendPinRequest resendPinRequest);

    AbstractC11688p resetSavingsPin(String str, ResetSavingPinRequest resetSavingPinRequest);

    AbstractC11688p retrieveSavingDuration(String str);

    AbstractC11696w retrieveSavingTransactions(String str, int i, int i2);

    AbstractC11696w retrieveTransactionByPlanId(String str, String str2, int i, int i2);

    AbstractC11688p withdrawSaving(String str, WithdrawRequest withdrawRequest);
}
