package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import ai.kudi.agent.issues.presenters.DisputePresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.DisputeIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class DisputeIssueFragment_MembersInjector implements InterfaceC9463a<DisputeIssueFragment> {
    private final InterfaceC11700a<GlobalNavigator> globalNavigatorProvider;
    private final InterfaceC11700a<DisputePresenter> thisPresenterProvider;

    public DisputeIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.globalNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        DisputeIssueFragment_MembersInjector $r2 = new DisputeIssueFragment_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectGlobalNavigator(DisputeIssueFragment disputeIssueFragment, GlobalNavigator globalNavigator) {
        disputeIssueFragment.globalNavigator = globalNavigator;
    }

    public static void injectThisPresenter(DisputeIssueFragment disputeIssueFragment, DisputePresenter disputePresenter) {
        disputeIssueFragment.thisPresenter = disputePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(DisputeIssueFragment disputeIssueFragment) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        DisputePresenter $r4 = (DisputePresenter) $r3;
        injectThisPresenter(disputeIssueFragment, $r4);
        InterfaceC11700a $r22 = this.globalNavigatorProvider;
        Object $r32 = $r22.get();
        GlobalNavigator $r5 = (GlobalNavigator) $r32;
        injectGlobalNavigator(disputeIssueFragment, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        DisputeIssueFragment $r2 = (DisputeIssueFragment) obj;
        injectMembers($r2);
    }
}
