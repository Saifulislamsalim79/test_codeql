package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.kshock.presentation.ApplyForLoanReviewViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanReviewFragment_MembersInjector */
/* loaded from: classes.dex */
public final class ApplyForLoanReviewFragment_MembersInjector implements InterfaceC9463a<ApplyForLoanReviewFragment> {
    private final InterfaceC11700a<ApplyForLoanReviewViewModel> viewModelProvider;

    public ApplyForLoanReviewFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        ApplyForLoanReviewFragment_MembersInjector $r1 = new ApplyForLoanReviewFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(ApplyForLoanReviewFragment applyForLoanReviewFragment, ApplyForLoanReviewViewModel applyForLoanReviewViewModel) {
        applyForLoanReviewFragment.viewModel = applyForLoanReviewViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(ApplyForLoanReviewFragment applyForLoanReviewFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        ApplyForLoanReviewViewModel $r4 = (ApplyForLoanReviewViewModel) $r2;
        injectViewModel(applyForLoanReviewFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        ApplyForLoanReviewFragment $r2 = (ApplyForLoanReviewFragment) obj;
        injectMembers($r2);
    }
}
