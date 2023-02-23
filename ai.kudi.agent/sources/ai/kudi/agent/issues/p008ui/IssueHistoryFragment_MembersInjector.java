package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.IssueHistoryPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueHistoryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueHistoryFragment_MembersInjector implements InterfaceC9463a<IssueHistoryFragment> {
    private final InterfaceC11700a<IssueHistoryPresenter> issueHistoryPresenterProvider;

    public IssueHistoryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.issueHistoryPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssueHistoryFragment_MembersInjector $r1 = new IssueHistoryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectIssueHistoryPresenter(IssueHistoryFragment issueHistoryFragment, IssueHistoryPresenter issueHistoryPresenter) {
        issueHistoryFragment.issueHistoryPresenter = issueHistoryPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueHistoryFragment issueHistoryFragment) {
        InterfaceC11700a $r3 = this.issueHistoryPresenterProvider;
        Object $r2 = $r3.get();
        IssueHistoryPresenter $r4 = (IssueHistoryPresenter) $r2;
        injectIssueHistoryPresenter(issueHistoryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueHistoryFragment $r2 = (IssueHistoryFragment) obj;
        injectMembers($r2);
    }
}
