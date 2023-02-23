package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueResolutionFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueResolutionFragment_MembersInjector implements InterfaceC9463a<IssueResolutionFragment> {
    private final InterfaceC11700a<IssueResolutionFragmentPresenter> thisPresenterProvider;

    public IssueResolutionFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssueResolutionFragment_MembersInjector $r1 = new IssueResolutionFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(IssueResolutionFragment issueResolutionFragment, IssueResolutionFragmentPresenter issueResolutionFragmentPresenter) {
        issueResolutionFragment.thisPresenter = issueResolutionFragmentPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueResolutionFragment issueResolutionFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        IssueResolutionFragmentPresenter $r4 = (IssueResolutionFragmentPresenter) $r2;
        injectThisPresenter(issueResolutionFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueResolutionFragment $r2 = (IssueResolutionFragment) obj;
        injectMembers($r2);
    }
}
