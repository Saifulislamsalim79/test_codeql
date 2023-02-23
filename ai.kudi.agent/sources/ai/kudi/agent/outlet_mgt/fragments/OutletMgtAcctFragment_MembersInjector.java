package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletMgtAcctFragment_MembersInjector implements InterfaceC9463a<OutletMgtAcctFragment> {
    private final InterfaceC11700a<ManageOutletViewModel> manageOutletVieModelProvider;

    public OutletMgtAcctFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.manageOutletVieModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        OutletMgtAcctFragment_MembersInjector $r1 = new OutletMgtAcctFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectManageOutletVieModel(OutletMgtAcctFragment outletMgtAcctFragment, ManageOutletViewModel manageOutletViewModel) {
        outletMgtAcctFragment.manageOutletVieModel = manageOutletViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(OutletMgtAcctFragment outletMgtAcctFragment) {
        InterfaceC11700a $r3 = this.manageOutletVieModelProvider;
        Object $r2 = $r3.get();
        ManageOutletViewModel $r4 = (ManageOutletViewModel) $r2;
        injectManageOutletVieModel(outletMgtAcctFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        OutletMgtAcctFragment $r2 = (OutletMgtAcctFragment) obj;
        injectMembers($r2);
    }
}
