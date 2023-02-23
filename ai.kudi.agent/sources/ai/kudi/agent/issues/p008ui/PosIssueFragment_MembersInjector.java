package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.presenters.PosIssuePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.PosIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PosIssueFragment_MembersInjector implements InterfaceC9463a<PosIssueFragment> {
    private final InterfaceC11700a<PosIssuePresenter> posIssuePresenterProvider;

    public PosIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.posIssuePresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PosIssueFragment_MembersInjector $r1 = new PosIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectPosIssuePresenter(PosIssueFragment posIssueFragment, PosIssuePresenter posIssuePresenter) {
        posIssueFragment.posIssuePresenter = posIssuePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PosIssueFragment posIssueFragment) {
        InterfaceC11700a $r3 = this.posIssuePresenterProvider;
        Object $r2 = $r3.get();
        PosIssuePresenter $r4 = (PosIssuePresenter) $r2;
        injectPosIssuePresenter(posIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PosIssueFragment $r2 = (PosIssueFragment) obj;
        injectMembers($r2);
    }
}
