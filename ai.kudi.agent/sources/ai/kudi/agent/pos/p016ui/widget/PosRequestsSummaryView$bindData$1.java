package ai.kudi.agent.pos.p016ui.widget;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.pos.p016ui.data.PosSummaryUiData;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosRequestsSummaryView.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/pos/ui/data/PosSummaryUiData;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.widget.PosRequestsSummaryView$bindData$1 */
/* loaded from: classes.dex */
final class PosRequestsSummaryView$bindData$1 extends AbstractC11802m implements InterfaceC11767l<PosSummaryUiData, C13666w> {
    final /* synthetic */ PosRequestsSummaryView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosRequestsSummaryView$bindData$1(PosRequestsSummaryView posRequestsSummaryView) {
        super(1);
        this.this$0 = posRequestsSummaryView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(PosSummaryUiData posSummaryUiData) {
        PosSummaryUiData $r2 = posSummaryUiData;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PosSummaryUiData posSummaryUiData) {
        Log_OC.getArray(posSummaryUiData, "it");
        String $r2 = posSummaryUiData.getTitle();
        ViewGroup $r3 = this.this$0;
        ViewGroup r8 = $r3;
        Context $r4 = r8.getContext();
        String $r5 = $r4.getString(C0001R.string.total_no_of_terminal);
        boolean $z0 = Log_OC.append($r2, $r5);
        if ($z0) {
            PosRequestsSummaryView $r32 = this.this$0;
            InterfaceC11767l $r6 = $r32.getOnSummaryItemClicked();
            PosFilterType $r7 = PosFilterType.type;
            $r6.invoke($r7);
            return;
        }
        ViewGroup $r33 = this.this$0;
        ViewGroup r82 = $r33;
        Context $r42 = r82.getContext();
        String $r52 = $r42.getString(C0001R.string.assigned_terminals);
        boolean $z02 = Log_OC.append($r2, $r52);
        if ($z02) {
            PosRequestsSummaryView $r34 = this.this$0;
            InterfaceC11767l $r62 = $r34.getOnSummaryItemClicked();
            PosFilterType $r72 = PosFilterType.ASSIGNED;
            $r62.invoke($r72);
            return;
        }
        ViewGroup $r35 = this.this$0;
        ViewGroup r83 = $r35;
        Context $r43 = r83.getContext();
        String $r53 = $r43.getString(C0001R.string.unassigned_terminals);
        boolean $z03 = Log_OC.append($r2, $r53);
        if ($z03) {
            PosRequestsSummaryView $r36 = this.this$0;
            InterfaceC11767l $r63 = $r36.getOnSummaryItemClicked();
            PosFilterType $r73 = PosFilterType.UNASSIGNED;
            $r63.invoke($r73);
        }
    }
}
