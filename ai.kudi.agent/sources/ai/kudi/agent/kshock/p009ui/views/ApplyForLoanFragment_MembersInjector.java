package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.ApplyForLoanViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ApplyForLoanFragment_MembersInjector implements InterfaceC9463a<ApplyForLoanFragment> {
    private final InterfaceC11700a<ApplyForLoanViewModel> viewModelProvider;

    public ApplyForLoanFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ApplyForLoanFragment_MembersInjector $r1 = new ApplyForLoanFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(ApplyForLoanFragment applyForLoanFragment, ApplyForLoanViewModel applyForLoanViewModel) {
        applyForLoanFragment.viewModel = applyForLoanViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ApplyForLoanFragment applyForLoanFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        ApplyForLoanViewModel $r4 = (ApplyForLoanViewModel) $r2;
        injectViewModel(applyForLoanFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ApplyForLoanFragment $r2 = (ApplyForLoanFragment) obj;
        injectMembers($r2);
    }
}
