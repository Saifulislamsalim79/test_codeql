package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.presentation.PendingFraudCheckTransactionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.PendingFraudCheckTransactionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class PendingFraudCheckTransactionsFragment_MembersInjector implements InterfaceC9463a<PendingFraudCheckTransactionsFragment> {
    private final InterfaceC11700a<PendingFraudCheckTransactionsViewModel> viewModelProvider;

    public PendingFraudCheckTransactionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        PendingFraudCheckTransactionsFragment_MembersInjector $r1 = new PendingFraudCheckTransactionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment, PendingFraudCheckTransactionsViewModel pendingFraudCheckTransactionsViewModel) {
        pendingFraudCheckTransactionsFragment.viewModel = pendingFraudCheckTransactionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(PendingFraudCheckTransactionsFragment pendingFraudCheckTransactionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        PendingFraudCheckTransactionsViewModel $r4 = (PendingFraudCheckTransactionsViewModel) $r2;
        injectViewModel(pendingFraudCheckTransactionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        PendingFraudCheckTransactionsFragment $r2 = (PendingFraudCheckTransactionsFragment) obj;
        injectMembers($r2);
    }
}
