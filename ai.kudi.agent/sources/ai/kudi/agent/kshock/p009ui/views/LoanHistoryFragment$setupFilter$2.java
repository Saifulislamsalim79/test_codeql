package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.dip.library.filter.KudiDateAndTypeFilterView;
import ai.kudi.dip.library.p043h.DialogC0809i;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LoanHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupFilter$2 */
/* loaded from: classes.dex */
final class LoanHistoryFragment$setupFilter$2 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ KudiDateAndTypeFilterView $filterView;
    final /* synthetic */ LoanHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$setupFilter$2(LoanHistoryFragment loanHistoryFragment, KudiDateAndTypeFilterView kudiDateAndTypeFilterView) {
        super(1);
        this.this$0 = loanHistoryFragment;
        this.$filterView = kudiDateAndTypeFilterView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "it");
        LoanHistoryFragment $r1 = this.this$0;
        Context $r3 = $r1.requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        LoanHistoryFragment $r12 = this.this$0;
        KudiDateAndTypeFilterView $r2 = this.$filterView;
        LoanHistoryFragment$setupFilter$2$filterBottomSheet$1 r7 = new LoanHistoryFragment$setupFilter$2$filterBottomSheet$1($r12, $r2);
        Dialog r8 = new DialogC0809i($r3, r7);
        Dialog r9 = r8;
        r9.show();
    }
}
