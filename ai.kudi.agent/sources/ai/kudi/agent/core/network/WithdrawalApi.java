package ai.kudi.agent.core.network;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalTransactonStatusApiCommData;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: WithdrawalApi.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\fH'¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/network/WithdrawalApi;", "", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Response;", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Request;", "generateWithdrawalCode", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Response;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalWithdrawalCodeGenerationApiCommData$Request;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface WithdrawalApi {
    AbstractC11688p checkStatus(String str, UssdWithdrawalTransactonStatusApiCommData.Request request);

    AbstractC11688p generateWithdrawalCode(String str, UssdWithdrawalWithdrawalCodeGenerationApiCommData.Request request);
}
