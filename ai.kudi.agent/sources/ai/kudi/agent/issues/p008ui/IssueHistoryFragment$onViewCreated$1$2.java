package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.issues.presenters.IssueHistoryPresenter;
import java.util.Date;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: IssueHistoryFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment$onViewCreated$1$2 */
/* loaded from: classes.dex */
final class IssueHistoryFragment$onViewCreated$1$2 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ IssueHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueHistoryFragment$onViewCreated$1$2(IssueHistoryFragment issueHistoryFragment) {
        super(0);
        this.this$0 = issueHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String $r6;
        IssueHistoryFragment $r1 = this.this$0;
        String $r2 = $r1.lastSelectedStatus;
        IssueHistoryFragment $r12 = this.this$0;
        boolean $z0 = $r12.listIsBeingFiltered;
        String $r3 = "";
        if ($z0) {
            IssueHistoryFragment $r13 = this.this$0;
            FilteredDate $r4 = $r13.getFilteredDate();
            Date $r5 = $r4.getFrom();
            $r6 = DateExtKt.convertDateToGivenFormat($r5, "yyyy/MM/dd");
        } else {
            $r6 = "";
        }
        IssueHistoryFragment $r14 = this.this$0;
        boolean $z02 = $r14.listIsBeingFiltered;
        if ($z02) {
            IssueHistoryFragment $r15 = this.this$0;
            FilteredDate $r42 = $r15.getFilteredDate();
            Date $r52 = $r42.getTo();
            $r3 = DateExtKt.convertDateToGivenFormat($r52, "yyyy/MM/dd");
        }
        IssueHistoryFragment $r16 = this.this$0;
        int $i0 = $r16.getPage();
        int $i1 = $i0 + 1;
        $r16.setPage($i1);
        IssueHistoryFragment $r17 = this.this$0;
        IssueHistoryPresenter $r7 = $r17.getIssueHistoryPresenter();
        $r7.loadIssueHistory($r6, $r3, $r2, $i0, false, true);
    }
}
