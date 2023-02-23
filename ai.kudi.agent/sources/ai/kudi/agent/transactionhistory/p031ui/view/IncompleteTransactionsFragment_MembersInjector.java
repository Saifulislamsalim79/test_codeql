package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.presentation.IncompleteTransactionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.IncompleteTransactionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class IncompleteTransactionsFragment_MembersInjector implements InterfaceC9463a<IncompleteTransactionsFragment> {
    private final InterfaceC11700a<IncompleteTransactionsViewModel> viewModelProvider;

    public IncompleteTransactionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        IncompleteTransactionsFragment_MembersInjector $r1 = new IncompleteTransactionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(IncompleteTransactionsFragment incompleteTransactionsFragment, IncompleteTransactionsViewModel incompleteTransactionsViewModel) {
        incompleteTransactionsFragment.viewModel = incompleteTransactionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(IncompleteTransactionsFragment incompleteTransactionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        IncompleteTransactionsViewModel $r4 = (IncompleteTransactionsViewModel) $r2;
        injectViewModel(incompleteTransactionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        IncompleteTransactionsFragment $r2 = (IncompleteTransactionsFragment) obj;
        injectMembers($r2);
    }
}
