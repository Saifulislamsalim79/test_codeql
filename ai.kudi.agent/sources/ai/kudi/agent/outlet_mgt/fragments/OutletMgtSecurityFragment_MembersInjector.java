package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtSecurityFragment_MembersInjector implements InterfaceC9463a<OutletMgtSecurityFragment> {
    private final InterfaceC11700a<OutletSecurityViewModel> outletMgtSecurityViewModelProvider;

    public OutletMgtSecurityFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.outletMgtSecurityViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtSecurityFragment_MembersInjector $r1 = new OutletMgtSecurityFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectOutletMgtSecurityViewModel(OutletMgtSecurityFragment outletMgtSecurityFragment, OutletSecurityViewModel outletSecurityViewModel) {
        outletMgtSecurityFragment.outletMgtSecurityViewModel = outletSecurityViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtSecurityFragment outletMgtSecurityFragment) {
        InterfaceC11700a $r3 = this.outletMgtSecurityViewModelProvider;
        Object $r2 = $r3.get();
        OutletSecurityViewModel $r4 = (OutletSecurityViewModel) $r2;
        injectOutletMgtSecurityViewModel(outletMgtSecurityFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtSecurityFragment $r2 = (OutletMgtSecurityFragment) obj;
        injectMembers($r2);
    }
}
