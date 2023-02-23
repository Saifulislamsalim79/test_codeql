package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.core.navigation.GlobalNavigator;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssueTypeFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssueTypeFragment_MembersInjector implements InterfaceC9463a<IssueTypeFragment> {
    private final InterfaceC11700a<GlobalNavigator> globalNavigatorProvider;

    public IssueTypeFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.globalNavigatorProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssueTypeFragment_MembersInjector $r1 = new IssueTypeFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectGlobalNavigator(IssueTypeFragment issueTypeFragment, GlobalNavigator globalNavigator) {
        issueTypeFragment.globalNavigator = globalNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssueTypeFragment issueTypeFragment) {
        InterfaceC11700a $r3 = this.globalNavigatorProvider;
        Object $r2 = $r3.get();
        GlobalNavigator $r4 = (GlobalNavigator) $r2;
        injectGlobalNavigator(issueTypeFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssueTypeFragment $r2 = (IssueTypeFragment) obj;
        injectMembers($r2);
    }
}
