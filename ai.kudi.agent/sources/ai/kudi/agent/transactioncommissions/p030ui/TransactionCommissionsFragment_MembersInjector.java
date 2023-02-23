package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class TransactionCommissionsFragment_MembersInjector implements InterfaceC9463a<TransactionCommissionsFragment> {
    private final InterfaceC11700a<TransactionCommissionsViewModel> viewModelProvider;

    public TransactionCommissionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        TransactionCommissionsFragment_MembersInjector $r1 = new TransactionCommissionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(TransactionCommissionsFragment transactionCommissionsFragment, TransactionCommissionsViewModel transactionCommissionsViewModel) {
        transactionCommissionsFragment.viewModel = transactionCommissionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(TransactionCommissionsFragment transactionCommissionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        TransactionCommissionsViewModel $r4 = (TransactionCommissionsViewModel) $r2;
        injectViewModel(transactionCommissionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        TransactionCommissionsFragment $r2 = (TransactionCommissionsFragment) obj;
        injectMembers($r2);
    }
}
