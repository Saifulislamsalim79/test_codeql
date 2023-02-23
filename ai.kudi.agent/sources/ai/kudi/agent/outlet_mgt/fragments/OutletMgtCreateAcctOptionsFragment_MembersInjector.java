package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletsListingViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtCreateAcctOptionsFragment_MembersInjector implements InterfaceC9463a<OutletMgtCreateAcctOptionsFragment> {
    private final InterfaceC11700a<OutletsListingViewModel> viewModelProvider;

    public OutletMgtCreateAcctOptionsFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.viewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtCreateAcctOptionsFragment_MembersInjector $r1 = new OutletMgtCreateAcctOptionsFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectViewModel(OutletMgtCreateAcctOptionsFragment outletMgtCreateAcctOptionsFragment, OutletsListingViewModel outletsListingViewModel) {
        outletMgtCreateAcctOptionsFragment.viewModel = outletsListingViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtCreateAcctOptionsFragment outletMgtCreateAcctOptionsFragment) {
        InterfaceC11700a $r3 = this.viewModelProvider;
        Object $r2 = $r3.get();
        OutletsListingViewModel $r4 = (OutletsListingViewModel) $r2;
        injectViewModel(outletMgtCreateAcctOptionsFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtCreateAcctOptionsFragment $r2 = (OutletMgtCreateAcctOptionsFragment) obj;
        injectMembers($r2);
    }
}
