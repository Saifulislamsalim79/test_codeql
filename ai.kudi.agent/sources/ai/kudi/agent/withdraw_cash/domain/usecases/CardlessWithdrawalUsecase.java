package ai.kudi.agent.withdraw_cash.domain.usecases;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.withdraw_cash.domain.repositories.CardlessWithdrawalRepository;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: CardlessWithdrawalUsecase.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\t\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/domain/usecases/CardlessWithdrawalUsecase;", "", "repository", "Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "(Lai/kudi/agent/withdraw_cash/domain/repositories/CardlessWithdrawalRepository;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;)V", "doWithdrawal", "Lio/reactivex/Observable;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "fetchServiceCharge", "Lai/kudi/agent/bills/domain/usecases/FeesLookupResponse;", "Lai/kudi/agent/bills/domain/usecases/FeesLookupRequest;", "validateVoucher", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Response;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CardlessWithdrawalUsecase {
    private final PerformServiceFeeLookup feeLookup;
    private final CardlessWithdrawalRepository repository;

    public CardlessWithdrawalUsecase(CardlessWithdrawalRepository cardlessWithdrawalRepository, PerformServiceFeeLookup performServiceFeeLookup) {
        Log_OC.getArray(cardlessWithdrawalRepository, "repository");
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        this.repository = cardlessWithdrawalRepository;
        this.feeLookup = performServiceFeeLookup;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p doWithdrawal(CardlessWithdrawalApiCommData.Request request) {
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        CardlessWithdrawalRepository $r3 = this.repository;
        AbstractC11688p $r1 = $r3.doWithdrawal(request);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p fetchServiceCharge(FeesLookupRequest feesLookupRequest) {
        Log_OC.getArray(feesLookupRequest, TransactionRequest.TYPE_REQUEST);
        PerformServiceFeeLookup $r3 = this.feeLookup;
        AbstractC11688p $r1 = $r3.execute(feesLookupRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p validateVoucher(CardlessWithdrawalApiCommData.Request request) {
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        CardlessWithdrawalRepository $r3 = this.repository;
        AbstractC11688p $r1 = $r3.validateVoucherCode(request);
        return $r1;
    }
}
