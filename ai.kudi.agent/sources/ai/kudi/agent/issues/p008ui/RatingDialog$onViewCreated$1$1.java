package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.RatingViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: RatingDialog.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.RatingDialog$onViewCreated$1$1 */
/* loaded from: classes.dex */
final class RatingDialog$onViewCreated$1$1 extends AbstractC11802m implements InterfaceC11767l<Integer, C13666w> {
    final /* synthetic */ RatingDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialog$onViewCreated$1$1(RatingDialog ratingDialog) {
        super(1);
        this.this$0 = ratingDialog;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Integer num) {
        Integer $r2 = num;
        int $i0 = $r2.intValue();
        invoke($i0);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(int i) {
        RatingDialog $r1 = this.this$0;
        RatingViewModel $r2 = $r1.getIssueRatingViewModel();
        RatingDialog $r12 = this.this$0;
        String $r3 = $r12.ticketId;
        $r2.rateIssue($r3, i);
    }
}
