package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.SubmitIssuePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueSummaryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueSummaryFragment_MembersInjector implements InterfaceC9463a<IssueSummaryFragment> {
    private final InterfaceC11700a<SubmitIssuePresenter> submitIssuePresenterProvider;

    public IssueSummaryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.submitIssuePresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssueSummaryFragment_MembersInjector $r1 = new IssueSummaryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSubmitIssuePresenter(IssueSummaryFragment issueSummaryFragment, SubmitIssuePresenter submitIssuePresenter) {
        issueSummaryFragment.submitIssuePresenter = submitIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueSummaryFragment issueSummaryFragment) {
        InterfaceC11700a $r3 = this.submitIssuePresenterProvider;
        Object $r2 = $r3.get();
        SubmitIssuePresenter $r4 = (SubmitIssuePresenter) $r2;
        injectSubmitIssuePresenter(issueSummaryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueSummaryFragment $r2 = (IssueSummaryFragment) obj;
        injectMembers($r2);
    }
}
