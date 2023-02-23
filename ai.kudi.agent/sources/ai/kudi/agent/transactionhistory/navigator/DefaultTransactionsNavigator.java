package ai.kudi.agent.transactionhistory.navigator;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.dashboard.ui.TransactionBreakDownActivity;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.fragments.ManageOutletFragment;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsActivity;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.view.IncompleteTransactionsActivity;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.agent.transactions.p032ui.EmailTransactionReportActivity;
import ai.kudi.agent.transactions.p032ui.RequestStatementActivity;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: DefaultTransactionsNavigator.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/navigator/DefaultTransactionsNavigator;", "Lai/kudi/agent/transactionhistory/navigator/TransactionsNavigator;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "onOpenTransactionCommissionsScreen", "", "commissionWallets", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "openFundWalletScreen", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "openIncompleteTransactions", "openOutletManagement", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "openRequestStatementsScreen", "openTransactionBreakDownScreen", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "type", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItemType;", "openTransactionReportScreen", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTransactionsNavigator implements TransactionsNavigator {
    private final Activity activity;

    public DefaultTransactionsNavigator(Activity activity) {
        Log_OC.getArray(activity, "activity");
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void onOpenTransactionCommissionsScreen(List list) {
        Log_OC.getArray(list, "commissionWallets");
        Activity $r4 = this.activity;
        Intent $r3 = new Intent($r4, TransactionCommissionsActivity.class);
        CommissionWallet[] $r5 = new CommissionWallet[0];
        Object[] $r1 = list.toArray($r5);
        if ($r1 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r7;
        }
        Parcelable[] $r6 = (Parcelable[]) $r1;
        $r3.putExtra(TransactionCommissionsActivity.BUNDLE_KEY_COMMISSION_WALLETS, $r6);
        Activity $r42 = this.activity;
        $r42.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openFundWalletScreen(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        boolean $z0 = transactionHistoryScope instanceof TransactionHistoryScope.OutletTransactions;
        if (!$z0) {
            Activity $r3 = this.activity;
            Intent $r2 = new Intent($r3, WalletTopUpActivity.class);
            $r2.putExtra(WalletTopUpActivity.EXTRA_MODE, WalletTopUpActivity.MODE_WALLET_TOPUP);
            Activity $r32 = this.activity;
            $r32.startActivity($r2);
            return;
        }
        Activity $r33 = this.activity;
        Intent $r22 = new Intent($r33, TransferActivity.class);
        TransactionHistoryScope.OutletTransactions $r4 = (TransactionHistoryScope.OutletTransactions) transactionHistoryScope;
        Outlet $r5 = $r4.getOutlet();
        String $r6 = $r5.getPhoneNumber();
        $r22.putExtra(TransferActivity.RECIPIENT_PHONE_NUMBER, $r6);
        Activity $r34 = this.activity;
        $r34.startActivity($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openIncompleteTransactions(TransactionHistoryScope transactionHistoryScope) {
        Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
        Activity $r4 = this.activity;
        IncompleteTransactionsActivity.Companion $r1 = IncompleteTransactionsActivity.Companion;
        Intent $r2 = $r1.getIntent($r4, transactionHistoryScope);
        $r4.startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openOutletManagement(Outlet outlet) {
        Log_OC.getArray(outlet, "outlet");
        Activity $r3 = this.activity;
        boolean $z0 = $r3 instanceof OutletMgtActivity;
        OutletMgtActivity $r4 = $z0 ? (OutletMgtActivity) $r3 : null;
        if ($r4 == null) {
            return;
        }
        ManageOutletFragment.Companion $r5 = ManageOutletFragment.Companion;
        ManageOutletFragment $r2 = $r5.newInstance(outlet);
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r4, $r2, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openRequestStatementsScreen() {
        Activity $r1 = this.activity;
        Activity $r3 = this.activity;
        Intent $r2 = new Intent($r3, RequestStatementActivity.class);
        $r1.startActivity($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openTransactionBreakDownScreen(FilteredDate filteredDate, TransactionSummaryItemType transactionSummaryItemType) {
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(transactionSummaryItemType, "type");
        Activity $r4 = this.activity;
        Intent $r3 = new Intent($r4, TransactionBreakDownActivity.class);
        $r3.putExtra(ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity.FILTERED_DATE_INTENT, filteredDate);
        $r3.putExtra(ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity.FILTERED_DATE_INTENT, filteredDate);
        $r3.putExtra(ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity.BUNDLE_KEY_SUMMARY_TYPE, transactionSummaryItemType);
        $r3.putExtra(ai.kudi.agent.dashboard.mods.TransactionBreakDownActivity.IS_PARENT_OUTLET, false);
        Activity $r42 = this.activity;
        $r42.startActivity($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.TransactionsNavigator
    public void openTransactionReportScreen() {
        Activity $r2 = this.activity;
        Intent $r1 = new Intent($r2, EmailTransactionReportActivity.class);
        Activity $r22 = this.activity;
        $r22.startActivity($r1);
    }
}
