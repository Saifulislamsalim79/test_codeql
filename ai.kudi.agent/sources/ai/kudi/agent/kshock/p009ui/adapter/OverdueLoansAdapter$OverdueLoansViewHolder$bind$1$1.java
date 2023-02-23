package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: OverdueLoansAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter$TwoColumnClickListeners;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.adapter.OverdueLoansAdapter$OverdueLoansViewHolder$bind$1$1 */
/* loaded from: classes.dex */
final class OverdueLoansAdapter$OverdueLoansViewHolder$bind$1$1 extends AbstractC11802m implements InterfaceC11767l<TwoColumnTableAdapter.TwoColumnClickListeners, C13666w> {
    final /* synthetic */ Loan $loan;
    final /* synthetic */ OverdueLoansAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdueLoansAdapter$OverdueLoansViewHolder$bind$1$1(OverdueLoansAdapter overdueLoansAdapter, Loan loan) {
        super(1);
        this.this$0 = overdueLoansAdapter;
        this.$loan = loan;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(TwoColumnTableAdapter.TwoColumnClickListeners twoColumnClickListeners) {
        TwoColumnTableAdapter.TwoColumnClickListeners $r2 = twoColumnClickListeners;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TwoColumnTableAdapter.TwoColumnClickListeners twoColumnClickListeners) {
        Log_OC.getArray(twoColumnClickListeners, "it");
        TwoColumnTableAdapter.ActionViewClick $r2 = TwoColumnTableAdapter.ActionViewClick.INSTANCE;
        boolean $z0 = Log_OC.append(twoColumnClickListeners, $r2);
        if ($z0) {
            OverdueLoansAdapter $r3 = this.this$0;
            InterfaceC11767l $r4 = $r3.getOnActionButtonClickListener();
            Loan $r5 = this.$loan;
            $r4.invoke($r5);
        }
    }
}
