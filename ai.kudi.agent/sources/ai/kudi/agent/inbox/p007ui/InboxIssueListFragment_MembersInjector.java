package ai.kudi.agent.inbox.p007ui;

import ai.kudi.agent.inbox.presenters.InboxListPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.inbox.ui.InboxIssueListFragment_MembersInjector */
/* loaded from: classes.dex */
public final class InboxIssueListFragment_MembersInjector implements InterfaceC9463a<InboxIssueListFragment> {
    private final InterfaceC11700a<InboxListPresenter> thisPresenterProvider;

    public InboxIssueListFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        InboxIssueListFragment_MembersInjector $r1 = new InboxIssueListFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(InboxIssueListFragment inboxIssueListFragment, InboxListPresenter inboxListPresenter) {
        inboxIssueListFragment.thisPresenter = inboxListPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(InboxIssueListFragment inboxIssueListFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        InboxListPresenter $r4 = (InboxListPresenter) $r2;
        injectThisPresenter(inboxIssueListFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        InboxIssueListFragment $r2 = (InboxIssueListFragment) obj;
        injectMembers($r2);
    }
}
