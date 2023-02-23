package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueDetailFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueDetailFragment_MembersInjector implements InterfaceC9463a<IssueDetailFragment> {
    private final InterfaceC11700a<IssueDetailsViewModel> issueDetailsViewModelProvider;

    public IssueDetailFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.issueDetailsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssueDetailFragment_MembersInjector $r1 = new IssueDetailFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectIssueDetailsViewModel(IssueDetailFragment issueDetailFragment, IssueDetailsViewModel issueDetailsViewModel) {
        issueDetailFragment.issueDetailsViewModel = issueDetailsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueDetailFragment issueDetailFragment) {
        InterfaceC11700a $r3 = this.issueDetailsViewModelProvider;
        Object $r2 = $r3.get();
        IssueDetailsViewModel $r4 = (IssueDetailsViewModel) $r2;
        injectIssueDetailsViewModel(issueDetailFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueDetailFragment $r2 = (IssueDetailFragment) obj;
        injectMembers($r2);
    }
}
