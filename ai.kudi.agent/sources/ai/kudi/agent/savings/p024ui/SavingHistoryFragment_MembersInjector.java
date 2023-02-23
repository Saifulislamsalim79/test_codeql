package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.savings.viewmodel.SavingHistoryViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.savings.ui.SavingHistoryFragment_MembersInjector */
/* loaded from: classes.dex */
public final class SavingHistoryFragment_MembersInjector implements InterfaceC9463a<SavingHistoryFragment> {
    private final InterfaceC11700a<SavingHistoryViewModel> viewModelProvider;

    public SavingHistoryFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        SavingHistoryFragment_MembersInjector $r1 = new SavingHistoryFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(SavingHistoryFragment savingHistoryFragment, SavingHistoryViewModel savingHistoryViewModel) {
        savingHistoryFragment.viewModel = savingHistoryViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(SavingHistoryFragment savingHistoryFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        SavingHistoryViewModel $r4 = (SavingHistoryViewModel) $r2;
        injectViewModel(savingHistoryFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        SavingHistoryFragment $r2 = (SavingHistoryFragment) obj;
        injectMembers($r2);
    }
}
