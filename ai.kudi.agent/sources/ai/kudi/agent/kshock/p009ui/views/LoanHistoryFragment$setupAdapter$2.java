package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.presentation.LoanHistoryViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LoanHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/kshock/data/model/Loan;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupAdapter$2 */
/* loaded from: classes.dex */
final class LoanHistoryFragment$setupAdapter$2 extends AbstractC11802m implements InterfaceC11767l<Loan, C13666w> {
    final /* synthetic */ LoanHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$setupAdapter$2(LoanHistoryFragment loanHistoryFragment) {
        super(1);
        this.this$0 = loanHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Loan loan) {
        Loan $r2 = loan;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Loan loan) {
        Log_OC.getArray(loan, "it");
        LoanHistoryFragment $r3 = this.this$0;
        LoanHistoryViewModel $r2 = $r3.getViewModel();
        $r2.navigateToLoanStatus(loan);
    }
}
