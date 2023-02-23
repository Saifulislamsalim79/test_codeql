package ai.kudi.agent.transactionhistory.p031ui.widget;

import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionsView.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.widget.TransactionsView$onSummaryItemClicked$1 */
/* loaded from: classes.dex */
final class TransactionsView$onSummaryItemClicked$1 extends AbstractC11802m implements InterfaceC11767l<TransactionSummaryItem, C13666w> {
    public static final TransactionsView$onSummaryItemClicked$1 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        TransactionsView$onSummaryItemClicked$1 $r0 = new TransactionsView$onSummaryItemClicked$1();
        INSTANCE = $r0;
    }

    TransactionsView$onSummaryItemClicked$1() {
        super(1);
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

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TransactionSummaryItem transactionSummaryItem) {
        Log_OC.getArray(transactionSummaryItem, "it");
    }
}
