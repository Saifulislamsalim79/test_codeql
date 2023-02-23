package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.TermsAndAndConditionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.IssuesTermsAndConditionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IssuesTermsAndConditionsFragment_MembersInjector implements InterfaceC9463a<IssuesTermsAndConditionsFragment> {
    private final InterfaceC11700a<TermsAndAndConditionsViewModel> termsAndAndConditionsViewModelProvider;

    public IssuesTermsAndConditionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.termsAndAndConditionsViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IssuesTermsAndConditionsFragment_MembersInjector $r1 = new IssuesTermsAndConditionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectTermsAndAndConditionsViewModel(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment, TermsAndAndConditionsViewModel termsAndAndConditionsViewModel) {
        issuesTermsAndConditionsFragment.termsAndAndConditionsViewModel = termsAndAndConditionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IssuesTermsAndConditionsFragment issuesTermsAndConditionsFragment) {
        InterfaceC11700a $r3 = this.termsAndAndConditionsViewModelProvider;
        Object $r2 = $r3.get();
        TermsAndAndConditionsViewModel $r4 = (TermsAndAndConditionsViewModel) $r2;
        injectTermsAndAndConditionsViewModel(issuesTermsAndConditionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IssuesTermsAndConditionsFragment $r2 = (IssuesTermsAndConditionsFragment) obj;
        injectMembers($r2);
    }
}
