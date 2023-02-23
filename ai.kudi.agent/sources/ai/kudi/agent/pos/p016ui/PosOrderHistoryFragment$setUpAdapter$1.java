package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.model.PosOrderUiModel;
import ai.kudi.agent.pos.presentation.PosOrderHistoryViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PosOrderHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/pos/ui/model/PosOrderUiModel$Order;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosOrderHistoryFragment$setUpAdapter$1 */
/* loaded from: classes.dex */
public final class PosOrderHistoryFragment$setUpAdapter$1 extends AbstractC11802m implements InterfaceC11767l<PosOrderUiModel.Order, C13666w> {
    final /* synthetic */ PosOrderHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosOrderHistoryFragment$setUpAdapter$1(PosOrderHistoryFragment posOrderHistoryFragment) {
        super(1);
        this.this$0 = posOrderHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(PosOrderUiModel.Order order) {
        PosOrderUiModel.Order $r2 = order;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PosOrderUiModel.Order order) {
        Log_OC.getArray(order, "it");
        PosOrderHistoryFragment $r2 = this.this$0;
        PosOrderHistoryViewModel $r3 = $r2.getViewModel();
        String $r4 = order.getId();
        Log_OC.append($r4);
        $r3.navigateToPosOrderDetails($r4);
    }
}
