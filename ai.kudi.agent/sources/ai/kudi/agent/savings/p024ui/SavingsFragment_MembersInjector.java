package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.SavingsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsFragment_MembersInjector implements InterfaceC9463a<SavingsFragment> {
    private final InterfaceC11700a<SavingsViewModel> viewModelProvider;

    public SavingsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SavingsFragment_MembersInjector $r1 = new SavingsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(SavingsFragment savingsFragment, SavingsViewModel savingsViewModel) {
        savingsFragment.viewModel = savingsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsFragment savingsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        SavingsViewModel $r4 = (SavingsViewModel) $r2;
        injectViewModel(savingsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsFragment $r2 = (SavingsFragment) obj;
        injectMembers($r2);
    }
}
