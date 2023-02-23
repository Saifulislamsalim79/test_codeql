package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.viewmodel.SavingHistoryViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SavingHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/savings/data/model/SavingResponse;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment$adapter$1 */
/* loaded from: classes.dex */
final class SavingHistoryFragment$adapter$1 extends AbstractC11802m implements InterfaceC11767l<SavingResponse, C13666w> {
    final /* synthetic */ SavingHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingHistoryFragment$adapter$1(SavingHistoryFragment savingHistoryFragment) {
        super(1);
        this.this$0 = savingHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(SavingResponse savingResponse) {
        SavingResponse $r2 = savingResponse;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SavingResponse savingResponse) {
        Log_OC.getArray(savingResponse, "it");
        SavingHistoryFragment $r3 = this.this$0;
        SavingHistoryViewModel $r2 = $r3.getViewModel();
        $r2.navigateToSavingsDetails(savingResponse);
    }
}
