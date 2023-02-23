package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.SavingsPlanViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingsPlanFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingsPlanFragment_MembersInjector implements InterfaceC9463a<SavingsPlanFragment> {
    private final InterfaceC11700a<SavingsPlanViewModel> viewModelProvider;

    public SavingsPlanFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SavingsPlanFragment_MembersInjector $r1 = new SavingsPlanFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(SavingsPlanFragment savingsPlanFragment, SavingsPlanViewModel savingsPlanViewModel) {
        savingsPlanFragment.viewModel = savingsPlanViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingsPlanFragment savingsPlanFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        SavingsPlanViewModel $r4 = (SavingsPlanViewModel) $r2;
        injectViewModel(savingsPlanFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingsPlanFragment $r2 = (SavingsPlanFragment) obj;
        injectMembers($r2);
    }
}
