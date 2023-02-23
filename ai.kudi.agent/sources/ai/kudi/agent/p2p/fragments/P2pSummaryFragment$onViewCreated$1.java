package ai.kudi.agent.p2p.fragments;

import ai.kudi.agent.transactionstatus.summary.model.SummaryModel;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: P2pSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "summaryModel", "Lai/kudi/agent/transactionstatus/summary/model/SummaryModel;", "<anonymous parameter 1>", "Landroid/view/View;", "<anonymous parameter 2>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class P2pSummaryFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11772q<SummaryModel, View, Integer, C13666w> {
    final /* synthetic */ P2pSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pSummaryFragment$onViewCreated$1(P2pSummaryFragment p2pSummaryFragment) {
        super(3);
        this.this$0 = p2pSummaryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public /* bridge */ /* synthetic */ C13666w invoke(SummaryModel summaryModel, View view, Integer num) {
        SummaryModel $r4 = summaryModel;
        View $r5 = view;
        Integer $r6 = num;
        int $i0 = $r6.intValue();
        invoke($r4, $r5, $i0);
        C13666w r7 = C13666w.f30112a;
        return r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(SummaryModel summaryModel, View view, int i) {
        Log_OC.getArray(summaryModel, "summaryModel");
        Log_OC.getArray(view, "$noName_1");
        String $r3 = summaryModel.getLabel();
        boolean $z0 = Log_OC.append($r3, "Receiver’s Phone Number");
        if ($z0) {
            P2pSummaryFragment $r4 = this.this$0;
            TransferActivity $r5 = $r4.transferActivity;
            if ($r5 == null) {
                return;
            }
            $r5.popP2pTwice();
            return;
        }
        P2pSummaryFragment $r42 = this.this$0;
        TransferActivity $r52 = $r42.transferActivity;
        if ($r52 == null) {
            return;
        }
        $r52.onBackPressed();
    }
}
