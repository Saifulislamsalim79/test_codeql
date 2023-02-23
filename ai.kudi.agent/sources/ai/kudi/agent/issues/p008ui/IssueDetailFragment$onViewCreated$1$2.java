package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IssueDetailFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueDetailFragment$onViewCreated$1$2 */
/* loaded from: classes.dex */
final class IssueDetailFragment$onViewCreated$1$2 extends AbstractC11802m implements InterfaceC11767l<IssueTypeModel, C13666w> {
    final /* synthetic */ IssueDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueDetailFragment$onViewCreated$1$2(IssueDetailFragment issueDetailFragment) {
        super(1);
        this.this$0 = issueDetailFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(IssueTypeModel issueTypeModel) {
        IssueTypeModel $r2 = issueTypeModel;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        IssueDetailFragment $r2 = this.this$0;
        IssueCategory $r3 = $r2.issueType;
        if ($r3 != null) {
            IssueDetailFragment $r22 = this.this$0;
            IssueDetailsViewModel $r4 = $r22.getIssueDetailsViewModel();
            $r4.navigateToNextFragment(issueTypeModel);
            return;
        }
        IssueDetailFragment $r23 = this.this$0;
        IssueTypeModel $r5 = $r23.issueModel;
        if ($r5 != null) {
            String $r6 = issueTypeModel.getTitle();
            $r5.setTitle($r6);
        }
        IssueDetailFragment $r24 = this.this$0;
        IssueTypeModel $r52 = $r24.issueModel;
        if ($r52 != null) {
            String $r62 = issueTypeModel.getIssueId();
            $r52.setIssueId($r62);
        }
        IssueDetailFragment $r25 = this.this$0;
        IssueTypeModel $r53 = $r25.issueModel;
        if ($r53 != null) {
            String $r63 = issueTypeModel.getTypeSlug();
            $r53.setTypeSlug($r63);
        }
        IssueDetailFragment $r26 = this.this$0;
        IssueTypeModel $r54 = $r26.issueModel;
        if ($r54 != null) {
            String $r64 = issueTypeModel.getLabel();
            $r54.setLabel($r64);
        }
        IssueDetailFragment $r27 = this.this$0;
        IssueTypeModel $r1 = $r27.issueModel;
        if ($r1 == null) {
            return;
        }
        IssueDetailFragment $r28 = this.this$0;
        IssueDetailsViewModel $r42 = $r28.getIssueDetailsViewModel();
        $r42.navigateToNextFragment($r1);
    }
}
