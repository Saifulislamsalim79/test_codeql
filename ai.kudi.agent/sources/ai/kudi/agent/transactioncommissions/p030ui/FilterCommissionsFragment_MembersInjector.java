package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.transactioncommissions.presentation.FilterCommissionsViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.transactioncommissions.ui.FilterCommissionsFragment_MembersInjector */
/* loaded from: classes.dex */
public final class FilterCommissionsFragment_MembersInjector implements InterfaceC9463a<FilterCommissionsFragment> {
    private final InterfaceC11700a<FilterCommissionsViewModel> viewModelProvider;

    public FilterCommissionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        FilterCommissionsFragment_MembersInjector $r1 = new FilterCommissionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(FilterCommissionsFragment filterCommissionsFragment, FilterCommissionsViewModel filterCommissionsViewModel) {
        filterCommissionsFragment.viewModel = filterCommissionsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(FilterCommissionsFragment filterCommissionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        FilterCommissionsViewModel $r4 = (FilterCommissionsViewModel) $r2;
        injectViewModel(filterCommissionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        FilterCommissionsFragment $r2 = (FilterCommissionsFragment) obj;
        injectMembers($r2);
    }
}
