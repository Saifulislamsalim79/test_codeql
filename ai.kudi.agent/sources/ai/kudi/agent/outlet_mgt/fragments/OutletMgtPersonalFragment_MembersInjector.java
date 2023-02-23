package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtPersonalFragment_MembersInjector implements InterfaceC9463a<OutletMgtPersonalFragment> {
    private final InterfaceC11700a<ManageOutletViewModel> manageOutletViewModelProvider;

    public OutletMgtPersonalFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.manageOutletViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtPersonalFragment_MembersInjector $r1 = new OutletMgtPersonalFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectManageOutletViewModel(OutletMgtPersonalFragment outletMgtPersonalFragment, ManageOutletViewModel manageOutletViewModel) {
        outletMgtPersonalFragment.manageOutletViewModel = manageOutletViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtPersonalFragment outletMgtPersonalFragment) {
        InterfaceC11700a $r3 = this.manageOutletViewModelProvider;
        Object $r2 = $r3.get();
        ManageOutletViewModel $r4 = (ManageOutletViewModel) $r2;
        injectManageOutletViewModel(outletMgtPersonalFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtPersonalFragment $r2 = (OutletMgtPersonalFragment) obj;
        injectMembers($r2);
    }
}
