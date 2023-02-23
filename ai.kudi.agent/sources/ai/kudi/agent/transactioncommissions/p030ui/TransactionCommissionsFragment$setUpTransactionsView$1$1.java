package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsViewModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionCommissionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsFragment$setUpTransactionsView$1$1 */
/* loaded from: classes.dex */
final class TransactionCommissionsFragment$setUpTransactionsView$1$1 extends AbstractC11802m implements InterfaceC11767l<TransactionItemUiModel.Transaction, C13666w> {
    final /* synthetic */ TransactionCommissionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCommissionsFragment$setUpTransactionsView$1$1(TransactionCommissionsFragment transactionCommissionsFragment) {
        super(1);
        this.this$0 = transactionCommissionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(TransactionItemUiModel.Transaction transaction) {
        TransactionItemUiModel.Transaction $r2 = transaction;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "it");
        TransactionCommissionsFragment $r3 = this.this$0;
        TransactionCommissionsViewModel $r2 = $r3.getViewModel();
        $r2.onCommissionItemClicked(transaction);
    }
}
