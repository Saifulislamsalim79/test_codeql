package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.pos.p016ui.viewModels.PosEligibilityViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PosEligibilityFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/pos/ui/model/PosFilterType;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosEligibilityFragment$applyPosSummary$1$1$1 */
/* loaded from: classes.dex */
public final class PosEligibilityFragment$applyPosSummary$1$1$1 extends AbstractC11802m implements InterfaceC11767l<PosFilterType, C13666w> {
    final /* synthetic */ PosEligibilityFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosEligibilityFragment$applyPosSummary$1$1$1(PosEligibilityFragment posEligibilityFragment) {
        super(1);
        this.this$0 = posEligibilityFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(PosFilterType posFilterType) {
        PosFilterType $r2 = posFilterType;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PosFilterType posFilterType) {
        Log_OC.getArray(posFilterType, "it");
        PosEligibilityFragment $r3 = this.this$0;
        PosEligibilityViewModel $r2 = $r3.getPosEligibilityViewModel();
        $r2.navigateToPosOrderHistoryFragment(posFilterType);
    }
}
