package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.presenters.IssueHistoryPresenter;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: IssueHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/issues/data/model/Issue$Ticket;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment$onViewCreated$1$1 */
/* loaded from: classes.dex */
final class IssueHistoryFragment$onViewCreated$1$1 extends AbstractC11802m implements InterfaceC11767l<Issue.Ticket, C13666w> {
    final /* synthetic */ IssueHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueHistoryFragment$onViewCreated$1$1(IssueHistoryFragment issueHistoryFragment) {
        super(1);
        this.this$0 = issueHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Issue.Ticket ticket) {
        Issue.Ticket $r2 = ticket;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "it");
        IssueHistoryFragment $r3 = this.this$0;
        InterfaceC9413d $r2 = ((AbstractC9412c) $r3).presenter;
        IssueHistoryPresenter $r4 = (IssueHistoryPresenter) $r2;
        $r4.toDisputeIssueFragment(ticket);
    }
}
