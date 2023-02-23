package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.LoanStatusViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanStatusFragment_MembersInjector */
/* loaded from: classes.dex */
public final class LoanStatusFragment_MembersInjector implements InterfaceC9463a<LoanStatusFragment> {
    private final InterfaceC11700a<LoanStatusViewModel> loanStatusViewModelProvider;

    public LoanStatusFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.loanStatusViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        LoanStatusFragment_MembersInjector $r1 = new LoanStatusFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectLoanStatusViewModel(LoanStatusFragment loanStatusFragment, LoanStatusViewModel loanStatusViewModel) {
        loanStatusFragment.loanStatusViewModel = loanStatusViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(LoanStatusFragment loanStatusFragment) {
        InterfaceC11700a $r3 = this.loanStatusViewModelProvider;
        Object $r2 = $r3.get();
        LoanStatusViewModel $r4 = (LoanStatusViewModel) $r2;
        injectLoanStatusViewModel(loanStatusFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        LoanStatusFragment $r2 = (LoanStatusFragment) obj;
        injectMembers($r2);
    }
}
