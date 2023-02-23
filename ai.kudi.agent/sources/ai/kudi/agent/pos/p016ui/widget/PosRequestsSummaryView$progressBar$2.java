package ai.kudi.agent.pos.p016ui.widget;

import ai.kudi.agent.C0001R;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: PosRequestsSummaryView.kt */
@Metadata(m10422d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, m10421d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.widget.PosRequestsSummaryView$progressBar$2 */
/* loaded from: classes.dex */
final class PosRequestsSummaryView$progressBar$2 extends AbstractC11802m implements InterfaceC11756a<View> {
    final /* synthetic */ PosRequestsSummaryView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PosRequestsSummaryView$progressBar$2(PosRequestsSummaryView posRequestsSummaryView) {
        super(0);
        this.this$0 = posRequestsSummaryView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public final View invoke() {
        ViewGroup $r2 = this.this$0;
        ViewGroup r3 = $r2;
        View $r1 = r3.findViewById(C0001R.C0003id.pos_overview_progress_bar);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ View invoke() {
        View $r1 = invoke();
        return $r1;
    }
}
