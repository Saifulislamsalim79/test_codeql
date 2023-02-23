package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.SavingsTermsAndConditionViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsTermsAndConditionFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsTermsAndConditionFragment_MembersInjector implements InterfaceC9463a<SavingsTermsAndConditionFragment> {
    private final InterfaceC11700a<SavingsTermsAndConditionViewModel> viewModelProvider;

    public SavingsTermsAndConditionFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SavingsTermsAndConditionFragment_MembersInjector $r1 = new SavingsTermsAndConditionFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment, SavingsTermsAndConditionViewModel savingsTermsAndConditionViewModel) {
        savingsTermsAndConditionFragment.viewModel = savingsTermsAndConditionViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsTermsAndConditionFragment savingsTermsAndConditionFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        SavingsTermsAndConditionViewModel $r4 = (SavingsTermsAndConditionViewModel) $r2;
        injectViewModel(savingsTermsAndConditionFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsTermsAndConditionFragment $r2 = (SavingsTermsAndConditionFragment) obj;
        injectMembers($r2);
    }
}
