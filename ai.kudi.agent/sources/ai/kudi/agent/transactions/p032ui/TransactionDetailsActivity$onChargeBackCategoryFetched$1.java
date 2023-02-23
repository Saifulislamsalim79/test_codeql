package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import android.os.Bundle;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TransactionDetailsActivity.kt */
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActivity$onChargeBackCategoryFetched$1 */
/* loaded from: classes.dex */
final class TransactionDetailsActivity$onChargeBackCategoryFetched$1 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
    final /* synthetic */ CategoryData $categoryData;
    final /* synthetic */ TransactionDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDetailsActivity$onChargeBackCategoryFetched$1(CategoryData categoryData, TransactionDetailsActivity transactionDetailsActivity) {
        super(1);
        this.$categoryData = categoryData;
        this.this$0 = transactionDetailsActivity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
        Bundle $r2 = bundle;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Bundle bundle) {
        Log_OC.getArray(bundle, "$this$launchActivity");
        CategoryData $r2 = this.$categoryData;
        String $r3 = $r2.getType();
        TransactionDetailsActivity $r4 = this.this$0;
        String $r5 = $r4.time;
        TransactionDetailsActivity $r42 = this.this$0;
        String $r6 = $r42.amount;
        TransactionDetailsActivity $r43 = this.this$0;
        String $r7 = $r43.getTransactionReference();
        TransactionDetailsActivity $r44 = this.this$0;
        String $r8 = $r44.conditions;
        String $r9 = $r8;
        if ($r8 == null) {
            $r9 = "";
        }
        TransactionDetailsActivity $r45 = this.this$0;
        String $r82 = $r45.ticketResolved;
        TransactionDetailsActivity $r46 = this.this$0;
        String $r10 = $r46.ticketId;
        TransactionDetailsActivity $r47 = this.this$0;
        String $r11 = $r47.maxedPan;
        CategoryData $r22 = this.$categoryData;
        String $r12 = $r22.getId();
        CategoryData $r23 = this.$categoryData;
        String $r13 = $r23.getDescription();
        IssueLabels $r14 = IssueLabels.CHARGE_BACK;
        String $r15 = $r14.getLabel();
        IssueTypeModel $r16 = new IssueTypeModel($r13, null, $r7, null, $r3, $r12, $r5, $r6, $r9, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, $r11, $r15, $r82, $r10, null, null, true, 1073741322, 12, null);
        bundle.putParcelable(IssueActivity.ISSUE_MODEL, $r16);
    }
}
