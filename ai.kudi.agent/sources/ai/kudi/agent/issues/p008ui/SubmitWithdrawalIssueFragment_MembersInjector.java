package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.SubmitWidthrawalIssueViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.SubmitWithdrawalIssueFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SubmitWithdrawalIssueFragment_MembersInjector implements InterfaceC9463a<SubmitWithdrawalIssueFragment> {
    private final InterfaceC11700a<SubmitWidthrawalIssueViewModel> submitWidthrawalIssueViewModelProvider;

    public SubmitWithdrawalIssueFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.submitWidthrawalIssueViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SubmitWithdrawalIssueFragment_MembersInjector $r1 = new SubmitWithdrawalIssueFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectSubmitWidthrawalIssueViewModel(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment, SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel) {
        submitWithdrawalIssueFragment.submitWidthrawalIssueViewModel = submitWidthrawalIssueViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SubmitWithdrawalIssueFragment submitWithdrawalIssueFragment) {
        InterfaceC11700a $r3 = this.submitWidthrawalIssueViewModelProvider;
        Object $r2 = $r3.get();
        SubmitWidthrawalIssueViewModel $r4 = (SubmitWidthrawalIssueViewModel) $r2;
        injectSubmitWidthrawalIssueViewModel(submitWithdrawalIssueFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SubmitWithdrawalIssueFragment $r2 = (SubmitWithdrawalIssueFragment) obj;
        injectMembers($r2);
    }
}
