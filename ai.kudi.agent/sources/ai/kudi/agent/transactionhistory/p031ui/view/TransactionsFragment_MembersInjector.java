package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionsFragment_MembersInjector implements InterfaceC9463a<TransactionsFragment> {
    private final InterfaceC11700a<TransactionsViewModel> viewModelProvider;

    public TransactionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransactionsFragment_MembersInjector $r1 = new TransactionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(TransactionsFragment transactionsFragment, TransactionsViewModel transactionsViewModel) {
        transactionsFragment.viewModel = transactionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionsFragment transactionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        TransactionsViewModel $r4 = (TransactionsViewModel) $r2;
        injectViewModel(transactionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionsFragment $r2 = (TransactionsFragment) obj;
        injectMembers($r2);
    }
}
