package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsFragment$setUpTransactionsView$1$1 */
/* loaded from: classes.dex */
public final class TransactionsFragment$setUpTransactionsView$1$1 extends AbstractC11802m implements InterfaceC11767l<TransactionSummaryItem, C13666w> {
    final /* synthetic */ TransactionsFragment this$0;

    /* compiled from: TransactionsFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsFragment$setUpTransactionsView$1$1$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            TransactionSummaryItemType[] $r0 = TransactionSummaryItemType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            TransactionSummaryItemType $r2 = TransactionSummaryItemType.WALLET_BALANCE;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            TransactionSummaryItemType $r22 = TransactionSummaryItemType.COMMISSION_WALLET;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsFragment$setUpTransactionsView$1$1(TransactionsFragment transactionsFragment) {
        super(1);
        this.this$0 = transactionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(TransactionSummaryItem transactionSummaryItem) {
        TransactionSummaryItem $r2 = transactionSummaryItem;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TransactionSummaryItem transactionSummaryItem) {
        Log_OC.getArray(transactionSummaryItem, "it");
        TransactionSummaryItemType $r2 = transactionSummaryItem.getType();
        int[] $r3 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r3[$r2.ordinal()];
        if ($i0 == 1) {
            TransactionsFragment $r4 = this.this$0;
            TransactionsViewModel $r5 = $r4.getViewModel();
            TransactionsFragment $r42 = this.this$0;
            TransactionHistoryScope $r7 = $r42.transactionHistoryScope;
            $r5.onOpenFundWalletScreen($r7);
        } else if ($i0 == 2) {
            TransactionsFragment $r43 = this.this$0;
            TransactionsViewModel $r52 = $r43.getViewModel();
            $r52.onOpenTransactionCommissionsScreen();
        } else {
            TransactionsFragment $r44 = this.this$0;
            TransactionsViewModel $r53 = $r44.getViewModel();
            TransactionsFragment $r45 = this.this$0;
            FilteredDate $r6 = $r45.filteredDate;
            TransactionSummaryItemType $r22 = transactionSummaryItem.getType();
            $r53.onOpenTransactionBreakDownPage($r6, $r22);
        }
    }
}
