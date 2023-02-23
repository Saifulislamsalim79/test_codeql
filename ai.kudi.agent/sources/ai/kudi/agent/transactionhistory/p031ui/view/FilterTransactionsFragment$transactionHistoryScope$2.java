package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilterTransactionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment$transactionHistoryScope$2 */
/* loaded from: classes.dex */
public final class FilterTransactionsFragment$transactionHistoryScope$2 extends AbstractC11802m implements InterfaceC11756a<TransactionHistoryScope> {
    final /* synthetic */ FilterTransactionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTransactionsFragment$transactionHistoryScope$2(FilterTransactionsFragment filterTransactionsFragment) {
        super(0);
        this.this$0 = filterTransactionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final TransactionHistoryScope invoke() {
        FilterTransactionsFragment $r1 = this.this$0;
        Bundle $r2 = $r1.requireArguments();
        Parcelable $r3 = $r2.getParcelable("BUNDLE_KEY_TRANSACTION_SCOPE");
        if ($r3 != null) {
            TransactionHistoryScope $r4 = (TransactionHistoryScope) $r3;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ TransactionHistoryScope invoke() {
        TransactionHistoryScope $r1 = invoke();
        return $r1;
    }
}
