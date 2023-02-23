package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.transactionhistory.presentation.FilterTransactionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.FilterTransactionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class FilterTransactionsFragment_MembersInjector implements InterfaceC9463a<FilterTransactionsFragment> {
    private final InterfaceC11700a<FilterTransactionsViewModel> viewModelProvider;

    public FilterTransactionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        FilterTransactionsFragment_MembersInjector $r1 = new FilterTransactionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(FilterTransactionsFragment filterTransactionsFragment, FilterTransactionsViewModel filterTransactionsViewModel) {
        filterTransactionsFragment.viewModel = filterTransactionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(FilterTransactionsFragment filterTransactionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        FilterTransactionsViewModel $r4 = (FilterTransactionsViewModel) $r2;
        injectViewModel(filterTransactionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        FilterTransactionsFragment $r2 = (FilterTransactionsFragment) obj;
        injectMembers($r2);
    }
}
