package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.SupportIssuePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.SupportIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SupportIssueFragment_MembersInjector implements InterfaceC9463a<SupportIssueFragment> {
    private final InterfaceC11700a<SupportIssuePresenter> thisPresenterProvider;

    public SupportIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SupportIssueFragment_MembersInjector $r1 = new SupportIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(SupportIssueFragment supportIssueFragment, SupportIssuePresenter supportIssuePresenter) {
        supportIssueFragment.thisPresenter = supportIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SupportIssueFragment supportIssueFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        SupportIssuePresenter $r4 = (SupportIssuePresenter) $r2;
        injectThisPresenter(supportIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SupportIssueFragment $r2 = (SupportIssueFragment) obj;
        injectMembers($r2);
    }
}
