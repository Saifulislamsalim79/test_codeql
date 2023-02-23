package ai.kudi.agent.withdraw_cash.domain.usecases;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdraw_cash.domain.repositories.UssdWithdrawalRepository;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalTransactonStatusApiCommData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: CheckUssdWithdrawalTransactionStatus.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/usecases/CheckUssdWithdrawalTransactionStatus;", "", "repository", "Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository;", "(Lai/kudi/agent/withdraw_cash/domain/repositories/UssdWithdrawalRepository;)V", "checkStatus", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Response;", "sessionId", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/UssdWithdrawalTransactonStatusApiCommData$Request;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CheckUssdWithdrawalTransactionStatus {
    private final UssdWithdrawalRepository repository;

    public CheckUssdWithdrawalTransactionStatus(UssdWithdrawalRepository ussdWithdrawalRepository) {
        Log_OC.getArray(ussdWithdrawalRepository, "repository");
        this.repository = ussdWithdrawalRepository;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p checkStatus(String str, UssdWithdrawalTransactonStatusApiCommData.Request request) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        UssdWithdrawalRepository $r4 = this.repository;
        AbstractC11688p $r2 = $r4.checkStatus(str, request);
        return $r2;
    }
}
