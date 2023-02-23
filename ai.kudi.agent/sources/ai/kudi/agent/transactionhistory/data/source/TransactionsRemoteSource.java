package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.transactionhistory.data.source.request.GetOutletTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: TransactionsRemoteSource.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\tH&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\fH&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\tH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0011H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteSource;", "", "incompleteTransactions", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "outletTransactions", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletWalletActivitiesRequest;", "outletTransactionsSummary", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletTransactionSummaryRequest;", "outletWalletActivities", "searchTransactions", "transactions", "transactionsSummary", "Lai/kudi/agent/transactionhistory/data/source/request/GetTransactionSummaryRequest;", "walletActivities", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionsRemoteSource {
    AbstractC11688p incompleteTransactions(GetWalletActivitiesRequest getWalletActivitiesRequest);

    AbstractC11688p outletTransactions(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest);

    AbstractC11688p outletTransactionsSummary(GetOutletTransactionSummaryRequest getOutletTransactionSummaryRequest);

    AbstractC11688p outletWalletActivities(GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest);

    AbstractC11688p searchTransactions(GetWalletActivitiesRequest getWalletActivitiesRequest);

    AbstractC11688p transactions(GetWalletActivitiesRequest getWalletActivitiesRequest);

    AbstractC11688p transactionsSummary(GetTransactionSummaryRequest getTransactionSummaryRequest);

    AbstractC11688p walletActivities(GetWalletActivitiesRequest getWalletActivitiesRequest);
}
