package ai.kudi.agent.transactionhistory.p031ui.widget;

import ai.kudi.agent.C0001R;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransactionsView.kt */
@Metadata(m10422d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroid/widget/Button;", "kotlin.jvm.PlatformType"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.widget.TransactionsView$incompleteTransactionsButton$2 */
/* loaded from: classes.dex */
public final class TransactionsView$incompleteTransactionsButton$2 extends AbstractC11802m implements InterfaceC11756a<Button> {
    final /* synthetic */ TransactionsView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsView$incompleteTransactionsButton$2(TransactionsView transactionsView) {
        super(0);
        this.this$0 = transactionsView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final Button invoke() {
        FrameLayout $r2 = this.this$0;
        FrameLayout r4 = $r2;
        View $r1 = r4.findViewById(C0001R.C0003id.incomplete_transactions_button);
        Button $r3 = (Button) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ Button invoke() {
        Button $r1 = invoke();
        return $r1;
    }
}
