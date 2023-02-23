package ai.kudi.agent.kshock.data.domain.attention;

import ai.kudi.agent.kshock.data.model.LoanRequest;
import ai.kudi.agent.kshock.data.model.OtpStatusRequest;
import ai.kudi.agent.kshock.data.model.VerifyOtpRequest;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
/* compiled from: KshockApi.kt */
@Metadata(m10422d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J$\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006H'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u0006H'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u0006H'J,\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u0006H'J,\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010)\u001a\u00020\u00152\b\b\u0001\u0010*\u001a\u00020\u0006H'J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020.H'J\"\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u000201H'J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u000204H'¨\u00065"}, m10421d2 = {"Lai/kudi/agent/kshock/data/domain/api/KshockApi;", "", "cancelLoanRequest", "Lio/reactivex/Observable;", "Lai/kudi/agent/kshock/data/model/CancelLoanResponse;", "sessionId", "", "loanRequestId", "fetchExistingLoanerDetails", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/kshock/data/model/ExistingLoanerResponse;", "fetchKShockEligibility", "Lai/kudi/agent/kshock/data/model/KshockEligibility;", "fetchLoanHistory", "Lio/reactivex/Single;", "Lai/kudi/agent/kshock/data/model/LoanHistoryResponse;", "query", "", "fetchLoanInterest", "Lai/kudi/agent/kshock/data/model/InterestResponse;", "computeInterestRequest", "Lai/kudi/agent/kshock/data/model/LoanRequest;", "fetchLoanProviderStatus", "Lai/kudi/agent/kshock/data/model/LoanProviderResponse;", "fetchNewKShockEligibility", "", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "fetchOverdueLoanHistory", PhoneFragment.ARG_BVN, "fetchPendingLoan", "Lai/kudi/agent/kshock/data/model/PendingLoan;", "getWalletByPhoneNumber", "Lai/kudi/agent/kshock/data/model/Wallet;", "phoneNumber", "paybackLoanManually", "Lai/kudi/agent/kshock/data/model/PaybackLoanResponse;", "loanId", "paybackOverdueLoan", "userId", "performLoanRequest", "Lai/kudi/agent/kshock/data/model/LoanResponse;", "loanRequest", "deviceId", "postTransaction", "Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "retrieveOtpStatus", "Lai/kudi/agent/kshock/data/model/OtpStatusResponse;", "Lai/kudi/agent/kshock/data/model/OtpStatusRequest;", "verifyOtp", "Lai/kudi/agent/kshock/data/model/VerifyOtpResponse;", "Lai/kudi/agent/kshock/data/model/VerifyOtpRequest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface KshockApi {
    AbstractC11688p cancelLoanRequest(String str, String str2);

    AbstractC11688p fetchExistingLoanerDetails(String str);

    AbstractC11688p fetchKShockEligibility(String str);

    AbstractC11696w fetchLoanHistory(String str, Map map);

    AbstractC11688p fetchLoanInterest(String str, LoanRequest loanRequest);

    AbstractC11688p fetchLoanProviderStatus(String str);

    AbstractC11688p fetchNewKShockEligibility(String str);

    AbstractC11688p fetchOverdueLoanHistory(String str, String str2);

    AbstractC11688p fetchPendingLoan(String str);

    AbstractC11688p getWalletByPhoneNumber(String str, String str2);

    AbstractC11688p paybackLoanManually(String str, String str2);

    AbstractC11688p paybackOverdueLoan(String str, String str2, String str3);

    AbstractC11688p performLoanRequest(String str, LoanRequest loanRequest, String str2);

    AbstractC11688p postTransaction(String str, TransactionRequest transactionRequest);

    AbstractC11688p retrieveOtpStatus(String str, OtpStatusRequest otpStatusRequest);

    AbstractC11688p verifyOtp(String str, VerifyOtpRequest verifyOtpRequest);
}
