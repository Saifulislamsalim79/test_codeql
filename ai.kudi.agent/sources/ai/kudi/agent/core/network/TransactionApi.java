package ai.kudi.agent.core.network;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingData;
import ai.kudi.agent.users.domain.package_1.TransferRequest;
import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionApi.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/network/TransactionApi;", "", "doTransactionLookUp", "Lio/reactivex/Observable;", "Lai/kudi/agent/transfer/domain/models/TransactionLookUpResponse;", "sessionId", "", "type", "searchTerm", "postMultipleTransfer", "Lai/kudi/agent/users/domain/dto/TransferResponse;", TransactionRequest.TYPE_REQUEST, "", "Lai/kudi/agent/users/domain/dto/TransferRequest;", "deviceId", "postTransfer", "billRequest", "verifyPendingTransaction", "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingResponse;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/transactions/domain/usecases/VerifyPendingData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionApi {
    AbstractC11688p doTransactionLookUp(String str, String str2, String str3);

    AbstractC11688p postMultipleTransfer(String str, List list, String str2);

    AbstractC11688p postTransfer(String str, TransferRequest transferRequest, String str2);

    AbstractC11688p verifyPendingTransaction(String str, VerifyPendingData verifyPendingData);
}
