package ai.kudi.agent.transactionhistory.navigator;

import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TransactionsNavigator.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "", "onOpenTransactionCommissionsScreen", "", "commissionWallets", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "openFundWalletScreen", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "openIncompleteTransactions", "openOutletManagement", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "openRequestStatementsScreen", "openTransactionBreakDownScreen", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "type", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "openTransactionReportScreen", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionsNavigator {
    void onOpenTransactionCommissionsScreen(List list);

    void openFundWalletScreen(TransactionHistoryScope transactionHistoryScope);

    void openIncompleteTransactions(TransactionHistoryScope transactionHistoryScope);

    void openOutletManagement(Outlet outlet);

    void openRequestStatementsScreen();

    void openTransactionBreakDownScreen(FilteredDate filteredDate, TransactionSummaryItemType transactionSummaryItemType);

    void openTransactionReportScreen();
}
